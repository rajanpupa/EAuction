<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>

	<form:form modelAttribute="auction" method="POST" action="/user/saveAuction">
		<table>
			<tr>
				<td><spring:message code="label.Id" text="default text" /></td>
				<td><form:input path="id" /> <form:errors path="id"
						cssStyle="color : red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.title" text="default text" /></td>
				<td><form:input path="title" /> <form:errors path="title"
						cssStyle="color : red;" /></td>
			</tr>

			<tr>
			<td><spring:message code="label.Category" text="default text" /></td>
				<td><form:select id="category"  path="category.id">
						<c:forEach items="${categories}" var="category">
							<option value="${category.id }">${category.name }</option>
						</c:forEach>
					</form:select>
			</tr> 


			<tr>
				<td><spring:message code="label.Description"
						text="default text" /></td>
				<td><form:input path="description" /> <form:errors
						path="description" cssStyle="color : red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.Specification"
						text="default text" /></td>
				<td><form:input path="specifications" /> <form:errors
						path="specifications" cssStyle="color : red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.ExpectedAmount"
						text="default text" /></td>
				<td><form:input path="minExpectedAmount" /> <form:errors
						path="minExpectedAmount" cssStyle="color : red;" /></td>
			</tr>
			<tr>
				<td><spring:message code="label.BidAmount" text="default text" /></td>
				<td><form:input path="maxBid.bidAmount" /> <form:errors
						path="maxBid.bidAmount" cssStyle="color : red;" /></td>
			</tr>
			 <tr>
				<td><spring:message code="label.CreatedDate"
						text="default text" /></td>
				<td><form:input path="createdDate" /> <form:errors
						path="createdDate" cssStyle="color : red;" /></td>
			</tr>
			 <tr>
				<td><spring:message code="label.EndDate" text="default text" /></td>
				<td><form:input path="endDate" /> <form:errors path="endDate"
						cssStyle="color : red;" /></td>
			</tr> 
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>

		</table>
	</form:form>
