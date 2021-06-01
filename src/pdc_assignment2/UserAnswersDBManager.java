package pdc_assignment2;

/**
 *
 * @author Johnny
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class UserAnswersDBManager {

        UserAnswersDBManager dbTester;
        Connection connection;
        Statement statement;


        public UserAnswersDBManager() 
        {
           UserAnswersDBConnectionTester dbTester = new UserAnswersDBConnectionTester();
            connection = dbTester.getConnection();
            try 
            {
                statement = connection.createStatement();
            } 
            catch (SQLException e) 
            {
                System.out.println(e.getMessage());
            }

        }

        //This createUATable() method creates the AUDIENCE_ANSWERS table along with the two columns - ROUND_NUMBER and SELECTED_ANSWER_NUMBER, in the UserAnswersDB_Ebd database
        public void createUATable() throws SQLException 
        {
            String createTable = "CREATE TABLE USER_ANSWERS " + "(ROUND_NUMBER integer NOT NULL, " +
              "SELECTED_ANSWER_OPTION char(1) NOT NULL)"; 

            try  
            {
               statement.executeUpdate(createTable);
               System.out.println("A new AudienceAnswers table has been created!");
            } 
            catch (SQLException e) 
            {
               System.out.println(e.getMessage());
            }

        }

        
        //This insertDataIntoUATable() method allows for the recording of the user's selected answers of each round into the UserAnswersDB_Ebd database, that is called in the MillionaireApp class
        public void insertDataIntoUATable(int questionNum, String option) 
        {

            try {
                System.out.println("\n");
                String data = "INSERT INTO AUDIENCE_ANSWERS(ROUND_NUMBER, SELECTED_ANSWER_OPTION) VALUES (?, ?)";
                PreparedStatement pStatement = connection.prepareStatement(data);

                pStatement.setInt(1, questionNum);
                pStatement.setString(2, option);
                pStatement.executeUpdate();

            } 
            catch (SQLException e) 
            {
                System.out.println(e.getMessage());
            }
            
        }
        
        //This clearAllDataInUATable() method deletes all of the existing data from the USER_ANSWERS table in the UserAnswersDB_Ebd database
        public void clearAllDataInUATable() throws SQLException 
        {
            String clearData = "DELETE FROM AUDIENCE_ANSWERS";
            PreparedStatement pStatement = connection.prepareStatement(clearData);
            pStatement.executeUpdate();

        }


        public void closeConnection() {
            this.dbTester.closeConnection();
        }


}



