public class Sensor {
    boolean smokeDetected;
    FireProtectionSystem system;

    public void setSmokeDetected(boolean smokeDetected) {
        this.smokeDetected = smokeDetected;
        if (smokeDetected) {
            system.smokeDetected();
        } else {
            system.stoppedDetectingSmoke();
        }
    }

    void installSystem(FireProtectionSystem system) {
        this.system = system;
    }

}
