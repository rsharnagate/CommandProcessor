package gRPCServiceImpl;

import in.statelogic.grpc.CmdResponse;
import in.statelogic.grpc.GenericCmdRequest;
import in.statelogic.grpc.GenericCommandServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;

public class GenericCmdServiceImpl extends GenericCommandServiceGrpc.GenericCommandServiceImplBase {
    @Override
    public void postCommand(GenericCmdRequest request, StreamObserver<CmdResponse> responseObserver) {
        try {

        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }
}
