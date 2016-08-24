<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>显示测试</title>
</head>
<body>
    UserEL:${requestScope.get("user")}<br>
    user OGNL : <s:property value="#attr.user"></s:property>

</body>
</html>
