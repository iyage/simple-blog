<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
 <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>user-dashboard!!!!</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/commons/styles/style.css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/commons/fonts/css/all.css" />
    <link rel="stylesheet" href="<%= request.getContextPath() %>/commons/styles/user-dashboard.css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/commons/trix/trix.css">
     <script src="<%= request.getContextPath() %>/commons/trix/trix.js"></script>
     <script src="<%= request.getContextPath() %>/commons/js/jquery.js"></script>
  </head>
  <body>
    <jsp:include page="/commons/headers/loading.jsp"/>
     <jsp:include page="/commons/headers/header.jsp"/>
     <section>
       <div class="profile-cover-container">
    <section class="cover-picture">
      <div class="cover-picture-section">
       <img src="" alt="" class="cover-image">
       <img src="" alt="" class="profile-image">
      </div>
      </section>
      <div class="edit-profile">
        <span class="edit-profile-button" hidden>
          <span id="edit-icon" style="margin-right: 5px;"><i class="fa-solid fa-pencil"></i></span><span>Edit Profile</span>
        </span>
      </div>
    </div>
  <section class="main-body-container">
    <jsp:include page="/commons/headers/nav-bar-menu.jsp"/>
        
      <section class="bio">
        <div class="bio-container">
          <div class="bio-wrapper">
            <div style="text-align: center;"><h3 id="user-name"></h3></div>
            <div style="text-align: center;">I am who i am by the grace of God</div>
          </div>
        </div>
      </section>

      <section class="create-blog-body" hidden>
        <section class="section">
         <select name="" id="category" style="width: 100%;margin-bottom:15px; border-radius: 6px;height: 50px; text-align: center;">
           <option value="" disabled selected>Pick a category</option>
           <option value="Romance">Romance</option>
         </select>
          </section>
        <section class="headline">
        <textarea type="text" name="headline" id="headline" style="width: 100%;margin-bottom:15px; border-radius: 6px;height: 50px; word-wrap: break-word;" placeholder="HEADLINE........................!!!!!!!!"></textarea>

        </section>
        <div class="create-blog-container">
          <form method="post">
            <div style="background-color: white; border-radius: 8px;padding: 10px;">
            <input id="x" type="hidden" name="content" value="" />
            <trix-editor input="x" id="textInput"></trix-editor>
            <div style="text-align: end; margin: 10px 0; padding: 10px;"> <input type="button" name="submit" value="Submit" id="submit-post"/></div>
           
          </div>
        </form>
        </div>
      </section>
      <section class="author-post" style="margin:30px 0;">
      </section>
  </section>

      <div class="profile-edit-page" hidden>
     
       <div class="profile-edit-page-container">
         <div class="edit-profile-img-modal" hidden>
          <div class="uploaad-profile-img">
            <div class="uploaad-profile-img-container">
               <input type="file" name=""  accept="image/png, image/jpeg" id="profile-img-input"> <input type="submit" value="upload" id="upload-profile-img">
            </div>
          </div>
         </div>
         <div class="edit-cover-img-modal" hidden>
          <div class="uploaad-cover-img" >
            <div class="uploaad-cover-img-container">
               <input type="file" name=""  accept="image/png, image/jpeg" id="cover-img-input"> <input type="submit" value="upload" id="upload-cover-img">
            </div>
          </div>
         </div>


         <div class="edit-profile-pagetile">
           <div class="title-content">
             Edit Profile
           </div>
         <div class="close-button"><span id="close-button"><i class="fa-solid fa-times"></i></span></div>
         </div>
         <hr>
         <br>
         <div class="edit-profile-container">
           <div class="heading">
             <div class="section-to-edit"><h3>Edit profile Image</h3></div>
             <div class="edit-section"><h4 id="edit-profile-image">Edit</h4></div>
           </div>
           <div class="content-to-edit">
             <div class="edit-content">
                  <img src="" alt="" class="profile-image-to-edit">
             </div>
           </div>
         </div>
         <div class="edit-profile-container">
          <div class="heading">
            <div class="section-to-edit"><h3>Edit cover Image</h3></div>
            <div class="edit-section"><h4 id="edit-cover-img">Edit</h4></div>
          </div>
          <div class="content-to-edit">
            <div class="edit-content">
                 <img src="" alt="" class="cover-image-to-edit">
            </div>
          </div>
        </div>
        <div class="edit-profile-container">
          <div class="heading">
            <div class="section-to-edit"><h3>Bio</h3></div>
            <div class="edit-section"><h4>Add</h4></div>
          </div>
          <div class="content-to-edit">
            <div class="edit-content">
                <span>Describe yourself</span>
            </div>
            <div class="main-content-container">
              <div>Bio</div>
            </div>
          </div>
        </div>


       </div>
      </div>
    
     </section>
     <script src="<%= request.getContextPath() %>/commons/js/nav-bar-collapse.js"></script>
      <jsp:include page="/commons/footer/footer.jsp"/>
      <script>
        setTimeout(()=>{
       $("#page-load").hide()
   },800)
