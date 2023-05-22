/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guia11.ej03cartasesp;

import guia11.ej03cartasesp.Servicios.BarajaService;
import guia11.ej03cartasesp.enumeraciones.Numero;
import guia11.ej03cartasesp.enumeraciones.Palo;
import java.util.HashMap;

/**
 *
 * @author demia
 */
public class Ej03CartasEsp {

    public static void main(String[] args) {
        HashMap<Numero,Palo> mazo = new HashMap();
        BarajaService bs1 = new BarajaService();
        
        bs1.crearBaraja();
        
    }
}
