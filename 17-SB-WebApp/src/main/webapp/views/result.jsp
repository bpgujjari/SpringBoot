<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>




student id==${student.sid}<br>
student fullname==${fullname}<br>
student courses==<c:forEach var="course" items="${student.courses}">
<c:out value="${course}"/>
</c:forEach> <br>
student gender==${student.gender}<br>
student java marks==${student.java}<br>
student hibernate marks==${student.hibernate}<br>
student spring boot marks=${student.springboot}<br>
student total marks==${total}<br>
student percentage==${percentage}<br>
student overall grade==${grade}








</tr>

</table>






