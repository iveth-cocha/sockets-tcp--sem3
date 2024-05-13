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

            // esperar aceptar conexion para da cliente
            Socket socketCliente = socketServidor.accept();

            // ************************************H-I-L-O***********************************************
            //CREAR BUFFER DE ENTRADA Y SALIDA   
                                                            //la nueva clase de lectura(a quien leo como servidor)
            BufferedReader buferEntrada = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
            PrintWriter salida = new PrintWriter(socketCliente.getOutputStream(), true);

            //leer datos almacenados en enterada, SON DATOS RECIVIDOS POR EL CLIENTE
            String datosRecividos = buferEntrada.readLine();
            System.out.println("el mensaje recivo es: "+ datosRecividos);

            //Escribir datos a enviar en salida
            String mensajeEnviar = "Hola soy servidor";
            salida.println(mensajeEnviar);
            

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}