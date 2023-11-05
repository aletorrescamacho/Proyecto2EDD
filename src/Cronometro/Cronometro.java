/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cronometro;

/**
*Crea el tiempo para mostrarlo en la ventana 3
*@author: Alessandra Torres
*@version: 03/11/23
 */  

import java.util.Calendar;
import javax.swing.JLabel;


public class Cronometro extends Thread{
    private JLabel caja;

    public Cronometro(JLabel caja) {
        this.caja = caja;
    }
    
    
    
    
    public void run(){
        while(true){
            try {
                Calendar c = Calendar.getInstance();
                int hora = c.get(Calendar.HOUR);
                int minutos = c.get(Calendar.MINUTE);
                int segundos = c.get(Calendar.SECOND);
                String tiempo = hora+":"+minutos+":"+segundos;
                this.caja.setText(tiempo);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("ERROR");
            }
        }
    
    }
       }
        