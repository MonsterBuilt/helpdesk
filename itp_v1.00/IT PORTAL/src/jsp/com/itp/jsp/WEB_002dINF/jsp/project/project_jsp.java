package com.itp.jsp.WEB_002dINF.jsp.project;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class project_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/tld/struts-tiles.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftiles_005finsert_005fattribute_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ftiles_005finsert_005fattribute_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ftiles_005finsert_005fattribute_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid.release();
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

      out.write("\n\n\n<script type=\"text/javascript\">\n    $(function(){\n        // Tabs\n        $('#tabs').tabs();\n    });\n</script>\n<table class=\"componentStyle\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n    <tr>\n        <td class=\"headerBox\">\n            Project Information\n        </td>\n    </tr>\n    <tr>\n        <td>\n            ");
      if (_jspx_meth_tiles_005finsert_005f0(_jspx_page_context))
        return;
      out.write("\t\n        </td>\n    </tr>\n    <tr>\n        <td style=\"font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; \">\n            <hr/>\n            <div><br /><br />\n                <div class=\"\" style=\"vertical-align:middle\">\n                    <table width=\"100%\">\n                        <tr>\n                            <td width=\"60%\">\n                                <table width=\"100%\">\n                                    <tr>\n                                        <td><b>Project Name:&nbsp;&nbsp;");
      if (_jspx_meth_bean_005fwrite_005f0(_jspx_page_context))
        return;
      out.write("</b>\n                                        </td>\n                                    </tr>\n                                    <tr>\n                                        <td><b>Project Description:&nbsp;&nbsp;</b>");
      if (_jspx_meth_bean_005fwrite_005f1(_jspx_page_context))
        return;
      out.write("\n                                        </td>\n                                    </tr>\n                                    <tr>\n                                        <td><b>Category:&nbsp;&nbsp;</b>");
      if (_jspx_meth_bean_005fwrite_005f2(_jspx_page_context))
        return;
      out.write("</td>\n                                    </tr>\n                                    <tr>\n                                        <td><b>Company:&nbsp;&nbsp;</b>");
      if (_jspx_meth_bean_005fwrite_005f3(_jspx_page_context))
        return;
      out.write("</td>\n                                    </tr>\n                                    <tr>\n                                        <td><b>Project Lead:&nbsp;&nbsp;</b><a href=\"\" >");
      if (_jspx_meth_bean_005fwrite_005f4(_jspx_page_context))
        return;
      out.write("</a></td>\n                                    </tr>\n                                    <tr>\n                                        <td style=\"padding-left:40px;\">\n                                            <b>Member(s):&nbsp;&nbsp;</b><!--<a href=\"\" >Dominic Galdones</a>,&nbsp;<a href=\"\" >Michael Valladolid</a-->\n                                            ");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fpresent_005f0.setParent(null);
      _jspx_th_logic_005fpresent_005f0.setName("projectForm");
      _jspx_th_logic_005fpresent_005f0.setProperty("participantBeans");
      int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
      if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n                                                ");
          //  logic:notEmpty
          org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f0 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
          _jspx_th_logic_005fnotEmpty_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fnotEmpty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
          _jspx_th_logic_005fnotEmpty_005f0.setName("projectForm");
          _jspx_th_logic_005fnotEmpty_005f0.setProperty("participantBeans");
          int _jspx_eval_logic_005fnotEmpty_005f0 = _jspx_th_logic_005fnotEmpty_005f0.doStartTag();
          if (_jspx_eval_logic_005fnotEmpty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n                                                    ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
              _jspx_th_logic_005fiterate_005f0.setName("projectForm");
              _jspx_th_logic_005fiterate_005f0.setProperty("participantBeans");
              _jspx_th_logic_005fiterate_005f0.setId("pa");
              int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object pa = null;
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f0.doInitBody();
                }
                pa = (java.lang.Object) _jspx_page_context.findAttribute("pa");
                do {
                  out.write("\n                                                        <a href=\"\" >");
                  if (_jspx_meth_bean_005fwrite_005f5(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("</a>,&nbsp;\n                                                    ");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                  pa = (java.lang.Object) _jspx_page_context.findAttribute("pa");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
              out.write("\n                                                ");
              int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fnotEmpty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
          out.write("\n                                            ");
          int evalDoAfterBody = _jspx_th_logic_005fpresent_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fpresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
      out.write("\n                                        </td>\n                                    </tr>\n                                    <!-- tr>\n                                                                  <td ><b>Project Roles:&nbsp;&nbsp;</b>(<a href=\"\" >View User Roles</a>)</td>\n                                    </tr -->\n                                    <tr>\n                                        <td ><b>Status:&nbsp;&nbsp;</b>");
      if (_jspx_meth_bean_005fwrite_005f6(_jspx_page_context))
        return;
      out.write("</td>\n                                    </tr>\n                                    <tr>\n                                        <td ><b>Priority:&nbsp;&nbsp;</b>");
      if (_jspx_meth_bean_005fwrite_005f7(_jspx_page_context))
        return;
      out.write("</td>\n                                    </tr>\n                                    <tr>\n                                        <td ><b>Starting Date:&nbsp;&nbsp;</b>");
      if (_jspx_meth_bean_005fwrite_005f8(_jspx_page_context))
        return;
      out.write("</td>\n                                    </tr>\n                                    <tr>\n                                        <td ><b>Ending Date:&nbsp;&nbsp;</b>");
      if (_jspx_meth_bean_005fwrite_005f9(_jspx_page_context))
        return;
      out.write("</td>\n                                    </tr>\n                                    <tr>\n                                        <td ><b>Estimated hours:&nbsp;&nbsp;</b>");
      if (_jspx_meth_bean_005fwrite_005f10(_jspx_page_context))
        return;
      out.write(" hrs</td>\n                                    </tr>\n                                    <tr>\n                                        <td ><b>Budget:&nbsp;&nbsp;</b>");
      if (_jspx_meth_bean_005fwrite_005f11(_jspx_page_context))
        return;
      out.write("</td>\n                                    </tr>\n                                </table>\n                                \n                            </td>\n                            <td width=\"40%\" style=\"vertical-align:top\">\n                                \n                                \n                            </td>\n                        </tr>\n                    </table>\n                </div>\n                <br />\n                <div class=\"blue_links\" style=\"vertical-align:middle; text-align:center\"> \t\n                    <a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/createProject.do?action=3&projectId=");
      if (_jspx_meth_bean_005fwrite_005f12(_jspx_page_context))
        return;
      out.write("\"  style=\"font-size:12px; vertical-align:middle\">\n                    <b><img src=\"");
      out.print( request.getContextPath());
      out.write("/images/edit_icon.gif\" width=\"16\" height=\"16\" alt=\"Add\"  border=\"0\"/> Edit Project</b></a>&nbsp;&nbsp;|\n                    <a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/projectList.do\"  style=\"font-size:12px; vertical-align:middle\">\n                    <b><img src=\"");
      out.print( request.getContextPath());
      out.write("/images/browse_icon.png\" width=\"16\" height=\"16\" alt=\"Add\"  border=\"0\"/> Browse Project</b></a>&nbsp;&nbsp;|\n                    \n                    <a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/createProject.do?action=1\"  style=\"font-size:12px; vertical-align:middle\">\n                    <b><img src=\"");
      out.print( request.getContextPath());
      out.write("/images/add_16.png\" width=\"16\" height=\"16\" alt=\"Add\"  border=\"0\"/> Create New Project</b></a>&nbsp;&nbsp;\n                </div>\n            </div>\n            \n            \n            <br /><br /><br />\t\n            \n            <div id=\"tabs\">\n                <ul>\n                    <li><a href=\"#tabs-1\" style=\"font-family:Tahoma, Geneva, sans-serif;\">Project Assets</a></li>\n                    <li><a href=\"#tabs-2\" style=\"font-family:Tahoma, Geneva, sans-serif;\">Notes (4)</a></li>\n                    <li><a href=\"#tabs-3\" style=\"font-family:Tahoma, Geneva, sans-serif;\">Components </a></li>\n                    <li><a href=\"#tabs-4\" style=\"font-family:Tahoma, Geneva, sans-serif;\">Versions</a></li>\n                    <li><a href=\"#tabs-5\" style=\"font-family:Tahoma, Geneva, sans-serif;\">Tickets(3)</a></li>\n                </ul>\n                <div id=\"tabs-1\" style=\"font-size:12px;font-family:Arial, Helvetica, sans-serif;\">\n                    <table  width=\"1000\"  cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\" style=\";font-size:12px;font-family:Arial, Helvetica, sans-serif;\">\n");
      out.write("                        <tr>\n                            <th  width=\"30%\">\n                            </th>\n                            <th   width=\"70%\" class=\"blue_links\" style=\"text-align:right; padding-right:10px; font-weight:normal\" >\n                                <a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/createProjectAsset.do\" style=\"font-size:12px; vertical-align:middle\">\n                                <b><img src=\"");
      out.print( request.getContextPath());
      out.write("/images/add_16.png\" width=\"16\" height=\"16\" alt=\"Add\"  border=\"0\"/> Add New Asset</b></a>&nbsp;&nbsp;\n                            </th>\n                        </tr>\n                        \n                        <tr>\n                            <td colspan=\"2\" style=\"background-color:#215F92 ;height:1px\" ></td>\n                            \n                        </tr>\n                        <tr>\n                            <td colspan=\"2\" style=\"border:#215F92 solid 1px; padding: 15px 5px 5px 5px; \">\n                                \n                                <table width=\"100%\" border=\"0\" class=\"tableStyle\" cellpadding=\"0\" cellspacing=\"0\">\n                                    <tr >\n                                        <th width=\"14%\">Name</th>\n                                        <th width=\"34%\">Description</th>\n                                        <th width=\"9%\">Cost</th>\n                                        <th width=\"12%\">Date Budgeted</th>\n                                        <th width=\"13%\">Approved By</th>\n");
      out.write("                                        <th width=\"11%\">Date Approved</th>\n                                        <th width=\"7%\">Operations</th>\n                                    </tr>\n                                    <tr>\n                                        <td>AIX Unix Server</td>\n                                        <td>New AIX Server to be used for production server.</td>\n                                        <td>$ 5,000</td>\n                                        <td>June 5, 2011</td>\n                                        <td>David Pickron</td>\n                                        <td>June 7, 2011</td>\n                                        <td align=\"center\"><a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                                    </tr>\n                                    <tr>\n                                        <td>AIX Unix Server</td>\n                                        <td>New AIX Server to be used for production server.</td>\n                                        <td>$ 6,000</td>\n");
      out.write("                                        <td>June 5, 2011</td>\n                                        <td>David Pickron</td>\n                                        <td>June 7, 2011</td>\n                                        <td align=\"center\"><a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                                    </tr>\n                                    <tr>\n                                        <td>AIX Unix Server</td>\n                                        <td>New AIX Server to be used for production server.</td>\n                                        <td>$ 5,040</td>\n                                        <td>June 5, 2011</td>\n                                        <td>David Pickron</td>\n                                        <td>June 7, 2011</td>\n                                        <td align=\"center\"><a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                                    </tr>\n                                    <tr>\n                                        <td  style=\"border:0px;\">&nbsp;</td>\n");
      out.write("                                        <td style=\"border:0px;text-align:right\"><b>Total Cost:</b></td>\n                                        <td colspan=\"5\" style=\"border:0px;\">$ 16,040.00</td>\n                                    </tr>\n                                </table>\n                                \n                            </td>\n                            \n                        </tr>\n                    </table>\n                </div>\n                \n                <div id=\"tabs-2\" style=\"font-size:12px;font-family:Arial, Helvetica, sans-serif;color:#000\">\n                    <br/>\n                    <a id=\"dialog_link_new_note\" href=\"");
      out.print( request.getContextPath());
      out.write("/actions/createProject.do?action=1\"  style=\"font-size:13px; vertical-align:middle;padding: .4em 1em .4em 10px;text-decoration: none;position: relative;\" class=\"ui-state-default ui-corner-all\">\n                    <b><img src=\"");
      out.print( request.getContextPath());
      out.write("/images/icon-new-note.png\" width=\"16\" height=\"16\" alt=\"Add\"  border=\"0\"/>&nbsp;Add New Note</b></a>\n                    <br/>\n                    <br/>\n                    <div >Advanced Search\n                        <table width=\"100%\"   cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n                            \n                            \n                            <tr>\n                                <td colspan=\"2\" style=\"background-color:#215F92\"   height=\"2\"></td>\n                                \n                            </tr>\n                            <tr>\n                                <td colspan=\"2\" style=\"border:#215F92 solid 1px \">\n                                    <table width=\"100%\" border=\"0\">\n                                        <tr>\n                                            <td width=\"100%\">Search:&nbsp;\n                                                <input type=\"text\" value=\"Quick Search\"  cols=\"80\"    />\n                                                \n                                                &nbsp;&nbsp;Order by:\n");
      out.write("                                                <select name=\"goto\" class=\"\"  id=\"goto\" onchange=\"gotopage('goto2')\">\n                                                    <option value=\"1\">Priority</option>\n                                                    <option value=\"2\">Name</option>\n                                                    <option value=\"2\">Date Started</option>\n                                                </select>\n                                                &nbsp;&nbsp; Order:&nbsp; \n                                                <select name=\"goto\" class=\"\"  id=\"goto\" onchange=\"gotopage('goto2')\">\n                                                    <option value=\"1\">Ascending</option>\n                                                    <option value=\"2\">Descending</option>\n                                                    \n                                                </select>\n                                                &nbsp;&nbsp; Filter:&nbsp; \n                                                <select name=\"goto\" class=\"\"  id=\"goto\" onchange=\"gotopage('goto2')\">\n");
      out.write("                                                    <option value=\"1\">Show All</option>\n                                                    <option value=\"2\">New</option>\n                                                    <option value=\"3\">In Progress</option>\n                                                    <option value=\"4\">Completed</option>\n                                                </select>\n                                                <span style=\"text-align:right\">&nbsp;&nbsp;&nbsp;&nbsp;\n                                                    <input type=\"button\" value=\"Search\" />\n                                            </span></td>\n                                        </tr>\n                                </table></td>\n                                \n                            </tr>\n                        </table>\n                    </div>\n                    <br />\n                    \n                    <!-- Start of table for the note message -->\n                    <table  class=\"ui-state-custom ui-corner-all \"  style=\"border-color:#ccc; background-color:#FFF;color:#000; text-decoration:none; font-style:normal; \" width=\"1000\" >\n");
      out.write("                        <tr>\n                            <td colspan=\"3\">\n                                <table height=\"73\"  border=\"0\"cellpadding=\"0\" cellspacing=\"0\">\n                                    <tr>\n                                        <td valign=\"top\">\n                                            <table>\n                                                <tr>\n                                                    <td width=\"153\" align=\"center\" style=\"vertical-align:top\"><img src=\"");
      out.print( request.getContextPath());
      out.write("/images/davidp.jpg\" alt=\"\" width=\"69\" height=\"60\" /></td>\n                                                </tr>\n                                                <tr>\n                                                    <td align=\"center\" valign=\"top\">David Pickron</td>\n                                                </tr>\n                                            </table>\n                                        </td>\n                                        <td width=\"844\">\n                                            <table cellpadding=\"1\" cellspacing=\"1\">\n                                                <tr>\n                                                    <td  style=\"padding-right:5px;\" >Note Summary: &nbsp;&nbsp;Error encountered during connection.. \n                                                    </td>\n                                                </tr>\n                                                <tr>\n                                                    <td width=\"844\" align=\"left\" valign=\"top\" class=\"blue_links\">\n");
      out.write("                                                        <table width=\"100%\" class=\"blue_links\"><tr>\n                                                    <td  width=\"50%\"><span style=\"color:#39C\">Sent:</span> Thu 6/9/2011 4:54 AM</td><td align=\"right\" width=\"50%\"><a href=\"\">Edit</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href=\"\">Delete</a></td></tr></table></td>\n                                                </tr>\n                                                \n                                                <tr>\n                                                    <td class=\"divStyle\" style=\"padding-right:5px;\" >\n                                                        <p>Error encountered during connection.. Is there posibilities to resolve such an error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such an error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such an error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such an error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such an error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such an error in all our applications? this is just a test.\n");
      out.write("                                                        </p>\n                                                    </td>\n                                                </tr>\n                                                \n                                                \n                                            </table>\n                                            \n                                        </td>\n                                    </tr>\n                                </table>\n                            </td>\n                        </tr>\n                        \n                        <tr style=\" border-top:thin solid #666 \">\n                            <td width=\"73\"   valign=\"top\" style=\"padding:10px;\">Attachment:</td>\n                            <td   valign=\"top\" style=\"padding:10px;\">\n                                <div>\n                                    \n                                    <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/attachment_icon_black.gif\" />&nbsp;&nbsp;&nbsp;&nbsp;fileName.txt&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"#\" class=\"blue_links\">[X]</a>\n                                    \n                                </div>\n                            </td>\n                            <td width=\"228\" align=\"right\" valign=\"top\"  class=\"blue_links\" style=\"padding:10px\"><a href=\"\">Download</a>  |  <a href=\"\">Read More</a></td>\n                        </tr>\n                        \n                    </table>\n                    <br/>\n                    <br/>\n                    <table  class=\"ui-state-custom ui-corner-all \"  style=\"border-color:#ccc; background-color:#FFF;color:#000; text-decoration:none; font-style:normal; \" width=\"1000\" >\n                        <tr>\n                            <td colspan=\"3\">\n                                <table height=\"73\"  border=\"0\"cellpadding=\"0\" cellspacing=\"0\">\n                                    <tr>\n                                        <td valign=\"top\">\n                                            <table>\n");
      out.write("                                                <tr>\n                                                    <td width=\"153\" align=\"center\" style=\"vertical-align:top\"><img src=\"");
      out.print( request.getContextPath());
      out.write("/images/davidp.jpg\" alt=\"\" width=\"69\" height=\"60\" /></td>\n                                                </tr>\n                                                <tr>\n                                                    <td align=\"center\" valign=\"top\">David Pickron</td>\n                                                </tr>\n                                            </table>\n                                        </td>\n                                        <td width=\"844\">\n                                            <table cellpadding=\"1\" cellspacing=\"1\">\n                                                <tr>\n                                                    <td  style=\"padding-right:5px;\" >Note Summary: &nbsp;&nbsp;Error encountered during connection.. \n                                                    </td>\n                                                </tr>\n                                                <tr>\n                                                    <td width=\"844\" align=\"left\" valign=\"top\" class=\"blue_links\">\n");
      out.write("                                                        <table width=\"100%\" class=\"blue_links\"><tr>\n                                                    <td  width=\"50%\"><span style=\"color:#39C\">Sent:</span> Thu 6/9/2011 4:54 AM</td><td align=\"right\" width=\"50%\"><a href=\"\">Edit</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href=\"\">Delete</a></td></tr></table></td>\n                                                </tr>\n                                                \n                                                <tr>\n                                                    <td class=\"divStyle\" style=\"padding-right:5px;\" >\n                                                        <p>Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.Error encountered during connection.. Is there posibilities to resolve such this error in all our applications? this is just a test.\n");
      out.write("                                                        </p>\n                                                    </td>\n                                                </tr>\n                                                \n                                                \n                                            </table>\n                                            \n                                        </td>\n                                    </tr>\n                                </table>\n                            </td>\n                        </tr>\n                        \n                        <tr style=\" border-top:thin solid #666 \">\n                            <td width=\"73\"   valign=\"top\" style=\"padding:10px;\">Attachment:</td>\n                            <td   valign=\"top\" style=\"padding:10px;\">\n                                <div>\n                                    \n                                    <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/attachment_icon_black.gif\" />&nbsp;&nbsp;&nbsp;&nbsp;fileName.txt&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"#\" class=\"blue_links\">[X]</a>\n                                    \n                                </div>\n                            </td>\n                            <td width=\"228\" align=\"right\" valign=\"top\"  class=\"blue_links\" style=\"padding:10px\"><a href=\"\">Download</a>  |  <a href=\"\">Read More</a></td>\n                        </tr>\n                        \n                    </table>\n                    <!-- end of table for the note message -->\n                    \n                    <br/>\n                    <br/>\n                    \n                    \n                    \n                    \n                </div>\n                \n                <div id=\"tabs-3\" style=\"font-size:12px;font-family:Arial, Helvetica, sans-serif;\">\n                    <table  width=\"1000\"  cellpadding=\"0\"  cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n                        <tr>\n                            <th  width=\"30%\">\n");
      out.write("                            </th>\n                            <th   width=\"70%\" class=\"blue_links\" style=\"text-align:right; padding-right:10px; font-weight:normal\" >\n                                <a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/createProjectComponent.do\" style=\"font-size:12px; vertical-align:middle\">\n                                <b><img src=\"");
      out.print( request.getContextPath());
      out.write("/images/add_16.png\" width=\"16\" height=\"16\" alt=\"Add\"  border=\"0\"/> Add New Component</b></a>&nbsp;&nbsp;\n                            </th>\n                        </tr>\n                        \n                        <tr>\n                            <td colspan=\"2\" style=\"background-color:#215F92 ;height:1px\" ></td>\n                            \n                        </tr>\n                        <tr>\n                            <td colspan=\"2\" style=\"border:#215F92 solid 1px; padding: 15px 5px 5px 5px; \">\n                                \n                                <table width=\"100%\"  class=\"tableStyle\" border=\"1\"   cellpadding=\"0\" cellspacing=\"0\">\n                                    <tbody>\n                                        <tr >\n                                            <th width=\"14%\">Name</th>\n                                            <th width=\"34%\">Description</th>\n                                            \n                                            <th width=\"11%\">Component Lead</th>\n");
      out.write("                                            <th width=\"7%\">Operations</th>\n                                        </tr>\n                                        <tr>\n                                            <td>Java Web Application</td>\n                                            <td>This permission allows the user to have the necessary access to issues.</td>\n                                            \n                                            <td>Daryl Galdones</td>\n                                            <td align=\"center\"><a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                                        </tr>\n                                        <tr>\n                                            <td>ASP.Net</td>\n                                            <td>This permission allows the user to have the necessary access to issues.</td>\n                                            \n                                            <td>Dominic</td>\n                                            <td align=\"center\"><a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n");
      out.write("                                        </tr>\n                                        <tr>\n                                            <td>PHP</td>\n                                            <td>This permission allows the user to have the necessary access to issues.</td>\n                                            \n                                            <td >Michael</td>\n                                            <td align=\"center\"><a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                                        </tr>\n                                    </tbody>\n                                </table>\n                                \n                            </td>\n                            \n                        </tr>\n                    </table>\n                    \n                </div>\n                \n                <div id=\"tabs-4\" style=\"font-size:12px;font-family:Arial, Helvetica, sans-serif;\">\n                    <table  width=\"1000\"  cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n");
      out.write("                        <tr>\n                            <th  width=\"30%\">\n                            </th>\n                            <th   width=\"70%\" class=\"blue_links\" style=\"text-align:right; padding-right:10px; font-weight:normal\" >\n                                <a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/createProjectVersion.do\" style=\"font-size:12px; vertical-align:middle\">\n                                <b><img src=\"");
      out.print( request.getContextPath());
      out.write("/images/add_16.png\" width=\"16\" height=\"16\" alt=\"Add\"  border=\"0\"/> Add New Version</b></a>&nbsp;&nbsp;\n                            </th>\n                        </tr>\n                        \n                        <tr>\n                            <td colspan=\"2\" style=\"background-color:#215F92 ;height:1px\" ></td>\n                            \n                        </tr>\n                        <tr>\n                            <td colspan=\"2\" style=\"border:#215F92 solid 1px; padding: 15px 5px 5px 5px; \"><table width=\"100%\" border=\"0\" class=\"tableStyle\" style=\"border:thin\" cellpadding=\"0\" cellspacing=\"0\">\n                                    <tr >\n                                        <th width=\"10%\">Name</th>\n                                        <th width=\"36%\">Description</th>\n                                        <th width=\"11%\">Schedule</th>\n                                        <th width=\"10%\">Approved By</th>\n                                        <th width=\"11%\">Date Approved</th>\n                                        <th width=\"12%\">Date Released</th>\n");
      out.write("                                        <th width=\"10%\">Operations</th>\n                                    </tr>\n                                    <tr>\n                                        <td>Version 1.0</td>\n                                        <td>This permission allows the user to have the necessary access to issues.</td>\n                                        <td>Jun 6, 2011</td>\n                                        <td>David Pickron</td>\n                                        <td>May 30, 2011</td>\n                                        <td>Jun 10, 2011</td>\n                                        <td align=\"center\"><a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                                    </tr>\n                                    <tr>\n                                        <td>Version 1.1</td>\n                                        <td>This permission allows the user to have the necessary access to issues.</td>\n                                        <td>Jun 6, 2011</td>\n");
      out.write("                                        <td>David Pickron</td>\n                                        <td>Jun 10, 2011</td>\n                                        <td>Jun 30, 2011</td>\n                                        <td align=\"center\"><a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                                    </tr>\n                            </table></td>\n                            \n                        </tr>\n                    </table>\n                </div>\n                \n                <div id=\"tabs-5\" style=\"font-size:12px;font-family:Arial, Helvetica, sans-serif;\">\n                    \n                    <table  width=\"1100\"  cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n                        <tr>\n                            <td>                                                                               \n                                \n                                <div >Advanced Search\n                                    <table width=\"1100\"   cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n");
      out.write("                                        \n                                        \n                                        <tr>\n                                            <td colspan=\"2\" style=\"background-color:#215F92\"   height=\"2\"></td>\n                                            \n                                        </tr>\n                                        <tr>\n                                            <td colspan=\"2\" style=\"border:#215F92 solid 1px \">\n                                                <table width=\"100%\" border=\"0\">\n                                                    <tr>\n                                                        <td width=\"100%\">Search:&nbsp;\n                                                            <input type=\"text\" value=\"Quick Search\"  cols=\"80\"    />\n                                                            \n                                                            &nbsp;&nbsp;Status:\n                                                            <select name=\"goto\" class=\"\"  id=\"goto\" onchange=\"gotopage('goto2')\">\n");
      out.write("                                                                <option value=\"1\">Priority</option>\n                                                                <option value=\"2\">Name</option>\n                                                                <option value=\"2\">Date Started</option>\n                                                            </select>\n                                                            &nbsp;&nbsp; Action:&nbsp; \n                                                            <select name=\"goto\" class=\"\"  id=\"goto\" onchange=\"gotopage('goto2')\">\n                                                                <option value=\"1\">Open</option>\n                                                                <option value=\"2\">Closed</option>\n                                                                \n                                                            </select>\n                                                            <span style=\"text-align:right\">&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                                                <input type=\"button\" value=\"Search\" />\n                                                        </span></td>\n                                                    </tr>\n                                            </table></td>\n                                            \n                                        </tr>\n                                    </table>\n                                </div>\n                                \n                            </td>\n                        </tr>\n                        <tr>\n                            <td>\n                                \n                                <table width=\"1100\" class=\"tableStyle\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" align=\"left\">\n                                    \n                                    <tr>\n                                        <th width=\"13%\">Ticket_id</th>\n                                        <th width=\"28%\">Subject</th>\n                                        <th width=\"10%\">Requested By</th>\n");
      out.write("                                        <th width=\"13%\">Date Requested</th>\n                                        <th width=\"8%\">Age(Days)</th>\n                                        <th width=\"7%\">Type</th>\n                                        <th width=\"10%\">Action Taken</th>\n                                        <th width=\"11%\">Operation</th>\n                                    </tr>\n                                    <tr>\n                                        <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\">ITP001-000-060712</a></td>\n                                        <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS...</b></a></td>\n                                        <td>Kevin Neus</td>\n                                        <td>Jun 6, 2011 6:49 AM</td>\n                                        <td align=\"center\">1</td>\n                                        <td align=\"center\">Bug</td><br />\n                                        <td>Pending</td>\n                                        <td><a href=\"\">View</a>&nbsp;|&nbsp;<a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                                    </tr>\n                                    <tr>\n                                        <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\">ITP001-000-060712</a></td>\n                                        <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS...</b></a></td>\n                                        <td>Kevin Neus</td>\n                                        <td>Jun 6, 2011 6:49 AM</td>\n                                        <td align=\"center\">1</td>\n                                        <td align=\"center\">Trivial</td><br />\n                                        <td>Pending</td>\n                                        <td><a href=\"\">View</a>&nbsp;|&nbsp;<a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                                    </tr>\n                                    <tr>\n                                        <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\">ITP001-000-060712</a></td>\n                                        <td><a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/ticketDtls.do\"><b>NEED HELP*** NEED WINSCP/SFTP SITE ACCESS...</b></a></td>\n                                        <td>Kevin Neus</td>\n                                        <td>Jun 6, 2011 6:49 AM</td>\n                                        <td align=\"center\">1</td>\n                                        <td align=\"center\">Bug</td><br />\n                                        <td>Pending</td>\n                                        <td><a href=\"\">View</a>&nbsp;|&nbsp;<a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                                    </tr>\n                                </table>\n                                \n                            </td>\n                        </tr>\n                        <tr>\n                            <td>\n                                <div  style=\"width:1100; text-align:right\">\n                                    <table width=\"1100\">\n                                        <tr>\n                                            <td align=\"left\"> Total result(s) found: 1</td>\n");
      out.write("                                            <td align=\"right\" class=\"right blue_links\"><a href=\"javascript:loadPrevPostedJobs();\" id=\"prevs2\">&laquo; PREV</a>  |  <a href=\"javascript:loadNextPostedJobs();\" id=\"next2\">NEXT &raquo;</a> | Go to \n                                                <select  id=\"goto2\" class=\"blue_links\" onchange=\"gotopage('goto2')\">\n                                                    <option value=\"1\">1</option>\n                                                    <option value=\"2\">2</option>\n                                                </select>\n                                                <input type=\"hidden\" id=\"max\" value=\"\"/>  <input type=\"hidden\" id=\"index\" value=\"0\"/>\n                                            </td>\n                                        </tr>\n                                    </table>\n                                </div>\n                            </td>\n                        </tr>\n                    </table>\n                </div>\n                \n");
      out.write("            </div>\n            \n            \n            <br /><br />\n            \n        </td>\n    </tr>\n</table>\n\n<!-- dialogs -->\n\n<div id=\"dialogNewNote\" title=\"Add New Note\">\n    \n    <table style=\"border:#E1E2E3 solid 0px;padding:10px\" width=\"750\">\n        <tr>\n            <td >\n                <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n                    <tr>\n                        <td  align=\"left\" valign=\"top\">\n                            Messages\n                        </td>\n                    </tr>\n                    <tr>\n                        <td  valign=\"top\">\n                            <textarea cols=\"120\" rows=\"20\"></textarea>\n                        </td>\n                    </tr>\n                </table>\n            </td>       \t                \n        </tr>\n        <tr>\n            <td  height=\"35\">Attachment: &nbsp;<input type=\"file\" name=\"dataFile\" size=\"25\"/></td>\n            \n        </tr>\n        <tr>\n            <td >\n                <div>\n                    <table cellpadding=\"2\" cellspacing=\"2\" width=\"100%\">\n");
      out.write("                        <tr>\n                            <td>\n                                <img src=\"");
      out.print( request.getContextPath());
      out.write("/images/attachment_icon_black.gif\" />&nbsp;&nbsp;&nbsp;&nbsp;fileName.txt&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"#\" class=\"blue_links\">[X]</a>\n                            </td>\n                        </tr>\n                    </table>\n                </div>\n            </td>\n        </tr>\n        \n    </table>\n</div>\n\n\n<script type=\"text/javascript\">\n    $(function(){\n\n                                \n\n        // Dialog\t\t\t\n        $('#dialogNewNote').dialog({\n            autoOpen: false,\n            width: 800,\n            modal: true,\n            buttons: {\n                \"Post\": function() { \n                    $(this).dialog(\"close\"); \n                }, \n                \"Cancel\": function() { \n                    $(this).dialog(\"close\"); \n                } \n            }\n        });\n                                \n        // Dialog Link\n        $('#dialog_link_new_note').click(function(){\n            $('#dialogNewNote').dialog('open');\n            return false;\n        });  \n    });\n    \n                                               \n");
      out.write("</script>\n\n\n");
      out.write('\n');
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

  private boolean _jspx_meth_tiles_005finsert_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_005finsert_005f0 = (org.apache.struts.taglib.tiles.InsertTag) _005fjspx_005ftagPool_005ftiles_005finsert_005fattribute_005fnobody.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_005finsert_005f0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsert_005f0.setParent(null);
    _jspx_th_tiles_005finsert_005f0.setAttribute("applicationMessage");
    int _jspx_eval_tiles_005finsert_005f0 = _jspx_th_tiles_005finsert_005f0.doStartTag();
    if (_jspx_th_tiles_005finsert_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005finsert_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005finsert_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent(null);
    _jspx_th_bean_005fwrite_005f0.setName("projectForm");
    _jspx_th_bean_005fwrite_005f0.setProperty("projectName");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent(null);
    _jspx_th_bean_005fwrite_005f1.setName("projectForm");
    _jspx_th_bean_005fwrite_005f1.setProperty("projectDescription");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent(null);
    _jspx_th_bean_005fwrite_005f2.setName("projectForm");
    _jspx_th_bean_005fwrite_005f2.setProperty("projectCategoryName");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f3.setParent(null);
    _jspx_th_bean_005fwrite_005f3.setName("projectForm");
    _jspx_th_bean_005fwrite_005f3.setProperty("companyName");
    int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
    if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f4.setParent(null);
    _jspx_th_bean_005fwrite_005f4.setName("projectForm");
    _jspx_th_bean_005fwrite_005f4.setProperty("projectLeadFullName");
    int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
    if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_bean_005fwrite_005f5.setName("pa");
    _jspx_th_bean_005fwrite_005f5.setProperty("fullName");
    int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
    if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f6 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f6.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f6.setParent(null);
    _jspx_th_bean_005fwrite_005f6.setName("projectForm");
    _jspx_th_bean_005fwrite_005f6.setProperty("projectStatusName");
    int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
    if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f7.setParent(null);
    _jspx_th_bean_005fwrite_005f7.setName("projectForm");
    _jspx_th_bean_005fwrite_005f7.setProperty("priorityName");
    int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
    if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f8 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f8.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f8.setParent(null);
    _jspx_th_bean_005fwrite_005f8.setName("projectForm");
    _jspx_th_bean_005fwrite_005f8.setProperty("startDateString");
    int _jspx_eval_bean_005fwrite_005f8 = _jspx_th_bean_005fwrite_005f8.doStartTag();
    if (_jspx_th_bean_005fwrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f9 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f9.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f9.setParent(null);
    _jspx_th_bean_005fwrite_005f9.setName("projectForm");
    _jspx_th_bean_005fwrite_005f9.setProperty("endDateString");
    int _jspx_eval_bean_005fwrite_005f9 = _jspx_th_bean_005fwrite_005f9.doStartTag();
    if (_jspx_th_bean_005fwrite_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f10 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f10.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f10.setParent(null);
    _jspx_th_bean_005fwrite_005f10.setName("projectForm");
    _jspx_th_bean_005fwrite_005f10.setProperty("estimatedHours");
    int _jspx_eval_bean_005fwrite_005f10 = _jspx_th_bean_005fwrite_005f10.doStartTag();
    if (_jspx_th_bean_005fwrite_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f11 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f11.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f11.setParent(null);
    _jspx_th_bean_005fwrite_005f11.setName("projectForm");
    _jspx_th_bean_005fwrite_005f11.setProperty("budgetString");
    int _jspx_eval_bean_005fwrite_005f11 = _jspx_th_bean_005fwrite_005f11.doStartTag();
    if (_jspx_th_bean_005fwrite_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f12 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f12.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f12.setParent(null);
    _jspx_th_bean_005fwrite_005f12.setName("projectForm");
    _jspx_th_bean_005fwrite_005f12.setProperty("projectId");
    int _jspx_eval_bean_005fwrite_005f12 = _jspx_th_bean_005fwrite_005f12.doStartTag();
    if (_jspx_th_bean_005fwrite_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
    return false;
  }
}
