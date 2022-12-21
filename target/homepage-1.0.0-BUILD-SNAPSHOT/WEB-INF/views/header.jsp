<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="<c:url value="/resources/css/header.css"/>"/>

<div class="header_layout">
    <div class="cen">
        <a href="#" class="header_logo">
            <img alt="header_logo" />
        </a>
        <nav class="main_nav">
            <ul>
                <c:forEach var="menu" items="${menuList}">
                    <li><a href="#">${menu.text}</a></li>
                </c:forEach>
            </ul>
        </nav>
    </div>
</div>

<div class="sub_nav_layout">
    <div class="cen">
        <nav>
            <ul>
                <c:forEach var="menu" items="${menuList}">
                    <li>
                    <c:forEach var="subMenu" items="${menu.children}">
                        <a href="${subMenu.engName}">${subMenu.text}</a>
                    </c:forEach>
                    </li>
                </c:forEach>
            </ul>
        </nav>
    </div>
</div>

<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>
<script src="<c:url value="/resources/js/header.js"/>"></script>
