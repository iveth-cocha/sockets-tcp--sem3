import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class servidor {

    public static void main(String[] args) {
        
        
        
        try {
            // crear socket para cliente y servidor Y UN PUERTO
            ServerSocket socketServidor = new ServerSocket(5000);
            System.out.println("Experando conexiones.....");

            while (true) {
                // esperar aceptar conexion para da cliente
                Socket socketCliente = socketServidor.accept();
                hiloCliente hilo = new hiloCliente(socketCliente);
                hilo.start();

                
    
                
            }

            
           
          
            

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}