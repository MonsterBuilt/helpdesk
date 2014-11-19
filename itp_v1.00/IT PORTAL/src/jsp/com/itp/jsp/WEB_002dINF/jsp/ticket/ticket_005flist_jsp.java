package com.itp.jsp.WEB_002dINF.jsp.ticket;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ticket_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div>\n   <table class=\"componentStyle\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n\t<tr>\n\t\t<td class=\"headerBox\">\n\t\t\tMy Tickets\n\t\t</td>\n    </tr>\n\t<tr>\n        <td style=\"font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; vertical-align: top; \">\n\n            <div><br/><br/>\n                 <div >Advanced Search\n                                            <table width=\"100%\"   cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n                                                    \n                                                    \n                                                    <tr>\n                                                        <td colspan=\"2\" style=\"background-color:#215F92\"   height=\"2\"></td>\n                                                      \n                                                    </tr>\n                                                     <tr>\n                                                        <td colspan=\"2\" style=\"border:#215F92 solid 1px \">\n");
      out.write("                                                            \t<table width=\"100%\" border=\"0\">\n                                                                  <tr>\n                                                                    <td width=\"100%\">Search:&nbsp;\n                                                                    <input type=\"text\" value=\"Quick Search\"  cols=\"80\"    />\n                                                                     \n                                                                    &nbsp;&nbsp;Status:\n                                                                    <select name=\"goto\" class=\"\"  id=\"goto\" onchange=\"gotopage('goto2')\">\n                                                                      <option value=\"1\">Priority</option>\n                                                                      <option value=\"2\">Name</option>\n                                                                      <option value=\"2\">Date Started</option>\n                                                                    </select>\n");
      out.write("                                                                      &nbsp;&nbsp; Action:&nbsp; \n                                                                      <select name=\"goto\" class=\"\"  id=\"goto\" onchange=\"gotopage('goto2')\">\n                                                                      <option value=\"1\">Open</option>\n                                                                      <option value=\"2\">Closed</option>\n                                                                     \n                                                                    </select>\n                                                                      <span style=\"text-align:right\">&nbsp;&nbsp;&nbsp;&nbsp;\n                                                                      <input type=\"button\" value=\"Search\" />\n                                                                    </span></td>\n                                                                  </tr>\n                                                                </table></td>\n");
      out.write("                                                      \n                                                    </tr>\n                                                </table>\n                                            </div>\n            </div>\n\n<table width=\"100%\" class=\"tableStyle\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\n  \n                    <tr>\n                        <th width=\"11%\">Ticket_id</th>\n                        <th width=\"18%\">Subject</th>\n                        <th width=\"19%\">Requested By</th>\n                        <th width=\"13%\">Date Requested</th>\n                        <th width=\"13%\">Age(Days)</th>\n                        <th width=\"8%\">Type</th>\n                        <th width=\"12%\">Action Taken</th>\n                        <th width=\"19%\">Operation</th>\n                    </tr>\n                    <tr>\n                        <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\">ITP001-000-060712</a></td>\n                        <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS</b></a></td>\n                        <td>Kevin Neus</td>\n                        <td>Jun 6, 2011 6:49 AM</td>\n                        <td align=\"center\">1</td>\n                        <td align=\"center\">Bug</td><br />\n\t\t\t\t\t\t<td>Pending</td>\n                        <td><a href=\"\">View</a>&nbsp;|&nbsp;<a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                    </tr>\n                    <tr>\n                        <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\">ITP001-000-060712</a></td>\n                        <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS</b></a></td>\n                        <td>Kevin Neus</td>\n                        <td>Jun 6, 2011 6:49 AM</td>\n                        <td align=\"center\">1</td>\n                        <td align=\"center\">Trivial</td><br />\n\t\t\t\t\t\t<td>Pending</td>\n                        <td><a href=\"\">View</a>&nbsp;|&nbsp;<a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                    </tr>\n                     <tr>\n                        <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\">ITP001-000-060712</a></td>\n                        <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS</b></a></td>\n                        <td>Kevin Neus</td>\n                        <td>Jun 6, 2011 6:49 AM</td>\n                        <td align=\"center\">1</td>\n                        <td align=\"center\">Bug</td><br />\n\t\t\t\t\t\t<td>Pending</td>\n                        <td><a href=\"\">View</a>&nbsp;|&nbsp;<a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                    </tr>\n                </table>\n                <div  style=\"width:100%; text-align:right\">\n                       <table width=\"100%\">\n                             <tr>\n                                 <td align=\"left\"> Total result(s) found: 1</td>\n                                 <td align=\"right\" class=\"right blue_links\"><a href=\"javascript:loadPrevPostedJobs();\" id=\"prevs2\">&laquo; PREV</a>  |  <a href=\"javascript:loadNextPostedJobs();\" id=\"next2\">NEXT &raquo;</a> | Go to \n                                          <select  id=\"goto2\" class=\"blue_links\" onchange=\"gotopage('goto2')\">\n");
      out.write("                                                 <option value=\"1\">1</option>\n                                                 <option value=\"2\">2</option>\n                                          </select>\n                                          <input type=\"hidden\" id=\"max\" value=\"\"/>  <input type=\"hidden\" id=\"index\" value=\"0\"/>\n                                 </td>\n                            </tr>\n                     </table>\n                </div>\n\n        </td>\n\t</tr>\n    <tr>\n    \t<td>\n        \t<br />\t\n                                          \n        </td>\n    </tr>\n</table>\n</div>\n");
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