let query = window.location.search;
let urlParams = new URLSearchParams(query);
let email = urlParams.get("email")
let urlData ="";
let API_KEY = "";
let userData ={};
profileModal = document.getElementsByClassName("edit-profile-img-modal")
covereModal = document.getElementsByClassName("edit-cover-img-modal")

   $(".login-wrapper").hide();  
   $("#edit-profile-image").on("click",()=>{
         $(".edit-profile-img-modal").fadeIn(200)
       })
       $("#edit-cover-img").on("click",()=>{
         $(".edit-cover-img-modal").fadeIn(200)
       })
       //load data from db
       loadUserData();


       window.onclick = (e)=>{
      
        if(e.target== profileModal[0]){
      
           $(".edit-profile-img-modal").fadeOut(200)
        }
        if(e.target== covereModal[0]){
           $(".edit-cover-img-modal").fadeOut(200)
        }
       }
       $(".edit-profile-button").on("click",()=>{
         $(".profile-edit-page").fadeIn();
       })
       $("#close-button").on("click",()=>{
         $(".profile-edit-page").fadeOut();
       })

       $("#upload-profile-img").on("click",(e)=>{
        e.preventDefault();
         formData("profile-img-input")
       })

       $("#upload-cover-img").on("click",(e)=>{
        e.preventDefault();
        formData("cover-img-input")

       })

$("#submit-post").on("click",(e)=>{
 let x = document.getElementById("x");
 let textInput = document.getElementById("textInput")
 e.preventDefault();
 if(((x.value!="") ) && (userData.userDetails["email"]==userData.authentication)){
   const data = {
     userId:userData.userDetails["id"],
     post:$("#x").val(),
     headLine: $("#headline").val(),
     category: $("#category").val()
   }
   createPost(data)
   textInput.value="";
 }

})

async function createPost(data){
  try{
 const resp = await fetch("/create_post",{
   method:"POST",
   headers:{
     "content-type":"application/json"
   },
   body:JSON.stringify(data)
 })
 const jsonResp = await resp;
 console.log(jsonResp)
  }catch{
    console.log(e);
  }

}

function formData(elem){
  let file = document.getElementById(elem).files;
        let  data = new FormData();
        data.append("file",file[0])
          data.append("api_key",API_KEY)
          data.append("timestamp",Date.now())
          data.append("upload_preset","v12frawa")
          data.append("folder","samples")
          if(elem=="profile-img-input"){
            uploadProfileImg(data)
          }else{
            uploadCoverImg(data);
          }
         
}



async function loadUserData(){
         try{
           const resp = await fetch("/load_user_by_email",{
           method:"POST",
           headers:{
             "content-type":"www-x-form-urlencoded"
           },
           body:email,
         })
         userData = await resp.json();
        console.log(userData)
        API_KEY = userData.api_KEY;
        console.log(userData.userDetails["firstName"])
        $("#user-name").append(userData.userDetails["firstName"])
        if(userData.authentication!="anonymousUser"){
       $(".user-profile-image").attr("src",userData.logInUser["profile_pics"])
       $(".user-profile-name").append(userData.logInUser["firstName"]);
       $(".user-anchor-link").attr("href","<%= request.getContextPath() %>/views/user-dashboard.jsp?email="+userData.logInUser["email"]);
       $(".right-bar-wrapper").show();
       $(".login-wrapper").hide();
        }else{
         $(".login-wrapper").show();  
        }
        if(userData.userDetails["email"]==userData.authentication){
      $(".create-blog-body").show();
     $(".edit-profile-button").show();
  
         }

        $(".profile-image").attr("src",userData.userDetails["profile_pics"])
       $(".profile-image-to-edit").attr("src",userData.userDetails["profile_pics"])
       $(".cover-image").attr("src",userData.userDetails["cover_pics"])
       $(".cover-image-to-edit").attr("src",userData.userDetails["cover_pics"]);
       LoadAndCrsteUserPosts(userData)    
 }
 catch(e){
          console.log(e)
         }
       }

async function uploadProfileImgToDb(data){
         console.log(data);
          const resp = await fetch("/upload_profile",{
            method:"POST",
            headers:{
             "content-type":"application/json"
            },
            body:JSON.stringify(data)
          });
          const jsonResp2 = await resp.json();
          console.log(jsonResp2);
           if(jsonResp2=="upload successfull"){
             $(".edit-profile-img-modal").fadeOut(200)
           }
       }
