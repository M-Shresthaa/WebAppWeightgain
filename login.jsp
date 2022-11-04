
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="Shift_JIS"%>

<html>
<head>
  <meta charset="UTF-8">
  <title>Login and Registration Form Example</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css'>
<link rel="stylesheet" href="newlogin/style.css">

</head>
<h2></h2>
<div class="container" id="container">
	<div class="form-container sign-up-container">
		<form action="RegisterServlet" method="post">
			<h1>新規作成</h1>
			<div class="social-container">
				<a href="#" class="social"><i class="fab fa-github-alt"></i></a>
				<a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
			
			</div>
			<span>or use your email for registration</span>
            name<input type="text" id="name" name="name" placeholder="名前を入力してください">
            weight<input type="text" id="goal_cal" name="goal_cal" placeholder="あなたの目標体重を入力してください">
			 <input type="submit" value="登録" id="submit">
		</form>
	</div>
	<div class="form-container sign-in-container">
        <form action="LoginServlet" method="post">
			<h1>ログイン画面</h1>
			<div class="social-container">
				<a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
				<a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
				<a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
			</div>
			<span>or use your account</span>
            <input type="text" id="name" name="name" value="${name}" placeholder="名前を入力してください">
            <input type="text" id="goal_cal" name="goal_cal" value="${goal_cal}" placeholder="あなたの目標体重を入力してください">
            
			<a href="#">Forgot your password?</a>
		  <input type="submit" value="ログイン" id="submit">
      
		</form>
	</div>
	<div class="overlay-container">
		<div class="overlay">
			<div class="overlay-panel overlay-left">
				<h1>Welcome Back!</h1>
				<p>To keep connected with us please login with your personal info</p>
				<button class="ghost" id="signIn">Sign In</button>
			</div>
			<div class="overlay-panel overlay-right">
				<h1>Hello, Friend!</h1>
				<p>Enter your personal details and start journey with us</p>
				<button class="ghost" id="signUp">Sign Up</button>
			</div>
		</div>
	</div>
</div>

<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script><script  src="newlogin/javascript.js"></script>






</body>
</html>