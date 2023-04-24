package com.mycompany.app.posyandu;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import org.bson.Document;
import org.bson.conversions.Bson;

public class UpdateForm extends javax.swing.JFrame {

    public UpdateForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        TxtThnPosyandu = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        TxtTglLahir = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        TxtBlnLahir = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        TxtThnLahir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtNamaOrtu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        TxtNamaAnak = new javax.swing.JTextField();
        ComboBoxKb = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        TxtTglPosyandu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtBeratLahir = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtBeratSkrg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtTinggiSkrg = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TxtRt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TxtLLengan = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TxtNikAyah = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TxtLKepala = new javax.swing.JTextField();
        TxtRw = new javax.swing.JTextField();
        TxtBlnPosyandu = new javax.swing.JComboBox<>();
        TxtAkte = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        RBtnTdkAda = new javax.swing.JRadioButton();
        RBtnAda = new javax.swing.JRadioButton();
        TxtBpjs = new javax.swing.JTextField();
        BtnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel23.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel23.setText("Bulan");

        jLabel24.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel24.setText("/");

        jLabel25.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel25.setText("/");

        jLabel26.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel26.setText("Tahun");

        TxtThnPosyandu.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtThnPosyandu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtThnPosyanduActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel27.setText("Tanggal Lahir");

        TxtTglLahir.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtTglLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTglLahirActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel28.setText("/");

        jLabel29.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel29.setText("Bulan");

        TxtBlnLahir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        TxtBlnLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBlnLahirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel2.setText("Tanggal Posyandu");

        jLabel30.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel30.setText("/");

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel3.setText("RT");

        jLabel31.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel31.setText("Tahun");

        TxtThnLahir.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtThnLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtThnLahirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel4.setText("RW");

        TxtNamaOrtu.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtNamaOrtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaOrtuActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel5.setText("Nama Anak");

        jLabel32.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel32.setText("Nama Orang Tua");

