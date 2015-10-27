
/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }
  
  //Homework 1
  
  public drawRectangle(){
   this.forward(20);
   this.turnRight();
   this.forward(40);
   this.turnRight();
   this.forward(20);
   this.turnRight();
   this.forward(40);
  }
  
  public drawHexagon(){
   this.forward(20);
   this.turnRight(60);
   this.forward(20);
   this.turnRight(60);
   this.forward(20);
   this.turnRight(60);
   this.forward(20);
   this.turnRight(60);
   this.forward(20);
   this.turnRight(60);
   this.forward(20);
   this.turnRight(60);
  }
  
  public drawPentagon(){
   this.forward(20);
   this.turnRight(72);
   this.forward(20);
   this.turnRight(72);
   this.forward(20);
   this.turnRight(72);
   this.forward(20);
   this.turnRight(72);
   this.forward(20);
   this.turnRight(72);
  }
  
  public drawZigZag(){
   this.forward(20);
   this.turnRight(-90);
   this.forward(40);
   this.turnRight(90);
   this.forward(20);
   this.turnRight(-90);
   this.forward(40);
   this.turnRight(90);
   this.forward(20);
   this.turnRight(-90);
   this.forward(40);
   this.turnRight(90);
   this.forward(20);
   this.turnRight(-90);
   this.forward(40);
   this.turnRight(90);
  }

 
  /////////////////// methods ///////////////////////
  
} // end of class Turtle, put all new methods before this