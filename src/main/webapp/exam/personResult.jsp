<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름 : ${ person.name } <br>
	나이 : ${ person.age } <br>
	성별 : ${ person.gender } <br>
	취미 : ${ person.hobby } <br>
	직업 : ${ person.job } <br>
	<hr>
	<!-- jstl -->
	<!-- 톰캣 11이기때문에 jakarta 사용-->
	<!-- https://mvnrepository.com/ -->
	<!-- https://mvnrepository.com/artifact/jakarta.servlet.jsp.jstl/jakarta.servlet.jsp.jstl-api/3.0.2 -->
	<!-- https://mvnrepository.com/artifact/org.glassfish.web/jakarta.servlet.jsp.jstl -->
	<c:forEach var="hobby" items="${person.hobby}">
     	${ hobby }, 
    </c:forEach>
</body>
</html>