        TxtNamaAnak.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtNamaAnak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaAnakActionPerformed(evt);
            }
        });

        ComboBoxKb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tidak KB", "Pil", "Suntik", "Implant", "IUD" }));
        ComboBoxKb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxKbActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel7.setText("KB");

        TxtTglPosyandu.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtTglPosyandu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTglPosyanduActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel8.setText("Berat Lahir");

        TxtBeratLahir.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtBeratLahir.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtBeratLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBeratLahirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Data Posyandu");

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel9.setText("Kg");

        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel10.setText("Berat Sekarang");

        TxtBeratSkrg.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtBeratSkrg.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtBeratSkrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBeratSkrgActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel11.setText("Kg");

        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel12.setText("Tinggi Sekarang");

        TxtTinggiSkrg.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtTinggiSkrg.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtTinggiSkrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTinggiSkrgActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel13.setText("Cm");

        jLabel14.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel14.setText("L. Kepala");

        TxtRt.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtRt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtRt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRtActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel15.setText("Cm");

        jLabel16.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel16.setText("L. Lengan");

        TxtLLengan.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtLLengan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtLLengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLLenganActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel17.setText("Cm");

        jLabel18.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel18.setText("/");

        jLabel19.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel19.setText("/");

        TxtNikAyah.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtNikAyah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNikAyahActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel20.setText("NIK Ayah");

        TxtLKepala.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtLKepala.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtLKepala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLKepalaActionPerformed(evt);
            }
        });

        TxtRw.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtRw.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtRw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRwActionPerformed(evt);
            }
        });

        TxtBlnPosyandu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        TxtBlnPosyandu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBlnPosyanduActionPerformed(evt);
            }
        });

        TxtAkte.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtAkte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAkteActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel21.setText("Akte");

        jLabel22.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel22.setText("BPJS");

        buttonGroup1.add(RBtnTdkAda);
        RBtnTdkAda.setText("Tidak Ada");
        RBtnTdkAda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnTdkAdaActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBtnAda);
        RBtnAda.setText("Ada");
        RBtnAda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBtnAdaMouseClicked(evt);
            }
        });
        RBtnAda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnAdaActionPerformed(evt);
            }
        });

        TxtBpjs.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        TxtBpjs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBpjsActionPerformed(evt);
            }
        });

        BtnSubmit.setText("Submit");
        BtnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSubmitMouseClicked(evt);
            }
        });
        BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtRw, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtBlnLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TxtThnLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNamaAnak))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBack))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtRt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TxtTglPosyandu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtBlnPosyandu, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtThnPosyandu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNamaOrtu))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtTinggiSkrg, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtBeratSkrg, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtLKepala, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtLLengan, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtBeratLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtAkte))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtNikAyah, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboBoxKb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(TxtBpjs, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBtnTdkAda, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RBtnAda, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtTglPosyandu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtBlnPosyandu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25)
                    .addComponent(TxtThnPosyandu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtRt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel18)
                    .addComponent(TxtRw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(TxtNamaAnak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(TxtTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtBlnLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(TxtThnLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNamaOrtu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ComboBoxKb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBeratLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBeratSkrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTinggiSkrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(TxtLLengan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(TxtLKepala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNikAyah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAkte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(RBtnTdkAda)
                    .addComponent(RBtnAda))
                .addGap(11, 11, 11)
                .addComponent(TxtBpjs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnSubmit)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getTxtTglPosyandu() {
        return TxtTglPosyandu;
    }
    
    public JTextField getTxtTglLahir() {
        return TxtTglLahir;
    }
    
    public JComboBox getBlnLahir() {
        return TxtBlnLahir;
    }
    
    public JTextField getTxtThnLahir() {
        return TxtThnLahir;
    }

    public JTextField getTxtNamaAnak() {
        return TxtNamaAnak;
    }
    
    public JTextField getTxtOrangTua() {
        return TxtNamaOrtu;
    }
    
    public JTextField getRt() {
        return TxtRt;
    }
    
    public JTextField getRw() {
        return TxtRw;
    }
    
    public JComboBox getKb() {
        return ComboBoxKb;
    }
    
    public JTextField getBeratLahir() {
        return TxtBeratLahir;
    }
    
    public JTextField getNikAyah() {
        return TxtNikAyah;
    }
    
    public JTextField getAkte() {
        return TxtAkte;
    }
    
    public ButtonGroup getStatusBpjs() {
        return buttonGroup1;
    }
    
    public JRadioButton getBtnTdkAda(){
        return RBtnTdkAda;
    }
    
    public JRadioButton getBtnAda(){
        return RBtnAda;
    }
    
    public JTextField getNoBpjs(){
        return TxtBpjs;
    }
    
    
    private void TxtThnPosyanduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtThnPosyanduActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtThnPosyanduActionPerformed

    private void TxtTglLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTglLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTglLahirActionPerformed

    private void TxtBlnLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBlnLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBlnLahirActionPerformed

    private void TxtThnLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtThnLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtThnLahirActionPerformed

    private void TxtNamaOrtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaOrtuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNamaOrtuActionPerformed

    private void TxtNamaAnakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaAnakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNamaAnakActionPerformed

    private void ComboBoxKbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxKbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxKbActionPerformed

    private void TxtTglPosyanduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTglPosyanduActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTglPosyanduActionPerformed

    private void TxtBeratLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBeratLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBeratLahirActionPerformed

    private void TxtBeratSkrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBeratSkrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBeratSkrgActionPerformed

    private void TxtTinggiSkrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTinggiSkrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTinggiSkrgActionPerformed

    private void TxtRtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRtActionPerformed

    private void TxtLLenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLLenganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLLenganActionPerformed

    private void TxtNikAyahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNikAyahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNikAyahActionPerformed

    private void TxtLKepalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLKepalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLKepalaActionPerformed

    private void TxtRwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRwActionPerformed

    private void TxtBlnPosyanduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBlnPosyanduActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBlnPosyanduActionPerformed

    private void TxtAkteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAkteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAkteActionPerformed

    private void RBtnTdkAdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnTdkAdaActionPerformed
        // TODO add your handling code here:
        if (RBtnTdkAda.isSelected()) {
            TxtBpjs.hide();
        }
    }//GEN-LAST:event_RBtnTdkAdaActionPerformed

    private void RBtnAdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBtnAdaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RBtnAdaMouseClicked

    private void RBtnAdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnAdaActionPerformed
        // TODO add your handling code here:
        if (RBtnAda.isSelected()) {
            TxtBpjs.show();
        }
    }//GEN-LAST:event_RBtnAdaActionPerformed

    private void TxtBpjsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBpjsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBpjsActionPerformed

    private void BtnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSubmitMouseClicked
        MongoClient mongoClient = MongoClients.create("mongodb+srv://daffaraihandika:daffa170203@cluster0.trpaarr.mongodb.net/?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("aplikasi_posyandu");
        MongoCollection<Document> collection = database.getCollection("dataPosyandu");
        
        String getNamaAnak = TxtNamaAnak.getText();
        String getAkte = TxtAkte.getText();
        String getBlnPos = (String) TxtBlnPosyandu.getSelectedItem();
        
        // yang harus di update
        String beratSkrg = TxtBeratSkrg.getText();
        String tinggiSkrg = TxtTinggiSkrg.getText();
        String lingkarKepala = TxtLKepala.getText();
        String lingkarLengan = TxtLLengan.getText();
        
        double parseBeratSkrg, parseTinggiSkrg, parseLingkarKepala, parseLingkarLengan;
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        parseBeratSkrg = Double.parseDouble(beratSkrg);
        String formattedBeratSkrg = df.format(parseBeratSkrg);
        parseBeratSkrg = Double.parseDouble(formattedBeratSkrg);

        parseTinggiSkrg = Double.parseDouble(tinggiSkrg);
        String formattedTinggiSkrg = df.format(parseTinggiSkrg);
        parseTinggiSkrg = Double.parseDouble(formattedTinggiSkrg);

        parseLingkarKepala = Double.parseDouble(lingkarKepala);
        String formattedLingkarKepala = df.format(parseLingkarKepala);
        parseLingkarKepala = Double.parseDouble(formattedLingkarKepala);

        parseLingkarLengan = Double.parseDouble(lingkarLengan);
        String formattedLingkarLengan = df.format(parseLingkarLengan);
        parseLingkarLengan = Double.parseDouble(formattedLingkarLengan);
        
        Bson filter1 = Filters.eq("namaAnak", getNamaAnak);
        Bson filter2 = Filters.eq("akte", getAkte);
        Bson combinedFilter = Filters.and(filter1, filter2);
        Bson update = Updates.set("bulan." + getBlnPos, new Document("beratSekarang", parseBeratSkrg)
                                                              .append("tinggiSekarang", parseTinggiSkrg)
                                                              .append("lingkarKepala", parseLingkarKepala)
                                                              .append("lingkarLengan", parseLingkarLengan)
        );
        UpdateResult result = collection.updateOne(combinedFilter, update);
        
        System.out.println("Jumlah data yang terupdate: " + result.getModifiedCount());
    }//GEN-LAST:event_BtnSubmitMouseClicked

    private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSubmitActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        Search search = new Search();
        search.setVisible(true);
        dispose();
        search.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSubmit;
    private javax.swing.JComboBox<String> ComboBoxKb;
    private javax.swing.JRadioButton RBtnAda;
    private javax.swing.JRadioButton RBtnTdkAda;
    private javax.swing.JTextField TxtAkte;
    private javax.swing.JTextField TxtBeratLahir;
    private javax.swing.JTextField TxtBeratSkrg;
    private javax.swing.JComboBox<String> TxtBlnLahir;
    private javax.swing.JComboBox<String> TxtBlnPosyandu;
    private javax.swing.JTextField TxtBpjs;
    private javax.swing.JTextField TxtLKepala;
    private javax.swing.JTextField TxtLLengan;
    private javax.swing.JTextField TxtNamaAnak;
    private javax.swing.JTextField TxtNamaOrtu;
    private javax.swing.JTextField TxtNikAyah;
    private javax.swing.JTextField TxtRt;
    private javax.swing.JTextField TxtRw;
    private javax.swing.JTextField TxtTglLahir;
    private javax.swing.JTextField TxtTglPosyandu;
    private javax.swing.JTextField TxtThnLahir;
    private javax.swing.JTextField TxtThnPosyandu;
    private javax.swing.JTextField TxtTinggiSkrg;
    private javax.swing.JButton btnBack;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
