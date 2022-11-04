<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="Shift_JIS"%>
<html>
    <head><title>ログイン画面</title></head>
    <body>
        <form action="RegisterServlet" method="post">
        name<input type="text" id="name" name="name" placeholder="名前を入力してください">
        weight<input type="text" id="goal_cal" name="goal_cal" placeholder="あなたの目標体重を入力してください">
        <input type="submit" value="登録" id="submit">
    </body>
</html>
