<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
	<form action ="login.do" method="post" name="frm">
	<table align ="center">
	<tr>
		<td colspan="2" align="center">로그인</td>
	</tr>
	<tr>
		<td align="center">아이디</td>
		<td><input type="text" name ="userid"></td>
	</tr>
	<tr>
		<td align="center">비밀번호</td>
		<td><input type="password" name ="pass"></td>
	</tr>
	<tr>
		<td align="center">권한</td>
		<td>
			<select name="lev">
				<option value ="A">운영자</option>
				<option value ="B">일반회원</option>
			</select>	
		</td>
	</tr>
	<tr align="center">
		<td colspan="2">
			<input type ="submit" value="로그인">
			<input type ="reset" value="취소">
		</td>
	</tr>
	<tr>
		<td colspan="2">${message}</td>
	</tr>
	</table>
	</form>
</body>
</html>