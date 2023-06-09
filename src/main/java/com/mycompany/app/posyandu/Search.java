package com.mycompany.app.posyandu;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;


public class Search extends javax.swing.JFrame {
    
    private UpdateForm form;
    
    /**
     * Creates new form Search
     */
    public Search() {
        initComponents();
        getAllData();
    }
    
    private void getAllData() {
        String getNama = TxtCariNama.getText();
        int i = 0;

        try (MongoClient mongoClient = MongoClients.create("mongodb+srv://daffaraihandika:daffa170203@cluster0.trpaarr.mongodb.net/?retryWrites=true&w=majority")) {
            MongoDatabase database = mongoClient.getDatabase("aplikasi_posyandu");
            MongoCollection<Document> collection = database.getCollection("dataPosyandu");

            Document searchQuery = new Document();
            // searchQuery.put("namaAnak", getNama);

            FindIterable<Document> cursor = collection.find(searchQuery);

            DefaultTableModel model = (DefaultTableModel) tableData.getModel();
            model.setRowCount(0); // clear the previous data from the table
            
            // mengubah alignment kolom No
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            tableData.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            
            // mengatur size dari kolom No
            tableData.getColumnModel().getColumn(0).setPreferredWidth(10);

            for (Document doc : cursor) {
                i += 1;
                String namaAnak = doc.getString("namaAnak");
                String tglLahir = doc.getString("tanggalLahir");
                String akte = doc.getString("akte");
                String namaOrangTua = doc.getString("namaOrangTua");

                model.addRow(new Object[]{i, namaAnak, tglLahir, akte, namaOrangTua});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtCariNama = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(599, 438));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 13)); // NOI18N
        jLabel1.setText("Nama Anak");

