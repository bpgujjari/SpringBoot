<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<center>
<c:form method="post" action="register" modelAttribute="user">
Id        :<c:input path="id"/><br><br>
Name      :<c:input path="name"/><br><br>
password  :<c:password path="password"/><br><br>
Email     :<c:input path="email"/><br><br>
gender    :<c:radiobuttons path="gender" items="${genders}"/><br><br>
Country   :<c:input path="country"/><br><br>
<input type="submit" value="AddUser"><br><br>
</center>
</c:form>