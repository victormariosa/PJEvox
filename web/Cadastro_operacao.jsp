<%-- 
    Document   : Perfil
    Created on : 28/09/2016, 20:41:55
    Author     : Senacrio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            #vc{ background-color: red; height: 300px; width: 400px; margin-left: 700px; color: white; top: 20px; }
            #fla{ background-color: black; height: 300px; width: 380px; color: white; }
            #rt{ left: 499px; top:303px;}
        </style>
            
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>JSP Page</title>
    </head>
    <body>
        
        <div id="vc"> <center>
            <div id="fla">
    <center>    
        <bold><h2>Selecione Operações</h2></bold>

        <form action="OperacaoServlet" >

            <table border="3">

   <thead>
       <tr>
           
           <th>Operações</th>

       </tr>

   </thead>
           
            </table>
                             <br><br>
                        
                        
                <select name="opr">

                    <option>Consultoria</option>
                    <option>Curso</option>
                    <option>Material</option>
                    <option>cliente</option>
                </select>
        
               
                                <br><br>

        <div id="rt">
        <input type="submit" value="entrar"/>
        </div>
        
        </form>    
               
        


    </center>  
    </div>
        </center>
        </div>
</body>
</html>

