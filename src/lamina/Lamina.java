/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamina;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 22/06/2021
 *
 */
public class Lamina extends JPanel {

    private JScrollPane lamina2;
    private JTextArea AreaTexto;
    //Componentes para el menu
    private JMenuBar barra;
    private JMenu fuente, estilo, tamano;
    //Menu Fuente
    private JMenuItem arial, serif, AgencyFB;
    //Menu Estilo
    private JMenuItem negrita, cursiva;
    //Menu tamaño
    private JMenuItem chico, mediano, grande;

    public Lamina() {
        //Asignamos el tipo de Layout que tendra nuestra Lamina
        setLayout(new BorderLayout());
        //Inicializamos nuestra area de texto
        AreaTexto = new JTextArea(10, 20);
        AreaTexto.setFont(new Font("Arial", Font.PLAIN, 25));
        AreaTexto.setLineWrap(true);
        lamina2 = new JScrollPane(AreaTexto);
        AreaTexto.setBackground(Color.LIGHT_GRAY);
        //Inicializamos nuestra barra 
        barra = new JMenuBar();
        barra.setBackground(Color.cyan.darker().darker().brighter());
        //Inicializamos las opciones que tendra la barra
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamano = new JMenu("Tamaño");
        //Inicializamos los submenus
        //Fuente
        arial = new JMenuItem("Aero");
        serif = new JMenuItem("Serif");
        AgencyFB = new JMenuItem("Agency FB");
        //Estilo
        negrita = new JMenuItem("Negrita");
        cursiva = new JMenuItem("Cursiva");
        //tamaño
        chico = new JMenuItem("20");
        mediano = new JMenuItem("40");
        grande = new JMenuItem("60");
        //Agregamos los submenus a su opcion principal
        fuente.add(arial);
        fuente.addSeparator();
        fuente.add(serif);
        fuente.addSeparator();
        fuente.add(AgencyFB);
        //Estilo
        estilo.add(negrita);
        estilo.add(cursiva);
        //tamaño
        tamano.add(chico);
        tamano.add(mediano);
        tamano.add(grande);
        //Agregamos las opciones a la barra
        barra.add(fuente);
        barra.add(estilo);
        barra.add(tamano);
        //Creamos la instanicia del evento
        gestionEvento evento = new gestionEvento();
        arial.addActionListener(evento);
        serif.addActionListener(evento);
        AgencyFB.addActionListener(evento);
        negrita.addActionListener(evento);
        cursiva.addActionListener(evento);
        chico.addActionListener(evento);
        mediano.addActionListener(evento);
        grande.addActionListener(evento);
        //Le asignamos un tipo de layout a nuestra segunda lamina
        add(lamina2, BorderLayout.CENTER);
        add(barra, BorderLayout.NORTH);

    }

    //Clase que gestionara el evento
    private class gestionEvento implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Font f = AreaTexto.getFont();
            //Condiciones para el tipo 
            if (e.getSource() == arial) {
                AreaTexto.setFont(new Font(arial.getText(), f.getStyle(), f.getSize()));
                //   f = arial.getText();
            }
            if (e.getSource() == serif) {
                AreaTexto.setFont(new Font(serif.getText(), f.getStyle(), f.getSize()));
                //f = serif.getText();
            }
            if (e.getSource() == AgencyFB) {
                AreaTexto.setFont(new Font(AgencyFB.getText(), f.getStyle(), f.getSize()));
                // f = AgencyFB.getText();
            }
            if (e.getSource() == negrita) {
                //System.out.println(f);
                AreaTexto.setFont(new Font(f.getFontName(), Font.BOLD, f.getSize()));
            }
            if (e.getSource() == cursiva) {
                // System.out.println(f);
                AreaTexto.setFont(new Font(f.getFontName(), Font.ITALIC, f.getSize()));
                //f.getStyle()
            }
            if (e.getSource() == chico) {
                AreaTexto.setFont(new Font(f.getFontName(), f.getStyle(), Integer.parseInt(chico.getText())));
            }
            if (e.getSource() == mediano) {
                AreaTexto.setFont(new Font(f.getFontName(), f.getStyle(), Integer.parseInt(mediano.getText())));
            }
            if (e.getSource() == grande) {
                AreaTexto.setFont(new Font(f.getFontName(), f.getStyle(), Integer.parseInt(grande.getText())));
            }

        }

    }
}
