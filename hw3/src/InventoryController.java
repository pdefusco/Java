public class InventoryController implements QueryListener{
    
  private InventoryView view;
  
  public InventoryController(InventoryView view){
   
   this.view = view;
  }
  
  @Override public void inventoryQuerySubmitted(InputQueryEvent inputQuery){
   System.out.println("Inventory Query Submitted" + inputQuery.getQuery());
   
   String passedQuery = inputQuery.getQuery();
   inputQuery.manipulateDatabase(passedQuery);
  }
  
}