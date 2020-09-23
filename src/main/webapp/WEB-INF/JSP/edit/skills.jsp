<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form"   	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="resume" 	tagdir="/WEB-INF/tags"%>

<label>
	<select name="category" class="form-control">
		<c:forEach var="category" items="${skillCategories}">
			<option value="${category.id}">${category.category}</option>
		</c:forEach>
	</select>
</label>