<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<!-- <link href="<c:url value="../resources/styles/style.css" />" rel="stylesheet">  -->
		
        <title>Cadastro</title>
    </head>
    <body>
        <div class="container">
            <div class="col-md-6 cadastro">
                <h1>Cadastro do Usuário</h1>
                <div>
                    <form action="cadastrar" method="POST">
                        <div class="form-group">
                            Nome:
                            <input type="text" name="nome" id="nome" class="form-control" required="">
                        </div>
                        <div class="form-group">
                            E-mail:
                            <input type="email" name="email" id="email" class="form-control" required="">
                        </div>
                        <div class="form-group">
                            Senha
                            <input type="text" name="senha" id="senha" class="form-control" required="">
                        </div>
                        <div class="form-group">
                            <input type="submit" id="submit" class="btn btn-primary" value="Salvar">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>