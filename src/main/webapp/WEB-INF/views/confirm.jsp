<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>確認画面</title>
</head>
<body>
    <h1>確認画面</h1>
    <p>この内容で勝負してもよろしいですか？</p>

    <p><strong>お名前:</strong> ${name}</p>
<%--     <p><strong>メールアドレス:</strong> ${email}</p> --%>

    <form action="confirm" method="post">
        <input type="hidden" name="name" value="${name}">
        <input type="hidden" name="email" value="${email}">
        <input type="hidden" name="feedback" value="${feedback}">
        <input type="submit" value="送信">
        <input type="button" value="戻る" onclick="history.back()">
    </form>
</body>
</html>