package structure.bridge;

public class Radio extends Device {

    public Radio() {
        super(20);
    }

    @Override
    public String getName() {
        return "Radio";
    }
}
