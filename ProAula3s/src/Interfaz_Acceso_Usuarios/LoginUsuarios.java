package Interfaz_Acceso_Usuarios;

// Importación de la clase ConexionMysql desde el paquete Conexion
import Conexion.ConexionMysql;
// Importación de la clase Principal desde el paquete Interfaz_Principal
import Interfaz_Principal.Principal;
// Importación de la clase TextPrompt desde el paquete Textpromopt
import Textpromopt.TextPrompt;
// Importación de la clase ConnectionImpl desde el paquete com.mysql.cj.jdbc
import com.mysql.cj.jdbc.ConnectionImpl;
// Importación de la clase Color desde el paquete java.awt
import java.awt.Color;
// Importación de la clase Image desde el paquete java.awt.Toolkit
import java.awt.Image;
// Importación de la clase Toolkit desde el paquete java.awt
import java.awt.Toolkit;
// Importación de la clase ResultSet desde el paquete java.sql
import java.sql.ResultSet;
// Importación de la clase JOptionPane desde el paquete javax.swing
import javax.swing.JOptionPane;


public class LoginUsuarios extends javax.swing.JFrame {

   
   /* Se crea una nueva instancia de la clase ConexionMysql 
    y se asigna a la variable 'con'*/
   ConexionMysql con = new ConexionMysql();
   /* Se utiliza el método 'conectar()' de la instancia 'con' 
   para obtener una conexión y se asigna a la variable 'cnn'*/
   ConnectionImpl cnn = con.conectar();

    public LoginUsuarios() {
        //Inicializa los componentes de la interfaz gráfica
        initComponents();
        /* Establecer el icono de la ventana en la imagen devuelta 
        por getIconImage*/
        setIconImage(getIconImage());
        //Establece la ubicación de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        

        // Agregar un texto de marcador a los campos de texto
        Textpromopt.TextPrompt placeholder1
                = new TextPrompt("Email:Miemail@vet.com",
                         Caja_Correo);
        Textpromopt.TextPrompt placeholder2
                = new TextPrompt("Contraseña",
                        Caja_Contraseña);
    }

