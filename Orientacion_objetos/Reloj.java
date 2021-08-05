package orientacion_objetos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

class Reloj{

    public Reloj(int intervalo, boolean sonido){
        this.intervalo=intervalo;
        this.sonido=sonido;
    }

    public void enMarcha(){

        ActionListener oyente= new DameLaHora();
        Timer mitemporizador=new Timer(intervalo, oyente);
        mitemporizador.start();
    }


    private int intervalo;
    private boolean sonido;

    //**********************************CLASE INTERNA( INNER CLASS)
    // NO ESTA DENTRO DE UN METODO
    // **************************************************

    private class DameLaHora implements ActionListener{

        public void actionPerformed(ActionEvent evento){
            Date ahora = new Date();
            System.out.println("Te pongo la hora cada 3 segundos" +ahora);
            if(sonido==true){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

    //************************************************************************************
}
