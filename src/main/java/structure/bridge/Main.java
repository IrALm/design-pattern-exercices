package structure.bridge;

public class Main {

    public static void main(String[] args) {
        Device tv = new Tv();
        RemoteControl telecommandeBasique = new RemoteControl(tv);

        telecommandeBasique.togglePower();
        telecommandeBasique.volumeUp();
        telecommandeBasique.volumeUp();
        telecommandeBasique.volumeDown();

        System.out.println();

        Device radio = new Radio();
        AdvancedRemoteControl telecommandeAvancee = new AdvancedRemoteControl(radio);

        telecommandeAvancee.togglePower();
        telecommandeAvancee.volumeUp();
        telecommandeAvancee.mute();
    }
}
