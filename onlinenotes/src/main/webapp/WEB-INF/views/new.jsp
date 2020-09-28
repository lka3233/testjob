<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Новая заметка</title>
</head>
<body>
<div align="center">
    <h2>Новая заметка</h2>
    <form:form action="save" method="post" modelAttribute="note">
        <table border="0" cellpadding="5">
            <tr>
                <td>Заголовок: </td>
                <td><form:input type="text" path="title" /></td>
            </tr>
            <tr>
                <td>Заметка: </td>
                <td><form:input type="text" path="body" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Сохранить"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>