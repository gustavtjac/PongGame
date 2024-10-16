import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {
GamePanel panel;
    GameFrame(){
panel = new GamePanel();
this.add(panel);
this.setTitle("Pong Game");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setResizable(false);
this.setBackground(Color.BLACK);
this.setLocationRelativeTo(null);
this.pack();




this.setVisible(true);
    }
}
