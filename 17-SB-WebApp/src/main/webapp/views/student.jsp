<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form modelAttribute="student" action="/printStudent">

Id<form:input path="sid"/><p></p>
 first name<form:input path="firstname"/><p></p>
last name<form:input path="lastname"/><p></p>
courses<form:select path="courses">
                      <form:option value="" label="Please Select" />
                      <form:options items="${courses}" />
                       </form:select>
                       <br>
gender <form:radiobuttons path="gender" items="${gender}"/><br>
mobile<form:input path="mobile"/><br>
java marks<form:input path="java"/><br>
hibernate marks<form:input path="hibernate"/><br>
springboot marks<form:input path="springboot"/><br>

<input type="submit" value="PrintStudent">



</form:form>