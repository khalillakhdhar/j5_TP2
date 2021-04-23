 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="home.jsp"></jsp:include>
  <ul>  
        <c:forEach items="${list}" var="todos">
        <li>${todos.titre }/ date: ${todos.date}</li>
        <li>${todos.description} </li>
        
        </c:forEach>
        </ul>

</body>
</html>