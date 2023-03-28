<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core 라이브러리(2)</title>
</head>
<body>
	<h2>1. 조건문 (c:choose, c:when, c:otherwise)</h2>
	<c:set var="weight" value="65" />
	
	<c:choose>
		<%-- 59키로 이하 --%>
		<c:when test="${weight < 60}">
			떡볶이 먹자 <br>
		</c:when>
		<%-- 61 ~ 69 --%>
		<c:when test="${weight < 70}">
			샐러드 먹자<br>
		</c:when>
		<%-- 70 ~ --%>
		<c:otherwise>
			굶자<br>
		</c:otherwise>
	</c:choose>
	
	<h2>2. 반복문 (c:forEach)</h2>
	<%-- 0 ~ 5 => 6번 --%>
	<c:forEach var="val1" begin="0" end="5" step="1">
		${val1}
		<br>
	</c:forEach>
	<br>
	<%-- 16 ~ 20 => 5번 --%>
	<c:forEach var="val2" begin="16" end="20" step="1" varStatus="status">
		var : ${val2} current : ${status.current}
		first : ${status.first} last : ${status.last}
		count : ${status.count} index : ${status.index}
		<br>
	</c:forEach>
	
	<%-- 서버에서 가져온 List<String> 출력 --%>
	<%-- *****items 변수명과 var 변수명은 다르게!!! --%>
	<c:forEach items="${fruits}" var="fruit" varStatus="status">
		${fruit}	::::::::::::::count: ${status.count} index: ${status.index}
	</c:forEach>
	
	<%-- 서버에서 가져온 List<Map> 출력 --%>
	<c:forEach items="${users}" var="user" varStatus="status">
		<h4>${status.count}번째 사람 정보</h4>
		이름 : ${user.name}<br>
		나이 : ${user.age}<br>
		취미 : ${user.hobby}
	</c:forEach>
	
	<%-- 테이블 구성 --%>
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>나이</th>
				<th>취미</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${users}" var="user" varStatus="status">
			<tr>
				<td>${status.count}</td>
				<td>${user.name}</td>
				<td>${user.age}</td>
				<td>${user.hobby}</td>
			</tr>
		</c:forEach>	
		</tbody>
	</table>
</body>
</html>