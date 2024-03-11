<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form modelAttribute="user" action="/printUser">

 name<form:input path="name"/><p></p>
  mail id <form:input path="email"/><p></p>
  gender <form:radiobuttons path="gender" items="${gender}"/><br>
  password <form:password path="password"/><p></p>
  Confirm password <form:password path="confirmPassword"/><p></p>
 choose your batches <form:checkboxes items="${batches}" path="batches"/><p></p><p></p><p></p>
 
 please select your courses<form:select path="courses"><p></p>
                      <form:option value="" label="Please Select" /><p></p>
                      <form:options items="${courses}" />
                       </form:select>
                       <br>
<input type="submit" value="Register">



</form:form>