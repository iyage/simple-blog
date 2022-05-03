/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2022-05-03 16:28:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class post_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Frontpage!</title>\n");
      out.write("     <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/commons/styles/style.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/commons/fonts/css/all.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/commons/styles/post.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("   \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/commons/headers/loading.jsp", out, false);
      out.write('\n');
      out.write(' ');
      out.write(' ');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/commons/headers/header.jsp", out, false);
      out.write("\n");
      out.write("    <section class=\"post-container\" style=\"margin-bottom: 50px;\">\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/commons/headers/nav-bar-menu.jsp", out, false);
      out.write("\n");
      out.write("      <section class=\"post\">\n");
      out.write("        <section class=\"author-profile\">\n");
      out.write("          <div class=\"author-image\">\n");
      out.write("            <a href=\"\" id=\"author-image-container\">\n");
      out.write("            \n");
      out.write("                <span\n");
      out.write("                ><img src=\"\" class=\"author-pic\" alt=\"\"\n");
      out.write("              /></span>\n");
      out.write("              <h5 id=\"bloger-name\"></h5>\n");
      out.write("        \n");
      out.write("            </a>\n");
      out.write("  \n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("          <div class=\"author-milage\">\n");
      out.write("            <h5 style=\"padding: 5px\">\n");
      out.write("              headliners:<span class=\"badges\">30</span>\n");
      out.write("            </h5>\n");
      out.write("            <div style=\"padding: 5px\">\n");
      out.write("              <h5>Total posts <span class=\"badges\">100</span></h5>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"author-post\">\n");
      out.write("          <article id=\"post-body\">\n");
      out.write("          </article>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"comments-likes\">\n");
      out.write("          <div class=\"like\">\n");
      out.write("            <span hidden id=\"post-like-container\"><i class=\"fa-regular fa-thumbs-up icon-class\" id=\"post-like\" ></i\n");
      out.write("            ></span><span id=\"post-like-counts\"></span>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"comments-count\">\n");
      out.write("            <i class=\"fa-regular fa-comment icon-class\"></i\n");
      out.write("            ><span id=\"post-comment-counts\"></span>\n");
      out.write("          </div>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"comment\" hidden>\n");
      out.write("          <div style=\"text-align: end; padding: 10px;\">\n");
      out.write("            <a href=\"#\" id=\"post-comment\">post comment</a>\n");
      out.write("          </div>\n");
      out.write("          <div id=\"comment-area\">\n");
      out.write("            <textarea name=\"\" id=\"comment-body\" cols=\"30\" rows=\"5\" style=\"width: 89%;  margin-bottom: 20px;\"></textarea>\n");
      out.write("          </div>\n");
      out.write("         \n");
      out.write("        </section>\n");
      out.write("      </section>\n");
      out.write("      <div id=\"comments-container\">\n");
      out.write("    </div>\n");
      out.write("    </section>\n");
      out.write("    <script src=\"../commons/js/jquery.js\"></script>\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath() );
      out.write("/commons/js/nav-bar-collapse.js\"></script>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/commons/footer/footer.jsp", out, false);
      out.write("\n");
      out.write(" \n");
      out.write("    <script>\n");
      out.write("      // $(document).ready(()=>{\n");
      out.write("        setTimeout(()=>{\n");
      out.write("        $(\"#page-load\").hide()\n");
      out.write("    },800)\n");
      out.write("        let data = {};\n");
      out.write("      query = window.location.search;\n");
      out.write("      urlParams = new URLSearchParams(query);\n");
      out.write("      console.log(urlParams.get(\"id\"))\n");
      out.write("      id = urlParams.get(\"id\");\n");
      out.write("      async function fetchPost(id){\n");
      out.write("         const resp = await fetch(\"/post\",{\n");
      out.write("           method: \"POST\",\n");
      out.write("           headers:{\n");
      out.write("             \"content-type\":\"x-wwww-form-urlencoded\"\n");
      out.write("           },\n");
      out.write("           body:id\n");
      out.write("         })\n");
      out.write("         jsonResp = await resp.json();\n");
      out.write("         data=jsonResp;\n");
      out.write("         console.log(data);\n");
      out.write("         if(data.user!==\"anonymousUser\"){\n");
      out.write("          $(\".login-wrapper\").hide();  \n");
      out.write("        $(\".right-bar-wrapper\").show();\n");
      out.write("        $(\"#user-profile-image\").attr(\"src\",data.userDetails[\"profile_pics\"])\n");
      out.write("        $(\".user-profile-name\").append(data.userDetails[\"firstName\"]);\n");
      out.write("        $(\".user-anchor-link\").attr(\"href\",\"");
      out.print( request.getContextPath() );
      out.write("/views/user-dashboard.jsp?email=\"+data.userDetails[\"email\"]);\n");
      out.write("        $(\"#post-like-container\").show();\n");
      out.write("        $(\".comment\").show();\n");
      out.write("             }\n");
      out.write("         $(\"#bloger-name\").append(data.post[\"firstName\"])\n");
      out.write("       $(\".author-pic\").attr(\"src\",data.post[\"profilePics\"]);\n");
      out.write("       $(\"#post-body\").append(data.post[\"post\"])\n");
      out.write("       $(\"#author-image-container\").attr(\"href\",\"");
      out.print( request.getContextPath() );
      out.write("/views/user-dashboard.jsp?email=\"+data.post[\"email\"])\n");
      out.write("       $(\"#post-comment-counts\").append(\"  \" + data.comments.length+ \"  comments\")\n");
      out.write("       $(\"#post-like-counts\").append(\" \"+data.postLikesCounts+ \"  likes\")\n");
      out.write("\n");
      out.write("\n");
      out.write("         CreateComments(data)\n");
      out.write("      }\n");
      out.write("      fetchPost(id)\n");
      out.write("      async function postComment(newComment){\n");
      out.write("       \n");
      out.write("        let resp = await fetch(\"/post_comment\",{\n");
      out.write("          method:\"POST\",\n");
      out.write("          headers:{\n");
      out.write("            \"content-type\":\"application/json\"\n");
      out.write("          },\n");
      out.write("          body:JSON.stringify(newComment)\n");
      out.write("        })\n");
      out.write("        const jsonResp = await resp.json();\n");
      out.write("        $(\"#comment-body\").val(\"\");\n");
      out.write("        $(\"#comments-container\").empty();\n");
      out.write("        console.log(jsonResp)\n");
      out.write("          data[\"comments\"].unshift(jsonResp);\n");
      out.write("          console.log(data[\"comments\"])\n");
      out.write("\n");
      out.write("          $(\"#post-comment-counts\").empty();\n");
      out.write("          $(\"#post-comment-counts\").append(\"  \" + data.comments.length+ \"  comments\")\n");
      out.write("         CreateComments(data)\n");
      out.write("           \n");
      out.write("      }\n");
      out.write("      $(\"#post-comment\").on(\"click\",(e)=>{\n");
      out.write("       e.preventDefault();\n");
      out.write("       const dataToPost ={\n");
      out.write("         postId:data.post[\"id\"],\n");
      out.write("         userId:data.userDetails[\"id\"],\n");
      out.write("        comment:$(\"#comment-body\").val()\n");
      out.write("       }\n");
      out.write("       if($(\"#comment-body\").val()!=\"\"){\n");
      out.write("       postComment(dataToPost)\n");
      out.write("       }\n");
      out.write("\n");
      out.write("      })\n");
      out.write("\n");
      out.write("\n");
      out.write("      $(\"#post-like\").on(\"click\",()=>{\n");
      out.write("        const likeData = {\n");
      out.write("          postId:data.post[\"id\"],\n");
      out.write("          userId:data.userDetails[\"id\"]\n");
      out.write("        }\n");
      out.write("        countLikes(likeData);\n");
      out.write("\n");
      out.write("      })\n");
      out.write("      async function countLikes(data){\n");
      out.write("        const resp = await fetch(\"/post_likes_count\",{\n");
      out.write("          method:\"POST\",\n");
      out.write("          headers:{\n");
      out.write("            \"content-type\":\"application/json\"\n");
      out.write("          },\n");
      out.write("          body:JSON.stringify(data)\n");
      out.write("        })\n");
      out.write("        const jsonResp = await resp.json();\n");
      out.write("        console.log(jsonResp)\n");
      out.write("        $(\"#post-like-counts\").text(\"\");\n");
      out.write("        $(\"#post-like-counts\").text(\"  \"+jsonResp+\" \"+ \"likes\")\n");
      out.write("      }\n");
      out.write("\n");
      out.write("\n");
      out.write("      function CreateComments(data){\n");
      out.write("        for (let index = 0; index < data.comments.length; index++) {\n");
      out.write("         let comments =   $(\"<div>\",{\n");
      out.write("           id:1,\n");
      out.write("           class:\"comments\",\n");
      out.write("         });\n");
      out.write("         let  comments_wraper =  $('<div>',{\n");
      out.write("             class:\"comments-wraper\",\n");
      out.write("           });\n");
      out.write("           let edit_section =$('<div>',{\n");
      out.write("             style:\"text-align: end\"\n");
      out.write("           });\n");
      out.write("        let edit_icon = $('<i>',{\n");
      out.write("             class:\"fa-solid fa-ellipsis-vertical edit icon-class\",\n");
      out.write("             id:\"edit_icon\"+index\n");
      out.write("           });\n");
      out.write("           let author_name =  $('<h6>',{\n");
      out.write("             class:\"commenter-name\",\n");
      out.write("             id: \"commenter-name\"+index,\n");
      out.write("             text: data.comments[index][\"firstName\"]\n");
      out.write("           });\n");
      out.write("           let comment_section = $('<div>',{\n");
      out.write("             class:\"comment-section\",\n");
      out.write("             id: \"comment-section\"+index,\n");
      out.write("           });\n");
      out.write("\n");
      out.write("   let author_img = $('<img>',{\n");
      out.write("             class:\"comment-author\",\n");
      out.write("             id: \"comment-author\"+index,\n");
      out.write("             src: data.comments[index][\"profilePics\"]\n");
      out.write("           });\n");
      out.write("    let comment_content =  $('<div>',{\n");
      out.write("             class:\"comment-content\",\n");
      out.write("             id: \"comment-content\"+index,\n");
      out.write("             text: data.comments[index][\"comment\"]\n");
      out.write("           });\n");
      out.write("           edit_section.append(edit_icon)\n");
      out.write("           comments.append(edit_section)\n");
      out.write("           comments.append(author_name)\n");
      out.write("           comment_section .append(author_img);\n");
      out.write("           comment_section .append(comment_content);\n");
      out.write("           comments.append(comment_section)\n");
      out.write("           comments_wraper.append(comments)\n");
      out.write("           if(data.user!=data.comments[index][\"email\"]){\n");
      out.write("            edit_section.hide();\n");
      out.write("           }\n");
      out.write("  \n");
      out.write("           $(\"#comments-container\").append(comments_wraper)\n");
      out.write("         \n");
      out.write("       }\n");
      out.write("\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      // })\n");
      out.write("      \n");
      out.write("    </script>\n");
      out.write("  </body>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
