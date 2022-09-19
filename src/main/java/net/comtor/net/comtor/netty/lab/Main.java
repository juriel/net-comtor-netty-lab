package net.comtor.net.comtor.netty.lab;

/**
 *
 * @author juriel
 */
public class Main {

    public static void main(String args[]) throws InterruptedException {
        
        System.err.println("HOLA");
        EchoServer server = new EchoServer(6000);
        server.start();
    }
}
