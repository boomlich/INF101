public class Alarm {
    boolean isActive;

    void setActive(boolean value){
        isActive = value;
        System.out.println("Set alarm to active: " + value);
    }
}
