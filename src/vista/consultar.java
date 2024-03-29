/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.beans.Statement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ListaPublicacion;
import static vista.Libreria.fondo;
import static vista.Libreria.fondo1;

/**
 *
 * @author asus
 */
public class consultar extends javax.swing.JPanel {

    private ListaPublicacion modelo;
    DefaultTableModel tabla;
    private String titu[] = {"ISBN", "TITULO", "AUTOR", "TIPO", "ANIO", "COSTO", "No PAG", "EDICION", "FORMATO", "DURACION", "PESO"};
    private String datos[][] = {null};
    
    public consultar() {
        initComponents();
        
        this.modelo = new ListaPublicacion();
        tabla = new DefaultTableModel();
        for (int i=0; i<titu.length; i++)
        {
            tabla.addColumn(titu[i]);
        }
        tabla1.setModel(tabla);
        
    }
    
    public void datosText() {
        BufferedReader bufferedReader = null;

        try {
            
            bufferedReader = new BufferedReader(new FileReader("datos.txt"));
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] rowfields = line.split(";");
                tabla.addRow(rowfields);
                line = bufferedReader.readLine();
            }

        } catch (IOException x) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSULTAR");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 6, 114, 43));

        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 92, 445, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ISBN A BUSCAR");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 55, -1, -1));

        eliminar.setBackground(new java.awt.Color(255, 0, 0));
        eliminar.setForeground(new java.awt.Color(153, 0, 0));
        eliminar.setText("ELIMINAR");
        eliminar.setBorder(null);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 76, 124, 57));

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("ATRAS");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 76, 124, 57));

        tabla1.setBackground(new java.awt.Color(204, 255, 255));
        tabla1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabla1 = new javax.swing.JTable()
        {
            public boolean isCellEditable (int rowIndex, int colIndex)
            return false;
        }
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IDBN", "TITULO", "AUTOR", "TIPO", "COSTO", "N°PAGINAS", "N°EDICION", "PESO", "FORMATO", "DURACION"
            }
        ));
        tabla1.setName("idbn,titulo,autor,año pub,costo,n°paginas,n°edicion,formato,peso,duracion"); // NOI18N
        tabla1.setRowHeight(22);
        jScrollPane1.setViewportView(tabla1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 737, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String dato = buscar.getText();
        
        for (int i=0; i<tabla1.getRowCount(); i++)
        {
            if (tabla1.getValueAt(i, 0).equals(dato))
            {
                tabla1.changeSelection(i, 0, false, false);
            }
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
     Libreria.fondo.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int fila = tabla1.getSelectedRow();
        tabla.removeRow(fila);
    }//GEN-LAST:event_eliminarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
