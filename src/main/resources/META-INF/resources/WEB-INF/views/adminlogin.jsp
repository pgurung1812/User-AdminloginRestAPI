
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Administrator</title>
</head>
<body>
<h1>Hi ${ username }</h1>
<h1> You Successfully entered the app</h1>

<form class="container" action="addbook" method="post">

<label>Enter ISBN</label>
<input class="text" name="iSBN"/>
<label>Enter Title</label>
<input class="text" name="title"/>
<label>Enter Author Name</label>
<input class="text" name="author"/>
<label>Enter Publication Name</label>
<input class="text" name="publication"/>

<button type="submit" class="btn btn-secondary">Add Book</button>

</form>


<form class="container" action="deletebook" method="post">

<label>Enter ISBN to delete</label>
<input class="text" name="iSBN"/>
<button type="submit" class="btn btn-secondary">Delete book</button>

</form>

<form class="container" action="updatebook" method="post">

<label>Enter ISBN</label>
<input class="text" name="iSBN"/>
<label>Enter Title</label>
<input class="text" name="title"/>
<label>Enter Author Name</label>
<input class="text" name="author"/>
<label>Enter Publication Name</label>
<input class="text" name="publication"/>
<button type="submit" class="btn btn-secondary">Update book</button>

</form>

<form class="container" action="searchbook" method="post">

<label>Enter book ISBN</label>
<input class="text" name="iSBN"/>
<button type="submit" class="btn btn-secondary">Search book by ISBN</button>

</form>

<form class="container" action="listbooks" method="post">

<button type="submit" class="btn btn-secondary">List books</button>

</form>

</body>
</html>