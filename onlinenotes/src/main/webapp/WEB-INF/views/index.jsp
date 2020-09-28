<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Онлайн заметки</title>
</head>
<body>
<div align="center">
    <h2>Управление заметками</h2>
    <form method="get" action="search">
        <input type="text" name="keyword" />
        <input type="submit" value="Search" />
    </form>
    <h3><a href="/new">Новая заметка</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>Заголовок</th>
            <th>Заметка</th>
            <th>Действия</th>
        </tr>
        <c:forEach items="${noteList}" var="note">
            <tr>
                <td>${note.title}</td>
                <td>${note.body}</td>
                <td>
                    <a href="/edit?id=${note.id}">Edit</a>
                    <a href="/delete?id=${note.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
