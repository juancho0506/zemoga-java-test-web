<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome ${msg}</title>
		<!-- JQuery -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
		<!-- Handlebars -->
		<script src="<c:url value="/resources/js/external/handlebars-v4.0.2.js" />"></script>
		<!-- Bootstrap imports -->
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		
		<!-- Optional theme -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
		
		<!-- Latest compiled and minified JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	</head> 
	<body>
		<nav class="navbar navbar-inverse navbar-fixed-top">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="#">Zemoga Test</a>
	        </div>
	        <div id="navbar" class="collapse navbar-collapse">
	          <ul class="nav navbar-nav">
	            <li class="active"><a href="#">Home</a></li>
	          </ul>
	        </div><!--/.nav-collapse -->
	      </div>
    	</nav>
    	<br>
    	<br>
	    <div id="mainContainer" class="container">
	    	<div class="starter-template">
	    		<h1>Zemoga Test for Juan Rodrigo Torres Escobar</h1>
				<p class="lead">Type a Word in the input field to search a query.</p>
				<form id="queryForm" class="navbar-form navbar-left" role="search">
				  <div class="form-group">
				    <input id="inputQuery" type="text" class="form-control" placeholder="Search">
				  </div>
				  <button id="btnSearch" type="button" class="btn btn-default" onclick="renderTemplate('${ctx}');">Search</button>
				</form>	
	    	</div>
	    </div>
		
		<div id="resultsContainer" class="container">
			<jsp:include page="WEB-INF/view/searchResults.jsp"></jsp:include>
		</div>
	</body>
	<!-- Javascript del servicio AJAX -->
	<script src="<c:url value="/resources/js/main.js" />"></script>
</html>

