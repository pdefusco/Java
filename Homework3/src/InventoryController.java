

public class InventoryController implements QueryListener{
    
  //private InventoryModel model;
  private InventoryView view;
  
  public InventoryController(InventoryView view){
   //this.model = model;
   this.view = view;
  }
  
  @Override public void inventoryQuerySubmitted(InputQueryEvent inputQuery){
   System.out.println("Inventory Query Submitted" + inputQuery.getQuery());
   
   String passedQuery = inputQuery.getQuery();
   inputQuery.manipulateDatabase(passedQuery);
  }
  
}