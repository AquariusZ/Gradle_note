<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <title></title>
</head>
<body>
<div>

    <s:debug/>
    <div>
        <s:form action="/user/login.action" method="POST" validate="true">
            <s:label value="登陆"></s:label>
            <h3><s:actionerror/></h3>
            <s:textfield name="account"  label="账号"></s:textfield>
            <h3><s:actionerror/></h3>
            <s:password name="passwd" label="密码"></s:password>
            <s:token/>
            <s:submit value="登陆"></s:submit>
        </s:form>
    </div>
</div>
</body>
</html>
