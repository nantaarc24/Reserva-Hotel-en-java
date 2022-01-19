/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.vcliente;

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
public class fcliente {
    private conexion mysql=new conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    private String sSQL1="";

    public Integer totalregistros;
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String [] titulos={"ID","Nombre","Apaterno","Amaterno","Doc.","Numero doc.","Dirección","Teléfono","Email","Cod.cliente"};
        
        String [] registros=new String[10];
        totalregistros=0;
        modelo=new DefaultTableModel(null,titulos);
        
        sSQL="select p.idpersona,p.nombre,p.apaterno,p.amaterno,p.tipo_documento,p.num_documento"+
                ",p.direccion,p.telefono,p.email,c.codigo_cliente from persona p inner join cliente c "+
                "on p.idpersona=c.idpersona where num_documento like '%"+
                buscar + "%' order by idpersona desc";
        
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            while (rs.next()) {                
                registros[0]=rs.getString("idpersona");
                registros[1]=rs.getString("nombre");
                registros[2]=rs.getString("apaterno");
                registros[3]=rs.getString("amaterno");
                registros[4]=rs.getString("tipo_documento");
                registros[5]=rs.getString("num_documento");
                registros[6]=rs.getString("direccion");
                registros[7]=rs.getString("telefono");
                registros[8]=rs.getString("email");
                registros[9]=rs.getString("codigo_cliente");
                
                totalregistros=totalregistros+1;
                modelo.addRow(registros);
            }
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    public boolean insertar(vcliente dts){
        sSQL="INSERT INTO persona (nombre,apaterno,amaterno,tipo_documento,num_documento,direccion,telefono,email)"
                + " VALUES (?,?,?,?,?,?,?,?)";
        sSQL1="insert into cliente (idpersona,codigo_cliente)"+
                "values ((select idpersona from persona order by idpersona desc limit 1),?)";
                
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            PreparedStatement pst1=cn.prepareStatement(sSQL1);
            
            pst.setString(1,dts.getNombre());
            pst.setString(2,dts.getApaterno());
            pst.setString(3,dts.getAmaterno());
            pst.setString(4,dts.getTipo_documento());
            pst.setString(5,dts.getNum_documento());
            pst.setString(6,dts.getDireccion());
            pst.setString(7,dts.getTelefono());
            pst.setString(8,dts.getEmail());
            
            pst1.setString(1,dts.getCodigo_cliente());
            int n=pst.executeUpdate();
            if (n!=0) {
                int n1=pst1.executeUpdate();
                
                if (n!=0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public boolean editar(vcliente dts){
        sSQL="update persona set nombre=?,apaterno=?,amaterno=?,tipo_documento=?,num_documento=?"+
                "direccion=?,telefono=?,email=? where idpersona=?";
        sSQL1="update cliente set codigo_cliente=? where idpersona=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            PreparedStatement pst1=cn.prepareStatement(sSQL1);
            
            pst.setString(1,dts.getNombre());
            pst.setString(2,dts.getApaterno());
            pst.setString(3,dts.getAmaterno());
            pst.setString(4,dts.getTipo_documento());
            pst.setString(5,dts.getNum_documento());
            pst.setString(6,dts.getDireccion());
            pst.setString(7,dts.getTelefono());
            pst.setString(8,dts.getEmail());
            pst.setInt(9,dts.getIdpersona());
            
            pst1.setString(1,dts.getCodigo_cliente());
            pst.setInt(2,dts.getIdpersona());
            int n=pst.executeUpdate();
            if (n!=0) {
                int n1=pst.executeUpdate();
                
                if (n!=0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public boolean eliminar(vcliente dts){
        sSQL="delete from cliente where idpersona=?";
        sSQL1="delete from persona where idpersona=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            PreparedStatement pst1=cn.prepareStatement(sSQL1);
            
            
            pst.setInt(1,dts.getIdpersona());
            
            pst1.setInt(1,dts.getIdpersona());
            
            int n=pst.executeUpdate();
            if (n!=0) {
                int n1=pst1.executeUpdate();
                
                if (n!=0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }
}
