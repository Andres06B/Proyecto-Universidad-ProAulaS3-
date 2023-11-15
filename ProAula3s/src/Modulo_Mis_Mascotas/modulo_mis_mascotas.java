package Modulo_Mis_Mascotas;

import Conexion.ConexionMysql;
import com.mysql.cj.jdbc.ConnectionImpl;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


import javax.swing.table.DefaultTableModel;

import javax.swing.table.TableRowSorter;

public class modulo_mis_mascotas extends javax.swing.JPanel {

    ConexionMysql con = new ConexionMysql();
    ConnectionImpl cn = con.conectar();
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    TableRowSorter trs;

    public modulo_mis_mascotas() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        campo_documento = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtbuscar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(104, 207, 163));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(104, 207, 163));
        jLabel1.setText("Mis Mascotas");

        jSeparator1.setBackground(new java.awt.Color(104, 207, 163));
        jSeparator1.setForeground(new java.awt.Color(104, 207, 163));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Modulo_Mis_Mascotas/imagenes/Diseño sin título1.png"))); // NOI18N

        Jtabla.setBackground(new java.awt.Color(255, 255, 255));
        Jtabla.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        Jtabla.setForeground(new java.awt.Color(0, 0, 0));
        Jtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombre", "Tipo Mascota", "Raza", "Sexo", "Peso", "Edad"
            }
        ));
        Jtabla.setShowHorizontalLines(true);
        Jtabla.setShowVerticalLines(true);
        Jtabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Jtabla);

        jLabel3.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Inserta tu documento para buscar a tus Mascotas");

        campo_documento.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(104, 207, 163));

        txtbuscar.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 14)); // NOI18N
        txtbuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtbuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbuscar.setText("Buscar");
        txtbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(campo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JtablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtablaMouseClicked

    }//GEN-LAST:event_JtablaMouseClicked

    private void txtbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbuscarMouseClicked
       String busqueda = campo_documento.getText();
if (busqueda.isEmpty()) {
    JOptionPane.showMessageDialog(null,
            "NO HAY DATOS DENTRO DEL CAMPO");
} else {
    if(modelo != null){
        modelo.getDataVector().clear();
    }
    String sql = "SELECT * FROM proyectodeaulads3.registro_mascotas "
            + "WHERE ndocumento LIKE '%" + busqueda + "%'";
    try {
        st = (Statement) cn.createStatement();
        rs = st.executeQuery(sql);
        Object[] registromascotas = new Object[7];
        modelo = (DefaultTableModel) Jtabla.getModel();
        if (!rs.isBeforeFirst()) {
            JOptionPane.showMessageDialog(null,
                    "NO SE ENCONTRARON DATOS");
        } else {
            while (rs.next()) {
                registromascotas[0] = rs.getString("ndocumento");
                registromascotas[1] = rs.getString("nombre");
                registromascotas[2] = rs.getString("tipo_mascota");
                registromascotas[3] = rs.getString("raza");
                registromascotas[4] = rs.getString("sexo");
                registromascotas[5] = rs.getString("peso");
                registromascotas[6] = rs.getString("edad");
                modelo.addRow(registromascotas);
            }
            System.out.println("Numero columnas: " + modelo.getRowCount());
            Jtabla.setModel(modelo);
        }
    } catch (Exception e) {
        System.out.println("Exception: ");
        System.out.println(e.getLocalizedMessage());
        System.out.println("Class: ");
        System.out.println(e.getClass());
    }
}

    }//GEN-LAST:event_txtbuscarMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtabla;
    private javax.swing.JTextField campo_documento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtbuscar;
    // End of variables declaration//GEN-END:variables

   
}
