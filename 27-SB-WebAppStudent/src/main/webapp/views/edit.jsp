<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<center>
<c:form method="post" action="/edit1">
      :<c:hidden path="id"/><br><br>
Student  Full Name      :<c:input path="name"/><br><br>
sub1             		  :<c:input path="sub1"/><br><br>
sub2            		   :<c:input path="sub2"/><br><br>
sub3						 :<c:input path="sub3"/><br><br>

<input type="submit" value="AddStudent"><br><br>
</center>
</c:form>