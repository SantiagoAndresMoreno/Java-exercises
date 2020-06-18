package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_principal extends JFrame {
    public form_principal() {
        setTitle("SAC JAVA versión 1.0");
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Menú principal", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);
        //panel izquierdo (donde van a estar los botones)
        JPanel panel_izquierdo = new JPanel();
        panel_izquierdo.setLayout(new GridLayout(5, 1));
        //creamos el primer boton
        JButton boton_formulario1 = new JButton("New Student");
        boton_formulario1.setBounds(0, 0, 100, 30);
        boton_formulario1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //
                form_estudent form_estudent1 = new form_estudent();
            }
        });
        panel_izquierdo.add(boton_formulario1);
        //creamos el segundo boton
        JButton boton_formulario2 = new JButton("List all students");
        boton_formulario2.setBounds(0, 0, 100, 30);
        boton_formulario2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f_abrir_form_show_all_student(actionEvent);
            }
        });
        panel_izquierdo.add(boton_formulario2);
        //creamos el tercer boton (acercade).
        JButton boton_acercade = new JButton("Acerca de...");
        boton_acercade.setBounds(0, 0, 100, 30);
        boton_acercade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_acercade form_acercade1 = new form_acercade();
            }
        });
        panel_izquierdo.add(boton_acercade);
        //creamos el 4to boton
        JButton buttonCS = new JButton("ingresar directivo");
        buttonCS.setBounds(0, 0, 200, 30);
        buttonCS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Aqui va el codigo de el boton buttonCS
                Form_Insertar_directivo insert_sede = new Form_Insertar_directivo();
            }
        });
        //creamos el quinto boton
        panel_izquierdo.add(new JLabel(""));
        JButton buttonShowS = new JButton("Mostrar directivo");
        buttonShowS.setBounds(0, 0, 200, 30);
        buttonShowS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Aqui va el codigo de el boton buttonShowS
                f_open_Form2(actionEvent);


            }
        });
        panel_izquierdo.add(buttonShowS);
        panel_izquierdo.add(buttonCS);
        // creamos el panel inferior
        JPanel panel_inferior = new JPanel();
        panel_inferior.add(new JLabel("Creado por: Santiago Moreno"));
        //agregar los paneles al formulario (jframe).
        add(panel_superior, BorderLayout.NORTH);
        add(panel_izquierdo, BorderLayout.WEST);
        add(panel_inferior, BorderLayout.SOUTH);

        //parametros generales del formularios
        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);
    }

    private void f_abrir_form_show_all_student(java.awt.event.ActionEvent evt) {
        form_show_all_student form_show_all_student1 = new form_show_all_student(this);
    }

    private void f_open_Form2(java.awt.event.ActionEvent evt) {
        form_show_data_directivos form_show_venue1 = new form_show_data_directivos(this);
    }
}