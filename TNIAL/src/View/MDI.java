/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Someone
 */
public class MDI extends JFrame {

    /**
     * Creates new form MDI
     */
    private final int role;
    public MDI(int i) {
        initComponents();
        this.setVisible(true);
        
        //kalau bukan admin, fitur tambah user dihilangkan
        this.role = i;
        if (i!=0) {
            this.mFile.remove(this.NewUser);
        }
        
        this.setTitle("Nama Aplikasi");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //ketika dijalankan otomatis langsung fullscreen
        
        //shortcut
        InsertPanelHere.setVisible(false);
        JPanel pane = new Maps();//halaman awalnya menampilkan peta, jadi panel kosonyan diiisi dengan ini
        InsertPanelHere.removeAll();        
        InsertPanelHere.add(pane);
        InsertPanelHere.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InsertPanelHere = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        mFile = new javax.swing.JMenu();
        TunDinas = new javax.swing.JMenuItem();
        TunPersonel = new javax.swing.JMenuItem();
        PidanaUmum = new javax.swing.JMenuItem();
        PidanaMiliter = new javax.swing.JMenuItem();
        PerdataPersonel = new javax.swing.JMenuItem();
        NewUser = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        mReport = new javax.swing.JMenu();
        TUNDINAS = new javax.swing.JMenu();
        PerTriwulan = new javax.swing.JMenuItem();
        PerTanggal = new javax.swing.JMenuItem();
        PerKasus = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));

        InsertPanelHere.setMinimumSize(new java.awt.Dimension(0, 0));
        InsertPanelHere.setPreferredSize(new java.awt.Dimension(600, 450));
        InsertPanelHere.setLayout(new java.awt.CardLayout());

        jMenuBar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        mFile.setText("File");

        TunDinas.setText("Perkara TUN Dinas");
        TunDinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TunDinasActionPerformed(evt);
            }
        });
        mFile.add(TunDinas);

        TunPersonel.setText("Perkara TUN Personel");
        TunPersonel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TunPersonelActionPerformed(evt);
            }
        });
        mFile.add(TunPersonel);

        PidanaUmum.setText("Perkara Pidana Umum");
        PidanaUmum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PidanaUmumActionPerformed(evt);
            }
        });
        mFile.add(PidanaUmum);

        PidanaMiliter.setText("Perkara Pidana Militer");
        PidanaMiliter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PidanaMiliterActionPerformed(evt);
            }
        });
        mFile.add(PidanaMiliter);

        PerdataPersonel.setText("Perkara Perdata Personel");
        PerdataPersonel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerdataPersonelActionPerformed(evt);
            }
        });
        mFile.add(PerdataPersonel);

        NewUser.setText("Buat User Baru");
        NewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUserActionPerformed(evt);
            }
        });
        mFile.add(NewUser);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        mFile.add(Exit);

        jMenuBar.add(mFile);

        mReport.setText("Report");

        TUNDINAS.setText("TUNDINAS");

        PerTriwulan.setText("Per Triwulan");
        PerTriwulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerTriwulanActionPerformed(evt);
            }
        });
        TUNDINAS.add(PerTriwulan);

        PerTanggal.setText("Per Tanggal");
        TUNDINAS.add(PerTanggal);

        PerKasus.setText("Per Kasus");
        TUNDINAS.add(PerKasus);

        mReport.add(TUNDINAS);

        jMenuBar.add(mReport);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InsertPanelHere, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InsertPanelHere, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TunDinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TunDinasActionPerformed
        // TODO add your handling code here:
        InsertPanelHere.setVisible(false);
        JPanel pane = new PanelTunDinas(this.role);//ganti panel kosongnya dengan panel ini
        InsertPanelHere.removeAll();        
        InsertPanelHere.add(pane);
        InsertPanelHere.setVisible(true);
    }//GEN-LAST:event_TunDinasActionPerformed

    private void TunPersonelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TunPersonelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TunPersonelActionPerformed

    private void PidanaUmumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PidanaUmumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PidanaUmumActionPerformed

    private void PidanaMiliterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PidanaMiliterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PidanaMiliterActionPerformed

    private void PerdataPersonelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerdataPersonelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PerdataPersonelActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void PerTriwulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerTriwulanActionPerformed
        // TODO add your handling code here:
        //munculkan form baru untuk memilih report
        new ReportTunDinasTriwulan();
    }//GEN-LAST:event_PerTriwulanActionPerformed

    private void NewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewUserActionPerformed
        // TODO add your handling code here:
        //tampilkan form untuk nmbah user
        new FormUserBaru();
    }//GEN-LAST:event_NewUserActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JPanel InsertPanelHere;
    private javax.swing.JMenuItem NewUser;
    private javax.swing.JMenuItem PerKasus;
    private javax.swing.JMenuItem PerTanggal;
    private javax.swing.JMenuItem PerTriwulan;
    private javax.swing.JMenuItem PerdataPersonel;
    private javax.swing.JMenuItem PidanaMiliter;
    private javax.swing.JMenuItem PidanaUmum;
    private javax.swing.JMenu TUNDINAS;
    private javax.swing.JMenuItem TunDinas;
    private javax.swing.JMenuItem TunPersonel;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu mFile;
    private javax.swing.JMenu mReport;
    // End of variables declaration//GEN-END:variables
}

