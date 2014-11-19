package com.itp.jsp.WEB_002dINF.jsp.project;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class project_005fform_005fversion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<div>\n     <table class=\"componentStyle\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n\t<tr>\n\t\t<td class=\"headerBox\">\n\t\t\tNew asset for this project\n\t\t</td>\n        </tr>\n\t<tr>\n            <td style=\"font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; vertical-align: top; \">\n                                               \n                                                \n                                                <div>\n                                               \n                                                <div>\n                                                <table width=\"722\"   cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n                                                    \n                                                    \n                                                    <tr>\n                                                        <td style=\"background-color:#215F92\"   height=\"2\"></td>\n                                                      \n                                                    </tr>\n");
      out.write("                                                     <tr>\n                                                        <td style=\"border:#215F92 solid 1px \">\n                                                            \t<table width=\"114%\" border=\"0\"  class=\"tableInputs\">\n                                                                  <tr>\n                                                                    <td width=\"16%\" >&nbsp;</td>\n                                                                    <td width=\"84%\" >&nbsp;</td>\n                                                                    \n                                                                  </tr>\n                                                                  <tr>\n                                                                    <td> Name:</td>\n                                                                    <td><input type=\"text\"  cols=\"80\"    /></td>\n                                                                   \n                                                                  </tr>\n");
      out.write("                                                                  <tr>\n                                                                    <td>Description:</td>\n                                                                    <td><textarea name=\"textarea\" cols=\"50\" ></textarea></td>\n                                                                  \n                                                                  </tr>\n                                                                  <tr>\n                                                                    <td>Schedule:</td>\n                                                                    <td><input type=\"text\"  cols=\"80\"    /></td>\n                                                                   \n                                                                  </tr>\n                                                                  <tr>\n                                                                    <td>Date Released:</td>\n                                                                    <td><input type=\"text\"  cols=\"80\"    /></td>\n");
      out.write("                                                                  </tr>\n                                                                  <tr>\n                                                                    <td>Approved By:</td>\n                                                                    <td><select name=\"goto\" class=\"\"  id=\"goto2\" onchange=\"gotopage('goto2')\">\n                                                                      <option value=\"1\">David Pickron</option>\n                                                                      <option value=\"2\">Earl Herr</option>\n                                                                    </select></td>\n                                                                  </tr>\n                                                                  <tr>\n                                                                    <td>Date Approved:</td>\n                                                                    <td><input type=\"text\"  cols=\"80\"    /></td>\n");
      out.write("                                                                  </tr>\n                                                                  <tr>\n                                                                    <td colspan=\"2\" style=\"text-align:center\"><input type=\"button\" value=\"Save Asset\" />&nbsp;&nbsp;&nbsp;<input type=\"button\" value=\"Cancel\" /></td>\n                                                                  </tr>\n                                                                </table>\n\n                                                        </td>\n                                                      \n                                                    </tr>\n                                                </table>\n                                            </div>\n                                                </div>\n                                            </td>\n         </tr>\n  </table>\n</div>\n      \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
