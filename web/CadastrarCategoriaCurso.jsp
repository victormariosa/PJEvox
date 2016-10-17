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
        <title></title>
    </head>
    <body>
        <form action="CategoriaCursoServlet"  method="get" name="cad">
            <table name="Cadastrar">
                <tr>
                    <td><input type="radio" name="botao" request="" value="Cadastrar">Cadastrar</td><td><input type="radio" name="botao" request="" value="Alterar">Atualizar</td><td><input type="radio" name="botao" request="" value="Deletar">Deletar</td>
                </tr>
                <tr>
                    <td><h1>Cadastrar</h1></td>
                </tr>
                <tr>
                    <td><label>Nome:</label></td><td><input type="text" maxlength="30" name="txtNome" placeholder="insira o nome." ></td>
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
                   <td><input type="submit" name="cadastrar" value="cadastrar"/></td>
            </table>
            
            <table name="Buscar">
                
                <tr>
                    <td><h1>Buscar categoria</h1></td>
                </tr>
                 <tr>
                    <td><label>Id:</label></td><td><input type="number" maxlength="30" name="Bid"  ></td>
                </tr>
                <tr>
                    <td><label>Nome:</label></td><td><input type="text" maxlength="30" name="txtNome" placeholder="insira o nome." ></td>
                </tr>
                <tr>
                    <td><label>Descrição:</label></td><td><textarea cols="21" name="txtDescricao"></textarea></td>
                </tr>
                <tr>
                    <td><label>Status:</label></td><td><input type="radio" name="condicao" value="S">Ativo</td><td><input type="radio" name="condicao" value="N">Inativo</td>
                </tr>
                
                <tr>
                   <td><input type="submit" name="busca" value="buscar"/></td>
            </table>
        </form>
    </body>
</html>