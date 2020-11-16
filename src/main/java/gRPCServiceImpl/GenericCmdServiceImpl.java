package gRPCServiceImpl;

import in.statelogic.grpc.CmdResponse;
import in.statelogic.grpc.GenericCmdRequest;
import in.statelogic.grpc.GenericCommandServiceGrpc;
import io.grpc.stub.StreamObserver;

public class GenericCmdServiceImpl extends GenericCommandServiceGrpc.GenericCommandServiceImplBase {
    @Override
    public void postCommand(GenericCmdRequest request, StreamObserver<CmdResponse> responseObserver) {
        try {

        } catch (Exception ex) {

        }
    }
}
