<%-- 
    Document   : index.jsp
    Created on : 7 dic. 2021, 02:04:47
    Author     : luisf
--%>

<%@page import="modelos.Modelo_Producto1"%>
<%@page import="beans.Producto1"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
            content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/popper.min.js"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">

        <link rel="icon" type="image/png" sizes="32x32" href="img/icono.png">
        <link rel="stylesheet" href="css/sweetalert2.min.css">

        <link rel="stylesheet" media="screen, print" href="css/app.bundle.css">
        
        <!-- base css -->
        <link rel="stylesheet" media="screen, print" href="css/vendors.bundle.css">
        <link rel="stylesheet" media="screen, print" href="css/app.bundle.css">

        <title>Lista de Productos</title>
    </head>

    <body>

        <header>
            <div class="container">
                <div class="row align-items-stretch justify-content-between">
                    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
                        <a class="navbar-brand" href="#">CompuMundo</a>
                        
                        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                            <div class="navbar-nav">
                                <a class="nav-item nav-link" href="#">Inicio <span class="sr-only">(current)</span></a>
                                <a class="nav-item nav-link active" href="Controlador_Producto?opcion=L">Productos</a>
                                <a class="nav-item nav-link" href="Controlador_Producto?opcion=A">Lista de Producto</a>
                            </div>
                        </div>
                        <!--
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse"
                            aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        
                        <div class="collapse navbar-collapse" id="navbarCollapse">
                            <ul class="navbar-nav mr-auto">
                                <li class="nav-item dropdown">
                                    <img src="img/cart.jpeg" class="nav-link dropdown-toggle img-fluid" height="70px"
                                        width="70px" href="#" id="dropdown01" data-toggle="dropdown" aria-haspopup="true"
                                        aria-expanded="false"></img>
                                    <div id="carrito" class="dropdown-menu" aria-labelledby="navbarCollapse">
                                        <table id="lista-carrito" class="table">
                                            <thead>
                                                <tr>
                                                    <th>Imagen</th>
                                                    <th>Nombre</th>
                                                    <th>Precio</th>
                                                    <th></th>
                                                </tr>
                                            </thead>
                                            <tbody></tbody>
                                        </table>

                                        <a href="#" id="vaciar-carrito" class="btn btn-primary btn-block">Vaciar Carrito</a>
                                        <a href="#" id="procesar-pedido" class="btn btn-danger btn-block">Procesar
                                            Compra</a>
                                    </div>
                                </li>
                            </ul>
                        </div>
                        -->
                    </nav>
                </div>
            </div>
        </header>

        <main>
            <div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 my-4 mx-auto text-center">
                <h1 class="display-4 mt-4">Lista de Productos</h1>
                <p class="lead"></p>
            </div>

            <div class="container" id="lista-productos" style="display: flex; flex-wrap: wrap; justify-content: center;">
                <%
                    List<Producto1> listaProductos = Modelo_Producto1.lista();

                    for (Producto1 u : listaProductos) {
                %>
                
                <div class="card" style="width: 18rem; margin: 10px" >
                    <img class="card-img-top" src="https://www.wikihow.com/images_en/thumb/7/76/Set-up-a-Computer-Step-7.jpg/v4-1200px-Set-up-a-Computer-Step-7.jpg" alt="Card image cap">
                    <div class="card-body" style="display: flex; flex-direction: column">
                      <h5 class="card-title text-center"><%=u.getName()%></h5>
                      <p class="card-text"><%=u.getDescription()%></p>
                      <a href="#" class="btn btn-info">Oferta</a>
                    </div>
                </div>
            
                <%
                    }
                %>
            </div>
        </main>

        <script src="js/jquery-3.4.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/sweetalert2.min.js"></script>
        <script src="js/carrito.js"></script>
        <script src="js/pedido.js"></script>
        
        <script src="js/vendors.bundle.js"></script>
        <script src="js/app.bundle.js"></script>

    </body>

</html>
