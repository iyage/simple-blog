<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>login!!</title>
    <link rel="stylesheet" href="commons/styles/style.css">
    <link rel="stylesheet" href="commons/fonts/css/all.css" />
    <link rel="stylesheet" href="commons/styles/login.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  
</head>
<body>
   <div class="login-container">
     <div class="form-container">
       <div id="error-pane" hidden>
         <p style="text-align: center; color: red;">Invalid username or password</p>

       </div>
       <form action="/login"  method="post">
        <div>
          <input name="username" type="email" placeholder="Email" class="form-input">
        </div>
        <div>
          <input type="password" name="password" id="" placeholder="password" class="form-input">
        </div>
        <div>
          <button type="submit" class="btn btn-large btn-primary" id="login-btn">Login</button>
        </div>
       </form>
       <hr>
       <button class="btn btn-large btn-secondary" id="create-acct-btn">Create an account</button>
     </div>
   </div>
   <div class="registration-container" hidden>
     <div style="text-align: end; padding: 10px;"><span id="close-button"><i class="fa-solid fa-times"></i></div>
    
    <div class="registration-form">
      <form action="">
        <div>
          <input type="text" placeholder="First Name" id="firstName" class="form-input">
        </div>
        <div>
          <input type="text" placeholder="Last Name" id="lastName" class="form-input">
        </div>
       <div>
         <input type="email" placeholder="Email" id="email" class="form-input">
       </div>
       <div>
        <input type="date" id="age" class="form-input">
      </div>
       <div>
         <input type="password" name="" id="password" placeholder="password" class="form-input">
       </div>
       <div>
         <button class="btn btn-large btn-primary" id="submit">Submit</button>
       </div>
      </form>
  </div>
   </div>
   <script src="commons/js/jquery.js"></script>
   <script>
   const query = window.location.search;
   const searchParams = new URLSearchParams(query);
let error = false;
   error = searchParams.get("error");
   console.log(error)
   if(error){
 $("#error-pane").show();
   }
     let url = "/register"
     $("#close-button").on("click",()=>{
      $(".registration-container").hide();
     })
     $("#create-acct-btn").on("click",()=>{
      $(".registration-container").fadeIn();
     })
     async function register (data){
       try{let resp =  await fetch(url,{
            method:"POST",
            headers:{
            "content-type":"application/json"
            },
            body:JSON.stringify(data)
          })
          let json = await resp.json();
        }catch(e){
          console.log(e);
        }
          
        }
     $("#submit").on("click",(e)=>{
       e.preventDefault();
       let data = {
        firstName :$("#firstName").val(),
        lastName :$("#lastName").val(),
        email:$("#email").val(),
        age: $("#age").val(),
        password:$("#password").val()
       }
       register(data)
     })
     
   </script>
</body>
</html>