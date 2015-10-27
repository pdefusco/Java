import java.sql.*;
//import javax.swing.JTable;



//This is meant to be the model -- I originally had a model class but in my view this can be the model

public class InputQueryEvent{
  
 public String inventoryQuery;
 
 public InputQueryEvent(String inventoryQuery){
  
   this.inventoryQuery = inventoryQuery;
 }
 
 public String getQuery(){
  return inventoryQuery; 
 }
 
 public void setQuery(String inventoryQuery){
   this.inventoryQuery = inventoryQuery;
 } 
  
 public void manipulateDatabase(String inventoryQuery){
    
      final String DATABASE_URL = "jdbc:mysql://localhost:3307/homework3";
      final String inventoryQueryExecuted = inventoryQuery;
      
      
      try (
             Connection connection = DriverManager.getConnection(DATABASE_URL, "PaulJava", "1234");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(inventoryQueryExecuted))
       {
        ResultSetMetaData metaData = resultSet.getMetaData();
        int numberOfColumns = metaData.getColumnCount();
    
        System.out.printf("Query Output:%n");
    
        for (int i = 1; i <= numberOfColumns; i++)
          System.out.printf("%-8s\t", metaData.getColumnName(i));
        System.out.println();
    
        while (resultSet.next())
        {
          for (int i = 1; i <= numberOfColumns; i++)
            System.out.printf("%-8s\t", resultSet.getObject(i));
          System.out.println();
        }
      }
      catch (SQLException sqlException)
      {
        sqlException.printStackTrace(); 
      }  
  }
}


