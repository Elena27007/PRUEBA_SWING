package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Prueba extends JFrame{
    private JPanel panel1;
    private JTextField correo;
    private JComboBox pais;
    private JComboBox plataforma;
    private JButton confirmar;
    private JButton volver;
    private JTable table1;

    private DefaultTableModel model;
    private ArrayList<String> lista;

    public Prueba() {
        this.setContentPane(panel1);
        this.setTitle("Prueba");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,500);
        setLocationRelativeTo(null);

        String[] cabecera = {"Correo","País","Plataforma"};
        model = new DefaultTableModel(cabecera,0);
        table1.setModel(model);
        //lista.add(correo.getText());

        confirmar.addActionListener((e) -> {
            if (correo.isShowing() && plataforma.isShowing() && pais.isShowing()) {
                model.addRow(new Object[]{correo.getText(),plataforma.getSelectedItem().toString(),pais.getSelectedItem().toString()});
            }
        });
    }
}
