package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_Insertar_directivo extends JDialog {

    public JTextField txt_nombre, txt_apellidos, txt_cedula, txt_cargo;

    public Form_Insertar_directivo() {

        setLayout(new BorderLayout());
        JPanel panel_supp = new JPanel();
        JLabel label_menu = new JLabel("Form directivos", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_supp.add(label_menu);//This is the parameters of the label
        JPanel panel_central = new JPanel();

        panel_central.setLayout(new GridLayout(8, 2));//this is the table that divide the spaces to input txt
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("número de cedula del directivo : ", SwingConstants.CENTER));
        panel_central.add(txt_cedula = new JTextField(""));
        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("nombre del directivo :  ", SwingConstants.CENTER));
        panel_central.add(txt_nombre = new JTextField(""));

        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("Apellidos del directivo : ", SwingConstants.CENTER));
        panel_central.add(txt_apellidos = new JTextField(""));

        panel_central.add(new JLabel(""));
        panel_central.add(new JLabel(""));

        panel_central.add(new JLabel("Cargo del directivo  : ", SwingConstants.CENTER));
        panel_central.add(txt_cargo = new JTextField(""));


        //panel_inferior
        JPanel panel_inf = new JPanel();
        JButton buttonI = new JButton("crear");
        buttonI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Aqui va el codigo de el boton crear
                f_crear_nuevo_directivo(actionEvent);
            }
        });

        buttonI.setBounds(0, 0, 100, 50);
        panel_inf.add(buttonI);


        add(panel_supp, BorderLayout.NORTH);
        add(panel_central, BorderLayout.WEST);
        add(panel_inf, BorderLayout.SOUTH);

        //parametros de el formulario
        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);


    }

    public void f_crear_nuevo_directivo(java.awt.event.ActionEvent evt) {
        //description: this method
        final JDialog ventanaE = new JDialog(this, "saved data", true);
        if (txt_cedula.getText().length() < 10) {
            ventanaE.add(new JLabel("el campo codigo debe tener minimo  10 caracteres"));
        } else if (txt_nombre.getText().length() < 3) {
            ventanaE.add(new JLabel("el campo codigo debe tener minimo  3 caracteres"));
        } else if (txt_apellidos.getText().length() < 10) {
            ventanaE.add(new JLabel("el campo codigo debe tener minimo  10 caracteres"));
        } else if (txt_cargo.getText().length() < 10) {
            ventanaE.add(new JLabel("el campo codigo debe tener minimo  10 caracteres"));
        } else {
            //grabamos en el archivo
            File_data_directivos file_data = new File_data_directivos();
            boolean rta = File_data_directivos.f_add_directivo(txt_cedula.getText(), txt_nombre.getText(), txt_apellidos.getText(), txt_cargo.getText());
            if (rta == true) {
                ventanaE.add(new JLabel("Datos guardados con exito"));
                txt_cedula.setText("");
                txt_nombre.setText("");
                txt_apellidos.setText("");
                txt_cargo.setText("");
            } else {
                ventanaE.add(new JLabel("no se pueden guardar los datos en el archivo E:/directivo.txt"));

            }
        }
        ventanaE.pack();
        ventanaE.setVisible(true);
    }
}