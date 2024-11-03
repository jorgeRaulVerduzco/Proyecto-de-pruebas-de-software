/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import DTO.ProductoDTO;
import DTO.UsuarioDTO;
import IProductosVendidos.IListaProductosVendidos;
import Negocio.ProductoSeleccionado;
import Negocio.UsuarioSesion;
import ProductosVendidos.ProductosVendidos;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class HistorialProductosVendidos extends javax.swing.JFrame {

    IListaProductosVendidos productosVendidos;

    public HistorialProductosVendidos() {
        productosVendidos = new ProductosVendidos();
        initComponents();
        tabla();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblConsultas1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.activeCaptionBorder);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Tus Ventas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(104, 104, 104))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jToggleButton4.setBackground(new java.awt.Color(102, 102, 102));
        jToggleButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(0, 255, 51));
        jToggleButton4.setText("<");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jScrollPane4.setBackground(new java.awt.Color(227, 227, 227));
        jScrollPane4.setFocusable(false);

        tblConsultas = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tblConsultas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblConsultas1.getTableHeader().setReorderingAllowed(false);
        tblConsultas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultas1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblConsultas1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addContainerGap())
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        VentaDeProductosMenu MU = new VentaDeProductosMenu();
        MU.setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    public void tabla() {
        tblConsultas1.setDefaultRenderer(Object.class, new RenderTabla());

        DefaultTableModel modeloTabla = new DefaultTableModel();
        tblConsultas1.setModel(modeloTabla);

        tblConsultas1.setRowHeight(40);

        // Definición de las columnas y sus encabezados
        String[] encabezados = {"ISBN", "Titulo", "Autor", "Tipo", "Editorial", "Precio", "Categoria", "Cantidad"};
        modeloTabla.setColumnIdentifiers(encabezados);

        // Configuración del ancho preferido de las columnas
        int[] anchos = {100, 100, 100, 100, 100, 100, 100, 50}; // Ajusta el ancho de la última columna
        for (int i = 0; i < anchos.length; i++) {
            tblConsultas1.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
    }

    public void llenarTabla() {
        UsuarioDTO usario = UsuarioSesion.usuarioSesion();
        String nombreVendedor = usario.getNombreUsuario();
        List<ProductoDTO> productosEncontrados = productosVendidos.buscarProductosPorVendedor(nombreVendedor);
        DefaultTableModel modeloTabla = (DefaultTableModel) tblConsultas1.getModel();

        modeloTabla.setRowCount(0);

        for (ProductoDTO producto : productosEncontrados) {
            Object[] fila = {
                producto.getIsbn(),
                producto.getTitulo(),
                producto.getAutor(),
                producto.getTipo(),
                producto.getEditorial(),
                producto.getPrecio(),
                producto.getCategoria(),
                producto.getCantidad()
            };
            modeloTabla.addRow(fila);
        }
    }
    private void tblConsultas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultas1MouseClicked

       
    }//GEN-LAST:event_tblConsultas1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JTable tblConsultas;
    private javax.swing.JTable tblConsultas1;
    // End of variables declaration//GEN-END:variables
}