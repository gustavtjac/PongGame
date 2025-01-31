import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle{
int id;
int yVelocity;
int speed = 10;

    Paddle(int x, int y, int PADDLE_width, int PADDLE_height, int id) {
super(x,y,PADDLE_width,PADDLE_height);
this.id = id;
    }
    public void keyPressed(KeyEvent e){
switch (id){
    case 1:
        if(e.getKeyCode() == KeyEvent.VK_W){
            setYDirection(-speed);
            move();
        }
        if(e.getKeyCode() == KeyEvent.VK_S){
            setYDirection(speed);
            move();
        }
        break;
    case 2:
        if(e.getKeyCode() == KeyEvent.VK_UP){
            setYDirection(-speed);
            move();
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            setYDirection(speed);
            move();
        }
        break;

}
    }
    public void keyReleased(KeyEvent e){
        switch (id){
            case 1:
                if(e.getKeyCode() == KeyEvent.VK_W){
                    setYDirection(0);
                    move();
                }
                if(e.getKeyCode() == KeyEvent.VK_S){
                    setYDirection(0);
                    move();
                }
                break;
            case 2:
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    setYDirection(0);
                    move();
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    setYDirection(0);
                    move();
                }
                break;

        }
    }
    public void setYDirection(int y){
yVelocity = y;
    }
    public void move(){
y += yVelocity;
    }
    public void draw(Graphics g){
if(id==1){
    g.setColor(Color.red);
}
else{
    g.setColor(Color.green);
}
g.fillRect(x,y,width,height);
    }
}
