import java.util.ArrayList;

public class NumberList {
    private ArrayList<Integer> numbers;

    public NumberList(ArrayList<Integer> numbers){
        this.numbers = numbers;
    }

    public int numberLength() {
        return this.numbers.size();
    }

    public void add(int number) {
        this.numbers.add(number);
    }

    public int getNumberAtIndex(int index) {
        return this.numbers.get(index);
    }

//    this is the classic for loop:
//    public int total() {
//        int result = 0;
//        for(int i = 0; i < numberLength(); i++){
//            result += getNumberAtIndex(i);
//        }
//        return result;
//    }

//    this is a newer(enhanced) for loop - try to use this loop:
    public int total(){
        int result = 0;
        for(int number : this.numbers){
            result += number;
        }
        return result;
    }
}
