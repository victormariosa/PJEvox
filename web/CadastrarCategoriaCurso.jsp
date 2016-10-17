<%-- 
    Document   : CadastrarCategoriaCurso
    Created on : 16/10/2016, 07:08:54
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
        <form action="CategoriaCursoServlet"  method="get" name="cad">
            <table name="Cadastrar">
                <tr>
                    <td><input type="radio" name="botao" request="" value="Cadastrar">Cadastrar</td><td><input type="radio" name="botao" request="" value="Alterar">Atualizar</td><td><input type="radio" name="botao" request="" value="Deletar">Deletar</td><td><input type="submit" value="enviar"></td>
                </tr>
                <tr>
                    <td><h1>Cadastrar</h1></td>
                </tr>
                <tr>
                    <td><label>Nome:</label></td><td><input type="text" maxlength="30" name="txtNome" placeholder="insira o nome." required=""></td>
                </tr>
                <tr>
                    <td><label>Descrição:</label></td><td><textarea cols="21" name="txtDescricao"></textarea></td>
                </tr>
                <tr>
                    <td><input type="radio" name="status" value="S">Ativo</td>
                </tr>
                <tr>
                    <td><input type="radio" name="status" value="N">Desativado</td>
                </tr>
                <tr>
                    <td>ID:<input type="txt" name="txt" value=""></td><td><input type="submit" name="busca" value="busca"/></td>
            </table>
            
            <table name="Alterar">
                
                <tr>
                    <td><h1>Buscar categoria</h1></td>
                </tr>
                 <tr>
                    <td><label>Id:</label></td><td><input type="number" maxlength="30" name="Bid"  required=""></td>
                </tr>
                <tr>
                    <td><label>Nome:</label></td><td><input type="text" maxlength="30" name="txtNome" placeholder="insira o nome." required=""></td>
                </tr>
                <tr>
                    <td><label>Descrição:</label></td><td><textarea cols="21" name="txtDescricao"></textarea></td>
                </tr>
                <tr>
                    <td><label>Status:</label></td><td><input type="text" name="condicao" value=""></td>
                </tr>
                
                <tr>
                   <td><input type="submit" name="busca" value="busca"/></td>
            </table>
        </form>
    </body>
</html>