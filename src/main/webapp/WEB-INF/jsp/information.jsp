<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath%>"/>
<head>
    <title>注册</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="shortcut icon" href="images/favicon.ico"/>
    <link href="style/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/jquery.i18n.properties-1.0.9.js"></script>
    <script type="text/javascript" src="js/jquery-ui-1.10.3.custom.js"></script>
    <script type="text/javascript" src="js/jquery.validate.js"></script>
    <script type="text/javascript" src="js/md5.js"></script>
    <script type="text/javascript" src="js/page_regist.js?lang=zh"></script>
</head>
<body class="loginbody">
<div class="dataEye">
    <div class="loginbox registbox">
        <div class="logo-a">

            <img src="images/logo-a.png">

        </div>
        <div class="login-content reg-content">
            <div class="loginbox-title">
                <h3>个人信息 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style="color:red">${mess}</span></h3>
            </div>
            <form id="signupForm" action="/log/updatInformation">
                <div class="login-error"></div>
                <div class="row">
                    <label class="field" for="name">姓名</label>
                    <input type="text" value="${user.name}" class="input-text-user noPic input-click" name="name"
                           id="name">
                </div>

                <div class="row">
                    <label class="field" for="gender">性别</label>
                    <input type="text" value="${user.gender}" class="input-text-user noPic input-click" name="gender"
                           id="gender">
                </div>
                <div class="row">
                    <label class="field" for="age">年龄</label>
                    <input type="text" value="${user.age}" class="input-text-user noPic input-click" name="age"
                           id="age">
                </div>
                <div class="row">
                    <label class="field" for="phonenumber">电话</label>
                    <input type="text" value="${user.phonenumber}" class="input-text-user noPic input-click"
                           name="phonenumber" id="phonenumber">
                </div>

                <div class="row btnArea">
                    <input class="login-btn" type="submit" id="submit" value="修改"/>
                </div>
            </form>
        </div>
        <div class="go-regist">
            <a href="/log/in" class="link">重新登录</a>
        </div>
    </div>


</div>
<div class="loading">
    <div class="mask">
        <div class="loading-img">
            <img src="images/loading.gif" width="31" height="31">
        </div>
    </div>
</div>
</body>
</html>