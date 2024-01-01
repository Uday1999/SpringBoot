<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h1>Spring boot</h1>
  <p>${massage}</p>
  
  <a href="${contextRoot}/expense">Add Expense</a>
  
    <c:forEach items="${expenses}" var="expenses">
    <div>      
        <h3>${expenses.expensename}</h3>
        <h3>${expenses.amount}</h3>
        
        
        <a href="${contextRoot}/expense/${expenses.id}">Edit</a>
        
    </div>
</c:forEach>

      	  
</body>
</html>