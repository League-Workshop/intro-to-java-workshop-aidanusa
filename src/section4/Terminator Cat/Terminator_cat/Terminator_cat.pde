PImage catPic;
int x = 529;
int y = 271;
int acceleration = 5;
void setup(){
  size(800, 800);
  catPic = loadImage("catPic.jpg");
  catPic.resize(width,height);
  background(catPic);
  
  
  
}
void keyPressed(){
  x-=2*acceleration;
  y+=acceleration;
}
void draw(){
  if(mousePressed){
    println("Mouse's x-position: " + mouseX + "Mouse's y-position: " + mouseY);
  
  }
  noStroke();
  ellipse(x, y, 50, 50);
  ellipse(x-65, y, 50, 50);
  fill(#F70202);
  if (x < 0){
    background(catPic);
    x = 529;
    y = 271;
    acceleration = 2;
  }
}