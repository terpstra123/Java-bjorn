package Hoofdstuk2;

import java.awt.*;
import java.applet.*;

public class o3 extends Applet{

    public void init(){

    }

    public void paint(Graphics g){
        setBackground(Color.white);
        g.setColor(Color.blue);
        g.drawString("bjorn", 50, 60);
        g.setColor(Color.red);
        g.drawString("terpstra", 50, 70);
    }
}