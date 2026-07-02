<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
body {
	font-family: Arial, sans-serif;
	background-color: #f4f6f9;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.container {
	background: white;
	padding: 30px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
	width: 350px;
}

h2 {
	text-align: center;
	color: #333;
}

input {
	width: 100%;
	padding: 10px;
	margin: 8px 0;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-sizing: border-box;
}

button{
    width: 100%;
    padding: 10px;
    background-color: #007bff;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

button:hover{
    background-color: #0056b3;
}
</style>
<title>Bill Calculation</title>
</head>
<body>
	<div class="container">
		<h2>Electricity Bill Calculator</h2>
	<form action="bill.jsp" method="post">
		<div>
			Customer name: <input type="text" name="cname"
				placeholder="Enter the customer name" required />
		</div>
		<div>
			Customer ID: <input type="text" name="cid"
				placeholder="Enter the customer Id" required/>
		</div>
		<div>
			Units Consumed <input type="number" name="units"
				placeholder="Enter the units consumed" required />
		</div>
		<div>
			<button type="Submit">Generate Bill</button>
		</div>

	</form>
	</div>
</body>
</html>