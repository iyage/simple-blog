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
      <jsp:include page="/commons/headers/nav-bar-menu.jsp"/>
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
            <span hidden id="post-like-container"><i class="fa-regular fa-thumbs-up icon-class" id="post-like" ></i
            ></span><span id="post-like-counts"></span>
          </div>
          <div class="comments-count">
            <i class="fa-regular fa-comment icon-class"></i
            ><span id="post-comment-counts"></span>
          </div>
        </section>
        <section class="comment" hidden>
          <div style="text-align: end; padding: 10px;">
            <a href="#" id="post-comment">post comment</a>
          </div>
          <div id="comment-area">
            <textarea name="" id="comment-body" cols="30" rows="5" style="width: 89%;  margin-bottom: 20px;"></textarea>
          </div>
         
        </section>
      </section>
      <div id="comments-container">
    </div>
    </section>
    <script src="<%= request.getContextPath() %>/commons/js/nav-bar-collapse.js"></script>
    <script src="../commons/js/jquery.js"></script>
    <jsp:include page="/commons/footer/footer.jsp"/>
 
    <script>
      // $(document).ready(()=>{
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
          $(".login-wrapper").hide();  
        $(".right-bar-wrapper").show();
        $("#user-profile-image").attr("src",data.userDetails["profile_pics"])
        $(".user-profile-name").append(data.userDetails["firstName"]);
        $(".user-anchor-link").attr("href","<%= request.getContextPath() %>/views/user-dashboard.jsp?email="+data.userDetails["email"]);
        $("#post-like-container").show();
        $(".comment").show();
             }
         $("#bloger-name").append(data.post["firstName"])
       $(".author-pic").attr("src",data.post["profilePics"]);
       $("#post-body").append(data.post["post"])
       $("#author-image-container").attr("href","<%= request.getContextPath() %>/views/user-dashboard.jsp?email="+data.post["email"])
       $("#post-comment-counts").append("  " + data.comments.length+ "  comments")
       $("#post-like-counts").append(" "+data.postLikesCounts+ "  likes")


         CreateComments(data)
      }
      fetchPost(id)
      async function postComment(newComment){
       
        let resp = await fetch("/post_comment",{
          method:"POST",
          headers:{
            "content-type":"application/json"
          },
          body:JSON.stringify(newComment)
        })
        const jsonResp = await resp.json();
        $("#comment-body").val("");
        $("#comments-container").empty();
        console.log(jsonResp)
          data["comments"].unshift(jsonResp);
          console.log(data["comments"])

          $("#post-comment-counts").empty();
          $("#post-comment-counts").append("  " + data.comments.length+ "  comments")
         CreateComments(data)
           
      }
      $("#post-comment").on("click",(e)=>{
       e.preventDefault();
       const dataToPost ={
         postId:data.post["id"],
         userId:data.userDetails["id"],
        comment:$("#comment-body").val()
       }
       if($("#comment-body").val()!=""){
       postComment(dataToPost)
       }

      })


      $("#post-like").on("click",()=>{
        const likeData = {
          postId:data.post["id"],
          userId:data.userDetails["id"]
        }
        countLikes(likeData);

      })
      async function countLikes(data){
        const resp = await fetch("/post_likes_count",{
          method:"POST",
          headers:{
            "content-type":"application/json"
          },
          body:JSON.stringify(data)
        })
        const jsonResp = await resp.json();
        console.log(jsonResp)
        $("#post-like-counts").text("");
        $("#post-like-counts").text("  "+jsonResp+" "+ "likes")
      }


      function CreateComments(data){
        for (let index = 0; index < data.comments.length; index++) {
         let comments =   $("<div>",{
           id:1,
           class:"comments",
         });
         let  comments_wraper =  $('<div>',{
             class:"comments-wraper",
           });
           let edit_section =$('<div>',{
             style:"text-align: end"
           });
        let edit_icon = $('<i>',{
             class:"fa-solid fa-ellipsis-vertical edit icon-class",
             id:"edit_icon"+index
           });
           let author_name =  $('<h6>',{
             class:"commenter-name",
             id: "commenter-name"+index,
             text: data.comments[index]["firstName"]
           });
           let comment_section = $('<div>',{
             class:"comment-section",
             id: "comment-section"+index,
           });

   let author_img = $('<img>',{
             class:"comment-author",
             id: "comment-author"+index,
             src: data.comments[index]["profilePics"]
           });
    let comment_content =  $('<div>',{
             class:"comment-content",
             id: "comment-content"+index,
             text: data.comments[index]["comment"]
           });
           edit_section.append(edit_icon)
           comments.append(edit_section)
           comments.append(author_name)
           comment_section .append(author_img);
           comment_section .append(comment_content);
           comments.append(comment_section)
           comments_wraper.append(comments)
           if(data.user!=data.comments[index]["email"]){
            edit_section.hide();
           }
  
           $("#comments-container").append(comments_wraper)
         
       }

      }

      // })
      
    </script>
  </body>
