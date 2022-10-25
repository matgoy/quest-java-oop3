public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }



    @Override
    public void takeOff(){
        System.out.println("son envol");
    }

    @Override
    public int ascend(int meters){

            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.printf("%s ascend upward, alt : %d%n", this.getName(), this.altitude);

        return this.altitude;
    }
    @Override
    public int descend(int meters){

            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s descend downward, alt : %d%n", this.getName(), this.altitude);

        return this.altitude;
    }
    @Override
    public void land(){
        System.out.println("france");
    }

}
