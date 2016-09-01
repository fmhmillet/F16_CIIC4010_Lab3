import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;



import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

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
                        Graphics2D g2 = (Graphics2D) g;
                        
                        
                        //Paint the background
                          g.setColor(Color.RED);
                          g.fillRect(x1, y1, width +1, height +1);
                        
//                        //Draw a border
//                        g.setColor(Color.red);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw a border
//                        g.setColor(Color.BLACK);
//                        g.drawRect(x1 +5, y1 +5, width - 10, height -10);
//                        
//                        //Draw a diagonal line 1
//                        g.setColor(Color.GREEN);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        //Draw a diagonal line 2
//                        g.setColor(Color.orange);
//                        g.drawLine(x1, y2, x2, y1);
//                          
//                        //Ovall
//                        g.setColor(Color.darkGray);
//                        g.fillOval((x2-55)/2,(y2-55)/2, 55, 55);
//                          
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                                       
                          Rectangle.Double body1 = new Rectangle.Double(x1 + 0,y1 +32,300,32.0);
                          g2.setColor(Color.white);
                          g2.fill(body1);
                          
                          Rectangle.Double body2 = new Rectangle.Double(x1 + 0,y1 +96,300,32.0);
                          g2.fill(body2);
                           
                          Polygon p1 = new Polygon();
                          p1.addPoint(x1 + 0, y1 + 0);
                          p1.addPoint(x1 + 125, y1 + 80);
                          p1.addPoint(x1 + 0, y1 + 0);
                          p1.addPoint(x1 + 0, y1 + 160);
                          p1.addPoint(x1 + 0, y1 + 160);
                          p1.addPoint(x1 + 125, y1 + 80);
                          g.setColor(Color.CYAN);
                          g.fillPolygon(p1);
                         
                          Polygon p2 = new Polygon();
                          p2.addPoint(x1 + 25, y1 + 73);
                          p2.addPoint(x1 + 41, y1 + 73);
                          p2.addPoint(x1 + 47, y1 + 58);
                          p2.addPoint(x1 + 53, y1 + 73);
                          p2.addPoint(x1 + 69, y1 + 73);
                          p2.addPoint(x1 + 56, y1 + 83);
                          p2.addPoint(x1 + 61, y1 + 98);
                          p2.addPoint(x1 + 47, y1 + 88);
                          p2.addPoint(x1 + 34, y1 + 98);
                          p2.addPoint(x1 + 38, y1 + 83);
                          g.setColor(Color.WHITE);
                          g.fillPolygon(p2);
                                         
            }
}