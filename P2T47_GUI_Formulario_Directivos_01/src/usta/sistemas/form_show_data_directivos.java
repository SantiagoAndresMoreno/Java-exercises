package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class form_show_data_directivos extends JDialog {
    //description: this class show all data of venue.txt

    public form_show_data_directivos(java.awt.Frame parent) {
        super(parent, true);
        setLayout(new BorderLayout());
        JPanel panel_sup = new JPanel();
        JLabel label_m = new JLabel("Lista de directivos",SwingConstants.CENTER);
        label_m.setFont(new Font("Arial",0,20));
        panel_sup.add(label_m);
        String[]columnsNames = {"cedula","nombre","apellido","cargo"};
        File_data_directivos file_data_directivos=new File_data_directivos();
        JTable tabla_de_datos=new JTable(File_data_directivos.f_show_data(),columnsNames);
        tabla_de_datos.setBounds(10,50,590,300);
        JScrollPane panelC= new JScrollPane(tabla_de_datos);
        add(panel_sup,BorderLayout.NORTH);
        add(panelC,BorderLayout.CENTER);
        setSize(600,400);

        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        pack();

    }

}