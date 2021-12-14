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
        
        
        <meta name="keywords" content="keyword1,keyword2,keyword3">
    
        <link rel="stylesheet" media="screen, print" href="css/chat.css">
    
        <script  type="text/javascript">
            var ws;
            var wsUri = "ws://localhost:8080/Prueba-CHAT/echo";
            ws = new WebSocket(wsUri);

            ws.onopen = function(){
              n=prompt('Por favor, ingrese un nombre:');
              n=n.substr(0,16);
              ws.send(n);// Este mensaje debe ser recibido por OnMessage en el servidor
            };

            // Procesamiento de procesamiento de información después de la conexión
            ws.onmessage = function(message){
                 writeToScreen(message.data); 
            };

            // Supervise el botón enviar para obtener la información enviada y enviar el objeto
            function button(){
              message = document.getElementById('in').value;
              towho = document.getElementById('towho').value + "@";
              ws.send(towho+message);
                
              message = document.getElementById('in').value = "";
            }   

            // Cuando ocurre un error, maneje el error
            ws.onerror = function (evt){ 
                    writeToScreen('<span style="color:red;">ERROR:</span>'+evt.data);
                    ws.close();
                };

            // Mostrar información en la pantalla actual
            function writeToScreen(message){
                var pre = document.createElement("p");
                pre.style.wordWrap = "break-word";
                pre.innerHTML = message;
                output.appendChild(pre);
            }   

            // Ejecuta ws.close al cerrar la página
            window.onbeforeunload=function (){ 
                 ws.close();
            }; 
        </script>
        
    </head>

    <body>

        <header>
            <div class="container">
                <div class="row align-items-stretch justify-content-between">
                    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
                        <a class="navbar-brand" href="#">CompuMundo</a>
                        
                        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                            <div class="navbar-nav">
                                <!--
                                <a class="nav-item nav-link" href="#">Inicio <span class="sr-only">(current)</span></a>
                                -->
                                <a class="nav-item nav-link active" href="Controlador_Producto?opcion=L">Productos</a>
                                <a class="nav-item nav-link" href="Controlador_Producto?opcion=A">Lista de Producto</a>
                            </div>
                        </div>
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
                    <img class="card-img-top" src="productos/<%=u.getImagen()%>" width="100" height="230" alt="<%=u.getImagen()%>">
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
            
        
        <!-- CHAT --> 
        <div id="chatBot_XX" class="chatBot_XX">
            <div class="chat_XX">
                <h1 style="color: white">Chat</h1>

                <!-- Buzón dónde se muestran los mensajes-->
                <div class="buzon_XX" id="output"> </div>  <br>    
                <div style="text-align:left;">
                    <form action="">
                        <!-- Caja dónde se envían los mensajes -->
                        <input class="mensaje_XX" id="in" name="message" value="" type="text">
                        <br><br>


                        <div class="envio_XX">

                            <!--  Botón para enviar -->
                            <input onclick="button()" class="boton_XX" value="enviar" type="button"/>

                            <!-- A que persona le vamos a enviar -->
                            <div class="envio__persona_XX">
                                <span class="envia_persona_XX span_flex_XX">&nbsp;Enviar a la persona: &nbsp;</span> 
                                <input id="towho" name="towho" value="all">
                            </div>
                        </div>

                        <br>
                    </form>
                </div>
            </div>
            
        </div>    
           
        <!-- Botón chatear -->
        <button id="agregar" type="button" onclick="ocultarMostrar()" class="boton_XX chatear_XX">Chatear...</button>

        <script src="js/jquery-3.4.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/sweetalert2.min.js"></script>
        <script src="js/carrito.js"></script>
        <script src="js/pedido.js"></script>
        
        <script src="js/vendors.bundle.js"></script>
        <script src="js/app.bundle.js"></script>
        
        <script>
            function ocultarMostrar(){
                if(document.getElementById('chatBot_XX').style.visibility  === "visible"){
                    document.getElementById('chatBot_XX').style.visibility  = "hidden";
                }else{
                document.getElementById('chatBot_XX').style.visibility  = "visible";
                }
            }
        </script>

    </body>

</html>
