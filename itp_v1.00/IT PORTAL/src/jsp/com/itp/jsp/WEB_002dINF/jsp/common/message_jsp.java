package com.itp.jsp.WEB_002dINF.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class message_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fmessagesPresent;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fmessagesPresent_005fmessage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fmessages_005fmessage_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fmessagesPresent = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fmessagesPresent_005fmessage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fmessages_005fmessage_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fmessagesPresent.release();
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fmessagesPresent_005fmessage.release();
    _005fjspx_005ftagPool_005fhtml_005fmessages_005fmessage_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.release();
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

      out.write("\n\n\n\n");
      //  logic:messagesPresent
      org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_005fmessagesPresent_005f0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _005fjspx_005ftagPool_005flogic_005fmessagesPresent.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
      _jspx_th_logic_005fmessagesPresent_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fmessagesPresent_005f0.setParent(null);
      int _jspx_eval_logic_005fmessagesPresent_005f0 = _jspx_th_logic_005fmessagesPresent_005f0.doStartTag();
      if (_jspx_eval_logic_005fmessagesPresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n    <center>\n        <table style=\"border: 1px solid rgb(210, 210, 210);\" width=\"50%\" bgcolor=\"#ffffff\" cellpadding=\"0\" cellspacing=\"0\" id=\"messageBox\" >\n            <tr>\n                <td class=\"errorHeader\">\n                    <table width=\"100%\">\n                        <tr>\n                            <td align=\"left\">\n                                Error has occurred\n                            </td>\n                            <td align=\"right\">\n                                <img style=\"cursor:pointer;\" onclick=\"hideMessage();\" src=\"");
          out.print( request.getContextPath());
          out.write("/images/close_button.gif\">\n                            </td>\n                        </tr>\n                    </table>\n                </td>\n            </tr>\n            <tr>\n                <td>\n                    <table  cellpadding=\"5\">\n                        <tr>\n                            <td align=\"left\" valign=\"top\">");
          if (_jspx_meth_html_005ferrors_005f0(_jspx_th_logic_005fmessagesPresent_005f0, _jspx_page_context))
            return;
          out.write("</td>\n                        </tr>\n                    </table>\n                </td>\n            </tr>\n        </table>\t \n        <p></p>\n    </center>\n");
          int evalDoAfterBody = _jspx_th_logic_005fmessagesPresent_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fmessagesPresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fmessagesPresent.reuse(_jspx_th_logic_005fmessagesPresent_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fmessagesPresent.reuse(_jspx_th_logic_005fmessagesPresent_005f0);
      out.write('\n');
      out.write('\n');
      //  logic:messagesPresent
      org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_005fmessagesPresent_005f1 = (org.apache.struts.taglib.logic.MessagesPresentTag) _005fjspx_005ftagPool_005flogic_005fmessagesPresent_005fmessage.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
      _jspx_th_logic_005fmessagesPresent_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fmessagesPresent_005f1.setParent(null);
      _jspx_th_logic_005fmessagesPresent_005f1.setMessage("true");
      int _jspx_eval_logic_005fmessagesPresent_005f1 = _jspx_th_logic_005fmessagesPresent_005f1.doStartTag();
      if (_jspx_eval_logic_005fmessagesPresent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n    <center>\n        <table style=\"border: 1px solid rgb(210, 210, 210);\" width=\"50%\" bgcolor=\"#ffffff\" cellpadding=\"0\" cellspacing=\"0\" id=\"messageBox\">\n            <tr>\n                <td class=\"headerBox\">\n                    <table width=\"100%\">\n                        <tr>\n                            <td align=\"left\">\n                                Application Message\n                            </td>\n                            <td align=\"right\">\n                                <img style=\"cursor:pointer;\" onclick=\"hideMessage();\" src=\"");
          out.print( request.getContextPath());
          out.write("/images/close_button.gif\">\n                            </td>\n                        </tr>\n                    </table>\n                </td>\n            </tr>\n            <tr>\n                <td>\n                    <table  cellpadding=\"5\">\n                        <tr>\n                            <td>\n                                ");
          //  html:messages
          org.apache.struts.taglib.html.MessagesTag _jspx_th_html_005fmessages_005f0 = (org.apache.struts.taglib.html.MessagesTag) _005fjspx_005ftagPool_005fhtml_005fmessages_005fmessage_005fid.get(org.apache.struts.taglib.html.MessagesTag.class);
          _jspx_th_html_005fmessages_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fmessages_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fmessagesPresent_005f1);
          _jspx_th_html_005fmessages_005f0.setId("message");
          _jspx_th_html_005fmessages_005f0.setMessage("true");
          int _jspx_eval_html_005fmessages_005f0 = _jspx_th_html_005fmessages_005f0.doStartTag();
          if (_jspx_eval_html_005fmessages_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.String message = null;
            if (_jspx_eval_html_005fmessages_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_005fmessages_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_005fmessages_005f0.doInitBody();
            }
            message = (java.lang.String) _jspx_page_context.findAttribute("message");
            do {
              out.write("\n                                    <ul><li>");
              if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_html_005fmessages_005f0, _jspx_page_context))
                return;
              out.write("</li></ul>\n                                ");
              int evalDoAfterBody = _jspx_th_html_005fmessages_005f0.doAfterBody();
              message = (java.lang.String) _jspx_page_context.findAttribute("message");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_005fmessages_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_html_005fmessages_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fmessages_005fmessage_005fid.reuse(_jspx_th_html_005fmessages_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fmessages_005fmessage_005fid.reuse(_jspx_th_html_005fmessages_005f0);
          out.write("\n                            </td>\n                        </tr>\n                    </table>\n                </td>\n            </tr>\n        </table>\t\n        <p></p>\n    </center>\n");
          int evalDoAfterBody = _jspx_th_logic_005fmessagesPresent_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fmessagesPresent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fmessagesPresent_005fmessage.reuse(_jspx_th_logic_005fmessagesPresent_005f1);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fmessagesPresent_005fmessage.reuse(_jspx_th_logic_005fmessagesPresent_005f1);
      out.write("\n\n<script>\n    function hideMessage ()\n    {\n        var obj = document.getElementById ('messageBox');\n        obj.style.visibility='hidden';\n        obj.style.display='none';\n    }\n</script>");
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

  private boolean _jspx_meth_html_005ferrors_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fmessagesPresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_005ferrors_005f0 = (org.apache.struts.taglib.html.ErrorsTag) _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_005ferrors_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fmessagesPresent_005f0);
    int _jspx_eval_html_005ferrors_005f0 = _jspx_th_html_005ferrors_005f0.doStartTag();
    if (_jspx_th_html_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.reuse(_jspx_th_html_005ferrors_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ferrors_005fnobody.reuse(_jspx_th_html_005ferrors_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fmessages_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fmessages_005f0);
    _jspx_th_bean_005fwrite_005f0.setName("message");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }
}
