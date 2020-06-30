<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록 보기</title>
</head>
<body>
	<table>
		<tr>
			<td colspan="5" class="title">게시판</td>
		</tr>
		<tr>
			<th>번호</th>
			<th width="60%">제목</th>
			<th>내용</th>
			<th>작성일</th>
		</tr>
		<c:forEach var="vo" items="${list }" varStatus="vs">
		<tr align="center">
			<td>${vo.idx }</td>
			<td>${vo.subject }</td>
			<td>${vo.content }</td>
			<td>${vo.regDate }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>








