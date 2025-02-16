package src;

// import utils.Helper;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    // public static void main(String[] args) {
    //     System.out.println("🚀 Projeto Java Puro!");
    //     Helper.showMessage();
    // }
    public static void main(String[] args) {
        int port = 12345; // Porta de conexão

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("🚀 Servidor iniciado na porta " + port);
            
            while (true) {
                Socket socket = serverSocket.accept(); // Aguarda conexão
                System.out.println("🔗 Cliente conectado: " + socket.getInetAddress());

                // Enviar uma mensagem para o cliente
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                out.println("Olá, cliente!");

                socket.close(); // Fecha a conexão após o envio
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