        TxtCariNama.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtCariNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCariNamaActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Nama Anak", "Tanggal Lahir", "Akte", "Nama Orang Tua"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableData);

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TxtCariNama, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtCariNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        getContentPane().add(mainPanel);
        mainPanel.setBounds(6, 0, 590, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCariNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCariNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCariNamaActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
    String getNama = TxtCariNama.getText();

        try (MongoClient mongoClient = MongoClients.create("mongodb+srv://daffaraihandika:daffa170203@cluster0.trpaarr.mongodb.net/?retryWrites=true&w=majority")) {
            MongoDatabase database = mongoClient.getDatabase("aplikasi_posyandu");
            MongoCollection<Document> collection = database.getCollection("dataPosyandu");

            Document searchQuery = new Document();
            searchQuery.put("namaAnak", getNama);

            FindIterable<Document> cursor = collection.find(searchQuery);

            DefaultTableModel model = new DefaultTableModel(new Object[]{"Nama Anak", "Tanggal Lahir", "Akte", "Jenis Kelamin"}, 0);

            for (Document doc : cursor) {
                String namaAnak = doc.getString("namaAnak");
                String tglLahir = doc.getString("tanggalLahir");
                String akte = doc.getString("akte");
                String jnsKelamin = doc.getString("namaOrangTua");

                model.addRow(new Object[]{namaAnak, tglLahir, akte, jnsKelamin});
            }

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan", "Pencarian Data", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JTable table = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(table);
                scrollPane.setPreferredSize(new Dimension(400, 300));
                JOptionPane.showMessageDialog(this, scrollPane, "Hasil Pencarian", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_btnSearchMouseClicked
    
    
    
    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tableData.getSelectedRow();
        String namaAnak = "", 
               akte = "", 
               tglLahir = "", 
               namaOrangTua = "",
               KB = "",
               Rt = "",
               Rw = "",
               parseBeratLahir = "",
               nikAyah = "",
               statsBpjs = "",
               noBpjs = "";
        
        String []splitTglLahir;
        
        double beratLahir;
        
        if (selectedRowIndex != -1) {
            DefaultTableModel model = (DefaultTableModel) tableData.getModel();
            namaAnak = (String) model.getValueAt(selectedRowIndex, 1); // Ambil data dari kolom 1 pada baris yang dipilih
            
            tglLahir = (String) model.getValueAt(selectedRowIndex, 2); // Ambil data dari kolom 2 pada baris yang dipilih
            splitTglLahir = tglLahir.split(" ");
            
            namaOrangTua = (String) model.getValueAt(selectedRowIndex, 4); // Ambil data dari kolom 4 pada baris yang dipilih
            akte = (String) model.getValueAt(selectedRowIndex, 3); // Ambil data dari kolom 3 pada baris yang dipilih
            
            try {
                // mengambil data dari database
                MongoClient mongoClient = MongoClients.create("mongodb+srv://daffaraihandika:daffa170203@cluster0.trpaarr.mongodb.net/?retryWrites=true&w=majority");
                MongoDatabase database = mongoClient.getDatabase("aplikasi_posyandu");
                MongoCollection<Document> collection = database.getCollection("dataPosyandu");
                Document searchQuery = new Document();
                searchQuery.put("namaAnak", namaAnak);
                searchQuery.put("akte", akte);
                FindIterable<Document> results = collection.find(searchQuery);
                
                MongoCursor<Document> cursor = results.iterator();
                while (cursor.hasNext()) {
                    Document document = cursor.next();
                    KB = document.getString("KB");
                    Rt = document.getString("RT");
                    Rw = document.getString("RW");
                    nikAyah = document.getString("NIK-Ayah");
                    
                    beratLahir = document.getDouble("beratLahir");
                    parseBeratLahir = String.valueOf(beratLahir);
                    
                    Document bpjsDoc = document.get("BPJS", Document.class);
                    statsBpjs = bpjsDoc.getString("Status");
                    
                    bpjsDoc = document.get("BPJS", Document.class);
                    noBpjs = bpjsDoc.getString("noBPJS");

                }

                // pindah ke halaman form
                form = new UpdateForm();
                form.setVisible(true);
                dispose();
                form.setLocationRelativeTo(null);
                
                // mengubah nilai pada halaman form
                JTextField txtTglLahir = form.getTxtTglLahir();
                JComboBox setBlnLahir = form.getBlnLahir();
                JTextField txtThnLahir = form.getTxtThnLahir();
                JTextField txtNamaAnak = form.getTxtNamaAnak();
                JTextField txtNamaOrtu = form.getTxtOrangTua();
                JTextField txtRt = form.getRt();
                JTextField txtRw = form.getRw();
                JComboBox setKb = form.getKb();
                JTextField txtBeratLahir = form.getBeratLahir();
                JTextField txtNikAyah = form.getNikAyah();
                JTextField txtAkte = form.getAkte();
                ButtonGroup statusBpjs = form.getStatusBpjs();
                JTextField txtBpjs = form.getNoBpjs();
                
                // set formulir sesuai data
                txtNamaAnak.setText(namaAnak);
                txtRt.setText(Rt);
                txtRw.setText(Rw);
                
                // set tanggal lahir
                txtTglLahir.setText(splitTglLahir[0]);
                setBlnLahir.setSelectedItem(splitTglLahir[1]);
                txtThnLahir.setText(splitTglLahir[2]);
                
                txtNamaOrtu.setText(namaOrangTua);
                setKb.setSelectedItem(KB);
                txtBeratLahir.setText(parseBeratLahir);
                txtNikAyah.setText(nikAyah);
                txtAkte.setText(akte);
                
                System.out.println("Stats Bpjs : " + statsBpjs);
                if(statsBpjs.equals("Tidak Ada")){
                    statusBpjs.setSelected(form.getBtnTdkAda().getModel(), true);
                }else if(statsBpjs.equals("Ada")){
                    statusBpjs.setSelected(form.getBtnAda().getModel(), true);
                    txtBpjs.setText(noBpjs);
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }

            
        }
    }//GEN-LAST:event_tableDataMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtCariNama;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables
}
