/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
import static Main.Main.Hashtable;
import static Interfaz.Ventana26.nomUsuHt;
import Usuarios.Usuarios;
import EDD.Nodo;
import Documentos.Documentos;
import static Interfaz.Ventana3.Monticulo;

/**
*Ventana 27 elimina finalmente los documentos de la cola de impresion
*@author: Luis Soriano
*@version: 10/11/23
 */
public class Ventana27 extends javax.swing.JFrame {

        public static Nodo <Documentos> documentosUsu;
        public static Nodo <Usuarios> aux;
        public static Ventana28 v28;
        
        //Variables estaticas para ventana 31 de eliminacion exitosa:
       //Nombre Doc
        public static String nombreDocElim;
        //Tipo Doc
        public static String tipoDocElim;
        //Tamano Doc
        public static int tamanoDocElim;
        //Prioridad Doc
        int prioDocElim;
        public static String prioUsuDocElim;
        //Et Tiempo Doc Elim
        public static int etDocElim;
        
    /**
     * Creates new form Ventana27
     */
    public Ventana27() {
        initComponents();
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
        
        //Buscamos al usuario del combobox de la ventana anterior (Ventana26) en nuestro hashtable
        //aplicamos el algoritmo del hash para conseguir su posicion en el arreglo del hash table, y revisamos si esta vacia o no.
        int posHt = Hashtable.algoritmoHashDefault(nomUsuHt);
       
        //creamos una variable auxiliar que nos indicara si hay un nodo en la posicion del usuario seleccionado del cbo ventana 26. (colisones)
        boolean boolaux = false;
        
        //Verificamos que la posicion este llena.
        if (Hashtable.getArrHashTable()[posHt] ==null){
            v28 = new Ventana28();
            this.dispose();
        }
        //Si esta llena, debemos revisar que los nodos que hayan en esa posicion sean del usuario seleccionado (colisiones)
        else{
             aux = Hashtable.getArrHashTable()[posHt];
            //Revisamos que el nodo de la posicion de la HT no esta enlazado con otro, si no lo esta significa que no hay colision
            if (aux.getSig() == null){
                boolaux = true;
            }
            //en caso de que si tenga enlace hay colision y por tanto: 
            else{
                while (aux.getSig() != null){
                    if(aux.getElem().getNombreusu().equals(nomUsuHt)){
                        boolaux= true;
                        break;
                    }
                    aux = aux.getSig();
            }
            }
            
            //si se ejecuta este codigo significa que hay un usuario que tiene la misma posicion en la hashtable que tendria el seleccionado en el cbo anterior, pero este no esta en el HT.
             if (boolaux == false){
                v28 = new Ventana28 ();
                this.dispose();
            }
             
             //Debemos llenar el combobox con los documentos del usuario que esten en la cola de impresion:
             // si boolaux es igual a true significa que el usuario indicado si esta en nuestro hashtable y que la variable aux almacena el nodo que contiene la infromacion del usuario seleccionado
            //creamos una variable que apunte al primer nodo de la lista de documentos del usuario seleccionado
            documentosUsu = aux.getElem().getListadocs().getpFirst();
            
//debemos validar que dicha lista no este vacia (puede estarlo si envio todos sus documentos a la cola de impresion y se imprimieron todos) y que tenga por lo menos un documento en cola.
            
            boolean boolaux1 = false;

            if (documentosUsu ==  null){
                 v28 = new Ventana28 ();
                this.dispose();
                
            }
                
           
            
            while (documentosUsu != null){
                //solo se agrega el documento si esta en la cola de impresion
                //aprovehcamos la iteracion sobre la lista de documentos del usuario y en caso de que haya un documento en cola y se agregue al cbo, ya no se ejecuta el bloque de abajo.
                if (documentosUsu.getElem().isEncola()){
                    cboDocsUsuEnCola.addItem(documentosUsu.getElem().getNombredoc());
                    if (boolaux1 != true){
                        boolaux1 = true;
                    }
                }
                documentosUsu = documentosUsu.getSig();
            }
            
            if (boolaux1 == false){
                v28 = new Ventana28();
                this.dispose();
            }
        
        
        
    }
        
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
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboDocsUsuEnCola = new javax.swing.JComboBox<>();
        btEliminarDoc = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(50, 75, 149));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Eliminar documento de cola de impresión");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Seleccione documento");

        cboDocsUsuEnCola.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDocsUsuEnColaItemStateChanged(evt);
            }
        });
        cboDocsUsuEnCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDocsUsuEnColaActionPerformed(evt);
            }
        });

        btEliminarDoc.setText("Eliminar");
        btEliminarDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarDocActionPerformed(evt);
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
        jLabel1.setText("Sólo se mostrarán aquellos que estén en la cola de impresión");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(183, 183, 183))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboDocsUsuEnCola, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(90, 90, 90))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btEliminarDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addComponent(cboDocsUsuEnCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEliminarDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void cboDocsUsuEnColaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDocsUsuEnColaItemStateChanged

    }//GEN-LAST:event_cboDocsUsuEnColaItemStateChanged

    private void cboDocsUsuEnColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDocsUsuEnColaActionPerformed

    }//GEN-LAST:event_cboDocsUsuEnColaActionPerformed

    private void btEliminarDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarDocActionPerformed
        String docElimCola = (String) cboDocsUsuEnCola.getSelectedItem();
        //documentos usu es una variable de tipo nodo ya definida, se iguala de nuevo al primer nodo de la lista de documentos del usuario seleccionado
        //aux ya queda como el nodo que contiene el usuario seleccionado (cuando el usuario esta en el hashtable)
        documentosUsu = aux.getElem().getListadocs().getpFirst();
        while (documentosUsu != null){
            if (documentosUsu.getElem().getNombredoc().equals(docElimCola)){
                break;
            }
            documentosUsu = documentosUsu.getSig();
        }
        //documentosUsu es el nodo de tipo documento que contiene el documento a eliminar de la cola de impresion
        //para eliminarlo, debemos pasar su etiqueta de tiempo a 0, ejecutar el metodo eliminarbin del monticulo binario y poner su encola como falso
        Documentos docToQuit = documentosUsu.getElem();
        //variable que guarda etiqueta de tiempo antes de setearla a 0.
        etDocElim = docToQuit.getEtTiempo();
        docToQuit.setEtTiempo(0,0,0);
        Monticulo.minHeapify(0);
        Monticulo.eliminarMin();
        docToQuit.setEncola(false);
        
        //Variables necesarias para la ventana de eliminado exitosamente:
        //Nombre doc:
        nombreDocElim = docToQuit.getNombredoc();
        //Tipo doc:
        tipoDocElim = docToQuit.getTipo();
        //tamano doc:
        tamanoDocElim = docToQuit.getTamano();
        //prioridad doc:
        prioDocElim = docToQuit.getMultPrioUsu();
        if (prioDocElim == 1 ){
            prioUsuDocElim = "Alta";
        }        
        else{
            if (prioDocElim == 3){
                prioUsuDocElim = "Media";
            }
            else{
                prioUsuDocElim = "Baja";
            }
        }
        //etiqueta Doc:
        //etDocElim (Mas arriba antes de setearle la et tiempo a 0.
        
        
        Ventana31 v31 = new Ventana31();
        this.dispose();

    }//GEN-LAST:event_btEliminarDocActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana27.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana27().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEliminarDoc;
    private javax.swing.JComboBox<String> cboDocsUsuEnCola;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


}
