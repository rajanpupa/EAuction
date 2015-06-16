package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_security_authorize_access;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_var_value;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_security_authorize_access = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_url_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_spring_param_value_name_nobody.release();
    _jspx_tagPool_security_authorize_access.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_spring_url_var_value.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Add Product Form</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/public/style/main.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<div id=\"navigation\">This is the Page Header.</div>\r\n");
      out.write("\t\t<hr />\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"body\">\r\n");
      out.write("\t\t\t<p>Welcome to Welcome page.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_security_authorize_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t ");
      if (_jspx_meth_security_authorize_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<p>This page is supposed to have all the auctions created. User\r\n");
      out.write("\t\t\t\tneed not be logged in to view this page.</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div id=\"auctions\" >\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<br/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t<hr/>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<aside>Side bar</aside>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"footer\">Footer Area</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_security_authorize_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_authorize_0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_security_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_authorize_0.setPageContext(_jspx_page_context);
    _jspx_th_security_authorize_0.setParent(null);
    _jspx_th_security_authorize_0.setAccess("isAuthenticated()");
    int _jspx_eval_security_authorize_0 = _jspx_th_security_authorize_0.doStartTag();
    if (_jspx_eval_security_authorize_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("\t\t\t<div id = \"dropDowns\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t <form name=\"searchform\" id=\"searchform\" method=\"get\" action=\"/search\"  >\r\n");
      out.write("\t\t\t <select id = \"category\" name = \"category\">\r\n");
      out.write("                <option value=\"volvo\">Volvo</option>\r\n");
      out.write("                <option value=\"saab\">Saab</option>\r\n");
      out.write("  \t\t\t\t<option value=\"mercedes\">Mercedes</option>\r\n");
      out.write(" \t\t\t    <option value=\"audi\">Audi</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t  <input type = \"text\" placeholder = \"Search Item\"/>\r\n");
      out.write("\t\t\t   <input type=\"submit\"  value=\"Search\" />\r\n");
      out.write("\t\t\t   \r\n");
      out.write("\t\t\t    <select id = \"category\" name = \"category\">\r\n");
      out.write("                <option value=\"volvo\">Volvo</option>\r\n");
      out.write("                <option value=\"saab\">Saab</option>\r\n");
      out.write("  \t\t\t\t<option value=\"mercedes\">Mercedes</option>\r\n");
      out.write(" \t\t\t    <option value=\"audi\">Audi</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t  </form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t <p>This is the dropdown. You should be authorized to see this.</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<p> <a href=\"");
      if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_security_authorize_0, _jspx_page_context))
        return true;
      out.write("\" > Logout</a> </p>\r\n");
      out.write("\t\t\t");
    }
    if (_jspx_th_security_authorize_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_0);
      return true;
    }
    _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_0);
    return false;
  }

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_security_authorize_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_authorize_0);
    _jspx_th_c_url_0.setValue("j_spring_security_logout");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_security_authorize_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_authorize_1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_security_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_authorize_1.setPageContext(_jspx_page_context);
    _jspx_th_security_authorize_1.setParent(null);
    _jspx_th_security_authorize_1.setAccess("isAnonymous()");
    int _jspx_eval_security_authorize_1 = _jspx_th_security_authorize_1.doStartTag();
    if (_jspx_eval_security_authorize_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("\t\t\t<p><a href=\"/spring_security_login\"> Login </a> </p>\r\n");
      out.write("\t\t\t");
    }
    if (_jspx_th_security_authorize_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_1);
      return true;
    }
    _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("auction");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auctions }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_spring_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<div class=\"auction\" >\r\n");
          out.write("\t\t\t\t\t\t\t<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailUrl }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auction.title }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p></a>\r\n");
          out.write("\t\t\t\t\t\t\t<p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auction.description }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("\t\t\t\t\t\t\t<span class=\"price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auction.maxBidAmount }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_var_value.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_spring_url_0.setValue("auctionDetail/{auctionid}");
    _jspx_th_spring_url_0.setVar("detailUrl");
    int[] _jspx_push_body_count_spring_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_0 = _jspx_th_spring_url_0.doStartTag();
      if (_jspx_eval_spring_url_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_spring_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_url_0, _jspx_page_context, _jspx_push_body_count_spring_url_0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_spring_url_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_spring_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_0.doFinally();
      _jspx_tagPool_spring_url_var_value.reuse(_jspx_th_spring_url_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_url_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_url_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:param
    org.springframework.web.servlet.tags.ParamTag _jspx_th_spring_param_0 = (org.springframework.web.servlet.tags.ParamTag) _jspx_tagPool_spring_param_value_name_nobody.get(org.springframework.web.servlet.tags.ParamTag.class);
    _jspx_th_spring_param_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_url_0);
    _jspx_th_spring_param_0.setName("auctionid");
    _jspx_th_spring_param_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${auction.id }", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_spring_param_0 = _jspx_th_spring_param_0.doStartTag();
    if (_jspx_th_spring_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_spring_param_value_name_nobody.reuse(_jspx_th_spring_param_0);
      return true;
    }
    _jspx_tagPool_spring_param_value_name_nobody.reuse(_jspx_th_spring_param_0);
    return false;
  }
}
