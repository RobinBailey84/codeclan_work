import java.util.ArrayList;

public class Runner {



    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);
        myNumbers.add(5);

        Algorithm algorithm = new Algorithm(myNumbers);

//        Boolean result = algorithm.linearSearch(7);

        Boolean result = algorithm.binarySearch(2);
    }
}
