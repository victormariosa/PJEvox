<%-- 
    Document   : Cadastro_Palestra
    Created on : 30/09/2016, 20:28:10
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
        <form action="palestraServlet">
            <table>
                <tr><td><input type="text" name="nome" placeholder="Nome"></td></tr>
                <tr><td><input type="text" name="descricao" placeholder="Descrição"></td></tr>
                <tr><td><input type="submit" value="Cadastrar"></td></tr>           
            </table>
        </form> 
            
    </body>
</html>
