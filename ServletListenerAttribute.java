
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;


public class ServletListenerAttribute extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String attrName = request.getParameter("attrName");
        String attrValue = request.getParameter("attrValue");
        String radio = request.getParameter("action");
        String scope = request.getParameter("scope");
//        Enumeration<String> scope = request.getParameterNames();
//        while(scope.hasMoreElements()){
//            String scopeName = scope.nextElement();
//            String scopeValue = request.getParameter(scopeName);
//        }
        ServletContext context = request.getServletContext();
        HttpSession session = request.getSession();

        if(request.getParameter("process") != null){
            if(radio.equals("Add")){
                if(scope.equals("Application")){
            
            context.setAttribute(attrName, attrValue);
        }
                else if(scope.equals("Session")){
                    session.setAttribute(attrName, attrValue);
                }
                else if(scope.equals("Request")){
                    request.setAttribute(attrName, attrValue);
                }
        }
            else if(radio.equals("Remove")){
                if(scope.equals("Application")){
            context.removeAttribute(attrName);
                }
                else if(scope.equals("Session")){
                    session.removeAttribute(attrName);
                }
                  else if(scope.equals("Request")){
                   request.removeAttribute(attrName);
                }
            }
            else if(radio.equals("Replace")){
                if(scope.equals("Application")){
                    context.setAttribute(attrName, attrValue);
                }
                else if(scope.equals("Session")){
                      session.setAttribute(attrName, context.getAttribute(attrName));
                }
                else if(scope.equals("Request")){
                      session.setAttribute(attrName, context.getAttribute(attrName));
                }
                
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
