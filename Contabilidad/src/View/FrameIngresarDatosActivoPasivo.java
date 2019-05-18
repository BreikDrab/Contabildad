
package View;

public class FrameIngresarDatosActivoPasivo extends javax.swing.JFrame {

 
    public FrameIngresarDatosActivoPasivo() {
        initComponents();
    }

    private static int caja, mercancias, docpcobrar, terrenos, equipoentrega, invercionesper, gastosmercadotecnia, docporpagar, gastospendientespago, ipotecasporpagar, rentascobradasporanticipado;
    private static int interesespagadosanticipado, bancos, invercionestem, clientes, deuoresdiv, anticipoprov, edificios, mobiliarioequipo, equipocomputo, depositogarantia, gastosinv;
    private static int gastosetapaspre, gastosorgan, gastosinst, papeleriautiles, propagandapu, primasseg, rentaspagadasanti, provee, acreedoresdiv, anticipoclientes, impuestospendientes;
    private static int docporpagarlargoplazo, cuentaspagarlargoplazo, interecescobradosant;

    public static int sumaCirculanteActivo, sumaFijoActivo, sumaDiferidoActivo;
    public static int sumaCirculantePasivo, sumaFijoPasivo, sumaDiferidoPasivo;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIngresarDatosPyA = new javax.swing.JLabel();
        lblActivos = new javax.swing.JLabel();
        lblPasivos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtProveedores = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtCaja = new javax.swing.JTextField();
        txtBancos = new javax.swing.JTextField();
        txtInvercionesT = new javax.swing.JTextField();
        txtMercancias = new javax.swing.JTextField();
        txtClientes = new javax.swing.JTextField();
        txtDocPC = new javax.swing.JTextField();
        txtDeudoresDiv = new javax.swing.JTextField();
        txtAnticipoProv = new javax.swing.JTextField();
        txtTerrenos = new javax.swing.JTextField();
        txtEdificios = new javax.swing.JTextField();
        txtMobiliarioEquipo = new javax.swing.JTextField();
        txtEquipoComputo = new javax.swing.JTextField();
        txtEquipoEntrega = new javax.swing.JTextField();
        txtDepositoGarantia = new javax.swing.JTextField();
        txtInvercionesPer = new javax.swing.JTextField();
        txtGastosInv = new javax.swing.JTextField();
        txtGastosEtapasPre = new javax.swing.JTextField();
        txtGastosMerc = new javax.swing.JTextField();
        txtGastosOrganizacion = new javax.swing.JTextField();
        txtRentasPagadasAnticipado = new javax.swing.JTextField();
        txtDocPorPagar = new javax.swing.JTextField();
        txtAcreedoresDiv = new javax.swing.JTextField();
        txtAnticipoClientes = new javax.swing.JTextField();
        txtGastosPendientesPago = new javax.swing.JTextField();
        txtImpuestosPendientesPago = new javax.swing.JTextField();
        txtIpotecasPorPagar = new javax.swing.JTextField();
        txtDocPorPagarLargoPlazo = new javax.swing.JTextField();
        txtCuentasPagarLargoPlazo = new javax.swing.JTextField();
        txtRentasCobradasPorAnticipado = new javax.swing.JTextField();
        txtInteresesCobradosAnticipado = new javax.swing.JTextField();
        txtInteresesPagadosAnticipados = new javax.swing.JTextField();
        txtGastosInst = new javax.swing.JTextField();
        txtPapeleriaUtiles = new javax.swing.JTextField();
        txtPrimasSeguros = new javax.swing.JTextField();
        txtPropagandaPublicidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostararResultado = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIngresarDatosPyA.setText("INGRESA TUS DATOS");
        lblIngresarDatosPyA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblActivos.setText("ACTIVOS");
        lblActivos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPasivos.setText("PASIVOS");
        lblPasivos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Proveedores");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Documentos por pagar");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Acreedores diversos");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Anticipo de clientes");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Gastos pendientes de pago");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Impuestos pendientes de pago");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Ipotecas por pagar");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Documentos por pagar a largo plazo");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Cuentas por pagar a largo plazo");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setText("Rentas cobradas por anticipado");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setText("Intereses cobrados por anticipado");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtProveedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedoresActionPerformed(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Caja");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Bancos");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Inversiones temporales");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Mercancias");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Clientes");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Documentos por cobrar");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Deudores diversos");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Anticipo a proveedores");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Terrenos");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Edificios");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Mobiliario y equipo");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Equipo de computo");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Equipo de entrega");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Depositos en garantia");
        jLabel28.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Papeleria y utiles");
        jLabel29.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Propaganda y publicidad");
        jLabel30.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Primas de seguros");
        jLabel31.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Rentas pagadas por anticipado");
        jLabel32.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Ingtereses pagados por anticpado");
        jLabel33.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("Inversiones permanentes");
        jLabel37.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("Gastos de investigacion");
        jLabel38.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("Gastos en etapas preoperativas");
        jLabel39.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("Gastos de mercadotecnia");
        jLabel40.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel41.setText("Gastos de organizacion");
        jLabel41.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("Gastos de instalacion");
        jLabel42.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCajaActionPerformed(evt);
            }
        });

        txtBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBancosActionPerformed(evt);
            }
        });

        txtInvercionesT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInvercionesTActionPerformed(evt);
            }
        });

        txtMercancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMercanciasActionPerformed(evt);
            }
        });

        txtClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientesActionPerformed(evt);
            }
        });

        txtDocPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocPCActionPerformed(evt);
            }
        });

        txtDeudoresDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeudoresDivActionPerformed(evt);
            }
        });

        txtAnticipoProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnticipoProvActionPerformed(evt);
            }
        });

        txtTerrenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTerrenosActionPerformed(evt);
            }
        });

        txtEdificios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdificiosActionPerformed(evt);
            }
        });

        txtMobiliarioEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobiliarioEquipoActionPerformed(evt);
            }
        });

        txtEquipoComputo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEquipoComputoActionPerformed(evt);
            }
        });

        txtEquipoEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEquipoEntregaActionPerformed(evt);
            }
        });

        txtDepositoGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepositoGarantiaActionPerformed(evt);
            }
        });

        txtInvercionesPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInvercionesPerActionPerformed(evt);
            }
        });

        txtGastosInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGastosInvActionPerformed(evt);
            }
        });

        txtGastosEtapasPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGastosEtapasPreActionPerformed(evt);
            }
        });

        txtGastosMerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGastosMercActionPerformed(evt);
            }
        });

        txtGastosOrganizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGastosOrganizacionActionPerformed(evt);
            }
        });

        txtRentasPagadasAnticipado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRentasPagadasAnticipadoActionPerformed(evt);
            }
        });

        txtDocPorPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocPorPagarActionPerformed(evt);
            }
        });

        txtAcreedoresDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcreedoresDivActionPerformed(evt);
            }
        });

        txtAnticipoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnticipoClientesActionPerformed(evt);
            }
        });

        txtGastosPendientesPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGastosPendientesPagoActionPerformed(evt);
            }
        });

        txtImpuestosPendientesPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImpuestosPendientesPagoActionPerformed(evt);
            }
        });

        txtIpotecasPorPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIpotecasPorPagarActionPerformed(evt);
            }
        });

        txtDocPorPagarLargoPlazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocPorPagarLargoPlazoActionPerformed(evt);
            }
        });

        txtCuentasPagarLargoPlazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuentasPagarLargoPlazoActionPerformed(evt);
            }
        });

        txtRentasCobradasPorAnticipado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRentasCobradasPorAnticipadoActionPerformed(evt);
            }
        });

        txtInteresesCobradosAnticipado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInteresesCobradosAnticipadoActionPerformed(evt);
            }
        });

        txtInteresesPagadosAnticipados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInteresesPagadosAnticipadosActionPerformed(evt);
            }
        });

        txtGastosInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGastosInstActionPerformed(evt);
            }
        });

        txtPapeleriaUtiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPapeleriaUtilesActionPerformed(evt);
            }
        });

        txtPrimasSeguros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimasSegurosActionPerformed(evt);
            }
        });

        txtPropagandaPublicidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPropagandaPublicidadActionPerformed(evt);
            }
        });

        mostararResultado.setColumns(20);
        mostararResultado.setRows(5);
        jScrollPane1.setViewportView(mostararResultado);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblActivos)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lblPasivos)
                                                    .addGap(1, 1, 1))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGap(12, 12, 12))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGap(12, 12, 12)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtIpotecasPorPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(txtInteresesCobradosAnticipado)
                                            .addComponent(txtRentasCobradasPorAnticipado)
                                            .addComponent(txtDocPorPagarLargoPlazo)
                                            .addComponent(txtCuentasPagarLargoPlazo)
                                            .addComponent(txtImpuestosPendientesPago)
                                            .addComponent(txtGastosPendientesPago)
                                            .addComponent(txtAcreedoresDiv)
                                            .addComponent(txtAnticipoClientes)
                                            .addComponent(txtDocPorPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(txtProveedores)))
                                    .addComponent(jScrollPane1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnAceptar)))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                        .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(txtRentasPagadasAnticipado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtInteresesPagadosAnticipados, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtClientes)
                                    .addComponent(txtMercancias)
                                    .addComponent(txtBancos)
                                    .addComponent(txtInvercionesT)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                        .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdificios)
                                    .addComponent(txtTerrenos)
                                    .addComponent(txtDeudoresDiv)
                                    .addComponent(txtAnticipoProv)
                                    .addComponent(txtGastosOrganizacion)
                                    .addComponent(txtGastosMerc)
                                    .addComponent(txtGastosInv)
                                    .addComponent(txtDepositoGarantia)
                                    .addComponent(txtEquipoEntrega)
                                    .addComponent(txtMobiliarioEquipo)
                                    .addComponent(txtEquipoComputo)
                                    .addComponent(txtInvercionesPer)
                                    .addComponent(txtGastosEtapasPre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDocPC)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPapeleriaUtiles, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGastosInst, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPropagandaPublicidad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrimasSeguros, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(425, 425, 425))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIngresarDatosPyA)
                        .addGap(336, 336, 336))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIngresarDatosPyA)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblActivos)
                            .addComponent(lblPasivos))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtBancos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtInvercionesT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(txtMercancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(txtClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(txtDocPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(txtDeudoresDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(txtAnticipoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(txtTerrenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(txtEquipoComputo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtDocPorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtAcreedoresDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtAnticipoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtGastosPendientesPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtImpuestosPendientesPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(211, 211, 211)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtEdificios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel24))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel25)
                                            .addComponent(txtMobiliarioEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(145, 145, 145)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtIpotecasPorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtDocPorPagarLargoPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtCuentasPagarLargoPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtRentasCobradasPorAnticipado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtInteresesCobradosAnticipado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))))))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtEquipoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtDepositoGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(txtInvercionesPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(txtGastosInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtGastosEtapasPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtGastosMerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtGastosOrganizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtGastosInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtPapeleriaUtiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtPropagandaPublicidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtPrimasSeguros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtRentasPagadasAnticipado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtInteresesPagadosAnticipados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajaActionPerformed
        String cajaTxt = txtCaja.getText();
        caja = Integer.parseInt(cajaTxt);
        System.out.println("valor de caja-> " + caja);

    }//GEN-LAST:event_txtCajaActionPerformed

    private void txtMercanciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMercanciasActionPerformed
        String mercanciasTxt = txtMercancias.getText();
        mercancias = Integer.parseInt(mercanciasTxt);
        System.out.println("mercancias-> " + mercancias);

    }//GEN-LAST:event_txtMercanciasActionPerformed

    private void txtDocPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocPCActionPerformed
        String docpcobrarTxt = txtDocPC.getText();
        docpcobrar = Integer.parseInt(docpcobrarTxt);
        System.out.println("Documentos por cobrar-> " + docpcobrar);
    }//GEN-LAST:event_txtDocPCActionPerformed

    private void txtTerrenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerrenosActionPerformed
        String terrenosTxt = txtTerrenos.getText();
        terrenos = Integer.parseInt(terrenosTxt);
        System.out.println("Terreno-> " + terrenos);
    }//GEN-LAST:event_txtTerrenosActionPerformed

    private void txtEquipoEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEquipoEntregaActionPerformed
        String equipoentregaTxt = txtEquipoEntrega.getText();
        equipoentrega = Integer.parseInt(equipoentregaTxt);
        System.out.println("Equipo de entrega-> " + equipoentrega);
    }//GEN-LAST:event_txtEquipoEntregaActionPerformed

    private void txtInvercionesPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInvercionesPerActionPerformed
        String invercionesperTxt = txtInvercionesPer.getText();
        invercionesper = Integer.parseInt(invercionesperTxt);
        System.out.println("Inverciones permamentes-> " + invercionesper);
    }//GEN-LAST:event_txtInvercionesPerActionPerformed

    private void txtGastosMercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGastosMercActionPerformed
        String gastosmercanciasTxt = txtGastosMerc.getText();
        gastosmercadotecnia = Integer.parseInt(gastosmercanciasTxt);
        System.out.println("Gastos de mercamcia-> " + gastosmercadotecnia);
    }//GEN-LAST:event_txtGastosMercActionPerformed

    private void txtDocPorPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocPorPagarActionPerformed
        String docporcobrarTxt = txtDocPorPagar.getText();
        docporpagar = Integer.parseInt(docporcobrarTxt);
        System.out.println("Documentos por pagar-> " + docporpagar);
    }//GEN-LAST:event_txtDocPorPagarActionPerformed

    private void txtGastosPendientesPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGastosPendientesPagoActionPerformed
        String gastospendientespagoTxt = txtGastosPendientesPago.getText();
        gastospendientespago = Integer.parseInt(gastospendientespagoTxt);
        System.out.println("Gastos pendientes de pago-> " + gastospendientespago);
    }//GEN-LAST:event_txtGastosPendientesPagoActionPerformed

    private void txtIpotecasPorPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIpotecasPorPagarActionPerformed
        String ipotecasporpagarTxt = txtIpotecasPorPagar.getText();
        ipotecasporpagar = Integer.parseInt(ipotecasporpagarTxt);
        System.out.println("Ipotecas por pagar-> " + ipotecasporpagar);
    }//GEN-LAST:event_txtIpotecasPorPagarActionPerformed

    private void txtRentasCobradasPorAnticipadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRentasCobradasPorAnticipadoActionPerformed
        String rentascobradasporanticipadoTxt = txtRentasCobradasPorAnticipado.getText();
        rentascobradasporanticipado = Integer.parseInt(rentascobradasporanticipadoTxt);
        System.out.println("Rentas pagadas por anticipado-> " + rentascobradasporanticipado);
    }//GEN-LAST:event_txtRentasCobradasPorAnticipadoActionPerformed

    private void txtInteresesPagadosAnticipadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInteresesPagadosAnticipadosActionPerformed
        String interesespagadosanticipadoTxt = txtInteresesPagadosAnticipados.getText();
        interesespagadosanticipado = Integer.parseInt(interesespagadosanticipadoTxt);
        System.out.println("Intereses pagados por anticipado-> " + interesespagadosanticipado);
    }//GEN-LAST:event_txtInteresesPagadosAnticipadosActionPerformed

    private void txtBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBancosActionPerformed
        String bancosTxt = txtBancos.getText();
        bancos = Integer.parseInt(bancosTxt);
        System.out.println("Bancos-> " + bancos);
    }//GEN-LAST:event_txtBancosActionPerformed

    private void txtInvercionesTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInvercionesTActionPerformed
        String invercionestemTxt = txtInvercionesT.getText();
        invercionestem = Integer.parseInt(invercionestemTxt);
        System.out.println("Inverciones temporales-> " + invercionestem);
    }//GEN-LAST:event_txtInvercionesTActionPerformed

    private void txtClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientesActionPerformed
        String clientesTxt = txtClientes.getText();
        clientes = Integer.parseInt(clientesTxt);
        System.out.println("Clientes-> " + clientes);
    }//GEN-LAST:event_txtClientesActionPerformed

    private void txtDeudoresDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeudoresDivActionPerformed
        String deudoresdivTxt = txtDeudoresDiv.getText();
        deuoresdiv = Integer.parseInt(deudoresdivTxt);
        System.out.println("Deudores diversos-> " + deuoresdiv);
    }//GEN-LAST:event_txtDeudoresDivActionPerformed

    private void txtAnticipoProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnticipoProvActionPerformed
        String anticipoprovTxt = txtAnticipoProv.getText();
        anticipoprov = Integer.parseInt(anticipoprovTxt);
        System.out.println("Anticipo a Proveedores-> " + anticipoprov);
    }//GEN-LAST:event_txtAnticipoProvActionPerformed

    private void txtEdificiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdificiosActionPerformed
        String edificiosTxt = txtEdificios.getText();
        edificios = Integer.parseInt(edificiosTxt);
        System.out.println("Edificios-> " + edificios);
    }//GEN-LAST:event_txtEdificiosActionPerformed

    private void txtMobiliarioEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobiliarioEquipoActionPerformed
        String mobiliarioequipoTxt = txtMobiliarioEquipo.getText();
        mobiliarioequipo = Integer.parseInt(mobiliarioequipoTxt);
        System.out.println("Mobiliario y equipo-> " + mobiliarioequipo);
    }//GEN-LAST:event_txtMobiliarioEquipoActionPerformed

    private void txtEquipoComputoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEquipoComputoActionPerformed
        String equipocomputoTxt = txtEquipoComputo.getText();
        equipocomputo = Integer.parseInt(equipocomputoTxt);
        System.out.println("Equipo de Computo-> " + equipocomputo);
    }//GEN-LAST:event_txtEquipoComputoActionPerformed

    private void txtDepositoGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepositoGarantiaActionPerformed
        String depositogarantiaTxt = txtDepositoGarantia.getText();
        depositogarantia = Integer.parseInt(depositogarantiaTxt);
        System.out.println("deposito en garantia-> " + depositogarantia);
    }//GEN-LAST:event_txtDepositoGarantiaActionPerformed

    private void txtGastosInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGastosInvActionPerformed
        String gastosinvTxt = txtGastosInv.getText();
        gastosinv = Integer.parseInt(gastosinvTxt);
        System.out.println("Gastos de investigacion-> " + gastosinv);
    }//GEN-LAST:event_txtGastosInvActionPerformed

    private void txtGastosEtapasPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGastosEtapasPreActionPerformed
        String gastosestapaspreTxt = txtGastosEtapasPre.getText();
        gastosetapaspre = Integer.parseInt(gastosestapaspreTxt);
        System.out.println("Gastos de etapas preoperativas-> " + gastosetapaspre);
    }//GEN-LAST:event_txtGastosEtapasPreActionPerformed

    private void txtGastosOrganizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGastosOrganizacionActionPerformed
        String gastosorganTxt = txtGastosOrganizacion.getText();
        gastosorgan = Integer.parseInt(gastosorganTxt);
        System.out.println("Gastos de organizacion-> " + gastosorgan);
    }//GEN-LAST:event_txtGastosOrganizacionActionPerformed

    private void txtGastosInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGastosInstActionPerformed
        String gastosinstTxt = txtGastosInst.getText();
        gastosinst = Integer.parseInt(gastosinstTxt);
        System.out.println("Gastos de instalacion-> " + gastosinst);
    }//GEN-LAST:event_txtGastosInstActionPerformed

    private void txtPapeleriaUtilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPapeleriaUtilesActionPerformed
        String papeleriautilesTxt = txtPapeleriaUtiles.getText();
        papeleriautiles = Integer.parseInt(papeleriautilesTxt);
        System.out.println("Papeleria y utiles-> " + papeleriautiles);
    }//GEN-LAST:event_txtPapeleriaUtilesActionPerformed

    private void txtPropagandaPublicidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPropagandaPublicidadActionPerformed
        String propagandapuTxt = txtPropagandaPublicidad.getText();
        propagandapu = Integer.parseInt(propagandapuTxt);
        System.out.println("Propaganda y publicidad-> " + propagandapu);
    }//GEN-LAST:event_txtPropagandaPublicidadActionPerformed

    private void txtPrimasSegurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimasSegurosActionPerformed
        String primassegTxt = txtPrimasSeguros.getText();
        primasseg = Integer.parseInt(primassegTxt);
        System.out.println("Primas y seguros-> " + primasseg);
    }//GEN-LAST:event_txtPrimasSegurosActionPerformed

    private void txtRentasPagadasAnticipadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRentasPagadasAnticipadoActionPerformed
        String rentaspagadasantiTxt = txtRentasPagadasAnticipado.getText();
        rentaspagadasanti = Integer.parseInt(rentaspagadasantiTxt);
        System.out.println("Rentas pagadas por anticipado-> " + rentaspagadasanti);
    }//GEN-LAST:event_txtRentasPagadasAnticipadoActionPerformed

    private void txtProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedoresActionPerformed
        String proveeTxt = txtProveedores.getText();
        provee = Integer.parseInt(proveeTxt);
        System.out.println("Proveedores-> " + provee);
    }//GEN-LAST:event_txtProveedoresActionPerformed

    private void txtAcreedoresDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcreedoresDivActionPerformed
        String acreedoresdivTxt = txtAcreedoresDiv.getText();
        acreedoresdiv = Integer.parseInt(acreedoresdivTxt);
        System.out.println("Acreedores diversos-> " + acreedoresdiv);
    }//GEN-LAST:event_txtAcreedoresDivActionPerformed

    private void txtAnticipoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnticipoClientesActionPerformed
        String anticipoclientesTxt = txtAnticipoClientes.getText();
        anticipoclientes = Integer.parseInt(anticipoclientesTxt);
        System.out.println("Anticipo a clientes-> " + anticipoclientes);
    }//GEN-LAST:event_txtAnticipoClientesActionPerformed

    private void txtImpuestosPendientesPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpuestosPendientesPagoActionPerformed
        String impuestospendientesTxt = txtImpuestosPendientesPago.getText();
        impuestospendientes = Integer.parseInt(impuestospendientesTxt);
        System.out.println("Impuestos pendientes de pago-> " + impuestospendientes);
    }//GEN-LAST:event_txtImpuestosPendientesPagoActionPerformed

    private void txtDocPorPagarLargoPlazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocPorPagarLargoPlazoActionPerformed
        String docporpagarlargoplazoTxt = txtDocPorPagarLargoPlazo.getText();
        docporpagarlargoplazo = Integer.parseInt(docporpagarlargoplazoTxt);
        System.out.println("Documentos por pagar largo plazo-> " + docporpagarlargoplazo);
    }//GEN-LAST:event_txtDocPorPagarLargoPlazoActionPerformed

    private void txtCuentasPagarLargoPlazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuentasPagarLargoPlazoActionPerformed
        String cuentaspagarlargoplazoTxt = txtCuentasPagarLargoPlazo.getText();
        cuentaspagarlargoplazo = Integer.parseInt(cuentaspagarlargoplazoTxt);
        System.out.println("cuentas por pagar a largo plazo-> " + cuentaspagarlargoplazo);
    }//GEN-LAST:event_txtCuentasPagarLargoPlazoActionPerformed

    private void txtInteresesCobradosAnticipadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInteresesCobradosAnticipadoActionPerformed
        String interecescobradosantTxt = txtInteresesCobradosAnticipado.getText();
        interecescobradosant = Integer.parseInt(interecescobradosantTxt);
        System.out.println("Intereces cobrados por anticipado-> " + interecescobradosant);
    }//GEN-LAST:event_txtInteresesCobradosAnticipadoActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        circulanteActivo();
        fijoActivo();
        diferidoActivo();
        totalActivo();
        circulantePasivo();
        fijoPasivo();
        diferidoPasivo();
        totalPasivo();
        capitalContable();
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * ************************ ACTIVO ****************************
     */
    public int circulanteActivo() {
        sumaCirculanteActivo = caja + bancos + invercionestem + mercancias + clientes + docpcobrar + deuoresdiv + anticipoprov;
        System.out.println("Suma circulante Activo: " + sumaCirculanteActivo);
        mostararResultado.setText("Suma circulante Activo: " + sumaCirculanteActivo);
        return sumaCirculanteActivo;
    }

    public int fijoActivo() {
        sumaFijoActivo = terrenos + edificios + mobiliarioequipo + equipocomputo + equipoentrega + depositogarantia + invercionesper;
        System.out.println("Suma fijo Activo: " + sumaFijoActivo);
        mostararResultado.setText("Suma fijo Activo: " + sumaFijoActivo);
        return sumaFijoActivo;
    }

    public int diferidoActivo() {
        sumaDiferidoActivo = gastosinv + gastosetapaspre + gastosmercadotecnia + gastosorgan + gastosinst + papeleriautiles + propagandapu + primasseg + rentaspagadasanti + interesespagadosanticipado;
        System.out.println("Suma diferido Activo: " + sumaDiferidoActivo);
        mostararResultado.setText("Suma diferido Activo: " + sumaDiferidoActivo);
        return sumaDiferidoActivo;
    }

    public int totalActivo() {
        int totalActivo = circulanteActivo() + fijoActivo() + diferidoActivo();
        mostararResultado.setText("Total activo Activo: " + totalActivo);
        return totalActivo;

    }

    /**
     * ************************ PASIVO ****************************
     */
    public int circulantePasivo() {
        sumaCirculantePasivo = provee + docporpagar + acreedoresdiv + anticipoclientes + gastospendientespago + impuestospendientes;
        System.out.println("Suma circulante pasivo: " + sumaCirculantePasivo);
        mostararResultado.setText("Suma circulante pasivo: " + sumaCirculantePasivo);
        return sumaCirculantePasivo;
    }

    public int fijoPasivo() {
        sumaFijoPasivo = ipotecasporpagar + docporpagarlargoplazo + cuentaspagarlargoplazo;
        System.out.println("Suma fijo pasivo: " + sumaFijoPasivo);
        mostararResultado.setText("Suma fijo pasivo: " + sumaFijoPasivo);
        return sumaFijoPasivo;
    }

    public int diferidoPasivo() {
        sumaDiferidoPasivo = rentascobradasporanticipado + interecescobradosant;
        System.out.println("Suma diferido pasivo: " + sumaDiferidoPasivo);
        mostararResultado.setText("Suma diferido pasivo: " + sumaDiferidoPasivo);
        return sumaDiferidoPasivo;
    }

    public int totalPasivo() {
        int totalPasivo = circulantePasivo() + fijoPasivo() + diferidoPasivo() ;
        mostararResultado.setText("Total activo pasivo: " + totalPasivo);
        return totalPasivo;

    }

    /*
    ************** CAPITAL CONTABLE 
     */
    public void capitalContable() {
        int capitalContable = totalActivo() + totalPasivo();
        mostararResultado.setText("Capital contable: "+capitalContable);
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
            java.util.logging.Logger.getLogger(FrameIngresarDatosActivoPasivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameIngresarDatosActivoPasivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameIngresarDatosActivoPasivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameIngresarDatosActivoPasivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameIngresarDatosActivoPasivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActivos;
    private javax.swing.JLabel lblIngresarDatosPyA;
    private javax.swing.JLabel lblPasivos;
    private javax.swing.JTextArea mostararResultado;
    private javax.swing.JTextField txtAcreedoresDiv;
    private javax.swing.JTextField txtAnticipoClientes;
    private javax.swing.JTextField txtAnticipoProv;
    private javax.swing.JTextField txtBancos;
    private javax.swing.JTextField txtCaja;
    private javax.swing.JTextField txtClientes;
    private javax.swing.JTextField txtCuentasPagarLargoPlazo;
    private javax.swing.JTextField txtDepositoGarantia;
    private javax.swing.JTextField txtDeudoresDiv;
    private javax.swing.JTextField txtDocPC;
    private javax.swing.JTextField txtDocPorPagar;
    private javax.swing.JTextField txtDocPorPagarLargoPlazo;
    private javax.swing.JTextField txtEdificios;
    private javax.swing.JTextField txtEquipoComputo;
    private javax.swing.JTextField txtEquipoEntrega;
    private javax.swing.JTextField txtGastosEtapasPre;
    private javax.swing.JTextField txtGastosInst;
    private javax.swing.JTextField txtGastosInv;
    private javax.swing.JTextField txtGastosMerc;
    private javax.swing.JTextField txtGastosOrganizacion;
    private javax.swing.JTextField txtGastosPendientesPago;
    private javax.swing.JTextField txtImpuestosPendientesPago;
    private javax.swing.JTextField txtInteresesCobradosAnticipado;
    private javax.swing.JTextField txtInteresesPagadosAnticipados;
    private javax.swing.JTextField txtInvercionesPer;
    private javax.swing.JTextField txtInvercionesT;
    private javax.swing.JTextField txtIpotecasPorPagar;
    private javax.swing.JTextField txtMercancias;
    private javax.swing.JTextField txtMobiliarioEquipo;
    private javax.swing.JTextField txtPapeleriaUtiles;
    private javax.swing.JTextField txtPrimasSeguros;
    private javax.swing.JTextField txtPropagandaPublicidad;
    private javax.swing.JTextField txtProveedores;
    private javax.swing.JTextField txtRentasCobradasPorAnticipado;
    private javax.swing.JTextField txtRentasPagadasAnticipado;
    private javax.swing.JTextField txtTerrenos;
    // End of variables declaration//GEN-END:variables
}
