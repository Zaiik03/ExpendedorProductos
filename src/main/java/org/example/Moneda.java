package org.example;

/** Esta clase representa las monedas que usa el comprador en la expendedora.
 */
public abstract class Moneda implements Comparable<Moneda> {
    /** Constructor por defecto
     */

    public Moneda(){

    }
    /** Metodo que retorna direccion de la moneda
    * @return this, que representa la direccion de la moneda, lo cual la retorna
     */
    public Moneda getSerie(){
        return this;
    }

    /** Metodo que compara monedas por su direccion de memoria
    * @param moneda
    * @return int, 1 si soy iguales, 0 si es diferente
    */
    @Override
    public int compareTo(Moneda moneda) {

        if(this.getSerie().equals(moneda.getSerie())) return 1;
        else return 0;

    }
    /** Metodo abstracto
     */
    public abstract int getValor();

}

/** Clase moneda1000 que usaremos para comprar
 */


/** Clase moneda500 que usaremos para comprar
 */


/** Clase moneda100 que usaremos para comprar
 */

