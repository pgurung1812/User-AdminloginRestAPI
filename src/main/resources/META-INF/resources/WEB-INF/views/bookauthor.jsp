<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="com.bookshopapplication.onlinebookshop.model.Book" %>  
     

     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book by Author</title>
</head>
<body>

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
  
  <tr> 
      <td>${book4.getiSBN()} </td>
      <td>${book4.getTitle()} </td>
      <td>${book4.getAuthor()} </td>
      <td>${book4.getPublication()} </td>  
    </tr>
  
    
  </tbody>
</table>

</body>
</html>