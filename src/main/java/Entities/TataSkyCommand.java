package Entities;

public class TataSkyCommand extends CommandBase {

    /**
     * Create new TataSky command which will execute once without command parameters.
     * @param deviceId The unique device id
     * @param hexCommands The device's hex command
     */
    public TataSkyCommand(String deviceId, int[] hexCommands) {
        this.Device_Id = deviceId;
        this.HexCommands = hexCommands;
        this.Parameters = null;
    }

    /**
     * Create new generic command which will execute once.
     * @param deviceId The unique device id
     * @param hexCommands The device's hex command
     * @param parameters The command parameters
     */
    public TataSkyCommand(String deviceId, int[] hexCommands, String[] parameters) {
        this.Device_Id = deviceId;
        this.HexCommands = hexCommands;
        this.Parameters = parameters;
    }

    public int[] HexCommands;

    private int _delay = 500;
    public void setDelay(int delay) {
        _delay = delay;
    }
    public int getDelay() {
        return _delay;
    }
}
