package Interfaz_Principal;//Ubicacion del Jframe

import Interfaz_Acceso_Autorizado.LoginAcc;
/*es una clase que representa la interfaz 
de usuario para el acceso autorizado.*/
import Interfaz_Acceso_Usuarios.LoginUsuarios;
/* es una clase que representa la interfaz
de usuario para el acceso de usuarios.*/
import Interfaz_Servicios.Servicios;
import Interfaz_informacion.Informacion;
/* es una clase que representa la interfaz de usuario
para los servicios de la aplicación*/
import java.awt.Color;
/* proporciona una clase para representar colores en el modelo de color RGB.*/
import java.awt.Image;
/* proporciona una clase para representar imágenes.*/
import java.awt.Toolkit;
/*proporciona una clase para obtener información sobre el entorno
de la aplicación, como el tamaño de la pantalla y el cursor actual*/


public class Principal extends javax.swing.JFrame {

    public Principal() {
        //Inicializa los componentes de la interfaz gráfica
        initComponents();
        // Establecer el icono de la ventana 
        //en la imagen devuelta por getIconImage
        setIconImage(getIconImage());
        //Establece la ubicación de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);

    }
    //Establece un icono personalizado para la aplicación.
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage
        (ClassLoader.getSystemResource("imagenes/LogoPrograma.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_de_vista = new javax.swing.JPanel();
        Barra = new javax.swing.JPanel();
        texto_de_icono = new javax.swing.JLabel();
        btninformacion = new javax.swing.JPanel();
        Informacion = new javax.swing.JLabel();
        btnatencion = new javax.swing.JPanel();
        Atencion = new javax.swing.JLabel();
        btnusuarios = new javax.swing.JPanel();
        Usuarios = new javax.swing.JLabel();
        btnservicios = new javax.swing.JPanel();
        Servicios = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        imagendefondo = new javax.swing.JLabel();
        texto_clinica = new javax.swing.JLabel();
        imagen_perro = new javax.swing.JLabel();
        imagen_gato = new javax.swing.JLabel();
        imagen_loro = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        texto_aves = new javax.swing.JLabel();
        texto_perro = new javax.swing.JLabel();
        texto_gato = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_de_vista.setBackground(new java.awt.Color(255, 255, 254));
        panel_de_vista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Barra.setBackground(new java.awt.Color(104, 207, 163));

        texto_de_icono.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 24)); // NOI18N
        texto_de_icono.setForeground(new java.awt.Color(255, 255, 255));
        texto_de_icono.setText("TOBY VETERINARY CLINIC");

        btninformacion.setBackground(new java.awt.Color(104, 207, 163));
        btninformacion.setForeground(new java.awt.Color(255, 255, 255));

