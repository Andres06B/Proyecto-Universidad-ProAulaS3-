/* Este paquete contiene clases e interfaces relacionadas
con la interfaz de acceso autorizado*/
package Interfaz_Acceso_Autorizado;


import Conexion.ConexionMysql;
import com.mysql.cj.jdbc.ConnectionImpl;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/* Esta clase representa la ventana para buscar citas en la 
interfaz de acceso autorizado*/
public class Buscar_Cita extends javax.swing.JFrame {
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

    public Buscar_Cita() {
        //Inicializa los componentes de la interfaz gráfica
        initComponents();
        /* Establecer el icono de la ventana en la imagen devuelta 
        por getIconImage*/
        setIconImage(getIconImage());
        //Establece la ubicación de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        // Crear un objeto Timer con un retraso de 5 segundos
        consultar();
        //llama los datos de la tabla
    }
    // Método para obtener la imagen del icono 
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage
        (ClassLoader.getSystemResource("imagenes/LogoPrograma.png"));
        return retValue;//devuelve el valor
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Buscar_cita = new javax.swing.JLabel();
        campo_documento = new javax.swing.JTextField();
        Tabla = new javax.swing.JScrollPane();
        tablascitas = new javax.swing.JTable();
        btn_buscar = new javax.swing.JPanel();
        Buscar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        barra.setBackground(new java.awt.Color(104, 207, 163));

        titulo.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Empleados Veterinaria");

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
                .addComponent(icono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 892, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Buscar_cita.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 18)); // NOI18N
        Buscar_cita.setForeground(new java.awt.Color(0, 0, 0));
        Buscar_cita.setText("Buscar Citas");

        campo_documento.setBackground(new java.awt.Color(255, 255, 255));
        campo_documento.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        campo_documento.setForeground(new java.awt.Color(0, 0, 0));

        tablascitas.setBackground(new java.awt.Color(255, 255, 255));
        tablascitas.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        tablascitas.setForeground(new java.awt.Color(0, 0, 0));
        tablascitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dueño", "Identificacion", "Telefono", "Nombre Mascota", "Tipo mascota", "Sexo", "Peso", "Edad", "Motivo Consulta", "Tipo Consulta"
            }
        ));
        tablascitas.setShowGrid(true);
        Tabla.setViewportView(tablascitas);

        btn_buscar.setBackground(new java.awt.Color(104, 207, 163));

        Buscar.setFont(new java.awt.Font("Roboto Slab ExtraBold", 0, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Buscar.setText("Buscar");
        Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_buscarLayout = new javax.swing.GroupLayout(btn_buscar);
        btn_buscar.setLayout(btn_buscarLayout);
        btn_buscarLayout.setHorizontalGroup(
            btn_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btn_buscarLayout.setVerticalGroup(
            btn_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Buscar_cita)
                        .addGap(6, 6, 6)
                        .addComponent(campo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 1261, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Buscar_cita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campo_documento)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

       // Se crea una instancia de la clase Menu_Opciones
       Menu_Opciones frame = new Menu_Opciones();
        // Se establece el marco como visible, mostrándolo en la interfaz gráfica
        frame.setVisible(true);
        /* Se llama al método dispose() en el objeto actual para liberar
        recursos y cerrar la ventana actual*/
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
    /* Se obtiene el valor del campo de texto correspondiente a la cédula y 
        se elimina cualquier espacio en blanco al principio o al final*/
    String cedula = campo_documento.getText().trim(); 
    /* Se crea un objeto TableRowSorter para ordenar y
    filtrar los datos en la tabla*/
    TableRowSorter<DefaultTableModel> rowSorter 
            = new TableRowSorter<>(modelo);
    /* Se establece el TableRowSorter como el ordenador
    y filtro de filas de la tabla*/
    tablascitas.setRowSorter(rowSorter);

    // Si el campo de texto está vacío, se elimina cualquier filtro y 
    //se muestran todas las filas
    if (cedula.isEmpty()) {
    rowSorter.setRowFilter(null);
    } else {
    // Si hay un valor en el campo de texto, se crea un filtro para 
    //mostrar solo las filas que contengan ese valor
    ArrayList<RowFilter<Object, Object>> filters = new ArrayList<>();
    filters.add(RowFilter.regexFilter(cedula, 1)); 

    // Se crea un filtro OR que combina todos los filtros en la lista
    RowFilter<Object, Object> orFilter = RowFilter.orFilter(filters);

    // Se establece el filtro OR como el filtro de filas del TableRowSorter
    rowSorter.setRowFilter(orFilter);
   }

    }//GEN-LAST:event_BuscarMouseClicked

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
            java.util.logging.Logger.getLogger(Buscar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar_Cita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscar;
    private javax.swing.JLabel Buscar_cita;
    private javax.swing.JScrollPane Tabla;
    private javax.swing.JPanel barra;
    private javax.swing.JPanel btn_buscar;
    private javax.swing.JTextField campo_documento;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable tablascitas;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    // Método para consultar y mostrar datos en la tabla
private void consultar() {
    // Verifica si el modelo de la tabla no es nulo y, en caso afirmativo,
    //limpia los datos existentes
    if (modelo != null) {
        modelo.getDataVector().clear();
    }
    
    // Consulta SQL para seleccionar todos los 
    //registros de la tabla "agendarcita"
    String sql = "SELECT * FROM proyectodeaulads3.agendarcita";
    
    try {
        // Se crea un objeto Statement para ejecutar la consulta SQL
        st = (Statement) cn.createStatement();
        
        // Se ejecuta la consulta y se obtiene un objeto 
        //ResultSet con los resultados
        rs = st.executeQuery(sql);
        
        // Se crea un arreglo para almacenar los datos de cada fila
        Object[] BuscarCitas = new Object[10];
        
        // Se obtiene el modelo de la tabla y se asigna a la variable "modelo"
        modelo = (DefaultTableModel) tablascitas.getModel();
        
        // Se recorre el ResultSet para obtener los datos de cada fila y
        //agregarlos al modelo de la tabla
        while (rs.next()) {
            BuscarCitas[0] = rs.getString("Dueno");
            BuscarCitas[1] = rs.getString("identificacion");
            BuscarCitas[2] = rs.getString("telefono");
            BuscarCitas[3] = rs.getString("mascota");
            BuscarCitas[4] = rs.getString("tipomascota");
            BuscarCitas[5] = rs.getString("sexo");
            BuscarCitas[6] = rs.getString("peso");
            BuscarCitas[7] = rs.getString("edad");
            BuscarCitas[8] = rs.getString("motivoconsulta");
            BuscarCitas[9] = rs.getString("tipoconsulta");
            
            // Se agrega la fila al modelo de la tabla
            modelo.addRow(BuscarCitas);
        }
        
        // Se imprime el número de columnas en el modelo de la tabla
        System.out.println("Numero columnas: " + modelo.getRowCount());
        
        // Se establece el modelo de la tabla en la tabla
        tablascitas.setModel(modelo);
    } catch (Exception e) {
        // En caso de excepción, se imprime información sobre la excepción
        System.out.println("Exception: ");
        System.out.println(e.getLocalizedMessage());
        System.out.println("Class: ");
        System.out.println(e.getClass());
    }
}

}
