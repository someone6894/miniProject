<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Cache-Control" content="No-Cache">
<meta http-equiv="Pragma" content="No-Cache">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>listAll.jsp</title>
</head>
<body>
	<h2 style="text-align: center;" > 게시판 목록 listAll.jsp</h2>

	<jsp:include page="../template.jsp"></jsp:include>
	<div class="container">
		<c:choose>
			<c:when test="${listBoard != null }">
				<table class="table table-bordered">
					<thead style="background-color: #ffff07;">
						<tr>
							<th>글번호</th>
							<th>글제목</th>
							<th>작성자</th>
							<th>작성일</th>
							<th>조회수</th>
							<th>좋아요</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="board" items="${listBoard}" varStatus="status">
							<tr>
								<td>${board.no}</td>
								<td>${board.title}</td>
								<td>${board.writer}</td>
								<td>${board.postdate}</td>
								<td>${board.readcount}</td>
								<td>${board.likecount}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:when>
		</c:choose>

	</div>

</body>
</html>