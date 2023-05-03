package ejerccioAccenture.herencia.herencia2;

public class Tienda {
    public static void main(String[] args) {
        Producto[] productos = new Producto[5];
        productos[0] = new Perecedero("Yogurt", 0.50, 1);
        productos[1] = new Perecedero("Leche", 1.20, 2);
        productos[2] = new Perecedero("Queso", 5.70, 25);
        productos[3] = new NoPerecedero("Esponja", 0.90, "Limpieza & hogar”");
        productos[4] = new NoPerecedero("Jabón", 1.90, "Limpieza & hogar");
        double sumaTotal=0;
        for (Producto producto : productos) {
            System.out.println(producto);
            System.out.println("Precio: "+producto.calcularImporteTotal(2));
            sumaTotal+= producto.calcularImporteTotal(2);
        }
        System.out.println("El precio total de todos los productos es: "+sumaTotal);




    }
}
