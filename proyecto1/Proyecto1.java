/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.io.FileWriter;
import java.io.IOException;
    public class Proyecto1 {
    public static void main(String[]args) throws IOException{
FileWriter fichero = new FileWriter ("D:/asd/fichero.txt");
	for (int x=0; x<10; x++){
fichero.write("fila numero" +x + "\n");
}
System.out.println("El archivo fue creado");
fichero.close();
}
}
  
     

        
    
    

