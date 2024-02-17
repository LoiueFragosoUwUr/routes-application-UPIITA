
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis2
 */
public class Partida extends javax.swing.JPanel {

    /**
     * Creates new form PanelEdificio1
     */
    public Partida() {
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

        puntoPartida = new javax.swing.ButtonGroup();
        panelPartida = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbEdificio1 = new javax.swing.JRadioButton();
        rbEdificio2 = new javax.swing.JRadioButton();
        rbEdificio3 = new javax.swing.JRadioButton();
        rbEdificio4 = new javax.swing.JRadioButton();
        rbEdificio5 = new javax.swing.JRadioButton();
        rbCafeteria = new javax.swing.JRadioButton();
        rbEntrada = new javax.swing.JRadioButton();
        rbSalida = new javax.swing.JRadioButton();
        rbEdificioGobierno = new javax.swing.JRadioButton();
        rbPatio = new javax.swing.JRadioButton();
        mapaUpitta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPartida = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        panelFondo = new FondoPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPartida.setBackground(new java.awt.Color(0, 204, 204));
        panelPartida.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 3, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selccione el punto de partida");
        panelPartida.add(jLabel1);
        jLabel1.setBounds(15, 15, 664, 51);

        puntoPartida.add(rbEdificio1);
        rbEdificio1.setFont(new java.awt.Font("HP Simplified Light", 1, 14)); // NOI18N
        rbEdificio1.setForeground(new java.awt.Color(255, 255, 255));
        rbEdificio1.setText("Edificio 1");
        rbEdificio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbEdificio1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbEdificio1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbEdificio1MousePressed(evt);
            }
        });
        panelPartida.add(rbEdificio1);
        rbEdificio1.setBounds(380, 460, 140, 27);

        puntoPartida.add(rbEdificio2);
        rbEdificio2.setFont(new java.awt.Font("HP Simplified Light", 1, 14)); // NOI18N
        rbEdificio2.setForeground(new java.awt.Color(255, 255, 255));
        rbEdificio2.setText("Edificio 2");
        rbEdificio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbEdificio2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbEdificio2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbEdificio2MousePressed(evt);
            }
        });
        panelPartida.add(rbEdificio2);
        rbEdificio2.setBounds(380, 320, 130, 27);

        puntoPartida.add(rbEdificio3);
        rbEdificio3.setFont(new java.awt.Font("HP Simplified Light", 1, 14)); // NOI18N
        rbEdificio3.setForeground(new java.awt.Color(255, 255, 255));
        rbEdificio3.setText("Edificio 3");
        rbEdificio3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbEdificio3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbEdificio3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbEdificio3MousePressed(evt);
            }
        });
        panelPartida.add(rbEdificio3);
        rbEdificio3.setBounds(210, 540, 130, 27);

        puntoPartida.add(rbEdificio4);
        rbEdificio4.setFont(new java.awt.Font("HP Simplified Light", 1, 14)); // NOI18N
        rbEdificio4.setForeground(new java.awt.Color(255, 255, 255));
        rbEdificio4.setText("Edificio 4");
        rbEdificio4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbEdificio4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbEdificio4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbEdificio4MousePressed(evt);
            }
        });
        panelPartida.add(rbEdificio4);
        rbEdificio4.setBounds(210, 400, 130, 27);

        puntoPartida.add(rbEdificio5);
        rbEdificio5.setFont(new java.awt.Font("HP Simplified Light", 1, 14)); // NOI18N
        rbEdificio5.setForeground(new java.awt.Color(255, 255, 255));
        rbEdificio5.setText("Edificio 5");
        rbEdificio5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbEdificio5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbEdificio5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbEdificio5MousePressed(evt);
            }
        });
        panelPartida.add(rbEdificio5);
        rbEdificio5.setBounds(340, 390, 130, 27);

        puntoPartida.add(rbCafeteria);
        rbCafeteria.setFont(new java.awt.Font("HP Simplified Light", 1, 14)); // NOI18N
        rbCafeteria.setForeground(new java.awt.Color(255, 255, 255));
        rbCafeteria.setText("Cafeteria");
        rbCafeteria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbCafeteriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbCafeteriaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbCafeteriaMousePressed(evt);
            }
        });
        panelPartida.add(rbCafeteria);
        rbCafeteria.setBounds(550, 570, 130, 27);

        puntoPartida.add(rbEntrada);
        rbEntrada.setFont(new java.awt.Font("HP Simplified Light", 1, 14)); // NOI18N
        rbEntrada.setForeground(new java.awt.Color(255, 255, 255));
        rbEntrada.setText("Entrada");
        rbEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbEntradaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbEntradaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbEntradaMousePressed(evt);
            }
        });
        panelPartida.add(rbEntrada);
        rbEntrada.setBounds(450, 570, 120, 27);

        puntoPartida.add(rbSalida);
        rbSalida.setFont(new java.awt.Font("HP Simplified Light", 1, 14)); // NOI18N
        rbSalida.setForeground(new java.awt.Color(255, 255, 255));
        rbSalida.setText("Salida");
        rbSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbSalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbSalidaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbSalidaMousePressed(evt);
            }
        });
        panelPartida.add(rbSalida);
        rbSalida.setBounds(350, 570, 100, 27);

        puntoPartida.add(rbEdificioGobierno);
        rbEdificioGobierno.setFont(new java.awt.Font("HP Simplified Light", 1, 14)); // NOI18N
        rbEdificioGobierno.setForeground(new java.awt.Color(255, 255, 255));
        rbEdificioGobierno.setText("<html>Edificio de Gobierno<html>");
        rbEdificioGobierno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbEdificioGobierno.setOpaque(false);
        rbEdificioGobierno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbEdificioGobiernoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbEdificioGobiernoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbEdificioGobiernoMousePressed(evt);
            }
        });
        panelPartida.add(rbEdificioGobierno);
        rbEdificioGobierno.setBounds(510, 360, 130, 90);

        puntoPartida.add(rbPatio);
        rbPatio.setFont(new java.awt.Font("HP Simplified Light", 1, 14)); // NOI18N
        rbPatio.setForeground(new java.awt.Color(255, 255, 255));
        rbPatio.setText("Patio");
        rbPatio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rbPatioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rbPatioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rbPatioMousePressed(evt);
            }
        });
        panelPartida.add(rbPatio);
        rbPatio.setBounds(290, 470, 100, 27);

        mapaUpitta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MapaGenerlaUpiita.png"))); // NOI18N
        panelPartida.add(mapaUpitta);
        mapaUpitta.setBounds(40, 110, 650, 537);

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("El punto de partida es:");
        panelPartida.add(jLabel2);
        jLabel2.setBounds(40, 700, 206, 22);

        txtPartida.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        panelPartida.add(txtPartida);
        txtPartida.setBounds(260, 700, 230, 30);

        jButton1.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelPartida.add(jButton1);
        jButton1.setBounds(530, 690, 150, 50);

        add(panelPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 761, 810));

        panelFondo.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );

        add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 0, -1, 810));
    }// </editor-fold>//GEN-END:initComponents

    private void rbEdificio1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificio1MousePressed
    txtPartida.setText(rbEdificio1.getText());
    }//GEN-LAST:event_rbEdificio1MousePressed

    private void rbEdificio2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificio2MousePressed
        txtPartida.setText(rbEdificio2.getText());
    }//GEN-LAST:event_rbEdificio2MousePressed

    private void rbEdificio3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificio3MousePressed
        txtPartida.setText(rbEdificio3.getText());
    }//GEN-LAST:event_rbEdificio3MousePressed

    private void rbEdificio4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificio4MousePressed
        txtPartida.setText(rbEdificio4.getText());
    }//GEN-LAST:event_rbEdificio4MousePressed

    private void rbEdificio5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificio5MousePressed
        txtPartida.setText(rbEdificio5.getText());
    }//GEN-LAST:event_rbEdificio5MousePressed

    private void rbCafeteriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbCafeteriaMousePressed
        txtPartida.setText(rbCafeteria.getText());
    }//GEN-LAST:event_rbCafeteriaMousePressed

    private void rbEntradaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEntradaMousePressed
        txtPartida.setText(rbEntrada.getText());
    }//GEN-LAST:event_rbEntradaMousePressed

    private void rbSalidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbSalidaMousePressed
        txtPartida.setText(rbSalida.getText());
    }//GEN-LAST:event_rbSalidaMousePressed

    private void rbEdificioGobiernoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificioGobiernoMousePressed
        txtPartida.setText("Edificio de Gobierno");
    }//GEN-LAST:event_rbEdificioGobiernoMousePressed

    private void rbPatioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbPatioMousePressed
        txtPartida.setText(rbPatio.getText());
    }//GEN-LAST:event_rbPatioMousePressed

    private void rbEdificio1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificio1MouseEntered
        rbEdificio1.setFont(fuenteG);
    }//GEN-LAST:event_rbEdificio1MouseEntered

    private void rbEdificio2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificio2MouseEntered
        rbEdificio2.setFont(fuenteG);
    }//GEN-LAST:event_rbEdificio2MouseEntered

    private void rbEdificio3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificio3MouseEntered
        rbEdificio3.setFont(fuenteG);
    }//GEN-LAST:event_rbEdificio3MouseEntered

    private void rbEdificio4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificio4MouseEntered
       rbEdificio4.setFont(fuenteG);
    }//GEN-LAST:event_rbEdificio4MouseEntered

    private void rbEdificio5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificio5MouseEntered
        rbEdificio5.setFont(fuenteG);
    }//GEN-LAST:event_rbEdificio5MouseEntered

    private void rbEdificioGobiernoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificioGobiernoMouseEntered
        rbEdificioGobierno.setFont(fuenteG);
    }//GEN-LAST:event_rbEdificioGobiernoMouseEntered

    private void rbCafeteriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbCafeteriaMouseEntered
        rbCafeteria.setFont(fuenteG);
    }//GEN-LAST:event_rbCafeteriaMouseEntered

    private void rbPatioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbPatioMouseEntered
        rbPatio.setFont(fuenteG);
    }//GEN-LAST:event_rbPatioMouseEntered

    private void rbEntradaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEntradaMouseEntered
        rbEntrada.setFont(fuenteG);
    }//GEN-LAST:event_rbEntradaMouseEntered

    private void rbSalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbSalidaMouseEntered
        rbSalida.setFont(fuenteG);
    }//GEN-LAST:event_rbSalidaMouseEntered

    private void rbEdificio1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificio1MouseExited
        rbEdificio1.setFont(fuenteC);
    }//GEN-LAST:event_rbEdificio1MouseExited

    private void rbEdificio2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificio2MouseExited
        rbEdificio2.setFont(fuenteC);
    }//GEN-LAST:event_rbEdificio2MouseExited

    private void rbEdificio3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificio3MouseExited
        rbEdificio3.setFont(fuenteC);
    }//GEN-LAST:event_rbEdificio3MouseExited

    private void rbEdificio4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificio4MouseExited
        rbEdificio4.setFont(fuenteC);
    }//GEN-LAST:event_rbEdificio4MouseExited

    private void rbEdificio5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificio5MouseExited
        rbEdificio5.setFont(fuenteC);
    }//GEN-LAST:event_rbEdificio5MouseExited

    private void rbEdificioGobiernoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEdificioGobiernoMouseExited
        rbEdificioGobierno.setFont(fuenteC);
    }//GEN-LAST:event_rbEdificioGobiernoMouseExited

    private void rbCafeteriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbCafeteriaMouseExited
        rbCafeteria.setFont(fuenteC);
    }//GEN-LAST:event_rbCafeteriaMouseExited

    private void rbPatioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbPatioMouseExited
        rbPatio.setFont(fuenteC);
    }//GEN-LAST:event_rbPatioMouseExited

    private void rbEntradaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEntradaMouseExited
        rbEntrada.setFont(fuenteC);
    }//GEN-LAST:event_rbEntradaMouseExited

    private void rbSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbSalidaMouseExited
        rbSalida.setFont(fuenteC);
    }//GEN-LAST:event_rbSalidaMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(rbEdificio1.isSelected()){
            //panelE1 = new Edificio1();
            //panelE1.setBounds(panelFondo.getBounds());
            panelFondo.removeAll();
            //panelFondo.add(panelE1);
            panelFondo.updateUI();            
        } else if(rbEdificio2.isSelected()){
            panelE2 = new Edificio2();
            panelE2.setBounds(panelFondo.getBounds());
            panelFondo.removeAll();
            panelFondo.add(panelE2);
            panelFondo.updateUI();
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    //Edificio1 panelE1;
    Edificio2 panelE2;
    
    Font fuenteG = new Font("Dialog", Font.BOLD, 24);
    Font fuenteC = new Font("Dialog", Font.BOLD, 14);
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mapaUpitta;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelPartida;
    private javax.swing.ButtonGroup puntoPartida;
    private javax.swing.JRadioButton rbCafeteria;
    private javax.swing.JRadioButton rbEdificio1;
    private javax.swing.JRadioButton rbEdificio2;
    private javax.swing.JRadioButton rbEdificio3;
    private javax.swing.JRadioButton rbEdificio4;
    private javax.swing.JRadioButton rbEdificio5;
    private javax.swing.JRadioButton rbEdificioGobierno;
    private javax.swing.JRadioButton rbEntrada;
    private javax.swing.JRadioButton rbPatio;
    private javax.swing.JRadioButton rbSalida;
    private javax.swing.JTextField txtPartida;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagenes/FondoUpiita.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }   




}
