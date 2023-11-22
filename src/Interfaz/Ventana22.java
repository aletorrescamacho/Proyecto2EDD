/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Documentos.Documentos;
import EDD.Lista;
import EDD.Nodo;
//para trabajar con la lista de usuarios
import static Interfaz.Ventana1.listausu;
//usuario seleccionado combobox ventana anterior
import static Interfaz.Ventana21.userName;
import Usuarios.Usuarios;
import static Interfaz.Ventana3.etiquetaTiempo;
import static Interfaz.Ventana3.Monticulo;
import static Main.Main.Hashtable;

/**
 * Enviar docs a cola de impresion
 * @author: Luis Soriano
 * @version: 07/11/23
 */
public class Ventana22 extends javax.swing.JFrame {

    public static String docName;
    public static Lista<Documentos> userDocs;
    public static Documentos docToSend;

    //variables Hashtable
    Usuarios htUsu;
    Nodo<Usuarios> nodHtUsu;

    /**
     * Creates new form Ventana22
     */
    public Ventana22() {
        initComponents();
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        //buscamos el usuario en nuestra lista de usuarios para encontrar posteriormente su lista de documentos
        Nodo<Usuarios> usuAux1 = listausu.getpFirst();
        while (!usuAux1.getElem().getNombreusu().equalsIgnoreCase(userName)) {
            usuAux1 = usuAux1.getSig();
        }

        //obtenemos la lista de todos los documentos que posee el usuario
        userDocs = usuAux1.getElem().getListadocs();

        Nodo<Documentos> docUser = userDocs.getpFirst();

        //Revisamos que la lista de documentos no este vacia, si esta vacia, se cierra esta ventana antes de mostrarse y se muestra la ventana 17 que indica que el usuario no tiene documentos creados
        boolean boolaux1 = false;

        if (docUser == null) {
            boolaux1 = true;
            Ventana17 v17 = new Ventana17();
            this.dispose();
        }

        //Revisamos que la lista de documentos del usuario tenga por lo menos un documento que no este en la cola, porque si todos sus docs estan en cola, no es posible trabajar con este usuario
        while (docUser != null) {
            //si existe un documento que no esta en cola el aux booleano pasa a true y no se ejecuta el codigo de abajo:
            if (!docUser.getElem().isEncola()) {
                boolaux1 = true;
                break;
            }
            docUser = docUser.getSig();
        }

        //(codigo de abajo) muestra una ventana mensaje y cierra la actual
        if (boolaux1 == false) {
            Ventana18 v18 = new Ventana18();
            this.dispose();
        }

        ////////////////////////////////////////////////
        //agregamos todos los documentos que no esten en la cola del usuario al combobox
        while (docUser != null) {
            //si el documento esta en la cola de impresion no se agrega al combobox
            if (!docUser.getElem().isEncola()) { //el if solo se ejecuta si el doc no esta en cola
                cboDocsUsu.addItem(docUser.getElem().getNombredoc());
            }
            docUser = docUser.getSig();
        }

        //Se crea un nodo nuevo que guarda toda la informacion del usuario que manda un documento a la cola de impresion para despues ingresarlo a la hashtable.
        htUsu = usuAux1.getElem();
        nodHtUsu = new Nodo(htUsu);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboDocsUsu = new javax.swing.JComboBox<>();
        btEnviarCola = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enviar documento a cola de impresión");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(50, 75, 149));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Seleccione documento");

        cboDocsUsu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDocsUsuItemStateChanged(evt);
            }
        });
        cboDocsUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDocsUsuActionPerformed(evt);
            }
        });

        btEnviarCola.setText("Enviar");
        btEnviarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarColaActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sólo se mostrarán aquellos que no estén en la cola de impresión");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enviar documento a cola de impresión");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(cboDocsUsu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btEnviarCola, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(139, 139, 139))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addComponent(cboDocsUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEnviarCola, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboDocsUsuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDocsUsuItemStateChanged

    }//GEN-LAST:event_cboDocsUsuItemStateChanged

    private void cboDocsUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDocsUsuActionPerformed

    }//GEN-LAST:event_cboDocsUsuActionPerformed
/**
*Envia el documento a la cola de impresión y se realiza el algoritmos de la hashtable, también abre la ventana24
*@author: Luis Soriano
*@version: 11/11/23
 */
    private void btEnviarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarColaActionPerformed
        //documento seleccionado
        docName = (String) cboDocsUsu.getSelectedItem();

//buscamos el documento a enviar en la lista de documentos del usuario
        Nodo<Documentos> nodoDoc = userDocs.getpFirst();
        while (!nodoDoc.getElem().getNombredoc().equalsIgnoreCase(docName)) {
            nodoDoc = nodoDoc.getSig();
        }

        //se guarda en una variable la instancia del documento seleccionada por el usuario
        Documentos docToSend = nodoDoc.getElem();

       

        //se define correctamente su etiqueta de tiempo
        docToSend.setEtTiempo(etiquetaTiempo, docToSend.getMultPrioUsu(), docToSend.getMultPrioTam());

        //Insertar docToSend (el doc a enviar) en el arbol
        Monticulo.insertar(docToSend);

//(Despues de mandarlo al arbol, se cambia el atributo EnCola del objeto):
        docToSend.setEncola(true);

        //////////////////////////////////////////////////////////////////////////////////ENVIAR A HASHTABLE////////////////////////////////////////////////////////////
        //Metemos el nodo cuyo info es la instancia del usuario propietario del doc en la HashTable:
        //se le pasa el algoritmo del hashtable al nombre del usuario prop. del doc para obtener su posicion en el array
        int posUsuHt = Hashtable.algoritmoHashDefault(htUsu.getNombreusu());
        
        
        //verificamos que dicha posicion este vacia o no
        if (Hashtable.getArrHashTable()[posUsuHt] != null) {
            //si no esta vacia significa que tiene un nodo de tipo usuario en dicha posicion que puede apuntar a otro nodo de tipo usuario, por eso::
            Nodo<Usuarios> posHt = Hashtable.getArrHashTable()[posUsuHt];
            while (posHt.getSig() != null) {
                posHt = posHt.getSig();
            }
            //despues de conseguir el nod, hacemos que apunte al nuevo nodo 
            posHt.setSig(nodHtUsu);
        } else {
            Hashtable.getArrHashTable()[posUsuHt] = nodHtUsu;
        }

//       
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        this.dispose();

        //ventana de doc enviado exitosamente
        Ventana24 v24 = new Ventana24(docToSend);


    }//GEN-LAST:event_btEnviarColaActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana22().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEnviarCola;
    private javax.swing.JComboBox<String> cboDocsUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
