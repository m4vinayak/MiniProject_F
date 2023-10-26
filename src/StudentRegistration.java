import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.sql.SQLException;
		import java.util.Scanner;
		
public class StudentRegistration {

	public static void registerStudent() throws ClassNotFoundException, SQLException {
		
	

		
	  Class.forName("com.mysql.jdbc.Driver");
		        		
	 Connection connection = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12656072" , "sql12656072" , "c8Dz5Is25B");
	
	 
	 PreparedStatement statement = connection.prepareStatement("insert into student (firstname , lastname, username, password, city, mailid, mobileNumber)values(?,?,?,?,?,?,?)");
			        	  
	 Scanner scan = new Scanner(System.in);
			        	  
			        	  System.out.println("Enter the firstname ");
			        	  String firstname = scan.next();
			        	  System.out.println("Enter the last name");
			        	  String lastname = scan.next();
			        	  System.out.println("Enter the username");
			        	  String username = scan.next();
			        	  System.out.println("Enter the password");
			        	  String password = scan.next();
			        	  System.out.println("Enter the city");
			        	  String city = scan.next();
			        	  System.out.println("Enter your maiID");
			        	  String mailid = scan.next();
			        	  System.out.println("Enter your mobile number ");
			        	  String mobileNO = scan.next();
			        	     
			        		
			             
			            statement.setString(1, firstname);
			            statement.setString(2, lastname);
			            statement.setString(3, username);
			            statement.setString(4, password);
			            statement.setString(5, city);
			            statement.setString(6, mailid);
			            statement.setString(7, mobileNO); 
			            statement.executeUpdate();
			            
			             System.out.println("Resgistered successfully");
			       
			            
			        }
			       
			    
			
		

	}


