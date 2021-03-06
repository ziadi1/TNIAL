/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.DB4SQLServer;
import Model.TunDinasProses;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Someone
 */
public class ControlTunDinasDataTingkatProses {
    private DB4SQLServer db = new DB4SQLServer();
    private Connection con = null;
    private PreparedStatement st = null;
    private ResultSet rs = null;
    private ArrayList<TunDinasProses> data = new ArrayList<>();
    final private long idR;
    
    public ControlTunDinasDataTingkatProses(long id){
        this.idR = id;
    }
    
    public void getDataDB(){
        ArrayList<TunDinasProses> temp = new ArrayList<>();
        
        try {
            con = DriverManager.getConnection(db.getURL());
            st = con.prepareStatement("SELECT * FROM bankum_tundinasproses WHERE idR = '"+
                        this.idR + "' ORDER BY tgl ASC");
            rs = st.executeQuery();
            while(rs.next()){                
                temp.add(new TunDinasProses(
                        rs.getLong("idRtundinas"),
                        rs.getLong("idR"),
                        rs.getString("proses"),
                        rs.getString("id_status_tingkat"),
                        rs.getDate("tgl")
                )
                );
            }                
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(TunDinasProses.class.getName()).log(Level.SEVERE, null, ex);
        }   finally {
                try { rs.close(); } catch (Exception e) { /* ignored */ }
                try { st.close(); } catch (Exception e) { /* ignored */ }
                try { con.close(); } catch (Exception e) { /* ignored */ }
        }        
        this.data = temp;
    }
    
    public ArrayList<TunDinasProses> getDatanya(){
        return this.data;
    }
    
    public void updateDataDB(
            String ket,
            long id
    ){try{
            con = DriverManager.getConnection(db.getURL());
            st = con.prepareStatement("UPDATE bankum_tundinastingkat SET Keterangan = '" +
                    ket + "' WHERE idR = " +
                    id + ";");
            if(st.executeUpdate() > 0){
                //update berhasil, do something
                JOptionPane.showMessageDialog(null,"Berhasil disimpan."); 
            }else{
                JOptionPane.showMessageDialog(null,("Gagal!"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Gagal");                
        }   finally {
                try { rs.close(); } catch (Exception e) { /* ignored */ }
                try { st.close(); } catch (Exception e) { /* ignored */ }
                try { con.close(); } catch (Exception e) { /* ignored */ }
        }
    }
    
    public void deleteDataDB(long id){
        try{
            con = DriverManager.getConnection(db.getURL());
            st = con.prepareStatement("DELETE FROM bankum_tundinastingkat WHERE idR = " +
                    id + "");
            if(st.executeUpdate() > 0){
                //do something
            }else{
                JOptionPane.showMessageDialog(null,("Gagal!"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Gagal");                
        }   finally {
                try { rs.close(); } catch (Exception e) { /* ignored */ }
                try { st.close(); } catch (Exception e) { /* ignored */ }
                try { con.close(); } catch (Exception e) { /* ignored */ }
        }
    }
    
}