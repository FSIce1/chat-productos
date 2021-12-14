<%@page import="modelos.Modelo_Producto1"%>
<%@page import="beans.Producto1"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="ALERTA" scope="request" class="java.lang.String"></jsp:useBean>
<!DOCTYPE html>
<html lang="es">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
            content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/popper.min.js"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">

        <link rel="icon" type="image/png" sizes="32x32" href="img/icono.png">
        
        <link rel="stylesheet" href="css/sweetalert2.min.css">
        <link rel="stylesheet" media="screen, print" href="css/datagrid/datatables/datatables.bundle.css">
        <link rel="stylesheet" media="screen, print" href="css/fa-solid.css">

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
                                <!--
                                <a class="nav-item nav-link" href="#">Inicio <span class="sr-only">(current)</span></a>
                                -->
                                <a class="nav-item nav-link" href="Controlador_Producto?opcion=L">Productos</a>
                                <a class="nav-item nav-link active" href="Controlador_Producto?opcion=A">Lista de Producto</a>
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
            
            <div style="width: 90%; height: auto; display: flex; flex-direction: column; margin: 0 auto; margin-top: 80px" >
                <ol class="breadcrumb page-breadcrumb">
                    <li class="breadcrumb-item"><a href="javascript:void(0);">CompuMundo</a></li>
                    <li class="breadcrumb-item">Productos</li>
                    <li class="breadcrumb-item active">Lista de Productos</li>
                </ol>

                
                
                <div class="row">
                    <div class="col-6">
                        <div class="subheader">
                            <h1 class="subheader-title">
                                <i class='subheader-icon fal fa-table'></i> Lista de: <span class='fw-300'>Productos</span>
                                <small>
                                    Listado de todos los productos de la tienda
                                </small>
                            </h1>
                        </div>
                    </div>
                    <div class="col-6 text-right">
                        <button type="button" style="width: 150px" class="btn btn-primary" data-toggle="modal" data-target="#default-example-modal" onclick="Mostrar('','','','','I')" >Agregar</button>
                        <br><br> 
                    </div>
                </div>
                

                <!-- Modal Producto -->
                <div class="modal fade" id="default-example-modal" tabindex="-1" role="dialog" aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h4 id="tituloModal" class="modal-title">
                                    Agregar Producto
                                </h4>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true"><i class="fal fa-times"></i></span>
                                </button>
                            </div>
                            <div class="modal-body">

                                <form id="formulario" class="form" method="post" enctype="multipart/form-data" autocomplete="off" action="Controlador_Producto?opcion=I">
                                    <!-- enctype="multipart/form-data" -->
                                    <div class="form-group">
                                        <label class="form-label" for="txtNombre">Nombre</label>
                                        <input type="text" id="txtNombre" name="txtNombre" placeholder="Computadora RXY" required="required" maxlength="80" class="form-control">
                                    </div>

                                    <div class="form-group">
                                        <label class="form-label" for="txtPrecio">Precio</label>
                                        <input type="text" id="txtPrecio" name="txtPrecio" pattern="[0-9]+(\.[0-9]{1,2})?%?" placeholder="400.50" required="required" class="form-control">
                                    </div>
                                    
                                    <div class="form-group">
                                        <label class="form-label" for="txtDescripcion">Descripción</label>
                                        <textarea id="txtDescripcion" name="txtDescripcion" cols="30" rows="3" required="required" placeholder="La mejor computadora..." class="form-control"></textarea>
                                        <!-- <input type="text" id="txtDescripcion" name="txtDescripcion"  required="required" placeholder="La mejor computadora..." class="form-control"> -->
                                    </div>
                                    
                                    <div class="form-group">                            
                                        <input type="file" required id="txtFoto" name="txtFoto" placeholder="sad">
                                    </div>
                                    
                                    
                                    <input type="hidden" id="txtId" name="txtId" value="">

                                    <!--<input type="hidden" id="opcion" name="opcion" value="I">-->


                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                                        <button id="btnGuardar" type="submit" class="btn btn-primary">Guardar</button>
                                    </div>

                                </form>

                            </div>
                        </div>
                    </div>
                </div>

                <!-- Modal Editar Producto -->
                <div class="modal fade" id="default-example-modal-editar" tabindex="-1" role="dialog" aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h4 id="tituloModalEditar" class="modal-title">
                                    Editar Producto
                                </h4>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true"><i class="fal fa-times"></i></span>
                                </button>
                            </div>
                            <div class="modal-body">

                                <form id="formulario-editar" class="form" method="post" autocomplete="off" action="Controlador_Producto?opcion=D">
                                    <!-- enctype="multipart/form-data" -->
                                    <div class="form-group">
                                        <label class="form-label" for="txtNombre">Nombre</label>
                                        <input type="text" id="txtNombreM" name="txtNombreM" placeholder="Computadora RXY" required="required" maxlength="80" class="form-control">
                                    </div>

                                    <div class="form-group">
                                        <label class="form-label" for="txtPrecio">Precio</label>
                                        <input type="text" id="txtPrecioM" name="txtPrecioM" pattern="[0-9]+(\.[0-9]{1,2})?%?" placeholder="400.50" required="required" class="form-control">
                                    </div>
                                    
                                    <div class="form-group">
                                        <label class="form-label" for="txtDescripcion">Descripción</label>
                                        <textarea id="txtDescripcionM" name="txtDescripcionM" cols="30" rows="3" required="required" placeholder="La mejor computadora..." class="form-control"></textarea>
                                        <!-- <input type="text" id="txtDescripcion" name="txtDescripcion"  required="required" placeholder="La mejor computadora..." class="form-control"> -->
                                    </div>
                                    
                                    <!--
                                    <div class="form-group">                            
                                        <input type="file" required id="txtFoto" name="txtFoto" placeholder="sad">
                                    </div>
                                    -->
                                    
                                    
                                    <input type="hidden" id="txtIdM" name="txtIdM" value="">

                                    <!--<input type="hidden" id="opcion" name="opcion" value="I">-->


                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                                        <button id="btnGuardarM" type="submit" class="btn btn-primary">Guardar</button>
                                    </div>

                                </form>

                            </div>
                        </div>
                    </div>
                </div>

            
                
            
                <!-- Inicia TABLA -->
                <table id="dt-basic-example" class="table table-bordered table-hover table-striped w-100">

                    <thead class="bg-primary-600">
                        <tr>
                            <th>Id</th>
                            <th>Fecha</th>
                            <th>Imagen</th>
                            <th>Nombre</th>
                            <th>Precio</th>
                            <th>Descripción</th>
                            <th class="disabled-sorting">Modificar</th>
                            <th class="disabled-sorting">Eliminar</th>
                        </tr>
                    </thead>

                    <tbody>

                        <%

                            List<Producto1> listaProductos = Modelo_Producto1.lista();

                            for (Producto1 u : listaProductos) {

                        %>

                        <tr>
                            <td><%= u.getId() %></td>
                            <td>
                                <img src="productos/<%=u.getImagen()%>" width="50" height="50">
                            </td>
                            <td><%= u.getDate()%></td>
                            <td><%= u.getName() %></td>
                            <td><%= u.getPrice() %></td>
                            <td><%= u.getDescription()%></td>
                            <td>
                                <input type="image" src="img/editar.png" data-toggle="modal" data-target="#default-example-modal-editar" onclick="Mostrar(<%= u.getId() %>,'<%= u.getName() %>', '<%= u.getPrice() %>', '<%= u.getDescription()%>', 'D')">
                            </td> <!-- "Mostrar(<%= u.getId() %>,'<%= u.getName() %>',<%= u.getPrice() %>,'<%= u.getDescription() %>','M')" -->
                            <td>

                                <form action="Controlador_Producto" method="post">

                                    <input type="hidden" name="txtId" value="<%=u.getId()%>"> 

                                    <input type="hidden" name="opcion" value="E">

                                    <input type="image" src="img/eliminar.png" onclick="return confirm('¿Desea Eliminar?')">

                                </form>

                            </td>
                        </tr>

                        <%
                            }
                        %>

                    </tbody>
                    <tfoot>
                        <tr>
                            <th>Id</th>
                            <th>Fecha</th>
                            <th>Nombre</th>
                            <th>Precio</th>
                            <th>Descripción</th>
                            <th class="disabled-sorting">Modificar</th>
                            <th class="disabled-sorting">Eliminar</th>
                        </tr>
                    </tfoot>
                </table>
                <!-- Termina TABLA -->

            </div>
            
        </main>

        <script src="js/jquery-3.4.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/sweetalert2.min.js"></script>
        <script src="js/carrito.js"></script>
        <script src="js/pedido.js"></script>
       
        <script src="js/vendors.bundle.js"></script>
        <script src="js/app.bundle.js"></script>
        
        <script src="js/datagrid/datatables/datatables.bundle.js"></script>
        <script src="js/datagrid/datatables/datatables.export.js"></script>
        
         <script type="text/javascript">
            var Mostrar = function(id, name, price, description, estado){
                
                if(estado=="I"){
                    document.getElementById("txtId").value = id;
                    document.getElementById("txtNombre").value = name;
                    document.getElementById("txtPrecio").value = price;
                    document.getElementById("txtDescripcion").value = description;
                    
                    document.getElementById("tituloModal").innerHTML = "Nuevo Producto";
                    document.getElementById("btnGuardar").innerHTML = "Guardar";
                    
                    document.getElementById("opcion").value = estado;
                    
                } else {
                    
                    document.getElementById("txtIdM").value = id;
                    document.getElementById("txtNombreM").value = name;
                    document.getElementById("txtPrecioM").value = price;
                    document.getElementById("txtDescripcionM").value = description;

                    document.getElementById("tituloModal").innerHTML = "Modificar Producto";
                    document.getElementById("btnGuardar").innerHTML = "Modificar";
                
                    document.getElementById("opcion").value = estado;
                }
            
            }
            
            // CUANDO CIERRAS EL MODAL
            $("#default-example-modal").on("hidden.bs.modal", function(){
                $("#campo-alertas").fadeOut();
                limpiarDatos();
            });

            // LIMPIO FORMULARIO
            var limpiarDatos = function(){
                document.getElementById("formulario").reset();
            }
            
            // CUANDO CIERRAS EL MODAL
            $("#default-example-modal-editar").on("hidden.bs.modal", function(){
                $("#campo-alertas").fadeOut();
                limpiarDatosEditar();
            });

            // LIMPIO FORMULARIO
            var limpiarDatosEditar = function(){
                document.getElementById("formulario-editar").reset();
            }
            
        </script>
        
        <%
            if(ALERTA!=null){
                if(ALERTA.equals("INGRESADO")){
                    %>
                    <script>
                        Swal.fire(
                            'Operación Realizada!',
                             'Ingresado correctamente!',
                             'success'
                         )
                    </script>
                    <%
                } else if(ALERTA.equals("NO_INGRESADO")){
                    %>
                    <script>
                         Swal.fire(
                            'Operación no Realizada!',
                             'No pudo ser ingresado!',
                             'info'
                         )
                    </script>
                    <%
                } else if(ALERTA.equals("MODIFICADO")){
                    %>
                    <script>
                        Swal.fire(
                            'Operación Realizada!',
                             'Modificado correctamente!',
                             'success'
                         )
                    </script>
                    <%
                } else if(ALERTA.equals("NO_MODIFICADO")){
                    %>
                    <script>
                        Swal.fire(
                            'Operación no Realizada!',
                             'No pudo ser modificado!',
                             'info'
                         )
                    </script>
                    <%
                } else if(ALERTA.equals("ELIMINADO")){
                    %>
                    <script>
                        Swal.fire(
                            'Operación Realizada!',
                             'Eliminado correctamente!',
                             'success'
                         )
                    </script>
                    <%
                } else if(ALERTA.equals("NO_ELIMINADO")){
                    %>
                    <script>
                        Swal.fire(
                            'Operación no Realizada!',
                             'No pudo ser eliminado!',
                             'info'
                         )
                    </script>
                    <%
                } else if(ALERTA.equals("ERROR")){
                    %>
                    <script>
                        Swal.fire(
                            'Operación no Realizada!',
                             'Ocurrió un problema interno!',
                             'error'
                         )
                    </script>
                    <%
                } 

            }
        %>
        
        <!-- LIBERÍA PARA REPORTES-->
        <script>
            $(document).ready(function()
            {

                // initialize datatable
                $('#dt-basic-example').dataTable(
                {
                    responsive: true,
                    lengthChange: false,
                    dom:
                        /*	--- Layout Structure 
                        	--- Options
                        	l	-	length changing input control
                        	f	-	filtering input
                        	t	-	The table!
                        	i	-	Table information summary
                        	p	-	pagination control
                        	r	-	processing display element
                        	B	-	buttons
                        	R	-	ColReorder
                        	S	-	Select

                        	--- Markup
                        	< and >				- div element
                        	<"class" and >		- div with a class
                        	<"#id" and >		- div with an ID
                        	<"#id.class" and >	- div with an ID and a class

                        	--- Further reading
                        	https://datatables.net/reference/option/dom
                        	--------------------------------------
                         */
                        "<'row mb-3'<'col-sm-12 col-md-6 d-flex align-items-center justify-content-start'f><'col-sm-12 col-md-6 d-flex align-items-center justify-content-end'lB>>" +
                        "<'row'<'col-sm-12'tr>>" +
                        "<'row'<'col-sm-12 col-md-5'i><'col-sm-12 col-md-7'p>>",
                    buttons: [
                        /*{
                        	extend:    'colvis',
                        	text:      'Column Visibility',
                        	titleAttr: 'Col visibility',
                        	className: 'mr-sm-3'
                        },*/
                        {
                            extend: 'pdfHtml5',
                            text: 'PDF',
                            titleAttr: 'Generar PDF',
                            className: 'btn-outline-danger btn-sm mr-1'
                        },
                        {
                            extend: 'excelHtml5',
                            text: 'Excel',
                            titleAttr: 'Generar Excel',
                            className: 'btn-outline-success btn-sm mr-1'
                        },
                        {
                            extend: 'csvHtml5',
                            text: 'CSV',
                            titleAttr: 'Generate CSV',
                            className: 'btn-outline-primary btn-sm mr-1'
                        },
                        {
                            extend: 'copyHtml5',
                            text: 'Copy',
                            titleAttr: 'Filas copiadas',
                            className: 'btn-outline-primary btn-sm mr-1'
                        },
                        {
                            extend: 'print',
                            text: 'Print',
                            titleAttr: 'Imprime tabla',
                            className: 'btn-outline-primary btn-sm'
                        }
                    ]
                });

            });

        </script>
    

    </body>

</html>
