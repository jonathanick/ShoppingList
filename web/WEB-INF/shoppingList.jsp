<%-- 
    Document   : shoppingList
    Created on : Mar 5, 2021, 2:39:38 PM
    Author     : 828200
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title><br>
    </head>
    <body>
        <h1>List</h1>
        <br>
        <form action="shoppingList.jsp?action=add" method="post">
            <h3>Add item:</h3><input type="Text" name="item"><input type="submit" value="add">
        </form>
        <br>
        <form action="shoppingList.jsp?action=delete" method="post">
            <table name="names">
                
            </table>
            <input type="submit" value="Delete">
        </form>
        <h1>Hello World!</h1>
        <C:Set var="min" value=1>
            <C:if test="${min==1}">
                <C:out value="${min}" />
            </C:if>
    </body>
</html>
