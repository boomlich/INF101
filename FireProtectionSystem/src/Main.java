public class Main {

    public static void main(String[] args) {
        FireProtectionSystem system = new FireProtectionSystem();

        // Install sensors
        Sensor[] mySensors = new Sensor[4];
        for (int i = 0; i < mySensors.length; i++) {
            mySensors[i] = new Sensor();
        }
        system.installSensor(mySensors);

        // Install alarms
        Alarm myAlarm = new Alarm();
        system.installAlarm(myAlarm);

        // Detect smoke
        mySensors[0].setSmokeDetected(true);
        mySensors[1].setSmokeDetected(true);

        // smoke undetected
        mySensors[0].setSmokeDetected(false);
        mySensors[1].setSmokeDetected(false);


    }

}
