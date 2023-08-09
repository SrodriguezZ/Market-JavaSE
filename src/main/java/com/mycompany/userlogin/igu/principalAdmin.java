
package com.mycompany.userlogin.igu;

import com.mycompany.userlogin.logica.control;
import com.mycompany.userlogin.logica.Usuario;
import java.awt.Color;
import java.awt.Dialog;
import java.util.List;
import javax.swing.JOptionPane;

public class principalAdmin extends javax.swing.JFrame {
    control cont = null;
    int xMouse, yMouse;
    public principalAdmin() {
        cont = new control ();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imgbase = new javax.swing.JLabel();
        imguser = new javax.swing.JLabel();
        imglogo = new javax.swing.JLabel();
        InciarSesion = new javax.swing.JLabel();
        panelBarra = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JPanel();
        txtAgregar = new javax.swing.JLabel();
        btnSalir = new javax.swing.JPanel();
        txtSalir = new javax.swing.JLabel();
        btnBaseDatos = new javax.swing.JPanel();
        txtBaseDatos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgbase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgbase.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\informacion.png")); // NOI18N
        jPanel1.add(imgbase, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 270, 210));

        imguser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imguser.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\acceso.png")); // NOI18N
        jPanel1.add(imguser, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 270, 190));

        imglogo.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\city.png")); // NOI18N
        jPanel1.add(imglogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 270, 510));

        InciarSesion.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        InciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        InciarSesion.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\logAdmi.png")); // NOI18N
        InciarSesion.setText("Bienvenido Administrador");
        jPanel1.add(InciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        panelBarra.setBackground(new java.awt.Color(255, 255, 255));
        panelBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelBarraMouseDragged(evt);
            }
        });
        panelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBarraMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));

        txtExit.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtExit.setForeground(new java.awt.Color(0, 0, 0));
        txtExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExit.setText("X");
        txtExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExit, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitLayout.createSequentialGroup()
                .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBarraLayout = new javax.swing.GroupLayout(panelBarra);
        panelBarra.setLayout(panelBarraLayout);
        panelBarraLayout.setHorizontalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 847, Short.MAX_VALUE))
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 50));

        btnAgregar.setBackground(new java.awt.Color(0, 134, 190));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });

        txtAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtAgregar.setForeground(new java.awt.Color(255, 255, 255));
        txtAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAgregar.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\agreUsua.png")); // NOI18N
        txtAgregar.setText("AGREGAR USUARIO");
        txtAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addComponent(txtAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 300, 40));

        btnSalir.setBackground(new java.awt.Color(0, 134, 190));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        txtSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtSalir.setForeground(new java.awt.Color(255, 255, 255));
        txtSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSalir.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\salirPrincipal.png")); // NOI18N
        txtSalir.setText("SALIR");

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 300, -1));

        btnBaseDatos.setBackground(new java.awt.Color(0, 134, 190));
        btnBaseDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBaseDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBaseDatosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBaseDatosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBaseDatosMouseExited(evt);
            }
        });

        txtBaseDatos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtBaseDatos.setForeground(new java.awt.Color(255, 255, 255));
        txtBaseDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBaseDatos.setIcon(new javax.swing.ImageIcon("D:\\CARPETAS D\\Steeven Rodriguez\\Programacion\\Java Tocode\\UserLogin\\src\\main\\java\\imagenes\\verUsuario.png")); // NOI18N
        txtBaseDatos.setText("BASE DE DATOS");

        javax.swing.GroupLayout btnBaseDatosLayout = new javax.swing.GroupLayout(btnBaseDatos);
        btnBaseDatos.setLayout(btnBaseDatosLayout);
        btnBaseDatosLayout.setHorizontalGroup(
            btnBaseDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtBaseDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        btnBaseDatosLayout.setVerticalGroup(
            btnBaseDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtBaseDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnBaseDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 300, -1));

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

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
        loginuser login = new loginuser();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new Color(0,156,223));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked

    }//GEN-LAST:event_btnAgregarMouseClicked

    private void txtAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgregarMouseClicked
        adminAgreg agreg = new adminAgreg();
        agreg.setVisible(true);
        agreg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_txtAgregarMouseClicked

    private void panelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelBarraMousePressed

    private void panelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_panelBarraMouseDragged

    private void txtExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseExited
        btnExit.setBackground(Color.white);
        txtExit.setForeground(Color.black);
    }//GEN-LAST:event_txtExitMouseExited

    private void txtExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseEntered
        btnExit.setBackground(Color.red);
        txtExit.setForeground(Color.white);
    }//GEN-LAST:event_txtExitMouseEntered

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtExitMouseClicked

    private void btnBaseDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBaseDatosMouseClicked
        this.dispose();
        verUsuario ver = new verUsuario();
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBaseDatosMouseClicked

    private void btnBaseDatosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBaseDatosMouseEntered
        btnBaseDatos.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnBaseDatosMouseEntered

    private void btnBaseDatosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBaseDatosMouseExited
        btnBaseDatos.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnBaseDatosMouseExited

    
    public void mostrarMensaje(String mensaje,String tipo,String titulo){
        JOptionPane panel = new JOptionPane(mensaje);
        if(tipo.equals("Info")){
            panel.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if (tipo.equals("Error")){
            panel.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        Dialog dialogo = panel.createDialog(titulo);
        dialogo.setVisible(true);
        dialogo.setLocationRelativeTo(null);
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InciarSesion;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnBaseDatos;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JLabel imgbase;
    private javax.swing.JLabel imglogo;
    private javax.swing.JLabel imguser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JLabel txtAgregar;
    private javax.swing.JLabel txtBaseDatos;
    private javax.swing.JLabel txtExit;
    private javax.swing.JLabel txtSalir;
    // End of variables declaration//GEN-END:variables
}