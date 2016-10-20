package lifegame2;

import javax.swing.JFrame;  

  
public class LifeGame extends JFrame{  
  
      
    private static final long serialVersionUID = -1660060555234651445L;  
  
    LifeGame(){  
        this.setSize(578,560);  
        this.setTitle("������Ϸ");  
        this.add(new WorldMap());  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);  
        this.setResizable(false);  
    }  
      
    public static void main(String[] args){  
        LifeGame game = new LifeGame();  
        game.setVisible(true);  
    }  
  
}