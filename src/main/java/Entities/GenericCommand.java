package Entities;

public class GenericCommand extends CommandBase {

    /**
     * Create new generic command which will execute once without command parameters.
     * @param deviceId The unique device id
     * @param command The device command
     */
    public GenericCommand(String deviceId, String command) {
        this.Device_Id = deviceId;
        this.Command = command;
        this.Parameters = null;
    }

    /**
     * Create new generic command which will execute once.
     * @param deviceId The unique device id
     * @param command The device command
     * @param parameters The command parameters
     */
    public GenericCommand(String deviceId, String command, String[] parameters) {
        this.Device_Id = deviceId;
        this.Command = command;
        this.Parameters = parameters;
    }

    public String Command;
}