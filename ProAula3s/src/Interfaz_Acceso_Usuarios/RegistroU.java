package Interfaz_Acceso_Usuarios;
// Se define el paquete al que pertenece la clase

// Importación de la clase ConexionMysql desde el paquete Conexion
import Conexion.ConexionMysql;
// Importación de la clase ConnectionImpl desde el paquete com.mysql.cj.jdbc
import com.mysql.cj.jdbc.ConnectionImpl;
// Importación de la clase Color desde el paquete java.awt
import java.awt.Color;
// Importación de la clase Image desde el paquete java.awt.Toolkit
import java.awt.Image;
// Importación de la clase Toolkit desde el paquete java.awt
import java.awt.Toolkit;
// Importación de la clase JOptionPane desde el paquete javax.swing
import javax.swing.JOptionPane;

public class RegistroU extends javax.swing.JFrame {

    /* Se crea una nueva instancia de la clase ConexionMysql 
    y se asigna a la variable 'con'*/
    ConexionMysql con = new ConexionMysql();
    /* Se utiliza el método 'conectar()' de la instancia 'con' 
   para obtener una conexión y se asigna a la variable 'cnn'*/
    ConnectionImpl cnn = con.conectar();

    //Constructor de la clase
    public RegistroU() {

        //Inicializa los componentes de la interfaz gráfica
        initComponents();
        /* Establecer el icono de la ventana en la imagen devuelta 
        por getIconImage*/
        setIconImage(getIconImage());
        //Establece la ubicación de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
    }

