
package Interfaz_Acceso_Autorizado;

import Interfaz_Acceso_Usuarios.LoginUsuarios;
import Interfaz_Acceso_Usuarios.MenuPrincipal;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Menu_Opciones extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Opciones
     */
    public Menu_Opciones() {
        //Inicializa los componentes de la interfaz gráfica
        initComponents();
        // Establecer el icono de la ventana 
        //en la imagen devuelta por getIconImage
        setIconImage(getIconImage());
        //Establece la ubicación de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/LogoPrograma.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        texto_de_icono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_usuariosp = new javax.swing.JPanel();
        usuariosPrograma = new javax.swing.JLabel();
        btn_empleados = new javax.swing.JPanel();
        empleadosPro = new javax.swing.JLabel();
        btn_MascotasR = new javax.swing.JPanel();
        MascotasRegis = new javax.swing.JLabel();
        btn_Citas = new javax.swing.JPanel();
        RegistrarCitas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_buscarcitas = new javax.swing.JPanel();
        citas = new javax.swing.JLabel();
        btn_salir = new javax.swing.JPanel();
        salir = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu de Opciones");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(104, 207, 163));

        texto_de_icono.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        texto_de_icono.setForeground(new java.awt.Color(255, 255, 255));
        texto_de_icono.setText("TOBY VETERINARY CLINIC");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Autorizado/imagenes/Diseño sin título3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(398, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto_de_icono, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto_de_icono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_usuariosp.setBackground(new java.awt.Color(255, 255, 255));

        usuariosPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Autorizado/imagenes/icons8-seleccionar-usuarios-100.png"))); // NOI18N
        usuariosPrograma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usuariosPrograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuariosProgramaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usuariosProgramaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usuariosProgramaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_usuariospLayout = new javax.swing.GroupLayout(btn_usuariosp);
        btn_usuariosp.setLayout(btn_usuariospLayout);
        btn_usuariospLayout.setHorizontalGroup(
            btn_usuariospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usuariosPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btn_usuariospLayout.setVerticalGroup(
            btn_usuariospLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usuariosPrograma)
        );

        btn_empleados.setBackground(new java.awt.Color(255, 255, 255));
        btn_empleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        empleadosPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Autorizado/imagenes/icons8-empleados-100.png"))); // NOI18N
        empleadosPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empleadosPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empleadosProMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empleadosProMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empleadosProMouseExited(evt);
            }
        });
        btn_empleados.add(empleadosPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_MascotasR.setBackground(new java.awt.Color(255, 255, 255));

        MascotasRegis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Autorizado/imagenes/icons8-mascotas-100.png"))); // NOI18N
        MascotasRegis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MascotasRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MascotasRegisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MascotasRegisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MascotasRegisMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_MascotasRLayout = new javax.swing.GroupLayout(btn_MascotasR);
        btn_MascotasR.setLayout(btn_MascotasRLayout);
        btn_MascotasRLayout.setHorizontalGroup(
            btn_MascotasRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_MascotasRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MascotasRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btn_MascotasRLayout.setVerticalGroup(
            btn_MascotasRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_MascotasRLayout.createSequentialGroup()
                .addComponent(MascotasRegis)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_Citas.setBackground(new java.awt.Color(255, 255, 255));
        btn_Citas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistrarCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Autorizado/imagenes/icons8-farmacia-tienda-100.png"))); // NOI18N
        RegistrarCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarCitasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrarCitasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrarCitasMouseExited(evt);
            }
        });
        btn_Citas.add(RegistrarCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuarios del Programa");

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Empleados  Veterinaria");

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mascotas Registradas");

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Registrar citas");

        btn_buscarcitas.setBackground(new java.awt.Color(255, 255, 255));

        citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Autorizado/imagenes/icons8-cono-de-perro-100.png"))); // NOI18N
        citas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        citas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                citasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                citasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                citasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_buscarcitasLayout = new javax.swing.GroupLayout(btn_buscarcitas);
        btn_buscarcitas.setLayout(btn_buscarcitasLayout);
        btn_buscarcitasLayout.setHorizontalGroup(
            btn_buscarcitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(btn_buscarcitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_buscarcitasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(citas)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btn_buscarcitasLayout.setVerticalGroup(
            btn_buscarcitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(btn_buscarcitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btn_buscarcitasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(citas)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btn_salir.setBackground(new java.awt.Color(255, 255, 255));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Autorizado/imagenes/icons8-salir-100.png"))); // NOI18N
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_salirLayout = new javax.swing.GroupLayout(btn_salir);
        btn_salir.setLayout(btn_salirLayout);
        btn_salirLayout.setHorizontalGroup(
            btn_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_salirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir)
                .addContainerGap())
        );
        btn_salirLayout.setVerticalGroup(
            btn_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_salirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salir))
        );

        jLabel10.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Buscar citas");

        jLabel13.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Salir del Programa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btn_usuariosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218)
                .addComponent(btn_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250)
                .addComponent(btn_MascotasR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(184, 184, 184)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(203, 203, 203)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(btn_Citas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(230, 230, 230)
                            .addComponent(btn_buscarcitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(250, 250, 250)
                            .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(170, 170, 170)
                        .addComponent(jLabel4)
                        .addGap(203, 203, 203)
                        .addComponent(jLabel6))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_usuariosp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_MascotasR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Citas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarcitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
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

    private void usuariosProgramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosProgramaMouseClicked
        String codigo = JOptionPane.showInputDialog(null, "Ingrese su codigo de trabajo");
        if (codigo.equals("8643")) {
            JOptionPane.showMessageDialog(this, "Bienvenido, Asistente.");
            // Aquí se puede agregar el código para mostrar los datos restringidos
            UsuariosVet us = new UsuariosVet();
            us.setVisible(true);
            // Muestra la nueva ventana de menú de usuarios
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usted no puede ver estos datos.");
        }

    }//GEN-LAST:event_usuariosProgramaMouseClicked

    private void usuariosProgramaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosProgramaMouseEntered

        btn_usuariosp.setBackground(new Color(104, 207, 163));

    }//GEN-LAST:event_usuariosProgramaMouseEntered

    private void usuariosProgramaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosProgramaMouseExited

        btn_usuariosp.setBackground(Color.white);
    }//GEN-LAST:event_usuariosProgramaMouseExited

    private void empleadosProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosProMouseClicked
        String codigo = JOptionPane.showInputDialog(null, "Ingrese su codigo de trabajo");
        if (codigo.equals("8643")) {
            JOptionPane.showMessageDialog(this, "Bienvenido, Asistente.");
            // Aquí se puede agregar el código para mostrar los datos restringidos
            EmpleadosVet pg = new EmpleadosVet();
            pg.setVisible(true);
            // Muestra la nueva ventana de menú de usuarios
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usted no puede ver estos datos.");
        }


    }//GEN-LAST:event_empleadosProMouseClicked

    private void empleadosProMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosProMouseEntered
        btn_empleados.setBackground(new Color(104, 207, 163));
    }//GEN-LAST:event_empleadosProMouseEntered

    private void empleadosProMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosProMouseExited
        btn_empleados.setBackground(Color.white);
    }//GEN-LAST:event_empleadosProMouseExited

    private void MascotasRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MascotasRegisMouseClicked
        String codigo = JOptionPane.showInputDialog(null, "Ingrese su codigo de trabajo");
        if (codigo.equals("8643")) {
            JOptionPane.showMessageDialog(this, "Bienvenido, Asistente.");
            // Aquí se puede agregar el código para mostrar los datos restringidos
            Mascotas_Registradas ms = new Mascotas_Registradas();
            ms.setVisible(true);
            // Muestra la nueva ventana de menú de usuarios
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usted no puede ver estos datos.");
        }
    }//GEN-LAST:event_MascotasRegisMouseClicked

    private void MascotasRegisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MascotasRegisMouseEntered
        btn_MascotasR.setBackground(new Color(104, 207, 163));
    }//GEN-LAST:event_MascotasRegisMouseEntered

    private void MascotasRegisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MascotasRegisMouseExited
        btn_MascotasR.setBackground(Color.white);
    }//GEN-LAST:event_MascotasRegisMouseExited

    private void RegistrarCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarCitasMouseClicked
        String codigo = JOptionPane.showInputDialog(null, "Ingrese su codigo de trabajo");
        if (codigo.equals("1890")) {
            JOptionPane.showMessageDialog(this, "Bienvenido, Doctor/Doctora");
            // Aquí se puede agregar el código para mostrar los datos restringidos
            Citas_vet cs = new Citas_vet();
            cs.setVisible(true);
            // Muestra la nueva ventana de menú de usuarios
            this.dispose();
        } else if (codigo.equals("2045")){
             JOptionPane.showMessageDialog(this, "Bienvendio, Enfermero/Enfermera");
             // Aquí se puede agregar el código para mostrar los datos restringidos
             Citas_vet cs = new Citas_vet();
             cs.setVisible(true);
            // Muestra la nueva ventana de menú de usuarios
            this.dispose();
        }else{
             JOptionPane.showMessageDialog(this, "USTED NO PUEDE VER ESOS DATOS");
        }
    }//GEN-LAST:event_RegistrarCitasMouseClicked

    private void RegistrarCitasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarCitasMouseEntered
        btn_Citas.setBackground(new Color(104, 207, 163));
    }//GEN-LAST:event_RegistrarCitasMouseEntered

    private void RegistrarCitasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarCitasMouseExited
        btn_Citas.setBackground(Color.white);
    }//GEN-LAST:event_RegistrarCitasMouseExited

    private void citasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citasMouseClicked
              String codigo = JOptionPane.showInputDialog(null, "Ingrese su codigo de trabajo");
        if (codigo.equals("1890")) {
            JOptionPane.showMessageDialog(this, "Bienvenido, Doctor/Doctora");
            // Aquí se puede agregar el código para mostrar los datos restringidos
            Buscar_Cita cs = new Buscar_Cita();
            cs.setVisible(true);
            // Muestra la nueva ventana de menú de usuarios
            this.dispose();
        } else if (codigo.equals("2045")){
             JOptionPane.showMessageDialog(this, "Bienvendio, Enfermero/Enfermera");
             // Aquí se puede agregar el código para mostrar los datos restringidos
             Buscar_Cita bc = new Buscar_Cita();
             bc.setVisible(true);
            // Muestra la nueva ventana de menú de usuarios
            this.dispose();
        }else{
             JOptionPane.showMessageDialog(this, "USTED NO PUEDE VER ESOS DATOS");
        }
    }//GEN-LAST:event_citasMouseClicked

    private void citasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citasMouseEntered
       btn_buscarcitas.setBackground(new Color(104, 207, 163));
    }//GEN-LAST:event_citasMouseEntered

    private void citasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citasMouseExited
       btn_buscarcitas.setBackground(Color.white);
    }//GEN-LAST:event_citasMouseExited

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
       // Muestra un JOptionPane con los botones "Sí" y "No"
        int option = JOptionPane.showOptionDialog(this,
                "¿Desea salir?", "Confirmación Cerrar ",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE, null,
                null, null);

        // Si el usuario selecciona "Sí"muestra JFrame el jframe de usuarios
        if (option == JOptionPane.YES_OPTION) {
            LoginAcc lg = new LoginAcc();
            lg.setDefaultCloseOperation(MenuPrincipal.EXIT_ON_CLOSE);
            lg.setVisible(true);
            this.dispose();
        } 
    }//GEN-LAST:event_salirMouseClicked

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
       btn_salir.setBackground(new Color(104, 207, 163));
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        btn_salir.setBackground(Color.white);
    }//GEN-LAST:event_salirMouseExited

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
            java.util.logging.Logger.getLogger(Menu_Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Opciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MascotasRegis;
    private javax.swing.JLabel RegistrarCitas;
    private javax.swing.JPanel btn_Citas;
    private javax.swing.JPanel btn_MascotasR;
    private javax.swing.JPanel btn_buscarcitas;
    private javax.swing.JPanel btn_empleados;
    private javax.swing.JPanel btn_salir;
    private javax.swing.JPanel btn_usuariosp;
    private javax.swing.JLabel citas;
    private javax.swing.JLabel empleadosPro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel texto_de_icono;
    private javax.swing.JLabel usuariosPrograma;
    // End of variables declaration//GEN-END:variables
}
