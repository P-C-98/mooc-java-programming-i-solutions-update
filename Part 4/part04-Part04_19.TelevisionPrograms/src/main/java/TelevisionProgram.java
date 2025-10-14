public class TelevisionProgram {
 
    private String name;
    private int duration;
    private int maximumDuration;
 
    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.maximumDuration = maximumDuration;
    }
 
    public boolean isAwesome() {
        return this.name.contains("MasterChef");
    }
 
    public String getName() {
        return name;
    }
 
    public int getDuration() {
        return duration;
    }
    
    public int getMaximumDuration() {
        return maximumDuration;
    }
    
 
    @Override
    public String toString() {
        return this.name + ", " + this.duration + " minutes" + maximumDuration + "minutes";
    }
}