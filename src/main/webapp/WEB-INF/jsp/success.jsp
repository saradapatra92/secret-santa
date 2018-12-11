
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Secret Santa</title>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title></title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/4.2.0/normalize.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>
<link
	href="https://fonts.googleapis.com/css?family=Josefin+Sans|Lobster+Two"
	rel="stylesheet">
<link rel="stylesheet" href="/css/style.css">

</head>

<body>
	<!--[if lt IE 8]>
  	<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
  <![endif]-->

	<div id="snow"></div>

	<div class="snowflakes" aria-hidden="true">
		<div class="snowflake">
			<img src="/img/snow-icon.png">
		</div>
		<div class="snowflake">
			<img src="/img/snow-icon.png">
		</div>
		<div class="snowflake">
			<img src="/img/snow-icon.png">
		</div>
		<div class="snowflake">
			<img src="/img/snow-icon.png">
		</div>
		<div class="snowflake">
			<img src="/img/snow-icon.png">
		</div>
		<div class="snowflake">
			<img src="/img/snow-icon.png">
		</div>
		<div class="snowflake">
			<img src="/img/snow-icon.png">
		</div>
		<div class="snowflake">
			<img src="/img/snow-icon.png">
		</div>
		<div class="snowflake">
			<img src="/img/snow-icon.png">
		</div>
		<div class="snowflake">
			<img src="/img/snow-icon.png">
		</div>
	</div>

	<div class="container">

		<img src="/img/santa-hat.png" class="santahat">


		<div class="instructions">
			<h1>Secret Santa Results</h1>
		</div>
		<div class="results">
			<p>
				Hi <b>${santaName}</b> , You are assigned as a secret santa to give
				a present to : <b>${personName }</b>
			</p>
			<div class="results-display"></div>
			<div class="buttonContainer">
				<a href="/" class="button">Back to Home</a>
			</div>

		</div>
		</div>


		<script src="/js/jquery-3.2.1.min.js"></script>
		<script src="/js/script.js">  </script>
</body>
</html>