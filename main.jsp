<html>
<%@ page pageEncoding="Windows-31J"
    contentType="text/html;charset=Windows-31J" %>
    <head>  
    <meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">  
    <link href="https://fonts.googleapis.com/css?family=Source+Code+Pro:400,900|Source+Sans+Pro:300,900&display=swap" rel="stylesheet">
            
    <link rel="stylesheet" href="css/mainsstyle.css">
    <head><title>���H�Ńf�u�G�b�g</title></head>
    <body>
        
            <section class="userInf">
            <!-- �l���{�� -->
          <div class ="info">  <h1>���Ȃ��̏��</h1>
            <table border="1" align="center">
                <tr><th>age</th><td>${age}</td><th>weight</th><td>${weight}</td><th>gender</th><td>${gender}</td><th>result</th><td>${result}</td></tr>
            </table></div>
        </section>
        
            <!-- ���H�̃��X�g�ƑI�� -->
          <section class="chart" align="center">  <h1>�����H�ׂ����̂́H</h1>
            <form action="tableServlet" method="post" >
                <a>���͂�</a>  <img src="img/rice.png"><input type="checkbox" name="foods" value="raice"> 
                <br>
                <a>��</a>   <img src="img/egg.jpg"><input type="checkbox"  name="foods" value="egg">
                <br>
                <a>�[��</a>  <img src="img/natto.jpg"><input type="checkbox" name="foods" value="natto">
                <br>
                <a>�o�i�i</a> <img src="img/banana.jpg"><input type="checkbox"  name="foods" value="banana">
                <br>
                
                <!-- <input type="checkbox" name=""> -->

                <input type="submit" value="���M">
            </form>
          
        
                     �������߂̒��H
            <h1>�����̂������ߒ��H�I</h1>
            <div id="div0"></div>
            <form><input type="button" value="�I��" onclick="random()"></form>
            <script type="text/javascript">
                function random() {
                    rand = Math.floor(Math.random()*4);
                    if(rand == 0) msg = "���͂�";
                    if(rand == 1) msg = "��";
                    if(rand == 2) msg = "�[��";
                    if(rand == 3) msg = "�o�i�i";
                    var doc0 = document.getElementById("div0");
                    doc0.innerHTML=msg;
        
                }
        
        
        
            </script>
        
            
        
        
        
    </section>
                               <!-- ���O�A�E�g -->
        <dr>
            <form action='Logout' method='get'>
			<input type='submit' value='���O�A�E�g'>
			</form>
        
        
        </body>
        <footer>
            <small>Copyright&copy;</small>
            </footer>
        </html>