<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mad Libs Assessment DL</title>
</head>
<body>
	<h1>Welcome to mad libs!</h1>
	
	<!-- Specifies where form data is sent to be processed -->
	<form action="GetMadLibsServlet" method="post">
	
	<label for="adjective1">Enter an adjective:</label>
	<input type="text" name="adjective1" size="10">
	<br>
	<label for="adjective2">Enter an adjective:</label>
	<input type="text" name="adjective2" size="10">
	<br>
	<label for="pluralNoun1">Enter a plural noun:</label>
	<input type="text" name="pluralNoun1" size="10">
	<br>
	<label for="pluralNoun2">Enter a plural noun:</label>
	<input type="text" name="pluralNoun2" size="10">
	<br>
	<label for="adjective3">Enter an adjective:</label>
	<input type="text" name="adjective3" size="10">
	<br>
	<label for="animal">Enter an animal:</label>
	<input type="text" name="animal" size="10">	
	<br>
	<label for="pluralNoun3">Enter a plural noun:</label>
	<input type="text" name="pluralNoun3" size="10">
	<br>
	<label for="verb">Enter a verb:</label>
	<input type="text" name="verb" size="10">
	<br>
	<label for="pastTenseVerb1">Enter a past-tense verb:</label>
	<input type="text" name="pastTenseVerb1" size="10">
	<br>
	<label for="pastTenseVerb2">Enter a past-tense verb:</label>
	<input type="text" name="pastTenseVerb2" size="10">
	<br>
	<input type="submit" value="Generate Mad Lib" />
	
	
</form>
</body>
</html>