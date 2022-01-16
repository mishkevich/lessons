<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>

<h2>Dear Employee, Please enter your details</h2>

<br>
<br>

<form:form action="showDetails" method ="get" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>

    Surname <form:input path="surname" />
    <form:errors path="surname"/>
    <br><br>

    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>

    Department <form:select path="department">

    <form:option value="Information Technology" label="IT" />
    <form:option value="Sales" label="Sales" />
    <form:option value="Human Resources" label="HR" />

    </form:select>
    <br><br>

    Which car do you want?<br>
    BMW <form:radiobutton path="carBrand" value="BMW"/><br>
    MB <form:radiobutton path="carBrand" value="Mercedes"/><br>
    Audi <form:radiobutton path="carBrand" value="Audi"/><br>

    Foreign language(s):<br>
    EN <form:checkbox path="languages" value="English"/>
    FR <form:checkbox path="languages" value="French"/>
    DE <form:checkbox path="languages" value="Deutsch"/>
    <br><br>

    Email <form:input path="email"/>
    <form:errors path="email" />
    <br><br>

    <input type="submit" value="OK"/>
</form:form>


</body>
</html>
