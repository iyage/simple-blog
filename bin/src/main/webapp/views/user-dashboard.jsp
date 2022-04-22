<%@ page contentType="text/html;charset=UTF-8" language="java" %>
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>user-dashboard!!!!</title>
    <link rel="stylesheet" href="/commons/styles/style.css">
    <link rel="stylesheet" href="/commons/fonts/css/all.css" />
    <link rel="stylesheet" href="/commons/styles/user-dashboard.css">
  </head>
  <body>
     <jsp:include page="/commons/headers/header.jsp"/>
    <section class="cover-picture">
      <div class="cover-picture-section">
       <img src="resources/images/11.jpg" alt="" class="cover-image">
       <img src="resources/images/img.jpg" alt="" class="profile-image"> 
      </div>
      <div class="edit-profile">
        <span class="edit-profile-button">
          <span id="edit-icon" style="margin-right: 5px;"><i class="fa-solid fa-pencil"></i></span><span>Edit Profile</span>
        </span>
      </div>
      <div class="profile-edit-page">
       <div class="profile-edit-page-container">
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
             <div class="edit-section"><h4>Edit</h4></div>
           </div>
           <div class="content-to-edit">
             <div class="edit-content">
                  <img src="resources/images/img.jpg" alt="" class="profile-image-to-edit"> 
             </div>
           </div>
         </div>
         <div class="edit-profile-container">
          <div class="heading">
            <div class="section-to-edit"><h3>Edit cover Image</h3></div>
            <div class="edit-section"><h4>Edit</h4></div>
          </div>
          <div class="content-to-edit">
            <div class="edit-content">
                 <img src="resources/images/11.jpg" alt="" class="cover-image-to-edit"> 
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
      </section class="main-content">
      <div class="main-content-container">
        <div class="bio"></div>
      </div>
     
      <section>

      </section>
  </body>
