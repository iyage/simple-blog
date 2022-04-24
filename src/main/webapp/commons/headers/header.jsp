
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="<%= request.getContextPath() %>/commons/styles/header-css.css" rel="stylesheet" >
<nav>
    <div class="container">
        <div class="wrapper1" hidden>
        </div>
        <div class="wrapper">
            <div class="left-nav-bar flex-items">
                <div class="brand flex-item"><a href="<%= request.getContextPath() %>/index.jsp">MyThought</a> </div>
            </div>
            <div class="flex-items">
                <div style="text-align: end;" id="login-wrapper">
                   <a href="<%= request.getContextPath() %>/login.jsp">Login</a>
                </div>
            <div  id="right-bar-wrapper" hidden>
                <div class="right-nav-bar ">
                    <div class="notification flex-item"><form action="/logout" method="post">
                       
                        <button type="submit" id="log-out">logout</button>
                    </form></div>
                    <div class="profile flex-item" ><a href="" id="user-anchor-link"> <img src="" alt="profile image" id="user-profile-image"/></a><span id="profile-name"><span id="user-profile-name"></span> </span></div>
                </div>
            </div>
        </div>
        </div>
    </div>
</nav>