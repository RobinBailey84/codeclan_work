public class Sheep extends FarmAnimal {

    private String noise;

    public Sheep(String species, String noise){
        super(species);
        this.noise = noise;
    }

    public String makeANoise(){
        return this.noise;
    }

    public String introduceYourself(){
        return super.introduceYourself() + getSpecies() + " " + makeANoise();
    }
}
