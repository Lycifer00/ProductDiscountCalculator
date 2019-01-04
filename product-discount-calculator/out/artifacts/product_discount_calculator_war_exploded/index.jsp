<%--
  Created by IntelliJ IDEA.
  User: lycifer
  Date: 04/01/2019
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Product Discount Calculator</title>
  <link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
<div id="content">
  <h1>Product Discount Calculator</h1>
  <form method="post" action="${pageContext.request.contextPath}/discount">
    <div id="data">
      <label>Product Description:</label>
      <label>
        <input type="text" name="description"/>
      </label><br/>
      <label>List Price:</label>
      <label>
        <input type="text" name="price"/>
      </label><br/>
      <label>Discount Percent:</label>
      <label>
        <input type="text" name="discount_percent"/>
      </label><br/>
    </div>
    <div id="buttons">
      <label>&nbsp;</label>
      <input type="submit" value="Calculate Discount"/>
    </div>
  </form>
</div>
</body>
</html>
