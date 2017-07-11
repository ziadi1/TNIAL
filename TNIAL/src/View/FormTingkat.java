/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControlTunDinasDataTingkat;
import Model.BankumJnsTingkat;
import Model.BankumStatus;
import Model.BankumStatusTingkat;
import Model.TunDinasTingkat;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author aldebaran
 */
public class FormTingkat extends javax.swing.JFrame {

    /**
     * Creates new form FormTingkat
     */
    public FormTingkat() {
        initComponents();
        this.idTunDinas = null;
    }
            
    FormTingkat(String lokasi, String masalah, String idTunDinas){
        initComponents();
        
        this.idTunDinas = idTunDinas;
        
        String[] lokasinya = lokasi.split("\n");
        String[] masalahnya = masalah.split("\n");
        
        String lokasihtml = "<html>";        
        for(String s: lokasinya){
            lokasihtml += s + "<br />";
        }lokasihtml += "</html>";
        
        String masalahhtml = "<html>";        
        for(String s: masalahnya){
            masalahhtml += s + "<br />";
        }masalahhtml += "</html>";
        
        labelLokasi.setText(lokasihtml);
        labelMasalah.setText(masalahhtml);
                
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setTitle("Tun Dinas - Form Tingkat");
        
        control = new ControlTunDinasDataTingkat();
        
        setIsiTable();
                
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        this.setVisible(true);
        
        //onclick event        
        tableTingkatnyaw.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tableTingkatnyaw.rowAtPoint(evt.getPoint());
                int col = tableTingkatnyaw.columnAtPoint(evt.getPoint());
//                if (col < 4) {                    
                        FormProsesTingkat form = new FormProsesTingkat(
                                data.get(row).getIdR(),
                                data.get(row).getKdTIngkat(),
                                data.get(row).getidStatus(),
                                data.get(row).getKetStatus()
                        );
                        
                        form.addWindowListener(new WindowAdapter() {
                                @Override 
                                public void windowClosed(WindowEvent e) {
                                    setIsiTable();
                                }
                            }
                        );
                        
                        form.setVisible(true);                    
//                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelLokasi = new javax.swing.JLabel();
        labelMasalah = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btAddTingkat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTingkatnyaw = new javax.swing.JTable();
        btBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("TUN DINAS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Data Tingkat");

        jLabel3.setText("Lokasi dan Data Tanah");

        jLabel4.setText("Permasalahan");

        labelLokasi.setText("jLabel5");

        labelMasalah.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelMasalah))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelLokasi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelLokasi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelMasalah))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btAddTingkat.setText("Tambah Tingkat");
        btAddTingkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddTingkatActionPerformed(evt);
            }
        });

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 80));

        tableTingkatnyaw.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Tingkat", "Status", "Keterangan", ""
            }
        ));
        jScrollPane1.setViewportView(tableTingkatnyaw);

        btBack.setText("Kembali");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAddTingkat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btBack, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btAddTingkat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBack)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btBackActionPerformed

    private void btAddTingkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddTingkatActionPerformed
        // TODO add your handling code here:
        FormTambahTingkat tambahTingkat = new FormTambahTingkat(
                idTunDinas
        );
        tambahTingkat.setVisible(true);
        tambahTingkat.addWindowListener(new WindowAdapter() {
                @Override 
                public void windowClosed(WindowEvent e) {
                    setIsiTable();
                }
            }
        );
    }//GEN-LAST:event_btAddTingkatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddTingkat;
    private javax.swing.JButton btBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelLokasi;
    private javax.swing.JLabel labelMasalah;
    private javax.swing.JTable tableTingkatnyaw;
    // End of variables declaration//GEN-END:variables

    ControlTunDinasDataTingkat control;
    ArrayList<TunDinasTingkat> data = new ArrayList<>();
    private final String idTunDinas;
    
    //button in cell
    
    class ClientsTableButtonRenderer extends JButton implements TableCellRenderer{
    public ClientsTableButtonRenderer(){
        setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        setBackground( table.getBackground() );
        setForeground(Color.black);
        setBackground(UIManager.getColor("Button.background"));
        setText((value == null) ? "" : value.toString());
        return this;
    }
}

    public class ClientsTableRenderer extends DefaultCellEditor{
        private JButton button;
        private String label;
        private boolean clicked;
        private int row, col;
        private JTable table;

        public ClientsTableRenderer(JCheckBox checkBox){
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    fireEditingStopped();
                }
            });
        }

        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column){
            this.table = table;
            this.row = row;
            this.col = column;

            button.setForeground(Color.black);
            button.setBackground(UIManager.getColor("Button.background"));
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            clicked = true;
            return button;
        }

        public Object getCellEditorValue(){
            //when button is pressed gently desu
            if (clicked){

                //something happen

            }
            clicked = false;
            return new String(label);
        }

        public boolean stopCellEditing(){
            clicked = false;
            return super.stopCellEditing();
        }

        protected void fireEditingStopped(){
            super.fireEditingStopped();
        }
    }
    
    public void setIsiTable(){
        
        control.getDataDB(this.idTunDinas);
        
        data = control.getDatanya();
        
        this.n = data.size();
        
        resetTable(this.n);
        tableTingkatnyaw.setModel(resetTable);  
        
        this.thisTableProperties();
                      
        for(int i=0; i<this.n; i++){
            tableTingkatnyaw.setValueAt(i+1, i, 0);
            tableTingkatnyaw.setValueAt(data.get(i).getKdTIngkat(), i, 1);
            tableTingkatnyaw.setValueAt(data.get(i).getKetStatus(), i, 2);            
            tableTingkatnyaw.setValueAt(data.get(i).getKet(), i, 3);
            tableTingkatnyaw.setValueAt("Data", i, 4);
        }        
    }
    
    private void thisTableProperties(){        
        tableTingkatnyaw.getTableHeader().setReorderingAllowed(false);
        
        //set column width
        tableTingkatnyaw.getColumnModel().getColumn(0).setPreferredWidth(50);        
        tableTingkatnyaw.getColumnModel().getColumn(1).setPreferredWidth(100);
        tableTingkatnyaw.getColumnModel().getColumn(2).setPreferredWidth(100);
        tableTingkatnyaw.getColumnModel().getColumn(3).setPreferredWidth(200);
        tableTingkatnyaw.getColumnModel().getColumn(4).setPreferredWidth(100);
        //set button column
        tableTingkatnyaw.getColumnModel().getColumn(4).setCellRenderer(new ClientsTableButtonRenderer());
        //tableTingkatnyaw.getColumnModel().getColumn(4).setCellEditor(new ClientsTableRenderer(new JCheckBox()));
                
        //can only select one row at a time
        tableTingkatnyaw.setRowSelectionAllowed(true);
        tableTingkatnyaw.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void resetTable(int i){
        String[] header = {"No","Tingkat","Status","Keterangan",""};
        resetTable = new DefaultTableModel(null, header){
            public boolean isCellEditable(int row, int column)      //override isCellEditable
                //PRE:  row > 0, column > 0
                //POST: FCTVAL == false always
            {
                return column==4; //kolom 6 editable
            }
            
            
        };
        resetTable.setRowCount(i);        
    }
    
    private DefaultTableModel resetTable;
    private int n;
}