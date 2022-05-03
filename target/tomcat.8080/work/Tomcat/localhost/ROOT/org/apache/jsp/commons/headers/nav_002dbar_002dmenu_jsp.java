/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2022-05-03 14:07:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.commons.headers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nav_002dbar_002dmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<style>\n");
      out.write("    .nav-search-input {\n");
      out.write("  border: 1px solid white;\n");
      out.write("  border-radius: 10px;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 30px;\n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  padding: 3px;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write(".hamburger-menu{\n");
      out.write("\n");
      out.write("  width: 0; \n");
      out.write("  background-color:var(---primary);\n");
      out.write("  position: fixed;\n");
      out.write("  height:100vh ;\n");
      out.write("  top:70px;left: 0;\n");
      out.write("  z-index: 100000;\n");
      out.write("  overflow-x: hidden;\n");
      out.write("  overflow-y: scroll; \n");
      out.write("}\n");
      out.write("::-webkit-scrollbar {\n");
      out.write("  width: 4px;\n");
      out.write("}\n");
      out.write("::-webkit-scrollbar-thumb {\n");
      out.write("  background-color: #535151;\n");
      out.write("  border-radius: 7px;\n");
      out.write("}\n");
      out.write("::-webkit-scrollbar-track {\n");
      out.write("  background-color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#nav-search {\n");
      out.write("  width: 90%;\n");
      out.write("  border: none;\n");
      out.write("  height: 100%;\n");
      out.write("  background-color: transparent;\n");
      out.write("  padding: 0 10px;\n");
      out.write("}\n");
      out.write("#nav-search:focus {\n");
      out.write("  outline: none;\n");
      out.write("  background-color: transparent;\n");
      out.write("}\n");
      out.write("#nav-search-icon {\n");
      out.write("  color: white;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write(".categorys {\n");
      out.write("  padding: 20px 0;\n");
      out.write("}\n");
      out.write(".category {\n");
      out.write("  border: 0.3px solid #005c80;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 30px;\n");
      out.write("  margin: 10px 0;\n");
      out.write("  color: #005c80;\n");
      out.write("  border-radius: 15px;\n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  padding: 5px 10px;\n");
      out.write("  font-size: 20px;\n");
      out.write("  justify-content: space-between;\n");
      out.write("  background-color: white;\n");
      out.write("  /* box-shadow: 0px 0px 5px 0px rgba(0, 92, 128, 0.2); */\n");
      out.write("}\n");
      out.write(".minus-icon {\n");
      out.write("  font-size: 10px;\n");
      out.write("   cursor: pointer;\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write(".plus-icon {\n");
      out.write("  font-size: 10px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".collapse {\n");
      out.write("  width: 20px;\n");
      out.write("  height: 20px;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  display: flex;\n");
      out.write("  align-items: center;\n");
      out.write("  justify-content: center;\n");
      out.write("  padding: 2px;\n");
      out.write("}\n");
      out.write(".collapse:hover {\n");
      out.write("  background-color: #005c80;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write(".subcategory {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write(".btn {\n");
      out.write("  padding: 0.2em 1em;\n");
      out.write("  color:white;\n");
      out.write("  font-size: 18px;\n");
      out.write("  border-radius: 10px;\n");
      out.write("}\n");
      out.write(".posts-link{\n");
      out.write("  display: block;\n");
      out.write("  white-space:normal;\n");
      out.write("  font-family: 'Times New Roman', Times, serif;\n");
      out.write("  color: var(---primary);\n");
      out.write("}\n");
      out.write(".btn:hover {\n");
      out.write("  background-color: rgb(0, 92, 128, 0.1);\n");
      out.write("}\n");
      out.write(".subcategory-container {\n");
      out.write("  width: 100%;\n");
      out.write("  display: flex;\n");
      out.write("  flex-wrap: wrap;\n");
      out.write("  justify-content: space-around;\n");
      out.write("  padding: 10px;\n");
      out.write("}\n");
      out.write(".subcategory-item {\n");
      out.write("  margin: 8px 2px;\n");
      out.write("  flex: 10%;\n");
      out.write("  flex-grow: 0;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"hamburger-menu\">\n");
      out.write("    <div style=\"padding: 20px 10px;\">\n");
      out.write("    <div class=\"side-bar-container\">\n");
      out.write("      <section class=\"nav-search-input\">\n");
      out.write("          <input type=\"search\" id=\"nav-search\" placeholder=\"search.....\" />\n");
      out.write("          <i class=\"fa-solid fa-magnifying-glass\" id=\"nav-search-icon\"></i>\n");
      out.write("      </section>\n");
      out.write("      <section class=\"categorys\">\n");
      out.write("          <div class=\"category\">\n");
      out.write("              <div>General</div>\n");
      out.write("              <div class=\"collapse\">\n");
      out.write("        <span class=\"plus-icon\" id=\"nav-show-general\"\n");
      out.write("        ><i class=\"fa-solid fa-plus\"></i\n");
      out.write("        ></span>\n");
      out.write("                  <span class=\"minus-icon\" id=\"nav-hide-general\"\n");
      out.write("                  ><i class=\"fa-solid fa-minus\"></i\n");
      out.write("                  ></span>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"subcategory\" id=\"nav-general\">\n");
      out.write("              <div class=\"subcategory-container\">\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Politics</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"\" class=\"btn\">Romance</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Sports</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Real Estate</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Job</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">NYSC</a>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"category\">\n");
      out.write("              <div>Entertainment</div>\n");
      out.write("              <div class=\"collapse\">\n");
      out.write("        <span class=\"plus-icon\" id=\"nav-show-entertainment\"\n");
      out.write("        ><i class=\"fa-solid fa-plus\"></i\n");
      out.write("        ></span>\n");
      out.write("                  <span class=\"minus-icon\" id=\"nav-hide-entertainment\">\n");
      out.write("          <i class=\"fa-solid fa-minus\"></i\n");
      out.write("          ></span>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"subcategory\" id=\"nav-entertainment\">\n");
      out.write("              <div class=\"subcategory-container\">\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Politics</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Politics</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Politics</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Politics</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Politics</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Politics</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"\" class=\"btn\">Romance</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Sports</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Real Estate</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Job</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">NYSC</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Job</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">NYSC</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Job</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">NYSC</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Job</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">NYSC</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">Job</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"subcategory-item\">\n");
      out.write("                      <a href=\"#\" class=\"btn\">NYSC</a>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"category\">\n");
      out.write("              <div>Science/Technology</div>\n");
      out.write("              <div class=\"collapse\">\n");
      out.write("        <span class=\"plus-icon\" id=\"nav-show-science\"\n");
      out.write("        ><i class=\"fa-solid fa-plus\"></i\n");
      out.write("        ></span>\n");
      out.write("                  <span class=\"minus-icon\" id=\"nav-hide-science\">\n");
      out.write("          <i class=\"fa-solid fa-minus\"></i\n");
      out.write("          ></span>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"subcategory\" id=\"nav-science\">Science</div>\n");
      out.write("      </section>\n");
      out.write("  </div>\n");
      out.write("  <div  class=\"right-bar-wrapper\" hidden style=\"text-align: center;\">\n");
      out.write("    <div class=\"notification flex-item\"><form action=\"/logout\" method=\"post\">\n");
      out.write("       \n");
      out.write("        <button type=\"submit\" id=\"log-out\" style=\"color: white; background-color: transparent;\">logout</button>\n");
      out.write("    </form></div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>");
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
