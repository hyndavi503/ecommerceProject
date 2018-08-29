<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/resources/images" var="images"/>
<html>
<body>
<h2>Hello World!</h2>
${myName}
<img src="${images}/spring.png">
</body>
</html>
