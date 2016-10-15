<%-- 
    Document   : Cadastro_Consultoria
    Created on : 04/10/2016, 19:21:01
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
        <form action="consultoriaServlet">
            <table>
                <tr><td><input type="text" name="nome" placeholder="Nome"></td></tr>
                <tr><td><input type="text" name="descricao" placeholder="Descricao"></td></tr>
                <tr><td><input type="submit" value="Cadastrar"></td></tr>           
            </table>
        </form> 
    </body>
</html>
