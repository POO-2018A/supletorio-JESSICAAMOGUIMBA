/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ESFOT
 */
public class ClsPrincipal extends javax.swing.JFrame {
    ArrayList <Object> listaProductos = new ArrayList<>();
    ClsController control = new ClsController();
   
    
    

    
    public ClsPrincipal() {
        initComponents();
        this.setTitle("**********EXAMEN SUPLETORIO - PRODUCTOS************");
        listaProductos = control.extraerObjetos("listaProductos.dat");
    }

    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbProductosSelecc = new javax.swing.JComboBox<>();
        lblCOMPUTADOR = new javax.swing.JLabel();
        lblACCESORIO = new javax.swing.JLabel();
        lblCOMPONENTE = new javax.swing.JLabel();
        txtTipoComp = new javax.swing.JTextField();
        lblTipoComputador = new javax.swing.JLabel();
        lvlCapacidadComputador = new javax.swing.JLabel();
        txtCapacidadComp = new javax.swing.JTextField();
        lblRAM = new javax.swing.JLabel();
        txtRamComp = new javax.swing.JTextField();
        lblProcesadorComputador = new javax.swing.JLabel();
        txtProcesadorComp = new javax.swing.JTextField();
        lblTipoAccesorio = new javax.swing.JLabel();
        txtTipoAccesorio = new javax.swing.JTextField();
        lblColorAccesorio = new javax.swing.JLabel();
        txtColorAccesorio = new javax.swing.JTextField();
        lblTipoComponente = new javax.swing.JLabel();
        txtTipoComponente = new javax.swing.JTextField();
        lblCapacidadComponente = new javax.swing.JLabel();
        txtCapacidadComponente = new javax.swing.JTextField();
        lblVelocidadComponente = new javax.swing.JLabel();
        txtVelocidadComponente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tienda de Productos ");

        jLabel2.setText("Seleccione Producto:");

