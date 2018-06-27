PImage catPic;


void setup(){
  size(800, 800);
  catPic = loadImage("catPic.jpg");
  catPic.resize(width,height);
  background(catPic);
  
  
  
}
void draw(){
  if(mousePressed){
    println("Mouse's x-position: " + mouseX + "Mouse's y-position: " + mouseY);
  
  }
  ellipse(529, 271, 50, 50);
  fill(#F70202);
}