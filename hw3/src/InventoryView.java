import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class InventoryView extends JFrame implements ActionListener{
  
  private JTextField inventoryQueryField;
  private JButton submitJButton; 
  
  private QueryListener queryListener;
  
  private FlowLayout layout;
  public InventoryView(){
   super("INVENTORY DATABASE GUI"); 
    
  
   layout = new FlowLayout();
   setLayout(layout); 
   
   inventoryQueryField = new JTextField("", 35);
   
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