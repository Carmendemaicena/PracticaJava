package cat.institutmvm.application.utils;
import javax.swing.*;

import java.awt.*;

public class MyPanel extends JPanel {
    private JComboBox especie;
    private JComboBox habitat;
    private JFormattedTextField profunditat;
    private JFormattedTextField temps_de_navegacio;
    private JComboBox nubosidad;
    private JComboBox fuerza_del_viento;
    private JComboBox direccion_viento;
    private JButton hora_de_llegada;
    private JFormattedTextField numero_embarcaciones;
    private JFormattedTextField temperatura_superficial;
    private JTextField tipo_de_cebo;
    private JFormattedTextField numero_de_anzuelos;
    private JComboBox sexo;
    private JComboBox parasitos;
    private JComboBox presencia_de_anzuelos;
    private JRadioButton yes;
    private JRadioButton no;
    private JButton save;
    private JComboBox no_especie;
    private JComboBox no_habitat;
    private JLabel jcomp16;
    private JLabel jcomp17;
    private JLabel jcomp18;
    private JLabel jcomp19;
    private JLabel jcomp20;
    private JLabel jcomp21;
    private JLabel jcomp22;
    private JLabel jcomp23;
    private JLabel jcomp24;
    private JLabel jcomp25;
    private JLabel jcomp26;
    private JLabel jcomp27;
    private JLabel jcomp28;
    private JLabel jcomp29;
    private JLabel jcomp30;
    private JLabel jcomp31;
    private JLabel jcomp32;
    private JLabel jcomp33;
    private JLabel prosharks;
    private JLabel text;
    private JFormattedTextField abundancia;

