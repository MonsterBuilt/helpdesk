package com.itp.jsp.WEB_002dINF.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class project_005fstatus_005fsettings_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div>\n                        <table class=\"componentStyle\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n                                    \t<tr>\n                                            <td class=\"headerBox\">\n                                            \tProject Status Settings\n                                            </td>\n                                        </tr>\n                                        <tr>\n                                        \t<td style=\"font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; \">\n                                            \t\n                                        </tr>\n                                        <tr>\n                                       \t  <td style=\"font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; vertical-align: top; \">\n\n                                                <div>\n                                                    <table width=\"100%\" border=\"1\" class=\"tableStyle\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                                                        <tr >\n                                                          <th width=\"15%\">Name</th>\n                                                          <th width=\"24%\">Description</th>\n                                                          <th width=\"16%\">Label Color</th>\n                                                          <th width=\"8%\">Icon</th>\n                                                          <th width=\"14%\">Operations</th>\n                                                        </tr>\n                                                        <tr>\n                                                          <td>Urgent</td>\n                                                          <td>This should be given attention immedidately</td>\n                                                          <td align=\"center\"><div style=\"background-color:#060; width:30px; height:15px;\"></div></td>\n                                                          <td  align=\"center\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/images/icon_check.png\" width=\"23\" height=\"18\" alt=\"True\" /></td>\n                                                          <td align=\"center\"><a href=\"\">Copy</a>&nbsp;|&nbsp;<a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                                                        </tr>\n                                                    </table>\n                                                </div>\n                                            \n                                                <div  style=\"width:100%; text-align:right\">\n                                                    <table width=\"100%\">\n                                                      <tr>\n\n                                                          <td align=\"left\"> Total result(s) found: 1</td>\n                                                         <td align=\"right\" class=\"right blue_links\"><a href=\"javascript:loadPrevPostedJobs();\" id=\"prevs2\">&laquo; PREV</a>  |  <a href=\"javascript:loadNextPostedJobs();\" id=\"next2\">NEXT &raquo;</a> | Go to \n");
      out.write("                                                                    <select  id=\"goto2\" class=\"blue_links\" onchange=\"gotopage('goto2')\">\n                                                                                    <option value=\"1\">1</option>\n                                                                    <option value=\"2\">2</option>\n                                                            </select>\n                                                            <input type=\"hidden\" id=\"max\" value=\"\"/>  <input type=\"hidden\" id=\"index\" value=\"0\"/>\n                                                        </td>\n                                                      </tr>\n                                                    </table>\n                                                </div>\n                                                <br/><br/>\n                                                \n                                                <div style=\"width:800px\">\n    \n                                                        <table   cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n");
      out.write("                                                            <tr>\n                                                                <th class=\"tabBox\" width=\"20%\">\n                                                                    New Priority\n                                                              </th>\n                                                              <th  width=\"80%\" >\n\n                                                              </th>\n                                                            </tr>\n\n                                                            <tr>\n                                                                <td colspan=\"2\" style=\"background-color:#215F92\"   height=\"2\"></td>\n\n                                                            </tr>\n                                                             <tr>\n                                                                <td colspan=\"2\" style=\"border:#215F92 solid 1px \">\n                                                                        <table width=\"100%\" border=\"0\">\n");
      out.write("                                                                          <tr>\n                                                                            <td >&nbsp;</td>\n                                                                            <td >&nbsp;</td>\n\n                                                                          </tr>\n                                                                          <tr>\n                                                                            <td>Permission Name:</td>\n                                                                            <td><input type=\"text\"  cols=\"80\"    /></td>\n\n                                                                          </tr>\n                                                                          <tr>\n                                                                            <td>Description:</td>\n                                                                            <td><textarea name=\"textarea\" cols=\"50\" ></textarea></td>\n");
      out.write("\n                                                                          </tr>\n                                                                          <tr>\n                                                                            <td>Color Value:</td>\n                                                                            <td><input type=\"text\"  cols=\"80\"    /></td>\n\n                                                                          </tr>\n                                                                          <tr>\n                                                                            <td>Icon:</td>\n                                                                            <td> <input type=\"file\" /><img width=\"20px\" height=\"20px\" src=\"dsad\" /></td>\n                                                                          </tr>\n                                                                          <tr>\n                                                                            <td>&nbsp;</td>\n");
      out.write("                                                                            <td >&nbsp;</td>\n                                                                          </tr>\n                                                                          <tr>\n                                                                            <td>&nbsp;</td>\n\n                                                                            <td style=\"text-align:right\"><input type=\"button\" value=\"Save\" />&nbsp;&nbsp;&nbsp;<input type=\"button\" value=\"Cancel\" /></td>\n                                                                          </tr>\n                                                                        </table>\n\n                                                                </td>\n\n                                                            </tr>\n                                                        </table>\n                                                    </div>\n    \n                                            </td>\n");
      out.write("                                     </tr>\n                            </table>\n\n</div>\n");
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
