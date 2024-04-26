package ExpendedorProductos.src.main.java.org.example;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(4);
        Moneda m = new Tarea1.src.Moneda1000(); // hola

        try{
            Comprador c =  new Comprador(m, Tarea1.src.Expendedor.FANTA, exp);
            System.out.println(c.queConsumiste()+", " + c.cuantoVuelto());
        } catch (PagoIncorrectoException a){
            System.out.println("Error de tipo pago: " + a.getMessage());
        } catch (PagoInsuficienteException a){
            System.out.println("Error de pago: " + a.getMessage());
        } catch (NoHayProductoException a){
            System.out.println("Error de inventario: " + a.getMessage());
        }
    }
}