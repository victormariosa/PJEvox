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

            <table border="0">

                <thead>
                    <tr>
                        <th>Cadastre-se</th>

                    </tr>

                </thead>

                <tbody>
                    <tr>
                        <td>Nome:</td>
                        <td><input type="text" name="txtnome" /></td>
                    </tr>
                    <tr>

                        <td> Senha:</td>
                        <td><input type="password" name="txtsenha" /></td>
                    </tr>


                    <tr>

                <select name="usuarios">

                    <option>Administrador</option>
                    <option>cliente</option>


                </select>

                </tr>
                <tr>
                    <td><input type="submit" value="entrar"/></td>

                </tr>    
        </form>    

    </center>    

</body>
</html>
