package orientado_objetos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizadorConClaseInterna {

    public static void main(String[] args){


        Reloj mireloj= new Reloj(3000, true);
        mireloj.enMarcha();
        JOptionPane.showMessageDialog(null,"Pulsa aceptar para terminar");
        System.exit(0);
    }
}
