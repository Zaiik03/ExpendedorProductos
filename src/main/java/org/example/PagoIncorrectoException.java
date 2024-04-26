package org.example;

/**
 * Clase que extiende Exception para manejar errores de compra
 */
public class PagoIncorrectoException extends Exception {
    public PagoIncorrectoException(String mensaje){
        super(mensaje);
    }
}