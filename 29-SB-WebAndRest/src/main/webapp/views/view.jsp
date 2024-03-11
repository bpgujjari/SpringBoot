<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<center>

<table border="1" cellspacing="1" cellpadding="9">

<tr>
<th>EMPLOYEE ID</th>
<th>EMPLOYEE NAME</th>
<th>EMPLOYEE DESIGNATION </th>
<th>EMPLOYEE SALARY</th>
<th>EMPLOYEE EMAIL</th>
<th>EMPLOYEE MOBILE</th>
<th>EMPLOYEE QUALIFICATION</th>
<th>EMPLOYEE MANAGER</th>
<th>EDIT</th><th>DELETE</th>	



</tr>

<c:forEach var="employee" items="${employees}">
<tr>
<td>${employee.id}</td>
<td>${employee.name}</td>
<td>${employee.desg}</td>
<td>${employee.salary}</td>
<td>${employee.email}</td>
<td>${employee.mobile}</td>
<td>${employee.qual}</td>
<td>${employee.manager}</td>
<td><a href="/editEmp/${employee.id}">edit</a></td>
<td><a href="/delete/${employee.id}">delete</a></td>
</tr>
</c:forEach>
</table>


</center>