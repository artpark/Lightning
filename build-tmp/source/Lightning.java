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

public class Lightning extends PApplet {

//Art Parkeenvincha, Block 3, Lightning
float startX = 0;
float startY = 300;
float endX = 0;
float endY = 300;
float weight = 10;

public void setup()
{
  size(600,600);
  colorMode(HSB);
  strokeWeight(0.1f);
  background(110);
  stroke(255);
}
public void draw()
{
  background(110);
  while(endX < width){
    for (int i = 0; i < 2; i++){
      
      endX = startX + random(0, 9);
      endY = startY + random(-9, 9);    
  
//      stroke(#036DFF);
      strokeWeight(weight);  
      line(startX, startY, endX, endY);
//      stroke(0,0,255);
      strokeWeight(weight - 0.50f);  
      line(startX, startY, endX, endY);      
  
      startX = endX;
      startY = endY;
      
      weight -= 0.06f;
    }
  }
  
//  if(keyPressed == true && key == ' ')
//  {
    startX = 0;
    startY = 300;
    endX = 0;
    endY = 300;
    weight = 10;
//  }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
