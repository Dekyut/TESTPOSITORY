
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;
import javax.swing.*;

public class FallingWords extends JFrame implements Runnable, KeyListener {
    ArrayList<String> words = new ArrayList<>();
    String [] list = {"Aki", "Denji", "Makima", "Power"};
    Thread runner;
    
    int score = 0;
    
    JPanel panel = new JPanel();
    JTextField tfWord = new JTextField(20);
    JLabel lblScore = new JLabel("Score: "+score);
    
    int [] xVal = {80, 200, 140, 300};
    int y = 30;
    
    public FallingWords(){
        
        this.setSize(800,600);
        this.setLayout(null);
        this.setTitle("Type the Falling Words");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        tfWord.setFocusable(true);
        tfWord.addKeyListener(this);
        
        panel.add(tfWord);
        panel.add(lblScore);
        panel.setBounds(220, 400, 400, 100);
        add(panel);
        
        
        words.addAll(Arrays.asList(list));
        runner = new Thread(this);
        runner.start();
        
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for(int i = 0; i < words.size(); i++){
            g.drawString(words.get(i), xVal[i], y);
        }
    }
    
    public static void main(String[] args){
        new FallingWords();
    }
    
    @Override
    public void run() {
        while(true){
            if(words.isEmpty()){
                JOptionPane.showMessageDialog(null,"Game Over","Game Over", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            if(y > 750){
                y = 30;
            }
            if(y != 750){
                y += 10;
            }
            try{
                runner.sleep(1000);
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
            repaint();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        boolean correct = false;
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            for(int i = 0; i < words.size(); i++){
                if(tfWord.getText().equals(words.get(i))){
                    correct = true;
                    words.remove(i);
                    break;
                }
            }
            if(correct){
                lblScore.setText("Score: "+ ++score);
                tfWord.setText("");
            }
            else{
                lblScore.setText("Score: "+ --score);
                
            }   
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        
    }

}
