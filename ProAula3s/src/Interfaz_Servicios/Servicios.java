package Interfaz_Servicios;//ubicacion del Jframe

import Interfaz_Principal.Principal;
/*es una clase que representa la interfaz 
de usuario principal de la aplicación.*/
import java.awt.Color;
/*proporciona una clase para representar colores en el modelo de color RGB*/
import java.awt.Image;
/*proporciona una clase para representar imágenes.*/
import java.awt.Toolkit;
/*proporciona una clase para obtener información sobre el entorno
de la aplicación, como el tamaño de la pantalla y el cursor actual.*/

public class Servicios extends javax.swing.JFrame {

    public Servicios() {
        //Inicializa los componentes de la interfaz gráfica
        initComponents();
        // Establecer el icono de la ventana 
        //en la imagen devuelta por getIconImage
        setIconImage(getIconImage());
        //Establece la ubicación de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
    }
    //Reamplaza el icono
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage
        (ClassLoader.getSystemResource("imagenes/LogoPrograma.png"));
        //Ubicacion de la imagen
        return retValue;
        //devuelve el valor
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        BarraOpciones = new javax.swing.JPanel();
        btn_diagnostico = new javax.swing.JPanel();
        txtdiagnostico = new javax.swing.JLabel();
        btn_atencion = new javax.swing.JPanel();
        txtatencion = new javax.swing.JLabel();
        btn_Hospitalizacion = new javax.swing.JPanel();
        txthospitalizacion = new javax.swing.JLabel();
        btn_medicina = new javax.swing.JPanel();
        txtmedicina = new javax.swing.JLabel();
        btn_sala_belleza = new javax.swing.JPanel();
        txtsaladebelleza = new javax.swing.JLabel();
        btn_accesorios = new javax.swing.JPanel();
        txtaccesorios = new javax.swing.JLabel();
        barra = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        iconomenu = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Panel_Diagnostico = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        texto1 = new javax.swing.JLabel();
        Panel_atencion = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        imagen2 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        panel_hospitalizacion = new javax.swing.JPanel();
        titulo3 = new javax.swing.JLabel();
        imagen3 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        panel_medicina = new javax.swing.JPanel();
        titulo4 = new javax.swing.JLabel();
        imagen4 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        panel_sala_belleza = new javax.swing.JPanel();
        titulo5 = new javax.swing.JLabel();
        imagen5 = new javax.swing.JLabel();
        texto5 = new javax.swing.JLabel();
        panel_servicios = new javax.swing.JPanel();
        titulo6 = new javax.swing.JLabel();
        titulo7 = new javax.swing.JLabel();
        texto7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servicion Veterinarios");
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraOpciones.setBackground(new java.awt.Color(109, 213, 168));
        BarraOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_diagnostico.setBackground(new java.awt.Color(109, 213, 168));
        btn_diagnostico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtdiagnostico.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 15)); // NOI18N
        txtdiagnostico.setForeground(new java.awt.Color(255, 255, 255));
        txtdiagnostico.setText("Servicio De Diagnostico");
        txtdiagnostico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtdiagnostico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdiagnosticoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtdiagnosticoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtdiagnosticoMouseExited(evt);
            }
        });
        btn_diagnostico.add(txtdiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 240, 38));

        BarraOpciones.add(btn_diagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        btn_atencion.setBackground(new java.awt.Color(109, 213, 168));

        txtatencion.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 15)); // NOI18N
        txtatencion.setForeground(new java.awt.Color(255, 255, 255));
        txtatencion.setText("Servicio De Atencion 24h");
        txtatencion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtatencion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtatencionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtatencionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtatencionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_atencionLayout = new javax.swing.GroupLayout(btn_atencion);
        btn_atencion.setLayout(btn_atencionLayout);
        btn_atencionLayout.setHorizontalGroup(
            btn_atencionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtatencion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_atencionLayout.setVerticalGroup(
            btn_atencionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_atencionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtatencion, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        BarraOpciones.add(btn_atencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 240, -1));

        btn_Hospitalizacion.setBackground(new java.awt.Color(109, 213, 168));

        txthospitalizacion.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 15)); // NOI18N
        txthospitalizacion.setForeground(new java.awt.Color(255, 255, 255));
        txthospitalizacion.setText("Servicio De Hospitalizacion");
        txthospitalizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txthospitalizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txthospitalizacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txthospitalizacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txthospitalizacionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_HospitalizacionLayout = new javax.swing.GroupLayout(btn_Hospitalizacion);
        btn_Hospitalizacion.setLayout(btn_HospitalizacionLayout);
        btn_HospitalizacionLayout.setHorizontalGroup(
            btn_HospitalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txthospitalizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_HospitalizacionLayout.setVerticalGroup(
            btn_HospitalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_HospitalizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txthospitalizacion, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        BarraOpciones.add(btn_Hospitalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 128, 240, -1));

        btn_medicina.setBackground(new java.awt.Color(109, 213, 168));

        txtmedicina.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 15)); // NOI18N
        txtmedicina.setForeground(new java.awt.Color(255, 255, 255));
        txtmedicina.setText("Servicio De Medicina");
        txtmedicina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtmedicina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmedicinaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtmedicinaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtmedicinaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_medicinaLayout = new javax.swing.GroupLayout(btn_medicina);
        btn_medicina.setLayout(btn_medicinaLayout);
        btn_medicinaLayout.setHorizontalGroup(
            btn_medicinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtmedicina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_medicinaLayout.setVerticalGroup(
            btn_medicinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_medicinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtmedicina, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        BarraOpciones.add(btn_medicina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 240, -1));

        btn_sala_belleza.setBackground(new java.awt.Color(109, 213, 168));

        txtsaladebelleza.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 15)); // NOI18N
        txtsaladebelleza.setForeground(new java.awt.Color(255, 255, 255));
        txtsaladebelleza.setText("Servicio De Sala de Belleza");
        txtsaladebelleza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtsaladebelleza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsaladebellezaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtsaladebellezaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtsaladebellezaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_sala_bellezaLayout = new javax.swing.GroupLayout(btn_sala_belleza);
        btn_sala_belleza.setLayout(btn_sala_bellezaLayout);
        btn_sala_bellezaLayout.setHorizontalGroup(
            btn_sala_bellezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtsaladebelleza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_sala_bellezaLayout.setVerticalGroup(
            btn_sala_bellezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_sala_bellezaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtsaladebelleza, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        BarraOpciones.add(btn_sala_belleza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 258, 240, -1));

        btn_accesorios.setBackground(new java.awt.Color(109, 213, 168));

        txtaccesorios.setFont(new java.awt.Font("Raleway ExtraBold", 0, 15)); // NOI18N
        txtaccesorios.setForeground(new java.awt.Color(255, 255, 255));
        txtaccesorios.setText("Servicio De Accesorios");
        txtaccesorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtaccesorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtaccesoriosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtaccesoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtaccesoriosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_accesoriosLayout = new javax.swing.GroupLayout(btn_accesorios);
        btn_accesorios.setLayout(btn_accesoriosLayout);
        btn_accesoriosLayout.setHorizontalGroup(
            btn_accesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_accesoriosLayout.createSequentialGroup()
                .addComponent(txtaccesorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_accesoriosLayout.setVerticalGroup(
            btn_accesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_accesoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtaccesorios, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        BarraOpciones.add(btn_accesorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 314, 240, -1));

        jPanel4.add(BarraOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 240, -1));

        barra.setBackground(new java.awt.Color(104, 207, 163));

        Titulo.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Titulo.setText("Servicios Veterinarios");

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Servicios/imagenes/Diseño sin título3.png"))); // NOI18N

        iconomenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Servicios/imagenes/icons8-menú-xbox-50 (1).png"))); // NOI18N
        iconomenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconomenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconomenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 620, Short.MAX_VALUE)
                .addComponent(iconomenu)
                .addGap(17, 17, 17))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(iconomenu, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel4.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1000, -1));

        Panel_Diagnostico.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Diagnosticos");

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Servicios/imagenes/diagnostico.png"))); // NOI18N

        texto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Servicios/imagenes/txtdiagnostico.png"))); // NOI18N

        javax.swing.GroupLayout Panel_DiagnosticoLayout = new javax.swing.GroupLayout(Panel_Diagnostico);
        Panel_Diagnostico.setLayout(Panel_DiagnosticoLayout);
        Panel_DiagnosticoLayout.setHorizontalGroup(
            Panel_DiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DiagnosticoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(Panel_DiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(texto1)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        Panel_DiagnosticoLayout.setVerticalGroup(
            Panel_DiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DiagnosticoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(titulo)
                .addGap(28, 28, 28)
                .addGroup(Panel_DiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(texto1)
                    .addComponent(imagen))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", Panel_Diagnostico);

        Panel_atencion.setBackground(new java.awt.Color(255, 255, 255));

        titulo2.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 24)); // NOI18N
        titulo2.setForeground(new java.awt.Color(0, 0, 0));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("Atencion 24H");

        imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Servicios/imagenes/Diseño sin título22.png"))); // NOI18N

        texto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Servicios/imagenes/txt24.png"))); // NOI18N

        javax.swing.GroupLayout Panel_atencionLayout = new javax.swing.GroupLayout(Panel_atencion);
        Panel_atencion.setLayout(Panel_atencionLayout);
        Panel_atencionLayout.setHorizontalGroup(
            Panel_atencionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_atencionLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(Panel_atencionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(texto2)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        Panel_atencionLayout.setVerticalGroup(
            Panel_atencionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_atencionLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(titulo2)
                .addGap(27, 27, 27)
                .addGroup(Panel_atencionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(texto2)
                    .addComponent(imagen2))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", Panel_atencion);

        panel_hospitalizacion.setBackground(new java.awt.Color(255, 255, 255));

        titulo3.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 24)); // NOI18N
        titulo3.setForeground(new java.awt.Color(0, 0, 0));
        titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo3.setText("Hospitalizacion");

        imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Servicios/imagenes/hospitalizacion.png"))); // NOI18N

        texto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Servicios/imagenes/txthospitalizacion.png"))); // NOI18N

        javax.swing.GroupLayout panel_hospitalizacionLayout = new javax.swing.GroupLayout(panel_hospitalizacion);
        panel_hospitalizacion.setLayout(panel_hospitalizacionLayout);
        panel_hospitalizacionLayout.setHorizontalGroup(
            panel_hospitalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_hospitalizacionLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panel_hospitalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagen3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(texto3)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        panel_hospitalizacionLayout.setVerticalGroup(
            panel_hospitalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_hospitalizacionLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(titulo3)
                .addGap(43, 43, 43)
                .addGroup(panel_hospitalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(texto3)
                    .addComponent(imagen3))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", panel_hospitalizacion);

        panel_medicina.setBackground(new java.awt.Color(255, 255, 255));

        titulo4.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 24)); // NOI18N
        titulo4.setForeground(new java.awt.Color(0, 0, 0));
        titulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo4.setText("Medicina");

        imagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Servicios/imagenes/Diseño sin título34.png"))); // NOI18N

        texto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Servicios/imagenes/txtmedicina.png"))); // NOI18N

        javax.swing.GroupLayout panel_medicinaLayout = new javax.swing.GroupLayout(panel_medicina);
        panel_medicina.setLayout(panel_medicinaLayout);
        panel_medicinaLayout.setHorizontalGroup(
            panel_medicinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_medicinaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panel_medicinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagen4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addComponent(texto4)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panel_medicinaLayout.setVerticalGroup(
            panel_medicinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_medicinaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(titulo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_medicinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(texto4)
                    .addComponent(imagen4))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", panel_medicina);

        panel_sala_belleza.setBackground(new java.awt.Color(255, 255, 255));

        titulo5.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 24)); // NOI18N
        titulo5.setForeground(new java.awt.Color(0, 0, 0));
        titulo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo5.setText("Sala de Belleza");

        imagen5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Servicios/imagenes/cuidados.png"))); // NOI18N

        texto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Servicios/imagenes/txtcuidados.png"))); // NOI18N

        javax.swing.GroupLayout panel_sala_bellezaLayout = new javax.swing.GroupLayout(panel_sala_belleza);
        panel_sala_belleza.setLayout(panel_sala_bellezaLayout);
        panel_sala_bellezaLayout.setHorizontalGroup(
            panel_sala_bellezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sala_bellezaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panel_sala_bellezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagen5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(texto5)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        panel_sala_bellezaLayout.setVerticalGroup(
            panel_sala_bellezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sala_bellezaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(titulo5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_sala_bellezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(texto5)
                    .addComponent(imagen5))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", panel_sala_belleza);

        panel_servicios.setBackground(new java.awt.Color(255, 255, 255));

        titulo6.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 24)); // NOI18N
        titulo6.setForeground(new java.awt.Color(0, 0, 0));
        titulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo6.setText("Sala de Belleza");

        titulo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Servicios/imagenes/Accesorios.png"))); // NOI18N

        texto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Servicios/imagenes/txtaccesorios.png"))); // NOI18N

        javax.swing.GroupLayout panel_serviciosLayout = new javax.swing.GroupLayout(panel_servicios);
        panel_servicios.setLayout(panel_serviciosLayout);
        panel_serviciosLayout.setHorizontalGroup(
            panel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_serviciosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(texto7)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        panel_serviciosLayout.setVerticalGroup(
            panel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_serviciosLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(titulo6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(texto7)
                    .addComponent(titulo7))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", panel_servicios);

        jPanel4.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 750, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 989, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iconomenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconomenuMouseClicked
        // Se crea una nueva instancia de la clase Principal
        Principal mp = new Principal();
        // Se hace visible el marco utilizando el método setVisible 
        mp.setVisible(true);
        // Se utiliza this.dispose() para cerrar la ventana actual
        this.dispose();

    }//GEN-LAST:event_iconomenuMouseClicked

    private void txtdiagnosticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdiagnosticoMouseClicked
        // Se establece el índice del panel seleccionado en el índice 0
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_txtdiagnosticoMouseClicked
    
    private void txtdiagnosticoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdiagnosticoMouseEntered
        // Establece el color de fondo del panel  en negro
        btn_diagnostico.setBackground(Color.black);
        // Establece el color del texto de la etiqueta en blanco
        txtdiagnostico.setForeground(Color.white);
    }//GEN-LAST:event_txtdiagnosticoMouseEntered

    private void txtdiagnosticoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdiagnosticoMouseExited
        // Establece el color de fondo del panel a su color original
        btn_diagnostico.setBackground(new Color(109, 213, 168));
        // Establece el color del texto de la etiqueta en blanco
        txtdiagnostico.setForeground(Color.white);
    }//GEN-LAST:event_txtdiagnosticoMouseExited

    private void txtatencionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtatencionMouseClicked
         // Se establece el índice del panel seleccionado en el índice 1
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_txtatencionMouseClicked

    private void txtatencionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtatencionMouseEntered
        // Establece el color de fondo del panel  en negro
        btn_atencion.setBackground(Color.black);
        // Establece el color del texto de la etiqueta en blanco
        txtatencion.setForeground(Color.white);
    }//GEN-LAST:event_txtatencionMouseEntered

    private void txtatencionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtatencionMouseExited
        // Establece el color de fondo del panel a su color original
        btn_atencion.setBackground(new Color(109, 213, 168));
        // Establece el color del texto de la etiqueta en blanco
        txtatencion.setForeground(Color.white);
    }//GEN-LAST:event_txtatencionMouseExited

    private void txthospitalizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txthospitalizacionMouseClicked
        // Se establece el índice del panel seleccionado en el índice 2
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_txthospitalizacionMouseClicked

    private void txtmedicinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmedicinaMouseClicked
        // Se establece el índice del panel seleccionado en el índice 3
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_txtmedicinaMouseClicked

    private void txtsaladebellezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsaladebellezaMouseClicked
        // Se establece el índice del panel seleccionado en el índice 4
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_txtsaladebellezaMouseClicked

    private void txtaccesoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaccesoriosMouseClicked
         // Se establece el índice del panel seleccionado en el índice 5
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_txtaccesoriosMouseClicked

    private void txthospitalizacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txthospitalizacionMouseEntered
        // Establece el color de fondo del panel  en negro
        btn_Hospitalizacion.setBackground(Color.black);
        // Establece el color del texto de la etiqueta en blanco
        txthospitalizacion.setForeground(Color.white);
    }//GEN-LAST:event_txthospitalizacionMouseEntered

    private void txthospitalizacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txthospitalizacionMouseExited
        // Establece el color de fondo del panel a su color original
        btn_Hospitalizacion.setBackground(new Color(109, 213, 168));
        // Establece el color del texto de la etiqueta en blanco
        txthospitalizacion.setForeground(Color.white);
    }//GEN-LAST:event_txthospitalizacionMouseExited

    private void txtmedicinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmedicinaMouseEntered
        // Establece el color de fondo del panel  en negro
        btn_medicina.setBackground(Color.black);
        // Establece el color del texto de la etiqueta en blanco
        txtmedicina.setForeground(Color.white);
    }//GEN-LAST:event_txtmedicinaMouseEntered

    private void txtmedicinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmedicinaMouseExited
        // Establece el color de fondo del panel a su color original
        btn_medicina.setBackground(new Color(109, 213, 168));
        // Establece el color del texto de la etiqueta en blanco
        txtmedicina.setForeground(Color.white);
    }//GEN-LAST:event_txtmedicinaMouseExited

    private void txtsaladebellezaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsaladebellezaMouseEntered
        // Establece el color de fondo del panel  en negro
        btn_sala_belleza.setBackground(Color.black);
        // Establece el color del texto de la etiqueta en blanco
        txtsaladebelleza.setForeground(Color.white);
    }//GEN-LAST:event_txtsaladebellezaMouseEntered

    private void txtsaladebellezaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsaladebellezaMouseExited
        // Establece el color de fondo del panel a su color original
        btn_sala_belleza.setBackground(new Color(109, 213, 168));
        // Establece el color del texto de la etiqueta en blanco
        txtsaladebelleza.setForeground(Color.white);
    }//GEN-LAST:event_txtsaladebellezaMouseExited

    private void txtaccesoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaccesoriosMouseEntered
        // Establece el color de fondo del panel  en negro
        btn_accesorios.setBackground(Color.black);
        // Establece el color del texto de la etiqueta en blanco
        txtsaladebelleza.setForeground(Color.white);
    }//GEN-LAST:event_txtaccesoriosMouseEntered

    private void txtaccesoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaccesoriosMouseExited
         // Establece el color de fondo del panel a su color original
        btn_accesorios.setBackground(new Color(109, 213, 168));
        // Establece el color del texto de la etiqueta en blanco
        btn_accesorios.setForeground(Color.white);
    }//GEN-LAST:event_txtaccesoriosMouseExited

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
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraOpciones;
    private javax.swing.JPanel Panel_Diagnostico;
    private javax.swing.JPanel Panel_atencion;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel barra;
    private javax.swing.JPanel btn_Hospitalizacion;
    private javax.swing.JPanel btn_accesorios;
    private javax.swing.JPanel btn_atencion;
    private javax.swing.JPanel btn_diagnostico;
    private javax.swing.JPanel btn_medicina;
    private javax.swing.JPanel btn_sala_belleza;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel iconomenu;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel imagen2;
    private javax.swing.JLabel imagen3;
    private javax.swing.JLabel imagen4;
    private javax.swing.JLabel imagen5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panel_hospitalizacion;
    private javax.swing.JPanel panel_medicina;
    private javax.swing.JPanel panel_sala_belleza;
    private javax.swing.JPanel panel_servicios;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JLabel texto5;
    private javax.swing.JLabel texto7;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo6;
    private javax.swing.JLabel titulo7;
    private javax.swing.JLabel txtaccesorios;
    private javax.swing.JLabel txtatencion;
    private javax.swing.JLabel txtdiagnostico;
    private javax.swing.JLabel txthospitalizacion;
    private javax.swing.JLabel txtmedicina;
    private javax.swing.JLabel txtsaladebelleza;
    // End of variables declaration//GEN-END:variables
}
