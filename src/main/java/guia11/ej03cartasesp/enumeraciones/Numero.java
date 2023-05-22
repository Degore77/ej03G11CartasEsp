/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package guia11.ej03cartasesp.enumeraciones;

/**
 *
 * @author demia
 */
public enum Numero {
    UNO(1),DOS(2),TRES(3),CUATRO(4),CINCO(5),SEIS(6),SIETE(7),DIEZ(10),ONCE(11),DOCE(12);
    
    private Integer num;
    
    private Numero(Integer num){
        this.num=num;
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Numero{" + "num=" + num + '}';
    }
    
    
}
