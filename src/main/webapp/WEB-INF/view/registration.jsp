<%@include file="templates/base-header.jsp" %>

<body>
<div class="container form-container ">
    <form name="regForm" method="post" action="" onsubmit="event.preventDefault(); validate()" action="/action_page.php" method="get">

        <div class="input-group">
            <label>Username</label>
            <input type="text" name="username">
            <span class="error" id="usernameError">The username can contain only letters and numbers of 4 to 15 characters.</span>
        </div>
        <div class="input-group">
            <label>E-mail</label>
            <input type="text" name="email">
            <span class="error" id="email">Please enter a valid email address.</span>
        </div>
        <div class="input-group">
            <label>Password</label>
            <input type="password" name="password">
            <span class="error" id="passwordError">The password may contain only letters and numbers of 5 to 30 characters.</span>
        </div>
        <div class="input-group">
            <label>Confirm your password</label>
            <input type="password" name="passConfirm">
            <span class="error" id="passwordError2">The passwords do not match.
</span>
        </div>
        <div class="input-group">
            <label>Gender</label>
            <div class="gender-choice ">
                <input type="radio" name="gender" value="male">
                <label>Male</label>
            </div>
            <div class="gender-choice ">
                <input type="radio" name="gender" value="female">
                <label>Female</label>
            </div>
            <div class="gender-choice ">
                <input type="radio" name="gender" value="other">
                <label>Other</label>
            </div>
        </div>
        <div class="input-group">
            <button class="btn btn-primary" type="submit"  value="Submit">Submit</button>
            <button class="btn btn-primary" type="reset"  value="Reset">Reset</button>
        </div>
    </form>
</div>
<script src="scripts/home.js"></script>
</body>
<%@include file="templates/footer.jsp" %>