        cmbProductosSelecc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computador", "Accesorio", "Componente" }));
        cmbProductosSelecc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductosSeleccActionPerformed(evt);
            }
        });

        lblCOMPUTADOR.setText("COMPUTADOR:");

        lblACCESORIO.setText("ACCESORIO:");

        lblCOMPONENTE.setText("COMPONENTE:");

        lblTipoComputador.setText("Tipo");

        lvlCapacidadComputador.setText("Capacidad");

        lblRAM.setText("RAM");

        lblProcesadorComputador.setText("Procesador");

        lblTipoAccesorio.setText("Tipo");

        lblColorAccesorio.setText("Color");

        lblTipoComponente.setText("Tipo");

        lblCapacidadComponente.setText("Capacidad");

        lblVelocidadComponente.setText("Velocidad");

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "PRECIO", "MARCA", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblResultados);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        lblPrecio.setText("Precio");

        lblMarca.setText("Marca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCOMPONENTE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblVelocidadComponente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtVelocidadComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCapacidadComponente)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCapacidadComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTipoComponente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTipoComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblProcesadorComputador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtProcesadorComp, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRAM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRamComp, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lvlCapacidadComputador)
                                .addGap(18, 18, 18)
                                .addComponent(txtCapacidadComp, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipoComputador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTipoComp, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lblCOMPUTADOR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTipoAccesorio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTipoAccesorio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblACCESORIO)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblColorAccesorio)
                                        .addGap(95, 95, 95)
                                        .addComponent(txtColorAccesorio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(142, 142, 142)))
                        .addGap(259, 259, 259))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(285, 285, 285))))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMarca)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPrecio)
                            .addGap(18, 18, 18)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cmbProductosSelecc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbProductosSelecc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarca))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCOMPUTADOR)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoComputador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCapacidadComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lvlCapacidadComputador)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblACCESORIO)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTipoAccesorio)
                            .addComponent(txtTipoAccesorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColorAccesorio)
                            .addComponent(txtColorAccesorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRamComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRAM))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcesadorComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProcesadorComputador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCOMPONENTE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(16, 16, 16)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoComponente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCapacidadComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCapacidadComponente))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVelocidadComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVelocidadComponente)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbProductosSeleccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductosSeleccActionPerformed
        String Productos = cmbProductosSelecc.getSelectedItem().toString();
        System.out.println("Registra");
        
        
        if (Productos.equals("Computador")) {
            
            txtTipoAccesorio.setEnabled(false);
            txtColorAccesorio.setEnabled(false);
            txtTipoComponente.setEnabled(false);
            txtCapacidadComponente.setEnabled(false);
            txtVelocidadComponente.setEnabled(false);
        
        }else if(Productos.equals("Accesorio")){
            
            txtTipoComp.setEnabled(false);
            txtCapacidadComp.setEnabled(false);
            txtRamComp.setEnabled(false);
            txtProcesadorComp.setEnabled(false);
            txtTipoComponente.setEnabled(false);
            txtCapacidadComponente.setEnabled(false);
            txtVelocidadComponente.setEnabled(false);
        
        
        }else if(Productos.equals("Componente")){
            txtTipoComp.setEnabled(false);
            txtCapacidadComp.setEnabled(false);
            txtRamComp.setEnabled(false);
            txtProcesadorComp.setEnabled(false);
            txtTipoAccesorio.setEnabled(false);
            txtColorAccesorio.setEnabled(false);
        
        
        }
        
        
        
    }//GEN-LAST:event_cmbProductosSeleccActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombreProd = txtNombre.getText();
        String precioProd = txtPrecio.getText();
        String marcaProd = txtMarca.getText();
        
        if(!nombreProd.equals("") && !precioProd.equals("") && !marcaProd.equals("")){
           
            
            if(cmbProductosSelecc.getSelectedItem().equals("Computador")){
                listaProductos.add("Tipo:"+txtTipoComp.getText()+" "+"Capacidad:"+txtCapacidadComp.getText()+" "+"Ram:"+txtRamComp.getText()+" "+"Procesador:"+txtProcesadorComp.getText());
           }else if(cmbProductosSelecc.getSelectedItem().equals("Accesorio")){
               listaProductos.add("Tipo:"+txtTipoAccesorio.getText()+" "+"Color:"+txtColorAccesorio.getText());
           }else if(cmbProductosSelecc.getSelectedItem().equals("Componete")){
            listaProductos.add("Tipo:"+txtTipoComponente.getText()+" "+"Capacidad:"+txtCapacidadComponente.getText()+" "+"Velocidad:"+txtVelocidadComponente.getText());
           }
             HerenciaProductos prodComputador = new HerenciaProductos(txtNombre.getText(),Double.parseDouble(txtPrecio.getText()), txtMarca.getText());
             listaProductos.add(prodComputador);
             control.escribirObjeto("listaProductos.dat", listaProductos);
             listaProductos = control.extraerObjetos("listaProductos.dat");
             limpiar();
             
             Object ProductosG [] = {prodComputador.getNombre(),prodComputador.getPrecio(),prodComputador.getMarca()};
             DefaultTableModel model = (DefaultTableModel) tblResultados.getModel();
             model.addRow(ProductosG);
             
             
             
         }else{
         JOptionPane.showMessageDialog(rootPane, "Llene todos los Datos");
         }
       
     
       
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    
    
    
    public void limpiar(){
        txtNombre.setText(null);
        txtPrecio.setText(null);
        txtMarca.setText(null);
       // btnRegistrar.setEnabled(true);
    }
    
   public void llenarGrid(){
        if(listaProductos.size() > 0){
            HerenciaProductos producto = new HerenciaProductos();
            DefaultTableModel model = (DefaultTableModel) tblResultados.getModel();
            for(int i = 0; i < listaProductos.size(); i ++){
                producto = (HerenciaProductos) listaProductos.get(i);
                Object ProductosG [] = {producto.getNombre(),producto.getPrecio(),producto.getMarca()};
                model.insertRow(i, ProductosG);
            }
        }
    }
   
   public void llenarCombo(){
        if(listaProductos.size() > 0){
            cmbProductosSelecc.setEnabled(true);
            listaProductos = control.extraerObjetos("listaProductos.dat");
            cmbProductosSelecc.setModel(new javax.swing.DefaultComboBoxModel(listaProductos.toArray()));
        }else{
            cmbProductosSelecc.setEnabled(false);
        }
    }
    
    
   
    
   
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
            java.util.logging.Logger.getLogger(ClsPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClsPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClsPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClsPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClsPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbProductosSelecc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblACCESORIO;
    private javax.swing.JLabel lblCOMPONENTE;
    private javax.swing.JLabel lblCOMPUTADOR;
    private javax.swing.JLabel lblCapacidadComponente;
    private javax.swing.JLabel lblColorAccesorio;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProcesadorComputador;
    private javax.swing.JLabel lblRAM;
    private javax.swing.JLabel lblTipoAccesorio;
    private javax.swing.JLabel lblTipoComponente;
    private javax.swing.JLabel lblTipoComputador;
    private javax.swing.JLabel lblVelocidadComponente;
    private javax.swing.JLabel lvlCapacidadComputador;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txtCapacidadComp;
    private javax.swing.JTextField txtCapacidadComponente;
    private javax.swing.JTextField txtColorAccesorio;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProcesadorComp;
    private javax.swing.JTextField txtRamComp;
    private javax.swing.JTextField txtTipoAccesorio;
    private javax.swing.JTextField txtTipoComp;
    private javax.swing.JTextField txtTipoComponente;
    private javax.swing.JTextField txtVelocidadComponente;
    // End of variables declaration//GEN-END:variables
}
