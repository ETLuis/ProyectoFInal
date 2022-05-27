import java.util.Random;
import javax.swing.JOptionPane;

public class InterfazGrafica3 extends javax.swing.JFrame {


    public InterfazGrafica3() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(800,650);
        this.setBounds(580, 200, 870, 750);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("¿Qué bandera es esta?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 357, -1, -1));

        jTextArea1.setColumns(10);
        jTextArea1.setRows(5);
        jTextArea1.setMargin(new java.awt.Insets(60, 105, 0, 0));
        jTextArea1.setMaximumSize(new java.awt.Dimension(1000000000, 1000000000));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 280, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 195));
        jButton1.setText("Menú Principal");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 150, 60));

        jButton2.setBackground(new java.awt.Color(255, 243, 0));
        jButton2.setText("Cambiar de bandera");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 180, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Francia.jpg"))); // NOI18N
        jLabel3.setVisible(false);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/España.jpg"))); // NOI18N
        jLabel5.setVisible(false);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Italia.png"))); // NOI18N
        jLabel1.setVisible(false);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interrogante.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 300, -1));

        jButton3.setBackground(new java.awt.Color(0, 236, 255));
        jButton3.setText("Comprobar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eeuu.png"))); // NOI18N
        jLabel7.setText("a");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 300, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>






    int numeroRand;


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Random rand = new Random();
        numeroRand=rand.nextInt(4)+1;
        System.out.println(numeroRand);
        jLabel6.setVisible(false);

        if(numeroRand==1){
            jLabel5.setVisible(true);
        }else{
            jLabel5.setVisible(false);
        }
        if(numeroRand==2){
            jLabel1.setVisible(true);
        }else{
            jLabel1.setVisible(false);
        }

        if(numeroRand==3){
            jLabel3.setVisible(true);
        }else{
            jLabel3.setVisible(false);
        }
        if(numeroRand==4){
            jLabel7.setVisible(true);
        }else{
            jLabel7.setVisible(false);
        }










    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        System.out.println(numeroRand);
        if(numeroRand==1){
            String posible=jTextArea1.getText();
            String solucion="España";
            if(posible.equalsIgnoreCase(solucion)){
                JOptionPane.showMessageDialog(null, "Muy bien acertaste!!");
            }else{
                JOptionPane.showMessageDialog(null, "Fallaste, intentalo de nuevo");
            }
            jTextArea1.setText("");
        }

        if(numeroRand==2){
            String posible=jTextArea1.getText();
            String solucion="Italia";
            if(posible.equalsIgnoreCase(solucion)){
                JOptionPane.showMessageDialog(null, "Muy bien acertaste!!");
            }else{
                JOptionPane.showMessageDialog(null, "Fallaste, intentalo de nuevo");
            }
            jTextArea1.setText("");
        }

        if(numeroRand==3){
            String posible=jTextArea1.getText();
            String solucion="Francia";
            if(posible.equalsIgnoreCase(solucion)){
                JOptionPane.showMessageDialog(null, "Muy bien acertaste!!");
            }else{
                JOptionPane.showMessageDialog(null, "Fallaste, intentalo de nuevo");
            }
            jTextArea1.setText("");
        }

        if(numeroRand==4){
            String posible=jTextArea1.getText();
            String solucion="Estados Unidos";
            if(posible.equalsIgnoreCase(solucion)){
                JOptionPane.showMessageDialog(null, "Muy bien acertaste!!");
            }else{
                JOptionPane.showMessageDialog(null, "Fallaste, intentalo de nuevo");
            }
            jTextArea1.setText("");
        }
    }


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
            java.util.logging.Logger.getLogger(InterfazGrafica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration
}
