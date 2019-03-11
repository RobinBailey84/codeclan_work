import java.util.ArrayList;

public class Algorithm {

    private ArrayList<Integer> numbers;

    public Algorithm(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public boolean linearSearch(int searchNumber){
        for (int number : this.numbers){
            if(number == searchNumber){
                return true;
            }
        }
       return false;
    }

    public boolean binarySearch(int searchNumber){
        // [1, 2, 3, 4, 5]
        // find mid point of the array
        // if it's our number return true
        // if it's bigger/smaller repeat with first/second half of the array

        if(this.numbers.size() == 0){
            return false;
        }

        int mid_index = 0;
        if (this.numbers.size() > 1){
            mid_index = (int) Math.ceil(this.numbers.size() /2);
        }

        int mid_number = this.numbers.get(mid_index);

        if (searchNumber == mid_number){
            return true;
        }


        if (searchNumber < mid_number){
            this.numbers = new ArrayList<Integer>(this.numbers.subList(0, mid_index -1));
        } else {
            this.numbers = new ArrayList<Integer>(this.numbers.subList(mid_index +1, this.numbers.size()));
        }

        return binarySearch(searchNumber);

    }
}
