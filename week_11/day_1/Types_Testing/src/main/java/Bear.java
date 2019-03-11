public class Bear {

    private String name;
    private int age;
    private double weight;
    private char gender;
    private double height;
    private double bmi;

    public Bear(String name, int age, double weight, char gender, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.height = height;
        this.bmi = bmi;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean readyToHibernate(){
        double bmi = getBMI();
        if(bmi > 30.00){
            return true;
        }
            return false;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getBMI(){
        this.bmi = this.weight / this.height / this.height;
        return bmi;
    }
}
