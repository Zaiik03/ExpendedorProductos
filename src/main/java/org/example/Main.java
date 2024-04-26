package org.example;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(4);
        Moneda m = new Moneda1000(); // hola

        try{
            Comprador c =  new Comprador(m, 7, exp);
            System.out.println(c.queConsumiste()+", " + c.cuantoVuelto());
        } catch (PagoIncorrectoException a){
            System.out.println("Error de tipo pago: " + a.getMessage());
        } catch (PagoInsuficienteException a){
            System.out.println("Error de pago: " + a.getMessage() + ". Aqui tiene su dinero: " + m.getValor());
        } catch (NoHayProductoException a){
            System.out.println("Error de inventario: " + a.getMessage() + ". Aqui tiene su dinero: " + m.getValor());
        }
    }
}