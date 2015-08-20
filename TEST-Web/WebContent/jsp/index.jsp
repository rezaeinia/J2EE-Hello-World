<html>
<head>
<title>Converter</title>
</head>

<body bgcolor="white">
	<h1>Default Servlet Test</h1>
	<hr>
	<p>Use Default Servlet defined in web.xml (deployment Descriptor) </p>
	<form method="post" action="default-servlet">
		<label>name:</label><input name="userName" /> <input type="submit"
			value="Submit">
	</form>
<br>
<p>Use Default Servlet defined with @WebServlet </p>
	<form method="post" action="servlet-with-annotation">
		<label>name:</label><input name="userName" /> <input type="submit"
			value="Submit">
	</form>

</body>