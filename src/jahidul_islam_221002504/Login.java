
package jahidul_islam_221002504;

import java.lang.System.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends javax.swing.JFrame {

    
    Connection dbconn = null;
    ResultSet result = null;
    PreparedStatement st = null;
    public Login() {
        initComponents();
        dbconn = DBConnection.connectDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Email_Login = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Password_Login = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        signup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel1.setText("Login Form");

        Email_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_LoginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        jLabel3.setText("Password");

        btnLogin.setBackground(new java.awt.Color(51, 51, 255));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Vrinda", 2, 14)); // NOI18N
        jLabel4.setText("I don't have an account?");

        signup.setBackground(new java.awt.Color(255, 102, 255));
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Signup");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(signup))
                                .addComponent(Email_Login)
                                .addComponent(jLabel3)
                                .addComponent(Password_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLogin))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(signup))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Email_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_LoginActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        // TODO add your handling code here:
        
        dispose();
        registration r = new registration();
        r.setTitle("Register User");
        r.setVisible(true);
        
    }//GEN-LAST:event_signupActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String email = Email_Login.getText();
        String password = String.valueOf(Password_Login.getPassword());
        
        if(email.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Email/Pass empty", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            //lg starts here
            userLogin(email, password);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email_Login;
    private javax.swing.JPasswordField Password_Login;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables

    private void userLogin(String email, String password) {

        
//        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){
            try{
//            PreparedStatement st = (PreparedStatement)
//                dbconn.prepareStatement("Select * from registration Where email = ? AND password = ?;");
//            
            String sql = "Select * from registration Where email = ? AND password = ?";
            st.setString(1, email);
            st.setString(2, password);
            
            result = st.executeQuery();
            
            
//            dbconn.close();
            if(result.next()){
                dispose();
//                Homepage r = new Homepage();
////                r.setTitle("Register User");
//                r.setVisible(true);

                new Homepage().setVisible(true);
                new Login().setVisible(false);
                System.out.println("Hello");
            }else{
                JOptionPane.showMessageDialog(this, "Email/Pass not found", "Error", JOptionPane.ERROR_MESSAGE);
            }

            }catch(SQLException ex){
//                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("Error opening HomePage: " + ex.getMessage());
            }
        }
        
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver") ;
//            
//            String url = "jdbc:MySQL://localhost:3306/accounts" ;
//            String user = "root";
//            String pass = "";
//            
//            Connection con = DriverManager.getConnection(url, user, pass) ;
//            Statement st = con.createStatement();
//            
//            String query = "Insert into registration(email, password)"
//                    + " values('"+email+"','"+password+"')";
//            
////            System.out.println(query);
//            
//            int result = st.executeUpdate(query);
////            ResultSet result = st.executeQuery();
//            con.close();
//            
//            if(result){
//                dispose();
//                Homepage home = new Homepage();
//                home.setTitle("Home Page");
//                home.setVisible(true);
//            }
//            
//            System.out.println("Succesful");
//            
//            
//        }catch(Exception e){
//            System.out.println("Error: "+e.getMessage());
//        }
        
    }
}
