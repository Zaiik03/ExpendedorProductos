package org.example;

/**
 * Clase que extiende Excetion para manejar cuando no hay stock de productos
 */
public class NoHayProductoException extends Exception{
    /**
     * Metodo Constructor de la exception
     * @param mensaje sera el mensaje respectivo de la exception
     */
    public NoHayProductoException(String mensaje){
        super(mensaje);
    }
}
