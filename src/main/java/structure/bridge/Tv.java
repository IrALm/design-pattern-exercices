package structure.bridge;

public class Tv extends Device {

    public Tv() {
        super(30);
    }

    @Override
    public String getName() {
        return "TV";
    }
}
