
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Libro Libro1=new Libro();
        
        Scanner Teclado=new Scanner(System.in);
        
        System.out.println("Escriba el titulo del libro : ");
        String titulo= Teclado.next();
        Libro1.settitulo(titulo);
        
        System.out.println("Escriba el primer nombre del autor : ");
        String pnombre= Teclado.next();
        Libro1.setpnombre(pnombre);
        
        System.out.println("Escriba el segundo nombre del autor : ");
        String snombre= Teclado.next();
        Libro1.setsnombre(snombre);
        
        System.out.println("Escriba el primer apellido del autor : ");
        String papellido= Teclado.next();
        Libro1.setpapellido(papellido);
        
        System.out.println("Escriba el ISBN : ");
        String ISBN= Teclado.next();
        Libro1.setISBN(ISBN);
        
        System.out.println("Escriba el numero de paginas que tiene el libro : ");
        String pag= Teclado.next();
        Libro1.setpag(pag);
        
        System.out.println("Escriba la edicion del libro : ");
        String edic= Teclado.next();
        Libro1.setedic(edic);
        
        System.out.println("Escriba la editorial : ");
        String edit= Teclado.next();
        Libro1.setedit(edit);
        
        System.out.println("Escriba la ciudad : ");
        String ciu= Teclado.next();
        Libro1.setciu(ciu);
        
        System.out.println("Escriba el pais : ");
        String pais= Teclado.next();
        Libro1.setpais(pais);
        
        System.out.println("Escriba la fecha de edicion : ");
        String fechaedic= Teclado.next();
        Libro1.setfechaedic(fechaedic);
        
        Libro1.mostrar(Libro1);
       
      
    }
    
    
}
