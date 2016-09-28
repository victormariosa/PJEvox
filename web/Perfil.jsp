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
        <center><h1>Cadastre um empregado</h1><br></center>
        <center>
            <form action="ServletEmpregado"  methos="POST" name="cad">
                <table>
                    <tr>
                        <td><label>Nome:</label></td><td><input type="text" maxlength="30" name="txtNome" placeholder="insira o nome." required=""></td>
                    </tr>
                    <tr>
                        <td><label>Cargo:</label></td><td><input type="text" maxlength="30" name="txtCargo" placeholder="insira o cargo." required=""></td>
                    </tr>
                    <tr>
                        <td><label>Horas trabalhadas:</label></td><td><input type="text" maxlength="10" name="txtHorasTrabalhadas"  required=""></td>
                    </tr>
                    <tr>
                        <td><label>Valor hora:</label></td><td><input type="text" maxlength="10" name="txtValor"  required=""></td>
                    </tr>
                    <tr>
                        <td><label>salário:</label></td><td><input type="text" maxlength="10" name="txtSalario"  disabled=""></td>
                    </tr>
                    <tr>
                        <td><input class="btn" type="reset" size="25px" value="redefinir" name="buttonRedefinir"></td><td><input class="btn" type="submit" size="25px" value="validar" name="buttonValidar"></td>
                    </tr>
                </table>
            </form>
        </center>
    </body>
</html>
