package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import models.AccountType;
import models.User;
import database_connector.DatabaseConnector;

public class UserController extends DatabaseConnector {

	public UserController() throws SQLException {
		super();
	}
	
	public ArrayList<AccountType> get_account_types() {
		ArrayList<AccountType> account_types = new ArrayList<AccountType>();
		
		try {
			String select_statement = "SELECT * FROM account_types";
			result_set = statement.executeQuery(select_statement);
			while(result_set.next()) {
				AccountType account_type = new AccountType(result_set.getInt("account_type_id"), result_set.getString("account_type"));
				account_types.add(account_type);
			}
			
			close_connection();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return account_types;
	}
	
	public void add_user(User user_info, String account_type) {
		try {
			String insert_statement = "INSERT INTO users VALUES (null, ?, ?, ?, ?, ?);";
			prepare_statement = connection.prepareStatement(insert_statement);
			prepare_statement.setString(1, user_info.getLast_name());
			prepare_statement.setString(2, user_info.getFirst_name());
			prepare_statement.setString(3, user_info.getMiddle_initial());
			prepare_statement.setString(4, user_info.getGender());
			prepare_statement.setString(5, user_info.getBirthday());
			prepare_statement.executeUpdate();
			
			String select_statement = "SELECT max(user_id) AS user_id FROM users;";
			result_set = statement.executeQuery(select_statement);
			int user_id = 0;
			while(result_set.next()) {
				user_id = result_set.getInt("user_id");
			}
			add_account(user_id, user_info.getUsername(), user_info.getPassword(), account_type);
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			close_connection();
		}
	}
	
	public void add_account(int user_id, String user_name, String password, String account_type) {
		try {
			String insert_statement2 = "INSERT INTO accounts VALUES (?, ?, ?, ?);";
			prepare_statement = connection.prepareStatement(insert_statement2);
			prepare_statement.setInt(1, user_id);
			prepare_statement.setString(2, user_name);
			prepare_statement.setString(3, password);
			prepare_statement.setInt(4, Integer.parseInt(account_type));
			prepare_statement.executeUpdate();
			System.out.println("Account type = " + account_type);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String validate_user(String user_name, String password) {
		String account_type = "none";
		try {
			String select_statement = "SELECT a.account_id FROM accounts AS a, users AS u WHERE u.user_id = a.user_id AND a.username = ? AND a.password = ?;";
			prepare_statement = connection.prepareStatement(select_statement);
			prepare_statement.setString(1,  user_name);
			prepare_statement.setString(2, password);
			result_set = prepare_statement.executeQuery();
			
			int account_type_id = 0;
			while(result_set.next()) {
				account_type_id = result_set.getInt("account_type_id");
			}
			String select_statement2 = "SELECT account_type FROM account_types WHERE account_type_id = ?;";
			prepare_statement = connection.prepareStatement(select_statement2);
			prepare_statement.setInt(1, account_type_id);
			result_set = prepare_statement.executeQuery();
			
			if(result_set.next()) {
				account_type =  result_set.getString("account_type");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return account_type;
	}
}
