import java.util.Random;

import processing.core.PApplet;


public class Bounce extends PApplet {

    //default implementierung der methode main
    public static void main(String[] args){
        String[] a= {"t"};
        Bounce y= new Bounce();
        PApplet.runSketch(a, y);
    }

     // Hier wird die Fenstergröße angelegt mithilfe der methode size()
    public void settings(){
        size(800,400);
    }

    Random rand=new Random();
    float circleX=rand.nextFloat(40,width); //initialisierung der X Coordinaten von der Ellipse
    float circleY=rand.nextFloat(40,height);// initialising de y coordinate of the Ellipse
    float xspeed=5;   //The x component of the speed is initialised
    float yspeed=3;  // The y component of the speed is initialised
    
    //Using the method draw to draw;
    public void draw(){
        background(0);
        if(xspeed>0) { //when the xspeed is positive the background is green and the ball is grey
            background(0, 255, 0);
            fill(255) ;
            ellipse(circleX+1, circleY, 100, 100);
            if( yspeed<0) {// if the xspeen is postive and the yspeed is negative, the ball is blue;
                background(255);
                fill(0,0,255);
                ellipse(circleX, circleY, 50, 50);
            }
        }
       else{
            fill(255,0,0);
            ellipse(circleX, circleY, 50, 50);
        }


 circleX=circleX+xspeed; //changes the  xposition
 circleY=circleY+yspeed; // changes the ypostion
        
 if((circleX>width)||(circleX<0)){ // causes the ball to bounce back when it hits the vertical walls
        xspeed= -xspeed;
}
if((circleY>height)||(circleY<0)){ // causes the ball to... horizontal walls
    yspeed= -yspeed;
}

}


}