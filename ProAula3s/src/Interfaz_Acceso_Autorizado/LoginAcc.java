package Interfaz_Acceso_Autorizado;//ubicacion de Jframe

//importe de librerias
import Conexion.ConexionMysql;
import Interfaz_Acceso_Usuarios.MenuPrincipal;
import Interfaz_Principal.Principal;
import Textpromopt.TextPrompt;
import com.mysql.cj.jdbc.ConnectionImpl;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class LoginAcc extends javax.swing.JFrame {

    /* Se crea una nueva instancia de la clase ConexionMysql 
    y se asigna a la variable 'con'*/
   ConexionMysql con = new ConexionMysql();
   /* Se utiliza el método 'conectar()' de la instancia 'con' 
   para obtener una conexión y se asigna a la variable 'cnn'*/
   
   ConnectionImpl cnn = con.conectar();
    public LoginAcc() {
        //Inicializa los componentes de la interfaz gráfica
        initComponents();
        /* Establecer el icono de la ventana en la imagen devuelta 
        por getIconImage*/
        setIconImage(getIconImage());
        //Establece la ubicación de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        // Crear un objeto Timer con un retraso de 5 segundos
        
        
        
        // Agregar un texto de marcador a los campos de texto
        Textpromopt.TextPrompt placeholder1
                = new TextPrompt("Email:Miemail@vet.com",
                         caja_correo);
        Textpromopt.TextPrompt placeholder2
                = new TextPrompt("Contraseña",
                        caja_contraseña);
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

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        texto_de_icono = new javax.swing.JLabel();
        Icono = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Texto_Correo = new javax.swing.JLabel();
        caja_correo = new javax.swing.JTextField();
        Texto_Correo1 = new javax.swing.JLabel();
        caja_contraseña = new javax.swing.JPasswordField();
        btn_entrar = new javax.swing.JPanel();
        entrar = new javax.swing.JLabel();
        btn_Menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Acceso Autorizado");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Autorizado/imagenes/Diseño sin título6.png"))); // NOI18N

        texto_de_icono.setBackground(new java.awt.Color(104, 207, 163));
        texto_de_icono.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        texto_de_icono.setForeground(new java.awt.Color(104, 207, 163));
        texto_de_icono.setText("My Vet");

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Usuarios/imagenes/logoP.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(104, 207, 163));

        Texto_Correo.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        Texto_Correo.setForeground(new java.awt.Color(255, 255, 255));
        Texto_Correo.setText("Contraseña");

        caja_correo.setBackground(new java.awt.Color(255, 255, 255));
        caja_correo.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        caja_correo.setForeground(new java.awt.Color(0, 0, 0));

        Texto_Correo1.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        Texto_Correo1.setForeground(new java.awt.Color(255, 255, 255));
        Texto_Correo1.setText("Correo");

        caja_contraseña.setBackground(new java.awt.Color(255, 255, 255));
        caja_contraseña.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        caja_contraseña.setForeground(new java.awt.Color(0, 0, 0));

        btn_entrar.setBackground(new java.awt.Color(255, 255, 255));

        entrar.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 18)); // NOI18N
        entrar.setForeground(new java.awt.Color(0, 0, 0));
        entrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrar.setText("Entrar");
        entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_entrarLayout = new javax.swing.GroupLayout(btn_entrar);
        btn_entrar.setLayout(btn_entrarLayout);
        btn_entrarLayout.setHorizontalGroup(
            btn_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_entrarLayout.setVerticalGroup(
            btn_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Texto_Correo1)
                    .addComponent(Texto_Correo)
                    .addComponent(caja_correo, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(caja_contraseña)
                    .addComponent(btn_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Texto_Correo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caja_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto_Correo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caja_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        btn_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Usuarios/imagenes/icons8-menú-xbox-40.png"))); // NOI18N
        btn_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Icono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(texto_de_icono, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btn_Menu))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(texto_de_icono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Icono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseClicked
         // Obtiene el texto ingresado en el campo de correo
        String usuario = caja_correo.getText();
        // Obtiene el texto ingresado en el campo de contraseña
        String contrasena = caja_contraseña.getText();
        // Verifica que los campos no estén vacíos
        if (!usuario.equals("") || !contrasena.equals("")) {
            try {
                // Prepara una consulta SQL para buscar un usuario
                //con el correo y contraseña ingresados
                java.sql.PreparedStatement ps =
                        cnn.prepareStatement("select * from "
                                + "proyectodeaulads3.accesoautorizado"
                                + " where correo='" + usuario + "'"
                                        + " and contrasena='" + contrasena + "'");
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
                    Menu_Opciones pg = new Menu_Opciones();
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
    }//GEN-LAST:event_entrarMouseClicked

    private void btn_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenuMouseClicked
        Principal frame = new Principal();
        // Crea una nueva instancia de la clase Principal
        frame.setVisible(true);
        // Hace visible la nueva ventana Principal
        this.dispose();
        // Cierra la ventana actual (LoginUsuarios)
    }//GEN-LAST:event_btn_MenuMouseClicked

    private void entrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseEntered
        btn_entrar.setBackground(Color.BLACK);
        // Establece el color de fondo del panel btncomenzar en negro
        entrar.setForeground(Color.white);
        // Establece el color del texto de la etiqueta comenzar en blanco
    }//GEN-LAST:event_entrarMouseEntered

    private void entrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarMouseExited
         btn_entrar.setBackground(Color.white);
        // Establece el color de fondo del panel btncomenzar en blanco
        entrar.setForeground(Color.black);
        // Establece el color del texto de la etiqueta comenzar en negro
    }//GEN-LAST:event_entrarMouseExited

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
            java.util.logging.Logger.getLogger(LoginAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel Texto_Correo;
    private javax.swing.JLabel Texto_Correo1;
    private javax.swing.JLabel btn_Menu;
    private javax.swing.JPanel btn_entrar;
    private javax.swing.JPasswordField caja_contraseña;
    private javax.swing.JTextField caja_correo;
    private javax.swing.JLabel entrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel texto_de_icono;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
