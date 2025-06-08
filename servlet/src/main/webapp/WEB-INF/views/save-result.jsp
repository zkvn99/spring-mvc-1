<%@ page import="hello.servlet.domain.member.Member" %><%--
  Created by IntelliJ IDEA.
  User: minwook
  Date: 2025/06/08
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
  <li>id=${member.id}</li>
  <li>username=<%=((Member)request.getAttribute("member")).getUsername()%></li>
  <li>age=<%=((Member)request.getAttribute("member")).getAge()%></li>
</ul>
</body>
</html>
