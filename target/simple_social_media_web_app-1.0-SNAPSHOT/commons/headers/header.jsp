
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="/commons/styles/header-css.css" rel="stylesheet" >
<nav>
    <div class="container">
        <div class="wrapper1" hidden>
            
        </div>
        <div class="wrapper">
            <div class="left-nav-bar flex-items">
                <div class="brand flex-item"><a href="/frontpage">MyThought</a> </div>
            </div>
            <div class="right-nav-bar flex-items">
                <div class="notification flex-item"><i class="fa-solid fa-bell" id="notification-icon"></i><span id="notification-badge">2</span></div>
                <div class="profile flex-item" ><img src="" alt="profile image" id="user-profile-image"/><span id="profile-name"><span id="user-profile-name"></span><form action="/logout" method="post">
                    <input type="submit" value="logout">
                </form> </span></div>
            </div>


        </div>
    </div>
</nav>