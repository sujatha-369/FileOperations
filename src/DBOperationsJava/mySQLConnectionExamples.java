package DBOperationsJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mySQLConnectionExamples {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
     
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://root@localhost/databasejava");
	Statement statement = connect.createStatement();
	ResultSet results = statement.executeQuery("Select * from loginpwd");
	
	while(results.next())
	{
		
		//System.out.println("id is "+ results.getInt(1)+ " UserName is "+results.getString(2) + " Password is "+results.getString(3));
		System.out.println(results.getInt(1)+ " " + results.getString(2) + " "+results.getString(3));
	}
	 		

	}

}
