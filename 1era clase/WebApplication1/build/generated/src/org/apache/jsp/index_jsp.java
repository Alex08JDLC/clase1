package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"nav nav-tabs\" id=\"nav-tab\" role=\"tablist\">\n");
      out.write("                <a class=\"nav-item nav-link active\" id=\"nav-home-tab\" data-toggle=\"tab\" href=\"#nav-home\" role=\"tab\" aria-controls=\"nav-home\" aria-selected=\"true\">formulario</a>\n");
      out.write("                <a class=\"nav-item nav-link\" id=\"nav-profile-tab\" data-toggle=\"tab\" href=\"#nav-profile\" role=\"tab\" aria-controls=\"nav-profile\" aria-selected=\"false\">imagen</a>\n");
      out.write("                <a class=\"nav-item nav-link\" id=\"nav-contact-tab\" data-toggle=\"tab\" href=\"#nav-contact\" role=\"tab\" aria-controls=\"nav-contact\" aria-selected=\"false\">...</a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"tab-content\" id=\"nav-tabContent\">\n");
      out.write("            <div class=\"tab-pane fade show active\" id=\"nav-home\" role=\"tabpanel\" aria-labelledby=\"nav-home-tab\">\n");
      out.write("                <form>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("                        <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\n");
      out.write("                        <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group form-check\">\n");
      out.write("                        <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                        <label class=\"form-check-label\" for=\"exampleCheck1\">Check me out</label>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                </form>\n");
      out.write("            </div >\n");
      out.write("            <div class=\"tab-pane fade show active\" id=\"nav-profile\" role=\"tabpanel\" aria-labelledby=\"nav-profile-tab\" >\n");
      out.write("                <img src=\"img/pc.jpg\" class=\"img-fluid\" alt=\"Responsive image\">                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"tab-pane fade\" id=\"nav-contact\" role=\"tabpanel\" aria-labelledby=\"nav-contact-tab\">...</div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
