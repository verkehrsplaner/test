/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package verkehrsplaner_test;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Felix
 */
public class TestPanel extends javax.swing.JPanel {

    /**
     * Creates new form TestPanel
     */
    public TestPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
     public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        // Häuser
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(1));
        g2d.fillRect(100, 100, 30, 30);
        g2d.setColor(Color.YELLOW);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(100, 100, 30, 30);
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(1));
        g2d.fillRect(130, 100, 30, 30);
        g2d.setColor(Color.YELLOW);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(130, 100, 30, 30);
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(1));
        g2d.fillRect(160, 100, 30, 30);
        g2d.setColor(Color.YELLOW);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(160, 100, 30, 30);
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(1));
        g2d.fillRect(100, 130, 30, 30);
        g2d.setColor(Color.YELLOW);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(100, 130, 30, 30);
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(1));
        g2d.fillRect(100, 160, 30, 30);
        g2d.setColor(Color.YELLOW);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(100, 160, 30, 30);
        // Park
        g2d.setColor(new Color(0x0D, 0x9E, 0x11));
        g2d.setStroke(new BasicStroke(1));
        g2d.fillRect(130, 130, 30, 30);
        g2d.setColor(Color.YELLOW);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(130, 130, 30, 30);
        // Linie
        g2d.setColor(Color.MAGENTA);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(130, 130, 340, 220);
        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(340, 130, 130, 220);
        // Bahnhöfe
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(1));
        g2d.fillOval(120, 120, 20, 20);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawOval(120, 120, 20, 20);
        
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(1));
        g2d.fillOval(325, 205, 30, 30);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawOval(325, 205, 30, 30);
    }
}
