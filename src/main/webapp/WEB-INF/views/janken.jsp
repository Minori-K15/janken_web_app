<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>じゃんけん</title>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" håref="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Klee+One&family=M+PLUS+Rounded+1c:wght@700&display=swap" rel="stylesheet">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Klee+One&family=M+PLUS+Rounded+1c:wght@300;700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="./css/style.css">
  <script type="text/javascript" src="./js/script.js"></script>
</head>
<body>
  <h1>じゃんけんゲーム</h1>
   <form action="janken" method="post"><br>
   
   <label for="name" id="name">お名前:</label>
   <input type="text" id="name" name="name" required><br>
   
   <p>COM何人と対戦しますか？</p><br>
   <div class="players">
   <label>COM：</label><input type="number" name="complayers" value="complayers" min="1" max="2">
   </div>
  
   <p>この中から選択してね！</p><br>
   <div class="choice">
    <img src="./img/rock.png">
    <input type="radio" name="janken" value="グー" required>
    <img src="./img/scissors.png">
    <input type="radio" name="janken" value="チョキ" required>
    <img src="./img/paper.png">
    <input type="radio" name="janken" value="パー" required>
    </div>
    <input type="submit" value="じゃんけんする">
    </form>
</body>
</html>