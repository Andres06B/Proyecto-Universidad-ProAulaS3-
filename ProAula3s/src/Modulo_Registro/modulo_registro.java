package Modulo_Registro;

import Conexion.ConexionMysql;
import com.mysql.cj.jdbc.ConnectionImpl;
import java.awt.Color;
import javax.swing.JOptionPane;

public class modulo_registro extends javax.swing.JPanel {

    //Crear una instancia de la clase ConexionMysql para establecer
    //una conexión con la base de datos
    ConexionMysql con = new ConexionMysql();
    ConnectionImpl cnn = con.conectar();

    public modulo_registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        Texto_documento = new javax.swing.JLabel();
        caja_N_documento = new javax.swing.JTextField();
        Texto_nombre = new javax.swing.JLabel();
        Texto_tipo_mascota = new javax.swing.JLabel();
        Texto_raza = new javax.swing.JLabel();
        Texto_sexo = new javax.swing.JLabel();
        Texto_peso = new javax.swing.JLabel();
        btnguardar = new javax.swing.JPanel();
        guardartxt = new javax.swing.JLabel();
        Texto_edad = new javax.swing.JLabel();
        caja_nombre = new javax.swing.JTextField();
        caja_tipo_mascota = new javax.swing.JTextField();
        caja_raza = new javax.swing.JTextField();
        caja_sexo = new javax.swing.JTextField();
        caja_peso = new javax.swing.JTextField();
        caja_edad = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(104, 207, 163));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(104, 207, 163));
        jLabel1.setText("Registra Tus Mascotas");

        jSeparator1.setBackground(new java.awt.Color(104, 207, 163));
        jSeparator1.setForeground(new java.awt.Color(104, 207, 163));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Modulo_Registro/imagenes/Diseño sin título3.png"))); // NOI18N

        Texto_documento.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 14)); // NOI18N
        Texto_documento.setForeground(new java.awt.Color(104, 207, 163));
        Texto_documento.setText("Documento del Dueño: ");

        caja_N_documento.setBackground(new java.awt.Color(255, 255, 255));
        caja_N_documento.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        Texto_nombre.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 14)); // NOI18N
        Texto_nombre.setForeground(new java.awt.Color(104, 207, 163));
        Texto_nombre.setText("Nombre Mascota:");

        Texto_tipo_mascota.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 15)); // NOI18N
        Texto_tipo_mascota.setForeground(new java.awt.Color(104, 207, 163));
        Texto_tipo_mascota.setText("Tipo Mascota");

        Texto_raza.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 14)); // NOI18N
        Texto_raza.setForeground(new java.awt.Color(104, 207, 163));
        Texto_raza.setText("Raza");

        Texto_sexo.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 14)); // NOI18N
        Texto_sexo.setForeground(new java.awt.Color(104, 207, 163));
        Texto_sexo.setText("Sexo");

        Texto_peso.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 14)); // NOI18N
        Texto_peso.setForeground(new java.awt.Color(104, 207, 163));
        Texto_peso.setText("Peso");

        btnguardar.setBackground(new java.awt.Color(104, 207, 163));

        guardartxt.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 18)); // NOI18N
        guardartxt.setForeground(new java.awt.Color(255, 255, 255));
        guardartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardartxt.setText("Guardar");
        guardartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardartxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardartxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnguardarLayout = new javax.swing.GroupLayout(btnguardar);
        btnguardar.setLayout(btnguardarLayout);
        btnguardarLayout.setHorizontalGroup(
            btnguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
            .addGroup(btnguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(guardartxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
        );
        btnguardarLayout.setVerticalGroup(
            btnguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
            .addGroup(btnguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnguardarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(guardartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Texto_edad.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 14)); // NOI18N
        Texto_edad.setForeground(new java.awt.Color(104, 207, 163));
        Texto_edad.setText("Edad");

        caja_nombre.setBackground(new java.awt.Color(255, 255, 255));
        caja_nombre.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        caja_tipo_mascota.setBackground(new java.awt.Color(255, 255, 255));
        caja_tipo_mascota.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        caja_raza.setBackground(new java.awt.Color(255, 255, 255));
        caja_raza.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        caja_sexo.setBackground(new java.awt.Color(255, 255, 255));
        caja_sexo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        caja_peso.setBackground(new java.awt.Color(255, 255, 255));
        caja_peso.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        caja_edad.setBackground(new java.awt.Color(255, 255, 255));
        caja_edad.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(caja_N_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Texto_documento))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Texto_nombre)
                                            .addComponent(caja_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(51, 51, 51))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Texto_tipo_mascota)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Texto_raza)
                                        .addGap(236, 236, 236))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Texto_sexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Texto_peso)
                                        .addGap(239, 239, 239)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Texto_edad)
                                    .addGap(236, 236, 236)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(caja_tipo_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(caja_raza, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(caja_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(caja_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(caja_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Texto_documento)
                            .addComponent(Texto_nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caja_N_documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Texto_tipo_mascota)
                            .addComponent(Texto_raza))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caja_tipo_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Texto_peso)
                            .addComponent(Texto_sexo))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(caja_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caja_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(Texto_edad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caja_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardartxtMouseClicked
        String documento = caja_N_documento.getText();
        String nombre = caja_nombre.getText();
        String tipomascota = caja_tipo_mascota.getText();
        String raza = caja_raza.getText();
        String peso = caja_peso.getText();
        String sexo = caja_sexo.getText();
        String edad = caja_edad.getText();

        if (documento.isEmpty() || nombre.isEmpty() || tipomascota.isEmpty()
                || raza.isEmpty() || peso.isEmpty() || sexo.isEmpty()
                || edad.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "DEBE COMPLETAR LOS DATOS");
            // Si alguno de los campos está vacío, muestra un mensaje 
            //emergente que indica que el usuario debe completar los datos.  
        } else if (nombre.matches(".*\\d.*") 
                || tipomascota.matches(".*\\d.*") 
                || raza.matches(".*\\d.*") 
                || sexo.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null,
                    "El nombre de mascota, tipo de mascota, raza y "
                            + "sexo no pueden contener números. Por favor, "
                            + "inténtelo de nuevo.");
            // Si alguno de los campos de nombre de mascota,
            //tipo de mascota, raza o sexo contiene números, muestra un 
            //mensaje emergente que indica que el usuario debe corregir los datos.
        } else {
            try {
                String consultar
                        = "INSERT INTO proyectodeaulads3.registro_mascotas"
                        + "(ndocumento,nombre,tipo_mascota,raza,sexo,peso,edad)"
                        + "VALUES('" + documento + "','" + nombre + "','" + tipomascota + ""
                        + "','" + raza + "','" + sexo + "','" + peso + "','" + edad + "')";
                java.sql.PreparedStatement ps
                        = cnn.clientPrepareStatement(consultar);
                ps.executeUpdate();
                limpiar();
                JOptionPane.showMessageDialog(null,
                        "DATOS GUARDADOS CORRECTAMENTE");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "NO SE PUDO GUARDAR LOS DATOS" + e);
            }
        }

    }//GEN-LAST:event_guardartxtMouseClicked

    private void guardartxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardartxtMouseEntered
        // Establece el color de fondo del panel  en negro
        btnguardar.setBackground(Color.black);
        // Establece el color del texto de la etiqueta en blanco
        guardartxt.setForeground(Color.white);
    }//GEN-LAST:event_guardartxtMouseEntered

    private void guardartxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardartxtMouseExited
        // Establece el color de fondo del panel a su color original
        btnguardar.setBackground(new Color(104, 207, 163));
        // Establece el color del texto de la etiqueta en blanco
        guardartxt.setForeground(Color.white);
    }//GEN-LAST:event_guardartxtMouseExited
    void limpiar() {
        caja_N_documento.setText("");
        caja_nombre.setText("");
        caja_tipo_mascota.setText("");
        caja_raza.setText("");
        caja_sexo.setText("");
        caja_peso.setText("");
        caja_edad.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Texto_documento;
    private javax.swing.JLabel Texto_edad;
    private javax.swing.JLabel Texto_nombre;
    private javax.swing.JLabel Texto_peso;
    private javax.swing.JLabel Texto_raza;
    private javax.swing.JLabel Texto_sexo;
    private javax.swing.JLabel Texto_tipo_mascota;
    private javax.swing.JPanel btnguardar;
    private javax.swing.JTextField caja_N_documento;
    private javax.swing.JTextField caja_edad;
    private javax.swing.JTextField caja_nombre;
    private javax.swing.JTextField caja_peso;
    private javax.swing.JTextField caja_raza;
    private javax.swing.JTextField caja_sexo;
    private javax.swing.JTextField caja_tipo_mascota;
    private javax.swing.JLabel guardartxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
