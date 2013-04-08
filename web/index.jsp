<%-- 
    Document   : index
    Created on : 16/10/2012, 07:19:46 PM
    Author     : skuarch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
    </head>
    <body>

        <div style="margin:auto; width: 500px;">
            
            login
            
            <s:form action="login">
                
                <s:textfield name="name" label="username" key="name"/>
                <s:password name="password" label="password"/>
                <s:submit/>
                
            </s:form>
        </div>        

    </body>
</html>
