<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<%= request.getContextPath() %>/commons/styles/index.css" />
<link rel="stylesheet" href="<%= request.getContextPath() %>/commons/styles/style.css">
<link rel="stylesheet" href= "<%= request.getContextPath() %>/commons/fonts/css/all.css" />
<link rel="stylesheet" href="<%= request.getContextPath() %>/commons/styles/pagination.css" />
</head>
<body>
    <jsp:include page="/commons/headers/loading.jsp"/>
<jsp:include page="/commons/headers/header.jsp"/>
<section class="index-container">
    <div class="index-wrapper">
        <div class="side-bar item">
            <div class="side-bar-container">
                <section class="search-input">
                    <input type="search" id="search" placeholder="search....." />
                    <i class="fa-solid fa-magnifying-glass" id="search-icon"></i>
                </section>
                <section class="categorys">
                    <div class="category">
                        <div>General</div>
                        <div class="collapse">
                  <span class="plus-icon" id="show-general"
                  ><i class="fa-solid fa-plus"></i
                  ></span>
                            <span class="minus-icon" id="hide-general"
                            ><i class="fa-solid fa-minus"></i
                            ></span>
                        </div>
                    </div>

                    <div class="subcategory" id="general">
                        <div class="subcategory-container">
                            <div class="subcategory-item">
                                <a href="#" class="btn">Politics</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="" class="btn">Romance</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">Sports</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">Real Estate</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">Job</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">NYSC</a>
                            </div>
                        </div>
                    </div>
                    <div class="category">
                        <div>Entertainment</div>
                        <div class="collapse">
                  <span class="plus-icon" id="show-entertainment"
                  ><i class="fa-solid fa-plus"></i
                  ></span>
                            <span class="minus-icon" id="hide-entertainment">
                    <i class="fa-solid fa-minus"></i
                    ></span>
                        </div>
                    </div>
                    <div class="subcategory" id="entertainment">
                        <div class="subcategory-container">
                            <div class="subcategory-item">
                                <a href="#" class="btn">Politics</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">Politics</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">Politics</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">Politics</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">Politics</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">Politics</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="" class="btn">Romance</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">Sports</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">Real Estate</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">Job</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">NYSC</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">Job</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">NYSC</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">Job</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">NYSC</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">Job</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">NYSC</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">Job</a>
                            </div>
                            <div class="subcategory-item">
                                <a href="#" class="btn">NYSC</a>
                            </div>
                        </div>
                    </div>

                    <div class="category">
                        <div>Science/Technology</div>
                        <div class="collapse">
                  <span class="plus-icon" id="show-science"
                  ><i class="fa-solid fa-plus"></i
                  ></span>
                            <span class="minus-icon" id="hide-science">
                    <i class="fa-solid fa-minus"></i
                    ></span>
                        </div>
                    </div>
                    <div class="subcategory" id="science">Science</div>
                </section>
            </div>
        </div>
        <div class="main-body item">
            <div class="main-body-container">
                <div id="data-container"></div>
                <div style="display: flex; justify-content: center; width: 70%;margin: auto;">
                    <div id="pagination-container"></div>
                </div>
            </div>
        </div>
    </div>
</section>
<script src="<%= request.getContextPath() %>/commons/js/jquery.js"></script>
<script src="<%= request.getContextPath() %>/commons/js/collapse.js"></script>
<script src="<%= request.getContextPath() %>/commons/js/pagination.js"></script>
<script>

  
    $(document).ready(()=>{

    setTimeout(()=>{
        $("#page-load").hide()
    },500)
        let data = {};
        async function loadUserData(){
            let userData ={};
          try{
            const resp = await fetch("/load_user_data",{
            method:"GET",
          })
             jsonResp = await resp.json();
             console.log(jsonResp);
             if(jsonResp!="anonymous user"){
                $("#right-bar-wrapper").show();
                $("#login-wrapper").hide();  
                 userData = jsonResp;
          userData = JSON.parse(userData);
          console.log(userData)
        $("#user-profile-image").attr("src",userData.profile_pics)
        $("#user-profile-name").append(userData.firstName);
        $("#user-anchor-link").attr("href","<%= request.getContextPath() %>/views/user-dashboard.jsp?email="+userData.email);
             }

       
          }
          catch(e){
           console.log(e)
          }
        }
        loadUserData();
        async function loadFrontPage(){
          try{
            const resp = await fetch("/fetch_front_page",{
            method:"GET",
          })
             jsonResp = await resp.json();
             data = jsonResp;
        function simpleTemplating(data) {
        var html = document.createElement("div");
        $.each(data, function (index, item) {
          var cont = document.createElement("div");
          var link = document.createElement("a");
          link.setAttribute("class","posts-link");
          link.setAttribute("href","/views/post.jsp?id="+item.id);
          cont.setAttribute("class", "headline");
          var author = document.createElement("div");
          author.setAttribute("class", "author");
          var image = document.createElement("img");
          image.setAttribute("src", item.profilePics);
          image.setAttribute("class", "author-image");
          var info = document.createElement("div");
          info.setAttribute("class", "author-info");
          var h4 = document.createElement("h4");
          var headline_container = document.createElement("div");
          headline_container.setAttribute("class", "headline-container");
          var headline_content = document.createElement("p");
          var comments_container = document.createElement("div");
          comments_container.setAttribute("class", "coments-likes-counts");
          var like = document.createElement("p");
          like.setAttribute("class", "likes-count coments-likes-counts-items");
          var comment = document.createElement("p");
          comment.setAttribute(
            "class",
            "comments-counts coments-likes-counts-items"
          );
          like.innerHTML = 20 + "  likes";
          comment.innerHTML = 20 + " comments";
          comments_container.append(like);
          comments_container.append(comment);
          headline_content.innerHTML = item.headLine;
          headline_content.setAttribute("class", "headline-content");
          headline_container.append(headline_content);
          headline_container.append(comments_container);
          cont.append(headline_container);
          h4.innerHTML = item.firstName;
          info.append(h4);
          author.append(image);
          author.append(info);
          cont.append(author);
          link.append(cont)
          html.append(link);
        });
        return html;
      }
      $("#pagination-container").pagination({
        dataSource: data,
        pageSize: 6,
        className: "paginationjs-theme-blue paginationjs-small",
        ulClassName: "paginate",
        activeClassName: "active",
        disableClassName: "not-selected",
        callback: function (data, pagination) {
          var html = simpleTemplating(data);
          $("#data-container").html(html);
        },
      });
          }
          catch(e){
           console.log(e)
          }
        }
        loadFrontPage();

    })
        
    </script>
<jsp:include page="/commons/footer/footer.jsp"/>
</body>
</html>
