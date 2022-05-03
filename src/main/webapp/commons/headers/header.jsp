
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="<%= request.getContextPath() %>/commons/styles/header-css.css" rel="stylesheet" >
<nav>
    <div class="container">
        <div class="wrapper1" hidden>
            <div class="wrapper1-container">
                <i class="fa-solid fa-bars" id="menu-bar" style="font-size: 24px; color: var(---primary);"></i>
                <div class="brand"><a href="<%= request.getContextPath() %>/index.jsp">MyThought</a> </div>
                <div class="">
                    <div style="text-align: end;" class="login-wrapper">
                       <a href="<%= request.getContextPath() %>/login.jsp">Login</a>
                    </div>
                    <div  class="right-bar-wrapper" hidden>
                            <div class="profile flex-item" ><a href="" class="user-anchor-link"> <img src="" alt="profile image" class="user-profile-image"/></a></div>
                        
                    </div>
           
        </div>
            </div>
            </div>
        <div class="wrapper">
            <div class="left-nav-bar flex-items">
                <div class="brand flex-item"><a href="<%= request.getContextPath() %>/index.jsp">MyThought</a> </div>
            </div>
            <div class="flex-items">
                <div style="text-align: end;" class="login-wrapper">
                   <a href="<%= request.getContextPath() %>/login.jsp">Login</a>
                </div>
            <div  class="right-bar-wrapper" hidden>
                <div class="right-nav-bar ">
                    <div class="notification flex-item"><form action="/logout" method="post">
                       
                        <button type="submit" id="log-out">logout</button>
                    </form></div>
                    <div class="profile flex-item" ><a href="" class="user-anchor-link"> <img src="" alt="profile image" class="user-profile-image"/></a><span id="profile-name"><span class="user-profile-name"></span> </span></div>
                </div>
            </div>
        </div>
        </div>
    </div>
</nav>