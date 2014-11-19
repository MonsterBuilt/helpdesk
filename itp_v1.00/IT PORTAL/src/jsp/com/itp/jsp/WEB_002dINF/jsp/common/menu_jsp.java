package com.itp.jsp.WEB_002dINF.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div>\n                \t<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n                            <tr>\n                                <td class=\"header\" style=\"Verical-align:middle;\">Welcome to Information Technology Portal\n                                  \n                                </td>\n                                <td class=\"header\">\n                                    <table  align=\"right\">\n                                        <tr>\n                                            <td class=\"menu2\"  >\n                                            \t<ul>\n                                                <li><a href=\"#\">Daryl Galdones<img style=\"border:0px\" src=\"");
      out.print( request.getContextPath());
      out.write("/images/arrow.png\" width=\"17\" height=\"11\" align=\"center\" /></a>\n                                                    <ul>\n                                                \t<li><a href=\"#\">View Profile</a></li>\n                                                        <li><a href=\"#\">Log Out</a></li>\n                                                    </ul>\n                                                 </li>\n                                                </ul>   \t\n                                            </td>\n                                            <td>\n                                            <input type=\"text\" size=\"30\" value=\"Quick Search\" />\n                                            </td>\n                                        </tr>\n                                    </table>\n                                </td>\n                                \n                            </tr>\n                            <tr>\n                            <td colspan=\"2\" class=\"menu\" align=\"left\">\n                                <table width=\"100%\" border=\"0\"  cellpadding=\"0\" cellspacing=\"0\" height=\"25px\">\n");
      out.write("                                    <tr>\n                                    \t<td width=\"70%\">\n                                            <table width=\"520\" border=\"0\"  cellpadding=\"0\" cellspacing=\"0\" height=\"25px\">\n                                                <tr>\n                                    \n                                                <td width=\"50\">\n                                                <ul>\n                                                    <li><a href=\"");
      out.print( request.getContextPath () );
      out.write("/actions/dashBoard.do\">Dashboards</a>\n                                                       ");
      out.write("\n                                                    </li>\n                                                </ul>\n                                                </td>\n                                                <td width=\"100\">\n                                                    <ul>\n                                                    <li><a href=\"");
      out.print( request.getContextPath () );
      out.write("/actions/Welcome.do\">Projects<img style=\"border:0px\" src=\"");
      out.print( request.getContextPath());
      out.write("/images/arrow.png\" width=\"17\" height=\"11\" align=\"center\" /></a>\n                                                        <ul>\n                                                            <li><a href=\"");
      out.print( request.getContextPath () );
      out.write("/actions/createProject.do?action=1\" >Create New Project</a></li>\n                                                            <li><a href=\"");
      out.print( request.getContextPath () );
      out.write("/actions/projectList.do\">Current Projects</a></li>\n                                                            <li><a href=\"");
      out.print( request.getContextPath () );
      out.write("/actions/projectList.do\">View All Projects</a></li>\n                                                        </ul>\n                                                    </li>\n                                                    </ul> \n                                              </td>\n                                                <td width=\"100\">\n                                                    <ul>\n                                                    <li><a href=\"#\">Ticket<img style=\"border:0px\" src=\"");
      out.print( request.getContextPath());
      out.write("/images/arrow.png\" width=\"17\" height=\"11\" align=\"center\" /></a>\n                                                        <ul>\n                                                            <li><a href=\"");
      out.print( request.getContextPath () );
      out.write("/actions/ticket.do\">Search for Ticket</a></li>\n                                                            <li><a href=\"");
      out.print( request.getContextPath () );
      out.write("/actions/requestTicket.do\">Request Ticket</a></li>\n                                                            \n                                                        </ul>\n                                                    </li>\n                                                </ul> \n                                                </td>\n                                                <td width=\"100\">\n                                                    <ul>\n                                                    <li><a href=\"#\">Administration<img style=\"border:0px\" src=\"");
      out.print( request.getContextPath());
      out.write("/images/arrow.png\" width=\"17\" height=\"11\" align=\"center\" /></a>\n                                                        <ul>\n                                                            <li><a href=\"#\">Manage Projects <img style=\"border:0px\" src=\"");
      out.print( request.getContextPath());
      out.write("/images/arrowRight.png\" height=\"7\" width=\"4\" align=\"center\" /></a>\n                                                                <ul>\n                                                                    <li><a href=\"");
      out.print( request.getContextPath () );
      out.write("/actions/projectList.do\">View All Projects</a></li>\n                                                                    <li><a href=\"");
      out.print( request.getContextPath () );
      out.write("/actions/createProject.do?action=1\" >Create New Project</a></li>\n                                                                    <li><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/projectCategory.do\">Project Category</a></li>\n                                                                </ul>\n\n                                                            </li>\n                                                            \n                                                            ");
      out.write("\n                                                            \n                                                            <li><a href=\"#\">Manage User/Accounts <img style=\"border:0px\" src=\"");
      out.print( request.getContextPath());
      out.write("/images/arrowRight.png\" height=\"7\" width=\"4\" align=\"center\" /></a>\n                                                                <ul>\n                                                                    <li><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/userRoles.do\">User Roles/Group</a></li>\n                                                                    <li><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/users.do\">User Accounts</a></li>\n                                                                 </ul>\n\n                                                            </li>\n                                                            \n                                                            <li><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/permissions.do\">Permission Settings</a></li>\n                                                            \n                                                            <li><a href=\"#\">Global Variables Settings <img style=\"border:0px\" src=\"");
      out.print( request.getContextPath());
      out.write("/images/arrowRight.png\" height=\"7\" width=\"4\" align=\"center\" /></a>\n                                                                <ul>\n                                                                    <li><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/prioritySet.do\">Priority Settings</a></li>\n                                                                    <li><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/statusSet.do\">Project Status Settings</a></li>\n                                                                 </ul>\n\n                                                            </li>\n                                                           \n                                                        </ul>\n                                                    </li>\n                                                </ul> \n                                                </td>\n                                        \n                                            </tr>\n                                        </table>\n                                    </td>\n                                        <td width=\"40%\" align=\"right\">\n                                            <table>\n                                                <tr>\n                                                    <td width=\"100%\" align=\"right\">\n                                                    <ul>\n                                                      <li><a href=\"");
      out.print( request.getContextPath () );
      out.write("/actions/requestTicket.do\">[&nbsp;<img style=\"border:0px\" src=\"");
      out.print( request.getContextPath());
      out.write("/images/new_ticket_icon.png\" width=\"17\" height=\"15\" align=\"center\" /> &nbsp;Request Ticket&nbsp;]</a></li></ul>\n                                                    </td>\n                                                </tr>\n                                            </table>\n                                            </td>\n                                    </tr>\n                                </table>\n                            </td>      \n                       </tr>\n                   </table>\n             </div>\n\n");
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
