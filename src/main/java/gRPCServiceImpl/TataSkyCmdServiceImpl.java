package gRPCServiceImpl;

import in.statelogic.grpc.CmdResponse;
import in.statelogic.grpc.TataSkyCmdRequest;
import in.statelogic.grpc.TataSkyCommandServiceGrpc;
import io.grpc.stub.StreamObserver;

public class TataSkyCmdServiceImpl extends TataSkyCommandServiceGrpc.TataSkyCommandServiceImplBase {
    @Override
    public void postCommand(TataSkyCmdRequest request, StreamObserver<CmdResponse> responseObserver) {
        try {

        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }
}
