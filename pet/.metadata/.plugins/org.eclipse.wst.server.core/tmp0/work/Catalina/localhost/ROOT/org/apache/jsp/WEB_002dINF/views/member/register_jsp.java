/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2023-07-24 04:42:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/dev/myproject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Pet/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1617482270247L));
    _jspx_dependants.put("jar:file:/C:/dev/myproject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Pet/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<!-- 합쳐지고 최소화된 최신 CSS -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<!-- 부가적인 테마 -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css\">\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("\t\t<title>회원가입</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t// 취소\r\n");
      out.write("\t\t\t$(\".cencle\").on(\"click\", function(){\r\n");
      out.write("\t\t\t\tlocation.href = \"/\";\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#submit\").on(\"click\", function(){\r\n");
      out.write("\t\t\t\tif($(\"#userId\").val()==\"\"){\r\n");
      out.write("\t\t\t\t\talert(\"아이디를 입력해주세요.\");\r\n");
      out.write("\t\t\t\t\t$(\"#userId\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif($(\"#userPass\").val()==\"\"){\r\n");
      out.write("\t\t\t\t\talert(\"비밀번호를 입력해주세요.\");\r\n");
      out.write("\t\t\t\t\t$(\"#userPass\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif($(\"#userName\").val()==\"\"){\r\n");
      out.write("\t\t\t\t\talert(\"성명을 입력해주세요.\");\r\n");
      out.write("\t\t\t\t\t$(\"#userName\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif($(\"#userEmail\").val()==\"\"){\r\n");
      out.write("\t\t\t\t\talert(\"이메일을 입력해주세요.\");\r\n");
      out.write("\t\t\t\t\t$(\"#userEmail\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tvar idChkVal = $(\"#idChk\").val();\r\n");
      out.write("\t\t\t\tif(idChkVal == \"N\"){\r\n");
      out.write("\t\t\t\t\talert(\"중복확인 버튼을 눌러주세요.\");\r\n");
      out.write("\t\t\t\t}else if(idChkVal == \"Y\"){\r\n");
      out.write("\t\t\t\t\t$(\"#regForm\").submit();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction fn_idChk(){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"/member/idChk\",\r\n");
      out.write("\t\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\tdata : {\"userId\" : $(\"#userId\").val()},\r\n");
      out.write("\t\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\t\tif(data == 1){\r\n");
      out.write("\t\t\t\t\t\talert(\"중복된 아이디입니다.\");\r\n");
      out.write("\t\t\t\t\t}else if(data == 0){\r\n");
      out.write("\t\t\t\t\t\t$(\"#idChk\").attr(\"value\", \"Y\");\r\n");
      out.write("\t\t\t\t\t\talert(\"사용가능한 아이디입니다.\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<section id=\"container\">\r\n");
      out.write("\t\t\t<form action=\"/member/register\" method=\"post\" id=\"regForm\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group has-feedback\">\r\n");
      out.write("\t\t\t\t\t<label class=\"control-label\" for=\"userId\">아이디</label>\r\n");
      out.write("\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"userId\" name=\"userId\" />\r\n");
      out.write("\t\t\t\t\t<button class=\"idChk\" type=\"button\" id=\"idChk\" onclick=\"fn_idChk();\" value=\"N\">중복확인</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group has-feedback\">\r\n");
      out.write("\t\t\t\t\t<label class=\"control-label\" for=\"userPass\">패스워드</label>\r\n");
      out.write("\t\t\t\t\t<input class=\"form-control\" type=\"password\" id=\"userPass\" name=\"userPass\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group has-feedback\">\r\n");
      out.write("\t\t\t\t\t<label class=\"control-label\" for=\"userName\">성명</label>\r\n");
      out.write("\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"userName\" name=\"userName\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group has-feedback\">\r\n");
      out.write("\t\t\t\t    <label class=\"control-label\" for=\"userEmail\">이메일</label>\r\n");
      out.write("\t\t\t\t    <input class=\"form-control\" type=\"email\" id=\"userEmail\" name=\"userEmail\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t\t<div class=\"form-group has-feedback\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-success\" type=\"button\" id=\"submit\">회원가입</button>\r\n");
      out.write("\t\t\t\t\t<button class=\"cencle btn btn-danger\" type=\"button\">취소</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("\t\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
