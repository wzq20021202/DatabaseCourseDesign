<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en" class="no-js"> <!--<![endif]-->
<head>
    <base href="<%=basePath%>"/>
    <meta charset="UTF-8"/>
    <title>登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Login and Registration Form with HTML5 and CSS3"/>
    <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class"/>
    <meta name="author" content="Codrops"/>
    <link rel="shortcut icon" href="../favicon.ico">
    <link rel="stylesheet" type="text/css" href="css/demo.css"/>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <link rel="stylesheet" type="text/css" href="css/animate-custom.css"/>
    <script type="text/javascript" src="js/login.js"></script>
</head>
<body>
<div class="container">
    <!-- Codrops top bar -->

    <header>
        <h1>仓库管理系统 <span>登录页面</span></h1>
    </header>
    <section>
        <div id="container_demo">
            <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
            <a class="hiddenanchor" id="toregister"></a>
            <a class="hiddenanchor" id="tologin"></a>
            <div id="wrapper">
                <div id="login" class="animate form">
                    <form action="/managerlogin" method="post">
                        <h1>Log in</h1>
                        <p>
                            <label for="username" class="uname" data-icon="u"> Your username &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span
                                    style="color: red">${msg}</span></label>
                            <input id="username" name="username" required="required" type="text"/>
                        </p>
                        <p>
                            <label for="password" class="youpasswd" data-icon="p"> Your password </label>
                            <input id="password" name="password" required="required" type="password"/>
                        </p>
                        <p>
                            <%--<input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" /> --%>
                            <%--Keep me logged in--%>
                            <input type="radio" name="user" id="loginkeeping" value="manager"/>
                            manager
                            <input type="radio" name="user" id="loginkeeping" value="employee"/>
                            employee

                        </p>
                        <p class="login button">
                            <input type="submit" value="Login"/>
                        </p>

                    </form>
                </div>
            </div>
        </div>
    </section>
</div>

</body>

</html>