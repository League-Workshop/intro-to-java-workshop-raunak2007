
PImage ronald;
PImage hat;
void setup() {
  ronald=loadImage("ronald-reagan.jpg");
  size(800,600);
  ronald.resize(width,height);
  hat=loadImage("hat.jpg");
}

void draw () {
  background(ronald);
  if(mousePressed){
    background(ronald);
  }
  
    image(hat,300,400);
    hat.resize(mouseX,mouseY);

}