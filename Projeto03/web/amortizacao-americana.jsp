<%-- 
    Document   : amortizacao-americana
    Created on : 15/03/2019, 20:49:14
    Author     : Andr0id
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
            integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file = "WEB-INF/jspf/menu.jspf"%>
        <%@include file = "WEB-INF/jspf/header.jspf"%>
        <h1>Amortização Americana</h1>
        <form>
            <p>Valor Financiamento</p><input type="text" name="financiamento" required><br>
            <p>Tempo (Meses)</p><input type="number" name="tempo" required><br>
            <p>Taxa de Juros (%)</p><input type="text" name="taxa" required><br>
            <p><input type="submit" name="enviar" value="Calcular">
        </form>
        <a href = "home.jsp">Voltar<a>
                <%if (request.getParameter("enviar") != null) {%>
                <%try { %> 
                <hr>
                <%DecimalFormat df = new DecimalFormat("#,##0.00");%>

                <% double financiamento = Double.parseDouble(request.getParameter("financiamento"));%>
                <% int tempo = Integer.parseInt(request.getParameter("tempo"));%>
                <% double taxa = Double.parseDouble(request.getParameter("taxa"));%>

                <%double parcela = financiamento * (taxa / 100);%>
                <%double juros = financiamento * (taxa / 100);%>
                <%double amortizacao = 0;%>

                <%double devedor = financiamento;%>
                <%double totParcela = 0;%>
                <%double totAmortizacao = 0;%>
                <%double totJuros = 0;%>

                <table border = "1">
                    <th>Mês</th>
                    <th>Parcela</th> 
                    <th>Amortização</th>
                    <th>Juros</th>
                    <th>Saldo Devedor</th>
                        <%for (int i = 1; i <= tempo; i++) {%>

                    <%if (i == tempo) {%>
                    <tr>
                        <td><%=i%></td>
                        <td>R$  <%=df.format(parcela + financiamento)%></td>
                        <td>R$  <%=df.format(amortizacao + financiamento)%></td>
                        <td>R$  <%=df.format(juros)%></td>
                        <td>R$  <%=df.format(devedor)%></td>
                    </tr>
                    <%} else {%>
                    <tr>
                        <td><%=i%></td>
                        <td>R$  <%=df.format(parcela)%></td>
                        <td>R$  <%=df.format(amortizacao)%></td>
                        <td>R$  <%=df.format(juros)%></td>
                        <td>R$  <%=df.format(devedor)%></td>
                    </tr>
                    <%}%>

                    <%totParcela += parcela;%>
                    <%totAmortizacao += amortizacao;%>
                    <%totJuros += juros;%>
                    <%}%>
                    <tr>
                        <td>Total: </td>
                        <td>R$  <%=df.format(totParcela + financiamento)%></td>
                        <td>R$  <%=df.format(totAmortizacao + financiamento)%></td>
                        <td>R$  <%=df.format(totJuros)%></td>
                        <%devedor = 0;%>
                        <td>R$  <%=df.format(devedor)%></td>
                    </tr>
                </table>
                <%} catch (Exception ex) {%>
                <h3 style="color: red">Erro: <%=ex.getMessage()%></h3>
                <%}%>
                <%}%>
                </body>
                <%@include file = "WEB-INF/jspf/footer.jspf"%>
                </html>
