import javax.swing.*;

public class InventoryApp{
  
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
    
      @Override public void run() {
        runApplication(); 
      }
    }); 
  }  
  public static void runApplication(){
    
    //InventoryModel model = new InventoryModel();
    InventoryView view = new InventoryView();
    InventoryController controller = new InventoryController(view);
    view.setQueryListener(controller);
    
  }  
}