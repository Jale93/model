/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * Web application lifecycle listener.
 *
 * @author Natavan
 */
public class MyContextAttributeListener implements ServletContextAttributeListener {

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
          System.out.println("New attribute added: "+event.getName()+" = "+event.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("Attribute removed :"+event.getName()+" = "+event.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("Attribute "+event.getName()+
                "is  replaced, old value= "+event.getValue()+
                " new value= "+event.getServletContext().getAttribute(event.getName()));
    }
}
