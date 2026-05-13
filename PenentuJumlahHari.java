/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class PenentuJumlahHari extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PenentuJumlahHari.class.getName());

    public PenentuJumlahHari() {
        initComponents();
        jHasil.setText("Tentukan tahun dan bulan terlebih dahulu");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelJudul = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fTahun = new javax.swing.JTextField();
        jLabelTahun = new javax.swing.JLabel();
        jLabelBulan = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jHasil = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bHitung = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bSimpan = new javax.swing.JButton();
        bKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelJudul.setBackground(new java.awt.Color(255, 255, 255));
        jLabelJudul.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelJudul.setForeground(new java.awt.Color(0, 0, 0));
        jLabelJudul.setText("Aplikasi Penentu Jumlah Hari");

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        fTahun.setBackground(new java.awt.Color(255, 255, 255));
        fTahun.addActionListener(this::fTahunActionPerformed);

        jLabelTahun.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTahun.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTahun.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTahun.setText("Tahun");

        jLabelBulan.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBulan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelBulan.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBulan.setText("Bulan");

        jComboBox.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        jComboBox.addActionListener(this::jComboBoxActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTahun)
                    .addComponent(jLabelBulan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fTahun)
                    .addComponent(jComboBox, 0, 135, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTahun))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBulan)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        jHasil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jHasil.setForeground(new java.awt.Color(0, 0, 0));
        jHasil.setText("jLabel");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jHasil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jHasil)
                .addGap(17, 17, 17))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        bHitung.setBackground(new java.awt.Color(204, 255, 255));
        bHitung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bHitung.setForeground(new java.awt.Color(0, 0, 0));
        bHitung.setText("Hitung");
        bHitung.addActionListener(this::bHitungActionPerformed);

        bHapus.setBackground(new java.awt.Color(204, 255, 255));
        bHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bHapus.setForeground(new java.awt.Color(0, 0, 0));
        bHapus.setText("Hapus");
        bHapus.addActionListener(this::bHapusActionPerformed);

        bSimpan.setBackground(new java.awt.Color(204, 255, 255));
        bSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bSimpan.setForeground(new java.awt.Color(0, 0, 0));
        bSimpan.setText("Simpan");
        bSimpan.addActionListener(this::bSimpanActionPerformed);

        bKeluar.setBackground(new java.awt.Color(204, 255, 255));
        bKeluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bKeluar.setForeground(new java.awt.Color(0, 0, 0));
        bKeluar.setText("Keluar");
        bKeluar.addActionListener(this::bKeluarActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bHitung)
                .addGap(18, 18, 18)
                .addComponent(bHapus)
                .addGap(18, 18, 18)
                .addComponent(bSimpan)
                .addGap(18, 18, 18)
                .addComponent(bKeluar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bHitung)
                    .addComponent(bHapus)
                    .addComponent(bSimpan)
                    .addComponent(bKeluar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelJudul)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTahunActionPerformed
        
    }//GEN-LAST:event_fTahunActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
        if(fTahun.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Tahun Harus Diisi!");
        }else{
            try{
                int tahun = Integer.parseInt(fTahun.getText());
                String bulanPilih = jComboBox.getSelectedItem().toString();

                HitungHari hitungHari = new HitungHari();
                int jumlah = hitungHari.hitung(tahun, bulanPilih);

                jHasil.setText("Jumlah hari pada bulan " + bulanPilih + 
                               " tahun " + tahun + " adalah " + jumlah);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Input Tahun harus berupa angka!");
            }
        }
    }//GEN-LAST:event_bHitungActionPerformed

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        try(BufferedWriter out = new BufferedWriter(new FileWriter("HasilHitung.txt"))){
            out.write(jHasil.getText());
            JOptionPane.showMessageDialog(null, "Hasil berhasil disimpan ke HasilHitung.txt");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_bSimpanActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        fTahun.setText("");
        jComboBox.setSelectedIndex(0);
        jHasil.setText("Hasil akan tampil disini");
        fTahun.requestFocus();
    }//GEN-LAST:event_bHapusActionPerformed

    private void bKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bKeluarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new PenentuJumlahHari().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bHitung;
    private javax.swing.JButton bKeluar;
    private javax.swing.JButton bSimpan;
    private javax.swing.JTextField fTahun;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jHasil;
    private javax.swing.JLabel jLabelBulan;
    private javax.swing.JLabel jLabelJudul;
    private javax.swing.JLabel jLabelTahun;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
