import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
// 
                        //Paint the background
                       //g.setColor(Color.RED);
                       //g.fillRect(x1, y1, width+1, height+1);
//                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw inner border
//                        g.setColor(Color.BLUE);
//                        g.drawRect(x1+25, y1+25, width-40, height-40);
                        
//                        //Draw Line
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        g.setColor(Color.BLACK);
//                        g.drawLine(x2, y1, x1, y2);
//                        
//                      /*  g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval((x2-(100/2))/2, (y2-(100/2))/2, 55, 55);*/
//                       Polygon p = new Polygon();
//                       p.addPoint(x1 + 5, y1 + 25);
//                       p.addPoint(x1 + 20, y1 + 10);
//                       p.addPoint(x1 + 35, y1 + 25);
//                       p.addPoint(x1 + 25, y1 + 25);
//                       p.addPoint(x1 + 25, y1 + 45);
//                       p.addPoint(x1 + 15, y1 + 45);
//                       p.addPoint(x1 + 15, y1 + 25);
//                       g.setColor(Color.YELLOW);
//                       g.fillPolygon(p);
                       
                       
                       
                       
                       
                       
                       g.setColor(Color.RED);
                       g.fillRect(x1, y1, width, height-80);
                       
                       g.setColor(Color.WHITE);
                       g.fillRect(x1, y1+50, width, height-80);
                       
                       g.setColor(Color.RED);
                       g.fillRect(x1, y1+100, width, height-80);
                       
                       g.setColor(Color.WHITE);
                       g.fillRect(x1, y1+150, width, height-80);
                       
                       g.setColor(Color.RED);
                       g.fillRect(x1, y1+200, width, height-80);
                       
                       Polygon p3 = new Polygon();
                       
                       p3.addPoint(x1,y1);
                       p3.addPoint(x2/2, y2/2);
                       p3.addPoint(x1, y2);
                       g.setColor(Color.BLUE);
                       g.fillPolygon(p3);
                       
//                       
                     Polygon p2 = new Polygon();
                     p2.addPoint(x1 + 25+50, y1 + 73+50);
                     p2.addPoint(x1 + 41+50, y1 + 73+50);
                     p2.addPoint(x1 + 47+50, y1 + 58+50);
                     p2.addPoint(x1 + 53+50, y1 + 73+50);
                     p2.addPoint(x1 + 69+50, y1 + 73+50);
                     p2.addPoint(x1 + 56+50, y1 + 83+50);
                     p2.addPoint(x1 + 61+50, y1 + 98+50);
                     p2.addPoint(x1 + 47+50, y1 + 88+50);
                     p2.addPoint(x1 + 34+50, y1 + 98+50);
                     p2.addPoint(x1 + 38+50, y1 + 83+50);
                     g.setColor(Color.WHITE);
                     g.fillPolygon(p2);
            }
}