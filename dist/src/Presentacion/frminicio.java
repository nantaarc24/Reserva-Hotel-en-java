/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;
import javax.swing.JFrame;

/**
 *
 * @author Fernando Tapia Arcos
 */
public class frminicio extends javax.swing.JFrame {

    /**
     * Creates new form frminicio
     */
    public frminicio() {
        initComponents();
        this.setExtendedState(frminicio.MAXIMIZED_BOTH);
        this.setTitle("Sistema de reserva de habitaciones y gestión de ventas - Hotel Paraiso");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        lblidpersona = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblapaterno = new javax.swing.JLabel();
        lblamaterno = new javax.swing.JLabel();
        lblacceso = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnusisreserva = new javax.swing.JMenu();
        mnuarchivo = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        mnureservas = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuconsultas = new javax.swing.JMenu();
        mnuconfiguraciones = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuherramientas = new javax.swing.JMenu();
        mnuayuda = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnusalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        escritorio.setBackground(new java.awt.Color(0, 204, 102));

        lblidpersona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblidpersona.setText("Idpersona");
        escritorio.add(lblidpersona);
        lblidpersona.setBounds(30, 50, 120, 14);

        lblnombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblnombre.setText("Nombre");
        escritorio.add(lblnombre);
        lblnombre.setBounds(30, 90, 120, 14);

        lblapaterno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblapaterno.setText("A.paterno");
        escritorio.add(lblapaterno);
        lblapaterno.setBounds(30, 130, 120, 14);

        lblamaterno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblamaterno.setText("A.materno");
        escritorio.add(lblamaterno);
        lblamaterno.setBounds(30, 170, 120, 14);

        lblacceso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblacceso.setText("Acceso");
        escritorio.add(lblacceso);
        lblacceso.setBounds(30, 210, 120, 14);

        mnusisreserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/system-settings-icon_31831 (1).png"))); // NOI18N
        mnusisreserva.setMnemonic('f');
        mnusisreserva.setText("Sisreserva");
        menuBar.add(mnusisreserva);

        mnuarchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/desktop_folder_file_10322.png"))); // NOI18N
        mnuarchivo.setMnemonic('e');
        mnuarchivo.setText("Archivo");

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/yellow_single-room_icon-icons.com_59593.png"))); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Habitaciones");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        mnuarchivo.add(cutMenuItem);

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Product-sale-report_25407.png"))); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Productos");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        mnuarchivo.add(copyMenuItem);

        menuBar.add(mnuarchivo);

        mnureservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/form_document_file_icon_147462.png"))); // NOI18N
        mnureservas.setMnemonic('h');
        mnureservas.setText("Reservas");

        contentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        contentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/businessregistration_signpen_negocio_inscripcio_2358.png"))); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Reservas y Consumos");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        mnureservas.add(contentMenuItem);

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Clients_27015.png"))); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Clientes");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        mnureservas.add(aboutMenuItem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/business-color_money-time_icon-icons.com_53444.png"))); // NOI18N
        jMenuItem1.setText("Pagos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnureservas.add(jMenuItem1);

        menuBar.add(mnureservas);

        mnuconsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/1458264589_question_quiz_feedback_comments_enquiry_help_support_icon-icons.com_55335.png"))); // NOI18N
        mnuconsultas.setText("Consultas");
        menuBar.add(mnuconsultas);

        mnuconfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/1492616984-13-setting-configure-repair-support-optimization-google_83419.png"))); // NOI18N
        mnuconfiguraciones.setText("Configuraciones");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/new_add_user_info_16706.png"))); // NOI18N
        jMenuItem2.setText("Usuarios y Accesos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuconfiguraciones.add(jMenuItem2);

        menuBar.add(mnuconfiguraciones);

        mnuherramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/01-11_86379.png"))); // NOI18N
        mnuherramientas.setText("Herramientas");
        menuBar.add(mnuherramientas);

        mnuayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/support-avatar_icon-icons.com_53645.png"))); // NOI18N
        mnuayuda.setText("Ayuda");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/About.me-Icon_icon-icons.com_52852.png"))); // NOI18N
        jMenuItem3.setText("Acerca de ...");
        mnuayuda.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/ask_question_query_demand_interrogate_icon_146778.png"))); // NOI18N
        jMenuItem4.setText("Ayuda");
        mnuayuda.add(jMenuItem4);

        menuBar.add(mnuayuda);

        mnusalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Exitfullscreen_screen_output_1900.png"))); // NOI18N
        mnusalir.setText("Salir");
        mnusalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnusalirMouseClicked(evt);
            }
        });
        menuBar.add(mnusalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        // TODO add your handling code here:
        frmhabitacion1 form=new frmhabitacion1();
        escritorio.add(form);
        form.toFront();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((pantalla.getWidth() - form.getWidth()) / 2);
        int y = (int) ((pantalla.getHeight() - form.getHeight()) / 2);
        form.setLocation(x, y);
        form.setVisible(true);
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        // TODO add your handling code here:
        frmproducto form=new frmproducto();
        escritorio.add(form);
        form.toFront();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((pantalla.getWidth() - form.getWidth()) / 2);
        int y = (int) ((pantalla.getHeight() - form.getHeight()) / 2);
        form.setLocation(x, y);
        form.setVisible(true);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
        ffrmcliente form=new ffrmcliente();
        escritorio.add(form);
        form.toFront();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((pantalla.getWidth() - form.getWidth()) / 2);
        int y = (int) ((pantalla.getHeight() - form.getHeight()) / 2);
        form.setLocation(x, y);
        form.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        frmtrabajador form=new frmtrabajador();
        escritorio.add(form);
        form.toFront();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((pantalla.getWidth() - form.getWidth()) / 2);
        int y = (int) ((pantalla.getHeight() - form.getHeight()) / 2);
        form.setLocation(x, y);
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnusalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnusalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_mnusalirMouseClicked

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        // TODO add your handling code here:
        frmpago form=new frmpago();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((pantalla.getWidth() - form.getWidth()) / 2);
        int y = (int) ((pantalla.getHeight() - form.getHeight()) / 2);
        form.setLocation(x, y);
        form.setVisible(true);
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        frmreserva form=new frmreserva();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        frmreserva.txtidtrabajador.setText(lblidpersona.getText());
        frmreserva.txttrabajador.setText(lblnombre.getText()+" "+lblapaterno.getText());
        frmreserva.idusuario=Integer.parseInt(lblidpersona.getText());
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((pantalla.getWidth() - form.getWidth()) / 2);
        int y = (int) ((pantalla.getHeight() - form.getHeight()) / 2);
        form.setLocation(x, y);
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InstantiationException {
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
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frminicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JLabel lblacceso;
    public static javax.swing.JLabel lblamaterno;
    public static javax.swing.JLabel lblapaterno;
    public static javax.swing.JLabel lblidpersona;
    public static javax.swing.JLabel lblnombre;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JMenu mnuarchivo;
    private javax.swing.JMenu mnuayuda;
    public static javax.swing.JMenu mnuconfiguraciones;
    private javax.swing.JMenu mnuconsultas;
    private javax.swing.JMenu mnuherramientas;
    private javax.swing.JMenu mnureservas;
    private javax.swing.JMenu mnusalir;
    private javax.swing.JMenu mnusisreserva;
    // End of variables declaration//GEN-END:variables

}
