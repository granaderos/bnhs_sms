package user_proccessors;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controllers.UserController;
import models.AccountType;
@WebServlet("/GetAccountTypes")
public class GetAccountTypes extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GetAccountTypes() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entered in getting account types servlet.");
		try {
			UserController execute_function = new UserController();
			
			ArrayList<AccountType> account_types = new ArrayList<AccountType>();
			account_types = execute_function.get_account_types();
			
			String options = "";
			int counter = 0;
			while(counter < account_types.size()) {
				options += "<option value = '" + account_types.get(counter).getId() + "'>" + account_types.get(counter).getAccountType() + "</option>";
				counter++;
			}
			response.getWriter().print(options);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
