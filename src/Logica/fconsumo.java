 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.vconsumo;
import Datos.vhabitacion;
import Datos.vproducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando Tapia Arcos
 */
public class fconsumo {
    private conexion mysql=new conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public Double totalregistros;
    public Double totalconsumo;
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String [] titulos={"ID","idreserva","idproducto","Producto","Cantidad","Precio de venta","Estado"};
        
        String [] registros=new String[7];
        totalregistros=0.0;
        totalconsumo=0.0;
        modelo=new DefaultTableModel(null,titulos);
        
        sSQL="select c.idconsumo,c.idreserva,c.idproducto,p.nombre,c.cantidad,c.precio_venta"
                + ",c.estado from consumo c inner join producto p on c.idproducto=p.idproducto"
                + " where c.idreserva ="+ buscar +" order by c.idconsumo desc";
        
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            while (rs.next()) {                
                registros[0]=rs.getString("idconsumo");
                registros[1]=rs.getString("idreserva");
                registros[2]=rs.getString("idproducto");
                registros[3]=rs.getString("nombre");
                registros[4]=rs.getString("cantidad");
                registros[5]=rs.getString("precio_venta");
                registros[6]=rs.getString("estado");
                
                totalregistros=totalregistros+1;
                totalconsumo=totalconsumo+(rs.getDouble("cantidad") * rs.getDouble("precio_venta"));
                modelo.addRow(registros);
            }
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    public boolean insertar(vconsumo dts){
        sSQL="INSERT INTO consumo (idreserva,idproducto,cantidad,precio_venta,estado) VALUES (?,?,?,?,?)";
                
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1,dts.getIdreserva());
            pst.setInt(2,dts.getIdproducto());
            pst.setDouble(3,dts.getCantidad());
            pst.setDouble(4,dts.getPrecio_venta());
            pst.setString(5, dts.getEstado());
            
            
            int n=pst.executeUpdate();
            if (n!=0) {
                return true;
            } else {
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public boolean editar(vconsumo dts){
        sSQL="update consumo set idreserva=?,idproducto=?,cantidad=?,precio_venta=?,estado=?"+
                "where idconsumo=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1,dts.getIdreserva());
            pst.setInt(2,dts.getIdproducto());
            pst.setDouble(3,dts.getCantidad());
            pst.setDouble(4,dts.getPrecio_venta());
            pst.setString(5, dts.getEstado());
            
            pst.setInt(6,dts.getIdconsumo());
            
            int n=pst.executeUpdate();
            if (n!=0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public boolean eliminar(vconsumo dts){
        sSQL="delete from consumo where idconsumo=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1,dts.getIdconsumo());
            
            int n=pst.executeUpdate();
            if (n!=0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
