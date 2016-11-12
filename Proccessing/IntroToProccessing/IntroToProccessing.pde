void setup(){
size(600,600);
ellipse(300,300,150,150);
}
void draw(){ 
if(mousePressed){
  fill(255,0,255);
  ellipse(300,300,150,150);
}
else{
ellipse(300,300,150,150);
fill(0,0,0);
}
}


