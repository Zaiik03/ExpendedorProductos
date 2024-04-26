package org.example;

/**
 * Clase encargada de comprar
 */
public class Comprador {
    /**
     * String encargado de almacenar el valor que retorna el getConsumir
     */
    private String sonido;
    /**
     * valor numerico que almacenara el vuelo despues de la compra
     */
    private int vuelto;
    /**
     * Metodo constructor del Comprador
     * @param m es la moneda que el usuario ingresa
     * @param cualProducto selecciona el producto qe quieres comprar
     * @param exp es el Expendedor del cual sacaremos los productos
     * @throws PagoIncorrectoException es la exception en el caso de que pague con una moneda nula
     * @throws PagoInsuficienteException es la exception en el caso de que el precio no sea el suficiente
     * @throws NoHayProductoException caso donde no hay stock
     */
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException{
        Producto b = exp.comprarProducto(m, cualProducto);
        while(true){
            Moneda aux = exp.getVuelto();
            if(aux == null){
                break;
            } else{
                vuelto += aux.getValor();
            }
        }

        if(b == null){
            sonido = null;
        } else{
            sonido = b.getConsumir();
        }

    }

    /**
     * Metodo que devuelve el vuelto luego de validar la compra
     * @return el vuelto de la persona
     */
    public int cuantoVuelto(){
        return vuelto;
    }

    /**
     * Metodo que se encarga de representar el sonido del producto
     * @return un String con el sonido respectivo
     */
    public String queConsumiste(){
        return sonido;
    }
}
