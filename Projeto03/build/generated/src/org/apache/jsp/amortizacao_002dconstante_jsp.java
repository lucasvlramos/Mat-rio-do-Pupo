package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;

public final class amortizacao_002dconstante_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <form>\n");
      out.write("            <p>Valor Financiamento</p><input type=\"text\" name=\"financiamento\" required><br>\n");
      out.write("            <p>Tempo(Meses)</p><input type=\"number\" name=\"tempo\" required><br>\n");
      out.write("            <p>Taxa de Juros</p><input type=\"text\" name=\"taxa\" required><br>\n");
      out.write("            <p><input type=\"submit\" name=\"enviar\" value=\"Calcular\">\n");
      out.write("        </form>\n");
      out.write("        <hr>\n");
      out.write("        ");
if (request.getParameter("enviar") != null) {
      out.write("\n");
      out.write("        ");
try { 
      out.write(" \n");
      out.write("        ");
DecimalFormat df = new DecimalFormat("#.00");
      out.write(" \n");
      out.write("        ");
 double financiamento = Double.parseDouble(request.getParameter("financiamento"));
      out.write("\n");
      out.write("        ");
 int tempo = Integer.parseInt(request.getParameter("tempo"));
      out.write("\n");
      out.write("        ");
 double taxa = Double.parseDouble(request.getParameter("taxa"));
      out.write("\n");
      out.write("\n");
      out.write("        ");
double amortizacao = financiamento / tempo;
      out.write("\n");
      out.write("        ");
double juros = financiamento * taxa;
      out.write("\n");
      out.write("        ");
double parcela = amortizacao + juros;
      out.write("\n");
      out.write("\n");
      out.write("        ");
double devedor = financiamento;
      out.write("\n");
      out.write("\n");
      out.write("        ");
double totParcela = 0;
      out.write("\n");
      out.write("        ");
double totAmortizacao = 0;
      out.write("\n");
      out.write("        ");
double totJuros = 0;
      out.write("\n");
      out.write("\n");
      out.write("        <br><br>    \n");
      out.write("        <table border = \"1\">\n");
      out.write("            <th>Mês</th>\n");
      out.write("            <th>Parcela</th> \n");
      out.write("            <th>Amortização</th>\n");
      out.write("            <th>Juros</th>\n");
      out.write("            <th>Saldo Devedor</th>\n");
      out.write("                ");
for (int i = 1; i <= tempo; i++) {
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("            ");
parcela = amortizacao + juros;
      out.write("\n");
      out.write("            ");
devedor -= amortizacao;
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                <td>R$  ");
      out.print(df.format(parcela));
      out.write("</td>\n");
      out.write("                <td>R$  ");
      out.print(df.format(amortizacao));
      out.write("</td>\n");
      out.write("                <td>R$  ");
      out.print(df.format(juros));
      out.write("</td>\n");
      out.write("                <td>R$  ");
      out.print(df.format(devedor));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");
totParcela += parcela;
      out.write("\n");
      out.write("            ");
totAmortizacao += amortizacao;
      out.write("\n");
      out.write("            ");
totJuros += juros;
      out.write("\n");
      out.write("            ");
juros = juros - (amortizacao * taxa);
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>Total: </td>\n");
      out.write("                <td>R$  ");
      out.print(df.format(totParcela));
      out.write("</td>\n");
      out.write("                <td>R$  ");
      out.print(df.format(totAmortizacao));
      out.write("</td>\n");
      out.write("                <td>R$  ");
      out.print(df.format(totJuros));
      out.write("</td>\n");
      out.write("                <td>R$  ");
      out.print(df.format(devedor));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        ");
} catch (Exception ex) {
      out.write("\n");
      out.write("        <h3 style=\"color: red\">Erro: ");
      out.print(ex.getMessage());
      out.write("</h3>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
