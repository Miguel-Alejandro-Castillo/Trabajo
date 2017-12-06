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
<div id="caja_logout">
    <% String Email = (String) session.getAttribute("Email"); %>
    <span > usuario: <%=Email%> <a href="logout" class="">Salir</a> </span>
</div>

<div class="container-fluid">
    <table>
        <tr>
            <th></th>
            <th>Titulo</th>
            <th></th>
        </tr>
        <c:forEach items="${tareas}" var="tarea"  >
            <tr>
                <td align="center"></td>
                <td><c:out value="${tarea.titulo}"/></td>
                <td>b</td>

            </tr>
        </c:forEach>
    </table>

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

