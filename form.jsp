<%-- 
    Document   : form
    Created on : May 4, 2016, 8:08:37 PM
    Author     : Natavan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Attribute Form</h1>
        <form action="ServletListenerAttribute" method="POST">
        Attribute Name: <input type="text" name="attrName" value=""/><br/>
         Attribute Value: <input type="text" name="attrValue" value=""/><br/>&nbsp;
        <select name="scope">
            <option value="Application">Application</option>
            <option value="Session">Session</option>
            <option value="Request">Request</option>
            
        </select>
        <input type="radio" name="action" value="Add"/>Add
        <input type="radio" name="action" value="Remove"/>Remove
        <input type="radio" name="action" value="Replace"/>Replace<br/>
        <input type="submit" value="Process" name="process"/>
        <input type="reset" value="Clear" name="clear"/>
        </form>
    </body>
</html>
