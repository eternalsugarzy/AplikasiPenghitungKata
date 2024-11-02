
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;




public class PenghitungKataForm extends javax.swing.JFrame {

    /**
     * Creates new form PenghitungKataForm
     */
    public PenghitungKataForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaInput = new javax.swing.JTextArea();
        btnHitung = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblJumlahKalimat = new javax.swing.JLabel();
        lblJumlahKata = new javax.swing.JLabel();
        lblJumlahKarakter = new javax.swing.JLabel();
        txtCariKata = new javax.swing.JTextField();
        btnCariKata = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        lblJumlahParagraf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Penghitung Kata", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        txtAreaInput.setColumns(20);
        txtAreaInput.setRows(5);
        jScrollPane1.setViewportView(txtAreaInput);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(14, 14, 14, 14);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(14, 14, 14, 14);
        jPanel1.add(btnHitung, gridBagConstraints);

        jLabel1.setText("Masukan Teks ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.insets = new java.awt.Insets(14, 14, 14, 16);
        jPanel1.add(jLabel1, gridBagConstraints);

        lblJumlahKalimat.setText("Jumlah Kalimat:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(14, 14, 14, 14);
        jPanel1.add(lblJumlahKalimat, gridBagConstraints);

        lblJumlahKata.setText("Jumlah Kata:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(14, 14, 14, 14);
        jPanel1.add(lblJumlahKata, gridBagConstraints);

        lblJumlahKarakter.setText("Jumlah Karakter:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(14, 14, 14, 14);
        jPanel1.add(lblJumlahKarakter, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(14, 14, 14, 14);
        jPanel1.add(txtCariKata, gridBagConstraints);

        btnCariKata.setText("Cari Kata");
        btnCariKata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariKataActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(14, 14, 14, 14);
        jPanel1.add(btnCariKata, gridBagConstraints);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(14, 14, 14, 14);
        jPanel1.add(btnSimpan, gridBagConstraints);

        lblJumlahParagraf.setText("Jumlah Paragraf:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(14, 14, 14, 14);
        jPanel1.add(lblJumlahParagraf, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        String teks = txtAreaInput.getText();

        int jumlahKarakter = teks.length();
        int jumlahKata = teks.trim().isEmpty() ? 0 : teks.trim().split("\\s+").length;
        int jumlahKalimat = teks.split("[.!?]+").length;
        int jumlahParagraf = teks.split("\n+").length;

        lblJumlahKarakter.setText("Jumlah Karakter: " + jumlahKarakter);
        lblJumlahKata.setText("Jumlah Kata: " + jumlahKata);
        lblJumlahKalimat.setText("Jumlah Kalimat: " + jumlahKalimat);
        lblJumlahParagraf.setText("Jumlah Paragraf: " + jumlahParagraf);
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnCariKataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariKataActionPerformed
        String teks = txtAreaInput.getText();
        String kataCari = txtCariKata.getText();
    
        int jumlahKataDitemukan = teks.split("(?i)\\b" + kataCari + "\\b").length - 1;
    
        JOptionPane.showMessageDialog(this, "Jumlah kemunculan kata '" + kataCari + "': " + jumlahKataDitemukan);
    }//GEN-LAST:event_btnCariKataActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
            
            try (PrintWriter writer = new PrintWriter(file)) {
                writer.println("Teks:");
                writer.println(txtAreaInput.getText());
                writer.println();
                writer.println("Hasil Perhitungan:");
                writer.println("Jumlah Karakter: " + lblJumlahKarakter.getText());
                writer.println("Jumlah Kata: " + lblJumlahKata.getText());
                writer.println("Jumlah Kalimat: " + lblJumlahKalimat.getText());
                writer.println("Jumlah Paragraf: " + lblJumlahParagraf.getText());
                writer.flush();
            }   
            
                JOptionPane.showMessageDialog(this, "Hasil perhitungan berhasil disimpan.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan file.");
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(PenghitungKataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungKataForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariKata;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJumlahKalimat;
    private javax.swing.JLabel lblJumlahKarakter;
    private javax.swing.JLabel lblJumlahKata;
    private javax.swing.JLabel lblJumlahParagraf;
    private javax.swing.JTextArea txtAreaInput;
    private javax.swing.JTextField txtCariKata;
    // End of variables declaration//GEN-END:variables
}
