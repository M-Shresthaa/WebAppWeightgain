<html>
<%@ page pageEncoding="Windows-31J"
    contentType="text/html;charset=Windows-31J" %>
    <head>  
    <meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">  
    <link href="https://fonts.googleapis.com/css?family=Source+Code+Pro:400,900|Source+Sans+Pro:300,900&display=swap" rel="stylesheet">
            
    <link rel="stylesheet" href="css/mainsstyle.css">
    <head><title>朝食でデブエット</title></head>
    <body>
        
            <section class="userInf">
            <!-- 個人情報閲覧 -->
          <div class ="info">  <h1>あなたの情報</h1>
            <table border="1" align="center">
                <tr><th>age</th><td>${age}</td><th>weight</th><td>${weight}</td><th>gender</th><td>${gender}</td><th>result</th><td>${result}</td></tr>
            </table></div>
        </section>
        
            <!-- 朝食のリストと選択 -->
          <section class="chart" align="center">  <h1>今日食べたものは？</h1>
            <form action="tableServlet" method="post" >
                <a>ごはん</a>  <img src="img/rice.png"><input type="checkbox" name="foods" value="raice"> 
                <br>
                <a>卵</a>   <img src="img/egg.jpg"><input type="checkbox"  name="foods" value="egg">
                <br>
                <a>納豆</a>  <img src="img/natto.jpg"><input type="checkbox" name="foods" value="natto">
                <br>
                <a>バナナ</a> <img src="img/banana.jpg"><input type="checkbox"  name="foods" value="banana">
                <br>
                
                <!-- <input type="checkbox" name=""> -->

                <input type="submit" value="送信">
            </form>
          
        
                     おすすめの朝食
            <h1>今日のおすすめ朝食！</h1>
            <div id="div0"></div>
            <form><input type="button" value="選択" onclick="random()"></form>
            <script type="text/javascript">
                function random() {
                    rand = Math.floor(Math.random()*4);
                    if(rand == 0) msg = "ごはん";
                    if(rand == 1) msg = "卵";
                    if(rand == 2) msg = "納豆";
                    if(rand == 3) msg = "バナナ";
                    var doc0 = document.getElementById("div0");
                    doc0.innerHTML=msg;
        
                }
        
        
        
            </script>
        
            
        
        
        
    </section>
                               <!-- ログアウト -->
        <dr>
            <form action='Logout' method='get'>
			<input type='submit' value='ログアウト'>
			</form>
        
        
        </body>
        <footer>
            <small>Copyright&copy;</small>
            </footer>
        </html>