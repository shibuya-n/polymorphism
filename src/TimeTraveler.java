public class TimeTraveler {
    String name;
    int timePeriod;

    public TimeTraveler(String name, int timePeriod){
        this.name = name;
        this.timePeriod = timePeriod;
    }

    public void attributes(){
        System.out.println("Time Traveler's name: " + this.name);
        System.out.println("Time Traveler's time period: " + this.timePeriod);
    }
}
