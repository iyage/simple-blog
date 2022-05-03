
<style>
    .nav-search-input {
  border: 1px solid white;
  border-radius: 10px;
  width: 100%;
  height: 30px;
  display: flex;
  align-items: center;
  padding: 3px;
  color: white;
}
.hamburger-menu{

  width: 0; 
  background-color:var(---primary);
  position: fixed;
  height:100vh ;
  top:70px;left: 0;
  z-index: 100000;
  overflow-x: hidden;
  overflow-y: scroll; 
}
::-webkit-scrollbar {
  width: 4px;
}
::-webkit-scrollbar-thumb {
  background-color: #535151;
  border-radius: 7px;
}
::-webkit-scrollbar-track {
  background-color: white;
}

#nav-search {
  width: 90%;
  border: none;
  height: 100%;
  background-color: transparent;
  padding: 0 10px;
}
#nav-search:focus {
  outline: none;
  background-color: transparent;
}
#nav-search-icon {
  color: white;
  cursor: pointer;
}
.nav-categorys {
  padding: 20px 0;
}
.nav-category {
  border: 0.3px solid #005c80;
  width: 100%;
  height: 30px;
  margin: 10px 0;
  color: #005c80;
  border-radius: 15px;
  display: flex;
  align-items: center;
  padding: 5px 10px;
  font-size: 20px;
  justify-content: space-between;
  background-color: white;
  /* box-shadow: 0px 0px 5px 0px rgba(0, 92, 128, 0.2); */
}
.minus-icon {
  font-size: 10px;
   cursor: pointer;
  display: none;
}
.plus-icon {
  font-size: 10px;
  cursor: pointer;
}

.nav-collapse {
  width: 20px;
  height: 20px;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  padding: 2px;
}
.nav-collapse:hover {
  background-color: #005c80;
  color: white;
}
.nav-subcategory {
  display: none;
}
.nav-btn {
  padding: 0.2em 1em;
  color:white;
  font-size: 18px;
  border-radius: 10px;
}
.nav-btn:hover {
  background-color: rgb(0, 92, 128, 0.1);
}
.nav-subcategory-container {
  width: 100%;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-around;
  padding: 10px;
}
.nav-subcategory-item {
  margin: 8px 2px;
  flex: 10%;
  flex-grow: 0;
}
</style>


<div class="hamburger-menu">
    <div style="padding: 20px 10px;">
    <div class="side-bar-container">
      <section class="nav-search-input">
          <input type="search" id="nav-search" placeholder="search....." />
          <i class="fa-solid fa-magnifying-glass" id="nav-search-icon"></i>
      </section>
      <section class="nav-categorys">
          <div class="nav-category">
              <div>General</div>
              <div class="nav-collapse">
        <span class="plus-icon" id="nav-show-general"
        ><i class="fa-solid fa-plus"></i
        ></span>
                  <span class="minus-icon" id="nav-hide-general"
                  ><i class="fa-solid fa-minus"></i
                  ></span>
              </div>
          </div>

          <div class="nav-subcategory" id="nav-general">
              <div class="nav-subcategory-container">
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Politics</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="" class="nav-btn">Romance</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Sports</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Real Estate</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Job</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">NYSC</a>
                  </div>
              </div>
          </div>
          <div class="nav-category">
              <div>Entertainment</div>
              <div class="nav-collapse">
        <span class="plus-icon" id="nav-show-entertainment"
        ><i class="fa-solid fa-plus"></i
        ></span>
                  <span class="minus-icon" id="nav-hide-entertainment">
          <i class="fa-solid fa-minus"></i
          ></span>
              </div>
          </div>
          <div class="nav-subcategory" id="nav-entertainment">
              <div class="nav-subcategory-container">
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Politics</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Politics</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Politics</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Politics</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Politics</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Politics</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="" class="nav-btn">Romance</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Sports</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Real Estate</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Job</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">NYSC</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Job</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">NYSC</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Job</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">NYSC</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Job</a>
                  </div>
                  <div class="nav-0subcategory-item">
                      <a href="#" class="nav-btn">NYSC</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">Job</a>
                  </div>
                  <div class="nav-subcategory-item">
                      <a href="#" class="nav-btn">NYSC</a>
                  </div>
              </div>
          </div>

          <div class="nav-category">
              <div>Science/Technology</div>
              <div class="nav-collapse">
        <span class="plus-icon" id="nav-show-science"
        ><i class="fa-solid fa-plus"></i
        ></span>
                  <span class="minus-icon" id="nav-hide-science">
          <i class="fa-solid fa-minus"></i
          ></span>
              </div>
          </div>
          <div class="nav-subcategory" id="nav-science">Science</div>
      </section>
  </div>
  <div  class="right-bar-wrapper" hidden style="text-align: center;">
    <div class="notification flex-item"><form action="/logout" method="post">
       
        <button type="submit" id="log-out" style="color: white; background-color: transparent;">logout</button>
    </form></div>
    </div>
</div>
</div>