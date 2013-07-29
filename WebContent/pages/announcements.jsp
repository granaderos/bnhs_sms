<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% if(session.getAttribute("current_user_id") != null) {
		
	}	

%>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Announcements</title>
		<link href = "../css/stylesheets.css" rel = "stylesheet" />
	</head>
	<body>
		<%@include file = "_header.jsp" %>
			<%@include file = "_navigator.jsp" %>
			
			<div id = "announcement_container_div" class = "container">
				<h3>Announcements</h3>
				<div id = "add_announcement_div">
					<form id = "add_announcement_form">
						Title:<br />
						<input type = "text" name = "announcement_title" required /><br />
						<textarea name = "announcement" placeholder = "What's up?" required></textarea><br />
						<span class = "pull-left">Announce to:</span><br />
						<select class = "pull-left" name = "announce_to"></select>
						<span class = "pull-right">
							<button class = "btn btn-primary input-small" type = "submit">post</button>
							<button class = "btn btn-danger input-small" type = "reset">reset</button>
						</span>
					</form>
				</div><!-- add_announcement_div ends -->
			</div>
			
		<%@include file = "_footer.jsp" %>
	</body>
</html>