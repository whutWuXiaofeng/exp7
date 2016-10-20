
package lifegame2;

import java.awt.Color;
import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
  
import javax.swing.JPanel;  
import javax.swing.Timer;  
  

public class WorldMap extends JPanel {  
  
    private static final long serialVersionUID = -336975817478756636L;  
  
    private final int width = 22;  
  
    private final int height = 22;  
  
    private final char WORLD_MAP_NONE = 'N';  
  
    private final char WORLD_MAP_ALIVE = 'A';  
  
    private final char[][] world = {  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' }, 
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' }, 
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' }, 
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' }, 
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' }, 
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' }, 
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' }, 
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
    };  
  

  
    private char[][] nextStatus = new char[world.length][world[0].length];  
  
    private char[][] tempStatus = new char[world.length][world[0].length];  
  
    private Timer timer;  
 
    private final int DELAY_TIME = 1500;  
  
    public WorldMap() {  
        this.startAnimation();  
    }  
  
  
    @Override  
    protected void paintComponent(Graphics g) {  
        super.paintComponent(g);  
       
        for (int i = 0; i < nextStatus.length; i++) {  
            for (int j = 0; j < nextStatus[i].length; j++) {  
                if (nextStatus[i][j] == WORLD_MAP_ALIVE) { 
                	 g.setColor(Color.pink);
                    g.fillRect( j * width, i * height, width-1, height-1);  
                   
                } else {  Color c=new Color(0,200,0);
                	 g.setColor(c);
                	 g.drawRect( j * width, i * height, width, height); 
                }  
            }  
        }  
    }  
  
    private void changeCellStatus() {  
        for (int row = 0; row < nextStatus.length; row++) {  
            for (int col = 0; col < nextStatus[row].length; col++) {  
  
                switch (neighborsCount(row, col)) {  
                case 0:  
                case 1:  
                case 4:  
                case 5:  
                case 6:  
                case 7:  
                case 8:  
                    nextStatus[row][col] = WORLD_MAP_NONE;  
                    break;  
                case 2:  
                    nextStatus[row][col] = tempStatus[row][col];  
                    break;  
                case 3:  
                    nextStatus[row][col] = WORLD_MAP_ALIVE;  
                    break;  
                }  
            }  
        }  
        copyWorldMap();  
    }  
  

    private int neighborsCount(int row, int col) {  
        int count = 0, r = 0, c = 0;  
  
        for (r = row - 1; r <= row + 1; r++) {  
            for (c = col - 1; c <= col + 1; c++) {  
                if (r < 0 || r >= tempStatus.length || c < 0  
                        || c >= tempStatus[0].length) {  
                    continue;  
                }  
                if (tempStatus[r][c] == WORLD_MAP_ALIVE) {  
                    count++;  
                }  
            }  
        }  
        if (tempStatus[row][col] == WORLD_MAP_ALIVE) {  
            count--;  
        }  
        return count;  
    }  
  
    
    private void startAnimation() {  
        for (int row = 0; row < world.length; row++) {  
            for (int col = 0; col < world[0].length; col++) {  
                nextStatus[row][col] = world[row][col];  
                tempStatus[row][col] = world[row][col];  
            }  
        }  
       
        timer = new Timer(DELAY_TIME, new ActionListener() {  
  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                changeCellStatus();  
                repaint();  
            }  
        });  
        timer.start();  
    }  
  
   
    private void copyWorldMap() {  
        for (int row = 0; row < nextStatus.length; row++) {  
            for (int col = 0; col < nextStatus[row].length; col++) {  
                tempStatus[row][col] = nextStatus[row][col];  
            }  
        }  
    }  
}  