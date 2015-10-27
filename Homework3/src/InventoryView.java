import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class InventoryView extends JFrame implements ActionListener{
  
  private JTextField inventoryQueryField;
  private JButton submitJButton; 
  // private InventoryModel model;
  private QueryListener queryListener;
  
  private FlowLayout layout;
  public InventoryView(){
   super("INVENTORY DATABASE GUI"); 
   //this.model = model; 
   
   layout = new FlowLayout();
   setLayout(layout); 
   
   inventoryQueryField = new JTextField("SELECT * FROM homework3.inventory;", 35);
   //inventoryTypeField.setPreferredSize();
   add(new JLabel("INSERT SELECT STATEMENT HERE:"));
   add(inventoryQueryField);
   submitJButton = new JButton("Submit Query");
   add(submitJButton);

   submitJButton.addActionListener(this);
   setVisible(true);
  }
      
   @Override public void actionPerformed(ActionEvent event){
     
      String inventoryQuery = new String(inventoryQueryField.getText()); 
           
      fireInputQuery(new InputQueryEvent(inventoryQuery));
      
    }
    
    public void setQueryListener(QueryListener queryListener){
      this.queryListener = queryListener;
    }
    
//  public void 
    
    public void fireInputQuery(InputQueryEvent event){
      if(queryListener != null){
        queryListener.inventoryQuerySubmitted(event);
        
      }
    }
  
}