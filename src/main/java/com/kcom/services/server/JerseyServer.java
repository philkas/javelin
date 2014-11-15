package com.kcom.services.server;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.net.httpserver.HttpServer;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;

/**
 * Created by pika on 03.11.14.
 */
public class JerseyServer {
    public static void startServer() throws IOException {
        HttpServer server = createHttpServer();
        server.start();
    }

    private static HttpServer createHttpServer() throws IOException {
        ResourceConfig resourceConfig = new PackagesResourceConfig("service");
        return HttpServerFactory.create(getServerURI(), resourceConfig);
    }

    private static URI getServerURI() {
        return UriBuilder.fromUri("http://" + getServerHostName() + "/").port(8085).build();
    }

    private static String getServerHostName() {
        String hostname = "localhost";
        try {
            hostname = InetAddress.getLocalHost().getCanonicalHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return hostname;
    }
}
