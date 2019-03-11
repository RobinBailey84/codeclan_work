import java.util.*;

public class Network {
    private String name;
    private ArrayList<Desktop> devicesDesktop;
    private ArrayList<Printer> devicesPrinters;

    public Network(String name){
        this.devicesPrinters = new ArrayList<Printer>();
        this.devicesDesktop = new ArrayList<Desktop>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devicesDesktop.size() + devicesPrinters.size();
    }

    public void connect(Desktop desktop){
        devicesDesktop.add(desktop);
    }

    public void connect(Printer printer){

        devicesPrinters.add(printer);
    }

    public void disconnectAll(){
        devicesDesktop.clear();
    }
}