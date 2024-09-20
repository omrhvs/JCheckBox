package paqueteinicial;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class VentanaInicial extends javax.swing.JFrame
{
    VentanaInicial instancia;
    private boolean amSel, azSel, roSel;
    public VentanaInicial() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        amarillo = new javax.swing.JCheckBox();
        azul = new javax.swing.JCheckBox();
        rojo = new javax.swing.JCheckBox();
        cambiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DM Serif Display", 0, 36)); // NOI18N
        jLabel1.setText("Cambiar");

        jLabel2.setFont(new java.awt.Font("DM Serif Display", 2, 36)); // NOI18N
        jLabel2.setText("Color");

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel3.setText("Seleccione el color que desee para el fondo.");

        amarillo.setText("Amarillo");
        amarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amarilloActionPerformed(evt);
            }
        });

        azul.setText("Azul");
        azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulActionPerformed(evt);
            }
        });

        rojo.setText("Rojo");
        rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rojoActionPerformed(evt);
            }
        });

        cambiar.setText("Cambiar Color");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(amarillo)
                        .addGap(55, 55, 55)
                        .addComponent(azul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rojo))
                    .addComponent(jLabel3))
                .addGap(26, 26, 26))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(cambiar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amarillo)
                    .addComponent(azul)
                    .addComponent(rojo))
                .addGap(18, 18, 18)
                .addComponent(cambiar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amarilloActionPerformed
        amSel = amarillo.isSelected();
        establecerColor(amSel, azSel, roSel);
    }//GEN-LAST:event_amarilloActionPerformed

    private void azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulActionPerformed
        azSel = azul.isSelected();
        establecerColor(amSel, azSel, roSel);
    }//GEN-LAST:event_azulActionPerformed

    private void rojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rojoActionPerformed
        roSel = rojo.isSelected();
        establecerColor(amSel, azSel, roSel);
    }//GEN-LAST:event_rojoActionPerformed
    
    private Color amarilloC = new Color(242, 183, 5);
    private Color azulC = new Color(57, 140, 191);
    private Color rojoC = new Color(242, 7, 7);
    
    private Color verde = new Color(159, 219, 67);
    private Color violeta = new Color(170, 84, 183);
    private Color naranja = new Color(242, 92, 5);
    
    private Color cafe = new Color(198, 117,  47);
    
    private void establecerColor(boolean aS, boolean azS, boolean rS)
    {        
        
        if(aS && !azS && !rS)
        {
            fondo.setBackground(amarilloC);
        }
        else if(aS && azS && !rS)
        {
            fondo.setBackground(verde);
        }
        else if(aS && rS && !azS)
        {
            fondo.setBackground(naranja);
        }
        else if(azS && !aS && !rS)
        {
            fondo.setBackground(azulC);
        }
        else if(azS && rS && !aS)
        {
            fondo.setBackground(violeta);
        }
        else if(rS && !azS && !aS)
        {
            fondo.setBackground(rojoC);
        }
        else 
        {
            fondo.setBackground(cafe);
        }
    }
    
    public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox amarillo;
    private javax.swing.JCheckBox azul;
    private javax.swing.JButton cambiar;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JCheckBox rojo;
    // End of variables declaration//GEN-END:variables

}
