package app;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.EventListener;

public class Rectangle {

    private Field field;
    private static Color color;
    private static  int x = 200;
    private static int y = 200;
    private static int width = x;
    private static int height = y;

    public static  int getX() {
        return x;
    }

    public static void setX(int X) {
        x = X;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int Y) {
        y = Y;
    }

    public static int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public static int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static boolean contains(double mx, double my){
        boolean mark = false;
        if(mx >= x && my >= y)
            if(my <= height+y && mx <= width+x)
                mark = true;
        return mark;

    }

    public static void setPos(double Mx, double My){
        setX((int) Mx);
        setY((int) My);
    }

    public Rectangle() {

        // Необходимо иметь ссылку на поле, по которому прыгает мяч,  
        // чтобы отслеживать выход за его пределы  
        // через getWidth(), getHeight() 

        color = new Color((float)Math.random(), (float)Math.random(), (float)Math.random());
        //addMouseListener(this)
        // addMouseMotionListener(new MouseMotionHandler());
        //addMouseListener(new MouseHandler());
    }

    public static void paint(Graphics2D canvas) {
        System.out.println(x);
        color = new Color(150, 255, 146);
        canvas.setColor(color);
       // canvas.fillRect(x, y, width, height);
    }

    /*
     * нажатие кнопки мыши — идентификатор MOUSE_PRESSED;
     * отпускание кнопки мыши — идентификатор MOUSE_RELEASED;
     * щелчок кнопкой мыши — идентификатор MOUSE_CLICKED (нажатие и отпускание не различаются);
     * перемещение мыши — идентификатор MOUSE_MOVED;
     * перемещение мыши с нажатой кнопкой — идентификатор MOUSE_DRAGGED;
     * появление курсора мыши в компоненте — идентификатор MOUSE_ENTERED;
     * выход курсора мыши из компонента — идентификатор MOUSE_EXITED.
     *
     */
        
       /*   public class MouseHandler extends MouseAdapter{
                 public MouseHandler() {
		    }

          public void mouseClicked(MouseEvent e) {

          }

          public void mouseEntered(MouseEvent e) {

          }

          public void mouseExited(MouseEvent e) {

          }

          public void mousePressed(MouseEvent e) {
             if ((e.getModifiers() & MouseEvent.BUTTON1_MASK) == 0)
             System.out.println("click");

          }

          public void mouseReleased(MouseEvent e) {

          }
     }
         
         public class MouseMotionHandler implements MouseMotionListener{
             
             public void mouseDragged(MouseEvent e){
                 
             }
             
             public void mouseMoved(MouseEvent e){
                 
             } 
             
         }*/
	/*public boolean contains(int x1, int y1)	{
		if ((this.x < x1 && this.width > x1) && (this.y < y1 && this.height > y1))
			return true;
		else
			return false;
		
	}*/

}