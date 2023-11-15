package Modulo_Menu;
// Se define el paquete al que pertenece la clase

// Definición de la clase modulo_Inicio
public class modulo_Inicio extends javax.swing.JPanel {

    //constructor de la clase
    public modulo_Inicio() {
        // Se llama al método 'initComponents()'
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Barra = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Imagen = new javax.swing.JLabel();
        Texto3 = new javax.swing.JLabel();
        Texto1 = new javax.swing.JLabel();
        Texto2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Barra.setBackground(new java.awt.Color(104, 207, 163));

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Titulo.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(104, 207, 163));
        Titulo.setText("Menu Principal");
        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        Imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Modulo_Menu/imagenes/Diseño sin título22.png"))); // NOI18N
        add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 450, -1));

        Texto3.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        Texto3.setForeground(new java.awt.Color(104, 207, 163));
        Texto3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto3.setText("* Revisa las citas de tus Mascotas");
        add(Texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 400, -1));

        Texto1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        Texto1.setForeground(new java.awt.Color(104, 207, 163));
        Texto1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto1.setText("* Registra a tus mascotas ");
        add(Texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 310, -1));

        Texto2.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        Texto2.setForeground(new java.awt.Color(104, 207, 163));
        Texto2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto2.setText("* Verificalas en nuestra base de datos ");
        add(Texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 430, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel Texto1;
    private javax.swing.JLabel Texto2;
    private javax.swing.JLabel Texto3;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
