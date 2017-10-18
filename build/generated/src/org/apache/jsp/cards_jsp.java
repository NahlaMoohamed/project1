package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.io.File;

public final class cards_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"logo.jpg\" sizes=\"196x196\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"http://fonts.googleapis.com/css?family=Tangerine\">\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\" rel=\"stylesheet\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header>\n");
      out.write("<div class=\"container\" style=\"margin-bottom: 5px; margin-top: 5px;\">\n");
      out.write("    <div class = \"row\">\n");
      out.write("        <div class=\"text-left\">\n");
      out.write("            <div class = \"col-sm-1\">\n");
      out.write("                <img class=\"img-responsive\" src=\"logo.jpg\" style = \"margin-left:5px;margin-top: 5px;\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class = \"col-sm-4\">\n");
      out.write("                <h1 style=\"text-align: left !important;\">N Handmade Crafts</h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\t\n");
      out.write("        <div class=\"text-right\" style=\"margin-right: 5px;\">\n");
      out.write("            <div class=\"col-sm-4-4\">\n");
      out.write("                <ul class=\"pagination pagination-lg\">\n");
      out.write("                  <li><a style=\"font-size: 32px;\" href=\"index.html\">Home</a></li>\n");
      out.write("                  <li><a style=\"font-size: 32px;\" href=\"garlands.jsp\">Garlands</a></li>\n");
      out.write("                  <li><a style=\"font-size: 32px;\" href=\"frames.jsp\">Frames</a></li>\n");
      out.write("                  <li><a style=\"font-size: 32px;\" href=\"other.jsp\">Others</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\t\n");
      out.write("    </div> \n");
      out.write("</div>\n");
      out.write("</header>\n");
      out.write("<div class=\"container\" style=\"\">\n");
      out.write("<div class=\"text-center\">\n");
      out.write("    ");

    String path2 = "C://Users//Nahla//Documents//NetBeansProjects//NHandmadeCrafts//web//WEB-INF//cards";
    File folder = new File(path2);
    File[] listOfFiles = folder.listFiles();
    ArrayList paths = new ArrayList();
    for(int i=0;i<listOfFiles.length;i++)
    {
        paths.add("http://127.0.0.1:8887/web/WEB-INF/cards/"+"/"+listOfFiles[i].getName());
    }
    int index = 0;
    double loop = 0.0;
        if((paths.size()%3) == 0)
        {
            loop = paths.size()/3;
        }
        else
        {
            loop = Math.ceil(paths.size()/3)+1;
        }
        for(int i =0; i< loop ; i++)
    {
    
      out.write("\n");
      out.write("    <div style=\"border: 1px solid #bf5521 !important;border-radius: 5px;padding: 5px;margin: 5px;\"> \n");
      out.write("    <div class=\"row\">\n");
      out.write("    ");

    for(int j=0; j<3;j++)
    {
        if(index < paths.size())
        {
    
      out.write("\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("            <a data-toggle = \"myModal");
      out.print(index);
      out.write("\" class=\"btn btn-lg btn-default\" data-target=\"#myModal");
      out.print(index);
      out.write("\"><img class=\"img-responsive center-block\" src= \"");
      out.print( paths.get(index));
      out.write("\"/></a>\n");
      out.write("            <div id=\"myModal");
      out.print(index);
      out.write("\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                  <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                      <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                      <h4 class=\"modal-title\">Card</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                      <img class=\"img-responsive center-block\" src= \"");
      out.print( paths.get(index));
      out.write("\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                      <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    ");

        index++;
        }
        else{
        break;
        }
    }
    
      out.write("\n");
      out.write("    </div> \n");
      out.write("    </div>\n");
      out.write("    ");

    }
    
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<footer class=\"footer bg-6\">\n");
      out.write("    <div class=\"container text-center\">\n");
      out.write("      <a href=\"https://www.facebook.com/nhandmadecraft/\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("      <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("      <a href=\"about.html\"><i class=\"fa fa-info-circle\" aria-hidden=\"true\"></i></a>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
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
