/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2022-05-03 16:28:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>login!!</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"commons/styles/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"commons/fonts/css/all.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"commons/styles/login.css\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   <div class=\"login-container\">\n");
      out.write("     <div class=\"form-container\">\n");
      out.write("       <div id=\"error-pane\" hidden>\n");
      out.write("         <p style=\"text-align: center; color: red;\">Invalid username or password</p>\n");
      out.write("\n");
      out.write("       </div>\n");
      out.write("       <form action=\"/login\"  method=\"post\">\n");
      out.write("        <div>\n");
      out.write("          <input name=\"username\" type=\"email\" placeholder=\"Email\" class=\"form-input\">\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("          <input type=\"password\" name=\"password\" id=\"\" placeholder=\"password\" class=\"form-input\">\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("          <button type=\"submit\" class=\"btn btn-large btn-primary\" id=\"login-btn\">Login</button>\n");
      out.write("        </div>\n");
      out.write("       </form>\n");
      out.write("       <hr>\n");
      out.write("       <button class=\"btn btn-large btn-secondary\" id=\"create-acct-btn\">Create an account</button>\n");
      out.write("     </div>\n");
      out.write("   </div>\n");
      out.write("   <div class=\"registration-container\" hidden>\n");
      out.write("     <div style=\"text-align: end; padding: 10px;\"><span id=\"close-button\"><i class=\"fa-solid fa-times\"></i></div>\n");
      out.write("    \n");
      out.write("    <div class=\"registration-form\">\n");
      out.write("      <form action=\"\">\n");
      out.write("        <div>\n");
      out.write("          <input type=\"text\" placeholder=\"First Name\" id=\"firstName\" class=\"form-input\">\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("          <input type=\"text\" placeholder=\"Last Name\" id=\"lastName\" class=\"form-input\">\n");
      out.write("        </div>\n");
      out.write("       <div>\n");
      out.write("         <input type=\"email\" placeholder=\"Email\" id=\"email\" class=\"form-input\">\n");
      out.write("       </div>\n");
      out.write("       <div>\n");
      out.write("        <input type=\"date\" id=\"age\" class=\"form-input\">\n");
      out.write("      </div>\n");
      out.write("       <div>\n");
      out.write("         <input type=\"password\" name=\"\" id=\"password\" placeholder=\"password\" class=\"form-input\">\n");
      out.write("       </div>\n");
      out.write("       <div>\n");
      out.write("         <button class=\"btn btn-large btn-primary\" id=\"submit\">Submit</button>\n");
      out.write("       </div>\n");
      out.write("      </form>\n");
      out.write("  </div>\n");
      out.write("   </div>\n");
      out.write("   <script src=\"commons/js/jquery.js\"></script>\n");
      out.write("   <script>\n");
      out.write("   const query = window.location.search;\n");
      out.write("   const searchParams = new URLSearchParams(query);\n");
      out.write("let error = false;\n");
      out.write("   error = searchParams.get(\"error\");\n");
      out.write("   console.log(error)\n");
      out.write("   if(error){\n");
      out.write(" $(\"#error-pane\").show();\n");
      out.write("   }\n");
      out.write("     let url = \"/register\"\n");
      out.write("     $(\"#close-button\").on(\"click\",()=>{\n");
      out.write("      $(\".registration-container\").hide();\n");
      out.write("     })\n");
      out.write("     $(\"#create-acct-btn\").on(\"click\",()=>{\n");
      out.write("      $(\".registration-container\").fadeIn();\n");
      out.write("     })\n");
      out.write("     async function register (data){\n");
      out.write("       try{let resp =  await fetch(url,{\n");
      out.write("            method:\"POST\",\n");
      out.write("            headers:{\n");
      out.write("            \"content-type\":\"application/json\"\n");
      out.write("            },\n");
      out.write("            body:JSON.stringify(data)\n");
      out.write("          })\n");
      out.write("          let json = await resp.json();\n");
      out.write("        }catch(e){\n");
      out.write("          console.log(e);\n");
      out.write("        }\n");
      out.write("          \n");
      out.write("        }\n");
      out.write("     $(\"#submit\").on(\"click\",(e)=>{\n");
      out.write("       e.preventDefault();\n");
      out.write("       let data = {\n");
      out.write("        firstName :$(\"#firstName\").val(),\n");
      out.write("        lastName :$(\"#lastName\").val(),\n");
      out.write("        email:$(\"#email\").val(),\n");
      out.write("        age: $(\"#age\").val(),\n");
      out.write("        password:$(\"#password\").val()\n");
      out.write("       }\n");
      out.write("       register(data)\n");
      out.write("     })\n");
      out.write("     \n");
      out.write("   </script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
