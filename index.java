void setup() {
	size(300, 300);
}

void draw() {
	 // Draw a white background
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);


  background(255);
  // Set CENTER mode
  ellipseMode(CENTER);
  rectMode(CENTER);
  // Draw Zoog's body
  stroke(0);
  fill(mouseX, 5, 15);
  rect(mouseX, mouseY,25,100);
  // Draw Zoog's head
  stroke(0);
  fill(0 , mouseY, 0);
  ellipse(mouseX, mouseY - 30,70,70);
  fill(mouseX, mouseY, mouseX);
  stroke(0)

  fill(mouseX,mouseY, 50)
  ellipse(mouseX -10,mouseY -30,16,32);
  ellipse(mouseX +10,mouseY -30,16,32);
  // Draw Zoog's legs
  stroke(0);
    line(mouseX -10, mouseY +50, mouseX -20, mouseY +70);
    line(mouseX +10, mouseY +50, mouseX +20, mouseY +70);
   }
   void mousePressed(){
     println(" Take Me To Your Leader");
   }