    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;


import Datos.vhabitacion;
import Datos.vproducto;
import Datos.vreserva;
import Logica.fhabitacion;
import Logica.fproducto;
import Logica.freserva;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando Tapia Arcos
 */
public class frmreserva extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmhabitacion
     */
    public frmreserva() {
        initComponents();
        mostrar("");
        
        inhabilitar();
    }
    private String accion="guardar";
    static int idusuario;
    
    void ocultar_columnas(){
        tbllistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tbllistado.getColumnModel().getColumn(0).setMinWidth(0);
        tbllistado.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        tbllistado.getColumnModel().getColumn(1).setMaxWidth(0);
        tbllistado.getColumnModel().getColumn(1).setMinWidth(0);
        tbllistado.getColumnModel().getColumn(1).setPreferredWidth(0);
        
        tbllistado.getColumnModel().getColumn(3).setMaxWidth(0);
        tbllistado.getColumnModel().getColumn(3).setMinWidth(0);
        tbllistado.getColumnModel().getColumn(3).setPreferredWidth(0);
        
        tbllistado.getColumnModel().getColumn(5).setMaxWidth(0);
        tbllistado.getColumnModel().getColumn(5).setMinWidth(0);
        tbllistado.getColumnModel().getColumn(5).setPreferredWidth(0);
    }
    
    void inhabilitar(){
        txtidreserva.setVisible(false);
        txtidcliente.setVisible(false);
        txtidtrabajador.setVisible(false);
        txtidhabitacion.setVisible(false);
        
        txtnumerohabitacion.setEnabled(false);
        txtcliente.setEnabled(false);
        txttrabajador.setEnabled(false);
        
        cbotipo_reserva.setEnabled(false);
        
        dcfecha_reserva.setEnabled(false);
        dcfecha_ingreso.setEnabled(false);
        dcfecha_salida.setEnabled(false);
        txtcosto.setEnabled(false);
        cbostado_reserva.setEnabled(false);
        
        btnguardar.setEnabled(false);
        btncancelar.setEnabled(false);
        btneliminar.setEnabled(false);
        btnbuscacliente.setEnabled(false);
        btnbuscahabitacion.setEnabled(false);
        
        txtidreserva.setText("");
        txtcosto.setText("");
        txtidhabitacion.setText("");
        txtnumerohabitacion.setText("");
        txtcliente.setText("");
        txtidcliente.setText("");
        
    }
    
    void habilitar(){
        txtidreserva.setVisible(false);
        txtidcliente.setVisible(false);
        txtidtrabajador.setVisible(false);
        txtidhabitacion.setVisible(false);
        
        txtnumerohabitacion.setEnabled(false);
        txtcliente.setEnabled(false);
        txttrabajador.setEnabled(false);
        
        cbotipo_reserva.setEnabled(true);
        
        dcfecha_reserva.setEnabled(true);
        dcfecha_ingreso.setEnabled(true);
        dcfecha_salida.setEnabled(true);
        txtcosto.setEnabled(true);
        cbostado_reserva.setEnabled(true);
        
        btnguardar.setEnabled(true);
        btncancelar.setEnabled(true);
        btneliminar.setEnabled(true);
        btnbuscacliente.setEnabled(true);
        btnbuscahabitacion.setEnabled(true);
        
        txtidreserva.setText("");
        txtcosto.setText("");
        txtidhabitacion.setText("");
        txtnumerohabitacion.setText("");
        txtcliente.setText("");
        txtidcliente.setText("");
    }
    
    void mostrar (String buscar){
        try {
            DefaultTableModel modelo;
            freserva func=new freserva();
            modelo=func.mostrar(buscar);
            
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtidreserva = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtidhabitacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcosto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbotipo_reserva = new javax.swing.JComboBox<>();
        btnguardar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        txtnumerohabitacion = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        txtcliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtidtrabajador = new javax.swing.JTextField();
        txttrabajador = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dcfecha_reserva = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        dcfecha_ingreso = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        dcfecha_salida = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        cbostado_reserva = new javax.swing.JComboBox<>();
        btnbuscacliente = new javax.swing.JButton();
        btnbuscahabitacion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbllistado = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();
        btnverconsumo = new javax.swing.JButton();
        btnrealizarpagos = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Reserva");

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de reservas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setText("Habitación:");

        txtidhabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidhabitacionActionPerformed(evt);
            }
        });

        jLabel4.setText("Cliente:");

        jLabel6.setText("Costo:");

        txtcosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcostoActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo reserva:");

        cbotipo_reserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reserva", "Alquiler" }));
        cbotipo_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipo_reservaActionPerformed(evt);
            }
        });

        btnguardar.setBackground(new java.awt.Color(51, 51, 51));
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnnuevo.setBackground(new java.awt.Color(51, 51, 51));
        btnnuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btncancelar.setBackground(new java.awt.Color(51, 51, 51));
        btncancelar.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        txtnumerohabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumerohabitacionActionPerformed(evt);
            }
        });

        txtidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclienteActionPerformed(evt);
            }
        });

        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Trabajador:");

        txtidtrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidtrabajadorActionPerformed(evt);
            }
        });

        txttrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttrabajadorActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha reserva:");

        jLabel10.setText("Fecha ingreso:");

        jLabel11.setText("Fecha salida:");

        jLabel12.setText("Estado reserva:");

        cbostado_reserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alquiler", "Pagada", "Anulada" }));
        cbostado_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbostado_reservaActionPerformed(evt);
            }
        });

        btnbuscacliente.setText("...");
        btnbuscacliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaclienteActionPerformed(evt);
            }
        });

        btnbuscahabitacion.setText("...");
        btnbuscahabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscahabitacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(97, 97, 97))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnbuscacliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnbuscahabitacion, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbostado_reserva, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dcfecha_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(dcfecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dcfecha_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtnumerohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txttrabajador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cbotipo_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 122, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtidtrabajador)
                        .addComponent(txtidcliente)
                        .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(btnnuevo)
                            .addGap(45, 45, 45)
                            .addComponent(btnguardar)
                            .addGap(50, 50, 50)
                            .addComponent(btncancelar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnbuscahabitacion))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btnbuscacliente))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtnumerohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txttrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtidtrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbotipo_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(dcfecha_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(dcfecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(dcfecha_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbostado_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo)
                    .addComponent(btncancelar)
                    .addComponent(btnguardar))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de reservas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

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

        btneliminar.setBackground(new java.awt.Color(51, 51, 51));
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(51, 51, 51));
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        lbltotalregistros.setText("Registros");

        btnverconsumo.setText("Consumos");
        btnverconsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverconsumoActionPerformed(evt);
            }
        });

        btnrealizarpagos.setText("Realizar pagos");
        btnrealizarpagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrealizarpagosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnsalir)
                        .addContainerGap(126, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnverconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnrealizarpagos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltotalregistros)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnbuscar)
                        .addComponent(btneliminar)
                        .addComponent(btnsalir)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnverconsumo)
                    .addComponent(lbltotalregistros)
                    .addComponent(btnrealizarpagos))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
        btnguardar.setText("Guardar");
        accion="guardar";
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        if (txtidhabitacion.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debe seleccionar una habitación");
            txtidhabitacion.requestFocus();
            return;
        }

        if (txtidcliente.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debe seleccionar un cliente");
            txtidcliente.requestFocus();
            return;
        }
        if (txtcosto.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debe ingresar un precio del alojamiento");
            txtcosto.requestFocus();
            return;
        }

        vreserva dts = new vreserva();
        freserva func = new freserva();

        dts.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));

        dts.setIdcliente(Integer.parseInt(txtidcliente.getText()));
        dts.setIdtrabajador(idusuario);


        
        int seleccionado = cbotipo_reserva.getSelectedIndex();
        dts.setTipo_reserva((String) cbotipo_reserva.getItemAt(seleccionado));
        
        Calendar cal;
        int d,m,a;
        
        cal=dcfecha_reserva.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR)- 1900;
        
        dts.setFecha_reserva(new Date(a,m,d));
        
        cal=dcfecha_ingreso.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR)- 1900;
        
        dts.setFecha_ingreso(new Date(a,m,d));
        
        cal=dcfecha_salida.getCalendar();
        d=cal.get(Calendar.DAY_OF_MONTH);
        m=cal.get(Calendar.MONTH);
        a=cal.get(Calendar.YEAR)- 1900;
        
        dts.setFecha_salida(new Date(a,m,d));
        
        dts.setCosto_alojamiento(Double.parseDouble((txtcosto.getText())));
        
        seleccionado = cbostado_reserva.getSelectedIndex();
        dts.setEstado((String) cbostado_reserva.getItemAt(seleccionado));
        
        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                
                fhabitacion func3=new fhabitacion();
                vhabitacion dts3=new vhabitacion();
                
                 dts3.setIdhabitacion(Integer.parseInt(txtidhabitacion.getText()));
                 func3.ocupar(dts3);
                JOptionPane.showMessageDialog(rootPane, "La reserva fue registrada satisfactoriamente");
                mostrar("");
                inhabilitar();
                
                //ocupamos la habitacion alquilada
                
                 
            }
        } else if (accion.equals("editar")) {
            dts.setIdreserva(Integer.parseInt(txtidreserva.getText()));
            dts.setIdtrabajador(Integer.parseInt(txtidtrabajador.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "La reserva fue editada satisfactoriamente");
                mostrar("");
                inhabilitar();
            }
        }
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        if (!txtidreserva.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "estas seguro de eliminar la reserva?", "confirmar", 2);

            if (confirmacion == 0) {
                freserva func = new freserva();
                vreserva dts = new vreserva();

                dts.setIdreserva(Integer.parseInt(txtidreserva.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtidhabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidhabitacionActionPerformed
        // TODO add your handling code here:
        txtidhabitacion.transferFocus();
    }//GEN-LAST:event_txtidhabitacionActionPerformed

    private void txtcostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcostoActionPerformed
        // TODO add your handling code here:
        txtcosto.transferFocus();
    }//GEN-LAST:event_txtcostoActionPerformed

    private void cbotipo_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipo_reservaActionPerformed
        // TODO add your handling code here:
        cbotipo_reserva.transferFocus();
    }//GEN-LAST:event_cbotipo_reservaActionPerformed

    private void tbllistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbllistadoMouseClicked
        // TODO add your handling code here:
        btnguardar.setText("editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion = "editar";

        int fila = tbllistado.rowAtPoint(evt.getPoint());

        txtidreserva.setText(tbllistado.getValueAt(fila, 0).toString());
        txtidhabitacion.setText(tbllistado.getValueAt(fila, 1).toString());

        txtnumerohabitacion.setText(tbllistado.getValueAt(fila, 2).toString());
        txtidcliente.setText(tbllistado.getValueAt(fila, 3).toString());
        txtcliente.setText(tbllistado.getValueAt(fila, 4).toString());
        txtidtrabajador.setText(tbllistado.getValueAt(fila, 5).toString());
        txttrabajador.setText(tbllistado.getValueAt(fila, 6).toString());
        
        cbotipo_reserva.setSelectedItem(tbllistado.getValueAt(fila, 7).toString());
        dcfecha_reserva.setDate(Date.valueOf(tbllistado.getValueAt(fila, 8).toString()));
        dcfecha_ingreso.setDate(Date.valueOf(tbllistado.getValueAt(fila, 9).toString()));
        dcfecha_salida.setDate(Date.valueOf(tbllistado.getValueAt(fila, 10).toString()));
        
        txtcosto.setText(tbllistado.getValueAt(fila, 11).toString());
        cbostado_reserva.setSelectedItem(tbllistado.getValueAt(fila, 12).toString());
        
    }//GEN-LAST:event_tbllistadoMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtnumerohabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumerohabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumerohabitacionActionPerformed

    private void txtidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidclienteActionPerformed

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclienteActionPerformed

    private void txtidtrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidtrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidtrabajadorActionPerformed

    private void txttrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttrabajadorActionPerformed

    private void cbostado_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbostado_reservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbostado_reservaActionPerformed

    private void btnbuscahabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscahabitacionActionPerformed
        // TODO add your handling code here:
        frmvistahabitacion form=new frmvistahabitacion();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnbuscahabitacionActionPerformed

    private void btnbuscaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaclienteActionPerformed
        // TODO add your handling code here:
        frmvistacliente form=new frmvistacliente();
        form.toFront();
        form.setVisible(true);
        
    }//GEN-LAST:event_btnbuscaclienteActionPerformed

    private void btnverconsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverconsumoActionPerformed
        // TODO add your handling code here:
        int fila=tbllistado.getSelectedRow();
        frmconsumo.idreserva=tbllistado.getValueAt(fila, 0).toString();
        frmconsumo.cliente=tbllistado.getValueAt(fila, 4).toString();
        
        frmconsumo form=new frmconsumo();
        frminicio.escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnverconsumoActionPerformed

    private void btnrealizarpagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrealizarpagosActionPerformed
        // TODO add your handling code here:
        int fila=tbllistado.getSelectedRow();
        
        frmpago.idreserva=tbllistado.getValueAt(fila, 0).toString();
        frmpago.cliente=tbllistado.getValueAt(fila, 4).toString();
        frmpago.totalreserva= Double.parseDouble(tbllistado.getValueAt(fila, 11).toString());
        
        frmpago.idhabitacion= tbllistado.getValueAt(fila, 1).toString();
        frmpago.habitacion= tbllistado.getValueAt(fila, 2).toString();
        
        frmpago form=new frmpago();
        frminicio.escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        
    }//GEN-LAST:event_btnrealizarpagosActionPerformed

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
            java.util.logging.Logger.getLogger(frmreserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmreserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmreserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmreserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmreserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscacliente;
    private javax.swing.JButton btnbuscahabitacion;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnrealizarpagos;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnverconsumo;
    private javax.swing.JComboBox<String> cbostado_reserva;
    private javax.swing.JComboBox<String> cbotipo_reserva;
    private com.toedter.calendar.JDateChooser dcfecha_ingreso;
    private com.toedter.calendar.JDateChooser dcfecha_reserva;
    private com.toedter.calendar.JDateChooser dcfecha_salida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tbllistado;
    private javax.swing.JTextField txtbuscar;
    public static javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtcosto;
    public static javax.swing.JTextField txtidcliente;
    public static javax.swing.JTextField txtidhabitacion;
    private javax.swing.JTextField txtidreserva;
    public static javax.swing.JTextField txtidtrabajador;
    public static javax.swing.JTextField txtnumerohabitacion;
    public static javax.swing.JTextField txttrabajador;
    // End of variables declaration//GEN-END:variables
}
