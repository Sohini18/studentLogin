<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>
<body>

	<div class="container">
		<form method="post">
			<fieldset class="form-group">
				<label id="name">Username</label> <input type="text" id="name"
					name="name" class="form-control" onfocus="this.select();"
					onmouseup="return false;" placeholder="Username"
					autofocus="autofocus" />
			</fieldset>
			<fieldset class="form-group">
				<label id="password">Password</label> <input type="password"
					id="password" name="password" class="form-control"
					onfocus="this.select();" onmouseup="return false;"
					placeholder="password" autofocus="autofocus" />
			</fieldset>

			<div class="text-danger">
				${msg }
			</div>
			<fieldset class="form-group">
				<input class="btn btn-primary btn-lg" type="submit" value="Login">

			</fieldset>
		</form>
	</div>
</body>
</html>