package Aplica;

/*  Se importan las cñases  */
import Clases.Clibros;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class frm_registro extends javax.swing.JFrame {

    /*  Se instancia las clases y modelos de las listas  */
    Clibros objLi;
    DefaultListModel moLibro, moEditorial, moClase, moAño, moPaginas, moCosto;
    DefaultListModel moEstadisticas;

    /*  El constructor del formulario  */
    public frm_registro() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.setLocationRelativeTo(null);
        llenaEditorial();
        llenaClase();
        cargaModelos();
    }

    /*  Metodos Get y Set  */
    String getLibro() {
        return txt_nombre.getText();
    }

    String getEditorial() {
        return String.valueOf(cbx_Editorial.getSelectedItem());
    }

    String getClase() {
        return String.valueOf(cbx_clase.getSelectedItem());
    }

    int getAño() {
        return Integer.parseInt(txt_anio.getText());
    }

    int getPaginas() {
        return Integer.parseInt(txt_paginas.getText());
    }

    double getCosto() {
        return Double.parseDouble(txt_Costo.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        lstEstadistica = new javax.swing.JList<>();
        btn_estadisticas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbx_Editorial = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbx_clase = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_anio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_paginas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Costo = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        lstCosto = new javax.swing.JList<>();
        jScrollPane12 = new javax.swing.JScrollPane();
        lstPaginas = new javax.swing.JList<>();
        jScrollPane11 = new javax.swing.JScrollPane();
        lstAño = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        lstClase = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        lstEditorial = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        lstLibro = new javax.swing.JList<>();
        btn_Editar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        Btn_Buscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_total_l = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DEL LIBRO");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jLabel14.setText("X");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane14.setViewportView(lstEstadistica);

        btn_estadisticas.setText("ESTADISTICAS");
        btn_estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estadisticasActionPerformed(evt);
            }
        });

        jLabel2.setText("-- Nombre del Libro --");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        jLabel7.setText("-- Tipo de Editorial --");

        jLabel6.setText("-- Clase de Libro --");

        jLabel3.setText("-- Año --");

        txt_anio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_anioKeyTyped(evt);
            }
        });

        jLabel4.setText("--Paginas--");

        txt_paginas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_paginasKeyTyped(evt);
            }
        });

        jLabel5.setText("--Costo--");

        txt_Costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CostoKeyTyped(evt);
            }
        });

        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new_add_insert_file_13948.png"))); // NOI18N
        btn_registrar.setToolTipText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emblemunreadable_93487 (2).png"))); // NOI18N
        btn_limpiar.setToolTipText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        lstCosto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstCostoMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(lstCosto);

        lstPaginas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstPaginasMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(lstPaginas);

        lstAño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstAñoMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(lstAño);

        lstClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstClaseMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(lstClase);

        lstEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstEditorialMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(lstEditorial);

        lstLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstLibroMouseClicked(evt);
            }
        });
        lstLibro.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstLibroValueChanged(evt);
            }
        });
        jScrollPane8.setViewportView(lstLibro);

        btn_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DocumentEdit_40924.png"))); // NOI18N
        btn_Editar.setToolTipText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        Btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/document_delete_256_icon-icons.com_75995.png"))); // NOI18N
        Btn_Eliminar.setToolTipText("Eliminar");
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });

        Btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search_book_open_search_locate_6178.png"))); // NOI18N
        Btn_Buscar.setToolTipText("Buscar");
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });

        jLabel8.setText("-- Nombre del Libro --");

        jLabel9.setText("-- Edit. --");

        jLabel10.setText("-- Clase de Libro --");

        jLabel11.setText("-- Año --");

        jLabel12.setText("--Paginas--");

        jLabel13.setText("--Costo--");

        txt_total_l.setBackground(new java.awt.Color(0, 0, 0));
        txt_total_l.setColumns(20);
        txt_total_l.setFont(new java.awt.Font("Monospaced", 1, 10)); // NOI18N
        txt_total_l.setForeground(new java.awt.Color(255, 255, 255));
        txt_total_l.setRows(5);
        jScrollPane2.setViewportView(txt_total_l);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbx_Editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbx_clase, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_Editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_clase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_estadisticas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        try {
            /*  Se crea un numero modelo y en el constructor se agrega los datos  */
            objLi = new Clibros(getLibro(), getEditorial(), getClase(),
                    getAño(), getPaginas(), getCosto());
            llenaModelos();
            LimpiarCampos();
            this.txt_total_l.append(""+CantidadLibrosEditorial());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion " + ex.getMessage());
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_estadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estadisticasActionPerformed
        try {
            if (moLibro.size() <= 0) {
                JOptionPane.showMessageDialog(null, "No hay libros de donde se pueda sacar las estadisticas");
                return;
            }
            /*  Se limpia las clases y se realiza el modelo  */
            moEstadisticas.clear();
            moEstadisticas.addElement("Numero de Libro de Análisis de la Editorial B es: " + objLi.getTAnalisis());
            int mayor = Integer.MIN_VALUE;
            int pos = 0;
            for (int i = 0; i < moLibro.getSize(); i++) {
                if (Integer.parseInt(moAño.elementAt(i).
                        toString()) > mayor) {
                    mayor = Integer.parseInt(moAño.elementAt(i).toString());
                    pos = i;
                }
            }
            moEstadisticas.addElement("Libro con el año de edición más reciente: " + moLibro.getElementAt(pos));
            int menor = Integer.MAX_VALUE;
            for (int i = 0; i < moLibro.getSize(); i++) {
                if (Integer.parseInt(moPaginas.elementAt(i).
                        toString()) < menor) {
                    menor = Integer.parseInt(moPaginas.elementAt(i).toString());
                    pos = i;
                }
            }
            moEstadisticas.addElement("Editorial con libro de menor pagina es: " + moEditorial.getElementAt(pos));
            double mayorCosto = Double.MIN_VALUE;
            for (int i = 0; i < moLibro.getSize(); i++) {
                if (Double.parseDouble(moCosto.elementAt(i)
                        .toString()) > mayorCosto) {
                    mayorCosto = Double.parseDouble(moCosto.elementAt(i)
                            .toString());
                    pos = i;
                }
            }
            moEstadisticas.addElement("Libro con mayor costo es:  " + moLibro.getElementAt(pos));

            // Metdos Añadidos
            moEstadisticas.addElement(LibroConMayorPaginas());
            moEstadisticas.addElement(NombreLibroMasLargo());
            moEstadisticas.addElement(NombreLibroMasCorto());
            moEstadisticas.addElement(CostoTotalLibros());
            moEstadisticas.addElement(CantidadLibrosEditorial());
        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion  " + ex.getMessage());
        }
    }//GEN-LAST:event_btn_estadisticasActionPerformed

    private void lstLibroValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstLibroValueChanged

    }//GEN-LAST:event_lstLibroValueChanged

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        try {
            if (!Validar()) {
                return;
            }
            /*  Se obtiene el nombre del libro  */
            String NombreLibro = JOptionPane.showInputDialog("Ingresar el nombre del libro al cual aplicar los cambios");
            if (NombreLibro.isEmpty() || NombreLibro == null) {
                return;
            }

            /*  Se busca el lugar e index del campo a realizar los campos  */
            for (int i = 0; i < moLibro.size(); i++) {
                String nombre = moLibro.getElementAt(i).toString();
                if (NombreLibro.equals(nombre)) {
                    SeleccionarTodasFilas(i);
                    moLibro.setElementAt(getLibro(), i);
                    moEditorial.setElementAt(getEditorial(), i);
                    moClase.setElementAt(getClase(), i);
                    moAño.setElementAt(getAño(), i);
                    moPaginas.setElementAt(getPaginas(), i);
                    moCosto.setElementAt(getCosto(), i);
                    break;
                }
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion  " + ex.getMessage());
        }
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
        try {
            /*  Se selecciona la fila y se elimna todos los datos iguales a ella   */
            int index = lstLibro.getSelectedIndex();
            EliminarByIndex(index);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion  " + ex.getMessage());
        }
    }//GEN-LAST:event_Btn_EliminarActionPerformed

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        try {
            /*  Se obtiene el nombre del libro  */
            String NombreLibro = JOptionPane.showInputDialog("Ingresar el nombre del libro a buscar");
            if (NombreLibro.isEmpty() || NombreLibro == null) {
                return;
            }

            /*  Se busca en la lista y cargan los datos el sus cuadros correspondientes  */
            for (int i = 0; i < moLibro.size(); i++) {
                String nombre = moLibro.getElementAt(i).toString();
                if (NombreLibro.equals(nombre)) {
                    SeleccionarTodasFilas(i);
                    MostrarDatosCampos();
                    break;
                }
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion  " + ex.getMessage());
        }
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        /*  Se limpia los datos de los cuadros y las listas  */
        LimpiarCampos();
        cargaModelos();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void lstLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstLibroMouseClicked
        int index = lstLibro.getSelectedIndex();
        SeleccionarTodasFilas(index);
    }//GEN-LAST:event_lstLibroMouseClicked

    private void lstEditorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstEditorialMouseClicked
        int index = lstEditorial.getSelectedIndex();
        SeleccionarTodasFilas(index);
    }//GEN-LAST:event_lstEditorialMouseClicked

    private void lstClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstClaseMouseClicked
        int index = lstClase.getSelectedIndex();
        SeleccionarTodasFilas(index);
    }//GEN-LAST:event_lstClaseMouseClicked

    private void lstAñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstAñoMouseClicked
        int index = lstAño.getSelectedIndex();
        SeleccionarTodasFilas(index);
    }//GEN-LAST:event_lstAñoMouseClicked

    private void lstPaginasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPaginasMouseClicked
        int index = lstPaginas.getSelectedIndex();
        SeleccionarTodasFilas(index);
    }//GEN-LAST:event_lstPaginasMouseClicked

    private void lstCostoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCostoMouseClicked
        int index = lstLibro.getSelectedIndex();
        SeleccionarTodasFilas(index);
    }//GEN-LAST:event_lstCostoMouseClicked

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        try {
            if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion  " + ex.getMessage());
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_anioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_anioKeyTyped
        try {
            char caracter = evt.getKeyChar();
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b') || txt_anio.getText().length() == 4) {
                evt.consume();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion  " + ex.getMessage());
        }
    }//GEN-LAST:event_txt_anioKeyTyped

    private void txt_paginasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paginasKeyTyped
        try {
            char caracter = evt.getKeyChar();
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b') || txt_paginas.getText().length() == 4) {
                evt.consume();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion  " + ex.getMessage());
        }
    }//GEN-LAST:event_txt_paginasKeyTyped

    private void txt_CostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CostoKeyTyped
        try {
            char caracter = evt.getKeyChar();
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b') || txt_Costo.getText().length() == 4) {
                evt.consume();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion  " + ex.getMessage());
        }
    }//GEN-LAST:event_txt_CostoKeyTyped

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
         int r = JOptionPane.showOptionDialog(this, "Estas seguro de Salir", "Salida",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Si", "No"}, "Si");
        if (r == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    //  Para poder seleccionar todas las filas a la vez
    private void SeleccionarTodasFilas(int index) {
        lstLibro.setSelectedIndex(index);
        lstEditorial.setSelectedIndex(index);
        lstClase.setSelectedIndex(index);
        lstAño.setSelectedIndex(index);
        lstPaginas.setSelectedIndex(index);
        lstCosto.setSelectedIndex(index);
    }

    // elimina los elentos de la lista
    private void EliminarByIndex(int index) {
        moLibro.remove(index);
        moEditorial.remove(index);
        moClase.remove(index);
        moAño.remove(index);
        moPaginas.remove(index);
        moCosto.remove(index);
    }

    // Limpia los campos del textbox
    private void LimpiarCampos() {
        txt_nombre.setText("");
        txt_anio.setText("");
        txt_Costo.setText("");
        txt_paginas.setText("");
        txt_total_l.setText("");
    }

    /*  se crga los modelos de las listas  */
    void cargaModelos() {
        moLibro = new DefaultListModel();
        moEditorial = new DefaultListModel();
        moClase = new DefaultListModel();
        moAño = new DefaultListModel();
        moPaginas = new DefaultListModel();
        moCosto = new DefaultListModel();
        moEstadisticas = new DefaultListModel();

        lstLibro.setModel(moLibro);
        lstEditorial.setModel(moEditorial);
        lstClase.setModel(moClase);
        lstAño.setModel(moAño);
        lstPaginas.setModel(moPaginas);
        lstCosto.setModel(moCosto);
        lstEstadistica.setModel(moEstadisticas);
    }

    /*  se agregan los datos a las listas  */
    void llenaModelos() {
        moLibro.addElement(objLi.getNombre());
        moEditorial.addElement(objLi.getEditorial());
        moClase.addElement(objLi.getClase());
        moAño.addElement(objLi.getAño());
        moPaginas.addElement(objLi.getPaginas());
        moCosto.addElement(objLi.getCosto());
    }

    /*  se llena los campos del combo editorial  */
    void llenaEditorial() {
        cbx_Editorial.addItem("A");
        cbx_Editorial.addItem("B");
        cbx_Editorial.addItem("C");
    }

    /*  se llena los campos del combo clase  */
    void llenaClase() {
        cbx_clase.addItem("Programacion");
        cbx_clase.addItem("Analisis");
        cbx_clase.addItem("Diseño");
    }

    /*  se llena los datos de las listas a los objetos  */
    private void MostrarDatosCampos() {
        txt_nombre.setText(lstLibro.getSelectedValue());
        cbx_Editorial.setSelectedItem(lstEditorial.getSelectedValue());
        cbx_clase.setSelectedItem(lstClase.getSelectedValue());
        String anio = String.valueOf(lstAño.getSelectedValue());
        txt_anio.setText(anio);
        String paginas = String.valueOf(lstPaginas.getSelectedValue());
        txt_paginas.setText(paginas);
        String costo = String.valueOf(lstCosto.getSelectedValue());
        txt_Costo.setText(costo);
    }

    /*  Cantidad de libros por editorial  */
    private String CantidadLibrosEditorial() {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < moEditorial.getSize(); i++) {
            String Letra = moEditorial.elementAt(i).toString();
            switch (Letra) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "C":
                    c++;
                    break;
            }
        }
        return "Cantidad por Editorial:\n A ->[ " + a + " ] - B ->[ " + b + " ] - C ->[ " + c + " ]";
    }

    /*  Cuanto sale todos los libros  */
    private String CostoTotalLibros() {

        double precioTotal = 0;
        for (int i = 0; i < moCosto.getSize(); i++) {
            precioTotal += Double.parseDouble(moCosto.elementAt(i).toString());
        }

        return "Precio Total de los libros es: " + precioTotal;
    }

    /*  Que librot iene el nombre las largo  */
    private String NombreLibroMasLargo() {
        String nombreLargo = "";
        for (int i = 0; i < moLibro.getSize(); i++) {
            String nombre = moLibro.elementAt(i).toString();
            if (nombre.length() > nombreLargo.length()) {
                nombreLargo = nombre;
            }
        }
        return "El libro con el nombre mas largo es: " + nombreLargo;
    }

    /* El libro con mayor paginas  */
    private String LibroConMayorPaginas() {
        int dato = 0;
        for (int i = 0; i < moPaginas.size(); i++) {
            int pag = Integer.parseInt(moPaginas.elementAt(i).toString());
            if (pag > dato) {
                dato = pag;
            }
        }
        return "El libro con mas paginas es: " + dato;
    }

    /*  Libro con el nombre mas corto */
    private String NombreLibroMasCorto() {
        String nombreCorto = moLibro.getElementAt(0).toString();
        for (int i = 0; i < moLibro.getSize(); i++) {
            String nombre = moLibro.elementAt(i).toString();
            if (nombreCorto.length() <= nombre.length()) {
                nombreCorto = nombre;
            }
            else if (nombre.length() <= nombreCorto.length()) {
                nombreCorto = nombre;
            }
        }
        return "El libro con el nombre mas Corto es: " + nombreCorto;
    }

    /*  se valida si lleno os campos para editar los campos  */
    private boolean Validar() {
        if (txt_nombre.getText().isEmpty() || txt_anio.getText().isEmpty() || txt_Costo.getText().isEmpty() || txt_paginas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos por favor");
            return false;
        } else {
            return true;
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
            java.util.logging.Logger.getLogger(frm_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_estadisticas;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JComboBox<String> cbx_Editorial;
    private javax.swing.JComboBox<String> cbx_clase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> lstAño;
    private javax.swing.JList<String> lstClase;
    private javax.swing.JList<String> lstCosto;
    private javax.swing.JList<String> lstEditorial;
    private javax.swing.JList<String> lstEstadistica;
    private javax.swing.JList<String> lstLibro;
    private javax.swing.JList<String> lstPaginas;
    private javax.swing.JTextField txt_Costo;
    private javax.swing.JTextField txt_anio;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_paginas;
    private javax.swing.JTextArea txt_total_l;
    // End of variables declaration//GEN-END:variables
}
