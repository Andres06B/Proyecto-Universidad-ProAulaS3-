// Se define el paquete al que pertenece la clase
package Interfaz_Acceso_Usuarios;

// Importación de las clases necesarias desde los diferentes paquetes
import Modulo_Datos.modulo_datos;
import Modulo_Menu.modulo_Inicio;
import Modulo_Mis_Citas.modulo_mis_citas;
import Modulo_Mis_Mascotas.modulo_mis_mascotas;
import Modulo_Registro.modulo_registro;
import java.awt.Color;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MenuPrincipal extends javax.swing.JFrame {

    
    private String username;
    
    /*declaramos instancias de diferentes modulos donde guardaremos 
    sus respectivos datos*/
    Modulo_Menu.modulo_Inicio modulo_Inicio;//datos inicio
    Modulo_Datos.modulo_datos modulo_datos;// datos de usuario
    Modulo_Registro.modulo_registro modulo_registro;// datos de registro
    Modulo_Mis_Mascotas.modulo_mis_mascotas modulo_mis_mascotas;//datos mascota
    Modulo_Mis_Citas.modulo_mis_citas modulo_mis_citas;//datos citas

    public MenuPrincipal() {
        initComponents();
        //Inicializa los componentes de la interfaz gráfica
        setIconImage(getIconImage());
        /* Establecer el icono de la 
        ventana en la imagen devuelta por getIconImage*/
        this.setLocationRelativeTo(null);
        /*Establece la ubicación de 
        la ventana en el centro de la pantalla*/

    }
    public MenuPrincipal(String username) {
        /*contructor que toma argumento 
        String username para inicializar la variable username*/
        this(); 
        //verifica que todas las variables se inicialicen correctamente
        this.username = username;
        // asigna el valor del argumento username
        
        // Se crea una nueva instancia de la clase modulo_Inicio 
        //y se asigna a la variable 'modulo_Inicio'
        modulo_Inicio = new modulo_Inicio();
        // Se crea una nueva instancia de la clase modulo_datos
        //y se asigna a la variable 'modulo_datos', pasando 'username' 
        //como argumento al constructor
        modulo_datos = new modulo_datos(username);
        // Se crea una nueva instancia de la clase modulo_registro 
        //y se asigna a la variable 'modulo_registro'
        modulo_registro = new modulo_registro();
        // Se crea una nueva instancia de la clase modulo_mis_mascotas
        //y se asigna a la variable 'modulo_mis_mascotas'
        modulo_mis_mascotas = new modulo_mis_mascotas();
        // Se crea una nueva instancia de la clase modulo_mis_citas 
        //y se asigna a la variable 'modulo_mis_citas'
        modulo_mis_citas = new modulo_mis_citas();

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

        Panel_menu = new javax.swing.JPanel();
        panel_opciones = new javax.swing.JPanel();
        Imagen_menu = new javax.swing.JLabel();
        btn_inicio = new javax.swing.JPanel();
        Inicio_txt = new javax.swing.JLabel();
        icono_inicio = new javax.swing.JLabel();
        btn_datos = new javax.swing.JPanel();
        datos_personalestxt = new javax.swing.JLabel();
        icono_datos = new javax.swing.JLabel();
        btn_registro = new javax.swing.JPanel();
        registro_mascotastxt = new javax.swing.JLabel();
        icono_registro = new javax.swing.JLabel();
        btn_mascotas = new javax.swing.JPanel();
        mis_mascotastxt = new javax.swing.JLabel();
        icono_mascotas = new javax.swing.JLabel();
        btn_mis_citas = new javax.swing.JPanel();
        mis_citastxt = new javax.swing.JLabel();
        icono_citas = new javax.swing.JLabel();
        Btn_cerrar = new javax.swing.JPanel();
        cerra_sesiontxt = new javax.swing.JLabel();
        icono_cerrar_sesion = new javax.swing.JLabel();
        barra = new javax.swing.JPanel();
        textoicono = new javax.swing.JLabel();
        Icono = new javax.swing.JLabel();
        PanelP = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinic Veterinart");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_menu.setBackground(new java.awt.Color(204, 204, 204));
        Panel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_opciones.setBackground(new java.awt.Color(104, 207, 163));

        Imagen_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Usuarios/imagenes/ccccc.png"))); // NOI18N

        btn_inicio.setBackground(new java.awt.Color(104, 207, 163));

        Inicio_txt.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        Inicio_txt.setForeground(new java.awt.Color(255, 255, 255));
        Inicio_txt.setText("Inicio");
        Inicio_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inicio_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inicio_txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Inicio_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Inicio_txtMouseExited(evt);
            }
        });

        icono_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Usuarios/imagenes/icons8-página-principal-40.png"))); // NOI18N

        javax.swing.GroupLayout btn_inicioLayout = new javax.swing.GroupLayout(btn_inicio);
        btn_inicio.setLayout(btn_inicioLayout);
        btn_inicioLayout.setHorizontalGroup(
            btn_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_inicioLayout.createSequentialGroup()
                .addComponent(icono_inicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inicio_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_inicioLayout.setVerticalGroup(
            btn_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icono_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(Inicio_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btn_datos.setBackground(new java.awt.Color(104, 207, 163));

        datos_personalestxt.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        datos_personalestxt.setForeground(new java.awt.Color(255, 255, 255));
        datos_personalestxt.setText("Datos Personales");
        datos_personalestxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        datos_personalestxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datos_personalestxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                datos_personalestxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                datos_personalestxtMouseExited(evt);
            }
        });

        icono_datos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Usuarios/imagenes/icons8-usuario-masculino-en-círculo-40 (1).png"))); // NOI18N

        javax.swing.GroupLayout btn_datosLayout = new javax.swing.GroupLayout(btn_datos);
        btn_datos.setLayout(btn_datosLayout);
        btn_datosLayout.setHorizontalGroup(
            btn_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_datosLayout.createSequentialGroup()
                .addComponent(icono_datos)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_datosLayout.createSequentialGroup()
                    .addGap(0, 44, Short.MAX_VALUE)
                    .addComponent(datos_personalestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        btn_datosLayout.setVerticalGroup(
            btn_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icono_datos, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addGroup(btn_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_datosLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(datos_personalestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btn_registro.setBackground(new java.awt.Color(104, 207, 163));

        registro_mascotastxt.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        registro_mascotastxt.setForeground(new java.awt.Color(255, 255, 255));
        registro_mascotastxt.setText("Registro Mascotas");
        registro_mascotastxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registro_mascotastxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registro_mascotastxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registro_mascotastxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registro_mascotastxtMouseExited(evt);
            }
        });

        icono_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Usuarios/imagenes/icons8-registro-40.png"))); // NOI18N

        javax.swing.GroupLayout btn_registroLayout = new javax.swing.GroupLayout(btn_registro);
        btn_registro.setLayout(btn_registroLayout);
        btn_registroLayout.setHorizontalGroup(
            btn_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_registroLayout.createSequentialGroup()
                .addComponent(icono_registro)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_registroLayout.createSequentialGroup()
                    .addGap(0, 45, Short.MAX_VALUE)
                    .addComponent(registro_mascotastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        btn_registroLayout.setVerticalGroup(
            btn_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icono_registro, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addGroup(btn_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_registroLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(registro_mascotastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btn_mascotas.setBackground(new java.awt.Color(104, 207, 163));

        mis_mascotastxt.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        mis_mascotastxt.setForeground(new java.awt.Color(255, 255, 255));
        mis_mascotastxt.setText("Mis Mascotas");
        mis_mascotastxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mis_mascotastxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mis_mascotastxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mis_mascotastxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mis_mascotastxtMouseExited(evt);
            }
        });

        icono_mascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Usuarios/imagenes/icons8-mascotas-40.png"))); // NOI18N

        javax.swing.GroupLayout btn_mascotasLayout = new javax.swing.GroupLayout(btn_mascotas);
        btn_mascotas.setLayout(btn_mascotasLayout);
        btn_mascotasLayout.setHorizontalGroup(
            btn_mascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_mascotasLayout.createSequentialGroup()
                .addComponent(icono_mascotas)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_mascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_mascotasLayout.createSequentialGroup()
                    .addGap(0, 45, Short.MAX_VALUE)
                    .addComponent(mis_mascotastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        btn_mascotasLayout.setVerticalGroup(
            btn_mascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icono_mascotas, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addGroup(btn_mascotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_mascotasLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(mis_mascotastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btn_mis_citas.setBackground(new java.awt.Color(104, 207, 163));

        mis_citastxt.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        mis_citastxt.setForeground(new java.awt.Color(255, 255, 255));
        mis_citastxt.setText("Mis Citas");
        mis_citastxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mis_citastxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mis_citastxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mis_citastxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mis_citastxtMouseExited(evt);
            }
        });

        icono_citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Usuarios/imagenes/icons8-sitio-web-de-citas-40.png"))); // NOI18N

        javax.swing.GroupLayout btn_mis_citasLayout = new javax.swing.GroupLayout(btn_mis_citas);
        btn_mis_citas.setLayout(btn_mis_citasLayout);
        btn_mis_citasLayout.setHorizontalGroup(
            btn_mis_citasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_mis_citasLayout.createSequentialGroup()
                .addComponent(icono_citas)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_mis_citasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_mis_citasLayout.createSequentialGroup()
                    .addGap(0, 42, Short.MAX_VALUE)
                    .addComponent(mis_citastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        btn_mis_citasLayout.setVerticalGroup(
            btn_mis_citasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icono_citas, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addGroup(btn_mis_citasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_mis_citasLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(mis_citastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Btn_cerrar.setBackground(new java.awt.Color(153, 0, 0));

        cerra_sesiontxt.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        cerra_sesiontxt.setForeground(new java.awt.Color(255, 255, 255));
        cerra_sesiontxt.setText("Cerrar sesion");
        cerra_sesiontxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerra_sesiontxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerra_sesiontxtMouseClicked(evt);
            }
        });

        icono_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Usuarios/imagenes/icons8-cerrar-sesión-40.png"))); // NOI18N

        javax.swing.GroupLayout Btn_cerrarLayout = new javax.swing.GroupLayout(Btn_cerrar);
        Btn_cerrar.setLayout(Btn_cerrarLayout);
        Btn_cerrarLayout.setHorizontalGroup(
            Btn_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Btn_cerrarLayout.createSequentialGroup()
                .addComponent(icono_cerrar_sesion)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Btn_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Btn_cerrarLayout.createSequentialGroup()
                    .addGap(0, 46, Short.MAX_VALUE)
                    .addComponent(cerra_sesiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        Btn_cerrarLayout.setVerticalGroup(
            Btn_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Btn_cerrarLayout.createSequentialGroup()
                .addComponent(icono_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Btn_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Btn_cerrarLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(cerra_sesiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panel_opcionesLayout = new javax.swing.GroupLayout(panel_opciones);
        panel_opciones.setLayout(panel_opcionesLayout);
        panel_opcionesLayout.setHorizontalGroup(
            panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panel_opcionesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(btn_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_mascotas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_mis_citas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Btn_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_opcionesLayout.setVerticalGroup(
            panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_opcionesLayout.createSequentialGroup()
                .addComponent(Imagen_menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_mascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_mis_citas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(Btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Panel_menu.add(panel_opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        barra.setBackground(new java.awt.Color(104, 207, 163));

        textoicono.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        textoicono.setForeground(new java.awt.Color(255, 255, 255));
        textoicono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoicono.setText("MY VETERINARY ");

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Usuarios/imagenes/Icono_logoVet.png"))); // NOI18N

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Icono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoicono, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(670, Short.MAX_VALUE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Icono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(textoicono, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Panel_menu.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 930, 50));

        PanelP.setBackground(new java.awt.Color(255, 255, 255));
        PanelP.setLayout(new java.awt.GridLayout(1, 0));
        Panel_menu.add(PanelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 910, 490));

        getContentPane().add(Panel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Inicio_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inicio_txtMouseClicked
        // Se llama al método 'Cambiar_Modulo' 
        //y se pasa la variable 'modulo_Inicio' como argumento
        Cambiar_Modulo(modulo_Inicio);

    }//GEN-LAST:event_Inicio_txtMouseClicked

    private void datos_personalestxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datos_personalestxtMouseClicked
       // Se llama al método 'Cambiar_Modulo' 
        //y se pasa la variable 'modulo_datos' como argumento
        Cambiar_Modulo(modulo_datos);
    }//GEN-LAST:event_datos_personalestxtMouseClicked

    private void registro_mascotastxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registro_mascotastxtMouseClicked
        // Se llama al método 'Cambiar_Modulo' 
        //y se pasa la variable 'modulo_registro' como argumento
        Cambiar_Modulo(modulo_registro);
    }//GEN-LAST:event_registro_mascotastxtMouseClicked

    private void mis_mascotastxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mis_mascotastxtMouseClicked
        // Se llama al método 'Cambiar_Modulo' 
        //y se pasa la variable 'modulo_mis_mascotas' como argumento
        Cambiar_Modulo(modulo_mis_mascotas);
    }//GEN-LAST:event_mis_mascotastxtMouseClicked

    private void mis_citastxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mis_citastxtMouseClicked
        // Se llama al método 'Cambiar_Modulo' 
        //y se pasa la variable 'modulo_citas' como argumento
        Cambiar_Modulo(modulo_mis_citas);
    }//GEN-LAST:event_mis_citastxtMouseClicked

    private void cerra_sesiontxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerra_sesiontxtMouseClicked
        // Muestra un JOptionPane con los botones "Sí" y "No"
        int option = JOptionPane.showOptionDialog(this,
                "¿Desea salir?", "Confirmación Cerrar sesion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE, null,
                null, null);

        // Si el usuario selecciona "Sí"muestra JFrame el jframe de usuarios
        if (option == JOptionPane.YES_OPTION) {
            LoginUsuarios lg = new LoginUsuarios();
            lg.setDefaultCloseOperation(MenuPrincipal.EXIT_ON_CLOSE);
            lg.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_cerra_sesiontxtMouseClicked

    private void Inicio_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inicio_txtMouseEntered
        // Establece el color de fondo del panel  en negro
        btn_inicio.setBackground(Color.black);
        // Establece el color del texto de la etiqueta en blanco
        Inicio_txt.setForeground(Color.white);
    }//GEN-LAST:event_Inicio_txtMouseEntered

    private void Inicio_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inicio_txtMouseExited
        // Establece el color de fondo del panel a su color original
        btn_inicio.setBackground(new Color(104, 207, 163));
        // Establece el color del texto de la etiqueta en blanco
        Inicio_txt.setForeground(Color.white);
    }//GEN-LAST:event_Inicio_txtMouseExited

    private void datos_personalestxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datos_personalestxtMouseEntered
        // Establece el color de fondo del panel  en negro
        btn_datos.setBackground(Color.black);
        // Establece el color del texto de la etiqueta en blanco
        datos_personalestxt.setForeground(Color.white);
    }//GEN-LAST:event_datos_personalestxtMouseEntered

    private void datos_personalestxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datos_personalestxtMouseExited
        // Establece el color de fondo del panel a su color original
        btn_datos.setBackground(new Color(104, 207, 163));
        // Establece el color del texto de la etiqueta en blanco
        datos_personalestxt.setForeground(Color.white);
    }//GEN-LAST:event_datos_personalestxtMouseExited

    private void registro_mascotastxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registro_mascotastxtMouseEntered
        // Establece el color de fondo del panel  en negro
        btn_registro.setBackground(Color.black);
        // Establece el color del texto de la etiqueta en blanco
        registro_mascotastxt.setForeground(Color.white);
    }//GEN-LAST:event_registro_mascotastxtMouseEntered

    private void registro_mascotastxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registro_mascotastxtMouseExited
        // Establece el color de fondo del panel a su color original
        btn_registro.setBackground(new Color(104, 207, 163));
        // Establece el color del texto de la etiqueta en blanco
        registro_mascotastxt.setForeground(Color.white);
    }//GEN-LAST:event_registro_mascotastxtMouseExited

    private void mis_mascotastxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mis_mascotastxtMouseEntered
        // Establece el color de fondo del panel  en negro
        btn_mascotas.setBackground(Color.black);
        // Establece el color del texto de la etiqueta en blanco
        mis_mascotastxt.setForeground(Color.white);
    }//GEN-LAST:event_mis_mascotastxtMouseEntered

    private void mis_mascotastxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mis_mascotastxtMouseExited
        // Establece el color de fondo del panel a su color original
        btn_mascotas.setBackground(new Color(104, 207, 163));
        // Establece el color del texto de la etiqueta en blanco
        mis_mascotastxt.setForeground(Color.white);
    }//GEN-LAST:event_mis_mascotastxtMouseExited

    private void mis_citastxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mis_citastxtMouseEntered
        // Establece el color de fondo del panel  en negro
        btn_mis_citas.setBackground(Color.black);
        // Establece el color del texto de la etiqueta en blanco
        mis_citastxt.setForeground(Color.white);
    }//GEN-LAST:event_mis_citastxtMouseEntered

    private void mis_citastxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mis_citastxtMouseExited
        // Establece el color de fondo del panel a su color original
        btn_mis_citas.setBackground(new Color(104, 207, 163));
        // Establece el color del texto de la etiqueta en blanco
        mis_citastxt.setForeground(Color.white);
    }//GEN-LAST:event_mis_citastxtMouseExited

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Btn_cerrar;
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel Imagen_menu;
    private javax.swing.JLabel Inicio_txt;
    private javax.swing.JPanel PanelP;
    private javax.swing.JPanel Panel_menu;
    private javax.swing.JPanel barra;
    private javax.swing.JPanel btn_datos;
    private javax.swing.JPanel btn_inicio;
    private javax.swing.JPanel btn_mascotas;
    private javax.swing.JPanel btn_mis_citas;
    private javax.swing.JPanel btn_registro;
    private javax.swing.JLabel cerra_sesiontxt;
    private javax.swing.JLabel datos_personalestxt;
    private javax.swing.JLabel icono_cerrar_sesion;
    private javax.swing.JLabel icono_citas;
    private javax.swing.JLabel icono_datos;
    private javax.swing.JLabel icono_inicio;
    private javax.swing.JLabel icono_mascotas;
    private javax.swing.JLabel icono_registro;
    private javax.swing.JLabel mis_citastxt;
    private javax.swing.JLabel mis_mascotastxt;
    private javax.swing.JPanel panel_opciones;
    private javax.swing.JLabel registro_mascotastxt;
    private javax.swing.JLabel textoicono;
    // End of variables declaration//GEN-END:variables

    private void Cambiar_Modulo(JPanel modulo) {
        // Eliminar todos los componentes del panel actual
        PanelP.removeAll();
        // Agregar el nuevo módulo al panel
        PanelP.add(modulo);
        // Actualizar la interfaz para reflejar los cambios
        PanelP.repaint();
        PanelP.revalidate();
    }

}
