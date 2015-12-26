<%-- 
    Document   : index
    Created on : 17-12-2015, 9:51:53
    Author     : Chelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
                <script type="text/javascript" src=js/jquery-2.1.4.js></script>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet"   href="css/bootstrap.min.css">
        <!-- Optional theme -->
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <center><h1>Muesta Libros</h1></center>
        <div id="content">
                <div id="buscarLibro">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                          <h2 class="panel-title">Buscar Libro</h2>
                        </div>
                        <div class="panel-body">
                            <form id="buscarLibroForm" name="buscarLibroForm" class="form-access-carrear-online" method="post" action="libroPostFecha">  
                                
                                Fecha: 
                                <br><input type="date" class="form-control" style="width: 30%" name="fecha" placeholder="AAAA/MM/DD"><br>
                                <input type="submit" class="btn btn-danger btn-access" value="Buscar"/>
                               
                            </form>
                            
                        </div>
                    </div>
                </div><!--Fin primer div--> 
                <div id="librosAlumno" style="display: ">
                               
                                    <div class="panel-body">
                                         <div class="panel panel-default">
                                            <!-- Default panel contents -->
                                            <div class="panel-heading">Libros Pedidos</div>

                                            <!-- Table -->
                                            <table class="taable table-striped" style="width: 100%">
                                              <thead>
                                                <tr>
                                                  <th>Titulo</th>
                                                  <th>Autor</th>
                                                  <th>ISBN</th>
                                                  <th>Fecha Pedido</th>
                                                  <th>Fecha Entrega</th>
                                                  <th>Estado</th>
                                                </tr>
                                              </thead>
                                              <tbody>
                                                <tr>
                                                  <td>John</td>
                                                  <td>Doe</td>
                                                  <td>john@example.com</td>
                                                  <td>John</td>
                                                    <td>Doe</td>
                                                    <td>john@example.com</td>
                                                </tr>
                                                <tr>
                                                  <td>Mary</td>
                                                  <td>Moe</td>
                                                  <td>mary@example.com</td>
                                                  <td>John</td>
                                                    <td>Doe</td>
                                                    <td>john@example.com</td>
                                                </tr>
                                                <tr>
                                                  <td>July</td>
                                                  <td>Dooley</td>
                                                  <td>july@example.com</td>
                                                  <td>John</td>
                                                    <td>Doe</td>
                                                    <td>john@example.com</td>
                                                </tr>
                                              </tbody>
                                            </table>
                                          </div>
                                    </div>
                               
                            </div>
        </div>         
    </body>
</html>
