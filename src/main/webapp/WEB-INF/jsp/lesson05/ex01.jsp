<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core 라이브러리(1)</title>
</head>
<body>
	<h2>1. 변수 정의하기 (c:set)</h2>
	<c:set var="number1" value="100"/>
	<c:set var="number2">250</c:set>
	number1 : ${number1}<br>
	number2 : ${number2}<br>
	number1 + number2 : ${number1 + number2}
	
	<h2>2. 변수 출력하기 (c:out)</h2>
	number1 : <c:out value="${number1}"/><br>
	<c:out value="Hello world"/><br>
	<%-- <c:out>쓰는 이유 : 문구 그대로 출력된다. (그냥 쓰면 script가 실행되기때문) --%>
	<c:out value="<script>alert('얼럿창 띄우기')</script>" /><br>
	<c:out value="<script>alert('얼럿창 띄우기')</script>" escapeXml="true" />
	
	<%-- 스크립트가 수행된다. --%>
	<%-- <c:out value="<script>alert('얼럿창 띄우기')</script>" escapeXml="false" /> --%>
	
	<h2>3. 조건문 (c:if)</h2>
	<c:if test="${number1 > 50}">
		number1은 50보다 크다. <br>
	</c:if>
	
	<%-- 예전에는 == 잘 안됬지만 요즘은 잘됨 --%>
	<c:if test="${number1 == 100}">
		number1은 100과 같다. <br>
	</c:if>
	
	<c:if test="${number1 eq 100}">
		number1은 100과 같다. <br>
	</c:if>
	
	<c:if test="${number1 ne 222}">
		number1은 222가 아니다 <br>
	</c:if>
	
	<c:if test="${!empty number1}">
		number1은 비어있지 않다. <br>
	</c:if>
	<%-- 이거 추천 --%>
	<c:if test="${not empty number1}">
		number1은 비어있지 않다. <br>
	</c:if>
</body>
</html>