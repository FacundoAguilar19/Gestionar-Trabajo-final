/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Controlador.ComentariosData;
import Controlador.EquipoData;
import Controlador.EquipoMiembrosData;
import Controlador.MiembroData;
import Controlador.ProyectoData;
import Controlador.TareaData;
import Modelo.Equipo;
import Modelo.EquipoMiembros;
import Modelo.Proyecto;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nicolas
 */
public class ViewBuscarEquipo extends javax.swing.JFrame {

    private ProyectoData proyecData;
    private EquipoData equiData;
    private EquipoMiembrosData equiMiemData;
    private MiembroData miemData;
    private TareaData tareaData;
    private ComentariosData comData;
    private DefaultTableModel modelo;
    private int idLlevar;

    /**
     * Creates new form ViewBuscarEquipo
     */
    public ViewBuscarEquipo() {
        initComponents();
        modelo = new DefaultTableModel();
        armarCabeceraTabla();
        limpiarTabla();

    }

    ViewBuscarEquipo(ProyectoData proyecData, EquipoData equiData, EquipoMiembrosData equiMiemData, MiembroData miemData, TareaData tareaData, ComentariosData comData) {
        initComponents();
        this.proyecData = proyecData;
        this.equiData = equiData;
        this.equiMiemData = equiMiemData;
        this.miemData = miemData;
        this.tareaData = tareaData;
        this.comData = comData;
        modelo = new DefaultTableModel();
        armarCabeceraTabla();
        limpiarTabla();
        txtIdEquipo.setEnabled(false);
        btnAsignarTarea.setEnabled(false);
        btnVerTareas.setEnabled(false);
    }

    public int getIdLlevar() {
        return idLlevar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        lblNombreEquipo = new javax.swing.JLabel();
        txtProyecto = new javax.swing.JTextField();
        lblFechaCreacion = new javax.swing.JLabel();
        dateFechaCreacion = new com.toedter.calendar.JDateChooser();
        lblProyecto = new javax.swing.JLabel();
        lblIdEquipo = new javax.swing.JLabel();
        txtIdEquipo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblSubTituloBuscarEquipo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMiembrosEquipo = new javax.swing.JTable();
        lblTituloBuscarEquipo = new javax.swing.JLabel();
        lbEstadoEquipo = new javax.swing.JLabel();
        btnCrearEquipo1 = new javax.swing.JButton();
        txtNombreEquipo = new javax.swing.JTextField();
        radBtnEstadoEquipo = new javax.swing.JRadioButton();
        btnAsignarTarea = new javax.swing.JButton();
        btnVerTareas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(240, 63, 65));
        btnModificar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        lblNombreEquipo.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblNombreEquipo.setText("Nombre Equipo:");

        lblFechaCreacion.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblFechaCreacion.setText("Fecha de Creación:");

        lblProyecto.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblProyecto.setText("Proyecto:");

