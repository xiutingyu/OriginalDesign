import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int x=50;
int c=50;
public void mousePressed()
{
//fire crakers//
	background(150);
ellipse(50,50,c,c);
	c=c-5;
}

public void setup()
{
  size(400,400);

}
public void draw()
{
	background(150);
	land();
	body();
	windows();
	wheels();

}
public void land()
{
	fill(0,150,50);
	rect(0,200,400,200);
	//sky//
	fill(0,0,200);
	rect(0,0,400,200);
}
public void body()
{
	if(x<150){
		x=x+1;
}
	
  fill(128,128,0);
  rect(x+10,180,150,20);
  
  //bigrectangle//
  fill(0,255,0);
  rect(x-20,120,100,80);
  fill(204,153,255);
  rect(x+140,120,100,80); 
}

public void windows(){
  fill(255,255,255);
  rect(x-5,130,25,25);
  rect(x+45,130,25,25);
  rect(x+155,130,25,25);
  rect(x+195,130,25,25);
}

public void wheels() {
	noStroke();
	fill(36,32,32);
	stroke(0,100,0);
	//1st box wheeel//
	ellipse(x+10,200,30,30);
	ellipse(x+50,200,30,30);
	//2nd box wheel//
	ellipse(x+165,200,30,30);
	ellipse(x+205,200,30,30);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
