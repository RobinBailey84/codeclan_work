public class Planet {

    private String name;
    private int size;

    public Planet(String name, int size){
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return this.name;
    }

    public int getSize(){
        return this.size;
    }

    public String explode(){
        return "Boom! " + name + " has exploded!";
    }

    public String nameSize(){
        return name + " is " + size;
    }

}