    // Método que devuelve la imagen del ícono de la aplicación
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMAGENES/LogoPrograma.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_De_Vista = new javax.swing.JPanel();
        Texto_Logo = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Panel_De_Datos = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Texto_Nombre = new javax.swing.JLabel();
        Caja_Nombre = new javax.swing.JTextField();
        Texto_Nombre1 = new javax.swing.JLabel();
        Caja_Apellido = new javax.swing.JTextField();
        Texto_Apellido = new javax.swing.JLabel();
        Caja_edad = new javax.swing.JTextField();
        Texto_Nombre_Usuario = new javax.swing.JLabel();
        Caja_Usuario = new javax.swing.JTextField();
        Texto_Correo = new javax.swing.JLabel();
        Caja_Correo = new javax.swing.JTextField();
        Texto_Contraseña = new javax.swing.JLabel();
        Caja_Contraseña = new javax.swing.JTextField();
        btnRegistro = new javax.swing.JPanel();
        Registro = new javax.swing.JLabel();
        Iniciar_Sesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Usuarios");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_De_Vista.setBackground(new java.awt.Color(255, 255, 255));
        Panel_De_Vista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Texto_Logo.setBackground(new java.awt.Color(104, 207, 163));
        Texto_Logo.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        Texto_Logo.setForeground(new java.awt.Color(104, 207, 163));
        Texto_Logo.setText("My Vet");
        Panel_De_Vista.add(Texto_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 93, 50));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Usuarios/imagenes/logoP.png"))); // NOI18N
        Panel_De_Vista.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 50));

        Panel_De_Datos.setBackground(new java.awt.Color(104, 207, 163));

        Titulo.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Registro");

        Texto_Nombre.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Texto_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Texto_Nombre.setText("Nombre Completo");

        Caja_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Caja_Nombre.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N

        Texto_Nombre1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Texto_Nombre1.setForeground(new java.awt.Color(255, 255, 255));
        Texto_Nombre1.setText("Apellido");

        Caja_Apellido.setBackground(new java.awt.Color(255, 255, 255));
        Caja_Apellido.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N

        Texto_Apellido.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Texto_Apellido.setForeground(new java.awt.Color(255, 255, 255));
        Texto_Apellido.setText("Edad");

        Caja_edad.setBackground(new java.awt.Color(255, 255, 255));
        Caja_edad.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N

        Texto_Nombre_Usuario.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Texto_Nombre_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Texto_Nombre_Usuario.setText("Nombre de usuario");

        Caja_Usuario.setBackground(new java.awt.Color(255, 255, 255));
        Caja_Usuario.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N

        Texto_Correo.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Texto_Correo.setForeground(new java.awt.Color(255, 255, 255));
        Texto_Correo.setText("Correo");

        Caja_Correo.setBackground(new java.awt.Color(255, 255, 255));
        Caja_Correo.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N

        Texto_Contraseña.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Texto_Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Texto_Contraseña.setText("Contraseña");

        Caja_Contraseña.setBackground(new java.awt.Color(255, 255, 255));
        Caja_Contraseña.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N

        btnRegistro.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Registro.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Registro.setForeground(new java.awt.Color(0, 0, 0));
        Registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Registro.setText("Registrar");
        Registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegistroLayout = new javax.swing.GroupLayout(btnRegistro);
        btnRegistro.setLayout(btnRegistroLayout);
        btnRegistroLayout.setHorizontalGroup(
            btnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistroLayout.createSequentialGroup()
                .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        btnRegistroLayout.setVerticalGroup(
            btnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Registro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Iniciar_Sesion.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Iniciar_Sesion.setForeground(new java.awt.Color(255, 255, 255));
        Iniciar_Sesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Iniciar_Sesion.setText("Iniciar Sesion");
        Iniciar_Sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Iniciar_Sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Iniciar_SesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_De_DatosLayout = new javax.swing.GroupLayout(Panel_De_Datos);
        Panel_De_Datos.setLayout(Panel_De_DatosLayout);
        Panel_De_DatosLayout.setHorizontalGroup(
            Panel_De_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_De_DatosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Panel_De_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_De_DatosLayout.createSequentialGroup()
                        .addGroup(Panel_De_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Caja_Correo, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(Texto_Correo)
                            .addComponent(Caja_Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(Texto_Nombre1)
                            .addComponent(Texto_Nombre)
                            .addComponent(Caja_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(Texto_Contraseña)
                            .addComponent(Caja_Contraseña))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_De_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Caja_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto_Nombre_Usuario)
                            .addComponent(Caja_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto_Apellido)))
                    .addGroup(Panel_De_DatosLayout.createSequentialGroup()
                        .addComponent(Titulo)
                        .addGap(133, 133, 133)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(Iniciar_Sesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_De_DatosLayout.setVerticalGroup(
            Panel_De_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_De_DatosLayout.createSequentialGroup()
                .addComponent(Titulo)
                .addGap(30, 30, 30)
                .addGroup(Panel_De_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto_Nombre)
                    .addComponent(Texto_Apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_De_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Caja_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Caja_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_De_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto_Nombre1)
                    .addComponent(Texto_Nombre_Usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_De_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Caja_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Caja_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Texto_Correo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_De_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Caja_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Texto_Contraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Caja_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(Iniciar_Sesion)
                .addGap(38, 38, 38))
        );

        Panel_De_Vista.add(Panel_De_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 460, 440));

        getContentPane().add(Panel_De_Vista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroMouseClicked
        String nombre = Caja_Nombre.getText();
        String apellido = Caja_Apellido.getText();
        String edad = Caja_edad.getText();
        String nombreu = Caja_Usuario.getText();
        String correo = Caja_Correo.getText();
        String contrasena = Caja_Contraseña.getText();

        if (nombre.isEmpty() || apellido.isEmpty() || nombreu.isEmpty()
                || edad.isEmpty() || correo.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "DEBE COMPELTAR LOS DATOS");
            // Si alguno de los campos está vacío, muestra un mensaje 
            //emergente que indica que el usuario debe completar los datos.
        } else if (nombre.matches(".*\\d.*") 
                || apellido.matches(".*\\d.*") 
                || nombreu.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null,
                    "El nombre, apellido y nombre de usuario no pueden"
                            + " contener números. Por favor, inténtelo de nuevo.");
            // Si alguno de los campos de nombre, apellido o nombre de usuario 
            //contiene números, muestra un mensaje emergente que indica que 
            //el usuario debe corregir los datos.
        } else {
            try {
                // Prepara una sentencia SQL 
                //que será ejecutada en la base de datos. En este caso,
                //la sentencia SQL es una consulta de inserción que inserta 
                //los valores de `nombre`, `apellido`, `edad`, `nombreu`,
                //`correo` y `contrasena` en la tabla
                //`proyectodeaulads3.usuarios`.
                String consultar = "insert into proyectodeaulads3.usuarios"
                        + "(nombrecompleto,apellido,edad,nombreusuario,correo,"
                        + "contrasena)"
                        + "values('" + nombre + "','" + apellido + "','" + edad + "',"
                        + "'" + nombreu + "','" + correo + "','" + contrasena + "')";
                java.sql.PreparedStatement ps = cnn.clientPrepareStatement(consultar);
                ps.executeUpdate();
                // Si todos los campos están completos y no contienen números, 
                //se ejecuta la consulta y se muestra un mensaje emergente 
                //que indica que los datos se han guardado correctamente.
                limpiar();
                JOptionPane.showMessageDialog(null,
                        "DATOS GUARDADOS CORRECTAMENTE");
            } catch (Exception e) {
                // Si ocurre algún error durante la ejecución de la consulta,
                //se muestra un mensaje emergente que indica que no se pudieron
                //guardar los datos junto con el mensaje 
                //de error correspondiente.
                JOptionPane.showMessageDialog(null,
                        "NO SE PUDO GUARDAR LOS DATOS" + e);
            }
        }
    }//GEN-LAST:event_RegistroMouseClicked

    // Se define el método 'limpiar'
    void limpiar() {
        // Se establece el texto de las cajas de texto correspondientes en una 
        //cadena vacía para borrar su contenido
        Caja_Nombre.setText("");
        Caja_Apellido.setText("");
        Caja_edad.setText("");
        Caja_Usuario.setText("");
        Caja_Correo.setText("");
        Caja_Contraseña.setText("");
    }


    private void RegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroMouseEntered
        btnRegistro.setBackground(Color.BLACK);
        // Establece el color de fondo del panel btncomenzar en negro
        Registro.setForeground(Color.white);
        // Establece el color del texto de la etiqueta comenzar en blanco
    }//GEN-LAST:event_RegistroMouseEntered

    private void RegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroMouseExited
        btnRegistro.setBackground(Color.white);
        // Establece el color de fondo del panel btncomenzar en blanco
        Registro.setForeground(Color.black);
        // Establece el color del texto de la etiqueta comenzar en negro
    }//GEN-LAST:event_RegistroMouseExited

    private void Iniciar_SesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Iniciar_SesionMouseClicked
        // Se crea una nueva instancia de la clase 
        //LoginUsuarios y se asigna a la variable 'frame'
        LoginUsuarios frame = new LoginUsuarios();
        // Se establece la visibilidad del objeto 'frame' en 'true'
        frame.setVisible(true);
        // Se elimina la ventana actual (en este caso,
        //'this' hace referencia a la ventana actual)
        this.dispose();
    }//GEN-LAST:event_Iniciar_SesionMouseClicked

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
            java.util.logging.Logger.getLogger(RegistroU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Caja_Apellido;
    private javax.swing.JTextField Caja_Contraseña;
    private javax.swing.JTextField Caja_Correo;
    private javax.swing.JTextField Caja_Nombre;
    private javax.swing.JTextField Caja_Usuario;
    private javax.swing.JTextField Caja_edad;
    private javax.swing.JLabel Iniciar_Sesion;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Panel_De_Datos;
    private javax.swing.JPanel Panel_De_Vista;
    private javax.swing.JLabel Registro;
    private javax.swing.JLabel Texto_Apellido;
    private javax.swing.JLabel Texto_Contraseña;
    private javax.swing.JLabel Texto_Correo;
    private javax.swing.JLabel Texto_Logo;
    private javax.swing.JLabel Texto_Nombre;
    private javax.swing.JLabel Texto_Nombre1;
    private javax.swing.JLabel Texto_Nombre_Usuario;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel btnRegistro;
    // End of variables declaration//GEN-END:variables
}
