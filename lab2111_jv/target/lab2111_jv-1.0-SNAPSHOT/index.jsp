<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Exponential Calculator</title>
</head>
<body>
<h1>Function calculation e^(-x)</h1>
<form action="calculate" method="post">
    <label>Enter x: <input type="number" step="0.01" name="x" required></label><br>
    <label>Enter n: <input type="number" name="n" required></label><br>
    <label>Enter e1: <input type="number" step="0.0001" name="e1" required></label><br>
    <label>Enter e2: <input type="number" step="0.0001" name="e2" required></label><br>
    <button type="submit">Calculate</button>
</form>
</body>
</html>
