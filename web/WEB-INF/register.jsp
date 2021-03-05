<%-- 
    Document   : register
    Created on : Mar 5, 2021, 2:39:24 PM
    Author     : 828200
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <C:Set var=min value=1>
            <C:if test="${min==2}">
                dude
            </C:if>
               
    </body>
</html>
