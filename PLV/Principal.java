package PLV;

public class Principal {
    public static void main(String[] args) {
        Posnet posnet=new Posnet();
        Persona p=new Persona("40545665","pepe","Gomez","1112345678","pepe@gmail.com");
        TarjetaCredito t=new TarjetaCredito("bancarota","1234567890123456",8000,EntidadFinanciera.BIRZA,p);

        System.out.println("tarjeta entes del pago");
        System.out.println(t);

        System.out.println("Ticket tras el pago...");
        Ticket ticketgenerado=posnet.efectuarPagos(t,10000,5);
        System.out.println(ticketgenerado);

        System.out.println("tarjeta despues del pago");
        System.out.println(t);





    }
}
