package assignment_package;
/**
 * @author Josh
 */
public class Driver {

    public static void main(String[] args) {

        Algorithm algorithm = new Algorithm();

        int[] list = {1, 2, 32, 90, 1, 32, 40, 120, 53, 12};

        System.out.println( algorithm.getLargest(list, list.length) );

    }

}
