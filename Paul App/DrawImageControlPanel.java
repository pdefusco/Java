import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.text.*;
import javax.swing.JPanel;


public class DrawImageControlPanel extends JPanel{
  
  public class Picture {
  
  public static void main(String args[]){
   String fileName = "c:/intro-prog-java/mediasources/jenny-red.jpg";
   Picture jennyPicture = new Picture(fileName); 
  }
  
  public void increaseRed(int inputFactor){
    
   Pixel[] pixelArray = this.getPixels(); 
   Pixel pixel = null;
   int value = 0;
   int index = 0;
   
   while(index < pixelArray.length)
   {
     pixel = pixelArray[index];
     value = pixel.getRed();
     value = (int)(value * inputFactor);
     pixel.setRed(value);
     index = index+1;
   }
  }
  
  public void increaseGreen(){
    
   Pixel[] pixelArray = this.getPixels(); 
   Pixel pixel = null;
   int value = 0;
   int index = 0;
   
   while(index < pixelArray.length)
   {
     pixel = pixelArray[index];
     value = pixel.getGreen();
     value = (int)(value * 1.5);
     pixel.setGreen(value);
     index = index+1;
   }
  }
  
}
}