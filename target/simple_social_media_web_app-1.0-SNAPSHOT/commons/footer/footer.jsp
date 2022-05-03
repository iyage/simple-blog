<footer>
    <footer-container>

    </footer-container>
</footer>
<script>
            let status = false;
        var boxWidth = $(".hamburger-menu").width();
        $("#menu-bar").on("click",()=>{
          status=!status
          if(status){
            $(".hamburger-menu").animate(
            {
              width:70+"%",
            }
          )
          }else{
            $(".hamburger-menu").animate(
            {
              width:0,
            }
          )
          }
       

        })
</script>