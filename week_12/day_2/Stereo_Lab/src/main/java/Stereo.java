import java.util.ArrayList;

public class Stereo implements IConnect {

    private ArrayList<Component> compenents;
    private String name;

    public Stereo(String name){
        this.compenents = new ArrayList<Component>();
        this.name = name;
    }

    public int countCompenents() {
        return this.compenents.size();
    }

    public String getName() {
        return this.name;
    }

    public void addComponent(Component component){
        this.compenents.add(component);
    }

    public String connect(Stereo stereo){
        return stereo.getName() + " is connected.";
    }

    public String changeVolume(int volume){
        return "Volume: " + volume;
    }
}
