


import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Jon_kevin27
 */
public class Gestión_de_Productos extends javax.swing.JInternalFrame {
    
    private TreeSet <String>listaProductos;
    /**
     * Creates new form Gestión_de_Productos
     */
    public Gestión_de_Productos(TreeSet <String>lista) {
        initComponents();
        jTxt_codigo.setEnabled(false);
        jTxt_descripcion.setEnabled(false);
        jTxt_precio.setEnabled(false);
        jCbx_Categoriacarga.setEnabled(false);
        jSpinner_stock.setEnabled(false);
        listaProductos= lista;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCbx_Categoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Productos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTxt_descripcion = new javax.swing.JTextField();
        jTxt_codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxt_precio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCbx_Categoriacarga = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinner_stock = new javax.swing.JSpinner<>();
        jBt_buscar = new javax.swing.JButton();
        jBt_cerrar = new javax.swing.JButton();
        jBt_Eliminar = new javax.swing.JButton();
        jBt_actualizar = new javax.swing.JButton();
        jBt_guardar = new javax.swing.JButton();
        jBt_nuevo = new javax.swing.JButton();

        setTitle("De Todo S.A.: Productos");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel1.setText("Gestión de Productos");

        jLabel2.setText("Filtrar por Categoría:");

        jCbx_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Precio", "Categoría", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Productos);

        jLabel3.setText("Código:");

        jLabel4.setText("Descripción:");

        jLabel5.setText("Precio:");

        jCbx_Categoriacarga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Rubro:");

        jLabel7.setText("Stock:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxt_descripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTxt_codigo)
                    .addComponent(jCbx_Categoriacarga, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTxt_precio)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSpinner_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 319, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTxt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbx_Categoriacarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jSpinner_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jBt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt_buscarActionPerformed(evt);
            }
        });

        jBt_cerrar.setText("Cerrar");
        jBt_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt_cerrarActionPerformed(evt);
            }
        });

        jBt_Eliminar.setText("Eliminar");

        jBt_actualizar.setText("Actualizar");

        jBt_guardar.setText("Guardar");
        jBt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt_guardarActionPerformed(evt);
            }
        });

        jBt_nuevo.setText("Nuevo");
        jBt_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt_nuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCbx_Categoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jBt_nuevo)
                        .addGap(34, 34, 34)
                        .addComponent(jBt_guardar)
                        .addGap(32, 32, 32)
                        .addComponent(jBt_actualizar)
                        .addGap(32, 32, 32)
                        .addComponent(jBt_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBt_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBt_buscar))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCbx_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jBt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBt_cerrar)
                        .addGap(52, 52, 52)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBt_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBt_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBt_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBt_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBt_buscarActionPerformed

    private void jBt_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt_cerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBt_cerrarActionPerformed

    private void jBt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt_guardarActionPerformed
        if (!validarCamposVacios()) {
            int codigo = Integer.parseInt(jTxt_codigo.getText());
            String descripcion = jTxt_descripcion.getText();
            double precio = Double.parseDouble(jTxt_precio.getText());
            int stock =  jSpinner_stock.getValue()  ;

            Producto productoNuevo = new Producto(codigo, descripcion, precio, stock);
            this.listaProductos.add(productoNuevo);
            jBt_nuevo.setEnabled(true);
            jTxt_codigo.setText("");
            jTxt_descripcion.setText("");
            jTxt_precio.setText("");
            jSpinner_stock.setValue("");
        } else {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");

        }
    }//GEN-LAST:event_jBt_guardarActionPerformed

    private void jBt_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt_nuevoActionPerformed
        jTxt_codigo.setEnabled(true);
        jTxt_descripcion.setEnabled(true);
        jTxt_precio.setEnabled(true);
        jCbx_Categoriacarga.setEnabled(true);
        jSpinner_stock.setEnabled(true);
        jBt_buscar.setEnabled(true);
        jBt_cerrar.setEnabled(true);
        jBt_actualizar.setEnabled(false);
        jBt_guardar.setEnabled(false);
        jBt_Eliminar.setEnabled(false);
        jBt_nuevo.setEnabled(true);
    }//GEN-LAST:event_jBt_nuevoActionPerformed

    public boolean validarCamposVacios() {
//        return jTxt_codigo.setText().equals("") || jTxt_descripcion.setText().equals("") || jTxt_precio.setText().equals("")|| jCbx_Categoriacarga.setText().equals("")|| jjSpinner_stock.setText().equals("");
                return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBt_Eliminar;
    private javax.swing.JButton jBt_actualizar;
    private javax.swing.JButton jBt_buscar;
    private javax.swing.JButton jBt_cerrar;
    private javax.swing.JButton jBt_guardar;
    private javax.swing.JButton jBt_nuevo;
    private javax.swing.JComboBox<String> jCbx_Categoria;
    private javax.swing.JComboBox<String> jCbx_Categoriacarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner<Integer> jSpinner_stock;
    private javax.swing.JTable jTable_Productos;
    private javax.swing.JTextField jTxt_codigo;
    private javax.swing.JTextField jTxt_descripcion;
    private javax.swing.JTextField jTxt_precio;
    // End of variables declaration//GEN-END:variables
}
