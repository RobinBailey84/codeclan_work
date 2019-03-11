public class Radio extends Component {

    public Radio(String make, String model){
        super(make, model);
    }

    public String tuneRadio(String station){
        return "Playing " + station;
    }
}
