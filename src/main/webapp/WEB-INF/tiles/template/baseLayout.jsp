<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title><tiles:insertAttribute name="title" /></title>
	<link rel="stylesheet" type="text/css" href="/public/style/main.css" />
	<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
</head>
<body>
	<div id="container">
		<div class="header">
			<h3 class="text-muted">EAuction</h3>
		</div>
		<div class="jumbotron">
			<h1>
				<tiles:insertAttribute name="heading" />
			</h1>
			<div>
				<tiles:insertAttribute name="headerOptions" />
			</div>
		</div>
		<div class="row">
			<tiles:insertAttribute name="body" />
		</div>
		<!-- FOOTER BASELAYOUT -->
		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div><!-- BASELAYOUT -->
</body>
</html>
