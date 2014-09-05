//Art Parkeenvincha, Block 3, Lightning
float startX = 0;
float startY = 300;
float endX = 0;
float endY = 300;
float weight = 10;

void setup()
{
  size(600,600);
  colorMode(HSB);
  strokeWeight(0.1);
  background(110);
  stroke(255);
}
void draw()
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
      strokeWeight(weight - 0.50);  
      line(startX, startY, endX, endY);      
  
      startX = endX;
      startY = endY;
      
      weight -= 0.06;
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