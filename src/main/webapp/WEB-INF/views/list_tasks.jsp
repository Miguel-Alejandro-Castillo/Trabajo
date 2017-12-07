<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Login</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <spring:url value="/resources/css/style.css" var="style_css" />
    <spring:url value="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" var="font_awesone_css"/>
    <spring:url value="/resources/css/bootstrap.min.css" var="bootstrap_css" />
    <spring:url value="/resources/css/mdb.min.css" var="mdb_css" />
    <spring:url value="/resources/js/jquery-3.2.1.min.js" var="jquery_js"/>
    <spring:url value="/resources/js/popper.min.js" var="popper_js"/>
    <spring:url value="/resources/js/bootstrap.min.js" var="bootstrap_js"/>
    <spring:url value="/resources/js/mdb.min.js" var="mdb_js"/>
    <spring:url value="/resources/js/funciones.js" var="funciones"/>
    <link href="${style_css}" rel="stylesheet"/>
    <link href="${font_awesone_css}" rel="stylesheet"/>
    <link href="${bootstrap_css}" rel="stylesheet"/>
    <link href="${mdb_css}" rel="stylesheet"/>
    <script src="${jquery_js}"></script>
    <script src="${popper_js}"></script>
    <script src="${bootstrap_js}"></script>
    <script src="${mdb_js}"></script>
    <script src="${funciones}"></script>
    <spring:url value="/resources/images/Pencil-icon.png" var="pencil"/>
    <spring:url value="/resources/images/seo.jpg" var="recycler"/>
</head>
<body>
<script type="application/javascript">
    function borrarTarea(idTarea)
    {
        if(alert("borrar tarea?"))
            $.ajax({
            data: idTarea,
            url: '/list_tasks/delete/' + idTarea,
            type: 'POST',
            success: function (response) {

            }
        });
}
</script>
<nav class="navbar navbar-expand-lg navbar-dark fixed-top scrolling-navbar">
    <div class="container">
        <a class="navbar-brand" href="home">TAREAS!</a>
    </div>
</nav>
<div id="caja_logout">
    <% String Email = (String) session.getAttribute("Email"); %>
    <span > usuario: <%=Email%> <a href="logout" class="">Salir</a> </span>
</div>
<div class="container-fluid">

    <div class="row-fluid ">
        <div class="col ">
            <!--Form with header-->
            <div class="card centering text-center " style="width:32rem;">

                <!--Header-->
                <div class="header pt-3 grey lighten-2">

                    <div class="row d-flex justify-content-center">
                        <h3 class="deep-grey-text mt-3 mb-4 pb-1 mx-5">Mis tareas</h3>
                    </div>

                </div>
                <!--Header-->

                <div class="card-body mx-4 mt-4" style="text-align: center;">
                    <table  class="table table-condensed table-hover table-striped">
                        <tbody>

                        <c:forEach items="${tareas}" var="tarea"  >
                            <tr>
                                <td> <input type="checkbox" name="realizada" id="realizads" <c:if test="${tarea.realizada}">checked="checked"</c:if> disabled="disabled"/> </td>
                                <td> <c:out value="${tarea.titulo}" /> </td>
                                <td><a onclick="borrarTarea(${tarea.id_tarea})" ><img src="${recycler}" alt="Elimimar" height="16%"></a> <a href="list_tasks/edit/${tarea.id_tarea}"> <img src="${pencil}" height="26%" alt="Editar"></a>  </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>

                </div>

            </div>
            <!--/Form with header-->
        </div>
    </div>
</div>



<footer class="page-footer center-on-small-only">
    <div class="footer-copyright">
        <div class="container-fluid">
            Miguel Alejandro Castillo - 2017 </a>
    </div>
</div>

</footer>


</body>
        </html>

