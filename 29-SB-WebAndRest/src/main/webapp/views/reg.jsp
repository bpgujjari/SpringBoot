<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<center>
<c:form method="post" action="/register" modelAttribute="emp">
EMP ID             :<c:input path="id"/><br><br>
EMP Name     		 :<c:input path="name"/><br><br>
DESIGNATION          :<c:select path="desg">
						<c:option value=" " label="please select"/>
						<c:options items="${desg}"/>
						</c:select><br><br>
						
SALARY 				: <c:input path="salary"/>	<br><br>
EMAIL 				:<c:input path="email"/><br><br>	
MOBILE				:<c:input path="mobile"/><br><br>
QUALIFICATION		:	<c:select path="qual">
						<c:option value=" " label="please select"/>
						<c:options items="${qual}"/>
						</c:select><br><br>   						
MANAGER			   :<c:input path="manager"/><br><br>						
<input type="submit" value="REGISTER EMPLOYEE"><br><br>
</center>
</c:form>