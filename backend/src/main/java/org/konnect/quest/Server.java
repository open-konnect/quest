package org.konnect.quest;

import com.sun.net.httpserver.HttpServer;
import org.konnect.quest.api.HealthCheck;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class Server {

    private static final int SERVER_PORT = 8080; //Integer.parseInt(System.getenv("SERVER_PORT"));

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(SERVER_PORT), 0);
        server.createContext("/health-check", HealthCheck::handleHealthCheck);
        server.setExecutor(Executors.newFixedThreadPool(10));
        server.start();
    }
}
