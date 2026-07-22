package structure.bridge;

public abstract class Device {

    private boolean enabled;
    private int volume;

    protected Device(int volumeInitial) {
        this.volume = volumeInitial;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void enable() {
        enabled = true;
        System.out.println("[" + getName() + "] Allumé(e).");
    }

    public void disable() {
        enabled = false;
        System.out.println("[" + getName() + "] Éteint(e).");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = Math.max(0, Math.min(100, volume));
        System.out.println("[" + getName() + "] Volume réglé à " + this.volume + ".");
    }

    public abstract String getName();
}
