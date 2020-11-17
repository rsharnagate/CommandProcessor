import gRPCServiceImpl.GenericCmdServiceImpl;
import gRPCServiceImpl.TataSkyCmdServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final int PORT = 51000;
    private static Server _server;

    public static void main(String[] args) throws IOException, InterruptedException {
        final Main mainClass = new Main();
        mainClass.start();
        mainClass.blockUntilShutdown();
    }

    private void start() throws IOException {
        _server = ServerBuilder.forPort(PORT)
                .addService(new GenericCmdServiceImpl())
                .addService(new TataSkyCmdServiceImpl())
                .build()
                .start();
        System.out.println(String.format("gRPC message broker service listening on port %d", PORT));
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("gRPC message broker service terminating...");
            try {
                stop();
            } catch (InterruptedException ex) {
                ex.printStackTrace(System.err);
            }
            System.out.println("gRPC message broker service terminated...");
        }));
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (_server != null) {
            _server.awaitTermination();
        }
    }

    private void stop() throws InterruptedException {
        if (_server != null) {
            _server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }
}
