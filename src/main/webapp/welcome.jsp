
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        form {
            background-color: #fff;
            border: 1px solid #ccc;
            padding: 20px;
            max-width: 300px;
            margin: 0 auto;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }

        a {
            text-decoration: none;
            color: #007bff;
        }
    </style>
</head>
<body>
<form action="logout-servlet">
    Welcome ${name}!!<br><br>
    out.println("<h1>" + email + "</h1>");
</form>
</body>
</html>
