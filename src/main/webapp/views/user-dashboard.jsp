<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
 <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>user-dashboard!!!!</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/commons/styles/style.css">
    <link rel="stylesheet" href="<%= request.getContextPath() %>/commons/fonts/css/all.css" />
    <link rel="stylesheet" href="<%= request.getContextPath() %>/commons/styles/user-dashboard.css">
  </head>
  <body>
    <jsp:include page="/commons/headers/loading.jsp"/>
     <jsp:include page="/commons/headers/header.jsp"/>
     <section style="margin-bottom: 50px;">
    <section class="cover-picture">
      <div class="cover-picture-section">
       <img src="" alt="" class="cover-image">
       <img src="" alt="" class="profile-image">
      </div>
      </section>
      <div class="edit-profile">
        <span class="edit-profile-button">
          <span id="edit-icon" style="margin-right: 5px;"><i class="fa-solid fa-pencil"></i></span><span>Edit Profile</span>
        </span>
      </div>
      <section class="bio">
        <div class="bio-container">
          <div>
            <div>user Name</div>
            <div>Bio</div>
          </div>
          <div></div>
        </div>
     
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
          </div>
        </div>

       </div>
      </div>
      <div class="main-content-container">
        <div class="bio"></div>
      </div>
     </section>
      <jsp:include page="/commons/footer/footer.jsp"/>
      <script src="<%= request.getContextPath() %>/commons/js/jquery.js"></script>
      <script>
     
     $(document).ready(()=>{
      let query = window.location.search;
let urlParams = new URLSearchParams(query);
let email = urlParams.get("email")
console.log(email)

      setTimeout(()=>{
        $("#page-load").hide()
    },800)
    $("#login-wrapper").hide();  
        let userData ={};
        let API_KEY = "";
        async function loadKey(){
          try{
            const resp = await fetch("/load_key",{
            method:"GET",
          })
        API_KEY= await resp.json();
          }
          catch(e){
           console.log(e)
          }
        }
        loadKey();
        
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
         if(userData.authentication!="anonymousUser"){
        $("#user-profile-image").attr("src",userData.logInUser["profile_pics"])
        $("#user-profile-name").append(userData.logInUser["firstName"]);
        $("#user-anchor-link").attr("href","<%= request.getContextPath() %>/views/user-dashboard.jsp?email="+userData.logInUser["email"]);
        $("#right-bar-wrapper").show();
        $("#login-wrapper").hide();  
         }else{
          $("#login-wrapper").show();  
         }
         if(userData.userDetails["email"]!=userData.authentication){
           $(".edit-profile-button").hide();
         }
         $(".profile-image").attr("src",userData.userDetails["profile_pics"])
        $(".profile-image-to-edit").attr("src",userData.userDetails["profile_pics"])
        $(".cover-image").attr("src",userData.userDetails["cover_pics"])
        $(".cover-image-to-edit").attr("src",userData.userDetails["cover_pics"])
  
  }
          catch(e){
           console.log(e)
          }
        }
        loadUserData();
        profileModal = document.getElementsByClassName("edit-profile-img-modal")
        covereModal = document.getElementsByClassName("edit-cover-img-modal")
        window.onclick = (e)=>{
         if(e.target== profileModal[0]){
       
            $(".edit-profile-img-modal").fadeOut(200)
         }
         if(e.target== covereModal[0]){
            $(".edit-cover-img-modal").fadeOut(200)
         }
        }
        $("#edit-profile-image").on("click",()=>{
          $(".edit-profile-img-modal").fadeIn(200)
        })
        $("#edit-cover-img").on("click",()=>{
          $(".edit-cover-img-modal").fadeIn(200)
        })
        let successMessage = "";
          let urlData ="";
        $(".edit-profile-button").on("click",()=>{
          $(".profile-edit-page").fadeIn();
        })
        $("#close-button").on("click",()=>{
          $(".profile-edit-page").fadeOut();
        })
        $("#upload-profile-img").on("click",(e)=>{
         e.preventDefault();
      
         let file = document.getElementById("profile-img-input").files;
         let  data = new FormData();
         data.append("file",file[0])
           data.append("api_key",API_KEY)
           data.append("timestamp",Date.now())
           data.append("upload_preset","v12frawa")
           data.append("folder","samples")
         uploadProfileImg(data);
        })
        $("#upload-cover-img").on("click",(e)=>{
         e.preventDefault();
         let file = document.getElementById("cover-img-input").files;
         let  data = new FormData();
         data.append("file",file[0])
           data.append("api_key",API_KEY)
           data.append("timestamp",Date.now())
           data.append("upload_preset","v12frawa")
           data.append("folder","samples")
           uploadCoverImg(data);
        })
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
           $("#user-profile-image").attr("src",urlData)
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
        async function uploadcoverImgToDb(data){
          console.log(data);
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
     })
      </script>
  </body>
