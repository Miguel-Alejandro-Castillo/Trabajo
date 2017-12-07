<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
    <link href="${style_css}" rel="stylesheet"/>

    <!--<link href="${font_awesone_css}" rel="stylesheet"/> -->
    <link href="${bootstrap_css}" rel="stylesheet"/>
    <link href="${mdb_css}" rel="stylesheet"/>
    <script src="${jquery_js}"></script>
    <script src="${popper_js}"></script>
    <script src="${bootstrap_js}"></script>
    <script src="${mdb_js}"></script>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark fixed-top scrolling-navbar">
    <div class="container">
        <a class="navbar-brand" href="">TAREAS!</a>
    </div>
</nav>



<div class="container-fluid">
    <div class="row-fluid ">
        <div class="col ">
            <!--Form with header-->
            <div class="card centering text-center " style="width:32rem;">

                <!--Header-->
                <div class="header pt-3 grey lighten-2">

                    <div class="row d-flex justify-content-center">
                        <h3 class="deep-grey-text mt-3 mb-4 pb-1 mx-5">Iniciar sesion</h3>
                    </div>

                </div>
                <!--Header-->

                <div class="card-body mx-4 mt-4" style="text-align: left;">

                    <!--Body-->

                    <form:form id="loginForm" modelAttribute="loginBean" action="login" method="post">
                    <div class="md-form">
                        Usuario
                        <form:input path="usuario" name="usuario" id="Form-email4" />
                         <form:errors path="usuario" cssClass="error"/></td>
                    </div>

                    <div class="md-form ">
                        Contraseña
                        <form:password path="password" name="password" id="Form-pass4" />
                            <form:errors path="password" cssClass="error"/></td>

                    </div>

                    <div class="text-center mb-4">
                        <form:button id="loginBean" name="loginBean" class="btn btn-primary btn-block z-depth-2 waves-effect waves-light">Login</form:button>
                        <p style="font-style: italic; color: red;">${message}</p>
                    </div>
                    <div class="d-flex justify-content-center">
                        <a href="" class="font-small grey-text">¿Olvidaste la Contraseña?</a>
                        <a href="register" class="dark-grey-text font-bold ml-1"> Registrarse</a>
                    </div>
                    </form:form>
                </div>

            </div>
            <!--/Form with header-->
        </div>
    </div>
</div>
<!-- Form login -->
<!--Content-->

<!--/.Content-->

<footer class="page-footer center-on-small-only">
    <div class="footer-copyright">
        <div class="container-fluid">
            Miguel Alejandro Castillo - 2017 </a>
        </div>
    </div>

</footer>

</body>
</html>
