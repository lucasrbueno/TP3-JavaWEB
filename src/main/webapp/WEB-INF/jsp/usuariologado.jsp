<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>Página de sucesso do cadastro</title>
    </head>
    <body>
        <div class="container">           
                <form action="/">
                <h1>Bem vindo ao sistema:</h1>
                <br>
                <h3><c:out value="${usuario.nome}"></c:out></h3>
                <h3><c:out value="${usuario.email}"></c:out></h3>
                <br>
                <input type="submit" class="btn btn-primary" value="Ir para Login">
            </form>
        </div>
    </body>
</html>