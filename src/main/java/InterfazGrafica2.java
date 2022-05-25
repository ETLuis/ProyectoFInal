import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class InterfazGrafica2 extends javax.swing.JFrame {

    public InterfazGrafica2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Introduce una letra");
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 17));
        jLabel1.setMinimumSize(new java.awt.Dimension(200, 17));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, 38));

        jTextField1.setMargin(new java.awt.Insets(0, 47, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 250, 104, 70));

        jButton1.setBackground(new java.awt.Color(255, 174, 0));
        jButton1.setText("Comprobar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 256, 157, 60));

        jTextField2.setMargin(new java.awt.Insets(0, 95, 0, 0));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 263, 101));

        jButton2.setBackground(new java.awt.Color(25, 233, 228));
        jButton2.setText("Escribir Palabra");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 147, 39));

        jTextField3.setEnabled(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, 124, 50));

        jButton3.setBackground(new java.awt.Color(13, 113, 254));
        jButton3.setText("Generar Palabra");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 202, 157, 42));

        jButton4.setBackground(new java.awt.Color(254, 1, 181));
        jButton4.setText("Menú Principal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 154, 70));

        jButton5.setBackground(new java.awt.Color(251, 255, 0));
        jButton5.setText("Comprobar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 590, -1, -1));

        jLabel2.setText("Fallos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 42, -1, -1));

        jLabel3.setText("0");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 42, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0Fallos.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(81, 78));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1Fallo.png"))); // NOI18N
        jLabel5.setVisible(false);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 260, 90, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2Fallos.png"))); // NOI18N
        jLabel6.setVisible(false);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3Fallos.png"))); // NOI18N
        jLabel7.setVisible(false);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4Fallos.png"))); // NOI18N
        jLabel8.setVisible(false);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    List<Character> jugadores = new ArrayList<>();
    String palabraJuego="";




    public static boolean letra(String palabraJuego, List<Character> jugadores){
        String letra;

        letra = jTextField1.getText();

        jugadores.add(letra.charAt(0));

        InterfazGrafica2.verPalabras(palabraJuego, jugadores);

        return palabraJuego.contains(letra);
    }

    public static boolean verPalabras(String palabraJuego, List<Character> jugadores){
        String concatena = "";
        int correctas = 0;

        for (int i = 0; i < palabraJuego.length(); i++) {
            if (jugadores.contains(palabraJuego.charAt(i))) {
                concatena = concatena + palabraJuego.charAt(i);
                correctas++;
            } else {
                concatena = concatena + " - ";
            }
            jTextField2.setText(concatena);
        }

        return (palabraJuego.length() == correctas);
    }


    public static void repeticionPalabra(String palabraJuego, List<Character> jugadores){

        List<String> palabras = Arrays.asList("camion", "toro", "perro", "hawaii");
        Random rand = new Random();
        palabraJuego = palabras.get(rand.nextInt(palabras.size()));
        System.out.println(palabraJuego);

    }


    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:s
        InterfazGrafica2.letra(palabraJuego, jugadores);



    }

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {

        if (jTextField1.getText().length() >= 1) {

            evt.consume();
        }

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        InterfazGrafica2.letra(palabraJuego, jugadores);

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        jTextField3.enable();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        List<String> palabras = Arrays.asList("camion", "toro", "perro", "hawaii");
        Random rand = new Random();
        palabraJuego = palabras.get(rand.nextInt(palabras.size()));
        System.out.println(palabraJuego);

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        InterfazGrafica2 obx=new InterfazGrafica2();
        obx.setVisible(false);



    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }


    int intentos=0;
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String palabraComprob=jTextField3.getText();


        if(palabraComprob.equals(palabraJuego)){
            JOptionPane.showMessageDialog(null,"Palabra correcta");
        }
        else{
            JOptionPane.showMessageDialog(null,"Palabra incorrecta");
            intentos++;
            String i=String.valueOf(intentos);

            jLabel3.setText(i);

            if(intentos==1){
                jLabel4.setVisible(false);
                jLabel5.setVisible(true);
            }else{
                jLabel5.setVisible(false);
            }

            if(intentos==2){
                jLabel6.setVisible(true);
            }else{
                jLabel6.setVisible(false);
            }

            if(intentos==3){
                jLabel7.setVisible(true);
            }else{
                jLabel7.setVisible(false);
            }

            if(intentos==4){
                jLabel8.setVisible(true);
            }else{
                jLabel8.setVisible(false);

            }

            if(intentos==5){
                JOptionPane.showMessageDialog(null, "Has perdido :(");
                jLabel3.setText(""+0);

                InterfazGrafica2.repeticionPalabra(palabraJuego, jugadores);

            }


        }

    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica2().setVisible(true);


            }
        });
    }





    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private static javax.swing.JLabel jLabel5;
    private static javax.swing.JLabel jLabel6;
    private static javax.swing.JLabel jLabel7;
    private static javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration


}
