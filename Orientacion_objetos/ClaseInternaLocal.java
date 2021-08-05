package orientacion_objetos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class ClaseInternaLocal {

        public static void main(String[] args){


            Reloj2 mireloj= new Reloj2();
            mireloj.enMarcha(3000, true);
            JOptionPane.showMessageDialog(null,"Pulsa aceptar para terminar");
            System.exit(0);
        }
    }
