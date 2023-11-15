package Interfaz_Principal;//Ubicaoion del Jframe

import java.awt.Image;
/*proporciona una clase para representar imágenes.*/
import java.awt.Toolkit;
/*proporciona una clase para obtener información 
sobre el entorno de la aplicación, 
como el tamaño de la pantalla y el cursor actual.*/
import java.awt.event.*;
/* proporciona una serie de clases 
y interfaces para manejar eventos, como "ActionEvent" y "ActionListener".*/
import javax.swing.Timer;
/* proporciona una clase para crear temporizadores
que generan eventos a intervalos regulares.*/

public class Cargando extends javax.swing.JFrame {

    //Variable booleana para verificar si JFrame2 ya ha sido abierto
    private boolean isCargandoOpened = false;

    // Método para cambiar a JFrame Inicio
    private void switchToJFrame() {
        // Verifica si JFrame2 ya ha sido abierto
        if (!isCargandoOpened) {
            // Llamar al método switchToJFrame
            initTrys();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Principal().setVisible(true);
                }
            });
            // Cambiar a Inicio
            setVisible(false);
            // Establecer la variable isCargandoOpened en true
            isCargandoOpened = true;
        }
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
    
    // Constructor de Cargando
    public Cargando() {
       //Inicializa los componentes de la interfaz gráfica
        initComponents();
        
        // Establecer el icono de la ventana 
        //en la imagen devuelta por getIconImage
        setIconImage(getIconImage());
        
        //Establece la ubicación de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
        //desactiva la capacidad de redimensionar el Jframe
        //this.setResizable(false);

        //switchToJFrame();

        // Crear un objeto Timer con un retraso de 5 segundos
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Llamar al método switchToJFrame
                switchToJFrame();
            }
        });

        // Iniciar el temporizador
        timer.start();
    }
    //Establece un icono personalizado para la aplicación.
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage
        (ClassLoader.getSystemResource("IMAGENES/LogoPrograma.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelVista = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VETERINARY CLINIC");
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelVista.setBackground(new java.awt.Color(255, 255, 254));
        PanelVista.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz_Principal/Imagenes/Diseño sin título.gif"))); // NOI18N

        javax.swing.GroupLayout PanelVistaLayout = new javax.swing.GroupLayout(PanelVista);
        PanelVista.setLayout(PanelVistaLayout);
        PanelVistaLayout.setHorizontalGroup(
            PanelVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PanelVistaLayout.setVerticalGroup(
            PanelVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(PanelVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cargando().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelVista;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
