<%@page import="jakarta.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>勝負結果</title>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Klee+One&family=M+PLUS+Rounded+1c:wght@700&display=swap" rel="stylesheet">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Klee+One&family=M+PLUS+Rounded+1c:wght@300;700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="./css/style.css">
  <script type="text/javascript" src="./js/script.js"></script>
</head>
<body>
<h1>勝負結果</h1>
  <div class="result">
    <p><strong>${name}さんの${result}</strong></p>
    <p>${name}さんの手：${janken}</p>

<%--     <c:forEach var="computerHand" items="${computerHands1}" varStatus="status"> --%>
<%--     <p>COM${status.index + 1}の手：${computerHand}</p> --%>
<%--     <p>結果：${results[status.index]}</p> --%>
<!--     </c:forEach> -->
    
    <p>COM1:${firstComHand}</p>
    <c:if test="${empty secondComHand}">
    <p>COM2:${secondComHand}</p> 
    </c:if>

  </div>
  <input type="button" value="もう一度" onclick="history.go(-2)">
</html>