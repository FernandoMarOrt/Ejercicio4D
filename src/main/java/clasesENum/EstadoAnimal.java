/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package clasesENum;

/**
 *
 * @author fer
 */
public enum EstadoAnimal {
    
    DESPIERTO(1, "Despierto"),
    JUGANDO(2,"Jugando"),
    COMIENDO(3,"Comiendo"),
    DURMIENDO(4,"Durmiendo");

    private int codigoEstado;
    private String estado;

    //CONSTRUCTOR PRIVADO
    private EstadoAnimal(int codigoEstado, String estado) {

        this.codigoEstado = codigoEstado;
        this.estado = estado;
    }

    public int getCodigoEstado() {
        return codigoEstado;
    }

    public String getEstado() {
        return estado;
    }
    
    

}
