public class CDPlayer extends Component {

    private int cdsHeld;

    public CDPlayer(String make, String model, int cdsHeld ){
        super(make, model);
        this.cdsHeld = cdsHeld;
    }

    public int getCdsHeld() {
        return this.cdsHeld;
    }

    public String play(){
        return "CD Playing";
    }
}
