import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
	public void settings() {

	    size(400, 400);
	  }

	  public void setup() {
	    background(0);
	  }

	  public void draw() {
		  
		  
		 stroke(100);
		 fill(100);
		 
		 ellipse(width - 150, height - 150, width/16, height/16);
		 ellipse(width/2, height - 170, width/16, height/16);
		 
		 ellipse(width - 310, height - 160, width - 250, height - 250);
		 
		 stroke(87);
		 fill(87);
		 
		 ellipse(width - 300, height - 140, width/16, height - 385);
		 ellipse(width - 350, height - 180, width/16, height - 385);
		 ellipse(85, 290, width/16, height - 385);
		 ellipse(120, 230, width/16, height - 385);
		 ellipse(50, 270, width/16, height - 385);
		 ellipse(40, 240, width/16, height - 385);
		 ellipse(120, 280, width/16, height - 385);
		 ellipse(90, 190, width/16, height - 385);
		 ellipse(45, 210, width/16, height - 385);
		 ellipse(130, 205, width/16, height - 385);
		 
		 stroke(225);
		 fill(225);
		 
		 line(width - 130, height - 150, width - 50, height - 150);
		 line(width - 130, height - 160, width - 100, height - 160);
		 line(width - 130, height - 140, width - 100, height - 140);
		 
		 line(width - 180, height - 170, width - 130, height - 180);
		 line(width - 190, height - 190, width - 150, height - 210);
		 line(width - 180, height - 180, width - 100, height - 200);
		 
		 beginShape();
		 vertex(70, 80);
		 vertex(65, 70);
		 vertex(70, 60);
		 vertex(75, 70);
		 endShape();
		 
		 beginShape();
		 vertex(60, 55);
		 vertex(55, 45);
		 vertex(60, 35);
		 vertex(65, 45);
		 endShape();
		 
		 beginShape();
		 vertex(100, 70);
		 vertex(90, 50);
		 vertex(100, 30);
		 vertex(110, 50);
		 endShape();
		 
		 
		 stroke(255, 198, 64);
		 fill(255, 198, 64);
		 
		 ellipse(width - 20, height - 350, width - 150, height - 150);
		  
		  
	  }

}