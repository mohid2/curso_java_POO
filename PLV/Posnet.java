package PLV;

public class Posnet {
    public static final double REGARGP_POR_CUOTAS=0.03;
    public static final double MINI_CANT_COUTA=1;
    public static final double MAXI_CANT_COUTA=6;

   public Ticket efectuarPagos(TarjetaCredito tarjeta, double montoApagar,int cantCoutas){
       Ticket ticket=null;
       if(datosValidos(tarjeta,montoApagar,cantCoutas)){
           double montoFinal=montoApagar+montoApagar*recargoSegunCuotas(cantCoutas);
           if (tarjeta.saldoDisponible(montoFinal)){
               tarjeta.descontar(montoFinal);
               String nombre=tarjeta.datosdelTitular();
               double montoPorCuatas=montoFinal/cantCoutas;
               ticket=new Ticket(nombre,montoFinal,montoPorCuatas);
           }
       }
       return ticket;
   }

   private boolean datosValidos(TarjetaCredito tarjeta,double montoApagar,int cantCoutas){
       boolean esTarjetaValida=tarjeta!=null;
       boolean montoValido=montoApagar>0;
       boolean coutasVlidas=cantCoutas>=MINI_CANT_COUTA && cantCoutas<=MAXI_CANT_COUTA;

       return  esTarjetaValida && montoValido && coutasVlidas;
   }
   private double recargoSegunCuotas(int cuotas){
       return (cuotas-1)*REGARGP_POR_CUOTAS;
   }

}
