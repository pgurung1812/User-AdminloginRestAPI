
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hi ${ username }</h1>
<h1> You Successfully entered the app</h1>

<form class="container" action="allbook" method="post">

<button type="submit" class="btn btn-secondary">ListofBooks</button>

</form>


<form class="container" action="bookbyauthor" method="post">

<label>Enter Author name</label>
<input class="text" name="author"/>
<button type="submit" class="btn btn-secondary">Search book by Author</button>

</form>

<form class="container" action="addbookfav" method="post">

<label>Enter book title</label>
<input class="text" name="title"/>
<button type="submit" class="btn btn-secondary">Add book to Favorite list</button>

</form>

<form class="container" action="bookbyISBN" method="post">

<label>Enter book ISBN</label>
<input class="text" name="iSBN"/>
<button type="submit" class="btn btn-secondary">Search book by ISBN</button>

</form>

</body>
</html>