<html>
<head>
    <script src="script/jquery-3.2.1.min.js"></script>
</head>
<body>

<div id="loginBlock">
    <div id="loginRight">
        <label>username</label>
        <label>password</label>
    </div>
    <div id="loginLeft">
        <div id="usernameBlock"><input type="text" id="username" placeholder="username"></input></div>
        <div id="passwordBlock"><input type="password" id="password" placeholder="username"></input></div>
    </div>
</div>
<script>
    $.get("https://ipass-1704102.herokuapp.com/rest/login/" + $("#username").innerHTML + "/" + $("#password").innerHTML, function (data) {
        console.log(data);
    });
</script>


</body>
</html>
