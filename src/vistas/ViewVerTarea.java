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
import Modelo.Comentarios;
import Modelo.EquipoMiembros;
import Modelo.Miembro;
import Modelo.Tarea;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ViewVerTarea extends javax.swing.JFrame {

    private ProyectoData proyecData;
    private EquipoData equiData;
    private EquipoMiembrosData equiMiemData;
    private MiembroData miemData;
    private TareaData tareaData;
    private ComentariosData comData;
    private ViewBuscarEquipo busEq;
    private int idEquipo;

    /**
     * Creates new form ViewVerTarea
     */
    public ViewVerTarea() {
        initComponents();
    }

    ViewVerTarea(ProyectoData proyecData, EquipoData equiData, EquipoMiembrosData equiMiemData, MiembroData miemData, TareaData tareaData, ComentariosData comData, int idLlevar) {
        initComponents();
        this.proyecData = proyecData;
        this.equiData = equiData;
        this.equiMiemData = equiMiemData;
        this.miemData = miemData;
        this.tareaData = tareaData;
        this.comData = comData;
        this.idEquipo = idLlevar;
        cargaMiembroCBox();
        cargaTareaMCBox();
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
        lblNombreTarea = new javax.swing.JLabel();
        lblMiembro = new javax.swing.JLabel();
        cBoxMiembro = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        cBoxTarea = new javax.swing.JComboBox<>();
        lblTituloAsignarTareas1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTituloAsignarTareas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txAreaComentario = new javax.swing.JTextArea();
        lblMiembro1 = new javax.swing.JLabel();
        lblFechaCreacion = new javax.swing.JLabel();
        dateFechaCreacion = new com.toedter.calendar.JDateChooser();
        btnFiltro = new javax.swing.JButton();
        btnAsignar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        cBoxEstadoTarea = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombreTarea.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblNombreTarea.setText("Tarea:");

        lblMiembro.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblMiembro.setText("Miembro:");

        cBoxMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxMiembroActionPerformed(evt);
            }
        });

        lblEstado.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblEstado.setText("Estado:");

        cBoxTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxTareaActionPerformed(evt);
            }
        });

        lblTituloAsignarTareas1.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        lblTituloAsignarTareas1.setText("Tareas Del Equipo");

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));

        lblTituloAsignarTareas.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        lblTituloAsignarTareas.setText("Progreso:");

        txAreaComentario.setColumns(20);
        txAreaComentario.setRows(5);
        jScrollPane1.setViewportView(txAreaComentario);

        lblMiembro1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblMiembro1.setText("Comentario:");

        lblFechaCreacion.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        lblFechaCreacion.setText("Fecha de Avance:");

        btnFiltro.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnFiltro.setText("Filtro Tareas");
        btnFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroActionPerformed(evt);
            }
        });

        btnAsignar.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnAsignar.setText("Guardar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnHistorial.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnHistorial.setText("Historial");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloAsignarTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaCreacion)
                    .addComponent(lblMiembro1)
                    .addComponent(btnAsignar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFiltro)
                        .addGap(36, 36, 36)
                        .addComponent(btnHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloAsignarTareas)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMiembro1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaCreacion)
                    .addComponent(dateFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        cBoxEstadoTarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desactivar", "Pendiente", "Proceso", "Terminada" }));
        cBoxEstadoTarea.setSelectedIndex(-1);
        cBoxEstadoTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxEstadoTareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreTarea)
                    .addComponent(lblMiembro)
                    .addComponent(lblEstado))
                .addGap(73, 73, 73)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cBoxMiembro, 0, 307, Short.MAX_VALUE)
                    .addComponent(cBoxTarea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cBoxEstadoTarea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTituloAsignarTareas1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloAsignarTareas1)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMiembro)
                    .addComponent(cBoxMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreTarea)
                    .addComponent(cBoxTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(cBoxEstadoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(this, "¿Desea guardar el progreso?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            //si confirma que si, empezar con el codigo aca abajo
            try {
                if (txAreaComentario.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "El campo nombre de la tarea no puede estar vacío.");
                    txAreaComentario.requestFocus();
                    return;
                }

                Date sfecha = dateFechaCreacion.getDate();
                if (sfecha == null) {
                    JOptionPane.showMessageDialog(this, "La fecha de creación no puede estar vacía.");
                    return;
                }
                Miembro miemSelec = (Miembro) cBoxMiembro.getSelectedItem();
                Tarea tareaSel = (Tarea) cBoxTarea.getSelectedItem();
                String coment = txAreaComentario.getText();
                LocalDate fechaCre = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                boolean estado = true;
                Comentarios c = new Comentarios(coment, fechaCre, tareaSel, estado);
                comData.guardarComentario(c);

                int estadoSelec = cBoxEstadoTarea.getSelectedIndex();
                tareaData.actualizarEstadoTarea(tareaSel.getIdTarea(), estadoSelec);
                limpiar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Hay errores en los campos.");
                txAreaComentario.requestFocus();
            }

        }
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        // TODO add your handling code here:
        ViewBuscarEquipo ppalBusEquipo = new ViewBuscarEquipo(proyecData, equiData, equiMiemData, miemData, tareaData, comData);
        ppalBusEquipo.setVisible(true);
        ppalBusEquipo.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cBoxMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxMiembroActionPerformed
        // TODO add your handling code here:

        Miembro miemSel = (Miembro) cBoxMiembro.getSelectedItem();
        cargaTareaMCBox();
    }//GEN-LAST:event_cBoxMiembroActionPerformed

    private void cBoxTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxTareaActionPerformed
        // TODO add your handling code here:
        Tarea tareaSel = (Tarea) cBoxTarea.getSelectedItem();

        if (tareaSel != null) {
            int estadoT = tareaSel.getEstado();

            if (estadoT == 1) {
                cBoxEstadoTarea.setSelectedIndex(1);
            } else if (estadoT == 2) {
                cBoxEstadoTarea.setSelectedIndex(2);
            } else if (estadoT == 3) {
                cBoxEstadoTarea.setSelectedIndex(3);
            } else {
                cBoxEstadoTarea.setSelectedIndex(0);
            }

        } else {
            cBoxEstadoTarea.setSelectedIndex(-1);
        }


    }//GEN-LAST:event_cBoxTareaActionPerformed

    private void btnFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroActionPerformed
        // TODO add your handling code here:

        Miembro miemSel = (Miembro) cBoxMiembro.getSelectedItem();
        Tarea tareaSel = (Tarea) cBoxTarea.getSelectedItem();

        ViewFiltroTareas historialc = new ViewFiltroTareas(proyecData, equiData, equiMiemData, miemData, tareaData, comData, miemSel, tareaSel, idEquipo);
        historialc.setVisible(true);
        historialc.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnFiltroActionPerformed

    private void cBoxEstadoTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxEstadoTareaActionPerformed
        // TODO add your handling code here:
        Miembro eqSelec = (Miembro) cBoxMiembro.getSelectedItem();
        Tarea tareaSel = (Tarea) cBoxTarea.getSelectedItem();

        if (cBoxEstadoTarea.getSelectedIndex() == 0) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta acción podria desactivar la tarea, desea continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                cBoxEstadoTarea.setSelectedIndex(0);

            } else {
                cBoxEstadoTarea.setSelectedIndex(tareaSel.getEstado());

            }
        }

    }//GEN-LAST:event_cBoxEstadoTareaActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        // TODO add your handling code here:
        Miembro miemSel = (Miembro) cBoxMiembro.getSelectedItem();
        Tarea tareaSel = (Tarea) cBoxTarea.getSelectedItem();

        ViewHistorialComentarios historialc = new ViewHistorialComentarios(proyecData, equiData, equiMiemData, miemData, tareaData, comData, miemSel, tareaSel, idEquipo);
        historialc.setVisible(true);
        historialc.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnHistorialActionPerformed
    private void cargaMiembroCBox() {
        boolean band = false;

        List<EquipoMiembros> listaMiembroXEq = equiMiemData.listarEquipoMiembrosPorIdEquipo(idEquipo);
        List<Miembro> listaMiembro = miemData.listarMiembro();

        for (Miembro miembro : listaMiembro) {
            band = false;
            for (EquipoMiembros miembroXEq : listaMiembroXEq) {
                if (miembro.getIdMiembro() == miembroXEq.getMiembro().getIdMiembro()) {
                    band = true;

                }
            }

            if (band) {
                cBoxMiembro.addItem(miembro);
            }

        }
    }

    private void cargaTareaMCBox() {

        cBoxTarea.removeAllItems();

        Miembro miemSel = (Miembro) cBoxMiembro.getSelectedItem();
        int idEqMiemb = equiMiemData.buscarIdMiembroEq(idEquipo, miemSel.getIdMiembro());

        ArrayList<Tarea> listaTarea = (ArrayList<Tarea>) tareaData.listarTareasPorIdMiembroEQ(idEqMiemb);

        for (Tarea tarea : listaTarea) {
            cBoxTarea.addItem(tarea);
        }

        Tarea tareaSel = (Tarea) cBoxTarea.getSelectedItem();
        if (tareaSel == null) {
            cBoxEstadoTarea.setEnabled(false);
            txAreaComentario.setEnabled(false);
            dateFechaCreacion.setEnabled(false);
        } else {
            cBoxEstadoTarea.setEnabled(true);
            txAreaComentario.setEnabled(true);
            dateFechaCreacion.setEnabled(true);
        }

    }

    public void limpiar() {
        txAreaComentario.setText("");
        dateFechaCreacion.setDate(null);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnFiltro;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cBoxEstadoTarea;
    private javax.swing.JComboBox<Miembro> cBoxMiembro;
    private javax.swing.JComboBox<Tarea> cBoxTarea;
    private com.toedter.calendar.JDateChooser dateFechaCreacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaCreacion;
    private javax.swing.JLabel lblMiembro;
    private javax.swing.JLabel lblMiembro1;
    private javax.swing.JLabel lblNombreTarea;
    private javax.swing.JLabel lblTituloAsignarTareas;
    private javax.swing.JLabel lblTituloAsignarTareas1;
    private javax.swing.JTextArea txAreaComentario;
    // End of variables declaration//GEN-END:variables
}