public class InventoryModel{
  
}
 /// 
  /*  
  public InventoryModel(String inputQueryEvent.getQuery;){
    
       
    public static void manipulateDatabase(inputQuery){
    
      final String DATABASE_URL = "jdbc:mysql:schemaname"
      
        
        try (
             Connection connection = DriverManager.getConnection(DATABASE_URL, "username", "password");
               Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(inputQuery))
      {
        ResultSetMetaData metaData = resultSet.getMetaData();
        int numberOfColumns = metaData.getColumnCount();
    
        System.out.printf("All the items in the inventory table:%n");
    
        for (int i = 1; i <= numberOfColumns; i++)
          System.out.printf("%-8s\t", metaData.getColumnName(i));
        System.out.println();
    
        while (resultSet.next())
        {
          for (int i = 1; i <= numberOfColumns; i++)
            System.out.printf("%-8s\t", metaData.getObject(i));
          System.out.println();
        }
      }
      catch (SQLException sqlException)
      {
        sqlException.printStackTrace(); 
      }  
  }
}*/