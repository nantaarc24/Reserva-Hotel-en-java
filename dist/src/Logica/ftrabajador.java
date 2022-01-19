/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.vcliente;
import Datos.vtrabajador;

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
public class ftrabajador {
    private conexion mysql=new conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    private String sSQL1="";

    public Integer totalregistros;
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String [] titulos={"ID","Nombre","Apaterno","Amaterno","Doc.","Numero doc.","Dirección","Teléfono","Email","Sueldo","Acceso","Login","Clave","Estado"};
        
        String [] registros=new String[14];
        totalregistros=0;
        modelo=new DefaultTableModel(null,titulos);
        
        sSQL="select p.idpersona,p.nombre,p.apaterno,p.amaterno,p.tipo_documento,p.num_documento"+
                ",p.direccion,p.telefono,p.email,t.sueldo,t.acceso,t.login,t.password,t.estado from persona p inner join trabajador t "+
                "on p.idpersona=t.idpersona where num_documento like '%"+
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
                registros[9]=rs.getString("sueldo");
                registros[10]=rs.getString("acceso");
                registros[11]=rs.getString("login");
                registros[12]=rs.getString("password");
                registros[13]=rs.getString("estado");
                
                totalregistros=totalregistros+1;
                modelo.addRow(registros);
            }
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    public boolean insertar(vtrabajador dts){
        sSQL="INSERT INTO persona (nombre,apaterno,amaterno,tipo_documento,num_documento,direccion,telefono,email)"
                + " VALUES (?,?,?,?,?,?,?,?)";
        sSQL1="insert into trabajador (idpersona,sueldo,acceso,login,password,estado)"+
                "values ((select idpersona from persona order by idpersona desc limit 1),?,?,?,?,?)";
                
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
            
            pst1.setDouble(1,dts.getSueldo());
            pst1.setString(2,dts.getAcceso());
            pst1.setString(3,dts.getLogin());
            pst1.setString(4,dts.getPassword());
            pst1.setString(5,dts.getEstado());
            
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
    public boolean editar(vtrabajador dts){
        sSQL="update persona set nombre=?,apaterno=?,amaterno=?,tipo_documento=?,num_documento=?"+
                ",direccion=?,telefono=?,email=? where idpersona=?";
        sSQL1="update trabajador set sueldo=?,acceso=?,login=?,password=?,estado=? where idpersona=?";
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
            
            pst1.setDouble(1,dts.getSueldo());
            pst1.setString(2,dts.getAcceso());
            pst1.setString(3,dts.getLogin());
            pst1.setString(4,dts.getPassword());
            pst1.setString(5,dts.getEstado());
            
            pst1.setInt(6,dts.getIdpersona());
            
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
    public boolean eliminar(vtrabajador dts){
        sSQL="delete from trabajador where idpersona=?";
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
    
    public DefaultTableModel login(String login,String password){
        DefaultTableModel modelo;
        String [] titulos={"ID","Nombre","Apaterno","Amaterno","Acceso","Login","Clave","Estado"};
        
        String [] registros=new String[8];
        totalregistros=0;
        modelo=new DefaultTableModel(null,titulos);
        
        sSQL="select p.idpersona,p.nombre,p.apaterno,p.amaterno"+
                ",t.acceso,t.login,t.password,t.estado from persona p inner join trabajador t "+
                "on p.idpersona=t.idpersona where t.login='" + 
                login + "' and t.password='" + password+ "'";
        
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            while (rs.next()) {                
                registros[0]=rs.getString("idpersona");
                registros[1]=rs.getString("nombre");
                registros[2]=rs.getString("apaterno");
                registros[3]=rs.getString("amaterno");
               
                registros[4]=rs.getString("acceso");
                registros[5]=rs.getString("login");
                registros[6]=rs.getString("password");
                registros[7]=rs.getString("estado");
                
                totalregistros=totalregistros+1;
                modelo.addRow(registros);
            }
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
}
