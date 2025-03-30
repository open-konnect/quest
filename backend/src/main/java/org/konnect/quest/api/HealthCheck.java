package org.konnect.quest.api;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;

public class HealthCheck {

    public static void handleHealthCheck(HttpExchange exchange) {
        try {
            byte[] response = new String("Hey I am healthy!!!").getBytes();
            exchange.sendResponseHeaders(200, response.length);
            exchange.getResponseBody().write(response);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        exchange.close();
    }
}
