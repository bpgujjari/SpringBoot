<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<center>

<table border="1" cellspacing="1" cellpadding="9">

<tr>
<th>STUDENT ID</th>
<th>STUDENT NAME</th>
<th>STUDENT SUB1</th>
<th>STUDENT SUB2</th>
<th>STUDENT SUB3</th>
<th>STUDENT TOTAL</th>
<th>STUDENT PERCENTAGE</th>
<th>STUDENT GRADE</th>
<th>EDIT</th><th>DELETE</th>	



</tr>

<c:forEach var="student" items="${students}">
<tr>
<td>${student.id}</td>
<td>${student.name}</td>
<td>${student.sub1}</td>
<td>${student.sub2}</td>
<td>${student.sub3}</td>
<td>${student.total}</td>
<td>${student.percentage}</td>
<td>${student.grade}</td>
<td><a href="/edit/${student.id}">edit</a></td>
<td><a href="/delete/${student.id}">delete</a></td>
</tr>
</c:forEach>
</table>
<a href="/addstudent">Add student</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


</center>