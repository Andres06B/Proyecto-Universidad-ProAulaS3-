package Modulo_Datos;

import Conexion.ConexionMysql;
import com.mysql.cj.jdbc.ConnectionImpl;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.Statement;

public class modulo_datos extends javax.swing.JPanel {

    private String username;
    ConexionMysql con = new ConexionMysql();
    ConnectionImpl cn = con.conectar();
    Statement st;
    ResultSet rs;
    int idc;

    public modulo_datos() {
        initComponents();
    }

    public modulo_datos(String username) {
        this();
        this.username = username;
        consultar();
    }

    void consultar() {
        String sql = "SELECT nombrecompleto,apellido,edad,nombreusuario,correo "
                + "FROM proyectodeaulads3.usuarios WHERE CORREO "
                + "= '" + username + "'";
        try {
            st = (Statement) cn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                nombretxt.setText(rs.getString("nombrecompleto"));
                apellidotxt.setText(rs.getString("apellido"));
                edadtxt.setText(rs.getString("edad"));
                nombreUtxt.setText(rs.getString("nombreusuario"));
                correotxt.setText(rs.getString("correo"));
            }
        } catch (Exception e) {
            System.out.println("Exception: ");
            System.out.println(e.getLocalizedMessage());
            System.out.println("Class: ");
            System.out.println(e.getClass()); 
        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtnombreU = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        txtnombre = new javax.swing.JLabel();
        txtapellido = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JLabel();
        txtedad = new javax.swing.JLabel();
        apellidotxt = new javax.swing.JTextField();
        nombreUtxt = new javax.swing.JTextField();
        edadtxt = new javax.swing.JTextField();
        correotxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(104, 207, 163));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(104, 207, 163));
        jLabel1.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(104, 207, 163));
        jLabel1.setText("Mis Datos Personales");

        jSeparator1.setBackground(new java.awt.Color(104, 207, 163));
        jSeparator1.setForeground(new java.awt.Color(104, 207, 163));

        txtnombreU.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 18)); // NOI18N
        txtnombreU.setForeground(new java.awt.Color(104, 207, 163));
        txtnombreU.setText("Nombre de Usuario: ");

        nombretxt.setBackground(new java.awt.Color(255, 255, 255));
        nombretxt.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 12)); // NOI18N
        nombretxt.setForeground(new java.awt.Color(0, 0, 0));
        nombretxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtnombre.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 18)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(104, 207, 163));
        txtnombre.setText("Nombre completo:");

        txtapellido.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 18)); // NOI18N
        txtapellido.setForeground(new java.awt.Color(104, 207, 163));
        txtapellido.setText("Apellidos: ");

        txtcorreo.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 18)); // NOI18N
        txtcorreo.setForeground(new java.awt.Color(104, 207, 163));
        txtcorreo.setText("Correo: ");

        txtedad.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 18)); // NOI18N
        txtedad.setForeground(new java.awt.Color(104, 207, 163));
        txtedad.setText("Edad: ");

        apellidotxt.setBackground(new java.awt.Color(255, 255, 255));
        apellidotxt.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 12)); // NOI18N
        apellidotxt.setForeground(new java.awt.Color(0, 0, 0));

        nombreUtxt.setBackground(new java.awt.Color(255, 255, 255));
        nombreUtxt.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 12)); // NOI18N
        nombreUtxt.setForeground(new java.awt.Color(0, 0, 0));

        edadtxt.setBackground(new java.awt.Color(255, 255, 255));
        edadtxt.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 12)); // NOI18N
        edadtxt.setForeground(new java.awt.Color(0, 0, 0));

        correotxt.setBackground(new java.awt.Color(255, 255, 255));
        correotxt.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 12)); // NOI18N
        correotxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Modulo_Datos/Imagenes/Diseño sin título1.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtnombre)
                                .addGap(3, 3, 3)
                                .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtapellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtnombreU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreUtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcorreo)
                                    .addComponent(txtedad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(correotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtapellido)
                            .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombreU)
                            .addComponent(nombreUtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtedad)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(edadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcorreo)
                            .addComponent(correotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidotxt;
    private javax.swing.JTextField correotxt;
    private javax.swing.JTextField edadtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombreUtxt;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JLabel txtapellido;
    private javax.swing.JLabel txtcorreo;
    private javax.swing.JLabel txtedad;
    private javax.swing.JLabel txtnombre;
    private javax.swing.JLabel txtnombreU;
    // End of variables declaration//GEN-END:variables
}
