import processing.core.*;


public class Ballsbouncing extends PApplet {

    //default implementierung der methode main
    public static void main(String[] args){
        
        PApplet.runSketch(new String[]{""},new Ballsbouncing());
    }
     
    int keyboard=0;
   int counter=0;
    int xspeed=1;
    int yspeed=1;
    int x2speed=1;
    int y2speed=1;
    int xrec=0;
    int yrec=0;
    int xel=0;
    int yel=0;
    Ball b1= new Ball(color(255,300,400));
    Ball b2= new Ball(color(0,0,300));

    public void settings(){
        fullScreen();
    }
    
    public void setup(){
        background(0);
    }
   // int xrec=600/2;
   // int yrec=height-(height/12);

  // int xel=(width/2)+5;
   //int yel=(height-height/12);
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
        }  

        counter++;
        if(keyboard==0){
        xel=(width/2)+5;
        yel=(height-height/12);
        xrec=width/2;
        yrec=height-(height/12);
    }
  if(keyboard==1){
        yrec=yrec-1;
        yel=yel-1;
    }
    if(keyboard==3){
        yrec=yrec+1;
        yel=yel+1;
        if(yrec==height-(height/12)&&yel==(height-height/12)){
            keyboard=0;
        }
    }
        fill(153,102,0);
        rect(xrec,yrec, 10, 20);
        fill(0,102,0);
        ellipse(xel,yel,50,10);
        
 }
       
        public void keyPressed(){
         if(keyboard!=1)   keyboard=1;
       // yrec+=yrec;
       // yel+=yel;
        }
        public void keyReleased(){
           if(keyboard!=3) keyboard=3;

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

            if(x%5==0)fill(color);
            else fill(255,0,0);
            ellipse(x,y,10,40);
            if(y%5==0)fill(0,0,255);
            else fill(0,255,0);
            ellipse(x,y,40,10);
        }
    
    
    
      public void setx(int n){
           x=x+n;
      }
      public void sety(int n){
        y=y+n;
      }
    }
    
    }
    
    
           