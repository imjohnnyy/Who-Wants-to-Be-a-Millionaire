package pdc_assignment2;

/**
 *
 * @author Johnny
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class UserAnswersDBConnectionTester {

    private static final String USER_NAME = "abc"; 
    private static final String PASSWORD = "abc"; 
    private static final String DATABASE_URL = "jdbc:derby:UserAnswersDB_Ebd;create=true";  

    Connection connection;
    

    public UserAnswersDBConnectionTester() {
        establishConnection();
    }

     public Connection getConnection() {
        return this.connection;
    }

    //Establishes a connection to database
    public void establishConnection() {

            try 
            {
                connection = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASSWORD);
                System.out.println(DATABASE_URL + " ,  Successfully Connected to the UserAnswersDB_Ebd Database...");
                
            } 
            catch (SQLException ex) 
            {
                System.out.println("ERROR: Failed to start database 'UserAnswersDB_Ebd', please stop the server before running the MilionaireApp class");
            }
        
    }

    public void closeConnections() 
    {
        if(this.connection != null)
        {
            try 
            {
                connection.close();
            } 
            catch (SQLException ex) 
            {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public static void main(String[] args) {
        
        UserAnswersDBConnectionTester dbTester = new UserAnswersDBConnectionTester();
        System.out.println(dbTester.getConnection());
        
    }
    
   
     
}