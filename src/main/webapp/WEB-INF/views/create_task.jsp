<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Crear Tarea</title>
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
  <link href="${font_awesone_css}" rel="stylesheet"/>
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
    <div class="col" style="padding-top:10%; padding-bottom:5%;">
      <!--Form with header-->
      <div class="card centering text-center " style="width:32rem; ">

        <!--Header-->
        <div class="header pt-3 grey lighten-2">

          <div class="row d-flex justify-content-start">
            <h3 class="deep-grey-text mt-3 mb-4 pb-1 mx-5" style=" width:32rem;">Crear tarea</h3>
          </div>

        </div>
        <!--Header-->

        <div class="card-body mx-4 mt-4" style="text-align: left;">

          <!--Body-->
          <form:form id="taskForm" modelAttribute="tareaBean" action="create_task" method="post">
            <div class="md-form">
              Titulo
              <form:input path="titulo" name="titulo" id="Form-email4" />
                <form:errors path="titulo" cssClass="error"/></td>
            </div>
            <div class="md-form">
              Fecha de vencimiento
              <input type="date" name="fecha_vencimiento" />

            </div>
            <div class="md-form">
              Descripcion
              <form:textarea path="descripcion" name="descripcion" id="Form-email4" />
                <form:errors path="descripcion" cssClass="error"/></td>
            </div>



            <div class="text-center mb-4">
              <form:button id="tareaBean" name="tareaForm" class="btn btn-primary btn-block z-depth-2 waves-effect waves-light">Crear tarea</form:button>
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