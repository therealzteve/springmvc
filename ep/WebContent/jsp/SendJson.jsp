<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>

<input type="text" id="myText">
<input type="text" id="myText2">
<input type="button" onclick="send()">

<script>
var send = function(){
	
	//Test object
	var myObject = {};
	myObject.mb = {};
	myObject.bar1 = document.getElementById("myText").value;
	myObject.mb.i = document.getElementById("myText2").value;
	//End test object
	
	
	var xmlhttp = new XMLHttpRequest();
	var url = "/ePortfolio/example/demo/jsonPost";

	xmlhttp.onreadystatechange = function() {
	    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
	       
	    }
	}

	xmlhttp.open("POST", url, true);
	xmlhttp.setRequestHeader("Content-type", "application/json");
	xmlhttp.send(JSON.stringify(myObject));	
};


</script>