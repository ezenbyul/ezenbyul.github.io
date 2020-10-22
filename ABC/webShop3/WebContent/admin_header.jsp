<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="./css/admin_header.css" />
<link rel="stylesheet" href="./css/admin_footer.css" />
<title>관리자모드로 로그인중</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<%
	session.setAttribute("id", "admin");
%>
<%
	if(session.getAttribute("id") != "admin") {
%>
<script>
	alert("관리자로 하지 않으셨습니다. 현재 페이지는 관리자의 로그인이 필요합니다.");
	history.go(-1);
</script>
<% 	
	} else {
%>
<script>
	$(document).ready(function(){
		var txt = $(".page_tit").text();
		alert("현재는 "+txt+"페이지 입니다.");		
	});
</script>
<%		
	}
%>
</head>
<body>
	<header class="hd">
		<h2 class="tit">관리자 화면</h2>
		<nav class="gnb">
			<ul>
				<li><a href="memberList.jsp">회원관리</a></li>
				<li><a href="admBoardList.jsp">게시판관리</a></li>
				<li><a href="salesList.jsp">판매관리</a></li>
				<li><a href="productList.jsp">상품관리</a></li>
				<li><a href="curtList.jsp">구매관리</a></li>
				<li><a href="sendSms.jsp">고객문자발송</a></li>
			</ul>
			<div class="btn_fr">
				<a href="admin_logout.jsp" class="btn">관리자 로그아웃</a>
			</div>
		</nav>
	</header>
	<hr />
