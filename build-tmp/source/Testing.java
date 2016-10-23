import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Testing extends PApplet {

public void setup()
{
	
}

public void draw()
{
	background(0);
	fill(255);
	ellipse(500,500,50,50);
}
  public void settings() { 	size(1000,1000); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Testing" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
