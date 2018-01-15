package Hoofdstuk2;

import java.awt.*;
import java.applet.*;

public class o2  extends Applet{

    public void init(){

    }

    public void paint(Graphics g){
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawString("Bjorn Terpstra", 50, 60);
    }
}