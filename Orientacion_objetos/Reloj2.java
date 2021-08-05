package orientacion_objetos

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Reloj2 {

//LA CLASE ESTA DENTRO DE UN METODO
        public void enMarcha(int intervalo, final boolean sonido){
            //**********************************ESTA CLASE ESTA DENTRO DEL METODOS**************************************************
            class DameLaHora2 implements ActionListener {
                public void actionPerformed(ActionEvent evento){
                    Date ahora = new Date();
                    System.out.println("Te pongo la hora cada 3 segundos" +ahora);
                    if(sonido==true){
                        Toolkit.getDefaultToolkit().beep();
                    }
                }

            }

            class DameUnMensaje{
               String mensaje="las quesadillas llevan queso";


            }
            //************************************************************************************

            ActionListener oyente= new DameLaHora2();
            DameUnMensaje dm = new DameUnMensaje();
            System.out.println(dm.mensaje);

            Timer mitemporizador=new Timer(intervalo, oyente);
            mitemporizador.start();
        }

    }
