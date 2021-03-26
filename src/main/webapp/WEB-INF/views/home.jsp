<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Gérer les rappel!</h1>
        <p>
        <form action="" method="post">
        Titre:<input type="text" name="titre"><br>
        Date: <input type="date" name="date"><br>
        Description<textarea name="description"> </textarea>
        <br>
        <input type="submit" value="ajouter">
        
        </form>
        
      <ul>  
        <c:forEach items="${list}" var="todos">
        <li>${todos.titre }/ date: ${todos.date}</li>
        <li>${todos.description} </li>
        
        </c:forEach>
        </ul>
        </p>
    </body>
</html>
