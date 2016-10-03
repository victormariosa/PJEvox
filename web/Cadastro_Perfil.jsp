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
        <form action="PerfilServlet"  methos="get" name="cad">
            <table>
                <tr>
                    <td><input type="radio" name="btOp" request="" value="Cadastrar">Cadastrar</td><td><input type="radio" name="btOp" request="" value="Alterar">Atualizar</td><td><input type="radio" name="btOp" request="" value="Deletar">Deletar</td><td><input type="submit" value="enviar"></td>
                </tr>
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
                    <td>ID:<input type="txt" name="txt" value=""></td><td><input type="submit" name="busca" value="busca"/></td>
            </table>
        </form>
    </body>
</html>
