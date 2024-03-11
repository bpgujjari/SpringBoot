<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<center>

<table border="1" cellspacing="1" cellpadding="9">

<tr>
<th>ID</th>
<th>NAME</th>
<th>PASSWORD</th>
<th>EMAIL</th>
<th>GENDER</th>
<th>COUNTRY</th>
<th>EDIT</th>
<th>DELETE</th>


</tr>

<c:forEach var="user" items="${users}">
<tr>
<td>${user.id}</td>
<td>${user.name}</td>
<td>${user.password}</td>
<td>${user.email}</td>
<td>${user.gender}</td>
<td>${user.country}</td>

<td><a href="/edit/${user.id}">edit</a></td>
<td><a href="/delete/${user.id}">delete</a></td>
</tr>
</c:forEach>



</table>


</center>