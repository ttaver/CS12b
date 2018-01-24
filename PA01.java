
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *  When run as a program, this class opens a window on the screen that
 *  shows a large number of colored disks.  The positions of the disks
 *  are selected at random, and the color is randomly selected from
 *  red, green, or blue.  A black outline is drawn around each disk.
 *  The picture changes every three seconds.
 */
public class PA01 extends JPanel implements ActionListener {

    /**
     * Draws 500 disks with random colors and locations.
     * Each disk has a radius of 50 pixels.  This subroutine is
     * called every three seconds, giving a new set of disks.
     */
    public void drawFrame(Graphics g, int frameNumber, int width, int height) {
      System.out.println(frameNumber);

      int x = width*(int)Math.sin(frameNumber/1000);
      int y = height*(int)Math.cos(frameNumber/1000);

      int centerX=frameNumber%width;     // The x-coord of the center of a disk.
      int centerY=frameNumber%height;     // The y-coord of the center of a disk.

      g.setColor(new Color(frameNumber %255,0,0)); //change with frameNumber
      g.fillOval(centerX - 50, centerY - 50, 100, 100 +frameNumber%50);
      g.setColor(new Color(255,200,200));
      g.fillRect(20,400,200,100);
      g.setColor(Color.BLACK);
      g.drawRect(20,400,200,100);

      Font c = new Font("Courier", Font.PLAIN, 18);
      g.setFont(c);
      g.drawString("Hello World (courier)"+ frameNumber, 200,10);

    /*        g.setColor(Color.RED);
            g.fillOval(x,y,width/2,height/2);
            g.setColor(Color.BLACK);
            g.drawOval(0,0,width/2,height/2);

            g.setColor(Color.BLUE);
            g.fillOval(width/2,0,width/2,height/2);
            g.setColor(Color.BLACK);
            g.drawOval(width/2,0,width/2,height/2);

            g.setColor(Color.YELLOW);
            g.fillOval(0,width/2,width/2,height/2);
            g.setColor(Color.BLACK);
            g.drawOval(0,width/2,width/2,height/2);

            g.setColor(Color.GREEN);
            g.fillOval(width/2,width/2,width/2,height/2);
            g.setColor(Color.BLACK);
            g.drawOval(width/2,width/2,width/2,height/2);
*/


    }

    //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS ------


    public static void main(String[] args) {

        /* NOTE:  The string in the following statement goes in the title bar
         * of the window.
         */
        JFrame window = new JFrame("Random Disks");

        /*
         * NOTE: If you change the name of this class, you must change
         * the name of the class in the next line to match!
         */
        PA01 drawingArea = new PA01();

        drawingArea.setBackground(Color.WHITE);
        window.setContentPane(drawingArea);

        /* NOTE:  In the next line, the numbers 500 and 500 give the
         * initial width and height of the drawing array.  You can change
         * these numbers to get a different size.
         */
        drawingArea.setPreferredSize(new Dimension(500,500));

        window.pack();
        window.setLocation(100,50);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        /*
         * Note:  In the following line, you can change false to
         * true.  This will prevent the user from resizing the window,
         * so you can be sure that the size of the drawing area will
         * not change.  It can be easier to draw the frames if you know
         * the size.
         */
        window.setResizable(false);

        /* NOTE:  In the next line, the number 3000 gives the time between
         * calls to drawFrame().  The time is given in milliseconds, where
         * one second equals 1000 milliseconds.  You can change the number
         * to control the animation speed.
         */
        Timer frameTimer = new Timer(20,drawingArea);

        window.setVisible(true);
        frameTimer.start();

    } // end main

    private int frameNum;

    public void actionPerformed(ActionEvent evt) {
        frameNum++;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFrame(g, frameNum, getWidth(), getHeight());
    }

}
