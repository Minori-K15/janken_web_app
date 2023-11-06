<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>確認画面</title>
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
  <h1>確認画面</h1>
  <div class="confirm">
    <p>
    この内容で勝負してもよろしいですか？</p>
    <p>名前: <strong>${name} </strong></p>
    <p>COM: <strong>${complayers} 人</strong></p>
    <p>${name}さんの手: <strong>${janken}</strong></p>
  </div>
    
<form action="confirm" method="post">
    <input type="hidden" name="name" value="${name}">
    <input type="hidden" name="complayers" value="${complayers}">
    <input type="hidden" name="janken" value="${janken}">
    <input type="submit" value="準備OK!">
    <input type="button" value="やり直す" onclick="history.back()">
</form>
</body>
</html>