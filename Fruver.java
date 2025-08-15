// ANALISIS
/*
 * Este programa debera calcular el total de una compra 
 * donde actualmente tiene dos productos
 * Entradas: 2, Cantidad de manzanas y cantidad de bananos, ambos ingresados por el usuario
 * Salidas: 5, Total del subproducto de manzanas, total del subproducto de bananos, 
 * total de la compra sumando los subtotales, el descuento del 10% y 
 * el precio final aplicandole el 10% de descuento
 * Ejemplo: Juan va a la tienda y compra 3 manzanas y 10 bananos, del total de productos comprados, 
 * hay que aplicarle el 10% de descuento al total de la compra que hizo Juan.
 */

import java.util.Scanner;

public class Fruver {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final double PRECIO_MANZANA = 1000;
        
        System.out.println("Indica el numero de manzanas que compraste");
        double CANTIDAD_DE_MANZANAS  = entrada.nextDouble();
        entrada.nextLine();

        final double PRECIO_BANANO = 800;

        System.out.println("Indica el numero de bananos que compraste");
        double CANTIDAD_DE_BANANOS = entrada.nextDouble();
        entrada.nextLine();

         final double SUBTOTAL_MANZANAS, SUBTOTAL_BANANOS;
        
        SUBTOTAL_MANZANAS = (PRECIO_MANZANA * CANTIDAD_DE_MANZANAS);
        
        SUBTOTAL_BANANOS = (PRECIO_BANANO * CANTIDAD_DE_BANANOS);
        
        System.out.println( "El subtotal de las manzanas es:" + SUBTOTAL_MANZANAS);
        System.out.println( "El subtotal de los bananos es:"+ SUBTOTAL_BANANOS);
        

        final double TOTAL_DE_COMPRA;

        TOTAL_DE_COMPRA = (SUBTOTAL_MANZANAS + SUBTOTAL_BANANOS);

        System.out.println("El total de la compra es:" + TOTAL_DE_COMPRA);

        final double DESCUENTO, COMPRA_FINAL;

        DESCUENTO = (TOTAL_DE_COMPRA * 0.10);
        COMPRA_FINAL = (TOTAL_DE_COMPRA - DESCUENTO);

        System.out.println("Su 10% de descuento es:" + DESCUENTO);
        System.out.println("Gracias por comprar en nuestro Fruver, su compra final es:" + COMPRA_FINAL);
    }
}