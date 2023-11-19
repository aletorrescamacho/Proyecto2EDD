/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import static Interfaz.Ventana1.listausu;
import static Usuarios.Operacioneslistausu.Mostrarusu;
import Cronometro.Cronometro;
import static Interfaz.Ventana5.nuevoDoc;
import static Interfaz.Ventana5.nombreUsuAggDoc;
import static Interfaz.Ventana15.nombreUsuElimDoc;
import static Interfaz.Ventana15.docElim;
import java.util.Calendar;
import static Cronometro.Operacionescronometro.convertiraEtiquetat;
import Documentos.Documentos;
import EDD.Monticulobinmin;
import Graficos.Operacionesgraficosmx;
import javax.swing.JFrame;
//import static Graficos.Operacionesgraficos.Verarbol;

/**
 * Ventana 3 ventana principal donde se ejecutan las operaciones
 *
 * @author: Alessandra Torres
 * @version: 03/11/23
 */
public class Ventana3 extends javax.swing.JFrame {

    public static int etiquetaTiempo;
    public static Documentos docaImprimir;
    public static Monticulobinmin Monticulo;

    /**
     * Creates new form Ventana3
     */
    public Ventana3() {
        initComponents();
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        Cronometro c1 = new Cronometro(tiempo);
        c1.start();
        Calendar c = Calendar.getInstance();
        int hora = c.get(Calendar.HOUR);
        int minutos = c.get(Calendar.MINUTE);
        int segundos = c.get(Calendar.SECOND);
        String a = hora + ":" + minutos + ":" + segundos;
        lbhorainicio.setText(a);
        Monticulo = new Monticulobinmin(100);

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
        tamostrarUsu = new javax.swing.JTextArea();
        btcrearusu = new javax.swing.JButton();
        bteliminarusu = new javax.swing.JButton();
        btmostrarusu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pestanadocs = new javax.swing.JPanel();
        btcreardoc = new javax.swing.JButton();
        bteliminardoc = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tamostrarDocs = new javax.swing.JTextArea();
        mostrarDoc = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btliberarimp = new javax.swing.JButton();
        bteliminardoccola = new javax.swing.JButton();
        btenviarColaimpr = new javax.swing.JButton();
        btinfoEtTiempo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btvistasecuencia = new javax.swing.JButton();
        btvistaarbol = new javax.swing.JButton();
        tiempo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbhorainicio = new javax.swing.JLabel();

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

        tamostrarUsu.setColumns(20);
        tamostrarUsu.setRows(5);
        jScrollPane1.setViewportView(tamostrarUsu);

        btcrearusu.setText("Crear Usuario");
        btcrearusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcrearusuActionPerformed(evt);
            }
        });

        bteliminarusu.setText("Eliminar Usuario");
        bteliminarusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarusuActionPerformed(evt);
            }
        });

        btmostrarusu.setText("Mostrar Usuarios");
        btmostrarusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmostrarusuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("(Pulsar después de cada operación)");

        javax.swing.GroupLayout pestanausuLayout = new javax.swing.GroupLayout(pestanausu);
        pestanausu.setLayout(pestanausuLayout);
        pestanausuLayout.setHorizontalGroup(
            pestanausuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestanausuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pestanausuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestanausuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btcrearusu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bteliminarusu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btmostrarusu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pestanausuLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(269, Short.MAX_VALUE))
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
        bteliminardoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminardocActionPerformed(evt);
            }
        });

        tamostrarDocs.setColumns(20);
        tamostrarDocs.setRows(5);
        jScrollPane2.setViewportView(tamostrarDocs);

        mostrarDoc.setText("Mostrar Últim. Doc. Creado/Elim.");
        mostrarDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarDocActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("(Pulsar después de cada operación)");

        javax.swing.GroupLayout pestanadocsLayout = new javax.swing.GroupLayout(pestanadocs);
        pestanadocs.setLayout(pestanadocsLayout);
        pestanadocsLayout.setHorizontalGroup(
            pestanadocsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanadocsLayout.createSequentialGroup()
                .addGroup(pestanadocsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestanadocsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pestanadocsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btcreardoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mostrarDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bteliminardoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pestanadocsLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
        );
        pestanadocsLayout.setVerticalGroup(
            pestanadocsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestanadocsLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btcreardoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bteliminardoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostrarDoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(273, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );

        tp.addTab("Documentos", pestanadocs);

        jPanel1.setBackground(new java.awt.Color(175, 196, 216));

        btliberarimp.setText("Liberar impresora");
        btliberarimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btliberarimpActionPerformed(evt);
            }
        });

        bteliminardoccola.setText("Eliminar Doc en cola");
        bteliminardoccola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminardoccolaActionPerformed(evt);
            }
        });

        btenviarColaimpr.setText("Enviar Doc a cola de Impresión");
        btenviarColaimpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btenviarColaimprActionPerformed(evt);
            }
        });

        btinfoEtTiempo.setText("Info Et. Tiempo");
        btinfoEtTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinfoEtTiempoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("(IMPORTANTE)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btliberarimp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btenviarColaimpr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bteliminardoccola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btinfoEtTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel5)))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btliberarimp)
                .addGap(18, 18, 18)
                .addComponent(btenviarColaimpr)
                .addGap(18, 18, 18)
                .addComponent(bteliminardoccola)
                .addGap(18, 18, 18)
                .addComponent(btinfoEtTiempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        tp.addTab("Impresión", jPanel1);

        jPanel2.setBackground(new java.awt.Color(175, 196, 216));

        btvistasecuencia.setText("Vista Secuencia Registros");
        btvistasecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvistasecuenciaActionPerformed(evt);
            }
        });

        btvistaarbol.setText("Vista Árbol");
        btvistaarbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvistaarbolActionPerformed(evt);
            }
        });

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

        tiempo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        tiempo.setForeground(new java.awt.Color(255, 255, 255));
        tiempo.setText("00:00:00");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hora de inicio de simulación:");

        lbhorainicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbhorainicio.setForeground(new java.awt.Color(255, 255, 255));
        lbhorainicio.setText("hora");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tiempo)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbhorainicio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbhorainicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tiempo)
                        .addGap(25, 25, 25)))
                .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Boton salir, pide confirmación en la ventana 4
     *
     * @author: Alessandra Torres
     * @version: 03/11/23
     */
    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        Ventana4 v4 = new Ventana4();
        System.out.println(tiempo.getText());
    }//GEN-LAST:event_btsalirActionPerformed

    private void btcreardocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcreardocActionPerformed
        // TODO add your handling code here:
        Ventana5 v5 = new Ventana5();
