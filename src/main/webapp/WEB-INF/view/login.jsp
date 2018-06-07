<%@include file="templates/base-header.jsp" %>

<body>
    <div class="container form-container">
        <form name="regForm" method="post"  action="/login">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <div class="input-group">
                <label>Username</label>
                <input type="email" name="username">
            </div>
            <div class="input-group">
                <label>Password</label>
                <input type="password" name="password">
            </div>
            <div class="input-group">
                <button class="btn btn-primary custom-btn" type="submit" value="Submit">Submit</button>
                <a class="btn btn-primary custom-btn" href="/register">Sign up</a>
            </div>
        </form>

    </div>
</body>

<%@include file="templates/footer.jsp" %>
