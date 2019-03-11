public class Horse extends FarmAnimal {

    private String noise;
    private String breed;

    public Horse(String species, String noise, String breed){
        super(species);
        this.noise = noise;
        this.breed = breed;
    }

    public String makeANoise(){
        return this.noise;
    }

    public String introduceYourself(){
        return super.introduceYourself() + getSpecies() + " from " + getBreed() + " " + makeANoise();
    }

    public String getBreed() {
        return this.breed;
    }
}
