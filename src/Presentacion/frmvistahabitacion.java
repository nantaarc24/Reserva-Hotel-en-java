/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.fhabitacion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando Tapia Arcos
 */
public class frmvistahabitacion extends javax.swing.JFrame {

    /**
     * Creates new form frmvistahabitacion
     */
    public frmvistahabitacion() {
        initComponents();
        mostrar("");
        this.setLocationRelativeTo(null);
        
    }
    
    void ocultar_columnas(){
        tbllistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tbllistado.getColumnModel().getColumn(0).setMinWidth(0);
        tbllistado.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
     void mostrar (String buscar){
        try {
            DefaultTableModel modelo;
            fhabitacion func=new fhabitacion();
            modelo=func.mostrarvista(buscar);
            
            tbllistado.setModel(modelo);
            ocultar_columnas();
            lbltotalregistros.setText("Total registros "+Integer.toString(func.totalregistros));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbllistado = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de habitaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tbllistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbllistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbllistadoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbllistadoMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tbllistado);

        jLabel9.setText("Buscar:");

        btnbuscar.setBackground(new java.awt.Color(51, 51, 51));
        btnbuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        lbltotalregistros.setText("Registros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltotalregistros)
                .addGap(68, 68, 68))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnbuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(lbltotalregistros)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbllistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbllistadoMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tbllistadoMouseClicked

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void tbllistadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbllistadoMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount()==2) {
            int fila=tbllistado.getSelectedRow();
            String cod;
            String valor;
            
            cod=tbllistado.getValueAt(fila, 0).toString();
            valor=tbllistado.getValueAt(fila, 1).toString();
            
            frmreserva.txtidhabitacion.setText(cod);
            frmreserva.txtnumerohabitacion.setText(valor);
            this.dispose();
            
            
        }
    }//GEN-LAST:event_tbllistadoMousePressed

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
            java.util.logging.Logger.getLogger(frmvistahabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmvistahabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmvistahabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmvistahabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmvistahabitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tbllistado;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
