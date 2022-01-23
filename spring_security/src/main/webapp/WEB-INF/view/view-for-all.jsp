<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<body>

<h2>Info for all employees</h2>
<br><br>
<security:authorize access="hasRole('HR')">

Only for HR staff
<input type="button" value="Salary" onclick="window.location.href = 'hr-info'"/><br><br>

</security:authorize>

<security:authorize access="hasRole('MANAGER')">
Only for Manager staff
<input type="button" value="Performance" onclick="window.location.href = 'manager-info'"/><br>
</security:authorize>
</body>
</html>
