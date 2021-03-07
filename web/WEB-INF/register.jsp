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
        <c:choose>
            <c:when test="${registered == true}">
                <p>Hello, ${username} <a href="shoppingList?action=logout"><u>Logout</u></a></p>
            </c:when>  
            <c:otherwise>
                <form action="shoppingList?action=register" method="post">
                    <p>Username: <input type="Text" name="username"><input type="submit" value="login"></p>
                </form>
            </c:otherwise>    
        </c:choose>        
    </body>
</html>
