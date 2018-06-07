<%@include file="templates/base-header.jsp" %>

<body>
<div class="container form-container ">
    <form name="regForm" method="POST" action="/register">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <div class="error">
            ${user_exists_error}
        </div>
        <div class="input-group">
            <label>E-mail</label>
            <input type="text" name="email">
        </div>
        <div class="input-group">
            <label>Gender</label>
            <select name="gender">
              <option value="male" selected>male</option>
              <option value="female">female</option>
              <option value="other">other</option>
            </select>
        <div class="input-group">
            <label>Password</label>
            <input type="password" name="password">
        </div>
        <div class="input-group">
            <button class="btn custom-btn" type="submit">Submit</button>
        </div>
    </form>
</div>
<%@include file="templates/footer.jsp" %>