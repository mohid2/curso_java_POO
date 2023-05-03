package fabrica;

public class Principal {
    public static void main(String[] args) {
        Fabrica fabrica=new Fabrica();
        Sucursal s1=new Sucursal("Sucursal A");
        Sucursal s2=new Sucursal("Sucursal B");
        fabrica.agregarSucursales(s1);
        fabrica.agregarSucursales(s2);
        s1.listarInstrumentos(new Instrumentos("ABC123",13214,Tipo.CUERDA));
        s1.listarInstrumentos(new Instrumentos("BCD456",13432,Tipo.VIENTO));
        s1.listarInstrumentos(new Instrumentos("DEF567",15464,Tipo.PERCUSION));

        s2.listarInstrumentos(new Instrumentos("ASD353",52432,Tipo.CUERDA));
        s2.listarInstrumentos(new Instrumentos("VXCBE2",45645,Tipo.VIENTO));
        System.out.println(fabrica.porcInstrumentosPorTipo("Sucursal A"));

    }
}
