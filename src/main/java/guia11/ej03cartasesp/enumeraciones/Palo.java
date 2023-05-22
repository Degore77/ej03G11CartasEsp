/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package guia11.ej03cartasesp.enumeraciones;

/**
 *
 * @author demia
 */
public enum Palo {
    ESPADAS("Espada"),BASTOS("Basto"),OROS("Oro"),COPAS("Copa");

    private String color;
    
    private Palo(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Palo{" + "color=" + color + '}';
    }
    
    
    
    
}
