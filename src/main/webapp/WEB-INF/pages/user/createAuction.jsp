<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Auction</title>
</head>
<body>
	<form:form modelAttribute="auction" method="POST" action="/user/saveAuction">
		<table>
			<tr>
				<td>Id :</td>
				<td><form:input path="id" /> <form:errors path="id"
						cssStyle="color : red;" /></td>
			</tr>
			<tr>
				<td>Title :</td>
				<td><form:input path="title" /> <form:errors path="title"
						cssStyle="color : red;" /></td>
			</tr>
			<tr>
				<td>Description :</td>
				<td><form:input path="description" /> <form:errors
						path="description" cssStyle="color : red;" /></td>
			</tr>
			<tr>
				<td>Specification :</td>
				<td><form:input path="specifications" /> <form:errors
						path="specifications" cssStyle="color : red;" /></td>
			</tr>
		 <tr>
				<td>ExpectedAmount :</td>
				<td><form:input path="minExpectedAmount" /> <form:errors
						path="minExpectedAmount" cssStyle="color : red;" /></td>
			</tr>
			<tr>
				<td>BidAmount :</td>
				<td><form:input path="maxBidAmount" /> <form:errors
						path="maxBidAmount" cssStyle="color : red;" /></td>
			</tr>
		 	<tr>
				<td>CreatedDate :</td>
				<td><form:input path="CreatedDate" /> <form:errors
						path="CreatedDate" cssStyle="color : red;" /></td>
			</tr>
			<tr>
				<td>EndDate :</td>
				<td><form:input path="endDate" /> <form:errors path="endDate"
						cssStyle="color : red;" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>