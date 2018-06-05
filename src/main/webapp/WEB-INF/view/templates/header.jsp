<!DOCTYPE html>
<html>

<%@include file="head.jsp" %>
<div class="wrapper">
    <header>
        <nav class="navbar navbar-expand-lg navbar-dark bg bg-dark">
            <a class="navbar-brand" href="#">Home</a>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                </ul>
                <div class="search-container ">
                    <form id="frmSearch" class="search2" method="get" action="default.html"/>

                    <input class="search1" id="txtSearch" type="text" name="serach_bar" size="31" maxlength="255"
                    />
                    <input class="btn btn-primary" type="submit" name="submition" value="Search"/>
                    <input class="search2" type="hidden" name="sitesearch" value="default.html"/>

                    <script type="text/javascript">
                        document.getElementById('frmSearch').onsubmit = function () {
                            window.location = 'http://www.google.com/search?q= ' + document.getElementById('txtSearch').value;
                            return false;
                        }
                    </script>

                </div>

            </div>
        </nav>
    </header>
