package user_proccessors;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controllers.UserController;

import models.User;

@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddUser() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int user_id = 0;
		String last_name = request.getParameter("user_last_name");
		String first_name = request.getParameter("user_first_name");
		String middle_initial = request.getParameter("user_middle_name").substring(0, 1);
		String gender = request.getParameter("user_gender");
		String birthday = request.getParameter("user_birthday");
		String username = request.getParameter("user_username");
		String password = request.getParameter("user_password");
		String account_type = request.getParameter("user_type");
		System.out.println("Gender = " + gender);
		try {
			User user_info = new User(user_id, last_name, first_name, middle_initial, gender, birthday, username, password);
			UserController execute_function = new UserController();
			
			execute_function.add_user(user_info, account_type);
			response.getWriter().print(birthday);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
