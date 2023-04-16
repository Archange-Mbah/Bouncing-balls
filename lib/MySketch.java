import processing.core.PApplet;

public class MySketch extends PApplet {
    public static void main(String[] args) {
		PApplet.runSketch(new String[]{""}, new MySketch());
    }

    Ball b1 = new Ball(color(17,50,230));
    Ball b2 = new Ball(color(230,50,17));

    public void settings() {
        size(600,600);
    }

    public void setup() { 
        background(0);
    }

    public void draw() {
        background(0);
        b1.randomPos();
        b1.draw();
        b2.randomPos();
        b2.draw();
    }

    class Ball {
        int x, y;
        int color;
        Ball(int color) {
            this.color = color;
            randomPos();
        }
        void randomPos() {
            x = (int)(Math.random() * width);
            y = (int)(Math.random() * height);
        }
        void draw() {
            fill(color);
            ellipse(x,y,40,40);
        }
    }
}