//        if (aux1==true){
//            tamostrarDocs.setText("");
//            tamostrarUsu.append("Nuevo Documento Creado: \n");
//            tamostrarUsu.append("Nombre "+nuevoDoc.getNombredoc());
//        }
    }//GEN-LAST:event_btcreardocActionPerformed
    /**
     * Abre la ventana 6, crear usuario
     *
     * @author: Alessandra Torres
     * @version: 05/11/23
     */
    private void btcrearusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcrearusuActionPerformed
        Ventana6 v6 = new Ventana6();
    }//GEN-LAST:event_btcrearusuActionPerformed
    /**
     * Abre la ventana 8, eliminar usuario
     *
     * @author: Alessandra Torres
     * @version: 05/11/23
     */
    private void bteliminarusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarusuActionPerformed
        Ventana8 v8 = new Ventana8();
    }//GEN-LAST:event_bteliminarusuActionPerformed

    private void bteliminardocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminardocActionPerformed
        Ventana13 v13 = new Ventana13();
    }//GEN-LAST:event_bteliminardocActionPerformed

    private void btmostrarusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmostrarusuActionPerformed
        Mostrarusu(listausu, tamostrarUsu);
    }//GEN-LAST:event_btmostrarusuActionPerformed

    private void mostrarDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarDocActionPerformed
        tamostrarDocs.setText("");
        if (nuevoDoc != null) {
            tamostrarDocs.append("Último Documento Creado: \n");
            tamostrarDocs.append("Nombre: " + nuevoDoc.getNombredoc() + "\n");
            tamostrarDocs.append("Usuario Propietario: " + nombreUsuAggDoc + "\n");
            tamostrarDocs.append("Multiplicador Prioridad Usuario: " + nuevoDoc.getMultPrioUsu() + "\n");
            tamostrarDocs.append("Multiplicador Prioridad Tamano: " + nuevoDoc.getMultPrioTam() + "\n");
        } else {
            tamostrarDocs.append("No se ha creado ningún documento.");
        }
        if (docElim != null) {
            tamostrarDocs.append("\n");
            tamostrarDocs.append("Último Documento Eliminado: \n");
            tamostrarDocs.append("Nombre: " + docElim.getElem().getNombredoc() + "\n");
            tamostrarDocs.append("Usuario Propietario: " + nombreUsuElimDoc + "\n");
            tamostrarDocs.append("Multiplicador Prioridad Usuario: " + docElim.getElem().getMultPrioUsu() + "\n");
            tamostrarDocs.append("Multiplicador Prioridad Tamano: " + docElim.getElem().getMultPrioTam() + "\n");
        } else {
            tamostrarDocs.append("\n");
            tamostrarDocs.append("No se ha eliminado ningún documento.");
        }
    }//GEN-LAST:event_mostrarDocActionPerformed

    private void btenviarColaimprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btenviarColaimprActionPerformed
        etiquetaTiempo = convertiraEtiquetat(tiempo, lbhorainicio);

        Ventana21 v21 = new Ventana21();


    }//GEN-LAST:event_btenviarColaimprActionPerformed

    private void btliberarimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btliberarimpActionPerformed
        // nuevo
        Documentos docaImprimir = Monticulo.getMin();
