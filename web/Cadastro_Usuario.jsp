<%-- 
    Document   : Perfil
    Created on : 28/09/2016, 20:41:55
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
    <center>    
    <bold><h2>Cadastre-se</h2></bold>
    
    <form action="UsuarioServlet" >
    
        Nome:
        <input type="text" name="txtnome" />
        Senha:
        <input type="text" name="txtsenha" />
        
        <input type="submit" />
    
    </form>    
        
    </center>    
    
    </body>
</html>
