
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio Sesión</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </head>
    <body style="background: #333333;font-family: cursive;color: #ffffff">
        <h2 style="text-align: center;color: #99cc00"> Inicio de Sesión  </h2>
        <br/>
    <center>  
        <form action="login" method="post">
            Usuario   <br/>
            <input type ="text" name ="usuario" placeholder="" required="required" style="size: 16px">   <br/>
            Password  <br/>
            <input type ="password" name ="password" placeholder="" required="required" style="size: 16px">   <br/>  <br/>
            <input type ="submit" value ="Iniciar sesión" style="font-size: 18px;background: #99cc00;color: #ffffff">  <br/> 
            <br/>  <br/>
            No tienes Cuenta??  <a href="registro.jsp" style="color: #99cc00">Regístrate</a> 
        </form>
    </center>  
</body>
</html>
