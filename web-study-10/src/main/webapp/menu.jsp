<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="menu.css">
</head>
<body>
<table class="menu" align "center">
<c:if test="${empty loginUser}">
<tr>
	<td></td><td></td>
	<td class="login">
		<a name="login" href="login.do"></a>
	</td>
	<td>사원등록<br>
		<span>(관리자로 로그인후 사용 가능)</span>
	</td>
	<td>마이페이지<br>
	<span>(로그인후 사용 가능)</span>
	</td>
</c:if>
<c:if test="${!empty loginUser}">
	<tr>
	<td>${loginUser.name}님 반갑습니다.</td>
	<td>레벨 : ${loginUser.lev}</td>
	<td class="login">
		<a name="login" href="logout.do">로그아웃</a>
	</td>
	
	<c:choose>
		<c:when test="${result==2}">
		<td class="login"><a href="join.do">사원 등록</a></td>
		</c:when>
		<c:when test="${result==3}">
		<td class="login">사원등록<br>
		<span>(관리자로 로그인후 사용 가능)</span>
		</td>
		</c:when>
	</c:choose>
	<td class ="login">
	<a href="mypage.do">마이페이지</a>
	</td>
</c:if>
</table>
</body>
</html>