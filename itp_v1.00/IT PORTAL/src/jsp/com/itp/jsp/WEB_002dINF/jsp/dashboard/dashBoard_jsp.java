package com.itp.jsp.WEB_002dINF.jsp.dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<script type=\"text/javascript\">\n\t\t\t$(function(){\n\n\t\t\t\t\n\t\n\t\t\t\t// Tabs\n\t\t\t\t$('#tabs').tabs();\n\t\n});\n</script>\n\n\n<div  >\n   \n\n <table class=\"componentStyle\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n     <tr>\n         <td class=\"headerBox\">\n              Dashboards\n         </td>\n    </tr>\n    <tr>\n     <td style=\" padding:10px; padding-top:10px; vertical-align:top\">\n         \n         <div id=\"tabs\">\n\t\t\t<ul>\n\t\t\t\t<li><a href=\"#tabs-1\" style=\"font-family:Tahoma, Geneva, sans-serif;\">Ticket Requests <b>(10)</b></a></li>\n\t\t\t\t<li><a href=\"#tabs-2\" style=\"font-family:Tahoma, Geneva, sans-serif;\">Tickets Statistics</a></li>\n                                <li><a href=\"#tabs-3\" style=\"font-family:Tahoma, Geneva, sans-serif;\">My Projects</a></li>\n\t\t\t</ul>\n\t\t\t<div id=\"tabs-1\">\n                            <!-- Start of Ticket Requests DIV -->\n                            <table class=\"componentStyle\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n                                 <tr>\n                                     <td class=\"headerBox2\" width=\"50%\">\n");
      out.write("                                          <span></span>\n                                     </td>\n                                     <td class=\"headerBox2\"  width=\"50%\" align=\"right\">\n                                          <a href=\"\" ><img border=\"0\" src=\"");
      out.print( request.getContextPath());
      out.write("/images/refresh_icon.png\"  /></a>\n                                     </td>\n                                </tr>\n                        </table>\n           \t\t<table width=\"100%\" class=\"tableStyle\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\n          \t\t    <tr>\n                                <th width=\"18%\">Ticket ID</th>\n                                <th width=\"42%\">Subject</th>\n                                <th width=\"23%\">Requestor</th>\n                                <th width=\"17%\">Date of Request</th>\n                                <th width=\"17%\">Priority</th\n                                \n                            </tr>\n                            <tr>\n                                <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\">ITP001-000-060711</a></td>\n                                <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS</b></a></td>\n                                <td>Kevin Neus</td>\n                                <td>Jun 6, 2011 6:49 AM</td>\n                                <td  style=\" color:#F00\">Urgent</td>\n                                \n                           </tr> \n                           <tr>\n                                <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\">ITP001-000-060712</a></td>\n                                <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS</b></a></td>\n                                <td>Kevin Neus</td>\n                                <td>Jun 6, 2011 6:49 AM</td>\n                                <td style=\" color:#063\">Minor</td>\n                                \n                           </tr> \n                           <tr>\n                                <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\">ITP001-000-060713</a></td>\n                                <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS</b></a></td>\n                                <td>Kevin Neus</td>\n                                <td>Jun 6, 2011 6:49 AM</td>\n                                <td  style=\" color:#F00\">Urgent</td>\n                                \n                           </tr> \n                           <tr>\n                                <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\">ITP001-000-060714</a></td>\n                                <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS</b></a></td>\n                                <td>Kevin Neus</td>\n                                <td>Jun 6, 2011 6:49 AM</td>\n                                <td style=\" color:#063\">Minor</td>\n                                \n                           </tr>  \n                        </table>\n                        <div  style=\"width:100%; text-align:right\">\n                                            \t<table width=\"100%\">\n                                                  <tr>\n                                                    \n                                                      <td align=\"left\"> Total result(s) found: 1</td>\n                                                     <td align=\"right\" class=\"right blue_links\"><a href=\"javascript:loadPrevPostedJobs();\" id=\"prevs2\">&laquo; PREV</a>  |  <a href=\"javascript:loadNextPostedJobs();\" id=\"next2\">NEXT &raquo;</a> | Go to \n                                                 \t\t<select  id=\"goto2\" class=\"blue_links\" onchange=\"gotopage('goto2')\">\n");
      out.write("                                                 \t\t\t\t<option value=\"1\">1</option>\n                                                                <option value=\"2\">2</option>\n                                                        </select>\n                                                        <input type=\"hidden\" id=\"max\" value=\"\"/>  <input type=\"hidden\" id=\"index\" value=\"0\"/>\n                                                    </td>\n                                                  </tr>\n                                              </table>\n                        </div>\n                            <!-- End of Ticket Requests DIV -->\n                        </div>\n\t\t\t<div id=\"tabs-2\">\n                            <!-- Start of Ticket Statistics DIV -->\n                            \n                            <table class=\"componentStyle\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n                                 <tr>\n                                     <td class=\"headerBox2\">\n                                          \n");
      out.write("                                     </td>\n                                </tr>\n                                <tr>\n                                     <td >\n                                         <table width=\"373\" class=\"tableStyle\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\n                                            <tr>\n                                                <th width=\"31%\">Ticket Status</th>\n                                                <th width=\"24%\">Count</th>\n                                                <th width=\"45%\">Operation</th>\n\n                                            </tr>\n                                            <tr>\n                                                <td>New</td>\n                                                <td>2</td>\n                                                <td><a href=\"#\">View All</a></td>\n                                           </tr>\n                                           <tr>\n                                                <td>New</td>\n");
      out.write("                                                <td>2</td>\n                                                <td><a href=\"#\">View All</a></td>\n                                           </tr>\n                                           <tr>\n                                                <td>New</td>\n                                                <td>2</td>\n                                                <td><a href=\"#\">View All</a></td>\n                                           </tr> \n                                        </table>\n                                     </td>\n                                </tr>\n                                \n                        </table>\n           \t\t\n                             <!-- End of Ticket Statistics DIV -->\n                        </div>\n\t\t\t<div id=\"tabs-3\">\n                            <!-- Start of project DIV -->\n                                 <table class=\"componentStyle\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n                                     <tr>\n");
      out.write("                                         <td class=\"headerBox2\">\n                                              <span>Project Statistic</span>\n                                         </td>\n                                    </tr>\n                                    <tr>\n                                        <td>\n                                            <table width=\"100%\" class=\"tableStyle\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" align=\"left\">\n                                                 <tr>\n                                                    <th width=\"23%\">Project</th>\n                                                    <th width=\"21%\">Status</th>\n                                                    <th width=\"14%\">Notes Count</th>\n                                                    <th width=\"42%\">Lead</th>\n\n                                                </tr>\n                                                <tr>\n                                                    <td><a href=\"#\">ITP</a></td>\n                                                    <td>In Progress</td>\n");
      out.write("                                                    <td> 34</td>\n                                                    <td> <a href=\"#\">Jun Espinosa</a></td>\n                                               </tr>  \n                                             </table>\n                                        </td>\n                                    </tr>\n\n                                 </table>\n                \t\t\n                               \n                            <!-- End of Project DIV -->\n                        </div>\n         </div> \n                                         \n                                       \n          <table width=\"100%\" border=\"0\">\n            <tr>\n            \t<td width=\"50%\" rowspan=\"2\" style=\" padding-right:20px; padding-top:20px; vertical-align:top\">\n                           \n            \t\n                        <!--table class=\"componentStyle\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n                                 <tr>\n                                     <td class=\"headerBox2\">\n");
      out.write("                                          <span>Accounts</span>\n                                     </td>\n                                </tr>\n                        </table>\n           \t\t\t\t<table width=\"100%\" class=\"tableStyle\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\n          \t\t\t\t\t<tr>\n                                <th width=\"31%\">User Roles</th>\n                                <th width=\"69%\">Description</th>\n                                \n                            </tr>\n                            <tr>\n                                <td><a href=\"#\">User Level 1</a></td>\n                                <td>Cant Acces Admin Functions</td>\n                                \n                           </tr>  \n                        </table-->\n            \t</td>\n               \t<td width=\"50%\" style=\" padding-left:20px; padding-top:20px; vertical-align:top\">\n                \t\t\n                        \n            \t</td>\n           </tr>\n            <tr>\n            \t<td rowspan=\"2\"  width=\"50%\" style=\" padding-left:20px; padding-top:20px; vertical-align:top\">\n");
      out.write("                \t\n            \t</td>\n           </tr>\n        </table>\n       \t\t\t\t\n       \t\t\t\t\t\t\n\n      </td>\n    </tr>\n  </table>\n\n    \n</div>");
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
