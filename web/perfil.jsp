<%-- 
    Document   : perfil
    Created on : 30/09/2016, 19:10:16
    Author     : Senacrio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="PerfilServlet"  methos="POST" name="cad">
            <table>
                <tr>
                    <td><label>Nome:</label></td><td><input type="text" maxlength="30" name="txtNome" placeholder="insira o nome." required=""></td>
                </tr>
                <tr>
                    <td><label>Descrição:</label></td><td><textarea cols="21" name="txtDescricao"></textarea></td>
                </tr>
                <tr>
                    <td><input type="radio" name="rdbSN" value="S">Ativo</td>
                </tr>
                <tr>
                    <td><input type="radio" name="rdbSN" value="N">Desativado</td>
                </tr>
                <tr>
                    <td><input type="submit" value="enviar"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
