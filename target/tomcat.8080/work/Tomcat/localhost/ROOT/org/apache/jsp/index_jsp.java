/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2022-05-03 14:07:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/commons/styles/index.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/commons/styles/style.css\">\n");
      out.write("<link rel=\"stylesheet\" href= \"");
      out.print( request.getContextPath() );
      out.write("/commons/fonts/css/all.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/commons/styles/pagination.css\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/commons/headers/loading.jsp", out, false);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/commons/headers/header.jsp", out, false);
      out.write("\n");
      out.write("<section class=\"index-container\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/commons/headers/nav-bar-menu.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"index-wrapper\">\n");
      out.write("        <div class=\"side-bar item\">\n");
      out.write("            <div class=\"side-bar-container\">\n");
      out.write("                <section class=\"search-input\">\n");
      out.write("                    <input type=\"search\" id=\"search\" placeholder=\"search.....\" />\n");
      out.write("                    <i class=\"fa-solid fa-magnifying-glass\" id=\"search-icon\"></i>\n");
      out.write("                </section>\n");
      out.write("                <section class=\"categorys\">\n");
      out.write("                    <div class=\"category\">\n");
      out.write("                        <div>General</div>\n");
      out.write("                        <div class=\"collapse\">\n");
      out.write("                  <span class=\"plus-icon\" id=\"show-general\"\n");
      out.write("                  ><i class=\"fa-solid fa-plus\"></i\n");
      out.write("                  ></span>\n");
      out.write("                            <span class=\"minus-icon\" id=\"hide-general\"\n");
      out.write("                            ><i class=\"fa-solid fa-minus\"></i\n");
      out.write("                            ></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"subcategory\" id=\"general\">\n");
      out.write("                        <div class=\"subcategory-container\">\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Politics</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"\" class=\"btn\">Romance</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Sports</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Real Estate</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Job</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">NYSC</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"category\">\n");
      out.write("                        <div>Entertainment</div>\n");
      out.write("                        <div class=\"collapse\">\n");
      out.write("                  <span class=\"plus-icon\" id=\"show-entertainment\"\n");
      out.write("                  ><i class=\"fa-solid fa-plus\"></i\n");
      out.write("                  ></span>\n");
      out.write("                            <span class=\"minus-icon\" id=\"hide-entertainment\">\n");
      out.write("                    <i class=\"fa-solid fa-minus\"></i\n");
      out.write("                    ></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"subcategory\" id=\"entertainment\">\n");
      out.write("                        <div class=\"subcategory-container\">\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Politics</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Politics</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Politics</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Politics</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Politics</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Politics</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"\" class=\"btn\">Romance</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Sports</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Real Estate</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Job</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">NYSC</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Job</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">NYSC</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Job</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">NYSC</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Job</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">NYSC</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">Job</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"subcategory-item\">\n");
      out.write("                                <a href=\"#\" class=\"btn\">NYSC</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"category\">\n");
      out.write("                        <div>Science/Technology</div>\n");
      out.write("                        <div class=\"collapse\">\n");
      out.write("                  <span class=\"plus-icon\" id=\"show-science\"\n");
      out.write("                  ><i class=\"fa-solid fa-plus\"></i\n");
      out.write("                  ></span>\n");
      out.write("                            <span class=\"minus-icon\" id=\"hide-science\">\n");
      out.write("                    <i class=\"fa-solid fa-minus\"></i\n");
      out.write("                    ></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"subcategory\" id=\"science\">Science</div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main-body item\">\n");
      out.write("            <div class=\"main-body-container\">\n");
      out.write("                <div id=\"data-container\"></div>\n");
      out.write("                <div style=\"display: flex; justify-content: center; width: 70%;margin: auto;margin-bottom: 50px;\">\n");
      out.write("                    <div id=\"pagination-container\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/commons/js/jquery.js\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/commons/js/collapse.js\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/commons/js/nav-bar-collapse.js\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/commons/js/pagination.js\"></script>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("    // $(document).ready(()=>{\n");
      out.write("\n");
      out.write("    setTimeout(()=>{\n");
      out.write("        $(\"#page-load\").hide()\n");
      out.write("    },800)\n");
      out.write("        let data = {};\n");
      out.write("        async function loadUserData(){\n");
      out.write("            let userData ={};\n");
      out.write("          try{\n");
      out.write("            const resp = await fetch(\"/load_user_data\",{\n");
      out.write("            method:\"GET\",\n");
      out.write("          })\n");
      out.write("             jsonResp = await resp.json();\n");
      out.write("             console.log(jsonResp);\n");
      out.write("             if(jsonResp!=\"anonymous user\"){\n");
      out.write("                $(\".right-bar-wrapper\").show();\n");
      out.write("                $(\".login-wrapper\").hide();  \n");
      out.write("                 userData = jsonResp;\n");
      out.write("          userData = JSON.parse(userData);\n");
      out.write("          console.log(userData)\n");
      out.write("        $(\".user-profile-image\").attr(\"src\",userData.profile_pics)\n");
      out.write("        $(\"#user-profile-name\").append(userData.firstName);\n");
      out.write("        $(\".user-anchor-link\").attr(\"href\",\"");
      out.print( request.getContextPath() );
      out.write("/views/user-dashboard.jsp?email=\"+userData.email);\n");
      out.write("             }\n");
      out.write("\n");
      out.write("       \n");
      out.write("          }\n");
      out.write("          catch(e){\n");
      out.write("           console.log(e)\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("        loadUserData();\n");
      out.write("        async function loadFrontPage(){\n");
      out.write("          try{\n");
      out.write("            const resp = await fetch(\"/fetch_front_page\",{\n");
      out.write("            method:\"GET\",\n");
      out.write("          })\n");
      out.write("             jsonResp = await resp.json();\n");
      out.write("             data = jsonResp;\n");
      out.write("        function simpleTemplating(data) {\n");
      out.write("        var html = document.createElement(\"div\");\n");
      out.write("        $.each(data, function (index, item) {\n");
      out.write("          var cont = document.createElement(\"div\");\n");
      out.write("          var link = document.createElement(\"a\");\n");
      out.write("          link.setAttribute(\"class\",\"posts-link\");\n");
      out.write("          link.setAttribute(\"href\",\"/views/post.jsp?id=\"+item.id);\n");
      out.write("          cont.setAttribute(\"class\", \"headline\");\n");
      out.write("          var author = document.createElement(\"div\");\n");
      out.write("          author.setAttribute(\"class\", \"author\");\n");
      out.write("          var image = document.createElement(\"img\");\n");
      out.write("          image.setAttribute(\"src\", item.profilePics);\n");
      out.write("          image.setAttribute(\"class\", \"author-image\");\n");
      out.write("          var info = document.createElement(\"div\");\n");
      out.write("          info.setAttribute(\"class\", \"author-info\");\n");
      out.write("          var h4 = document.createElement(\"h4\");\n");
      out.write("          var headline_container = document.createElement(\"div\");\n");
      out.write("          headline_container.setAttribute(\"class\", \"headline-container\");\n");
      out.write("          var headline_content = document.createElement(\"p\");\n");
      out.write("          var comments_container = document.createElement(\"div\");\n");
      out.write("          comments_container.setAttribute(\"class\", \"coments-likes-counts\");\n");
      out.write("          var like = document.createElement(\"p\");\n");
      out.write("          like.setAttribute(\"class\", \"likes-count coments-likes-counts-items\");\n");
      out.write("          var comment = document.createElement(\"p\");\n");
      out.write("          comment.setAttribute(\n");
      out.write("            \"class\",\n");
      out.write("            \"comments-counts coments-likes-counts-items\"\n");
      out.write("          );\n");
      out.write("          like.innerHTML = 20 + \"  likes\";\n");
      out.write("          comment.innerHTML = 20 + \" comments\";\n");
      out.write("          comments_container.append(like);\n");
      out.write("          comments_container.append(comment);\n");
      out.write("          headline_content.innerHTML = item.headLine;\n");
      out.write("          headline_content.setAttribute(\"class\", \"headline-content\");\n");
      out.write("          headline_container.append(headline_content);\n");
      out.write("          headline_container.append(comments_container);\n");
      out.write("          cont.append(headline_container);\n");
      out.write("          h4.innerHTML = item.firstName;\n");
      out.write("          info.append(h4);\n");
      out.write("          author.append(image);\n");
      out.write("          author.append(info);\n");
      out.write("          cont.append(author);\n");
      out.write("          link.append(cont)\n");
      out.write("          html.append(link);\n");
      out.write("        });\n");
      out.write("        return html;\n");
      out.write("      }\n");
      out.write("      $(\"#pagination-container\").pagination({\n");
      out.write("        dataSource: data,\n");
      out.write("        pageSize: 6,\n");
      out.write("        className: \"paginationjs-theme-blue paginationjs-small\",\n");
      out.write("        ulClassName: \"paginate\",\n");
      out.write("        activeClassName: \"active\",\n");
      out.write("        disableClassName: \"not-selected\",\n");
      out.write("        callback: function (data, pagination) {\n");
      out.write("          var html = simpleTemplating(data);\n");
      out.write("          $(\"#data-container\").html(html);\n");
      out.write("        },\n");
      out.write("      });\n");
      out.write("          }\n");
      out.write("          catch(e){\n");
      out.write("           console.log(e)\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("        loadFrontPage();\n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/commons/footer/footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
