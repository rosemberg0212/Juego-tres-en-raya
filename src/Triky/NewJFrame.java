/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triky;

import Logica.LogicaJuego;
import java.awt.Color;

/**
 *
 * @author local alv
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        llenar();
        initComponents();
        PanelX.setBackground(Color.yellow);
        PanelO.setBackground(Color.white);
        Abajo.setVisible(false);
        Arriba.setVisible(false);
        Derecha.setVisible(false);
        Dia1.setVisible(false);
        Dia2.setVisible(false);
        Izquierda.setVisible(false);
        Medio.setVisible(false);
        MedioHor.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Derecha = new javax.swing.JPanel();
        Medio = new javax.swing.JPanel();
        Izquierda = new javax.swing.JPanel();
        Arriba = new javax.swing.JPanel();
        MedioHor = new javax.swing.JPanel();
        Abajo = new javax.swing.JPanel();
        Dia1 = new javax.swing.JLabel();
        Dia2 = new javax.swing.JLabel();
        B01 = new javax.swing.JButton();
        B02 = new javax.swing.JButton();
        B21 = new javax.swing.JButton();
        B00 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        B20 = new javax.swing.JButton();
        B22 = new javax.swing.JButton();
        BotonReinicio = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        PanelX = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jx = new javax.swing.JLabel();
        PanelO = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Derecha.setBackground(new java.awt.Color(255, 0, 0));
        Derecha.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout DerechaLayout = new javax.swing.GroupLayout(Derecha);
        Derecha.setLayout(DerechaLayout);
        DerechaLayout.setHorizontalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        DerechaLayout.setVerticalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jPanel1.add(Derecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        Medio.setBackground(new java.awt.Color(255, 0, 0));
        Medio.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout MedioLayout = new javax.swing.GroupLayout(Medio);
        Medio.setLayout(MedioLayout);
        MedioLayout.setHorizontalGroup(
            MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        MedioLayout.setVerticalGroup(
            MedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jPanel1.add(Medio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        Izquierda.setBackground(new java.awt.Color(255, 0, 0));
        Izquierda.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout IzquierdaLayout = new javax.swing.GroupLayout(Izquierda);
        Izquierda.setLayout(IzquierdaLayout);
        IzquierdaLayout.setHorizontalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        IzquierdaLayout.setVerticalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jPanel1.add(Izquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        Arriba.setBackground(new java.awt.Color(255, 0, 0));
        Arriba.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout ArribaLayout = new javax.swing.GroupLayout(Arriba);
        Arriba.setLayout(ArribaLayout);
        ArribaLayout.setHorizontalGroup(
            ArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        ArribaLayout.setVerticalGroup(
            ArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(Arriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 320, 10));

        MedioHor.setBackground(new java.awt.Color(255, 0, 0));
        MedioHor.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout MedioHorLayout = new javax.swing.GroupLayout(MedioHor);
        MedioHor.setLayout(MedioHorLayout);
        MedioHorLayout.setHorizontalGroup(
            MedioHorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        MedioHorLayout.setVerticalGroup(
            MedioHorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(MedioHor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        Abajo.setBackground(new java.awt.Color(255, 0, 0));
        Abajo.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout AbajoLayout = new javax.swing.GroupLayout(Abajo);
        Abajo.setLayout(AbajoLayout);
        AbajoLayout.setHorizontalGroup(
            AbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        AbajoLayout.setVerticalGroup(
            AbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(Abajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        Dia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dia1.png"))); // NOI18N
        jPanel1.add(Dia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -10, -1, -1));

        Dia2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dia2.png"))); // NOI18N
        jPanel1.add(Dia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, -1, -1));

        B01.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B01ActionPerformed(evt);
            }
        });
        jPanel1.add(B01, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 32, 93, 73));

        B02.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B02ActionPerformed(evt);
            }
        });
        jPanel1.add(B02, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 32, 93, 73));

        B21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B21ActionPerformed(evt);
            }
        });
        jPanel1.add(B21, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 214, 93, 73));

        B00.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B00ActionPerformed(evt);
            }
        });
        jPanel1.add(B00, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 32, 93, 73));

        B10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });
        jPanel1.add(B10, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 123, 93, 73));

        B11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });
        jPanel1.add(B11, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 123, 93, 73));

        B12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B12ActionPerformed(evt);
            }
        });
        jPanel1.add(B12, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 123, 93, 73));

        B20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B20ActionPerformed(evt);
            }
        });
        jPanel1.add(B20, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 214, 93, 73));

        B22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B22ActionPerformed(evt);
            }
        });
        jPanel1.add(B22, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 214, 93, 73));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 370, 330));

        BotonReinicio.setBackground(new java.awt.Color(0, 255, 204));
        BotonReinicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonReinicio.setForeground(new java.awt.Color(255, 0, 0));
        BotonReinicio.setText("Jugar De Nuevo");
        BotonReinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReinicioActionPerformed(evt);
            }
        });
        getContentPane().add(BotonReinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        PanelX.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("X");

        jx.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jx.setForeground(new java.awt.Color(255, 0, 51));
        jx.setText("O");

        javax.swing.GroupLayout PanelXLayout = new javax.swing.GroupLayout(PanelX);
        PanelX.setLayout(PanelXLayout);
        PanelXLayout.setHorizontalGroup(
            PanelXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelXLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jx)
                .addContainerGap())
        );
        PanelXLayout.setVerticalGroup(
            PanelXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelXLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jx))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelO.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("O");

        jo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jo.setForeground(new java.awt.Color(0, 0, 255));
        jo.setText("O");

        javax.swing.GroupLayout PanelOLayout = new javax.swing.GroupLayout(PanelO);
        PanelO.setLayout(PanelOLayout);
        PanelOLayout.setHorizontalGroup(
            PanelOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jo)
                .addContainerGap())
        );
        PanelOLayout.setVerticalGroup(
            PanelOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(PanelX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(PanelO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arquitectura-sistemas-bbva-1024x683.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 524));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B00ActionPerformed
        turno();
        l.rayar(matriz, Dia1, 7, 0, 0);
        l.rayar(matriz, Arriba, 1, 0, 0);
        l.rayar(matriz, Izquierda, 4, 0, 0);
        if(l.Ejecutar(B00, 0, 0, matriz, jx, jo)==1)
        {
            reiniciar();
        }
    }//GEN-LAST:event_B00ActionPerformed

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
        turno();
        l.rayar(matriz, Dia2, 8, 1, 1);
        l.rayar(matriz, MedioHor, 2, 1, 1);
        l.rayar(matriz, Medio, 5, 1, 1);
        l.rayar(matriz, Dia1, 7, 1, 1);
        if(l.Ejecutar(B11, 1, 1, matriz, jx, jo)==1)
        {
            reiniciar();
        }
    }//GEN-LAST:event_B11ActionPerformed

    private void B22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B22ActionPerformed
        turno();
        l.rayar(matriz, Abajo, 3, 2, 2);
        l.rayar(matriz, Derecha, 6, 2, 2);
        l.rayar(matriz, Dia1, 7, 2, 2);
        if(l.Ejecutar(B22, 2, 2, matriz, jx, jo)==1)
        {
            reiniciar();
        }
    }//GEN-LAST:event_B22ActionPerformed

    private void B01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B01ActionPerformed
        turno();
        l.rayar(matriz, Medio, 5, 0, 1);
        l.rayar(matriz, Arriba, 1, 0, 1);
        if(l.Ejecutar(B01, 0, 1, matriz, jx, jo)==1)
        {
            reiniciar();
        }
    }//GEN-LAST:event_B01ActionPerformed

    private void B02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B02ActionPerformed
        turno();
        l.rayar(matriz, Dia2, 8, 0, 2);
        l.rayar(matriz, Derecha, 6, 0, 2);
        l.rayar(matriz, Arriba, 1, 0, 2);
        if(l.Ejecutar(B02, 0, 2, matriz, jx, jo)==1)
        {
            reiniciar();
        }
    }//GEN-LAST:event_B02ActionPerformed

    private void B12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B12ActionPerformed
        turno();
        
        l.rayar(matriz, MedioHor, 2, 1, 2);
        l.rayar(matriz, Derecha, 6, 1, 2);
        if(l.Ejecutar(B12, 1, 2, matriz, jx, jo)==1)
        {
            reiniciar();
        }
    }//GEN-LAST:event_B12ActionPerformed

    private void B20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B20ActionPerformed
        turno();
        l.rayar(matriz, Abajo, 3, 2, 0);
        l.rayar(matriz, Dia2, 8, 2, 0);
        l.rayar(matriz, Izquierda, 4, 2, 0);
        if(l.Ejecutar(B20, 2, 0, matriz, jx, jo)==1)
        {
            reiniciar();
        }
    }//GEN-LAST:event_B20ActionPerformed

    private void B21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B21ActionPerformed
        turno();
        l.rayar(matriz, Abajo, 3, 2, 1);
        l.rayar(matriz, Medio, 5, 2, 1);
        if(l.Ejecutar(B21, 2, 1, matriz, jx, jo)==1)
        {
            reiniciar();
        }
    }//GEN-LAST:event_B21ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
        turno();
        l.rayar(matriz, MedioHor, 2, 1, 0);
        l.rayar(matriz, Izquierda, 4, 1, 0);
        if(l.Ejecutar(B10, 1, 0, matriz, jx, jo)==1)
        {
            reiniciar();
        }
    }//GEN-LAST:event_B10ActionPerformed

    private void BotonReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReinicioActionPerformed
        reiniciar();
    }//GEN-LAST:event_BotonReinicioActionPerformed
        int matriz[][] = new int[3][3];
        public void llenar()
        {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz[i][j]=(j+10)*(i+10);
                }
            }
        }
        LogicaJuego l = new LogicaJuego(0,0,0);
        public void turno()
        {
            if(l.getTurno()==1)
            {
                PanelX.setBackground(Color.yellow);
                PanelO.setBackground(Color.white);
            }
            if(l.getTurno()==0)
            {
                PanelX.setBackground(Color.white);
                PanelO.setBackground(Color.yellow);
            }
        }
        public void reiniciar()
        {
            llenar();
            B00.setText("");
            B00.setEnabled(true);
            B01.setText("");
            B01.setEnabled(true);
            B02.setText("");
            B02.setEnabled(true);
            B10.setText("");
            B10.setEnabled(true);
            B11.setText("");
            B11.setEnabled(true);
            B12.setText("");
            B12.setEnabled(true);
            B20.setText("");
            B20.setEnabled(true);
            B21.setText("");
            B21.setEnabled(true);
            B22.setText("");
            B22.setEnabled(true);
            
            Abajo.setVisible(false);
            Arriba.setVisible(false);
            Derecha.setVisible(false);
            Dia1.setVisible(false);
            Dia2.setVisible(false);
            Izquierda.setVisible(false);
            Medio.setVisible(false);
            MedioHor.setVisible(false);
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Abajo;
    private javax.swing.JPanel Arriba;
    private javax.swing.JButton B00;
    private javax.swing.JButton B01;
    private javax.swing.JButton B02;
    private javax.swing.JButton B10;
    private javax.swing.JButton B11;
    private javax.swing.JButton B12;
    private javax.swing.JButton B20;
    private javax.swing.JButton B21;
    private javax.swing.JButton B22;
    private javax.swing.JButton BotonReinicio;
    private javax.swing.JPanel Derecha;
    private javax.swing.JLabel Dia1;
    private javax.swing.JLabel Dia2;
    private javax.swing.JPanel Izquierda;
    private javax.swing.JPanel Medio;
    private javax.swing.JPanel MedioHor;
    private javax.swing.JPanel PanelO;
    private javax.swing.JPanel PanelX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jo;
    private javax.swing.JLabel jx;
    // End of variables declaration//GEN-END:variables
}