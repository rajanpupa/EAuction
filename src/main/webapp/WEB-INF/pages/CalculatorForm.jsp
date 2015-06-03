<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Add Product Form</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>

<div id="global">
<c:if test="${errors != null && errors.size()>0}">
     
     <p id="errors">
         Error(s)!
        <ul>
	        <c:forEach var="error" items="${errors}">
	            <li>${error}</li>
	        </c:forEach>
	    </ul>
 
     
 </c:if>
 
<form action="submit" method="post">
    <fieldset>
        <legend>Calculator</legend>
                <input type="text" id="x1" name="x1" value="${form.x1}"> + 
                <input type="text" id="y1" name="y1" value="${form.y1}"> =
                <input type="text" id="z1" name="z1" value="${form.z1}"> <br/>
                
                <input type="text" id="x1" name="x2" value="${form.x2}"> *
                <input type="text" id="y2" name="y2" value="${form.y2}"> =
                <input type="text" id="z2" name="z2" value="${form.z2}">
            </p>
            
            <input type="submit" value="submit" />
    </fieldset>
</form>
</div>
</body>
</html>
