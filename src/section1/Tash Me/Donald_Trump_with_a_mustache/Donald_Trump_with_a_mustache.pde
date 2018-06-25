PImage mustache;
PImage donaldtrump;
PImage goodhat;
void setup(){
  donaldtrump = loadImage("Donald Trump.jpg");
  size(1000,1000);
  donaldtrump.resize(1000,1000);
  mustache = loadImage("mustache.png");
  goodhat = loadImage("goodhat.png");
  goodhat.resize(800,800);
}

void draw(){
  background(donaldtrump);
  image(mustache,mouseX,mouseY);
  image(goodhat,mouseX-120,mouseY-700);
}
   
   