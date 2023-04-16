
import processing.core.*;


public class Ballsbouncing extends PApplet {

    //default implementierung der methode main
    public static void main(String[] args){
        
        PApplet.runSketch(new String[]{""},new Ballsbouncing());
    }
   int counter=0;
    int xspeed=3;
    int yspeed=3;
    int x2speed=4;
    int y2speed=4;
    Ball b1= new Ball(color(255,300,400));
    Ball b2= new Ball(color(255,0,300));

    public void settings(){
        size(600,600);
    }
    public void setup(){
        background(0);
    }
    public void draw(){
        background(0);
        if(counter==0){
        b1.randomPos();
    } 
        b1.draw();

       if(counter==0){ 
        b2.randomPos();
       } 
        b2.draw();

        b1.setx(xspeed);
        b1.sety(yspeed);
        b2.setx(x2speed);
        b2.sety(y2speed);
        
        if(b1.x>width || b1.x<0) xspeed=-xspeed;
        if(b1.y>height || b1.y<0) yspeed=-yspeed;
        if(b2.x>width || b2.x<0) x2speed=-x2speed;
        if(b2.y>height || b2.y<0) y2speed=-y2speed;

        if( Math.sqrt(Math.pow((b1.x-b2.x),2)+Math.pow((b1.y-b2.y),2))<=60){
            
            xspeed=-xspeed;
            yspeed=-yspeed;
            x2speed=-x2speed;
            y2speed=-y2speed;
           /*  if(xspeed>x2speed) {
            xspeed=-(xspeed-1);
            x2speed=-(x2speed+1);
            }else if(x2speed>xspeed ){
                x2speed=-(x2speed-1);
                xspeed=-(xspeed+1);
            }
            else{xspeed=-xspeed;
                x2speed=-x2speed;
            }

            if(yspeed>y2speed) {
                yspeed=-(yspeed-1);
                y2speed=-(y2speed+1);
                }else if(y2speed>yspeed ){
                    y2speed=-(y2speed-1);
                    yspeed=-(yspeed+1);
                }
                else{yspeed=-yspeed;
                    y2speed=-y2speed;
                }
          if(xspeed==0) xspeed=6;      
          if(x2speed==0) x2speed=4;  
          if(yspeed==0) yspeed=6;  
        if(y2speed==0) y2speed=4;*/
    }  

    counter++;
    }



 class Ball{
    int x,y;
    int color;
    Ball(int color){
        this.color=color;
        randomPos();
    }
    void randomPos(){
        x=(int)(Math.random() * width);
        y=(int)(Math.random() * height);
    }
      void draw(){
        fill(color);
        ellipse(x,y,40,40);
    }



  public void setx(int n){
       x=x+n;
  }
  public void sety(int n){
    y=y+n;
  }
}

}


