<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>




user name==${users.name}<br>
user email==${users.email}<br>
gender==${users.gender}<br>

user courses==<c:forEach var="course" items="${users.courses}">
<c:out value="${course}"/>
</c:forEach> <br>

user batches ==<c:forEach var="batch" items="${users.batches}" >
<c:out value="${batch}"/>
</c:forEach><br>










</tr>

</table>






