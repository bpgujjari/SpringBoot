<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form modelAttribute="employee" action="/printEmployee">

Employee No<form:input path="empid"/><br>
Employee Name<form:input path="empname"/><br>
Employee Salary<form:input path="salary"/><br>


<input type="submit" value="printInvoice">



</form:form>