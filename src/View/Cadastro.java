package View;

import Controller.PController;
import Model.Pessoa;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Cadastro extends javax.swing.JFrame {
public Cadastro() {
        initComponents();
        getContentPane().setBackground(new Color(0, 81,211));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics t){

                ImageIcon im = new ImageIcon("TLP1.png.png");
                Image i =im.getImage();

                t.drawImage(i,0,0, this);
            }}
            ;
            jLabel6 = new javax.swing.JLabel();
            tfEmail = new javax.swing.JTextField();
            jLabel7 = new javax.swing.JLabel();
            tfSenha = new javax.swing.JTextField();
            jLabel8 = new javax.swing.JLabel();
            cbSex = new javax.swing.JComboBox<>();
            jLabel9 = new javax.swing.JLabel();
            tfCpf = new javax.swing.JTextField();
            cbDDD = new javax.swing.JComboBox<>();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            tfNomeP = new javax.swing.JTextField();
            jRadioButton1 = new javax.swing.JRadioButton();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            BCadastrar = new javax.swing.JButton();
            tfTele = new javax.swing.JTextField();
            jLabel11 = new javax.swing.JLabel();
            tfDataN = new javax.swing.JTextField();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setBackground(new java.awt.Color(0, 81, 211));

            jLabel6.setForeground(new java.awt.Color(255, 255, 255));
            jLabel6.setText("EMAIL:");

            jLabel7.setForeground(new java.awt.Color(255, 255, 255));
            jLabel7.setText("SENHA:");

            jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(255, 255, 51));
            jLabel8.setText("CRIAR NOVA CONTA");

            cbSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha o sexo:","Feminino", "Maculino" }));

            jLabel9.setForeground(new java.awt.Color(255, 255, 255));
            jLabel9.setText("CPF:");

            cbDDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DDD: ","11", "12", "13", "14", "15", "16"," 17", "18" , "19", "21", "22"," 24",
                "27","28", "31", "32", "33", "34", "35", "37" , "38", "41", "42", "43", "44", "45", "46","51", "53", "54" , "55", "61", "62", "63", "64","65", "66", "67", "68", "69",
                "71", "73", "74", "75", "77", "79", "81", "82" , "83"," 84", "85", "86", "87", "88", "89", "91", "92", "93", "94", "95", "95", "96", "97", "98", "99"}));
    cbDDD.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cbDDDActionPerformed(evt);
        }
    });

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("SEJA MEMBRO DO MUNDO GREMISTA");

    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("NOME COMPLETO:");

    jRadioButton1.setBackground(new java.awt.Color(0, 81, 211));
    jRadioButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
    jRadioButton1.setText("Sou Estrangeiro");

    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("DATA DE NASCIMENTO");

    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("SEXO:");

    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    jLabel5.setText("CELULAR:");

    BCadastrar.setText("CADASTRAR");
    BCadastrar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            BCadastrarActionPerformed(evt);
        }
    });

    tfTele.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tfTeleActionPerformed(evt);
        }
    });

    jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/gremio_punk111.jpg"))); // NOI18N

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap(89, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addGap(18, 18, 18)
            .addComponent(jLabel11)
            .addGap(39, 39, 39))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(91, 91, 91)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(tfDataN)
                .addComponent(tfCpf)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(jRadioButton1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(tfNomeP)
                        .addComponent(tfEmail)
                        .addComponent(tfSenha)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(BCadastrar)
                            .addGap(129, 129, 129))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(170, 170, 170)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(tfTele, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)))
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(41, 41, 41)
            .addComponent(jLabel2)
            .addGap(2, 2, 2)
            .addComponent(tfNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jRadioButton1)
            .addGap(18, 18, 18)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(tfDataN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel9)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(29, 29, 29)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cbDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(26, 26, 26)
            .addComponent(jLabel6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(27, 27, 27)
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(32, 32, 32)
            .addComponent(BCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(85, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTeleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTeleActionPerformed

    private void cbDDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDDDActionPerformed

    private void BCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastrarActionPerformed
    PController p = new PController();
    Pessoa ps = new Pessoa();   
    
    //public PController(String Nome, String Email, String Date, String CPF,String sexo,String DDD, String Telefone, String Senha )
     //////
    ps = p.cadastraPessoa(tfNomeP.getText(),tfEmail.getText(),tfDataN.getText() ,tfCpf.getText(),cbSex.getSelectedItem().toString(), cbDDD.getSelectedIndex().toString(),tfTele.getText(),tfSenha.getText());
    JOptionPane.showMessageDialog(null,"Cadastrado Com Sucesso !!!");
    dispose();
           
    }//GEN-LAST:event_BCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCadastrar;
    private javax.swing.JComboBox<String> cbDDD;
    private javax.swing.JComboBox<String> cbSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfDataN;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNomeP;
    private javax.swing.JTextField tfSenha;
    private javax.swing.JTextField tfTele;
    // End of variables declaration//GEN-END:variables
}
