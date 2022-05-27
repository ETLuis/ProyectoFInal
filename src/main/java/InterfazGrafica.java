import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;



public class InterfazGrafica extends javax.swing.JFrame {

    public InterfazGrafica(){
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(1000,650);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setBackground(new java.awt.Color(58, 58, 58));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(33, 251, 61));
        jButton1.setText("Ahorcado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 442, 122, 65));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ahorcadoLogo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jButton2.setBackground(new java.awt.Color(198, 16, 16));
        jButton2.setText("Saír");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 534, 167, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegoBanderas.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 165, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 255, 22));
        jButton3.setText("Banderas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 442, 131, 65));

        jButton4.setBackground(new java.awt.Color(254, 254, 254));
        jButton4.setText("Registrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 120, 40));

        jButton5.setBackground(new java.awt.Color(254, 240, 107));
        jButton5.setText("Conectar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 100, 30));

        jLabel3.setFont(new java.awt.Font("Yrsa SemiBold", 1, 15)); // NOI18N
        jLabel3.setText("ID de Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 110, -1));

        jLabel4.setFont(new java.awt.Font("Z003", 1, 15)); // NOI18N
        jLabel4.setText("XXXX");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, -1, 20));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Nombre:");
        jLabel5.setToolTipText("");
        jLabel5.setPreferredSize(new java.awt.Dimension(70, 17));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 30));

        jLabel6.setText("XXXX");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 17, -1, 20));

        pack();
    }// </editor-fold>





    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        InterfazGrafica2 obx=new InterfazGrafica2();
        obx.setVisible(true);

        InterfazGrafica obx2 =new InterfazGrafica();
        obx2.setVisible(false);


    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        System.exit(WIDTH);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        InterfazGrafica3 obx=new InterfazGrafica3();
        obx.setVisible(true);

        InterfazGrafica obx2 =new InterfazGrafica();
        obx2.setVisible(false);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        String url="jdbc:sqlite:/home/dam1/Escritorio/BaseJuego.db";
        Connection connect = null;

        int i=Integer.parseInt(JOptionPane.showInputDialog(null, "¿Quieres conectarte? \n- Pulse 1 para conectar con la Base de Datos \n- Pulse 2 para salir"));

        if(i==1){
            try{
                connect = DriverManager.getConnection(url);


                if(connect!=null){
                    JOptionPane.showMessageDialog(null, "Estás conectado");
                }
            }catch(Exception x){
                JOptionPane.showMessageDialog(null, x.getMessage().toString());
            }


            int j=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Quieres registrarte en la B.D? \n- Pulse 1 para registrarte en la Base de Datos \n- Pulse 2 si quieres borrarte de la Base de Datos? \n- Pulse 3 Para salir del menú"));

            if(j==1){
                try{

                    PreparedStatement st = connect.prepareStatement("insert into Jugador(ID,Nombre) values(?,?)");
                    int ID=Integer.parseInt(JOptionPane.showInputDialog("Introduce el ID"));
                    st.setInt(1, ID);
                    String Nombre=JOptionPane.showInputDialog("Introduce el Nombre");
                    st.setString(2,Nombre);
                    st.execute();
                    JOptionPane.showMessageDialog(null, "Datos Guardados");
                    jLabel4.setText(""+ID);
                    jLabel6.setText(Nombre);


                }catch(Exception x){
                    JOptionPane.showMessageDialog(null, x.getMessage().toString());
                }
            } else if(j==2){
                try{

                    PreparedStatement st = connect.prepareStatement("delete from Jugador where ID=?");
                    st.setInt(1, Integer.parseInt(JOptionPane.showInputDialog("Introduce tu ID para ser eliminado de la Base de Datos")));
                    st.execute();
                    JOptionPane.showMessageDialog(null, "Dato Eliminado");


                }catch(Exception x){
                    JOptionPane.showMessageDialog(null, x.getMessage().toString());
                }
            }

            else{

            }

        }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String url="jdbc:sqlite:/home/dam1/Escritorio/BaseJuego.db";
        Connection connect = null;

        int i=Integer.parseInt(JOptionPane.showInputDialog(null, "¿Quieres conectarte? \n- Pulse 1 para conectar con la Base de Datos \n- Pulse 2 para salir"));

        if(i==1){
            try{
                connect = DriverManager.getConnection(url);


                if(connect!=null){
                    JOptionPane.showMessageDialog(null, "Estás conectado");
                }
            }catch(Exception x){
                JOptionPane.showMessageDialog(null, x.getMessage().toString());
            }
        }else{

        }

        try{

            PreparedStatement st = connect.prepareStatement("select ID,Nombre from Jugador where ID=? and Nombre=?");
            int ID=Integer.parseInt(JOptionPane.showInputDialog("Introduce el ID"));
            st.setInt(1, ID);
            String Nombre=JOptionPane.showInputDialog("Introduce el Nombre");
            st.setString(2, Nombre);
            jLabel4.setText(""+ID);
            jLabel6.setText(Nombre);
            st.execute();


        }catch(Exception x){
            JOptionPane.showMessageDialog(null, x.getMessage().toString());
        }


    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }




        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });




    }

    // Variables declaration - do not modify
    private javax.swing.ButtonGroup buttonGroup1;
    private static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration
}