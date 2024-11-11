package week_7_Task.service;


import week_7_Task.utils.HttpHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static week_7_Task.common.SimpleHttpServer.PORT;

public class HttpServerServiceImpl implements HttpServerService{
    @Override
    public void start(int port) {
        try(ServerSocket serversocket = new ServerSocket(PORT)){
            System.out.println("Server started on port " + port);

            while (true){
                Socket socket = serversocket.accept();
                System.out.println("New connection established");
                new Thread(new HttpHandler(socket)).start();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

