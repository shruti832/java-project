import java.applet.*;  
import java.awt.*;
import java.awt.event.*; 

public class sad extends Applet implements ActionListener {
    int a=0,b=0,c=0,f=0,x=0,y=0;
    Button u = new Button("Up");
    Button d = new Button("Down");
    Button l = new Button("Left");
    Button r = new Button("Right");
    
    public void init() {
        add(u);
        u.addActionListener(this);
        add(d);
        d.addActionListener(this);
        add(l);
        l.addActionListener(this);
        add(r);
        r.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == u) {
           y=y-1;
           a++;
        }
        else if (e.getSource() == d) {
            y=y+1;
            b++;
        }
        else if (e.getSource() == l) {
            x=x+1;
            c++;
        }
        else if (e.getSource() == r) {
            x=x-1;
            f++;
        }
        repaint();
    }

    public void paint(Graphics g){
        if(x>=0||y>=0){
            final int MID = 500;
            final int TOP = 500;
            setBackground(Color.cyan);
            g.setColor (Color.white);
            g.fillOval (MID-20+x, TOP+y, 70, 70);      // head
            g.setColor (Color.black);
            g.fillOval (MID-10+x, TOP+10+y, 15, 15);   // left eye
            g.fillOval (MID+15+x, TOP+10+y, 15, 15);    // right eye
            g.drawArc (MID+x, TOP+45+y, 20, 10, -180, -180);   // smile
        }
    }
}  
/* 
<applet code="sad.class" width="1000" height="1000"> 
</applet> 
*/