//        System.out.println(docaImprimir.getNombredoc());

        if (!Monticulo.esVacio()) {
            Monticulo.eliminarMin();
            Monticulo.imprimirdatos();
            Ventana19 v19 = new Ventana19(docaImprimir);
            docaImprimir.setEncola(false);

        } else {
            Ventana23 v23 = new Ventana23();

        }
    }//GEN-LAST:event_btliberarimpActionPerformed

    private void btinfoEtTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinfoEtTiempoActionPerformed
        Ventana25 v25 = new Ventana25();
    }//GEN-LAST:event_btinfoEtTiempoActionPerformed


    private void btvistasecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvistasecuenciaActionPerformed
        Ventana29 v29 = new Ventana29();
    }//GEN-LAST:event_btvistasecuenciaActionPerformed

    private void bteliminardoccolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminardoccolaActionPerformed
        Ventana26 v26 = new Ventana26();
    }//GEN-LAST:event_bteliminardoccolaActionPerformed

    private void btvistaarbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvistaarbolActionPerformed
        if (Monticulo.esVacio()){
            Ventana30 v30 = new Ventana30();
        
        }
        else{
            
            Documentos [] monticuloLleno = new Documentos[Monticulo.getTamMonticulo()] ;
            
            for (int i = 0; i < Monticulo.getTamMonticulo(); i++) {
                monticuloLleno [i] = Monticulo.getArrMonticulo()[i];
            }
              
        Operacionesgraficosmx frame = new Operacionesgraficosmx(monticuloLleno);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 350);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        
        }
    }//GEN-LAST:event_btvistaarbolActionPerformed


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
    private javax.swing.JButton btenviarColaimpr;
    private javax.swing.JButton btinfoEtTiempo;
    private javax.swing.JButton btliberarimp;
    private javax.swing.JButton btmostrarusu;
    private javax.swing.JButton btsalir;
    private javax.swing.JButton btvistaarbol;
    private javax.swing.JButton btvistasecuencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbhorainicio;
    private javax.swing.JButton mostrarDoc;
    private javax.swing.JPanel pestanadocs;
    private javax.swing.JPanel pestanausu;
    private javax.swing.JTextArea tamostrarDocs;
    private javax.swing.JTextArea tamostrarUsu;
    private javax.swing.JLabel tiempo;
    private javax.swing.JTabbedPane tp;
    // End of variables declaration//GEN-END:variables
}
