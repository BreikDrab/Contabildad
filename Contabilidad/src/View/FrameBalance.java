package View;

import javax.swing.JOptionPane;
import View.FrameBienvenida;
import View.FrameBienvenida;
import View.FrameIngresarDatosActivoPasivo;
import View.FrameIngresarDatosActivoPasivo;
import View.FrameTMayor;
import View.FrameTMayor;
public class FrameBalance extends javax.swing.JFrame {
//Aciento 1
    private static int numTxt1, numTxt2, numTxt3, numTxt4, numTxt5, numTxt6, numTxt7;
//Aciento2
    private static int acient2Txt1, acient2Txt2, acient2Txt3;
//Aciento3
    private static int acient3Txt1, acient3Txt2, acient3Txt3;
//Aciento4
    private static int acient4Txt1, acient4Txt2, acient4Txt3;
//Aciento5
    private static int acient5Txt1, acient5Txt2, acient5Txt3;
//Aciento6
    private static int acient6Txt1, acien6Txt2, acient6Txt3;
//Aciento7
    private static int acient7Txt1, acient7Txt2, acient7Txt3;
//Aciento8
    private static int acient8Txt1, acient8Txt2, acient8Txt3;
//Aciento9
    private static int acient9Txt1, acient9Txt2, acient9Txt3;
//Aciento10
    private static int acient10Txt1, acient10Txt2, acient10Txt3;

    FrameTMayor fTmayor = new FrameTMayor();
    
