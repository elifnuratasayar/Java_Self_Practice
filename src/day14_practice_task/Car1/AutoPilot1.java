package day14_practice_task.Car1;

public  interface AutoPilot1 extends Autopark1 {
    boolean hasAutoPilot= true;

    public abstract void selfDrive();
    @Override
    void autoPark();

}
