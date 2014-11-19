package com.itp.jsp.WEB_002dINF.jsp.ticket;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ticket_005fnew_005frequest_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div>\n     <table class=\"componentStyle\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n\t<tr>\n\t\t<td class=\"headerBox\">\n\t\t\tRequest New Ticket\n\t\t</td>\n        </tr>\n\t<tr>\n            <td style=\"font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; vertical-align: top; \">\n                <div style=\"width:800px\">\n                     <table     cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n                        \n                        \n                        <tr>\n                            <td >\n                                <table width=\"100%\" border=\"0\">\n                                       <tr>\n                                           <td width=\"15%\" >&nbsp;</td>\n                                           <td >&nbsp;</td>\n                                        </tr>\n                                        <tr>\n                                            <td>Project:</td>\n                                            <td width=\"48%\">\n                                                <select name=\"goto\" class=\"\"  id=\"goto\" onchange=\"gotopage('goto2')\">\n");
      out.write("                                                           <option value=\"0\">[ Select Project ]</option>\n                                                           <option value=\"1\">Crimshield</option>\n                                                           <option value=\"2\">ITP</option>\n                                                           <option value=\"3\">Crime Free Cricle</option>\n                                                           <option value=\"4\">Others</option>\n                                                 </select>\n                                            </td>\n                                        </tr>\n                                        <tr>\n                                            <td>Component:</td>\n                                            <td width=\"48%\">\n                                                <select name=\"goto\" class=\"\"  id=\"goto\" onchange=\"gotopage('goto2')\">\n                                                           <option value=\"0\">[ Select Component ]</option>\n");
      out.write("                                                           <option value=\"1\">Crimshield</option>\n                                                           <option value=\"2\">ITP</option>\n                                                           <option value=\"3\">Crime Free Cricle</option>\n                                                           <option value=\"4\">Others</option>\n                                                 </select>\n                                            </td>\n                                        </tr>\n                                        <tr>\n                                            <td>* Subject:</td>\n                                            <td width=\"48%\"><input type=\"text\" size=\"80\"     /></td>\n                                        </tr>\n                                        \n                                        <tr>\n                                            <td>Ticket Type:</td>\n                                            <td width=\"48%\">\n                                                <select name=\"goto\" class=\"\"  id=\"goto\" onchange=\"gotopage('goto2')\">\n");
      out.write("                                                           <option value=\"1\">Bug</option>\n                                                           <option value=\"2\">New Feature</option>\n                                                           <option value=\"3\">Task</option>\n                                                           <option value=\"4\">Improvement</option>\n                                                 </select>\n                                            </td>\n                                        </tr>\n                                        <tr>\n                                            <td style=\"vertical-align:top\">Priority:</td>\n                                            <td style=\"vertical-align:top\">\n                                                  <select name=\"goto\" class=\"\"  id=\"goto\" onchange=\"gotopage('goto2')\">\n                                                          <option value=\"1\">Blocker</option>\n                                                          <option value=\"2\">Critical</option>\n");
      out.write("                                                          <option value=\"3\">Major</option>\n                                                          <option value=\"4\">Minor</option>\n                                                          <option value=\"5\">Trivial</option>\n                                                  </select>\n                                            </td>\n                                        </tr>\n                                        <tr>\n                                            <td style=\"vertical-align:top\">Description:</td>\n                                            <td style=\"vertical-align:top;\" ><textarea name=\"textarea\" cols=\"80\" rows=\"30\" ></textarea>\n                                                       <div style=\"text-align:right\"><input type=\"button\" value=\"Clear Summary\" /></div>\n                                                                        \n                                            </td>\n                                        </tr>\n                                        \n");
      out.write("                                        <!--tr>\n                                            <td>Status:</td>\n                                            <td width=\"48%\">\n                                                  <select name=\"goto\" class=\"\"  id=\"goto\" onchange=\"gotopage('goto2')\">\n                                                           <option value=\"1\">Priority</option>\n                                                           <option value=\"2\">Name</option>\n                                                           <option value=\"2\">Date Started</option>\n                                                  </select>\n                                            </td>\n                                                                   \n                                                      \n                                      \t</tr-->\n                                        <tr>\n                                            <td colspan=\"2\" style=\"border-bottom:#CCC thin solid;\">\n                                            <br/><br/>\n");
      out.write("                                            </td>\n                                        </tr>\n                                        <tr>\n                                           <td>Attachment:</td>\n                                           <td><input type=\"file\" name=\"dataFile\" size=\"25\"/></td>\n                                        </tr>\n                                         <tr>\n                                             <td>&nbsp;</td>\n                                             <td class=\"blue_links\">\n                                                <div>\n                                                    <table cellpadding=\"2\" cellspacing=\"2\">\n                                                        <tr>\n                                                            <td width=\"134\">\n                                                                <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/attachment_icon_black.gif\" />&nbsp;&nbsp;&nbsp;&nbsp;fileName.txt&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"#\" class=\"blue_links\">[X]</a>\n                                                            </td>\n                                                        </tr>\n                                                   </table>\n                                                </div>\n                                             </td>\n                                         </tr>\n                                         <tr>\n                                            <td>&nbsp;</td>\n                                            <td  style=\"text-align:right\"><input type=\"button\" value=\"Send Request\" />\n                                            </td>\n                                         </tr>\n                               </table>\n                            </td>\n                        </tr>\n                       </table>\n                    </div>\n               </td>\n         </tr>\n  </table>\n</div>\n      \n");
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
