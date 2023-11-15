package Interfaz_Acceso_Autorizado;//ubicacion de frame

// librerias necesarias
import Conexion.ConexionMysql;
import com.mysql.cj.jdbc.ConnectionImpl;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Citas_vet extends javax.swing.JFrame {

    /*Se crea una instancia de la clase ConexionMysql 
    para establecer una conexión a la base de datos*/
    ConexionMysql con = new ConexionMysql();
    ConnectionImpl cn = con.conectar();
    
    /* Se declaran variables para trabajar con una tabla de datos, 
    un objeto de sentencia SQL y un objeto de resultado*/
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    
    // Se declara una variable para ordenar y filtrar los datos en una tabla
    TableRowSorter trs;
    
    // Se declara una variable para almacenar el ID de la cita seleccionada
    int idc;

    public Citas_vet() {
        //Inicializa los componentes de la interfaz gráfica
        initComponents();
        // Establecer el icono de la ventana 
        //en la imagen devuelta por getIconImage
        setIconImage(getIconImage());
        //Establece la ubicación de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        consultar();//llamar datos a la tabla
    }
    //cambia la imagen del icono
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage
        (ClassLoader.getSystemResource("imagenes/LogoPrograma.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        espacio_datos = new javax.swing.JPanel();
        Nombre_Dueño = new javax.swing.JLabel();
        Identificacion = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        nombre_mascota = new javax.swing.JLabel();
        tipo_mascota = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        peso = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        motivo_consulta = new javax.swing.JLabel();
        tipo_consulta = new javax.swing.JLabel();
        Caja_nombreDueño = new javax.swing.JTextField();
        caja_identificacion = new javax.swing.JTextField();
        caja_telefono = new javax.swing.JTextField();
        caja_nombre_mascota = new javax.swing.JTextField();
        caja_tipo_mascota = new javax.swing.JTextField();
        caja_sexo = new javax.swing.JTextField();
        caja_peso = new javax.swing.JTextField();
        caja_edad = new javax.swing.JTextField();
        caja_motivo_consulta = new javax.swing.JTextField();
        caja_tipo_consulta = new javax.swing.JTextField();
        Caja_id = new javax.swing.JTextField();
        Id = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacitas = new javax.swing.JTable();
        btn_agregar = new javax.swing.JPanel();
        agregar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JPanel();
        eliminar = new javax.swing.JLabel();
        btn_nuevo = new javax.swing.JPanel();
        Nuevo = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JPanel();
        modificar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agendar Citas");
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        barra.setBackground(new java.awt.Color(104, 207, 163));

        titulo.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Agendar Cita");

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Acceso_Autorizado/imagenes/Diseño sin título3.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Volver");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(icono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1045, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icono, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(barraLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        espacio_datos.setBackground(new java.awt.Color(104, 207, 163));

        Nombre_Dueño.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Nombre_Dueño.setForeground(new java.awt.Color(255, 255, 255));
        Nombre_Dueño.setText("Nombre del Dueño:");

        Identificacion.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Identificacion.setForeground(new java.awt.Color(255, 255, 255));
        Identificacion.setText("Indentificacion:");

        telefono.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        telefono.setForeground(new java.awt.Color(255, 255, 255));
        telefono.setText("Telefono");

        nombre_mascota.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        nombre_mascota.setForeground(new java.awt.Color(255, 255, 255));
        nombre_mascota.setText("Nombre de la mascota:");

        tipo_mascota.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        tipo_mascota.setForeground(new java.awt.Color(255, 255, 255));
        tipo_mascota.setText("Tipo de  la mascota:");

        sexo.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        sexo.setForeground(new java.awt.Color(255, 255, 255));
        sexo.setText("Sexo");

        peso.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        peso.setForeground(new java.awt.Color(255, 255, 255));
        peso.setText("Peso");

        edad.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        edad.setForeground(new java.awt.Color(255, 255, 255));
        edad.setText("Edad");

        motivo_consulta.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        motivo_consulta.setForeground(new java.awt.Color(255, 255, 255));
        motivo_consulta.setText("Motivo de consulta");

        tipo_consulta.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        tipo_consulta.setForeground(new java.awt.Color(255, 255, 255));
        tipo_consulta.setText("Tipo de consulta");

        Caja_nombreDueño.setBackground(new java.awt.Color(255, 255, 255));
        Caja_nombreDueño.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N

        caja_identificacion.setBackground(new java.awt.Color(255, 255, 255));
        caja_identificacion.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N

        caja_telefono.setBackground(new java.awt.Color(255, 255, 255));
        caja_telefono.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N

        caja_nombre_mascota.setBackground(new java.awt.Color(255, 255, 255));
        caja_nombre_mascota.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N

        caja_tipo_mascota.setBackground(new java.awt.Color(255, 255, 255));
        caja_tipo_mascota.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N

        caja_sexo.setBackground(new java.awt.Color(255, 255, 255));
        caja_sexo.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N

        caja_peso.setBackground(new java.awt.Color(255, 255, 255));
        caja_peso.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N

        caja_edad.setBackground(new java.awt.Color(255, 255, 255));
        caja_edad.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N

        caja_motivo_consulta.setBackground(new java.awt.Color(255, 255, 255));
        caja_motivo_consulta.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N

        caja_tipo_consulta.setBackground(new java.awt.Color(255, 255, 255));
        caja_tipo_consulta.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N

        Caja_id.setBackground(new java.awt.Color(255, 255, 255));
        Caja_id.setEnabled(false);

        Id.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        Id.setForeground(new java.awt.Color(255, 255, 255));
        Id.setText("ID");

        javax.swing.GroupLayout espacio_datosLayout = new javax.swing.GroupLayout(espacio_datos);
        espacio_datos.setLayout(espacio_datosLayout);
        espacio_datosLayout.setHorizontalGroup(
            espacio_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(espacio_datosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(espacio_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(espacio_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(espacio_datosLayout.createSequentialGroup()
                            .addGroup(espacio_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(caja_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(espacio_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(caja_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(tipo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tipo_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(motivo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(espacio_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(caja_edad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(caja_tipo_consulta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caja_motivo_consulta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caja_tipo_mascota, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caja_nombre_mascota, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(nombre_mascota))
                    .addGroup(espacio_datosLayout.createSequentialGroup()
                        .addGroup(espacio_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(espacio_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(caja_identificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(Identificacion)
                                .addComponent(Caja_id, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(Id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(espacio_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono)
                            .addComponent(caja_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Caja_nombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre_Dueño, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        espacio_datosLayout.setVerticalGroup(
            espacio_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(espacio_datosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(espacio_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_Dueño)
                    .addComponent(Id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(espacio_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Caja_nombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Caja_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(espacio_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono)
                    .addComponent(Identificacion))
                .addGap(5, 5, 5)
                .addGroup(espacio_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caja_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caja_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(nombre_mascota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caja_nombre_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipo_mascota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caja_tipo_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(espacio_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexo)
                    .addComponent(peso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(espacio_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caja_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caja_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caja_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(motivo_consulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caja_motivo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipo_consulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caja_tipo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tablacitas.setBackground(new java.awt.Color(255, 255, 255));
        tablacitas.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tablacitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Dueño", "Documento", "Telefono", "Mascota", "Tipo ", "Sexo", "Peso", "Edad", "Motivo ", "Tipo de Consulta"
            }
        ));
        tablacitas.setShowGrid(true);
        tablacitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablacitasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablacitas);

        btn_agregar.setBackground(new java.awt.Color(104, 207, 163));

        agregar.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregar.setText("Agregar");
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_agregarLayout = new javax.swing.GroupLayout(btn_agregar);
        btn_agregar.setLayout(btn_agregarLayout);
        btn_agregarLayout.setHorizontalGroup(
            btn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btn_agregarLayout.setVerticalGroup(
            btn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel4.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Citas Registradas");

        btn_eliminar.setBackground(new java.awt.Color(104, 207, 163));

        eliminar.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 14)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminar.setText("Eliminar");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_eliminarLayout = new javax.swing.GroupLayout(btn_eliminar);
        btn_eliminar.setLayout(btn_eliminarLayout);
        btn_eliminarLayout.setHorizontalGroup(
            btn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        btn_eliminarLayout.setVerticalGroup(
            btn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        btn_nuevo.setBackground(new java.awt.Color(104, 207, 163));

        Nuevo.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 14)); // NOI18N
        Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        Nuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nuevo.setText("Nuevo");
        Nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_nuevoLayout = new javax.swing.GroupLayout(btn_nuevo);
        btn_nuevo.setLayout(btn_nuevoLayout);
        btn_nuevoLayout.setHorizontalGroup(
            btn_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btn_nuevoLayout.setVerticalGroup(
            btn_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btn_modificar.setBackground(new java.awt.Color(104, 207, 163));

        modificar.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 14)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificar.setText("Modificar");
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_modificarLayout = new javax.swing.GroupLayout(btn_modificar);
        btn_modificar.setLayout(btn_modificarLayout);
        btn_modificarLayout.setHorizontalGroup(
            btn_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        btn_modificarLayout.setVerticalGroup(
            btn_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(espacio_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117))))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(espacio_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_nuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // Crea una instancia de la clase CargandoSer
        //y la asigna a la variable frame.
        Menu_Opciones frame = new Menu_Opciones();
        // Establece la visibilidad de frame en true,
        //lo que significa que el objeto se muestra en la pantalla.
        frame.setVisible(true);
        // Llama al método dispose() en el objeto actual para liberar
        //los recursos del sistema asociados con él y cerrar la ventana.
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseClicked
        Agregar(); //Metodo de agregar
        consultar();//llamar los datos
        Nuevo(); //limpiar los campos para nuevos datos
    }//GEN-LAST:event_agregarMouseClicked

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
        Eliminar();// elimina datos seleccionados
        consultar();//llamar los datos
        Nuevo();//limpiar los campos para nuevos datos
    }//GEN-LAST:event_eliminarMouseClicked

    private void modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseClicked
        Modificar();// al seleccionar modifica los datos
        consultar();//llama los datos de la tabla
        Nuevo();//limpiar los campos para nuevos datos
    }//GEN-LAST:event_modificarMouseClicked

    private void NuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoMouseClicked
        Nuevo();//limpiar los campos para nuevos datos
    }//GEN-LAST:event_NuevoMouseClicked

    private void tablacitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacitasMouseClicked
        // tomar la ubicacion de los datos
        int fila = tablacitas.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null,
                    "No se selecciono fila");
        } else {
            idc = Integer.parseInt((String) tablacitas.getValueAt(fila,
                    0).toString());
            String dueño = (String) tablacitas.getValueAt(fila,
                    1);
            String identificacion = (String) tablacitas.getValueAt(fila,
                    2);
            String telefono = (String) tablacitas.getValueAt(fila,
                    3);
            String mascota = (String) tablacitas.getValueAt(fila,
                    4);
            String tipomascota = (String) tablacitas.getValueAt(fila,
                    5);
            String sexo = (String) tablacitas.getValueAt(fila,
                    6);
            String peso = (String) tablacitas.getValueAt(fila,
                    7);
            String edad = (String) tablacitas.getValueAt(fila,
                    8);
            String motivoconsulta = (String) tablacitas.getValueAt(fila,
                    9);
            String tipoconsulta = (String) tablacitas.getValueAt(fila,
                    
                    10);
            
            
            //actualiza el comtenido del componente
            Caja_id.setText(""+idc);
            Caja_nombreDueño.setText(dueño);
            caja_identificacion.setText(identificacion);
            caja_telefono.setText(telefono);
            caja_nombre_mascota.setText(mascota);
            caja_tipo_mascota.setText(tipomascota);
            caja_sexo.setText(sexo);
            caja_peso.setText(peso);
            caja_edad.setText(edad);
            caja_motivo_consulta.setText(motivoconsulta);
            caja_tipo_consulta.setText(tipoconsulta);
            
        }
    }//GEN-LAST:event_tablacitasMouseClicked

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
            java.util.logging.Logger.getLogger(Citas_vet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Citas_vet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Citas_vet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Citas_vet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Citas_vet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Caja_id;
    private javax.swing.JTextField Caja_nombreDueño;
    private javax.swing.JLabel Id;
    private javax.swing.JLabel Identificacion;
    private javax.swing.JLabel Nombre_Dueño;
    private javax.swing.JLabel Nuevo;
    private javax.swing.JLabel agregar;
    private javax.swing.JPanel barra;
    private javax.swing.JPanel btn_agregar;
    private javax.swing.JPanel btn_eliminar;
    private javax.swing.JPanel btn_modificar;
    private javax.swing.JPanel btn_nuevo;
    private javax.swing.JTextField caja_edad;
    private javax.swing.JTextField caja_identificacion;
    private javax.swing.JTextField caja_motivo_consulta;
    private javax.swing.JTextField caja_nombre_mascota;
    private javax.swing.JTextField caja_peso;
    private javax.swing.JTextField caja_sexo;
    private javax.swing.JTextField caja_telefono;
    private javax.swing.JTextField caja_tipo_consulta;
    private javax.swing.JTextField caja_tipo_mascota;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel eliminar;
    private javax.swing.JPanel espacio_datos;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel modificar;
    private javax.swing.JLabel motivo_consulta;
    private javax.swing.JLabel nombre_mascota;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel peso;
    private javax.swing.JLabel sexo;
    private javax.swing.JTable tablacitas;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel tipo_consulta;
    private javax.swing.JLabel tipo_mascota;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void consultar() {
        //verifica el modelo de la tabla
        if (modelo != null) {
            modelo.getDataVector().clear();
        }
        // consulta a la base de datos
        String sql = "SELECT * FROM proyectodeaulads3.agendarcita";
        try {
            //ejecucion de consulta y recopilacion de datos
            st = (Statement) cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] Citas_Registrados = new Object[11];
            modelo = (DefaultTableModel) tablacitas.getModel();
            while (rs.next()) {
                // Se obtienen los datos de la fila actual y se almacenan en el array
                // Luego, se agrega la fila al modelo de la tabla
                Citas_Registrados[0] = rs.getString("id");
                Citas_Registrados[1] = rs.getString("dueno");
                Citas_Registrados[2] = rs.getString("identificacion");
                Citas_Registrados[3] = rs.getString("telefono");
                Citas_Registrados[4] = rs.getString("mascota");
                Citas_Registrados[5] = rs.getString("tipomascota");
                Citas_Registrados[6] = rs.getString("sexo");
                Citas_Registrados[7] = rs.getString("peso");
                Citas_Registrados[8] = rs.getString("edad");
                Citas_Registrados[9] = rs.getString("motivoconsulta");
                Citas_Registrados[10] = rs.getString("tipoconsulta");
                modelo.addRow(Citas_Registrados);
            }
            //Actualización de la Tabla y Manejo de Excepciones:
            System.out.println("Numero columnas: " + modelo.getRowCount());
            tablacitas.setModel(modelo);
           //Manejo de Excepciones: 
        } catch (Exception e) {
            System.out.println("Exception: ");
            System.out.println(e.getLocalizedMessage());
            System.out.println("Class: ");
            System.out.println(e.getClass());
        }

    }

    private void Agregar() {
        //Obtención de Datos desde Campos de Texto
        String dueño = Caja_nombreDueño.getText();
        String identificacion = caja_identificacion.getText();
        String telefono = caja_telefono.getText();
        String mascota = caja_nombre_mascota.getText();
        String tipomascota = caja_tipo_mascota.getText();
        String sexo = caja_sexo.getText();
        String peso = caja_peso.getText();
        String edad = caja_edad.getText();
        String motivoconsulta = caja_motivo_consulta.getText();
        String tipoconsulta = caja_tipo_consulta.getText();
        try {
            //Validación de Campos Vacíos
            if (dueño.isEmpty() || identificacion.isEmpty()
                    || telefono.isEmpty() || mascota.isEmpty()
                    || tipomascota.isEmpty() || sexo.isEmpty()
                    || peso.isEmpty() || edad.isEmpty()
                    || motivoconsulta.isEmpty() || tipoconsulta.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Los campos estas vacios");
            } else {
                    // procede a la inserción en la base de datos
                String sql = "insert into proyectodeaulads3.agendarcita(dueno,"
                        + "identificacion,telefono,mascota,tipomascota,"
                        + "sexo,peso,edad,motivoconsulta,"
                        + "tipoconsulta)values ('" + dueño + "',"
                        + "'" + identificacion + "','" + telefono + "','" + mascota + "',"
                        + "'" + tipomascota + "','" + sexo + "','" + peso + "','" + edad + "',"
                        + "'" + motivoconsulta + "','" + tipoconsulta + "')";
                st = (Statement) cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,
                        "Cita Registrada");

            }
        } catch (Exception e) {
            limpiarTabla();//limpia los datos
        }
    }

    void Nuevo() {
        //coloca el foco en el campo id
        Caja_id.requestFocus();
        //limpiar los campos de texto
        Caja_nombreDueño.setText("");
        caja_identificacion.setText("");
        caja_telefono.setText("");
        caja_nombre_mascota.setText("");
        caja_tipo_mascota.setText("");
        caja_sexo.setText("");
        caja_peso.setText("");
        caja_edad.setText("");
        caja_motivo_consulta.setText("");
        caja_tipo_consulta.setText("");
    }

    void limpiarTabla() {
        //bucle para eliminar filas
        for (int i = 0; i <= tablacitas.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    void Eliminar() {
        //obtencion de la fila seleccionada
        int fila = tablacitas.getSelectedRow();
        try {
            //validacion de la seleccion de fila
            if (fila < 0) {
                JOptionPane.showMessageDialog(null,
                        "Cliente no Seleccionado");
                limpiarTabla();
            } else {
                //procede a la eliminacion
                String sql
                // eliminacion del cliente
                        = "delete from proyectodeaulads3.agendarcita where id =" + idc;
                st = (Statement) cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,
                        "Cliente Eliminado");
                limpiarTabla();
            }
           // manejo de excepciones
        } catch (Exception e) {
        }
    }

    void Modificar() {
        //obtencion de datos desde campos de texto
        String dueño = Caja_nombreDueño.getText();
        String identificacion = caja_identificacion.getText();
        String telefono = caja_telefono.getText();
        String mascota = caja_nombre_mascota.getText();
        String tipomascota = caja_tipo_mascota.getText();
        String sexo = caja_sexo.getText();
        String peso = caja_peso.getText();
        String edad = caja_edad.getText();
        String motivoconsulta = caja_motivo_consulta.getText();
        String tipoconsulta = caja_tipo_consulta.getText();
        try {
            //validacion de campos vacios
            if (dueño.isEmpty() || identificacion.isEmpty()
                    || telefono.isEmpty() || mascota.isEmpty()
                    || tipomascota.isEmpty() || sexo.isEmpty()
                    || peso.isEmpty() || edad.isEmpty()
                    || motivoconsulta.isEmpty() || tipoconsulta.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Los campos estas vacios");
            } else {
                //Actualización en la Base de Datos
                String sql = "UPDATE proyectodeaulads3.agendarcita SET "
                        + " id='" + idc + "',"
                        + "dueno='" + dueño + "',"
                        + " identificacion='" + identificacion + "',"
                        + " telefono='" + telefono + "',"
                        + " mascota='" + mascota + "',"
                        + " tipomascota='" + tipomascota + "',"
                        + " sexo='" + sexo + "',"
                        + " peso='" + peso + "',"
                        + " edad='" + edad + "',"
                        + " motivoconsulta='" + motivoconsulta + "',"
                        + " tipoconsulta='" + tipoconsulta + "' where id='" + idc + "'";
                st = (Statement) cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,
                        "Cita Registrada");

            }//manejo de excepciones
        } catch (Exception e) {
            limpiarTabla();//limpia la tabla 
        }
    }

}
