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
        <script>
            function Cad(){
            }
        </script>
    </head>
    <body>
        <form action="PerfilServlet"  metho="get" name="cad">
            <table>
                <tr>
                    <td><input type="radio" name="btOp" onclick="Cad()" request="" value="Cadastrar">Cadastrar</td><td><input type="radio" name="btOp" request="" value="Alterar">Atualizar</td><td><input type="radio" name="btOp" request="" value="Deletar">Deletar</td>
                </tr>
                <tr>
                    <td><h1>Cadastro</h1></td>
                </tr>
                <tr>
                    <td><label>Nome:</label></td><td><input type="text" maxlength="30" name="txtNome" placeholder="insira o nome."></td>
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
                    <td><input type="submit" name="busca" value="Enviar"/></td>
                </tr>
            </table>
            <table>
                <tr>
                    <td><h1>Buscar Perfil</h1></td>
                </tr>
                <tr>
                    <td>ID:</td><td><input type="number" name="Bid" value=""></td>
                </tr>
                <tr>
                    <td>Nome:</td><td><input type="txt" disabled="" name="Bnome" value=""></td>
                </tr>
                <tr>
                    <td>Descrição:</td><td><input type="txt" disabled="" name="Bdescricao" value=""></td>
                </tr>
                <tr>
                    <td>Estatus:</td><td><input type="txt" disabled="" name="Bestatus" value=""></td>
                </tr>
                <tr>
                    <td><input type="submit" name="busca" value="Buscar"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>