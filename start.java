float t=0;

void setup(){
  background(200);
  size(500, 500);
  //frame(2);
  
}

void draw() {
  
  strokeWeight(5);
  
  
  translate(width/2, height/2); //move point to middle
  //line(x(t), y(t), x2(t), y2(t));
  
  stroke(0, 0 ,0);
  point(x(t), y(t));
  stroke(255, 0 ,0);
  point(x2(t), y2(t));
  t++;
  println(t);
  
  
}

float x(float t) {
  return 90-300*sin(t*80);
}

float y(float t) {
  return sin(t/10)*100; 
   
}
float x2(float t) {
  return cos(t*90)*150;
}

float y2(float t) {
  return sin(t*60)*150; 
   
  //coefficient in sine changes the frequency of the wave
  //coefficient outside changes the amplitu
}
