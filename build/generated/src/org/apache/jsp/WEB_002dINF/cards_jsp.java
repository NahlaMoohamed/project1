package org.apache.jsp.WEB_002dINF;

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
      out.write("    <head>\n");
      out.write("\t<style>\n");
      out.write("\th1{\n");
      out.write("\t\tfont-weight: bold !important;\n");
      out.write("        line-height: 1.1 !important;\n");
      out.write("        color: #bf5521 !important;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        display:inline-block;\n");
      out.write("        font-size: 42px !important;\n");
      out.write("    }               \n");
      out.write("\tbody\n");
      out.write("\t{\n");
      out.write("\t\tfont-weight: bold !important;\n");
      out.write("\t\tfont-family: 'Tangerine', serif !important;\n");
      out.write("\t\tbackground: rgba(233, 219, 170,0.6) !important;\n");
      out.write("\t}\n");
      out.write("\t.pagination > li > a, .pagination > li > span{\n");
      out.write("\t    color:#bf5521 !important;\n");
      out.write("\t    background-color: #e9dbaa !important;  \n");
      out.write("\t    border: 1px solid #bf5521 !important;\n");
      out.write("\t}\n");
      out.write("\t.button:hover {\n");
      out.write("\t    background-color: #4CAF50; /* Green */\n");
      out.write("\t    color: white;\n");
      out.write("\t}\n");
      out.write("\t.container{\n");
      out.write("\t\tbackground: #e9dbaa;\n");
      out.write("\t}\n");
      out.write("        </style>\n");
      out.write("        <title>N handmade cards</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"http://fonts.googleapis.com/css?family=Tangerine\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header>\n");
      out.write("    <div class=\"container\" style=\"margin-top: 5px;\">\n");
      out.write("        <div class = \"row\">\n");
      out.write("            <div class=\"text-left\">\n");
      out.write("                <div class = \"col-sm-1\">\n");
      out.write("                    <img class=\"img-responsive\" src=\"logo.jpg\" style = \"margin-left:5px;margin-top: 5px;\"/>\n");
      out.write("\t  \t</div>\n");
      out.write("                <div class = \"col-sm-4\">\n");
      out.write("                    <h1 style=\"text-align: left !important;\">N Handmade Crafts</h1>\n");
      out.write("\t  \t</div>\n");
      out.write("            </div>\t\n");
      out.write("            <div class=\"text-right\" style=\"margin-right: 5px;\">\n");
      out.write("                <div class=\"col-sm-4-4\">\n");
      out.write("                    <ul class=\"pagination pagination-lg\">\n");
      out.write("                        <li><a style=\"font-size: 32px;\" href=\"response.html\">Home</a></li>\n");
      out.write("\t\t\t<li><a style=\"font-size: 32px;\" href=\"garlands.html\">Garlands</a></li>\n");
      out.write("\t\t\t<li><a style=\"font-size: 32px;\" href=\"frames.html\">Frames</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\t  \t</div>\n");
      out.write("            </div>\t\n");
      out.write("\t</div> \n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"text-center\">\n");
      out.write("    ");

    String path = "C:\\Users\\Nahla\\Documents\\NetBeansProjects\\NHandmadeCrafts\\web\\cards";
    File folder = new File(path);
    File[] listOfFiles = folder.listFiles();
    ArrayList paths = new ArrayList();
    for(int i=0;i<listOfFiles.length;i++)
    {
        paths.add(path+"//"+listOfFiles[i].getName());
    }
    int index = 0;
    for(int i =0; i< paths.size()/3 ; i++)
    {
    
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("    ");

    for(int j=0; j<3;j++)
    {
    
      out.write("\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("            <img class=\"img-responsive center-block\" src= \"");
      out.print( paths.get(index));
      out.write("\"/> \n");
      out.write("        </div>\n");
      out.write("    ");

        index++;
    }
    
      out.write("\n");
      out.write("    </div> \n");
      out.write("    ");

    }
    
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    \n");
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
