PImage rainbow;
PImage unicorn;

void setup(){
  rainbow = loadImage("rainbow.jpg");
  size(400,206);
  rainbow.resize(400,206);
  background(rainbow);
  unicorn = loadImage("unicorn.png");
  unicorn.resize(50,50);
}

void draw(){
  background(rainbow);
  image(unicorn,mouseX,mouseY);
}
  