        Informacion.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 20)); // NOI18N
        Informacion.setForeground(new java.awt.Color(255, 255, 255));
        Informacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Informacion.setText("Informacion");
        Informacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Informacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InformacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InformacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InformacionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btninformacionLayout = new javax.swing.GroupLayout(btninformacion);
        btninformacion.setLayout(btninformacionLayout);
        btninformacionLayout.setHorizontalGroup(
            btninformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Informacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );
        btninformacionLayout.setVerticalGroup(
            btninformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnatencion.setBackground(new java.awt.Color(104, 207, 163));
        btnatencion.setForeground(new java.awt.Color(255, 255, 255));

        Atencion.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 20)); // NOI18N
        Atencion.setForeground(new java.awt.Color(255, 255, 255));
        Atencion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Atencion.setText("Atencion Usuarios");
        Atencion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Atencion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtencionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AtencionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AtencionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnatencionLayout = new javax.swing.GroupLayout(btnatencion);
        btnatencion.setLayout(btnatencionLayout);
        btnatencionLayout.setHorizontalGroup(
            btnatencionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Atencion, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );
        btnatencionLayout.setVerticalGroup(
            btnatencionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Atencion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnusuarios.setBackground(new java.awt.Color(104, 207, 163));
        btnusuarios.setForeground(new java.awt.Color(255, 255, 255));

        Usuarios.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 20)); // NOI18N
        Usuarios.setForeground(new java.awt.Color(255, 255, 255));
        Usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usuarios.setText("Usuarios");
        Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UsuariosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnusuariosLayout = new javax.swing.GroupLayout(btnusuarios);
        btnusuarios.setLayout(btnusuariosLayout);
        btnusuariosLayout.setHorizontalGroup(
            btnusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        btnusuariosLayout.setVerticalGroup(
            btnusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnusuariosLayout.createSequentialGroup()
                .addComponent(Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnservicios.setBackground(new java.awt.Color(104, 207, 163));
        btnservicios.setForeground(new java.awt.Color(255, 255, 255));

        Servicios.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 20)); // NOI18N
        Servicios.setForeground(new java.awt.Color(255, 255, 255));
        Servicios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Servicios.setText("Servicios");
        Servicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ServiciosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ServiciosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ServiciosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnserviciosLayout = new javax.swing.GroupLayout(btnservicios);
        btnservicios.setLayout(btnserviciosLayout);
        btnserviciosLayout.setHorizontalGroup(
            btnserviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Servicios, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );
        btnserviciosLayout.setVerticalGroup(
            btnserviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Servicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Principal/Imagenes/Diseño sin título3.png"))); // NOI18N

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto_de_icono, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(btnservicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnatencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btninformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLayout.createSequentialGroup()
                .addGroup(BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnatencion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btninformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(icono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(texto_de_icono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                    .addGroup(BarraLayout.createSequentialGroup()
                        .addGroup(BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnservicios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnusuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );

        panel_de_vista.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        imagendefondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Principal/Imagenes/Diseño sin título23.png"))); // NOI18N
        panel_de_vista.add(imagendefondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, -1, 510));

        texto_clinica.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        texto_clinica.setForeground(new java.awt.Color(104, 207, 163));
        texto_clinica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_clinica.setText("           Clinica Veterinaria");
        panel_de_vista.add(texto_clinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 860, -1));

        imagen_perro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Principal/Imagenes/1_1.png"))); // NOI18N
        panel_de_vista.add(imagen_perro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        imagen_gato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Principal/Imagenes/2_1.png"))); // NOI18N
        panel_de_vista.add(imagen_gato, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, -1, -1));

        imagen_loro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Principal/Imagenes/1_2.png"))); // NOI18N
        panel_de_vista.add(imagen_loro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 210, -1, -1));

        subtitulo.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        subtitulo.setForeground(new java.awt.Color(104, 207, 163));
        subtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitulo.setText("Atencion y Cuidado a tu Mascota");
        panel_de_vista.add(subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, -1, -1));

        texto_aves.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        texto_aves.setForeground(new java.awt.Color(104, 207, 163));
        texto_aves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_aves.setText("Aves");
        panel_de_vista.add(texto_aves, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 440, -1, -1));

        texto_perro.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        texto_perro.setForeground(new java.awt.Color(104, 207, 163));
        texto_perro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_perro.setText("Perros");
        panel_de_vista.add(texto_perro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, -1));

        texto_gato.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        texto_gato.setForeground(new java.awt.Color(104, 207, 163));
        texto_gato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto_gato.setText("Gatos");
        panel_de_vista.add(texto_gato, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, -1, -1));

        getContentPane().add(panel_de_vista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InformacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformacionMouseEntered
        // Establece el color de fondo del panel  en negro
        btninformacion.setBackground(Color.black);
        // Establece el color del texto de la etiqueta en blanco
        Informacion.setForeground(Color.white);
    }//GEN-LAST:event_InformacionMouseEntered

    private void InformacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformacionMouseExited
        // Establece el color de fondo del panel a su color original
        btninformacion.setBackground(new Color(104, 207, 163));
        // Establece el color del texto de la etiqueta en blanco
        Informacion.setForeground(Color.white);
    }//GEN-LAST:event_InformacionMouseExited

    private void AtencionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtencionMouseEntered
        // Establece el color de fondo del panel  en negro
        btnatencion.setBackground(Color.black);
        // Establece el color del texto de la etiqueta en blanco
        Atencion.setForeground(Color.white);
    }//GEN-LAST:event_AtencionMouseEntered

    private void AtencionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtencionMouseExited
        // Establece el color de fondo del panel a su color original
        btnatencion.setBackground(new Color(104, 207, 163));
        // Establece el color del texto de la etiqueta en blanco
        Atencion.setForeground(Color.white);
    }//GEN-LAST:event_AtencionMouseExited

    private void ServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServiciosMouseClicked
        // Crea una instancia de la clase CargandoSer 
        //y la asigna a la variable frame.
        Servicios frame = new Servicios();
        // Establece la visibilidad de frame en true,
        //lo que significa que el objeto se muestra en la pantalla.
        frame.setVisible(true);
        // Llama al método dispose() en el objeto actual para liberar
        //los recursos del sistema asociados con él y cerrar la ventana.
        this.dispose();

    }//GEN-LAST:event_ServiciosMouseClicked

    private void ServiciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServiciosMouseEntered
        // Establece el color de fondo del panel en negro
        btnservicios.setBackground(Color.black);
        // Establece el color del texto de la etiqueta en blanco
        Servicios.setForeground(Color.white);
    }//GEN-LAST:event_ServiciosMouseEntered

    private void ServiciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServiciosMouseExited
        // Establece el color de fondo del panel a su color original
        btnservicios.setBackground(new Color(104, 207, 163));
        // Establece el color del texto de la etiqueta en blanco
        Servicios.setForeground(Color.white);
    }//GEN-LAST:event_ServiciosMouseExited

    private void UsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosMouseExited
        // Establece el color de fondo del panel a su color original
        btnusuarios.setBackground(new Color(104, 207, 163));
        // Establece el color del texto de la etiqueta en blanco
        Usuarios.setForeground(Color.white);
    }//GEN-LAST:event_UsuariosMouseExited

    private void UsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosMouseEntered
        // Establece el color de fondo del panel en negro
        btnusuarios.setBackground(Color.black);
        // Establece el color del texto de la etiqueta en blanco
        Usuarios.setForeground(Color.white);
    }//GEN-LAST:event_UsuariosMouseEntered

    private void UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosMouseClicked
        
        // Se crea una nueva instancia de la clase LoginUsuarios
        LoginUsuarios frame = new LoginUsuarios();
        // Se hace visible el marco utilizando el método setVisible
        frame.setVisible(true);
        // Se utiliza this.dispose() para cerrar la ventana actual
        this.dispose();


    }//GEN-LAST:event_UsuariosMouseClicked

    private void AtencionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtencionMouseClicked
        
        // Se crea una nueva instancia de la clase LoginAcc
        LoginAcc frame = new LoginAcc();
        // Se hace visible el marco utilizando el método setVisible
        frame.setVisible(true);
        // Se utiliza this.dispose() para cerrar la ventana actual
        this.dispose();

    }//GEN-LAST:event_AtencionMouseClicked

    private void InformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformacionMouseClicked
        // Se crea una nueva instancia de la clase Informacion
        Informacion frame = new Informacion();
        // Se hace visible el marco utilizando el método setVisible
        frame.setVisible(true);
        // Se utiliza this.dispose() para cerrar la ventana actual
        this.dispose();
    }//GEN-LAST:event_InformacionMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        initTrys();
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    private static void initTrys() {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atencion;
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel Informacion;
    private javax.swing.JLabel Servicios;
    private javax.swing.JLabel Usuarios;
    private javax.swing.JPanel btnatencion;
    private javax.swing.JPanel btninformacion;
    private javax.swing.JPanel btnservicios;
    private javax.swing.JPanel btnusuarios;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel imagen_gato;
    private javax.swing.JLabel imagen_loro;
    private javax.swing.JLabel imagen_perro;
    private javax.swing.JLabel imagendefondo;
    private javax.swing.JPanel panel_de_vista;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JLabel texto_aves;
    private javax.swing.JLabel texto_clinica;
    private javax.swing.JLabel texto_de_icono;
    private javax.swing.JLabel texto_gato;
    private javax.swing.JLabel texto_perro;
    // End of variables declaration//GEN-END:variables
}
