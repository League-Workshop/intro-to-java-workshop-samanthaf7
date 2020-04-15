PImage rainbow;
PImage unicorn;

void setup() {
 rainbow=loadImage("rainbow.png");
 size(800,600);
 rainbow.resize(width,height);
 
 unicorn=loadImage("unicorn.png");
 unicorn.resize(80,80);
}

void draw() {
  background(rainbow);
  image(unicorn,mouseX,mouseY);
 
}
