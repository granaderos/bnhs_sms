$(function() {
	$("#about_us_a").hover(function() {
		var width = $("#about_us_a").parent().css("width");
		$("#about_us_sub_menu li").css({"width": width});
		$("#about_us_sub_menu").css({"display": "block"});
		
		$("#about_us_li").mouseleave(function() {
			$("#about_us_sub_menu").hide();
		});
	});
	
	$("#school_management_a").hover(function() {
		var width = $("#school_management_a").parent().css("width");
		$("#school_management_sub_menu li").css({"width": width});
		$("#school_management_sub_menu").css({"display": "block"});
		
		$("#school_management_li").mouseleave(function() {
			$("#school_management_sub_menu").hide();
		});
	});
	
	$("#students_a").hover(function() {
		$("#students_sub_menu").css({"display": "inline-block"});
		
		$("#students_li").mouseleave(function() {
			$("#students_sub_menu").hide();
		});
	});
	
	$("#show_option_icon").click(function() {
		$("#option_ul_container").css({"display": "inline-block"});
		
		$("#option_li").mouseleave(function() {
			$("#option_ul_container").hide();
		});
	});
});