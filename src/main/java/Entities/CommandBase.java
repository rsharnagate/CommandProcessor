package Entities;

public class CommandBase {
    /**
     * The unique device id
     */
    public String Device_Id;

    /**
     * Additional command parameters
     */
    public String[] Parameters;

    private int _repeat = 1;
    public void setRepeat(int repeat) {
        _repeat = repeat;
    }
    public int getRepeat() {
        return _repeat;
    }
}
