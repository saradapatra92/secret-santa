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

	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/4.2.0/normalize.min.css">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>
	<link href="https://fonts.googleapis.com/css?family=Josefin+Sans|Lobster+Two" rel="stylesheet">
	<link rel="stylesheet" href="/css/style.css">

</head>

<body>

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
			<h1>Secret Santa !</h1>
		</div>

	<form  class="secretSantaForm" method="post" action="/process">

		  <div id="sections">
		    <div class="section">
		      <fieldset>
		<table style="with: 50%">
			<tr>
				<td>Associate Id</td>
				<td><input type="number" name="id" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Email Id</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Team</td>
				<td><select style="width: 100%;max-width=100%;" name="team">
						<option value="manager">Manager</option>
						<option value="support">Support</option>
						<option value="dev">Dev</option>
				</select></td>


			</tr>

		</table>
		
		      </fieldset>
		    </div>
		  </div>

		  <div class="buttonContainer">
		<input type="submit" value="Submit" class="button"/>
		<input type="reset" value="Clear"  class="button"/>

		  </div>


	  </form>
  </div>


  <script src="/js/jquery-3.2.1.min.js"></script>
  <script src="/js/script.js">  </script>


</body>
</html>