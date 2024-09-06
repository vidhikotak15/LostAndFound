<html>
<head>
    <meta charset="UTF-8">
    <title>Login page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        h1 {
            color: #333;
        }

        form {
            background-color: #fff;
            border: 1px solid #ccc;
            padding: 20px;
            max-width: 300px;
            margin: 0 auto;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #333;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        a {
            text-decoration: none;
            color: #007bff;
        }
    </style>
</head>
<body>
<h1>Login</h1><br>
<form action="login-servlet" method="post">
    <label>UserID</label><br><input type="text" name="UID"><br>
    <label>Password</label><br><input type="password" name="pword"><br><br>
    <input value="Login" type="Submit"><br><br>
</form>

<a href="index.jsp">Dont have an account? Sign up!</a>
</body>
</html>