<%@ page contentType="text/html;charset=UTF-8" language="java" %>
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Frontpage!</title>
     <link rel="stylesheet" href="<%= request.getContextPath() %>/commons/styles/style.css" />
    <link rel="stylesheet" href="<%= request.getContextPath() %>/commons/fonts/css/all.css" />
    <link rel="stylesheet" href="<%= request.getContextPath() %>/commons/styles/post.css" />
  </head>
  <body>
    <jsp:include page="/commons/headers/loading.jsp"/>
  <jsp:include page="/commons/headers/header.jsp"/>
    <section class="post-container" style="margin-bottom: 50px;">
      <section class="post">
        <section class="author-profile">
          <div class="author-image">
            <a href="" id="author-image-container">
            
                <span
                ><img src="" class="author-pic" alt=""
              /></span>
              <h5 id="bloger-name"></h5>
        
            </a>
  
           
          </div>
          <div class="author-milage">
            <h5 style="padding: 5px">
              headliners:<span class="badges">30</span>
            </h5>
            <div style="padding: 5px">
              <h5>Total posts <span class="badges">100</span></h5>
            </div>
          </div>
        </section>
        <section class="author-post">
          <article id="post-body">
          </article>
        </section>
        <section class="comments-likes">
          <div class="like">
            <i class="fa-regular fa-thumbs-up icon-class" id="post-like"></i
            ><span id="like-counts">10</span>
          </div>
          <div class="comments-count">
            <i class="fa-regular fa-comment icon-class" id="post-comment"></i
            ><span id="comment-counts">10</span>
          </div>
        </section>
      </section>
      <section class="comments">
        <div class="comments-wraper">
          <div style="text-align: end">
            <i class="fa-solid fa-ellipsis-vertical edit icon-class"></i>
          </div>
          <h6 class="commenter-name">Bunmi Ofunrein</h6>
          <div class="comment-section">
            <img src="/resources/images/14.jpg " class="comment-author" alt="" />
            <div class="comment-content">
              we had with them and we are not going to rest until we get the
              last person of these hoodlums, because we cannot be watching
              anyone making life difficult for members of the public," the PPRO
              stated. “The Commissioner of Police has put all Area Commanders
              and all tactical team commanders on the red alert that they should
              go out and take the battle to the doorsteps of these hoodlums. We
              must fish them out one after the other. "Any house that is
              harbouring any of these criminals, the landlords of such houses
              will be seriously
            </div>
          </div>
          <section class="reply-likes">
            <div class="like">
              <i class="fa-regular fa-thumbs-up icon-class" id="comment-like"></i
              ><span id="comment-like-counts">10</span>
            </div>
            <div class="comments-count">
              <!-- <span class="icon-class" id="reply">reply</span> -->
            <span id="comment-comment-counts">10</span>
            </div>
          </section>
        </div>
      </section>
    </section>
    <script src="../commons/js/jquery.js"></script>
    <script>
      $(document).ready(()=>{
        setTimeout(()=>{
        $("#page-load").hide()
    },800)
        let data = {};
      query = window.location.search;
      urlParams = new URLSearchParams(query);
      console.log(urlParams.get("id"))
      id = urlParams.get("id");
      async function fetchPost(id){
         const resp = await fetch("/post",{
           method: "POST",
           headers:{
             "content-type":"x-wwww-form-urlencoded"
           },
           body:id
         })
         jsonResp = await resp.json();
         data=jsonResp;
         console.log(data);
         if(data.user!=="anonymousUser"){
          $("#login-wrapper").hide();  
        $("#right-bar-wrapper").show();
        $("#user-profile-image").attr("src",data.userDetails["profile_pics"])
        $("#user-profile-name").append(data.userDetails["firstName"]);
        $("#user-anchor-link").attr("href","<%= request.getContextPath() %>/views/user-dashboard.jsp?email="+data.userDetails["email"]);
             }
         $("#bloger-name").append(data.post["firstName"])
       $(".author-pic").attr("src",data.post["profilePics"]);
       $("#post-body").append(data.post["post"])
       $("#author-image-container").attr("href","<%= request.getContextPath() %>/views/user-dashboard.jsp?email="+data.post["email"])
      }
      fetchPost(id)
 

      })
      
    </script>
    <jsp:include page="/commons/footer/footer.jsp"/>
  </body>
