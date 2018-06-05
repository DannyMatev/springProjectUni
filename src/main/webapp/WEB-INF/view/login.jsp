<form action="/login" method="POST">
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <label for="userEmail">E-mail</label>
    <input type="email" name="username" id="userEmail" placeholder="your email"/>
    <label for="userEmail">password</label>
    <input type="password" name="password" id="userPassword"/>
    <input type="submit" value="Login"/>
</form>