    // Método para obtener la imagen del icono 
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage
        (ClassLoader.getSystemResource("imagenes/LogoPrograma.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_login = new javax.swing.JPanel();
        Imagendefondo = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        texto_de_icono = new javax.swing.JLabel();
        Icono = new javax.swing.JLabel();
        Barra_Login = new javax.swing.JPanel();
        Caja_Correo = new javax.swing.JTextField();
        Caja_Contraseña = new javax.swing.JPasswordField();
        Texto_Correo = new javax.swing.JLabel();
        Texto_Contraseña = new javax.swing.JLabel();
        Texto = new javax.swing.JLabel();
        Area_Registro = new javax.swing.JLabel();
        btnLogin = new javax.swing.JPanel();
        Login = new javax.swing.JLabel();
        btn_Menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIAR SESION");
        setResizable(false);

        Panel_login.setBackground(new java.awt.Color(255, 255, 255));

        Imagendefondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Usuarios/imagenes/AccesoU_1.png"))); // NOI18N

        Titulo.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Bienvenidos");

        texto_de_icono.setBackground(new java.awt.Color(104, 207, 163));
        texto_de_icono.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        texto_de_icono.setForeground(new java.awt.Color(104, 207, 163));
        texto_de_icono.setText("My Vet");

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Usuarios/imagenes/logoP.png"))); // NOI18N

        Barra_Login.setBackground(new java.awt.Color(104, 207, 163));

        Caja_Correo.setBackground(new java.awt.Color(255, 255, 255));
        Caja_Correo.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Caja_Correo.setForeground(new java.awt.Color(0, 0, 0));

        Caja_Contraseña.setBackground(new java.awt.Color(255, 255, 255));
        Caja_Contraseña.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Caja_Contraseña.setForeground(new java.awt.Color(0, 0, 0));

        Texto_Correo.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        Texto_Correo.setForeground(new java.awt.Color(255, 255, 255));
        Texto_Correo.setText("Correo");

        Texto_Contraseña.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        Texto_Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Texto_Contraseña.setText("Contraseña");

        Texto.setFont(new java.awt.Font("Rockwell", 3, 15)); // NOI18N
        Texto.setForeground(new java.awt.Color(255, 255, 255));
        Texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto.setText("¿No tienes una Cuenta?");

        Area_Registro.setFont(new java.awt.Font("Rockwell", 3, 15)); // NOI18N
        Area_Registro.setForeground(new java.awt.Color(255, 255, 255));
        Area_Registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Area_Registro.setText("Registrate");
        Area_Registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Area_Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Area_RegistroMouseClicked(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Login.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Login.setForeground(new java.awt.Color(0, 0, 0));
        Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login.setText("Login");
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLoginLayout.createSequentialGroup()
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLoginLayout.createSequentialGroup()
                .addComponent(Login)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Barra_LoginLayout = new javax.swing.GroupLayout(Barra_Login);
        Barra_Login.setLayout(Barra_LoginLayout);
        Barra_LoginLayout.setHorizontalGroup(
            Barra_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_LoginLayout.createSequentialGroup()
                .addGroup(Barra_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Barra_LoginLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(Barra_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Texto_Contraseña)
                            .addComponent(Texto_Correo)
                            .addComponent(Caja_Correo)
                            .addComponent(Caja_Contraseña)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Barra_LoginLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(Barra_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Area_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        Barra_LoginLayout.setVerticalGroup(
            Barra_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_LoginLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Texto_Correo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Caja_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto_Contraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Caja_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Area_Registro)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btn_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Usuarios/imagenes/icons8-menú-xbox-40.png"))); // NOI18N
        btn_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_loginLayout = new javax.swing.GroupLayout(Panel_login);
        Panel_login.setLayout(Panel_loginLayout);
        Panel_loginLayout.setHorizontalGroup(
            Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_loginLayout.createSequentialGroup()
                .addComponent(Imagendefondo)
                .addGap(50, 50, 50)
                .addGroup(Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_loginLayout.createSequentialGroup()
                        .addGroup(Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_loginLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(Titulo))
                            .addComponent(Barra_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))
                    .addGroup(Panel_loginLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(Icono)
                        .addGap(10, 10, 10)
                        .addComponent(texto_de_icono, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Menu)
                        .addContainerGap())))
        );
        Panel_loginLayout.setVerticalGroup(
            Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Imagendefondo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Panel_loginLayout.createSequentialGroup()
                .addGroup(Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_loginLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Icono)
                            .addComponent(texto_de_icono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(Titulo)
                .addGap(12, 12, 12)
                .addComponent(Barra_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Area_RegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Area_RegistroMouseClicked
        RegistroU frame = new RegistroU();
        // Crea una nueva instancia de la clase Principal
        frame.setVisible(true);
        // Hace visible la nueva ventana Principal
        this.dispose();
        // Cierra la ventana actual (LoginUsuarios)
    }//GEN-LAST:event_Area_RegistroMouseClicked

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        // Obtiene el texto ingresado en el campo de correo
        String usuario = Caja_Correo.getText();
        // Obtiene el texto ingresado en el campo de contraseña
        String contrasena = Caja_Contraseña.getText();
        // Verifica que los campos no estén vacíos
        if (!usuario.equals("") || !contrasena.equals("")) {
            try {
                // Prepara una consulta SQL para buscar un usuario
                //con el correo y contraseña ingresados
                java.sql.PreparedStatement ps = cnn.prepareStatement("select"
                        + " * from proyectodeaulads3.usuarios where correo="
                        + "'" + usuario + "' and contrasena="
                        + "'" + contrasena + "'");
                // Ejecuta la consulta y obtiene los resultados
                ResultSet rs = ps.executeQuery();
                // Si se encontró un usuario con el correo
                //y contraseña ingresados
                if (rs.next()) {
                    // Cierra la ventana actual
                    dispose();
                    JOptionPane.showMessageDialog(null,
                            "Acceso Exitoso");
                    // Muestra un mensaje de acceso exitoso
                    MenuPrincipal pg = new MenuPrincipal(usuario);
                    // Crea una nueva ventana de menú de usuarios, 
                    //pasando el correo del usuario como parámetro
                    pg.setVisible(true);
                    // Muestra la nueva ventana de menú de usuarios

                } else {
                    // Muestra un mensaje de usuario o contraseña incorrecta
                    JOptionPane.showMessageDialog(null,
                            "Usuario o Contraseña Incorrecta");
                }
            } catch (Exception e) {
                // Muestra un mensaje de error al iniciar sesión
                JOptionPane.showMessageDialog(null,
                        "Error al Iniciar Sesion" + e);
            }
        } else {
            // Muestra un mensaje de que se deben completar los datos
            JOptionPane.showMessageDialog(null,
                    "DEBE COMPLETAR LOS DATOS");
        }

    }//GEN-LAST:event_LoginMouseClicked

    private void LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseEntered
        btnLogin.setBackground(Color.BLACK);
        // Establece el color de fondo del panel btncomenzar en negro
        Login.setForeground(Color.white);
        // Establece el color del texto de la etiqueta comenzar en blanco
    }//GEN-LAST:event_LoginMouseEntered

    private void LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseExited
        btnLogin.setBackground(Color.white);
        // Establece el color de fondo del panel btncomenzar en blanco
        Login.setForeground(Color.black);
        // Establece el color del texto de la etiqueta comenzar en negro
    }//GEN-LAST:event_LoginMouseExited

    private void btn_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenuMouseClicked
        Principal frame = new Principal();
        // Crea una nueva instancia de la clase Principal
        frame.setVisible(true);
        // Hace visible la nueva ventana Principal
        this.dispose();
        // Cierra la ventana actual (LoginUsuarios)
    }//GEN-LAST:event_btn_MenuMouseClicked

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
            java.util.logging.Logger.getLogger(LoginUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Area_Registro;
    private javax.swing.JPanel Barra_Login;
    private javax.swing.JPasswordField Caja_Contraseña;
    private javax.swing.JTextField Caja_Correo;
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel Imagendefondo;
    private javax.swing.JLabel Login;
    private javax.swing.JPanel Panel_login;
    private javax.swing.JLabel Texto;
    private javax.swing.JLabel Texto_Contraseña;
    private javax.swing.JLabel Texto_Correo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel btnLogin;
    private javax.swing.JLabel btn_Menu;
    private javax.swing.JLabel texto_de_icono;
    // End of variables declaration//GEN-END:variables
}
