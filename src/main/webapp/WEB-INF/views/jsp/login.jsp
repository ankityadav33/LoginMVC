<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Login Form</title>
</head>
<body>
<form action="/submit" method="post">
User    :   <input type="text" name="userid">
Password:   <input type="password" name="password">
        <input type="submit">

${incorrectPassMsg}
</form>
</body>
</html>
