<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="UTF-8">
    <title>Registration page!!</title>
</head>
<body>
<div class="form-container">
    <form action="<%=request.getContextPath() %>/register" method="POST">
        <input type="email" placeholder="email" name="email">
        <input type="password" placeholder="password" name="password">
        <input type="submit" value="submit">
    </form>
    
</div>
</body>