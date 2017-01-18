<%@ page import="com.Test" %>
<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<a href="abc">abc</a>
<hr>
<a href="user.action">user.action</a>
<hr>
<c:forEach begin="1" end="10" var="i">
    <h2>Hello World!</h2>
</c:forEach>
<hr>
<%=new Test().getPf(3)%>
</body>
</html>