async function uploadProfileImg(data){
         const resp = await fetch("https://api.cloudinary.com/v1_1/yage/upload",{
           method:"POST",
           body:data
         })
         const jsonResp = await resp.json();
        urlData = (jsonResp.url)
        if(urlData!=undefined){
          $(".profile-image").attr("src",urlData)
          $(".profile-image-to-edit").attr("src",urlData)
          $(".user-profile-image").attr("src",urlData)
         data= {
         profileImageUrl:urlData
         }
         uploadProfileImgToDb(data);
        }
       }
       async function uploadCoverImg(data){
         const resp = await fetch("https://api.cloudinary.com/v1_1/yage/upload",{
           method:"POST",
           body:data
         })
         const jsonResp = await resp.json();
        urlData = (jsonResp.url)
        if(urlData!=undefined){
          $(".cover-image").attr("src",urlData)
          $(".cover-image-to-edit").attr("src",urlData)
         data= {
           coverImageUrl:urlData
         }
         uploadcoverImgToDb(data);
        }
       }
 async function uploadcoverImgToDb(data){
          const resp = await fetch("/upload_cover",{
            method:"POST",
            headers:{
             "content-type":"application/json"
            },
            body:JSON.stringify(data)
          });
          const jsonResp2 = await resp.json();
          console.log(jsonResp2);
           if(jsonResp2=="upload successfull"){
             $(".edit-cover-img-modal").fadeOut(200)
           }
       }
       function LoadAndCrsteUserPosts(userData){
         let toolbarCounter = 2;
   for (let index = 0; index < userData.userPost.length; index++) {
     let posts_container  =  document.createElement("div");
     posts_container.setAttribute("class","post-body")
     posts_container.setAttribute("posistion","relative")
     let post_cover =  document.createElement("div");
     post_cover.setAttribute("class","post-cover")
     post_cover.setAttribute("id","post-cover"+index)
     posts_container.setAttribute("posistion","relative")

     let post_body =  document.createElement("trix-editor");
      post_body.setAttribute("id","post-body"+index)
      post_body.setAttribute("input","x"+index)
      post_body.setAttribute("disabled", true)
      post_body.style.wordBreak="break-all"
      post_body.style.wordWrap="break-word"
      post_body.style.pointerEvents= false
      post_body.contentEditable = false
      let input =  document.createElement("input");
     input.setAttribute("id","x"+index)
     input.setAttribute("type","hidden")
     posts_container.append(input);
     posts_container.append(post_body);
     input.value=userData.userPost[index]["post"];
     $(".author-post").append(posts_container);

            document.querySelector("figcaption").style.display= "none";
 
             let arr =[];
             for(y=0;y<userData.allComments.length;y++){
               if(userData.allComments[y]["postId"]==userData.userPost[index]["id"]){
                 arr.push(userData.allComments[y])
               }
             }
             let comments =   $("<div>",{
          id:1,
          class:"comments",
        });
        let comments_likes =  $('<div>',{
            class:"comments-likes",
          });
          like =  $('<div>',{
            class:"like",
          });
          let post_like_container =  $('<span>',{
           id:"post-like-container"+index
          });

       let post_like = $('<i>',{
            class:"fa-regular fa-thumbs-up icon-class",
           id:"post-like"+index
          });
        let   post_like_counts =$('<span>',{
               id:"post-like-counts"+index,
               text:"  "+30 +"  likes"
             })
          
          let comments_count=$('<section>',{
               class:"comments-count"
             })

             let show_comment =$('<i>',{
               class:"fa-regular fa-comment icon-class",
               id:"show_comment "+index
             })

            let  post_comment_counts =$('<span>',{
               id:"post-comment-counts"+index,
               text:"  " +arr.length+"  coments"
             })

             post_like_container .append(post_like)
             like.append(post_like_container );
             like.append(post_like_counts)
             comments_likes.append(like)
             comments_count.append(show_comment)
             comments_count.append(post_comment_counts)
             comments_likes.append(comments_count)
             $(".author-post").append(comments_likes)
   
       }

     for (let index = 0; index < userData.userPost.length; index++) {
      let toolbar = document.getElementById("trix-toolbar-"+(toolbarCounter))
      toolbar.style.display="none"
      console.log(toolbarCounter)
      toolbarCounter++;
      
    }
   

  }

  (function() {
   var HOST = "https://api.cloudinary.com/v1_1/yage/upload"
       
   addEventListener("trix-attachment-add", function(event) {
       if (event.attachment.file) {
           uploadFileAttachment(event.attachment)
       }
   })
 
   function uploadFileAttachment(attachment) {
       uploadFile(attachment.file, setProgress, setAttributes)
 
       function setProgress(progress) {
           attachment.setUploadProgress(progress)
       }
 
       function setAttributes(attributes) {
         console.log(attributes)
           attachment.setAttributes(attributes)
       }
   }
 
   function uploadFile(file, progressCallback, successCallback) {
       var formData = createFormData(file)
       var xhr = new XMLHttpRequest()
 
       xhr.open("POST", HOST, true)
 
       xhr.upload.addEventListener("progress", function(event) {
           var progress = event.loaded / event.total * 100
           progressCallback(progress)
       })
 
       xhr.addEventListener("load", function(event) {
       
         let jsonData =JSON.parse(xhr.responseText);
           var attributes = {
               url: jsonData.url,
               href:jsonData.url + "?content-disposition=attachment"
           }
           successCallback(attributes)
       })
 
       xhr.send(formData)
   }
 
   function createFormData(file) {
       var data = new FormData()
       data.append("file", file)
       data.append("api_key",API_KEY)
       data.append("timestamp",Date.now())
       data.append("upload_preset","v12frawa")
       data.append("folder","samples")
       return data
   }
})();








     </script>

  </body>
