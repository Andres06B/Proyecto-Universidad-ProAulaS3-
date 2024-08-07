package Modulo_Mis_Citas;

import Conexion.ConexionMysql;
import com.mysql.cj.jdbc.ConnectionImpl;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class modulo_mis_citas extends javax.swing.JPanel {

    ConexionMysql con = new ConexionMysql();
    ConnectionImpl cn = con.conectar();
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    TableRowSorter trs;

    public modulo_mis_citas() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacitas = new javax.swing.JTable();
        Campo_documento = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(104, 207, 163));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        jLabel1.setBackground(new java.awt.Color(104, 207, 163));
        jLabel1.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(104, 207, 163));
        jLabel1.setText("Mis Citas");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 6, -1, 40));

        jSeparator1.setBackground(new java.awt.Color(104, 207, 163));
        jSeparator1.setForeground(new java.awt.Color(104, 207, 163));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 39, 870, 10));

        jLabel2.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Dijite su nombre para buscar que citas tienes agendada");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        tablacitas.setAutoCreateRowSorter(true);
        tablacitas.setBackground(new java.awt.Color(255, 255, 255));
        tablacitas.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tablacitas.setForeground(new java.awt.Color(0, 0, 0));
        tablacitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dueño", "Identificacion", "Telefono", "Mascota", "Sexo", "Edad", "Motivo consulta", "Tipo Consulta"
            }
        ));
        tablacitas.setShowGrid(true);
        jScrollPane1.setViewportView(tablacitas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 830, 180));

        Campo_documento.setBackground(new java.awt.Color(255, 255, 255));
        add(Campo_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 215, 30));

        jPanel2.setBackground(new java.awt.Color(104, 207, 163));

        jLabel9.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Buscar");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        String busqueda = Campo_documento.getText();
if (busqueda.isEmpty()) {
    JOptionPane.showMessageDialog(null,
            "NO HAY DATOS DENTRO DEL CAMPO");
    modelo.setRowCount(0);
} else {
    if(modelo != null){
        modelo.getDataVector().clear();
    }
    String sql = "SELECT * FROM proyectodeaulads3.agendarcita "
            + "WHERE identificacion LIKE '%" + busqueda + "%'";
    try {
        st = (Statement) cn.createStatement();
        rs = st.executeQuery(sql);
        Object[] cita_paciente = new Object[8];
        modelo = (DefaultTableModel) tablacitas.getModel();
        if (!rs.isBeforeFirst()) {
            JOptionPane.showMessageDialog(null,
                    "NO SE ENCONTRARON DATOS");
            modelo.setRowCount(0);
        } else {
            while (rs.next()) {
                cita_paciente[0] = rs.getString("dueno");
                cita_paciente[1] = rs.getString("identificacion");
                cita_paciente[2] = rs.getString("telefono");
                cita_paciente[3] = rs.getString("mascota");
                cita_paciente[4] = rs.getString("sexo");
                cita_paciente[5] = rs.getString("edad");
                cita_paciente[6] = rs.getString("motivoconsulta");
                cita_paciente[7] = rs.getString("tipoconsulta");
                modelo.addRow(cita_paciente);
            }
            System.out.println("Numero columnas: " + modelo.getRowCount());
            tablacitas.setModel(modelo);
        }
    } catch (Exception e) {
        System.out.println("Exception: ");
        System.out.println(e.getLocalizedMessage());
        System.out.println("Class: ");
        System.out.println(e.getClass());
    }
}

        
    }//GEN-LAST:event_jLabel9MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_documento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablacitas;
    // End of variables declaration//GEN-END:variables
}
