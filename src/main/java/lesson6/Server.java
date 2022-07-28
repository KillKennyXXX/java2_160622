package lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static final int SERVER_PORT = 8186;
    private static DataInputStream in;
    private static DataOutputStream out;
    private static Socket clientSocket;

    public static void main(String[] args) {

        try(ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
            while (true) {
                System.out.println("Ожидание подключения...");
                clientSocket = serverSocket.accept();
                System.out.println("Подключение установлено!");

                in = new DataInputStream(clientSocket.getInputStream());
                out = new DataOutputStream(clientSocket.getOutputStream());

                try {
                    while (true) {
                        String message = in.readUTF();

                        if (message.equals("/stop")) {
                            System.out.println("Сервер остановлен");
                            System.exit(0);
                        }

                        System.out.println("Клиент: " + message);
                        out.writeUTF(message.toUpperCase());

                        System.out.println();

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        clientSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
