package com.itp.jsp.WEB_002dINF.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class role_005fsettings_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div>\n<table class=\"componentStyle\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n                                    \t<tr>\n                                        \t<td class=\"headerBox\">\n                                            \tUser Role Settings\n                                          </td>\n                                        </tr>\n                                        <tr>\n                                        \t<td style=\"font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; \">\n                                            \t<p>You can set different types of permissions to provide levels of functionality to users according to their needs. For example, you could create one level of permission that provides users read-only access to the issues and projects, and create another that provides users the ability to create, modify, and delete files and issues and projects.</p></td>\n                                        </tr>\n                                        <tr>\n");
      out.write("                                       \t  <td style=\"font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; \">\n                                          <hr/>\n                                            <div><br /><br />\n                                            <div class=\"blue_links\"> <a href=\"javascript:displayRoleDiv(1);\"   style=\"font-size:13px; vertical-align:middle;padding: .4em 1em .4em 10px;text-decoration: none;position: relative;\" class=\"ui-state-default ui-corner-all\"><b><img src=\"");
      out.print( request.getContextPath());
      out.write("/images/add_16.png\" width=\"16\" height=\"16\" alt=\"Add\"  border=\"0\"/> Create New Role</b></a></div>\n                                            <br /><br /><br />\n                                              <table width=\"100%\" border=\"1\" class=\"tableStyle\" cellpadding=\"0\" cellspacing=\"0\">\n                                                <tr >\n                                                  <th width=\"15%\">Name</th>\n                                                  <th width=\"24%\">Description</th>\n                                                  <th width=\"16%\">Permission(s)</th>\n                                                  <th width=\"14%\">Operations</th>\n                                                </tr>\n                                                <tr>\n                                                  <td>Admin1</td>\n                                                  <td>This permission allows the user to have the necessary access to issues.</td>\n                                                  <td><a href=\"\">Issues Permission #1</a>,&nbsp;<a href=\"\">Issues Permission #2</a>&nbsp;</td>\n");
      out.write("                                                  <td align=\"center\"><a href=\"\">Copy</a>&nbsp;|&nbsp;<a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                                                </tr>\n                                                <tr>\n                                                  <td>Admin2</td>\n                                                  <td>This permission allows the user to have the necessary access to issues.</td>\n                                                  <td><a href=\"\">Issues Permission #1</a>,&nbsp;<a href=\"\">Issues Permission #2</a>&nbsp;</td>\n                                                  <td align=\"center\"><a href=\"\">Copy</a>&nbsp;|&nbsp;<a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                                                </tr>\n                                                <tr>\n                                                  <td>user 1</td>\n                                                  <td>This permission allows the user to have the necessary access to issues.</td>\n");
      out.write("                                                  <td>&nbsp;<a href=\"\">Issues Permission #2</a>&nbsp;</td>\n                                                  <td align=\"center\"><a href=\"\">Copy</a>&nbsp;|&nbsp;<a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                                                </tr>\n                                               \n                                              </table>\n                                     \n                                            </div>\n                                            \n                                            <div  style=\"width:100%; text-align:right\">\n                                            \t<table width=\"100%\">\n                                                  <tr>\n                                                    \n                                                     <td align=\"left\"> Total result(s) found: 3</td>\n                                                     <td align=\"right\" class=\"right blue_links\"><a href=\"javascript:loadPrevPostedJobs();\" id=\"prevs2\">&laquo; PREV</a>  |  <a href=\"javascript:loadNextPostedJobs();\" id=\"next2\">NEXT &raquo;</a> | Go to \n");
      out.write("                                                 \t\t<select  id=\"goto2\" class=\"blue_links\" onchange=\"gotopage('goto2')\">\n                                                 \t\t\t\t<option value=\"1\">1</option>\n                                                                <option value=\"2\">2</option>\n                                                        </select>\n                                                        <input type=\"hidden\" id=\"max\" value=\"\"/>  <input type=\"hidden\" id=\"index\" value=\"0\"/>\n                                                    </td>\n                                                    </tr>\n                                                 </table>\n                                            </div>\n                                            \t\n                                            <div id=\"newRoleDIv\" style=\"width:900px; display:none\">\n                                                <br /><br /><br />\n                                                <table   cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n");
      out.write("                                                    <tr>\n                                                        <th class=\"tabBox\" width=\"20%\">\n                                                            New Role\n                                                      </th>\n                                                      <th  width=\"80%\" >\n                                                           \n                                                      </th>\n                                                    </tr>\n                                                    \n                                                    <tr>\n                                                        <td colspan=\"2\" style=\"background-color:#215F92\"   height=\"2\"></td>\n                                                      \n                                                    </tr>\n                                                     <tr>\n                                                        <td colspan=\"2\" style=\"border:#215F92 solid 1px \">\n");
      out.write("                                                            \t<table width=\"100%\" border=\"0\">\n                                                                  <tr>\n                                                                    <td width=\"20%\" >&nbsp;</td>\n                                                                    <td width=\"80%\" >&nbsp;</td>\n                                                                    \n                                                                  </tr>\n                                                                  <tr>\n                                                                    <td>Role\nName:</td>\n                                                                    <td><input type=\"  cols=\"80\"    /></td>\n                                                                   \n                                                                  </tr>\n                                                                  <tr>\n                                                                    <td>Description:</td>\n");
      out.write("                                                                    <td><textarea name=\"textarea\" cols=\"50\" ></textarea></td>\n                                                                  \n                                                                  </tr>\n                                                                   <tr>\n                                                                    <td>Select Permission:</td>\n                                                                    <td>\n                                                                    \t<select  id=\"goto2\" class=\"\" onchange=\"gotopage('goto2')\">\n                                                                            <option value=\"1\">Select ITP Component Here</option>\n                                                                            <option value=\"2\">2</option>\n                                                        \t\t\t\t</select>\n                                                        \t\t\t</td>\n                                                                   \n");
      out.write("                                                                  </tr>\n                                                                  <tr>\n                                                                    <td>&nbsp;</td>\n                                                                    <td >&nbsp;</td>\n                                                                  </tr>\n                                                                  <tr>\n                                                                    <td>Permission(s):</td>\n                                                                    <td >&nbsp;</td>\n                                                                  </tr>\n                                                                  <tr>\n                                                                    <td>&nbsp;</td>\n                                                                   \n                                                                    <td style=\"text-align:right\"><input type=\"button\" value=\"Save\" />&nbsp;&nbsp;&nbsp;<input type=\"button\" value=\"Cancel\" onclick=\"javascript:displayRoleDiv(0);\" /></td>\n");
      out.write("                                                                  </tr>\n                                                                </table>\n\n                                                        </td>\n                                                      \n                                                    </tr>\n                                                </table>\n                                            </div>\n                                          </td>\n                                        </tr>\n                                    </table>\n</div>\n\n<script language='javascript'> \n  function displayRoleDiv( bit){\n      if (bit==1)\n           document.getElementById('newRoleDIv').style.display='block';\n          else\n               document.getElementById('newRoleDIv').style.display='none';\n              \n  }\n</script>\n");
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
