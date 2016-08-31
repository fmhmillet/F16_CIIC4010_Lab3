import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
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
 
                          //Paint the background
                          g.setColor(Color.LIGHT_GRAY);
                          g.fillRect(x1, y1, width +1, height +1);
//                        
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
                          
                          //Ovall
                          g.setColor(Color.darkGray);
                          g.fillOval((x2-55)/2,(y2-55)/2, 55, 55);
            }
}