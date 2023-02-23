import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Panda extends JFrame implements KeyListener, MouseListener{

	ImageIcon img = new ImageIcon("tiniii.gif");
        //ImageIcon img = new ImageIcon("scared.jfif");
	JTextField tfAction = new JTextField("Action Taken");
	JLabel object = new JLabel(img);
	
	public Panda() {
		setSize(950,640);
		setLayout(new FlowLayout());
		setTitle("Victini");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Toolkit tk = getToolkit();
	    Dimension size = tk.getScreenSize();
	    setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
	    
	    tfAction.setFocusable(false);
	    addKeyListener(this);
            addMouseListener(this);
		add(tfAction);
		add(object);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Panda();
	}
	@Override
	public void keyTyped(KeyEvent e) {

		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			tfAction.setText("Pressed arrow key UP");
			object.setLocation(object.getX(), object.getY()-5);
		}else if (e.getKeyCode() == KeyEvent.VK_DOWN){
			tfAction.setText("Pressed arrow key Down");
			object.setLocation(object.getX(), object.getY()+5);
		}else if (e.getKeyCode() == KeyEvent.VK_LEFT){
			tfAction.setText("Pressed arrow key Left");
			object.setLocation(object.getX()-5, object.getY());
		}else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
			tfAction.setText("Pressed arrow key Right");
			object.setLocation(object.getX()+5, object.getY());
		} 
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
		
		
	}
        @Override
        public void mouseClicked(MouseEvent e) {
            tfAction.setText("Mouse Clicked");
	    object.setLocation(object.getX(), object.getY());
        }
        @Override 
         public void mousePressed(MouseEvent e){
            tfAction.setText("Mouse Pressed");
	    object.setLocation(object.getX(), object.getY());
        }
        @Override 
         public void mouseReleased(MouseEvent e) {
            tfAction.setText("Mouse Released");
	    object.setLocation(object.getX(), object.getY());
        }
        @Override 
        public void mouseEntered(MouseEvent e) {
            tfAction.setText("Mouse Entered the Frame");
	    object.setLocation(0,0);
        }
        @Override
        public void mouseExited(MouseEvent e) {
            tfAction.setText("Mouse Exited the Frame");
	    object.setLocation(450,350);
}
        
}
