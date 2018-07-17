PImage monocle;
PImage ronald;
PImage hat;
void setup() {
  ronald=loadImage("ronald.jpg");
  size(800,600);
  ronald.resize(width,height);
  hat=loadImage("hat.png");
  hat.resize(400,200);
  monocle=loadImage("monocle.png");
}

void draw () {
  background(ronald);
  if(mousePressed){
    image(hat,mouseX,mouseY);
    image(monocle,mouseX+250,mouseY+250);

}}