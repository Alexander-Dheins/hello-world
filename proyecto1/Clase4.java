/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
public class Clase4{
    public static void main(Strings[]args) throws IOException {
     Scanner sc = new Scanner(System.in);
     File carp = new File("D:/");
        Sytem.out.println("Ingrese nombre de carpeta:")           
   
  
if(!carp.exists()){
    if (carp.mkdirs()){

	System.out.println("El archivo fue creado");
    }else{
	System.out.println("No creado");
    
 
  
 }
}

