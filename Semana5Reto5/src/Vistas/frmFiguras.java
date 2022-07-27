
package Vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmFiguras extends javax.swing.JFrame {
    javax.swing.ImageIcon iconoTilde = 
            new javax.swing.ImageIcon(getClass().getResource("/Iconos/tilde.gif"));
    
    DefaultTableModel dtm = new DefaultTableModel();
    DefaultTableModel dtm_circulo = new DefaultTableModel();
    
    public frmFiguras() {
        initComponents();
        String[] titulos = new String[] {"Ancho", "Alto","Area", "Perimetro"};        
        String[] titulosCirculo = new String[] {"Radio","Area", "Perimetro"};        
        dtm.setColumnIdentifiers(titulos);
        dtm_circulo.setColumnIdentifiers(titulosCirculo);
        tblCuadrados.setModel(dtm);
        tblCirculos.setModel(dtm_circulo);
        //btnCalcular.setEnabled(false);
        //chkEquilatero.setEnabled(true);
        //chkEscaleno.setSelected(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradTriangulos = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtAncho = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAlto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPerimetro = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblTildeAncho = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuadrados = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        btnInsertarCuadrado = new javax.swing.JButton();
        btnActualizarCuadrado = new javax.swing.JButton();
        btnEliminarCuadrado = new javax.swing.JButton();
        btnEliminarTodosCuadrados = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTildeAlto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        radEquilatero = new javax.swing.JRadioButton();
        radEscaleno = new javax.swing.JRadioButton();
        radIsosceles = new javax.swing.JRadioButton();
        cmdRadios = new javax.swing.JButton();
        chkEquilatero = new javax.swing.JCheckBox();
        chkEscaleno = new javax.swing.JCheckBox();
        chkIsosceles = new javax.swing.JCheckBox();
        cmdCheckBox = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboTriangulos = new javax.swing.JComboBox<>();
        cmdCombos = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        chkEquilateros = new javax.swing.JCheckBox();
        chkEscalenos = new javax.swing.JCheckBox();
        chkIsosceless = new javax.swing.JCheckBox();
        chkConos = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        cmdCheckBoxs = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        radEquilateross = new javax.swing.JRadioButton();
        radEscalenos = new javax.swing.JRadioButton();
        radIsosceless = new javax.swing.JRadioButton();
        radCono = new javax.swing.JRadioButton();
        cmdRadioss = new javax.swing.JButton();
        cboTrianguloss = new javax.swing.JComboBox<>();
        cmdComboBoxs = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtRadioCirculo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblPerimetroCirculo = new javax.swing.JLabel();
        lblTipoCirculo = new javax.swing.JLabel();
        btnCalcularCirculo = new javax.swing.JButton();
        cmdLimpiarCirculo = new javax.swing.JButton();
        txtAreaCirculo = new javax.swing.JTextField();
        lblTildeRadioCirculo = new javax.swing.JLabel();
        btnInsertarCirculo = new javax.swing.JButton();
        btnActualziarCirculo = new javax.swing.JButton();
        btnEliminarCirculo = new javax.swing.JButton();
        btnEliminarTodosCirculo = new javax.swing.JButton();
        btnSalirCirculo = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCirculos = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtAnchoTriangulo = new javax.swing.JTextField();
        txtAltoTriangulo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblPerimetroTriangulo = new javax.swing.JLabel();
        lblTipoTriangulo = new javax.swing.JLabel();
        btnCalcularTriangulo = new javax.swing.JButton();
        cmdLimpiarTriangulo = new javax.swing.JButton();
        txtAreaTriangulo = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtAnchoRectangulo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAltoRectangulo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblPerimetroRectangulo = new javax.swing.JLabel();
        lblTipoRectangulo = new javax.swing.JLabel();
        btnCalcularRectangulo = new javax.swing.JButton();
        cmdLimpiarRectangulo = new javax.swing.JButton();
        txtAreaRectangulo = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        lblTildeAnchoRectangulo = new javax.swing.JLabel();

        jLabel8.setText("RADIO BUTTON - OPCIONES SELECCIÓN ÚNICA");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROGRAMA FIGURAS PLANAS");

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        txtAncho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAnchoFocusLost(evt);
            }
        });
        txtAncho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnchoActionPerformed(evt);
            }
        });
        txtAncho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnchoKeyTyped(evt);
            }
        });

        jLabel1.setText("ANCHO: (*)");

        jLabel2.setText("ALTO:(*)");

        txtAlto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAltoFocusLost(evt);
            }
        });

        jLabel3.setText("PERIMETRO:");

        jLabel4.setText("AREA:");

        jLabel5.setText("TIPO:");

        lblPerimetro.setText("00");

        txtArea.setEditable(false);
        txtArea.setText("00");

        lblTipo.setText("?????");

        btnCalcular.setText("Calcular");
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
        });
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdLimpiarMouseClicked(evt);
            }
        });
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        jLabel10.setText("Los campos marcados con (*) son obligados");

        tblCuadrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCuadrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCuadradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCuadrados);

        jLabel13.setText("CRUD");

        btnInsertarCuadrado.setText("Insertar");
        btnInsertarCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarCuadradoAccion(evt);
            }
        });

        btnActualizarCuadrado.setText("Actualizar");
        btnActualizarCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCuadradoActionPerformed(evt);
            }
        });

        btnEliminarCuadrado.setText("Eliminar");
        btnEliminarCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuadradoAccion(evt);
            }
        });

        btnEliminarTodosCuadrados.setText("Eliminar Todos");
        btnEliminarTodosCuadrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodosCuadradosActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");

        lblTildeAlto.setText("  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAncho, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                            .addComponent(txtAlto))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTildeAlto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblTildeAncho))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCalcular)
                                        .addGap(32, 32, 32)
                                        .addComponent(cmdLimpiar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)))
                                    .addComponent(jLabel3))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTipo)
                                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInsertarCuadrado)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizarCuadrado)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarCuadrado)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarTodosCuadrados)
                                .addGap(69, 69, 69)
                                .addComponent(btnSalir))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel13)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(lblPerimetro)
                    .addComponent(lblTildeAncho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTildeAlto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblTipo)
                    .addComponent(btnCalcular)
                    .addComponent(cmdLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertarCuadrado)
                    .addComponent(btnActualizarCuadrado)
                    .addComponent(btnEliminarCuadrado)
                    .addComponent(btnEliminarTodosCuadrados)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cuadrados", jPanel1);

        gradTriangulos.add(radEquilatero);
        radEquilatero.setText("Con Borde");

        gradTriangulos.add(radEscaleno);
        radEscaleno.setText("Sin Borde");

        gradTriangulos.add(radIsosceles);
        radIsosceles.setText("Borde Punteado");

        cmdRadios.setText("Qué Opción de Radios??");
        cmdRadios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRadiosAccion(evt);
            }
        });

        chkEquilatero.setText("Equilatero");

        chkEscaleno.setText("Escaleno");

        chkIsosceles.setText("Isosceles");

        cmdCheckBox.setText("Qué Opciones de Checks?");
        cmdCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCheckBoxAccion(evt);
            }
        });

        jLabel6.setText("CHECK BOX - CASILLAS DE VERIFICACIÓN - MULTIPLES OPCIONES");

        jLabel7.setText("RADIO BUTTON - OPCIONES SELECCIÓN ÚNICA");

        cboTriangulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar Relleno--", "Amarillo", "Azul", "Rojo" }));

        cmdCombos.setText("Qué Opción del Combo??");
        cmdCombos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCombosAccion(evt);
            }
        });

        jLabel9.setText("COMBOSBOX - CUADROS COMBINADOS - OPCIONES SELECCIÓN ÚNICA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cboTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmdCombos))
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(radEscaleno))
                        .addContainerGap(340, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdRadios)
                            .addComponent(chkIsosceles)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(chkEscaleno)
                                .addGap(32, 32, 32)
                                .addComponent(cmdCheckBox))
                            .addComponent(chkEquilatero)
                            .addComponent(radIsosceles)
                            .addComponent(radEquilatero))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radEquilatero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radEscaleno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radIsosceles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdRadios)
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkEquilatero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkEscaleno)
                    .addComponent(cmdCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkIsosceles)
                .addGap(46, 46, 46)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdCombos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Componentes", jPanel3);

        chkEquilateros.setText("Equilatero");

        chkEscalenos.setText("Escaleno");

        chkIsosceless.setText("Isosceles");
        chkIsosceless.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIsoscelessActionPerformed(evt);
            }
        });

        chkConos.setText("Cono");

        jLabel11.setText("Cuales son Figuras Planas?");

        cmdCheckBoxs.setText("Cuales Tildo??");
        cmdCheckBoxs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdCheckBoxsMouseClicked(evt);
            }
        });

        jLabel12.setText("Cual Triangulo tiene los tres lados iguales");

        gradTriangulos.add(radEquilateross);
        radEquilateross.setText("Equilatero");
        radEquilateross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radEquilaterossMouseClicked(evt);
            }
        });

        gradTriangulos.add(radEscalenos);
        radEscalenos.setText("Escaleno");

        gradTriangulos.add(radIsosceless);
        radIsosceless.setText("Isosceles");

        gradTriangulos.add(radCono);
        radCono.setText("Cono");

        cmdRadioss.setText("Cuál selecciono?");
        cmdRadioss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdRadiossMouseClicked(evt);
            }
        });

        cboTrianguloss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar Triangulo--", "Equilatero", "Escaleno", "Isosceles" }));
        cboTrianguloss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTriangulossActionPerformed(evt);
            }
        });

        cmdComboBoxs.setText("Indice e Item Seleccionado");
        cmdComboBoxs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdComboBoxsMouseClicked(evt);
            }
        });
        cmdComboBoxs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdComboBoxsActionPerformed(evt);
            }
        });

        cmdGuardar.setText("GUARDAR");
        cmdGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdGuardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(27, 27, 27))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkEquilateros)
                                    .addComponent(chkIsosceless)
                                    .addComponent(chkEscalenos)
                                    .addComponent(chkConos)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(cmdCheckBoxs))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(cboTrianguloss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdComboBoxs)
                            .addComponent(radEscalenos)
                            .addComponent(radEquilateross)
                            .addComponent(radIsosceless)
                            .addComponent(radCono)
                            .addComponent(cmdRadioss)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(cmdGuardar)))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkEquilateros)
                    .addComponent(radEquilateross))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkEscalenos)
                            .addComponent(radEscalenos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkIsosceless)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkConos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdCheckBoxs))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(radIsosceless)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radCono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdRadioss)))
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTrianguloss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdComboBoxs))
                .addGap(27, 27, 27)
                .addComponent(cmdGuardar)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CheckBox", jPanel4);

        txtRadioCirculo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRadioCirculoFocusLost(evt);
            }
        });
        txtRadioCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRadioCirculoActionPerformed(evt);
            }
        });
        txtRadioCirculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRadioCirculoKeyTyped(evt);
            }
        });

        jLabel14.setText("RADIO");

        jLabel22.setText("PERIMETRO:");

        jLabel23.setText("AREA:");

        jLabel24.setText("TIPO:");

        lblPerimetroCirculo.setText("00");

        lblTipoCirculo.setText("???");

        btnCalcularCirculo.setText("Calcular");
        btnCalcularCirculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularCirculoMouseClicked(evt);
            }
        });
        btnCalcularCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularCirculoActionPerformed(evt);
            }
        });

        cmdLimpiarCirculo.setText("Limpiar");
        cmdLimpiarCirculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdLimpiarCirculoMouseClicked(evt);
            }
        });

        txtAreaCirculo.setEditable(false);
        txtAreaCirculo.setText("00");

        btnInsertarCirculo.setText("Insertar");
        btnInsertarCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarCirculoActionPerformed(evt);
            }
        });

        btnActualziarCirculo.setText("Actualizar");
        btnActualziarCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualziarCirculoActionPerformed(evt);
            }
        });

        btnEliminarCirculo.setText("Eliminar");
        btnEliminarCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCirculoActionPerformed(evt);
            }
        });

        btnEliminarTodosCirculo.setText("Eliminar Todos");

        btnSalirCirculo.setText("Salir");

        tblCirculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCirculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCirculosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblCirculos);

        jLabel29.setText("CRUD");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnInsertarCirculo)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualziarCirculo)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarCirculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminarTodosCirculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalirCirculo))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtRadioCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblTildeRadioCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel24)))
                                    .addComponent(btnCalcularCirculo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(cmdLimpiarCirculo)
                                        .addGap(36, 36, 36)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPerimetroCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTipoCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAreaCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel29))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRadioCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel22)
                    .addComponent(lblPerimetroCirculo)
                    .addComponent(lblTildeRadioCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtAreaCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(lblTipoCirculo))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularCirculo)
                    .addComponent(cmdLimpiarCirculo)
                    .addComponent(jLabel29))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertarCirculo)
                    .addComponent(btnActualziarCirculo)
                    .addComponent(btnEliminarCirculo)
                    .addComponent(btnEliminarTodosCirculo)
                    .addComponent(btnSalirCirculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Circulos", jPanel5);

        jLabel17.setText("Ancho");

        jLabel18.setText("Alto");

        txtAnchoTriangulo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtAnchoTrianguloInputMethodTextChanged(evt);
            }
        });
        txtAnchoTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnchoTrianguloActionPerformed(evt);
            }
        });
        txtAnchoTriangulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnchoTrianguloKeyTyped(evt);
            }
        });

        jLabel19.setText("PERIMETRO:");

        jLabel20.setText("AREA:");

        jLabel21.setText("TIPO:");

        lblPerimetroTriangulo.setText("00");

        lblTipoTriangulo.setText("???");

        btnCalcularTriangulo.setText("Calcular");
        btnCalcularTriangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularTrianguloMouseClicked(evt);
            }
        });
        btnCalcularTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularTrianguloActionPerformed(evt);
            }
        });

        cmdLimpiarTriangulo.setText("Limpiar");

        txtAreaTriangulo.setText("00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcularTriangulo)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAnchoTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(txtAltoTriangulo))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmdLimpiarTriangulo)
                                .addGap(40, 40, 40)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTipoTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPerimetroTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAreaTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))))
                .addContainerGap(364, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(lblPerimetroTriangulo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtAreaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoTriangulo)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtAnchoTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtAltoTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularTriangulo)
                    .addComponent(cmdLimpiarTriangulo))
                .addContainerGap(401, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Triangulos", jPanel2);

        jLabel15.setText("Ancho");

        txtAnchoRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnchoRectanguloActionPerformed(evt);
            }
        });
        txtAnchoRectangulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnchoRectanguloKeyTyped(evt);
            }
        });

        jLabel16.setText("Alto");

        jLabel25.setText("PERIMETRO:");

        jLabel26.setText("AREA:");

        jLabel27.setText("TIPO");

        lblPerimetroRectangulo.setText("00");

        lblTipoRectangulo.setText("???");

        btnCalcularRectangulo.setText("Calcular");
        btnCalcularRectangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularRectanguloMouseClicked(evt);
            }
        });
        btnCalcularRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularRectanguloActionPerformed(evt);
            }
        });

        cmdLimpiarRectangulo.setText("Limpiar");
        cmdLimpiarRectangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdLimpiarRectanguloMouseClicked(evt);
            }
        });

        txtAreaRectangulo.setEditable(false);
        txtAreaRectangulo.setText("00");
        txtAreaRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaRectanguloActionPerformed(evt);
            }
        });

        jLabel28.setText("Los campos marcados con (*) Son OBLIGATORIOS");

        lblTildeAnchoRectangulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblTildeAnchoRectanguloFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnCalcularRectangulo))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAnchoRectangulo)
                                    .addComponent(txtAltoRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblTildeAnchoRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(80, 80, 80)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPerimetroRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAreaRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cmdLimpiarRectangulo))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel28)
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(lblPerimetroRectangulo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtAreaRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtAnchoRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTildeAnchoRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtAltoRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(lblTipoRectangulo))
                .addGap(47, 47, 47)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularRectangulo)
                    .addComponent(cmdLimpiarRectangulo))
                .addContainerGap(407, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rectangulos", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseClicked
        // TODO add your handling code here:
        //PROBLEMA TODA LA INFORMACI�N INGRESADA Y MOSTRADA EN LOS OBJETOS
        //CREADOS SON DE TIPO CADENA STRING 
        //Integer.parseInt(cadena) Float.parseFloat(cadena)
        if (txtAncho.getText().equals("") ||
            txtAlto.getText().equals("")){
          JOptionPane.showMessageDialog(null, "FAVOR COMPLETAR LOS CAMPOS OBLIGADOS (*)");
        }
        else{
            double ancho = Double.parseDouble(txtAncho.getText());
            double alto  = Double.parseDouble(txtAlto.getText());
            double perimetro  = ancho*2 + alto*2;
            double area  = ancho * alto;

            txtArea.setText(String.valueOf(area));
            lblPerimetro.setText(String.valueOf(perimetro));
        }
    }//GEN-LAST:event_btnCalcularMouseClicked

    public void recalcularRectangulos () {
      if (txtAncho.getText().equals("") ||
            txtAlto.getText().equals("")){
          JOptionPane.showMessageDialog(null, "FAVOR COMPLETAR LOS CAMPOS OBLIGADOS (*)");
        }
        else{
            double ancho = Double.parseDouble(txtAncho.getText());
            double alto  = Double.parseDouble(txtAlto.getText());
            double perimetro  = ancho*2 + alto*2;
            double area  = ancho * alto;

            txtArea.setText(String.valueOf(area));
            lblPerimetro.setText(String.valueOf(perimetro));
        }
    }
    
    private void cmdRadiosAccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRadiosAccion
        // TODO add your handling code here:
        if (radEquilatero.isSelected())
                JOptionPane.showMessageDialog(null, "Seleccion�: " + radEquilatero.getText());
        else if (radEscaleno.isSelected())
            JOptionPane.showMessageDialog(null, "Seleccion�: " + radEscaleno.getText());
        else if (radIsosceles.isSelected())
            JOptionPane.showMessageDialog(null, "Seleccion�: " + radIsosceles.getText());
        else
            JOptionPane.showMessageDialog(null, "SIN Seleccion");
    }//GEN-LAST:event_cmdRadiosAccion

    private void cmdCheckBoxAccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCheckBoxAccion
        // TODO add your handling code here:
        String cadena = "";
        if (chkEquilatero.isSelected())
            cadena = chkEquilatero.getText() + " ";
        if (chkEscaleno.isSelected())
            cadena = chkEscaleno.getText() + " ";
        if (chkIsosceles.isSelected())
            cadena = chkIsosceles.getText() + " ";
        if (cadena == "")
            cadena = "SIN TILDAR OPCIONES DE LAS CASILLAS";
        
        JOptionPane.showMessageDialog(null, cadena);
    }//GEN-LAST:event_cmdCheckBoxAccion

    private void cmdCombosAccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCombosAccion
        // TODO add your handling code here:
        int    indice = (int)   cboTriangulos.getSelectedIndex();
        String cadena = (String)cboTriangulos.getSelectedItem();
        indice = (int)   cboTriangulos.getSelectedIndex();
        cadena = (String)cboTriangulos.getSelectedItem();
        JOptionPane.showMessageDialog(null, "INDICE[" + indice + "] \nCADENA:"+cadena);
    }//GEN-LAST:event_cmdCombosAccion

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtAnchoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnchoKeyTyped
        // TODO add your handling code here:
        char tipoTecla = evt.getKeyChar();
        if (! Character.isDigit(tipoTecla))
            evt.consume();

        int maximo = 3;
        if (txtAncho.getText().length() > maximo-1)
            evt.consume();
    }//GEN-LAST:event_txtAnchoKeyTyped

    private void cmdLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdLimpiarMouseClicked
        // TODO add your handling code here:
        limpiarCajas();
    }//GEN-LAST:event_cmdLimpiarMouseClicked

    private void txtAnchoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnchoFocusLost
        // TODO add your handling code here:
        if (! txtAncho.getText().equals("")){
            lblTildeAncho.setIcon(iconoTilde);
            recalcularRectangulos();
        }
        else        
            lblTildeAncho.setIcon(null);      
        activarBotones();
    }//GEN-LAST:event_txtAnchoFocusLost

    private void txtAltoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAltoFocusLost
        // TODO add your handling code here:        
        if (! txtAlto.getText().equals("")){
            lblTildeAlto.setIcon(iconoTilde);
            recalcularRectangulos();
        }
        else        
            lblTildeAncho.setIcon(null);         
        //activarBotones();
    }//GEN-LAST:event_txtAltoFocusLost

    private void chkIsoscelessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIsoscelessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkIsoscelessActionPerformed

    private void cmdCheckBoxsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdCheckBoxsMouseClicked
        // TODO add your handling code here:
        String cadena = "";
        if (chkEquilateros.isSelected())
            cadena = cadena + chkEquilateros.getText() + " ";
        if (chkEscalenos.isSelected())
            cadena = cadena + chkEscalenos.getText() + " ";
        if (chkIsosceless.isSelected())
           cadena = cadena + chkIsosceless.getText() + " ";
        if (chkConos.isSelected())
           cadena = cadena + chkConos.getText() + " ";
        if (cadena == "")
            cadena = "SIN TILDAR OPCIONES DE LAS CASILLAS";
        JOptionPane.showMessageDialog(null, cadena);
    }//GEN-LAST:event_cmdCheckBoxsMouseClicked

    private void cmdRadiossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdRadiossMouseClicked
        // TODO add your handling code here:
        if (radEquilateross.isSelected())
            JOptionPane.showMessageDialog(null, "Seleccion�: " + radEquilateross.getText());
        else if (radEscalenos.isSelected())
            JOptionPane.showMessageDialog(null, "Seleccion�: " + radEscalenos.getText());
        else if (radIsosceless.isSelected())
            JOptionPane.showMessageDialog(null, "Seleccion�: " + radIsosceless.getText());
        else if (radCono.isSelected())
            JOptionPane.showMessageDialog(null, "Seleccion�: " + radCono.getText());
        else
            JOptionPane.showMessageDialog(null, "SIN Seleccion");
    }//GEN-LAST:event_cmdRadiossMouseClicked

    private void cmdComboBoxsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdComboBoxsMouseClicked
        // TODO add your handling code here:
        int indice    = (int) cboTrianguloss.getSelectedIndex();
        String cadena = (String)cboTrianguloss.getSelectedItem();
        JOptionPane.showMessageDialog(null, "INDICE[" + indice + "] \nCADENA:"+cadena);
    }//GEN-LAST:event_cmdComboBoxsMouseClicked

    private void cmdGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdGuardarMouseClicked
        // TODO add your handling code here:
        double ancho = Double.parseDouble(txtAncho.getText());
        //Cuadrado myCuadrado = new Cuadrado(ancho........);
        //controlador
    }//GEN-LAST:event_cmdGuardarMouseClicked

    private void cboTriangulossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTriangulossActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTriangulossActionPerformed

    private void cmdComboBoxsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdComboBoxsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdComboBoxsActionPerformed

    private void radEquilaterossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radEquilaterossMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_radEquilaterossMouseClicked

    private void btnInsertarCuadradoAccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarCuadradoAccion
        // TODO add your handling code here:
        insertarCuadrado();
    }//GEN-LAST:event_btnInsertarCuadradoAccion

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void btnEliminarCuadradoAccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuadradoAccion
        // TODO add your handling code here:
        eliminarCuadrado();
    }//GEN-LAST:event_btnEliminarCuadradoAccion

    private void btnActualizarCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCuadradoActionPerformed
        // TODO add your handling code here:
        actualizarCuadrados();
    }//GEN-LAST:event_btnActualizarCuadradoActionPerformed

    private void tblCuadradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCuadradosMouseClicked
        // TODO add your handling code here:
         int fila = tblCuadrados.getSelectedRow();
        //dtm.setValueAt(objeto, fila, columna);
        txtAncho.setText((String) dtm.getValueAt(fila, 0));
        txtAlto.setText((String) dtm.getValueAt(fila, 1));
        //JOptionPane.showMessageDialog(null, "SELECCIONADA ANCHO: " + cadena);        
    }//GEN-LAST:event_tblCuadradosMouseClicked

    private void btnEliminarTodosCuadradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodosCuadradosActionPerformed
        // TODO add your handling code here:
        limpiarCuadrado();
    }//GEN-LAST:event_btnEliminarTodosCuadradosActionPerformed

    private void txtRadioCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRadioCirculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRadioCirculoActionPerformed

    private void txtAnchoRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnchoRectanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnchoRectanguloActionPerformed

    private void txtAnchoTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnchoTrianguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnchoTrianguloActionPerformed

    private void txtAreaRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaRectanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaRectanguloActionPerformed

    private void btnCalcularCirculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularCirculoMouseClicked
        // TODO add your handling code here:
        //PROBLEMA TODA LA INFORMACI�N INGRESADA Y MOSTRADA EN LOS OBJETOS
        //CREADOS SON DE TIPO CADENA STRING 
        //Integer.parseInt(cadena) Float.parseFloat(cadena)
        if (txtRadioCirculo.getText().equals("") ){
          JOptionPane.showMessageDialog(null, "FAVOR COMPLETAR LOS CAMPOS OBLIGADOS (*)");
        }
        else{
            double radio = Double.parseDouble(txtRadioCirculo.getText());
            double perimetro  = 2 * Math.PI * radio;
            double area  = Math.PI * Math.pow(radio, 2);

            txtAreaCirculo.setText(String.valueOf(area));
            lblPerimetroCirculo.setText(String.valueOf(perimetro));
        }
    }//GEN-LAST:event_btnCalcularCirculoMouseClicked

    private void btnCalcularTrianguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularTrianguloMouseClicked
        // TODO add your handling code here:
         // TODO add your handling code here:
        double ancho = Double.parseDouble(txtAnchoTriangulo.getText());
        double alto = Double.parseDouble(txtAltoTriangulo.getText());
        double perimetro = ancho * 2 + alto * 2;
        double area = ancho * alto;

        txtAreaTriangulo.setText(String.valueOf(area));
        lblPerimetroTriangulo.setText(String.valueOf(perimetro));
    }//GEN-LAST:event_btnCalcularTrianguloMouseClicked

    private void btnCalcularRectanguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularRectanguloMouseClicked
         // TODO add your handling code here:
        //PROBLEMA TODA LA INFORMACIÓN INGRESADA Y MOSTRADA EN LOS OBJETOS
        //CREADOS SON DE TIPO CADENA STRING 
        //Integer.parseInt(cadena) Float.parseFloat(cadena)
        if (txtAnchoRectangulo.getText().equals("")
                || txtAltoRectangulo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FAVOR COMPLETAR LOS CAMPOS OBLIGADOS (*)");
        } else {
            double ancho = Double.parseDouble(txtAnchoRectangulo.getText());
            double alto = Double.parseDouble(txtAltoRectangulo.getText());
            double perimetro = ancho * 2 + alto * 2;
            double area = ancho * alto;

            txtAreaRectangulo.setText(String.valueOf(area));
            lblPerimetroRectangulo.setText(String.valueOf(perimetro));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularRectanguloMouseClicked

    private void btnCalcularTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularTrianguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularTrianguloActionPerformed

    private void txtAnchoTrianguloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnchoTrianguloKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnchoTrianguloKeyTyped

    private void txtAnchoRectanguloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnchoRectanguloKeyTyped
        // TODO add your handling code here:
        char tipoTecla = evt.getKeyChar();
        if (!Character.isDigit(tipoTecla)) {
            evt.consume();
        }
        int maximo = 3;
        if (txtAnchoRectangulo.getText().length() > maximo - 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAnchoRectanguloKeyTyped

    private void txtRadioCirculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRadioCirculoKeyTyped
        // TODO add your handling code here:
        char tipoTecla = evt.getKeyChar();
        if (! Character.isDigit(tipoTecla))
        evt.consume();

        int maximo = 3;
        if (txtRadioCirculo.getText().length() > maximo-1)
        evt.consume();
    }//GEN-LAST:event_txtRadioCirculoKeyTyped

    private void cmdLimpiarRectanguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdLimpiarRectanguloMouseClicked
        // TODO add your handling code here:
        limpiarCajas();
    }//GEN-LAST:event_cmdLimpiarRectanguloMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        limpiarCajas();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void cmdLimpiarCirculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdLimpiarCirculoMouseClicked
        // TODO add your handling code here:
        limpiarCajas();
    }//GEN-LAST:event_cmdLimpiarCirculoMouseClicked

    private void lblTildeAnchoRectanguloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblTildeAnchoRectanguloFocusLost
        // TODO add your handling code here:
         // TODO add your handling code here:
        int maximo = 3;
        if (!txtAnchoRectangulo.getText().equals("")) {
            lblTildeAnchoRectangulo.setIcon(iconoTilde);
        } else {
            lblTildeAnchoRectangulo.setIcon(null);
        }
    }//GEN-LAST:event_lblTildeAnchoRectanguloFocusLost

    private void txtRadioCirculoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRadioCirculoFocusLost
        // TODO add your handling code here:
            int maximo = 3;
        if (!txtRadioCirculo.getText().equals("")) {
            lblTildeRadioCirculo.setIcon(iconoTilde);
        } else {
            lblTildeRadioCirculo.setIcon(null);
        }
    }//GEN-LAST:event_txtRadioCirculoFocusLost

    private void btnInsertarCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarCirculoActionPerformed
        // TODO add your handling code here:
        insertarCirculo();
    }//GEN-LAST:event_btnInsertarCirculoActionPerformed

    private void btnEliminarCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCirculoActionPerformed
        // TODO add your handling code here:
        eliminarCirculo();
    }//GEN-LAST:event_btnEliminarCirculoActionPerformed

    private void btnActualziarCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualziarCirculoActionPerformed
        // TODO add your handling code here:
        //ActualizarCirculos();
    }//GEN-LAST:event_btnActualziarCirculoActionPerformed

    private void tblCirculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCirculosMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
         int fila = tblCirculos.getSelectedRow();
        //dtm.setValueAt(objeto, fila, columna);
        txtRadioCirculo.setText((String) dtm.getValueAt(fila, 0));
        //JOptionPane.showMessageDialog(null, "SELECCIONADA ANCHO: " + cadena); 
        
    }//GEN-LAST:event_tblCirculosMouseClicked

    private void txtAnchoTrianguloInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtAnchoTrianguloInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnchoTrianguloInputMethodTextChanged

    private void txtAnchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnchoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnchoActionPerformed

    private void btnCalcularCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCirculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularCirculoActionPerformed

    private void btnCalcularRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularRectanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularRectanguloActionPerformed

    public void limpiarCuadrado(){
        //int filas = tblRectangulos.getRowCount();
        int filas = dtm.getRowCount();
        for (int i=0; i<filas; i++){
           dtm.removeRow(0);
        }
    }
    
    public void actualizarCuadrados(){
        int fila = tblCuadrados.getSelectedRow();
        //dtm.setValueAt(objeto, fila, columna);
        if (! (fila >=0))
            JOptionPane.showMessageDialog(null, "SELECCIONAR LA FILA A ACTUALIZAR");
        else if (! txtAncho.getText().equals("") && 
                 ! txtAlto.getText().equals("")) {
                dtm.setValueAt(txtAncho.getText(), fila, 0);
                dtm.setValueAt(txtAlto.getText(), fila, 1);
                dtm.setValueAt(txtArea.getText(), fila, 2);
                dtm.setValueAt(lblPerimetro.getText(), fila, 3);
            }
            else
                JOptionPane.showMessageDialog(null, "COMPLETAR LOS CAMPOS DEL FORMULARIO");
   }
    
    public void actualizarCirculos(){
        int fila = tblCirculos.getSelectedRow();
        //dtm.setValueAt(objeto, fila, columna);
        if (! (fila >=0))
            JOptionPane.showMessageDialog(null, "SELECCIONAR LA FILA A ACTUALIZAR");
        else if (! txtRadioCirculo.getText().equals("") ) {
                dtm_circulo.setValueAt(txtRadioCirculo.getText(), fila, 0);
                dtm_circulo.setValueAt(txtArea.getText(), fila, 1);
                dtm_circulo.setValueAt(lblPerimetro.getText(), fila, 2);
            }
            else
                JOptionPane.showMessageDialog(null, "COMPLETAR LOS CAMPOS DEL FORMULARIO");
   }
    
    public void eliminarCuadrado(){
        int fila = tblCuadrados.getSelectedRow();
        //confirmar
        if (fila >=0){
            int opcion = JOptionPane.showConfirmDialog(null, "SEGURO DE ELIMINAR?");
            //System.out.println("opcion: " + opcion);
            if (opcion == 0) dtm.removeRow(fila);
        }
        else
        JOptionPane.showMessageDialog(null, "SELECCIONAR LA FILA A ELIMINAR");
    }
    
    public void eliminarCirculo(){
        int fila = tblCirculos.getSelectedRow();
        //confirmar
        if (fila >=0){
            int opcion = JOptionPane.showConfirmDialog(null, "SEGURO DE ELIMINAR?");
            //System.out.println("opcion: " + opcion);
            if (opcion == 0) dtm_circulo.removeRow(fila);
        }
        else
        JOptionPane.showMessageDialog(null, "SELECCIONAR LA FILA A ELIMINAR");
    }
    
    
    public void insertarRectangulo(){
        //alternative 1 creando todo al tiempo
        /*dtm.addRow(new Object[]{
        txtAncho.getText(),
        txtLargo.getText(),
        txtArea.getText(),
        txtPerimetro.getText()
        });*/
        //alternative 2, creando por partes
        String[] datos = new String[5];
        datos[0] = txtAncho.getText();
        datos[1] = txtAlto.getText();
        datos[2] = txtArea.getText();
        datos[3] = lblPerimetro.getText();
        dtm.addRow(datos);
        limpiarCajas();
    }
    
    public void insertarCuadrado(){
        //alternative 1 creando todo al tiempo
        /*dtm.addRow(new Object[]{
        txtAncho.getText(),
        txtLargo.getText(),
        txtArea.getText(),
        txtPerimetro.getText()
        });*/
        //alternative 2, creando por partes
        String[] datos = new String[5];
        datos[0] = txtAncho.getText();
        datos[1] = txtAlto.getText();
        datos[2] = txtArea.getText();
        datos[3] = lblPerimetro.getText();
        dtm.addRow(datos);
        limpiarCajas();
    }
    
    public void insertarCirculo(){
        //alternative 1 creando todo al tiempo
        /*dtm.addRow(new Object[]{
        txtAncho.getText(),
        txtLargo.getText(),
        txtArea.getText(),
        txtPerimetro.getText()
        });*/
        //alternative 2, creando por partes
        String[] datos = new String[4];
        datos[0] = txtRadioCirculo.getText();
        datos[1] = txtArea.getText();
        datos[2] = lblPerimetro.getText();
        dtm_circulo.addRow(datos);
        limpiarCajas();
    }
    
    public void activarBotones(){
      if (! txtAncho.getText().equals("") && 
          ! txtAlto.getText().equals("")) 
        btnCalcular.setEnabled(true);
      else btnCalcular.setEnabled(false);
    }
    
    public void limpiarCajas(){
       txtAncho.setText("");
       txtAlto.setText("");
       lblPerimetro.setText("");
       txtArea.setText("");
       
       txtAnchoRectangulo.setText("");
       txtAltoRectangulo.setText("");
       lblPerimetroRectangulo.setText("");
       txtAreaRectangulo.setText("");
       lblTipoRectangulo.setText("");
       
       txtRadioCirculo.setText("");
       lblPerimetroCirculo.setText("");
       txtAreaCirculo.setText("");
    }
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
            java.util.logging.Logger.getLogger(frmFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCuadrado;
    private javax.swing.JButton btnActualziarCirculo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcularCirculo;
    private javax.swing.JButton btnCalcularRectangulo;
    private javax.swing.JButton btnCalcularTriangulo;
    private javax.swing.JButton btnEliminarCirculo;
    private javax.swing.JButton btnEliminarCuadrado;
    private javax.swing.JButton btnEliminarTodosCirculo;
    private javax.swing.JButton btnEliminarTodosCuadrados;
    private javax.swing.JButton btnInsertarCirculo;
    private javax.swing.JButton btnInsertarCuadrado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirCirculo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboTriangulos;
    private javax.swing.JComboBox<String> cboTrianguloss;
    private javax.swing.JCheckBox chkConos;
    private javax.swing.JCheckBox chkEquilatero;
    private javax.swing.JCheckBox chkEquilateros;
    private javax.swing.JCheckBox chkEscaleno;
    private javax.swing.JCheckBox chkEscalenos;
    private javax.swing.JCheckBox chkIsosceles;
    private javax.swing.JCheckBox chkIsosceless;
    private javax.swing.JButton cmdCheckBox;
    private javax.swing.JButton cmdCheckBoxs;
    private javax.swing.JButton cmdComboBoxs;
    private javax.swing.JButton cmdCombos;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLimpiarCirculo;
    private javax.swing.JButton cmdLimpiarRectangulo;
    private javax.swing.JButton cmdLimpiarTriangulo;
    private javax.swing.JButton cmdRadios;
    private javax.swing.JButton cmdRadioss;
    private javax.swing.ButtonGroup gradTriangulos;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblPerimetroCirculo;
    private javax.swing.JLabel lblPerimetroRectangulo;
    private javax.swing.JLabel lblPerimetroTriangulo;
    private javax.swing.JLabel lblTildeAlto;
    private javax.swing.JLabel lblTildeAncho;
    private javax.swing.JLabel lblTildeAnchoRectangulo;
    private javax.swing.JLabel lblTildeRadioCirculo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipoCirculo;
    private javax.swing.JLabel lblTipoRectangulo;
    private javax.swing.JLabel lblTipoTriangulo;
    private javax.swing.JRadioButton radCono;
    private javax.swing.JRadioButton radEquilatero;
    private javax.swing.JRadioButton radEquilateross;
    private javax.swing.JRadioButton radEscaleno;
    private javax.swing.JRadioButton radEscalenos;
    private javax.swing.JRadioButton radIsosceles;
    private javax.swing.JRadioButton radIsosceless;
    private javax.swing.JTable tblCirculos;
    private javax.swing.JTable tblCuadrados;
    private javax.swing.JTextField txtAlto;
    private javax.swing.JTextField txtAltoRectangulo;
    private javax.swing.JTextField txtAltoTriangulo;
    private javax.swing.JTextField txtAncho;
    private javax.swing.JTextField txtAnchoRectangulo;
    private javax.swing.JTextField txtAnchoTriangulo;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtAreaCirculo;
    private javax.swing.JTextField txtAreaRectangulo;
    private javax.swing.JTextField txtAreaTriangulo;
    private javax.swing.JTextField txtRadioCirculo;
    // End of variables declaration//GEN-END:variables
}