    public FrameBalance() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtAciento1Monto5 = new javax.swing.JTextField();
        txtAciento1Monto6 = new javax.swing.JTextField();
        txtAciento3Monto13 = new javax.swing.JTextField();
        txtAciento2Monto8 = new javax.swing.JTextField();
        txtAciento2Monto9 = new javax.swing.JTextField();
        txtAciento2Monto10 = new javax.swing.JTextField();
        txtAciento3Monto11 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtAciento5Monto19 = new javax.swing.JTextField();
        txtAciento4Monto14 = new javax.swing.JTextField();
        txtAciento4Monto15 = new javax.swing.JTextField();
        txtAciento4Monto16 = new javax.swing.JTextField();
        txtAciento5Monto17 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        txtAciento4NumeroCuenta7 = new javax.swing.JTextField();
        txtAciento4NumeroCuenta8 = new javax.swing.JTextField();
        txtAciento4NumeroCuenta9 = new javax.swing.JTextField();
        txtAciento5NumeroCuenta10 = new javax.swing.JTextField();
        txtAciento5NumeroCuenta11 = new javax.swing.JTextField();
        txtAciento5NumeroCuenta12 = new javax.swing.JTextField();
        boxActivo27 = new javax.swing.JComboBox<>();
        boxActivo26 = new javax.swing.JComboBox<>();
        txtAciento9Monto30 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        txtAciento9Monto31 = new javax.swing.JTextField();
        txtAciento8Monto26 = new javax.swing.JTextField();
        txtAciento8Monto27 = new javax.swing.JTextField();
        txtAciento8Monto29 = new javax.swing.JTextField();
        txtAciento9Monto29 = new javax.swing.JTextField();
        txt25 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();
        txt21 = new javax.swing.JTextField();
        txt22 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        txtAciento8NumeroCuenta19 = new javax.swing.JTextField();
        txtAciento8NumeroCuenta20 = new javax.swing.JTextField();
        txtAciento8NumeroCuenta21 = new javax.swing.JTextField();
        txtAciento9NumeroCuenta22 = new javax.swing.JTextField();
        txtAciento9NumeroCuenta23 = new javax.swing.JTextField();
        txtAciento9NumeroCuenta24 = new javax.swing.JTextField();
        txt23 = new javax.swing.JTextField();
        boxActivo28 = new javax.swing.JComboBox<>();
        txt24 = new javax.swing.JTextField();
        txtAciento10Monto33 = new javax.swing.JTextField();
        boxActivo25 = new javax.swing.JComboBox<>();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        txtAciento10Monto34 = new javax.swing.JTextField();
        txtAciento10Monto32 = new javax.swing.JTextField();
        txt34 = new javax.swing.JTextField();
        txt32 = new javax.swing.JTextField();
        txt33 = new javax.swing.JTextField();
        txtAciento10NumeroCuenta25 = new javax.swing.JTextField();
        boxActivo24 = new javax.swing.JComboBox<>();
        boxActivo23 = new javax.swing.JComboBox<>();
        boxActivo22 = new javax.swing.JComboBox<>();
        boxActivo21 = new javax.swing.JComboBox<>();
        boxActivo20 = new javax.swing.JComboBox<>();
        txtAciento7Monto24 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        boxActivo34 = new javax.swing.JComboBox<>();
        txtAciento7Monto25 = new javax.swing.JTextField();
        txtAciento10NumeroCuenta26 = new javax.swing.JTextField();
        btnBalanceDiarioT = new javax.swing.JButton();
        txtAciento6Monto20 = new javax.swing.JTextField();
        boxActivo33 = new javax.swing.JComboBox<>();
        btnEstadoDeResultado = new javax.swing.JButton();
        txtAciento10NumeroCuenta27 = new javax.swing.JTextField();
        boxActivo32 = new javax.swing.JComboBox<>();
        txtAciento1Monto1 = new javax.swing.JTextField();
        txtAciento1Monto2 = new javax.swing.JTextField();
        txtAciento1Monto3 = new javax.swing.JTextField();
        txtAciento1Monto7 = new javax.swing.JTextField();
        txtAciento6Monto21 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        txtAciento6Monto22 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txtAciento7Monto23 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        txt4 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        txtAciento6NumeroCuenta13 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txtAciento6NumeroCuenta14 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txtAciento6NumeroCuenta15 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtAciento7NumeroCuenta16 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAciento7NumeroCuenta17 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtAciento2NumeroCuenta1 = new javax.swing.JTextField();
        txtAciento7NumeroCuenta18 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        txt31 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt26 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt27 = new javax.swing.JTextField();
        boxActivo13 = new javax.swing.JComboBox<>();
        txt28 = new javax.swing.JTextField();
        boxActivo12 = new javax.swing.JComboBox<>();
        txt29 = new javax.swing.JTextField();
        boxActivo11 = new javax.swing.JComboBox<>();
        txt30 = new javax.swing.JTextField();
        boxActivo10 = new javax.swing.JComboBox<>();
        boxActivo31 = new javax.swing.JComboBox<>();
        boxActivo9 = new javax.swing.JComboBox<>();
        txtAciento2NumeroCuenta2 = new javax.swing.JTextField();
        boxActivo30 = new javax.swing.JComboBox<>();
        boxActivo8 = new javax.swing.JComboBox<>();
        txtAciento2NumeroCuenta3 = new javax.swing.JTextField();
        boxActivo29 = new javax.swing.JComboBox<>();
        txtAciento3NumeroCuenta4 = new javax.swing.JTextField();
        txtAciento3NumeroCuenta5 = new javax.swing.JTextField();
        txtAciento3NumeroCuenta6 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txt19 = new javax.swing.JTextField();
        txt14 = new javax.swing.JTextField();
        txt15 = new javax.swing.JTextField();
        boxActivo7 = new javax.swing.JComboBox<>();
        boxActivo6 = new javax.swing.JComboBox<>();
        boxActivo5 = new javax.swing.JComboBox<>();
        boxActivo4 = new javax.swing.JComboBox<>();
        boxAciento1 = new javax.swing.JComboBox<>();
        boxActivo2 = new javax.swing.JComboBox<>();
        boxActivo3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt16 = new javax.swing.JTextField();
        txtAciento3Monto12 = new javax.swing.JTextField();
        txt17 = new javax.swing.JTextField();
        txtAciento1Monto4 = new javax.swing.JTextField();
        txt18 = new javax.swing.JTextField();
        boxActivo19 = new javax.swing.JComboBox<>();
        boxActivo18 = new javax.swing.JComboBox<>();
        boxActivo17 = new javax.swing.JComboBox<>();
        boxActivo16 = new javax.swing.JComboBox<>();
        boxActivo15 = new javax.swing.JComboBox<>();
        boxActivo14 = new javax.swing.JComboBox<>();
        txtAciento5Monto18 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtFechaEmpresa = new javax.swing.JTextField();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        txtAciento1Monto5.setText("$");
        txtAciento1Monto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento1Monto5ActionPerformed(evt);
            }
        });

        txtAciento1Monto6.setText("$");
        txtAciento1Monto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento1Monto6ActionPerformed(evt);
            }
        });

        txtAciento3Monto13.setText("$");
        txtAciento3Monto13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento3Monto13ActionPerformed(evt);
            }
        });

        txtAciento2Monto8.setText("$");
        txtAciento2Monto8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento2Monto8ActionPerformed(evt);
            }
        });

        txtAciento2Monto9.setText("$");

        txtAciento2Monto10.setText("$");
        txtAciento2Monto10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento2Monto10ActionPerformed(evt);
            }
        });

        txtAciento3Monto11.setText("$");
        txtAciento3Monto11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento3Monto11ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Monto");

        jSeparator5.setForeground(new java.awt.Color(153, 0, 0));

        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("1");

        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("5");

        jSeparator1.setForeground(new java.awt.Color(153, 0, 0));

        txtAciento5Monto19.setText("$");
        txtAciento5Monto19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento5Monto19ActionPerformed(evt);
            }
        });

        txtAciento4Monto14.setText("$");
        txtAciento4Monto14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento4Monto14ActionPerformed(evt);
            }
        });

        txtAciento4Monto15.setText("$");

        txtAciento4Monto16.setText("$");
        txtAciento4Monto16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento4Monto16ActionPerformed(evt);
            }
        });

        txtAciento5Monto17.setText("$");
        txtAciento5Monto17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento5Monto17ActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(153, 0, 0));

        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("4");

        boxActivo27.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo27ActionPerformed(evt);
            }
        });

        boxActivo26.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo26ActionPerformed(evt);
            }
        });

        txtAciento9Monto30.setText("$");

        jSeparator7.setForeground(new java.awt.Color(153, 0, 0));

        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("9");

        txtAciento9Monto31.setText("$");
        txtAciento9Monto31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento9Monto31ActionPerformed(evt);
            }
        });

        txtAciento8Monto26.setText("$");
        txtAciento8Monto26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento8Monto26ActionPerformed(evt);
            }
        });

        txtAciento8Monto27.setText("$");

        txtAciento8Monto29.setText("$");
        txtAciento8Monto29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento8Monto29ActionPerformed(evt);
            }
        });

        txtAciento9Monto29.setText("$");
        txtAciento9Monto29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento9Monto29ActionPerformed(evt);
            }
        });

        txt25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt25ActionPerformed(evt);
            }
        });

        txt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt20ActionPerformed(evt);
            }
        });

        jSeparator8.setForeground(new java.awt.Color(153, 0, 0));

        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("8");

        boxActivo28.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo28ActionPerformed(evt);
            }
        });

        txt24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt24ActionPerformed(evt);
            }
        });

        txtAciento10Monto33.setText("$");

        boxActivo25.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo25ActionPerformed(evt);
            }
        });

        jSeparator11.setForeground(new java.awt.Color(153, 0, 0));

        jLabel20.setForeground(new java.awt.Color(153, 0, 0));
        jLabel20.setText("10");

        txtAciento10Monto34.setText("$");
        txtAciento10Monto34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento10Monto34ActionPerformed(evt);
            }
        });

        txtAciento10Monto32.setText("$");
        txtAciento10Monto32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento10Monto32ActionPerformed(evt);
            }
        });

        txt34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt34ActionPerformed(evt);
            }
        });

        txt33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt33ActionPerformed(evt);
            }
        });

        boxActivo24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo24ActionPerformed(evt);
            }
        });

        boxActivo23.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo23ActionPerformed(evt);
            }
        });

        boxActivo22.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo22ActionPerformed(evt);
            }
        });

        boxActivo21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo21ActionPerformed(evt);
            }
        });

        boxActivo20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo20ActionPerformed(evt);
            }
        });

        txtAciento7Monto24.setText("$");

        jSeparator9.setForeground(new java.awt.Color(153, 0, 0));

        jLabel18.setBackground(new java.awt.Color(153, 0, 0));
        jLabel18.setForeground(new java.awt.Color(153, 0, 0));
        jLabel18.setText("7");

        boxActivo34.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo34ActionPerformed(evt);
            }
        });

        txtAciento7Monto25.setText("$");
        txtAciento7Monto25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento7Monto25ActionPerformed(evt);
            }
        });

        btnBalanceDiarioT.setBackground(new java.awt.Color(0, 0, 0));
        btnBalanceDiarioT.setForeground(new java.awt.Color(153, 0, 0));
        btnBalanceDiarioT.setText("ACEPTAR");
        btnBalanceDiarioT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBalanceDiarioTMouseClicked(evt);
            }
        });
        btnBalanceDiarioT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceDiarioTActionPerformed(evt);
            }
        });

        txtAciento6Monto20.setText("$");
        txtAciento6Monto20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento6Monto20ActionPerformed(evt);
            }
        });

        boxActivo33.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo33ActionPerformed(evt);
            }
        });

        btnEstadoDeResultado.setBackground(new java.awt.Color(0, 0, 0));
        btnEstadoDeResultado.setForeground(new java.awt.Color(153, 0, 0));
        btnEstadoDeResultado.setText("REGRESAR");
        btnEstadoDeResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoDeResultadoActionPerformed(evt);
            }
        });

        boxActivo32.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo32ActionPerformed(evt);
            }
        });

        txtAciento1Monto1.setText("$");
        txtAciento1Monto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento1Monto1ActionPerformed(evt);
            }
        });

        txtAciento1Monto2.setText("$");
        txtAciento1Monto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento1Monto2ActionPerformed(evt);
            }
        });

        txtAciento1Monto3.setText("$");
        txtAciento1Monto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento1Monto3ActionPerformed(evt);
            }
        });

        txtAciento1Monto7.setText("$");
        txtAciento1Monto7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento1Monto7ActionPerformed(evt);
            }
        });

        txtAciento6Monto21.setText("$");

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        txtAciento6Monto22.setText("$");
        txtAciento6Monto22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento6Monto22ActionPerformed(evt);
            }
        });

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        txtAciento7Monto23.setText("$");
        txtAciento7Monto23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento7Monto23ActionPerformed(evt);
            }
        });

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        jSeparator10.setForeground(new java.awt.Color(153, 0, 0));

        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(153, 0, 0));
        jLabel19.setText("6");

        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });

        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });

        txt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt13ActionPerformed(evt);
            }
        });

        txt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt8ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("2");

        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("1");

        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("2");

        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("3");

        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("4");

        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("5");

        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("6");

        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("7");

        txt31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt31ActionPerformed(evt);
            }
        });

        txt26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt26ActionPerformed(evt);
            }
        });

        txt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt12ActionPerformed(evt);
            }
        });

        boxActivo13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo13ActionPerformed(evt);
            }
        });

        boxActivo12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo12ActionPerformed(evt);
            }
        });

        boxActivo11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo11ActionPerformed(evt);
            }
        });

        txt30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt30ActionPerformed(evt);
            }
        });

        boxActivo10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo10ActionPerformed(evt);
            }
        });

        boxActivo31.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo31ActionPerformed(evt);
            }
        });

        boxActivo9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo9ActionPerformed(evt);
            }
        });

        boxActivo30.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo30ActionPerformed(evt);
            }
        });

        boxActivo8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo8ActionPerformed(evt);
            }
        });

        boxActivo29.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo29ActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("3");

        txt19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt19ActionPerformed(evt);
            }
        });

        txt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt14ActionPerformed(evt);
            }
        });

        boxActivo7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo7ActionPerformed(evt);
            }
        });

        boxActivo6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo6ActionPerformed(evt);
            }
        });

        boxActivo5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo5ActionPerformed(evt);
            }
        });

        boxActivo4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo4ActionPerformed(evt);
            }
        });

        boxAciento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxAciento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxAciento1ActionPerformed(evt);
            }
        });

        boxActivo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo2ActionPerformed(evt);
            }
        });

        boxActivo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo3ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Tipo");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Afecta");

        txtAciento3Monto12.setText("$");

        txtAciento1Monto4.setText("$");
        txtAciento1Monto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAciento1Monto4ActionPerformed(evt);
            }
        });

        txt18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt18ActionPerformed(evt);
            }
        });

        boxActivo19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo19ActionPerformed(evt);
            }
        });

        boxActivo18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo18ActionPerformed(evt);
            }
        });

        boxActivo17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo17ActionPerformed(evt);
            }
        });

        boxActivo16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo16ActionPerformed(evt);
            }
        });

        boxActivo15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo15ActionPerformed(evt);
            }
        });

        boxActivo14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ Activo", "- Activo", "+ Pasivo", "- Pasivo" }));
        boxActivo14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActivo14ActionPerformed(evt);
            }
        });

        txtAciento5Monto18.setText("$");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 0, 0));
        jLabel21.setText("Rayado Diario");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 0, 0));
        jLabel22.setText("Empresa:");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 0, 0));
        jLabel23.setText("Fecha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(253, 253, 253)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(108, 108, 108))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnEstadoDeResultado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBalanceDiarioT))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento10NumeroCuenta25, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAciento10NumeroCuenta26, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAciento10NumeroCuenta27, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(boxActivo34, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxActivo33, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxActivo32, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt34, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt33, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(158, 158, 158)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtAciento10Monto34, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento10Monto33, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento10Monto32, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento9NumeroCuenta22, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAciento9NumeroCuenta23, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAciento9NumeroCuenta24, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(boxActivo31, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxActivo30, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxActivo29, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt31, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt30, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(158, 158, 158)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtAciento9Monto31, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento9Monto30, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento9Monto29, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento8NumeroCuenta19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAciento8NumeroCuenta20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAciento8NumeroCuenta21, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel17)
                                                .addGap(286, 286, 286))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(boxActivo28, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(boxActivo27, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(boxActivo26, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txt26, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt27, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(158, 158, 158)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtAciento8Monto29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                                    .addComponent(txtAciento8Monto27, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtAciento8Monto26, javax.swing.GroupLayout.Alignment.LEADING)))))
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento7NumeroCuenta16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAciento7NumeroCuenta17, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAciento7NumeroCuenta18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(boxActivo25, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxActivo24, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxActivo23, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt25, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt24, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(158, 158, 158)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtAciento7Monto25, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento7Monto24, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento7Monto23, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento6NumeroCuenta13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAciento6NumeroCuenta14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAciento6NumeroCuenta15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel19)
                                                .addGap(286, 286, 286))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(boxActivo22, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(boxActivo21, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(boxActivo20, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txt20, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt21, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(158, 158, 158)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtAciento6Monto22, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtAciento6Monto21, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtAciento6Monto20, javax.swing.GroupLayout.Alignment.LEADING)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento5NumeroCuenta10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAciento5NumeroCuenta11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAciento5NumeroCuenta12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(boxActivo19, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxActivo18, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxActivo17, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt19, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt18, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(158, 158, 158)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtAciento5Monto19, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento5Monto18, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento5Monto17, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento4NumeroCuenta7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAciento4NumeroCuenta8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAciento4NumeroCuenta9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel15)
                                                .addGap(286, 286, 286))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(boxActivo16, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(boxActivo15, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(boxActivo14, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txt14, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt15, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(158, 158, 158)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtAciento4Monto16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                                    .addComponent(txtAciento4Monto15, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtAciento4Monto14, javax.swing.GroupLayout.Alignment.LEADING)))))
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento3NumeroCuenta4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAciento3NumeroCuenta5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAciento3NumeroCuenta6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(boxActivo13, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxActivo12, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxActivo11, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                            .addComponent(txt12, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt11, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(158, 158, 158)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtAciento3Monto13, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento3Monto12, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento3Monto11, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addComponent(jSeparator4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boxActivo7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxActivo6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxActivo5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt7, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(txt6)
                                    .addComponent(txt5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(185, 185, 185)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAciento1Monto5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAciento1Monto6)
                                    .addComponent(txtAciento1Monto7, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAciento2NumeroCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAciento2NumeroCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAciento2NumeroCuenta3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(boxActivo10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxActivo9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxActivo8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                            .addComponent(txt9, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt10, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(158, 158, 158)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtAciento2Monto10, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento2Monto9, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAciento2Monto8, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(293, 293, 293)))
                                .addGap(21, 21, 21))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(boxActivo4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boxActivo2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boxActivo3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boxAciento1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(txt4)
                            .addComponent(txt3)
                            .addComponent(txt1))
                        .addGap(185, 185, 185)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAciento1Monto2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAciento1Monto1)
                            .addComponent(txtAciento1Monto3)
                            .addComponent(txtAciento1Monto4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(322, 322, 322))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))))
                .addGap(11, 11, 11))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechaEmpresa)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(414, 414, 414))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txtFechaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxAciento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxActivo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtAciento1Monto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxActivo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtAciento1Monto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtAciento1Monto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxActivo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtAciento1Monto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxActivo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtAciento1Monto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxActivo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtAciento1Monto6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxActivo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtAciento1Monto7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxActivo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento2Monto8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento2NumeroCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento2Monto9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento2NumeroCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento2Monto10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento2NumeroCuenta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento3Monto11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento3NumeroCuenta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento3Monto12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento3NumeroCuenta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento3Monto13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento3NumeroCuenta6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxActivo14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento4Monto14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento4NumeroCuenta7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento4Monto15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento4NumeroCuenta8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento4Monto16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento4NumeroCuenta9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento5Monto17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento5NumeroCuenta10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento5Monto18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento5NumeroCuenta11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento5Monto19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento5NumeroCuenta12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxActivo20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento6Monto20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento6NumeroCuenta13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento6Monto21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento6NumeroCuenta14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento6Monto22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento6NumeroCuenta15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento7Monto23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento7NumeroCuenta16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento7Monto24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento7NumeroCuenta17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento7Monto25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento7NumeroCuenta18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxActivo26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento8Monto26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento8NumeroCuenta19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento8Monto27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento8NumeroCuenta20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento8Monto29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento8NumeroCuenta21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento9Monto29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento9NumeroCuenta22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento9Monto30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento9NumeroCuenta23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento9Monto31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento9NumeroCuenta24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento10Monto32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento10NumeroCuenta25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento10Monto33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento10NumeroCuenta26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxActivo34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento10Monto34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAciento10NumeroCuenta27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBalanceDiarioT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEstadoDeResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1664, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAciento1Monto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento1Monto5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento1Monto5ActionPerformed

    private void txtAciento1Monto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento1Monto6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento1Monto6ActionPerformed

    private void txtAciento3Monto13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento3Monto13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento3Monto13ActionPerformed

    private void txtAciento2Monto8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento2Monto8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento2Monto8ActionPerformed

    private void txtAciento2Monto10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento2Monto10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento2Monto10ActionPerformed

    private void txtAciento3Monto11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento3Monto11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento3Monto11ActionPerformed

    private void txtAciento5Monto19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento5Monto19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento5Monto19ActionPerformed

    private void txtAciento4Monto14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento4Monto14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento4Monto14ActionPerformed

    private void txtAciento4Monto16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento4Monto16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento4Monto16ActionPerformed

    private void txtAciento5Monto17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento5Monto17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento5Monto17ActionPerformed

    private void boxActivo27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo27ActionPerformed

    private void boxActivo26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo26ActionPerformed

    private void txtAciento9Monto31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento9Monto31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento9Monto31ActionPerformed

    private void txtAciento8Monto26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento8Monto26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento8Monto26ActionPerformed

    private void txtAciento8Monto29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento8Monto29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento8Monto29ActionPerformed

    private void txtAciento9Monto29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento9Monto29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento9Monto29ActionPerformed

    private void txt25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt25ActionPerformed

    private void txt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt20ActionPerformed

    private void boxActivo28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo28ActionPerformed

    private void txt24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt24ActionPerformed

    private void boxActivo25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo25ActionPerformed

    private void txtAciento10Monto34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento10Monto34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento10Monto34ActionPerformed

    private void txtAciento10Monto32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento10Monto32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento10Monto32ActionPerformed

    private void txt34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt34ActionPerformed

    private void txt33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt33ActionPerformed

    private void boxActivo24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo24ActionPerformed

    private void boxActivo23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo23ActionPerformed

    private void boxActivo22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo22ActionPerformed

    private void boxActivo21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo21ActionPerformed

    private void boxActivo20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo20ActionPerformed

    private void boxActivo34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo34ActionPerformed

    private void txtAciento7Monto25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento7Monto25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento7Monto25ActionPerformed

    private void btnBalanceDiarioTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceDiarioTActionPerformed
        
        FrameTMayor c=new FrameTMayor();        
        c.setVisible(true);
        this.setVisible(false);
        nombreFecha();
        recivirDatos();
        enviarDatos();        
        
    }//GEN-LAST:event_btnBalanceDiarioTActionPerformed

    private void txtAciento6Monto20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento6Monto20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento6Monto20ActionPerformed

    private void boxActivo33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo33ActionPerformed

    private void btnEstadoDeResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoDeResultadoActionPerformed
        FrameBienvenida a=new FrameBienvenida();
        a.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstadoDeResultadoActionPerformed

    private void boxActivo32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo32ActionPerformed

    private void txtAciento1Monto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento1Monto1ActionPerformed
       
        
    }//GEN-LAST:event_txtAciento1Monto1ActionPerformed

    private void txtAciento1Monto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento1Monto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento1Monto2ActionPerformed

    private void txtAciento1Monto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento1Monto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento1Monto3ActionPerformed

    private void txtAciento1Monto7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento1Monto7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento1Monto7ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
               
    }//GEN-LAST:event_txt1ActionPerformed

    private void txtAciento6Monto22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento6Monto22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento6Monto22ActionPerformed

    private void txtAciento7Monto23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento7Monto23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento7Monto23ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5ActionPerformed

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6ActionPerformed

    private void txt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt13ActionPerformed

    private void txt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt8ActionPerformed

    private void txt31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt31ActionPerformed

    private void txt26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt26ActionPerformed

    private void txt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt12ActionPerformed

    private void boxActivo13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo13ActionPerformed

    private void boxActivo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo12ActionPerformed

    private void boxActivo11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo11ActionPerformed

    private void txt30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt30ActionPerformed

    private void boxActivo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo10ActionPerformed

    private void boxActivo31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo31ActionPerformed

    private void boxActivo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo9ActionPerformed

    private void boxActivo30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo30ActionPerformed

    private void boxActivo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo8ActionPerformed

    private void boxActivo29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo29ActionPerformed

    private void boxActivo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo7ActionPerformed

    private void txt19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt19ActionPerformed

    private void txt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt14ActionPerformed

    private void boxActivo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo6ActionPerformed

    private void boxActivo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo5ActionPerformed

    private void boxActivo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo4ActionPerformed

    private void boxAciento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxAciento1ActionPerformed
       
        
        
    }//GEN-LAST:event_boxAciento1ActionPerformed

    private void boxActivo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo2ActionPerformed

    private void boxActivo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo3ActionPerformed

    private void txtAciento1Monto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAciento1Monto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAciento1Monto4ActionPerformed

    private void txt18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt18ActionPerformed

    private void boxActivo19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo19ActionPerformed

    private void boxActivo18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo18ActionPerformed

    private void boxActivo17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo17ActionPerformed

    private void boxActivo16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo16ActionPerformed

    private void boxActivo15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo15ActionPerformed

    private void boxActivo14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActivo14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActivo14ActionPerformed

    private void btnBalanceDiarioTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBalanceDiarioTMouseClicked
       
    }//GEN-LAST:event_btnBalanceDiarioTMouseClicked

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed
    public void nombreFecha(){
    //FrameTMayor.txtNombreEmpresa.setText(txtNombre.getText());
    }
    public void recivirDatos(){
        recivirDatosAciento1();
        
    }
    public void recivirDatosAciento1(){
        String textAciento1 = txtAciento1Monto1.getText().toString();
  //      textAciento1 = textAciento1.replace("$", "");
        String textAciento2 = txtAciento1Monto2.getText().toString();
        String textAciento3 = txtAciento1Monto3.getText().toString();
        String textAciento4 = txtAciento1Monto4.getText().toString();
        String textAciento5 = txtAciento1Monto5.getText().toString();
        String textAciento6 = txtAciento1Monto6.getText().toString();
        String textAciento7 = txtAciento1Monto7.getText().toString();
        
        numTxt1 = Integer.parseInt(textAciento1);   
        numTxt2 = Integer.parseInt(textAciento2);    
        numTxt3 = Integer.parseInt(textAciento3);    
        numTxt4 = Integer.parseInt(textAciento4);    
        numTxt5 = Integer.parseInt(textAciento5);    
        numTxt6 = Integer.parseInt(textAciento6);    
        numTxt7 = Integer.parseInt(textAciento7);                           
    }
    public void recivirDatosAciento2(){
    
            }
    
    public void enviarDatos() {
        box1Caja1();                     
    }
    
    public void box1Caja1(){
         String opcion = boxAciento1.getSelectedItem().toString();
        
        switch (opcion) {
            case "+ Activo":
                fTmayor.txtCaja1.setText(""+numTxt1);
            break;
            case "- Activo":
                fTmayor.txtCaja6.setText(""+numTxt1);
            break;
            case "+ Pasivo":
                fTmayor.txtCaja6.setText(""+numTxt1);
            break;
            case "- Pasivo":
                fTmayor.txtCaja1.setText(""+numTxt1);
            break;
            case "default":
                JOptionPane.showMessageDialog(null, "Escoga una opcion valida");
            break;
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAciento1;
    private javax.swing.JComboBox<String> boxActivo10;
    private javax.swing.JComboBox<String> boxActivo11;
    private javax.swing.JComboBox<String> boxActivo12;
    private javax.swing.JComboBox<String> boxActivo13;
    private javax.swing.JComboBox<String> boxActivo14;
    private javax.swing.JComboBox<String> boxActivo15;
    private javax.swing.JComboBox<String> boxActivo16;
    private javax.swing.JComboBox<String> boxActivo17;
    private javax.swing.JComboBox<String> boxActivo18;
    private javax.swing.JComboBox<String> boxActivo19;
    private javax.swing.JComboBox<String> boxActivo2;
    private javax.swing.JComboBox<String> boxActivo20;
    private javax.swing.JComboBox<String> boxActivo21;
    private javax.swing.JComboBox<String> boxActivo22;
    private javax.swing.JComboBox<String> boxActivo23;
    private javax.swing.JComboBox<String> boxActivo24;
    private javax.swing.JComboBox<String> boxActivo25;
    private javax.swing.JComboBox<String> boxActivo26;
    private javax.swing.JComboBox<String> boxActivo27;
    private javax.swing.JComboBox<String> boxActivo28;
    private javax.swing.JComboBox<String> boxActivo29;
    private javax.swing.JComboBox<String> boxActivo3;
    private javax.swing.JComboBox<String> boxActivo30;
    private javax.swing.JComboBox<String> boxActivo31;
    private javax.swing.JComboBox<String> boxActivo32;
    private javax.swing.JComboBox<String> boxActivo33;
    private javax.swing.JComboBox<String> boxActivo34;
    private javax.swing.JComboBox<String> boxActivo4;
    private javax.swing.JComboBox<String> boxActivo5;
    private javax.swing.JComboBox<String> boxActivo6;
    private javax.swing.JComboBox<String> boxActivo7;
    private javax.swing.JComboBox<String> boxActivo8;
    private javax.swing.JComboBox<String> boxActivo9;
    public javax.swing.JButton btnBalanceDiarioT;
    private javax.swing.JButton btnEstadoDeResultado;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt18;
    private javax.swing.JTextField txt19;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt21;
    private javax.swing.JTextField txt22;
    private javax.swing.JTextField txt23;
    private javax.swing.JTextField txt24;
    private javax.swing.JTextField txt25;
    private javax.swing.JTextField txt26;
    private javax.swing.JTextField txt27;
    private javax.swing.JTextField txt28;
    private javax.swing.JTextField txt29;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt30;
    private javax.swing.JTextField txt31;
    private javax.swing.JTextField txt32;
    private javax.swing.JTextField txt33;
    private javax.swing.JTextField txt34;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    private javax.swing.JTextField txtAciento10Monto32;
    private javax.swing.JTextField txtAciento10Monto33;
    private javax.swing.JTextField txtAciento10Monto34;
    private javax.swing.JTextField txtAciento10NumeroCuenta25;
    private javax.swing.JTextField txtAciento10NumeroCuenta26;
    private javax.swing.JTextField txtAciento10NumeroCuenta27;
    public javax.swing.JTextField txtAciento1Monto1;
    private javax.swing.JTextField txtAciento1Monto2;
    private javax.swing.JTextField txtAciento1Monto3;
    private javax.swing.JTextField txtAciento1Monto4;
    private javax.swing.JTextField txtAciento1Monto5;
    private javax.swing.JTextField txtAciento1Monto6;
    private javax.swing.JTextField txtAciento1Monto7;
    private javax.swing.JTextField txtAciento2Monto10;
    private javax.swing.JTextField txtAciento2Monto8;
    private javax.swing.JTextField txtAciento2Monto9;
    private javax.swing.JTextField txtAciento2NumeroCuenta1;
    private javax.swing.JTextField txtAciento2NumeroCuenta2;
    private javax.swing.JTextField txtAciento2NumeroCuenta3;
    private javax.swing.JTextField txtAciento3Monto11;
    private javax.swing.JTextField txtAciento3Monto12;
    private javax.swing.JTextField txtAciento3Monto13;
    private javax.swing.JTextField txtAciento3NumeroCuenta4;
    private javax.swing.JTextField txtAciento3NumeroCuenta5;
    private javax.swing.JTextField txtAciento3NumeroCuenta6;
    private javax.swing.JTextField txtAciento4Monto14;
    private javax.swing.JTextField txtAciento4Monto15;
    private javax.swing.JTextField txtAciento4Monto16;
    private javax.swing.JTextField txtAciento4NumeroCuenta7;
    private javax.swing.JTextField txtAciento4NumeroCuenta8;
    private javax.swing.JTextField txtAciento4NumeroCuenta9;
    private javax.swing.JTextField txtAciento5Monto17;
    private javax.swing.JTextField txtAciento5Monto18;
    private javax.swing.JTextField txtAciento5Monto19;
    private javax.swing.JTextField txtAciento5NumeroCuenta10;
    private javax.swing.JTextField txtAciento5NumeroCuenta11;
    private javax.swing.JTextField txtAciento5NumeroCuenta12;
    private javax.swing.JTextField txtAciento6Monto20;
    private javax.swing.JTextField txtAciento6Monto21;
    private javax.swing.JTextField txtAciento6Monto22;
    private javax.swing.JTextField txtAciento6NumeroCuenta13;
    private javax.swing.JTextField txtAciento6NumeroCuenta14;
    private javax.swing.JTextField txtAciento6NumeroCuenta15;
    private javax.swing.JTextField txtAciento7Monto23;
    private javax.swing.JTextField txtAciento7Monto24;
    private javax.swing.JTextField txtAciento7Monto25;
    private javax.swing.JTextField txtAciento7NumeroCuenta16;
    private javax.swing.JTextField txtAciento7NumeroCuenta17;
    private javax.swing.JTextField txtAciento7NumeroCuenta18;
    private javax.swing.JTextField txtAciento8Monto26;
    private javax.swing.JTextField txtAciento8Monto27;
    private javax.swing.JTextField txtAciento8Monto29;
    private javax.swing.JTextField txtAciento8NumeroCuenta19;
    private javax.swing.JTextField txtAciento8NumeroCuenta20;
    private javax.swing.JTextField txtAciento8NumeroCuenta21;
    private javax.swing.JTextField txtAciento9Monto29;
    private javax.swing.JTextField txtAciento9Monto30;
    private javax.swing.JTextField txtAciento9Monto31;
    private javax.swing.JTextField txtAciento9NumeroCuenta22;
    private javax.swing.JTextField txtAciento9NumeroCuenta23;
    private javax.swing.JTextField txtAciento9NumeroCuenta24;
    public static javax.swing.JTextField txtFechaEmpresa;
    public static javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
