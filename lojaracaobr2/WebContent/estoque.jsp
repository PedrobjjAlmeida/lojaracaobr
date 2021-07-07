<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="model.JavaBeans" %>
    <%@ page import="java.util.ArrayList" %>
    <% ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("javabeans"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Estoque</title>
 <link rel="stylesheet" href="style.css">
</head>
<body>

	 <!-- Cabeçalho -->
    <header>
        <div class="Layout">
            <!-- Logotipo -->
            <div id="logo">
                <img src="imagens/logo.png" alt="logotipo">
            </div>
            <!-- Menu -->
            <nav>
                <ul>
                    <li><a href="index.html">Home</a></li>
                    <li><a href="">Sobre</a></li>
                    <li><a href="">Produtos</a></li>
                    <li><a href="">Conteúdo</a></li>
                    <li><a href="">Contato</a></li>
                    <li><a href="main" id="Estoque">Estoque</a></li>
                </ul>
            </nav>
        </div>
    </header>
    
   <div class="Estoque">
  	<h1>Estoque</h1>
	<!--<a href="" id="Estoque2">Adicionar Produto</a>-->
	<table id="tabela">
	<thead>
		<tr>
			<th>id</th>
			<th>Produtos</th>
			<th>Tipo</th>
			<th>Quantidade</th>
			<th>Valor</th>
		</tr>
	</thead>
	<tbody>
	<% for (int i = 0; i < lista.size(); i++) { %>
	  <tr>
	  	<td><%=lista.get(i).getIdpro() %></td>
	  	<td><%=lista.get(i).getNomeproduto() %></td>
	  	<td><%=lista.get(i).getQuantidade() %></td>
	  	<td><%=lista.get(i).getTipo() %></td>
	  	<td><%=lista.get(i).getValor() %></td>
	  </tr>
	  <% } %>
	</tbody>
	</table>
	</div>
            <!-- Rodapé -->
            <footer>
                <div class="Layout">
                    <div id="copyright">
                        <p>©2021 Pedro de Campos Noga</p>
                    </div>
                    <div id="social">
                        <a href="https://www.facebook.com/" target="_blank"><img src="imagens/face.png" alt="facebook">
                        </a>

                    </div>
                </div>
            </footer>
</body>
</html>