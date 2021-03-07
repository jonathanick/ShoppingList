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
    <c:import url="./register.jsp" />
    <c:if test = "${toAdd==true}">
        1 
        <h2>List</h2>
        <form action="shoppingList?action=add" method="post">
            <h3>Add item:<input type="text" name="add"><input type="submit" value="Add"></h3>
        </form>
    </c:if>
    <c:if test = "${toDelete ==true}">
         2
         <form action="shoppingList?action=delete" method="post">
            <h3>Add item:<input type="text" name="add2"><input type="submit" value="delete"></h3>
        </form>
    </c:if>
         <c:if test = "${Deleted ==true}">
             3
         </c:if>    
    </body>
</html>
