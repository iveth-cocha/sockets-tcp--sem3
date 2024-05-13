import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class cliente {
    public static void main(String[] args) {

        try {
          
            //creo socket  y pongo la ip del cliennte
         Socket socketCliente = new Socket("localhost", 5000);
         System.out.println("cliente conectado");
         while (true) {
            // ************************************H-I-L-O***********************************************
            //CREAR BUFFER DE ENTRADA  
            //la nueva clase de lectura()
            BufferedReader buferEntrada = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
            PrintWriter salida = new PrintWriter(socketCliente.getOutputStream(), true);
                                                
            //Escribir datos a enviar en salida
            String mensajeEnviar = "Hol soy el cliente";
            salida.println(mensajeEnviar);
                                                
            //leer datos almacenados en enterada, SON DATOS RECIVIDOS POR EL CLIENTE
            String datosRecividos = buferEntrada.readLine();
            System.out.println("el mensaje recivo es: "+ datosRecividos);
            
         }

            

            
            
        } catch (Exception e) {
           
            e.printStackTrace();
        }
        
    }
    
}
