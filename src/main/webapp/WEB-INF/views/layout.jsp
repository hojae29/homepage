<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link rel="stylesheet" href="<c:url value="/resources/css/index.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/layout.css"/>"/>
</head>
<body>
<div class="layout">
    <header class="header">
        <%@ include file="header.jsp" %>
    </header>

    <div class="title">
        <h1>1depth title</h1>
    </div>

    <div class="sub-menu">
        <select>
            <c:forEach var="menu" items="${menuList}">
                <option ${menu.engName.equals(selectedMenuList.engName) ? 'selected' : ''}>${menu.text}</option>
            </c:forEach>
        </select>
        <c:if test="${selectedMenuList.children.size() != 0}">
            <select>
                <c:forEach var="menu" items="${selectedMenuList.children}">
                    <option ${menu.engName.equals() ? 'selected' : ''}>${menu.text}</option>
                </c:forEach>
            </select>
        </c:if>
    </div>

    <div class="main">
        <div class="last-depth-title">
            <h1>last depth title</h1>
        </div>
        <div>
            내용
        </div>
    </div>
</div>
</body>
</html>