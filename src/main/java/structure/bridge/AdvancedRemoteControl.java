package structure.bridge;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("[Télécommande Advanced] Mute de " + device.getName() + ".");
        device.setVolume(0);
    }
}
