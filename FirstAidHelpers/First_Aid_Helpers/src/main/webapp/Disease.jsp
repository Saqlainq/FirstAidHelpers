<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Health Info</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
    }
    .container {
      max-width: 800px;
      margin: 0 auto;
      padding: 20px;
    }
    .blocks {
      display: flex;
      justify-content: center;
      align-items: center;
      gap: 20px;
      margin-top: 50px;
    }
    .block {
      background-color: lightgray;
      padding: 20px;
      text-align: center;
      flex: 1;
    }
    .block a {
      text-decoration: none;
      color: blue;
      font-size: 18px;
    }
    .upper-blocks {
      display: flex;
      justify-content: center;
      align-items: center;
      gap: 20px;
      margin-bottom: 50px;
    }
    .upper-block {
      background-color: lightgray;
      padding: 20px;
      text-align: center;
      flex: 1;
    }
    .upper-block a {
      text-decoration: none;
      color: blue;
      font-size: 18px;
    }
  </style>
</head>
<body>
  <div class="container">
    <div class="upper-blocks">
      <div class="upper-block">
        <h2>Diabetes</h2>
        <p>Click the link below to know if you are at risk of Diabetes:</p>
        <a href="Diabetes.jsp">Start</a>
      </div>
      <div class="upper-block">
        <h2>HyperTension</h2>
        <p>Click the link below to know if you are at risk of Hypertension:</p>
        <a href="Hypertension.jsp">Start</a>
      </div>
    </div>
    <div class="blocks">
      <div class="block">
        <h2>HypoTension</h2>
        <p>Click the link below to know if you are at risk of Hypotension:</p>
        <a href="Hypotension.jsp">Start</a>
      </div>
      <div class="block">
        <h2>Fever</h2>
        <p>Click the link below to know if you are at risk of Fever:</p>
        <a href="Fever.jsp">Start</a>
      </div>
    </div>
  </div>
</body>
</html>

