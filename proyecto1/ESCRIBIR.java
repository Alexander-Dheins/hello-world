
package proyecto1;


import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ESCRIBIR{
    public static void main(String[] args) throws IOException {
        
 
        int a=1;
        while(a < 10){
        String directorio;
        System.out.println("---------------BIENVENIDO----------------\n ---------------USUARIO----------------");
        System.out.println("Crear directorio: ");
        Scanner new_dir1 = new Scanner(System.in);
        directorio = new_dir1.nextLine();
        
        System.out.println("/============================================/");
        
        String carpeta;
        System.out.println("Crear carpeta: ");
        Scanner new_dir2 = new Scanner(System.in);
        carpeta = new_dir2.nextLine();
        
        System.out.println("/============================================/");
        
        String documento;
        System.out.println("Crear documento: ");
        Scanner new_dir3 = new Scanner(System.in);
        documento = new_dir3.nextLine();
        
        System.out.println("/============================================/");
               
        String File_alex;
        File_alex = (directorio+":/"+carpeta);
        File carpeta_1 = new File (File_alex);
        
        if (!carpeta_1.exists()) {
            if (carpeta_1.mkdirs()){
                String J4;
                System.out.print("Ingrese contenido: ");
                Scanner new_lan = new Scanner(System.in);
                J4 = new_lan.nextLine();
                
                String Lex;
                Lex = (directorio + ":/" +carpeta+ "/" + documento + ".txt");
                System.out.println("El directorio que Creo: "+ Lex);

                FileWriter newCarpeta = new FileWriter(Lex);
                newCarpeta.write(J4);   
                newCarpeta.close();
                
                System.out.println("Directorio ya creado");
                break;
            } else {
                System.out.println("Directorio no creado");
                }
        } else {
            System.out.println("Carpeta ya existe vuelva a ingresar...");
            }
        a+=1;
        }
        
        
    }  
}
       
           
            
            


