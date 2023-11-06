/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import javax.swing.JLabel;



public class Stopwatch extends Thread {
    
    private JLabel caja;
    
    public Stopwatch(JLabel caja) {
        this.caja = caja;
    }
    
    
    
    
    public void run(){
        while(true){
            try {
                Calendar c = Calendar.getInstance();
                long t = System.currentTimeMillis();
               
                Thread.sleep(1000);
                long timeSeconds = TimeUnit.MILLISECONDS.toSeconds(t);
                this.caja.setText(String.valueOf(timeSeconds));

            } catch (InterruptedException ex) {
                System.out.println("ERROR");
            }
        }
    
    }
    
}
