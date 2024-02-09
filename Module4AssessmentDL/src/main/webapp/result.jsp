<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mad Lib Results</title>
</head>
<body>
	
	<!-- Generates Mad Lib using user input from form -->
	
	<h1> The Three ${userMadLib.getAdjective1()} Piggies</h1>
	
	<p> 
		Once upon a time, there were three ${userMadLib.getAdjective1()} pigs. One day, their mother told 
		them they must move out, so they left. The first ${userMadLib.getAdjective1()} piggy was 
		${userMadLib.getAdjective2()} and just wanted to play all day, so he quickly built his house out 
		of ${userMadLib.getPluralNoun1()}. The second ${userMadLib.getAdjective1()} piggy wasn’t quite as
		${userMadLib.getAdjective2()} as his brother and built his house out of ${userMadLib.getPluralNoun2()}.
		The third ${userMadLib.getAdjective1()} piggy knew the big ${userMadLib.getAdjective3()} 
		${userMadLib.getAnimal()} lived nearby and worked hard to make a house out of 
		${userMadLib.getPluralNoun3()}. One day, the big ${userMadLib.getAdjective3()} ${userMadLib.getAnimal()}
		came up to the first pig’s house and said, “Let me in or I’ll ${userMadLib.getVerb()} your house down!”
		The pig refused, so the ${userMadLib.getAnimal()} ${userMadLib.getPastTenseVerb1()} his house down and
		the first piggy ran to his brother’s house. Then the ${userMadLib.getAnimal()} knocked on the second 
		pig’s door and said, “Let me in or I’ll ${userMadLib.getVerb()} your house down!” The piggies refused 
		again, so the ${userMadLib.getAnimal()} ${userMadLib.getPastTenseVerb1()} the house down and the two 
		pigs ran to their brothers house. The wolf then came up to the third pig’s house said, “Let me in or 
		I’ll ${userMadLib.getVerb()} your house down!” The pigs refused, so the ${userMadLib.getAnimal()} 
		${userMadLib.getPastTenseVerb2()} and he puffed but he could not blow the house down. All the pigs
		went to live in the third pigs house and lived happily ever after.
	<br>
	<a href="index.jsp">Do It Again!</a>
	</p>
</body>
</html>