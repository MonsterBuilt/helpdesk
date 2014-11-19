package com.itp.jsp.WEB_002dINF.jsp.project;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class project_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
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

      out.write("\n\n\n\n<div>\n    <table class=\"componentStyle\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n        <tr>\n            <td class=\"headerBox\">\n            Projects</td>\n        </tr>\n        <tr>\n            <td style=\"font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; \">\n            <p>You can set different types of permissions to provide levels of functionality to users according to their needs. For example, you could create one level of permission that provides users read-only access to the issues and projects, and create another that provides users the ability to create, modify, and delete files and issues and projects.</p></td>\n        </tr>\n        <tr>\n            <td style=\"font-size:12px; font-family:Arial, Helvetica, sans-serif; padding:10px; \">\n                <hr/>\n                <div><br /><br />\n                    <div class=\"blue_links\" style=\"vertical-align:middle\"> <a href=\"");
      out.print( request.getContextPath());
      out.write("/actions/createProject.do?action=1\"  style=\"font-size:13px; vertical-align:middle;padding: .4em 1em .4em 10px;text-decoration: none;position: relative;\" class=\"ui-state-default ui-corner-all\"><b><img src=\"");
      out.print( request.getContextPath());
      out.write("/images/add_16.png\" width=\"16\" height=\"16\" alt=\"Add\"  border=\"0\"/> Create New Project</b></a> </div>\n                    <br /><br />\n                    \n                    <div >Advanced Search\n                        <table width=\"100%\"   cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n                            \n                            \n                            <tr>\n                                <td colspan=\"2\" style=\"background-color:#215F92\"   height=\"2\"></td>\n                                \n                            </tr>\n                            <tr>\n                                <td colspan=\"2\" style=\"border:#215F92 solid 1px \">\n                                    <table width=\"100%\" border=\"0\">\n                                        <tr>\n                                            <td width=\"100%\">Search:&nbsp;\n                                                <input type=\"text\" value=\"Quick Search\"  cols=\"80\"    />\n                                                \n                                                &nbsp;&nbsp;Order by:\n");
      out.write("                                                <select name=\"goto\" class=\"\"  id=\"goto\" onchange=\"gotopage('goto2')\">\n                                                    <option value=\"1\">Priority</option>\n                                                    <option value=\"2\">Name</option>\n                                                    <option value=\"2\">Date Started</option>\n                                                </select>\n                                                &nbsp;&nbsp; Order:&nbsp; \n                                                <select name=\"goto\" class=\"\"  id=\"goto\" onchange=\"gotopage('goto2')\">\n                                                    <option value=\"1\">Ascending</option>\n                                                    <option value=\"2\">Descending</option>\n                                                    \n                                                </select>\n                                                &nbsp;&nbsp; Filter:&nbsp; \n                                                <select name=\"goto\" class=\"\"  id=\"goto\" onchange=\"gotopage('goto2')\">\n");
      out.write("                                                    <option value=\"1\">Show All</option>\n                                                    <option value=\"2\">New</option>\n                                                    <option value=\"3\">In Progress</option>\n                                                    <option value=\"4\">Completed</option>\n                                                </select>\n                                                <span style=\"text-align:right\">&nbsp;&nbsp;&nbsp;&nbsp;\n                                                    <input type=\"button\" value=\"Search\" />\n                                            </span></td>\n                                        </tr>\n                                </table></td>\n                                \n                            </tr>\n                        </table>\n                    </div>\n                    <br />\n                    <table width=\"100%\" border=\"1\" class=\"tableStyle\" cellpadding=\"0\" cellspacing=\"0\">\n                        <tr >\n");
      out.write("                            <th width=\"17%\">Name</th>\n                            <th width=\"24%\">Description</th>\n                            <th width=\"15%\">Project Lead</th>\n                            <th width=\"15%\">Satus</th>\n                            <th width=\"13%\">Priority</th>\n                            <th width=\"13%\">Date Started</th>\n                            <th width=\"13%\">URL</th>\n                            <th width=\"16%\">Operations</th>\n                        </tr>\n                        ");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fpresent_005f0.setParent(null);
      _jspx_th_logic_005fpresent_005f0.setName("searchResults");
      _jspx_th_logic_005fpresent_005f0.setProperty("projects");
      int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
      if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n                            ");
          //  logic:present
          org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f1 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
          _jspx_th_logic_005fpresent_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fpresent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
          _jspx_th_logic_005fpresent_005f1.setName("searchResults");
          _jspx_th_logic_005fpresent_005f1.setProperty("projects");
          int _jspx_eval_logic_005fpresent_005f1 = _jspx_th_logic_005fpresent_005f1.doStartTag();
          if (_jspx_eval_logic_005fpresent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n                                ");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f1);
              _jspx_th_logic_005fiterate_005f0.setName("searchResults");
              _jspx_th_logic_005fiterate_005f0.setProperty("projects");
              _jspx_th_logic_005fiterate_005f0.setId("result");
              int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object result = null;
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f0.doInitBody();
                }
                result = (java.lang.Object) _jspx_page_context.findAttribute("result");
                do {
                  out.write("\n                                    <tr>\n                                        <td>\n                                            <a href=\"");
                  out.print( request.getContextPath());
                  out.write("/actions/projectInfo.do?projectId=");
                  if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\">\n                                                ");
                  if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\n                                            </a>\n                                        </td>\n                                        <td>");
                  if (_jspx_meth_bean_005fwrite_005f2(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("</td>\n                                        <td>\n                                            <a href=\"\">");
                  if (_jspx_meth_bean_005fwrite_005f3(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("</a>\n                                            \n                                        </td>\n                                        <td>\n                                            In Progress\n                                        </td>\n                                        <td>\n                                            Top Priority\n                                        </td>\n                                        <td width=\"13%\">");
                  if (_jspx_meth_bean_005fwrite_005f4(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("</td>\n                                        <td><a href=\"Http://localhost:8080/itpcontext\">Http://localhost:8080/itpcontext</a></td>\n                                        <td align=\"center\"><a href=\"\">View</a>&nbsp;|&nbsp;<a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                                    </tr>\n                                ");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                  result = (java.lang.Object) _jspx_page_context.findAttribute("result");
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
              out.write("\n                            ");
              int evalDoAfterBody = _jspx_th_logic_005fpresent_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fpresent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f1);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fpresent_005fproperty_005fname.reuse(_jspx_th_logic_005fpresent_005f1);
          out.write("\n                        ");
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
      out.write("\n                        <!--<tr>\n                        <td>CFC</td>\n                            <td>Project Description Here</td>\n                            <td><a href=\"\">Daryl Galdones</a></td>\n                            <td>\n                                In Progress\n                                \n                            </td>\n                            <td>\n                                Top Priority\n                                \n                            </td>\n                            <td width=\"13%\">May 15, 2011</td>\n                            <td><a href=\"Http://localhost:8080/itpcontext\">Http://localhost:8080/cfcclient</a></td>\n                            <td align=\"center\"><a href=\"\">View</a>&nbsp;|&nbsp;<a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                        </tr>\n                        <tr>\n                            <td>CSPRO</td>\n                            <td>Project Description Here</td>\n                            <td><a href=\"\">Jomar Mondejar</a></td>\n");
      out.write("                            <td>\n                                In Progress\n                                \n                            </td>\n                            <td>\n                                Top Priority\n                                \n                            </td>\n                            <td width=\"13%\">May 15, 2011</td>\n                            <td><a href=\"Http://localhost:8080/itpcontext\">Http://localhost:8080/cspro</a></td>\n                            <td align=\"center\"><a href=\"\">View</a>&nbsp;|&nbsp;<a href=\"\">Edit</a>&nbsp;|&nbsp;<a href=\"\">Delete</a></td>\n                        </tr>\n                        -->\n                    </table>\n                    \n                </div>\n                \n                <div  style=\"width:100%; text-align:right\">\n                    <table width=\"100%\">\n                        <tr>\n                            \n                            <td align=\"left\"> Total result(s) found:<b>");
      if (_jspx_meth_bean_005fwrite_005f5(_jspx_page_context))
        return;
      out.write("</b></td>\n                            <td align=\"right\" class=\"right blue_links\">Rows per page:\n                                <select  id=\"goto2\" class=\"blue_links\" onchange=\"gotopage('goto2')\">\n                                    <option value=\"10\">10</option>\n                                    <option value=\"20\">20</option>\n                                    <option value=\"30\">30</option>\n                                    <option value=\"40\">40</option>\n                                    <option value=\"50\">50</option>\n                                </select>\n                                <a href=\"javascript:loadPrevPostedJobs();\" id=\"prevs2\">&laquo; PREV</a>  |  <a href=\"javascript:loadNextPostedJobs();\" id=\"next2\">NEXT &raquo;</a> | Go to \n                                <select  id=\"goto2\" class=\"blue_links\" onchange=\"gotopage('goto2')\">\n                                    <option value=\"1\">1</option>\n                                    <option value=\"2\">2</option>\n                                </select>\n");
      out.write("                                <input type=\"hidden\" id=\"max\" value=\"\"/>  <input type=\"hidden\" id=\"index\" value=\"0\"/>\n                            </td>\n                        </tr>\n                    </table>\n                </div>\n            </td>\n        </tr>\n    </table>\n</div>\n");
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

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_bean_005fwrite_005f0.setName("result");
    _jspx_th_bean_005fwrite_005f0.setProperty("projectId");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_bean_005fwrite_005f1.setName("result");
    _jspx_th_bean_005fwrite_005f1.setProperty("projectName");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_bean_005fwrite_005f2.setName("result");
    _jspx_th_bean_005fwrite_005f2.setProperty("projectDescription");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_bean_005fwrite_005f3.setName("result");
    _jspx_th_bean_005fwrite_005f3.setProperty("projectLeadFullName");
    int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
    if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_bean_005fwrite_005f4.setName("result");
    _jspx_th_bean_005fwrite_005f4.setProperty("startDateString");
    int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
    if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f5.setParent(null);
    _jspx_th_bean_005fwrite_005f5.setName("searchResults");
    _jspx_th_bean_005fwrite_005f5.setProperty("totalResults");
    int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
    if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
    return false;
  }
}
