<%@include file="templates/base-header.jsp" %>

<body>
<div class="container form-container">
    <form name="regForm" method="post"  action="/login">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <div class="input-group">
            <label>Username</label>
            <input type="email" name="username">
            <span class="error" id="usernameError">The username can contain only letters and numbers of 4 to 15 characters.</span>
        </div>
        <div class="input-group">
            <label>Password</label>
            <input type="password" name="password">
            <span class="error" id="passwordError">The password may contain only letters and numbers of 5 to 30 characters.</span>
        </div>
        <div class="input-group">
            <button class="btn btn-primary" type="submit" value="Submit">Submit</button>
        </div>
    </form>
</div>
<script src="scripts/home.js"></script>
</body>

<%@include file="templates/footer.jsp" %>