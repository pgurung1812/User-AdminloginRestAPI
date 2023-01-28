<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, com.bookshopapplication.onlinebookshop.model.Book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 text="center">List of the books in Shop</h2>
 
 <%
    List<Book>books=(List<Book>)request.getAttribute("allbooks");
 %>
 
 <table class="table">
  <thead>
    <tr>
      <th scope="col">ISBN</th>
      <th scope="col">Title</th>
      <th scope="col">Author</th>
      <th scope="col">Publication</th>
       
    </tr>
  </thead>
  <tbody>
  <% for(int i = 0; i < books.size(); i++) {%>
  
  <tr>

      <td><%=books.get(i).getiSBN() %></td>
      <td><%=books.get(i).getTitle() %></td>
      <td><%=books.get(i).getAuthor() %></td>
      <td><%=books.get(i).getPublication() %></td>
     
    </tr>
  <%} %>
    
  </tbody>
</table>
</body>
</html>