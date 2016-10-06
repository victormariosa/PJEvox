<%-- 
    Document   : Cadastro_Palestra
    Created on : 30/09/2016, 20:28:10
    Author     : Senacrio
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="PalestraServlet" method="post">
            <table>
                <tr><td><input type="text" name="nome" placeholder="Nome"></td></tr>
                <tr><td><textarea  name="descricao"></textarea></td></tr>
                 <tr><td><input type="radio" name="op" value="ativo">Ativo</td></tr>
                <tr><td><input type="radio" name="op" value="desativado">Desativado</td></tr>
                
               Categoria: <select>
                    <jsp:useBean id="dao" class="br.senac.ti.Evox.dao.CategoriaPalestraDAO"/>
                    <c:forEach var="categoria" items="${dao.categoriaPalestra}">
                    
                            <option value="${categoria.id_categoria_palestra}">${categoria.nome}</option>
                    </c:forEach>
                </select>
                 <tr><td><input type="submit" value="Cadastrar"></td></tr>   
            </table>
        </form> 
            
    </body>
</html>
