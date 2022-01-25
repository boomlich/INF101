import java.util.HashSet;

public class FireProtectionSystem {
    HashSet<Sensor> sensors = new HashSet<>();
    HashSet<Alarm> alarms = new HashSet<>();


    public void installSensor(Sensor... mySensors) {
        for (Sensor sensor: mySensors) {
            this.sensors.add(sensor);
            sensor.installSystem(this);
        }
    }

    public void installAlarm(Alarm myAlarm) {
        this.alarms.add(myAlarm);
    }

    public void smokeDetected() {
        for (Alarm alarm: alarms) {
            alarm.setActive(true);
        }
    }

    public void stoppedDetectingSmoke() {
        if (allSensorsAreOff()){
            for (Alarm alarm: alarms) {
                alarm.setActive(false);
            }
        }
    }

    private boolean allSensorsAreOff() {
        for (Sensor sensor: this.sensors) {
            if (sensor.smokeDetected) {
                return false;
            }
        }
        return true;
    }
}
