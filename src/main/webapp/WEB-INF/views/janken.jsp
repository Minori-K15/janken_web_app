<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>じゃんけん</title>
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
  <h1>じゃんけん</h1>
  
  <form id="jankenbtn">
  <!-- 入力された名前をinput -->
  <label for="name">お名前:</label>
  <input type="text" id="name" name="name" required><br>
  <!-- タイトル -->
  <label for="name" id="title">じゃんけん </label><br>
  
  <!-- じゃんけんを1つだけ選択できるようにする -->
  <label for="name">グー</label>
  <input type="radio" id="rock" name="janken" value="グー" required><br>
  <label for="name">チョキ</label>
  <input type="radio" id="scissors" name="janken" value="チョキ" required><br>
  <label for="name">パー</label>
  <input type="radio" id="paper" name="janken" value="パー" required><br>
  
  <!-- 選択したら送信ボタンを表示 -->
  <button type="submit" id="button" name="button">いざ勝負！</button>
  </form>
</body>
</html>