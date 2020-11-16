import gRPCServiceImpl.GenericCmdServiceImpl;
import gRPCServiceImpl.TataSkyCmdServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Main {
    private static final int PORT = 51000;

    public static void main(String[] args) {
        try {
            Server server = ServerBuilder
                    .forPort(PORT)
                    .addService(new GenericCmdServiceImpl())
                    .addService(new TataSkyCmdServiceImpl())
                    .build();
            server.start();
            System.out.println(String.format("gRPC message broker service listening on port %d", PORT));
            server.awaitTermination();
        } catch (Exception ex) {
            System.err.println(String.format("Fail to start gRPC message broker service on port %d", PORT));
        }
    }
}