        lblIdEquipo.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblIdEquipo.setText("Número de Equipo:");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(25, 255, 10));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblSubTituloBuscarEquipo.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblSubTituloBuscarEquipo.setText("Miembros del Equipo");

        tablaMiembrosEquipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tablaMiembrosEquipo);

        lblTituloBuscarEquipo.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        lblTituloBuscarEquipo.setText("Buscar Equipo");

        lbEstadoEquipo.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lbEstadoEquipo.setText("Estado del Equipo:");

        btnCrearEquipo1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnCrearEquipo1.setText("Guardar");
        btnCrearEquipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEquipo1ActionPerformed(evt);
            }
        });

        radBtnEstadoEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnEstadoEquipoActionPerformed(evt);
            }
        });

        btnAsignarTarea.setBackground(new java.awt.Color(30, 30, 205));
        btnAsignarTarea.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnAsignarTarea.setText("Asignar Tareas");
        btnAsignarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarTareaActionPerformed(evt);
            }
        });

        btnVerTareas.setBackground(new java.awt.Color(30, 200, 30));
        btnVerTareas.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnVerTareas.setText("Ver Tareas");
        btnVerTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTareasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnCrearEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreEquipo)
                    .addComponent(lblFechaCreacion)
                    .addComponent(lblProyecto)
                    .addComponent(lbEstadoEquipo)
                    .addComponent(lblIdEquipo))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloBuscarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubTituloBuscarEquipo)
                    .addComponent(txtProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnBuscar))
                    .addComponent(txtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radBtnEstadoEquipo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVerTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAsignarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTituloBuscarEquipo)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreEquipo)
                    .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdEquipo))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaCreacion))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProyecto)
                    .addComponent(txtProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEstadoEquipo)
                    .addComponent(radBtnEstadoEquipo))
                .addGap(35, 35, 35)
                .addComponent(lblSubTituloBuscarEquipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnAsignarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnVerTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        ViewPpalEquipo ppalEquipo = new ViewPpalEquipo(proyecData, equiData, equiMiemData, miemData, tareaData, comData);
        ppalEquipo.setVisible(true);
        ppalEquipo.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        radBtnEstadoEquipo.setEnabled(false);
        txtProyecto.setEnabled(false);
        txtIdEquipo.setEnabled(false);
        btnAsignarTarea.setEnabled(false);
        btnVerTareas.setEnabled(false);
        String nombreEquipo = txtNombreEquipo.getText();
        boolean band = false;

        if (nombreEquipo == null || nombreEquipo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese el nombre del Equipo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        List<Equipo> listaEqu = equiData.listarEquipo();
        Equipo equi = equiData.buscarEquipoPorNombre(nombreEquipo);

        if (equi != null && equi.getIdEquipo() != 0) {
            txtIdEquipo.setText(String.valueOf(equi.getIdEquipo()));

            dateFechaCreacion.setDate(java.sql.Date.valueOf(equi.getFechaCreacion()));
            radBtnEstadoEquipo.setSelected(equi.isEstado());

            txtProyecto.setText(equi.getProyecto().toString());

            llenarTabla(equi.getIdEquipo());
            this.idLlevar = equi.getIdEquipo();
            
            
            btnAsignarTarea.setEnabled(true);
            btnVerTareas.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Equipo no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        ViewListadoEquipo incMiem = new ViewListadoEquipo(proyecData, equiData, equiMiemData, miemData, tareaData, comData);
        incMiem.setVisible(true);
        incMiem.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnModificarActionPerformed

    private void radBtnEstadoEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnEstadoEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtnEstadoEquipoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAsignarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarTareaActionPerformed
        // TODO add your handling code here:

        ViewAsignarTareaMiembroEq asignarTarea = new ViewAsignarTareaMiembroEq(proyecData, equiData, equiMiemData, miemData, tareaData, comData, idLlevar);
        asignarTarea.setVisible(true);
        asignarTarea.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnAsignarTareaActionPerformed

    private void btnVerTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTareasActionPerformed
        // TODO add your handling code here:
        ViewVerTarea verTarea = new ViewVerTarea(proyecData, equiData, equiMiemData, miemData, tareaData, comData, idLlevar);
        verTarea.setVisible(true);
        verTarea.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVerTareasActionPerformed

    private void btnCrearEquipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEquipo1ActionPerformed
        // TODO add your handling code here:

        int opcion = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            //si confirma que si, empezar con el codigo aca abajo

            try {
                int id = Integer.parseInt(txtIdEquipo.getText());
                String nombreE = txtNombreEquipo.getText();
                Date sfecha = dateFechaCreacion.getDate();
                LocalDate fechaCre = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                boolean estado = true;

                Equipo eq = new Equipo(null, id, nombreE, fechaCre, estado);
                equiData.modificarEquipo(id, eq);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Hay errores en los campos.");
                txtNombreEquipo.requestFocus();
            }

        }


    }//GEN-LAST:event_btnCrearEquipo1ActionPerformed

    private void llenarTabla(int id) {
        limpiarTabla();
        List<EquipoMiembros> listEq = new ArrayList<EquipoMiembros>();
        listEq = equiMiemData.listarEquipoMiembrosPorIdEquipo(id);
        if (listEq.isEmpty()) {
            System.out.println("vacia");
        }

        for (EquipoMiembros equipoMiembros : listEq) {

            modelo.addRow(new Object[]{equipoMiembros.getMiembro().getIdMiembro(), equipoMiembros.getMiembro().getApellido(), equipoMiembros.getMiembro().getNombre(), equipoMiembros.getMiembro().getDni()});
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("N°");
        filaCabecera.add("Apellido");
        filaCabecera.add("Nombre");
        filaCabecera.add("DNI");

        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        tablaMiembrosEquipo.setModel(modelo);

    }

    private void limpiarTabla() {
        int filasModelo = modelo.getRowCount();
        for (int i = 0; i < filasModelo; i++) {
            modelo.removeRow(0);
        }

    }

    public void limpiar() {
        txtIdEquipo.setText("");
        txtNombreEquipo.setText("");
        txtProyecto.setText("");
        dateFechaCreacion.setDate(null);
        radBtnEstadoEquipo.setEnabled(false);
        this.idLlevar = -1;
        btnAsignarTarea.setEnabled(false);
        btnVerTareas.setEnabled(false);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarTarea;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearEquipo1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerTareas;
    private com.toedter.calendar.JDateChooser dateFechaCreacion;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEstadoEquipo;
    private javax.swing.JLabel lblFechaCreacion;
    private javax.swing.JLabel lblIdEquipo;
    private javax.swing.JLabel lblNombreEquipo;
    private javax.swing.JLabel lblProyecto;
    private javax.swing.JLabel lblSubTituloBuscarEquipo;
    private javax.swing.JLabel lblTituloBuscarEquipo;
    private javax.swing.JRadioButton radBtnEstadoEquipo;
    private javax.swing.JTable tablaMiembrosEquipo;
    private javax.swing.JTextField txtIdEquipo;
    private javax.swing.JTextField txtNombreEquipo;
    private javax.swing.JTextField txtProyecto;
    // End of variables declaration//GEN-END:variables
}