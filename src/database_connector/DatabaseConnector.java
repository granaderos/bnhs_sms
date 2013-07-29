package database_connector;

import java.sql.*;

public class DatabaseConnector {
	protected Connection connection;
	protected Statement statement;
	protected PreparedStatement prepare_statement;
	protected ResultSet result_set;
	
	public DatabaseConnector() throws SQLException {
		this.connection = get_connection();
		this.statement = connection.createStatement();
	}
	
	public Connection get_connection() {
		try {
			String database_driver = "com.mysql.jdbc.Driver";
			String database_server = "localhost";
			String database_port = "3306";
			String database_name = "bnhs_data";
			String database_username = "student1";
			String database_password = "password";
			String database_url = "jdbc:mysql://" + database_server + ":" + database_port + "/" + database_name;
			
			Class.forName(database_driver);
			connection = DriverManager.getConnection(database_url, database_username, database_password);
			System.out.println("Connected to database!");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public void close_connection() {
		try {
			if(connection != null) {
				connection.close();
				
				System.out.println("Database connection was closed!");
			}
			if(statement != null) {
				statement.close();
			}
			if(prepare_statement != null) {
				prepare_statement.close();
			}
			if(result_set != null) {
				result_set.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
