/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
*Ventana 3 ventana pprincipal donde se ejecutan las operaciones
*@author: Alessandra Torres
*@version: 03/11/23
 */
public class Ventana3 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana3
     */
    public Ventana3() {
        initComponents();
        this.pack();
        this.setVisible(true);
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

        jPanel3 = new javax.swing.JPanel();
        btsalir = new javax.swing.JButton();
        tp = new javax.swing.JTabbedPane();
        pestanausu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btcrearusu = new javax.swing.JButton();
        bteliminarusu = new javax.swing.JButton();
        btmostrarusu = new javax.swing.JButton();
        pestanadocs = new javax.swing.JPanel();
        btcreardoc = new javax.swing.JButton();
        bteliminardoc = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btliberarimp = new javax.swing.JButton();
        bteliminardoccola = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btvistasecuencia = new javax.swing.JButton();
        btvistaarbol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(123, 152, 181));

        btsalir.setText("Salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });

        pestanausu.setBackground(new java.awt.Color(175, 196, 216));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btcrearusu.setText("Crear Usuario");

        bteliminarusu.setText("Eliminar Usuario");

        btmostrarusu.setText("Mostrar Usuarios");

        javax.swing.GroupLayout pestanausuLayout = new javax.swing.GroupLayout(pestanausu);
        pestanausu.setLayout(pestanausuLayout);
        pestanausuLayout.setHorizontalGroup(
            pestanausuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestanausuLayout.createSequentialGroup()
                .addGroup(pestanausuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestanausuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pestanausuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bteliminarusu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btmostrarusu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(pestanausuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btcrearusu, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        pestanausuLayout.setVerticalGroup(
            pestanausuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanausuLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btcrearusu)
                .addGap(18, 18, 18)
                .addComponent(bteliminarusu)
                .addGap(18, 18, 18)
                .addComponent(btmostrarusu)
                .addContainerGap(288, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );

        tp.addTab("Usuarios", pestanausu);

        pestanadocs.setBackground(new java.awt.Color(175, 196, 216));

        btcreardoc.setText("Crear Documento");
        btcreardoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcreardocActionPerformed(evt);
            }
        });

        bteliminardoc.setText("Eliminar Documento");

        javax.swing.GroupLayout pestanadocsLayout = new javax.swing.GroupLayout(pestanadocs);
        pestanadocs.setLayout(pestanadocsLayout);
        pestanadocsLayout.setHorizontalGroup(
            pestanadocsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanadocsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pestanadocsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bteliminardoc, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcreardoc, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        pestanadocsLayout.setVerticalGroup(
            pestanadocsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanadocsLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btcreardoc)
                .addGap(18, 18, 18)
                .addComponent(bteliminardoc)
                .addContainerGap(321, Short.MAX_VALUE))
        );

        tp.addTab("Documentos", pestanadocs);

        jPanel1.setBackground(new java.awt.Color(175, 196, 216));

        btliberarimp.setText("Liberar impresora");

        bteliminardoccola.setText("Eliminar Doc en cola");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btliberarimp, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bteliminardoccola, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btliberarimp)
                .addGap(18, 18, 18)
                .addComponent(bteliminardoccola)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        tp.addTab("Impresión", jPanel1);

        jPanel2.setBackground(new java.awt.Color(175, 196, 216));

        btvistasecuencia.setText("Vista Secuencia Registros");

        btvistaarbol.setText("Vista Árbol");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btvistasecuencia, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(btvistaarbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btvistasecuencia)
                .addGap(35, 35, 35)
                .addComponent(btvistaarbol)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        tp.addTab("Gráficos", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
*Boton salir, pide confirmación en la ventana 4
*@author: Alessandra Torres
*@version: 03/11/23
 */
    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        Ventana4 v4 = new Ventana4();
    }//GEN-LAST:event_btsalirActionPerformed

    private void btcreardocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcreardocActionPerformed
        // TODO add your handling code here:
        Ventana5 v5 = new Ventana5();
    }//GEN-LAST:event_btcreardocActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcreardoc;
    private javax.swing.JButton btcrearusu;
    private javax.swing.JButton bteliminardoc;
    private javax.swing.JButton bteliminardoccola;
    private javax.swing.JButton bteliminarusu;
    private javax.swing.JButton btliberarimp;
    private javax.swing.JButton btmostrarusu;
    private javax.swing.JButton btsalir;
    private javax.swing.JButton btvistaarbol;
    private javax.swing.JButton btvistasecuencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel pestanadocs;
    private javax.swing.JPanel pestanausu;
    private javax.swing.JTabbedPane tp;
    // End of variables declaration//GEN-END:variables
}
