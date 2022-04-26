/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horadosistema;

import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Éder
 * O programa captura Data,hora e idioma do sistema
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date relogio = new Date();
        Locale loc = Locale.getDefault();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
        
        System.out.println("O idioma do sistema é: ");
        System.out.println(loc.getDisplayLanguage());
        System.out.println(loc.getLanguage());
        
    }
    
}
