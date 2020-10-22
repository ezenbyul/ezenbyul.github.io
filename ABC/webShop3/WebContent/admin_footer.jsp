<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
	<hr />
	<footer class="ft">
		<div class="ft_wrap">
			<nav class="fnb">
				<ul>
					<li><a href="admin_edit.jsp">관리자 정보 수정</a></li>
					<li><a href="protocol_edit.jsp">회원약관 수정</a></li>
					<li><a href="privacy_edit.jsp">개인정보처리방침 수정</a></li>
					<li><a href="company_edit.jsp">회사정보 수정</a></li>
					<li><a href="product_edit.jsp">상품정보 수정</a></li>
					<li><a href="order_edit.jsp">주문정보 수정</a></li>
				</ul>
			</nav>
			<div class="admin_copy">
				<p class="copyright">
					여기는 저작권 및 회사 연락처, 회사의 정보, 사이트 관리자와 책임자를 기재합니다.
				</p>
			</div>
		</div>
	</footer>
	<a href="admin.jsp" class="home">홈</a>
</body>
</html>