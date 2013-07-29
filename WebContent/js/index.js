$(function() {
	get_account_types();
	
	$("#sign_up_button").click(function() {
		$("#overlay_container_div").show();
		$("#add_user_div").show(250);
	});
	
	$("#sign_in_button").click(function() {
		$("#overlay_container_div").show();
		$("#log_in_div").show(250);
	});
	
	/*************  Adding users  ******************/
	
	$("#register_user_button").click(function() {
		var user_info = {};
		var user_serialized_array = $("#add_user_form").serializeArray();
		var counter = 0;
		while(counter < user_serialized_array.length) {
			user_info[user_serialized_array[counter].name] = user_serialized_array[counter].value;
			counter++;
		}
		$.ajax({
			type: "POST",
			url: "AddUser",
			data: user_info,
			success: function(data) {
				$("#overlay_container_div").slideUp(250);
				$("#add_user_div").slideUp(250);
			},
			error: function(data) {
				console.log("Error in adding user = " + JSON.stringify(data));
			}
		});
	});
	/************ Hiding registration overlay division ********/
	$("#cancel_user_button").click(function() {
		$("#overlay_container_div").slideUp(250);
		$("#add_user_div").slideUp(250);
	});
	
	
	
	/******************* Log in process **********************/
	$("#log_in_button").click(function(e) {
		
	});
	
	$("#cancel_log_in_button").click(function() {
		$("#overlay_container_div").slideUp(250);
		$("#log_in_div").slideUp(250);
	});
	
	/************ Toggle both division *************/
	
	$(document).keypress(function(e) {
		if(e.keyCode == 27) {
			$("#overlay_container_div").slideUp(250);
			$("#add_user_div").slideUp(250);
			$("#log_in_div").slideUp(250);
		}
	});
	
	var page_height = $("html").css("height");
	$("#overlay_container_div").css({"height": page_height});
});

function get_account_types() {
	$.ajax({
		url: "GetAccountTypes",
		success: function(data) {
			$("#user_type").html(data);
		},
		error: function(data) {
			console.log("wew! Error in getting account types = " + JSON.stringify(data));
		}
	});
}