package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class Exercise_04 {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        // write your code below

        if (a < b){
            System.out.println("a is less than b");
        }

        if(a <= b) {
            System.out.println("a is less or equal than b");
        }

        if (b > a) {
            System.out.println("b is greater than a");
        }

        if (b >= a) {
            System.out.println("b is greater or equal than a");
        }

        if (6 == 6) {
            System.out.println("They are equal");
        }

    }

}

