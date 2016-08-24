<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>首页</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
</head>


<body>
<h1>欢迎来到笔记系统</h1>
<s:debug></s:debug>
<s:if test="#attr.name != null ">
    欢迎光临<s:property value="#attr.name"></s:property><br>
    <%--name${request.name}--%>
    <s:a action="">开始记</s:a>

</s:if>
<s:else>
    <s:a action="user/input">登陆</s:a>
    <s:a action="user/register">注册</s:a>
</s:else>

<h1 style="color: green"><s:text name="Struts 2 JSON Annotation example" /></h1>
<a href="/json/testjson.action">Click here to pull JASON data from server</a>
</body>
</html>
