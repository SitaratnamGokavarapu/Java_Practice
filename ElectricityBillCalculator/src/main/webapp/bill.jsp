<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String cname = request.getParameter("cname");
String cid = request.getParameter("id");
String units = request.getParameter("units");

int unitsConsumed = Integer.parseInt(units);

double billAmount = 0;

if (unitsConsumed > 0 && unitsConsumed <= 100) {
	billAmount = unitsConsumed * 2;
} else if (unitsConsumed > 100 && unitsConsumed <= 200) {
	billAmount = unitsConsumed * 3;
} else {
	billAmount = unitsConsumed * 5;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f6f9;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.bill-container {
	background: white;
	width: 400px;
	padding: 30px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
}

h2 {
	text-align: center;
	color: #333;
}

.bill-info {
	margin: 15px 0;
	font-size: 18px;
}

.amount {
	color: green;
	font-size: 24px;
	font-weight: bold;
	text-align: center;
	margin-top: 20px;
}
</style>
<title>Bill Generated Details</title>
</head>
<body>
	<div class="bill-container">
		<h2>Electricity Bill Details</h2>

		<div class="bill-info">
			<b>Customer Name:</b><%=cname%></div>

		<div class="bill-info">
			<b>Customer Id:</b><%=cid%></div>

		<div class="bill-info">
			<b>Units Consumed:</b><%=units%></div>

		<div class="amount">
			<b>Total Bill Amount:</b> ₹<%=billAmount%></div>
	</div>
</body>
</html>