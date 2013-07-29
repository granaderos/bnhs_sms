<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>BNHS</title>
		<link href = "css/stylesheets.css" rel = "stylesheet "/>
	</head>
	<body>
		<%@include file="pages/_header.jsp" %>
		
		<div id = "index_main_container" class = "container">
			<%@include file="pages/_navigator.jsp" %>
			
			<div id = "add_user_div" class = "container">
				<form id = "add_user_form">
					<h3><i class = "icon-group"></i> Create your account:</h3>
					<table>
						<tr>
							<td>Last name: </td><td><input type = "text" name = "user_last_name" required /></td>
						</tr>
						<tr>
							<td>First name: </td><td><input type = "text" name = "user_first_name" required /></td>
						</tr>
						<tr>
							<td>Middle name: </td><td><input type = "text" name = "user_middle_name" required /></td>
						</tr>
						<tr>
							<td>Gender: </td><td><input type = "radio" name = "user_gender" value = "female" /> female  <input type = "radio" name = "user_gender" value = "male" /> male</td>
						</tr>
						<tr>
							<td>Birthday: </td><td><input type = "text" name = "user_birthday" required /></td>
						</tr>
						<tr>
							<td>User name: </td><td><input type = "text" name = "user_username" required /></td>
						</tr>
						<tr>
							<td>Password: </td><td><input type = "password" name = "user_password" required /></td>
						</tr>
						<tr>
							<td>Type: </td><td><select name = "user_type" id = "user_type"></select></td>
						</tr>
					</table>
				</form>
				<button id = "register_user_button" class = "btn btn-primary"><i class = "icon-check"></i> Register</button>
				<button id = "cancel_user_button" class = "btn btn-danger"><i class = "icon-remove"></i> Cancel</button>
			</div><!-- add_user_div ends -->
			
			<div id = "log_in_div" class = "container">
				<form id = "log_in_form">
				<h4>Log in:</h4>
				<h6>Please fill up both fields for authentication.</h6>
					<input type = "text" placeholder = "user name here" id = "user_name_entered" required />
					<input type = "password" placeholder = "password here" id = "password_entered" required /><br />
					<button class = "btn btn-primary" id = "log_in_button"> <i class = "icon-check"></i> log-in</button>
					<button class = "btn btn-danger" id = "cancel_log_in_button"> <i class = "icon-remove"></i> cancel</button>
				</form>
			</div><!-- log_in_div ends -->
			
			<div id = "overlay_container_div"></div>
		</div><!-- index_main_container ends -->
		<%@include file="pages/_footer.jsp" %>
		
		<script src = "js/jquery-1.9.1.min.js"></script>
		<script src = "js/jquery-ui-1.10.2.min.js"></script>
		<script src = "js/bootstrap.min.js"></script>
		<script src = "js/navigator.js"></script>
		<script src = "js/index.js"></script>
		
	</body>
</html>