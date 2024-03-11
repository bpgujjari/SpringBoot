<%@ taglib uri="http://www.springframework.org/tags/form" prefix="i" %>
<body bgcolor="pink">
<center>

<i:form action="/edituser2" >
<i:hidden path="id"/>
NAME<i:input path="name"/><br><br>
PASSWORD:<i:input path="password"/><br><br>
EMAIL:<i:input path="email"/><br><br>
gender    :<i:radiobuttons path="gender" items="${genders}"/><br><br>
COUNTRY:<i:input path="country"/><br><br>

<input type="submit" value="EditAndSave">
</i:form>
</center>
</body>