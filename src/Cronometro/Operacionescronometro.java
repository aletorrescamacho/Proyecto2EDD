/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cronometro;

import javax.swing.JLabel;


public class Operacionescronometro {
    
    private static int convertiraSeg(String hora){
        String[] arrShora = hora.split(":");
        int[] arrIhora = new int[3];
        int contador = 0;
        while (contador < 3){
            int num = Integer.parseInt(arrShora[contador]);
            arrIhora[contador] = num;
            contador++;
        }
        
        int horaaSeg = arrIhora[0]*3600;
        int minaSeg = arrIhora[1]*60;
        int seg = arrIhora[2];
        
        int Segtotales = horaaSeg+minaSeg+seg;
        
    return Segtotales;
    }
    
    public static int convertiraEtiquetat(JLabel tiempo, JLabel lbhorainicio){
        String inicioS = lbhorainicio.getText();
        String ahoraS = tiempo.getText();
        int inicioI = convertiraSeg(inicioS);
        int ahoraI = convertiraSeg(ahoraS);
        
        int tiempoCorr = ahoraI - inicioI;
        
        System.out.println(tiempoCorr);
        
    return tiempoCorr;
    }
    public static void main(String[] args) {
        
	}
}