    public MyPanel() {
        Color fondo = new Color(229, 255, 236);
        Color ok = new Color(38, 101, 38);
        setBackground(fondo);
        String[] especieItems = {"Dasyatis pastinaca", "Galeorhinus galeus", "Gymnura altavela", "Hexanchus griseus", "Dipturus oxyrinchus", "Isurus oxyrinchus", "Lamna nasus"};
        String[] habitatItems = {"Demersal", "Pelàgic", "No determinado"};
        String[] nubosidadItems = {"(0/9)No hay nubes. Cielo completamente despejado ", "(1/9)Un octa o menos, pero no sin nubes ", "(2/9)Dos octas de cielo cubierto ", "(3/9)Tres octas de cielo cubierto ", "(4/9)Cuatro octas de cielo cubierto ", "(5/9)Cinco octas de cielo cubierto ", "(6/9)Seis octas de cielo cubierto ", "(7/9)Siete octas de cielo cubierto. Cielo casi cubierto aunque no completamente ", "(8/9)Ocho octas. Cielo cubierto completamente ", "(9/9)Cielo oscurecido por cualquier circunstancia que impida discernir la nubosidad presente "};
        String[] fuerza_del_vientoItems = {"(<1) Calma ", "(1-3) Pequeñas olas, pero sin espuma ", "(4-6) Crestas de apariencia vítrea, sin romper ", "(7-10) Pequeñas olas, crestas rompientes ", "(11-16) Borreguillos numerosos, olas cada vez más largas ", "(17-21) Olas medianas y alargadas, borreguillos muy abundantes ", "(22-27) Comienzan a formarse olas grandes, crestas rompientes, espuma ", "(28-33) Mar gruesa, con espuma arrastrada en dirección del viento ", "(34-40) Grandes olas rompientes, franjas de espuma ", "(41-47) Olas muy grandes, rompientes. Visibilidad mermada ", "(48-55) Olas muy gruesas con crestas empenachadas. Superficie del mar blanca ", "(56-63) Olas excepcionalmente grandes, mar completamente blanca, visibilidad muy reducida ", "(64+) Olas excepcionalmente grandes, mar blanca, visibilidad nula "};
        String[] direccion_vientoItems = {"N : Norte ", "NE : Noreste ", "S : Sur ", "SE : Sureste ", "E : Este ", "SO : Suroeste ", "O : Oeste ", "NO : Noroeste "};
        String[] sexoItems = {"Macho", "Hembra"};
        String[] parasitosItems = {"No", "Sí"};
        String[] presencia_de_anzuelosItems = {"No", "Sí"};
        String saveItems = "Save";
        String[] especieNoItems = {" Larus pacificus", "Larus belcheri", "Larus atlanticus", "Larus heermanni",
                "Uca pugnax", "Gecarcoidea natalis", "Macrocheira kaempferi"};
        String[] habitatNoItems = {"Costa", "Tierra", "No determinado"};

        especie = new JComboBox(especieItems);
        habitat = new JComboBox(habitatItems);
        profunditat = new JFormattedTextField(0);
        temps_de_navegacio = new JFormattedTextField(0);
        nubosidad = new JComboBox(nubosidadItems);
        fuerza_del_viento = new JComboBox(fuerza_del_vientoItems);
        direccion_viento = new JComboBox(direccion_vientoItems);
        hora_de_llegada = new JButton("Click");
        numero_embarcaciones = new JFormattedTextField(0);
        temperatura_superficial = new JFormattedTextField(0);
        tipo_de_cebo = new JTextField(5);
        numero_de_anzuelos = new JFormattedTextField(0);
        sexo = new JComboBox(sexoItems);
        parasitos = new JComboBox(parasitosItems);
        presencia_de_anzuelos = new JComboBox(presencia_de_anzuelosItems);
        save = new JButton(saveItems);
        yes = new JRadioButton("Sí");
        yes.setSelected(true);
        no = new JRadioButton("No");
        no.setSelected(false);
        ButtonGroup group = new ButtonGroup();
        group.add(yes);
        group.add(no);
        yes.setBackground(fondo);
        no.setBackground(fondo);
        no_especie = new JComboBox(especieNoItems);
        no_habitat = new JComboBox(habitatNoItems);
        jcomp16 = new JLabel("m");
        jcomp17 = new JLabel("Espécie");
        jcomp18 = new JLabel("Hábitat");
        jcomp19 = new JLabel("Profundidad");
        jcomp20 = new JLabel("Tiempo de navegación");
        jcomp21 = new JLabel("Nubosidad");
        jcomp22 = new JLabel("Fuerza viento");
        jcomp23 = new JLabel("Dirección viento");
        jcomp24 = new JLabel("Hora");
        jcomp25 = new JLabel("Número embarcaciones");
        jcomp26 = new JLabel("Temperatura");
        jcomp27 = new JLabel("Tipo de cebo");
        jcomp28 = new JLabel("Sexo");
        jcomp29 = new JLabel("Número de anzuelos");
        jcomp30 = new JLabel("Presencia anzuelos");
        jcomp31 = new JLabel("Parásitos");
        jcomp32 = new JLabel("min");
        jcomp33 = new JLabel("Abundáncia");
        prosharks = new JLabel("PROSHARKS (tiburones y rayas pelágicos)");
        text = new JLabel("Rellena el formulario");
        abundancia = new JFormattedTextField(0);

        setPreferredSize(new Dimension(900, 449));
        setLayout(null);

        add(especie);
        add(habitat);
        add(no_especie);
        add(no_habitat);
        add(profunditat);
        add(temps_de_navegacio);
        add(nubosidad);
        add(fuerza_del_viento);
        add(direccion_viento);
        add(hora_de_llegada);
        add(numero_embarcaciones);
        add(temperatura_superficial);
        add(tipo_de_cebo);
        add(numero_de_anzuelos);
        add(sexo);
        add(parasitos);
        add(presencia_de_anzuelos);
        add(save);
        add(jcomp16);
        add(jcomp17);
        add(jcomp18);
        add(jcomp19);
        add(jcomp20);
        add(jcomp21);
        add(jcomp22);
        add(jcomp23);
        add(jcomp24);
        add(jcomp25);
        add(jcomp26);
        add(jcomp27);
        add(jcomp28);
        add(jcomp29);
        add(jcomp30);
        add(jcomp31);
        add(jcomp32);
        add(jcomp33);
        add(text);
        add(yes);
        add(no);
        add(prosharks);
        add(abundancia);

        especie.setBounds(45, 30, 150, 25);
        habitat.setBounds(215, 30, 130, 25);
        profunditat.setBounds(45, 90, 130, 25);
        temps_de_navegacio.setBounds(45, 140, 130, 25);
        nubosidad.setBounds(215, 140, 560, 25);
        fuerza_del_viento.setBounds(215, 195, 560, 25);
        direccion_viento.setBounds(45, 195, 130, 25);
        hora_de_llegada.setBounds(45, 255, 70, 25);
        numero_embarcaciones.setBounds(215, 255, 130, 25);
        temperatura_superficial.setBounds(45, 315, 130, 25);
        tipo_de_cebo.setBounds(215, 315, 130, 25);
        numero_de_anzuelos.setBounds(385, 370, 130, 25);
        sexo.setBounds(385, 315, 130, 25);
        parasitos.setBounds(45, 370, 130, 25);
        presencia_de_anzuelos.setBounds(215, 370, 130, 25);
        save.setBounds(700, 390, 80, 30);
        yes.setBounds(410, 35, 70, 50);
        no.setBounds(480, 35, 80, 50);
        no_especie.setBounds(45, 30, 150, 25);
        no_habitat.setBounds(215, 30, 130, 25);
        jcomp16.setBounds(180, 90, 100, 25);
        jcomp17.setBounds(45, 5, 100, 25);
        jcomp18.setBounds(215, 5, 100, 25);
        jcomp19.setBounds(45, 65, 100, 25);
        jcomp20.setBounds(45, 115, 130, 25);
        jcomp21.setBounds(215, 115, 100, 25);
        jcomp22.setBounds(215, 170, 100, 25);
        jcomp23.setBounds(45, 170, 120, 25);
        jcomp24.setBounds(45, 230, 100, 25);
        jcomp25.setBounds(215, 230, 210, 25);
        jcomp26.setBounds(45, 290, 140, 25);
        jcomp27.setBounds(215, 290, 100, 25);
        jcomp28.setBounds(385, 290, 100, 25);
        jcomp29.setBounds(385, 345, 125, 25);
        jcomp30.setBounds(215, 345, 130, 25);
        jcomp31.setBounds(45, 345, 100, 25);
        jcomp32.setBounds(180, 140, 200, 25);
        prosharks.setBounds(410, 15, 250, 20);
        text.setBounds(45, 405, 200, 25);
        abundancia.setBounds(215, 90, 130, 25);
        jcomp33.setBounds(215, 65, 100, 25);

        especie.setSelectedIndex(-1);
        habitat.setSelectedIndex(-1);
        nubosidad.setSelectedIndex(-1);
        fuerza_del_viento.setSelectedIndex(-1);
        direccion_viento.setSelectedIndex(-1);
        sexo.setSelectedIndex(-1);
        parasitos.setSelectedIndex(-1);
        presencia_de_anzuelos.setSelectedIndex(-1);

        yes.addActionListener(
                e -> {
                    especie.setVisible(true);
                    habitat.setVisible(true);
                    profunditat.setVisible(true);
                    temps_de_navegacio.setVisible(true);
                    nubosidad.setVisible(true);
                    fuerza_del_viento.setVisible(true);
                    direccion_viento.setVisible(true);
                    hora_de_llegada.setVisible(true);
                    numero_embarcaciones.setVisible(true);
                    temperatura_superficial.setVisible(true);
                    tipo_de_cebo.setVisible(true);
                    numero_de_anzuelos.setVisible(true);
                    sexo.setVisible(true);
                    parasitos.setVisible(true);
                    presencia_de_anzuelos.setVisible(true);
                    save.setVisible(true);
                    jcomp16.setVisible(true);
                    jcomp19.setVisible(true);
                    jcomp20.setVisible(true);
                    jcomp21.setVisible(true);
                    jcomp22.setVisible(true);
                    jcomp23.setVisible(true);
                    jcomp24.setVisible(true);
                    jcomp25.setVisible(true);
                    jcomp26.setVisible(true);
                    jcomp27.setVisible(true);
                    jcomp28.setVisible(true);
                    jcomp29.setVisible(true);
                    jcomp30.setVisible(true);
                    jcomp31.setVisible(true);
                    jcomp32.setVisible(true);
                    abundancia.setVisible(true);
                    jcomp33.setVisible(true);
                    no_especie.setVisible(false);
                    no_habitat.setVisible(false);
                }
        );
        no.addActionListener(
                e -> {
                    add(jcomp33);
                    no_especie.setSelectedIndex(-1);
                    no_habitat.setSelectedIndex(-1);
                    no_especie.setVisible(true);
                    no_habitat.setVisible(true);
                    especie.setVisible(false);
                    habitat.setVisible(false);
                    profunditat.setVisible(false);
                    temps_de_navegacio.setVisible(false);
                    nubosidad.setVisible(false);
                    fuerza_del_viento.setVisible(false);
                    direccion_viento.setVisible(false);
                    hora_de_llegada.setVisible(false);
                    numero_embarcaciones.setVisible(false);
                    temperatura_superficial.setVisible(false);
                    tipo_de_cebo.setVisible(false);
                    numero_de_anzuelos.setVisible(false);
                    sexo.setVisible(false);
                    parasitos.setVisible(false);
                    presencia_de_anzuelos.setVisible(false);
                    jcomp16.setVisible(false);
                    jcomp19.setVisible(false);
                    jcomp20.setVisible(false);
                    jcomp21.setVisible(false);
                    jcomp22.setVisible(false);
                    jcomp23.setVisible(false);
                    jcomp24.setVisible(false);
                    jcomp25.setVisible(false);
                    jcomp26.setVisible(false);
                    jcomp27.setVisible(false);
                    jcomp28.setVisible(false);
                    jcomp29.setVisible(false);
                    jcomp30.setVisible(false);
                    jcomp31.setVisible(false);
                    jcomp32.setVisible(false);
                    abundancia.setVisible(true);
                    jcomp33.setVisible(true);
                }
        );
        save.addActionListener(
                f -> {
                    boolean save, save1, save2, save3, save4, save5, save6, save7, save8, save9, save10, save11, save12, save13,
                            save14,save15;
                    String val1 = especie.getSelectedItem().toString();
                    if (especie.getSelectedIndex() == -1) {
                        save = false;
                    } else {
                        save = true;
                    }
                    String val2 = habitat.getSelectedItem().toString();
                    if (habitat.getSelectedIndex() == -1) {
                        save1 = false;
                    } else {
                        save1 = true;
                    }
                    int val3 = (int) profunditat.getValue();
                    if (profunditat.getText().isEmpty() || val3 < 0) {
                        save2 = false;
                    } else {
                        save2 = true;
                    }
                    int val4 = (int) temps_de_navegacio.getValue();
                    if (temps_de_navegacio.getText().isEmpty() || val4 < 0) {
                        save3 = false;
                    } else {
                        save3 = true;
                    }
                    String val5 = nubosidad.getSelectedItem().toString();
                    if (nubosidad.getSelectedIndex() == -1) {
                        save4 = false;
                    } else {
                        save4 = true;
                    }
                    String val = direccion_viento.getSelectedItem().toString();
                    if (fuerza_del_viento.getSelectedIndex() == -1) {
                        save15 = false;
                    } else {
                        save15 = true;
                    }
                    String val6 = fuerza_del_viento.getSelectedItem().toString();
                    if (fuerza_del_viento.getSelectedIndex() == -1) {
                        save5 = false;
                    } else {
                        save5 = true;
                    }
                    String val7 = hora_de_llegada.getText();
                    if (hora_de_llegada.getText().isEmpty()) {
                        save6 = false;
                    } else {
                        save6 = true;
                    }
                    String val8 = numero_embarcaciones.getValue().toString();
                    if (numero_embarcaciones.getText().isEmpty()) {
                        save7 = false;
                    } else {
                        save7 = true;
                    }
                    String val9 = temperatura_superficial.getValue().toString();
                    if (temperatura_superficial.getText().isEmpty()) {
                        save8 = false;
                    } else {
                        save8 = true;
                    }
                    String val10 = tipo_de_cebo.getText();
                    if (tipo_de_cebo.getText().isEmpty()) {
                        save9 = false;
                    } else {
                        save9 = true;
                    }
                    String val12 = sexo.getSelectedItem().toString();
                    if (sexo.getSelectedIndex() == -1) {
                        save11 = false;
                    } else {
                        save11 = true;
                    }
                    String val13 = parasitos.getSelectedItem().toString();
                    if (parasitos.getSelectedIndex() == -1) {
                        save12 = false;
                    } else {
                        save12 = true;
                    }
                    String val14 = presencia_de_anzuelos.getSelectedItem().toString();
                    if (presencia_de_anzuelos.getSelectedIndex() == -1) {
                        save13 = false;
                    } else {
                        save13 = true;
                    }
                    int val11 = (int) numero_de_anzuelos.getValue();
                    if (val11 < 0 || numero_de_anzuelos.getText().isEmpty()) {
                        save10 = false;
                    } else {
                        save10 = true;
                    }
                    int val15 = (int) abundancia.getValue();
                    if (abundancia.getText().isEmpty() || val15 < 0) {
                        save14 = false;
                    } else {
                        save14 = true;
                    }
                    if (save && save1 && save14) {
                        text.setForeground(ok);
                        text.setText("Información válida✓");
                        JOptionPane.showMessageDialog(null, "Información subida a la base de datos");
                        ControlDatos control = new ControlDatos();
                        control.insertar(val1, val2, val3, val4, val5, val, val6, val7, val8, val9, val10, val12
                                , val13, val14, val11, val15);
                    } else {
                        text.setForeground(Color.RED);
                        text.setText("Faltan campos por rellenar✗");
                        JOptionPane.showMessageDialog(null, "Por favor, rellena el formulario con" +
                                " TODOS los datos pertinentes");
                    }
                });
        hora_de_llegada.addActionListener(
                e -> {
                    SpinnerDateModel dateModel = new SpinnerDateModel();
                    JSpinner spinner = new JSpinner(dateModel);
                    JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(spinner, "HH:mm:ss");
                    spinner.setEditor(timeEditor);
                    JOptionPane.showMessageDialog(null, timeEditor);
                }
        );
    }
}





