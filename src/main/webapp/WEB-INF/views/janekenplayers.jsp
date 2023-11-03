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
<h1>Let's じゃんけん！！</h1>
  <form action="janken" method="post">
  <!-- 入力された名前をinput -->
  <label for="name">お名前:</label>
  <input type="text" id="name" name="name" required><br>
  <p>何人で遊びますか？</p>
  <label for="name">PCプレイヤー:</label>
  <input type=number id="pcpleyers" name="pcpleyers" max="10" required><br>
  
    <!-- じゃんけんを1つだけ選択できるようにする -->
  <p>この中からどれか1つ選択してね！</p>
  <section>
  <label for="name">グー<img src ="./img/rock.png"></label>
  <input type="radio" id="rock" name="janken" value="グー" required><br>
  <label for="name">チョキ  <img src ="./img/scissors.png"></label>
  <input type="radio" id="scissors" name="janken" value="チョキ" required><br>
  <label for="name">パー<img src ="./img/paper.png"></label>
  <input type="radio" id="paper" name="janken" value="パー" required><br>
  </section>
  
    <!-- 選択したら送信ボタンを表示 -->
  <button type="submit" id="button" name="button">いざ勝負！</button>
  </form>
</body>
</html>