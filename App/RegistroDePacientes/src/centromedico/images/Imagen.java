/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centromedico.images;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Grupo 7
 */
public class Imagen extends JPanel{
    
    private String ruta;
    private int x;
    private int y;

    public Imagen() {
    }

    public Imagen(JPanel jPanel1, String ruta) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
        this.ruta = ruta;
    }
    
    @Override
    public void paint(Graphics g){
        ImageIcon Img = new ImageIcon(getClass().getResource(ruta));
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
    }

}
