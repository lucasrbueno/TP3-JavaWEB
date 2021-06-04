<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>Login</title>
    </head>

    <body>
        <div class="container">
            <h1>Olá, bem-vindo!</h1>
            <br>
            <h3>Insira seus dados para continuar:</h3>
            <form action="/validacao" method="post">
            <div class="form-group">
                E-mail:
                <input type="email" name="email" id="email" class="form-control" required="">
            </div>
            <div class="form-group">
                Senha
                <input type="text" name="senha" id="senha" class="form-control" required="">
            </div>
            <input type="submit" id="submit" class="btn btn-primary" value="Realizar login"> <br>
            <br>
            </form>
            <a href="cadastro" class="btn btn-secondary">Cadastrar-se</a><br>
        </div>
    </body>
</html>