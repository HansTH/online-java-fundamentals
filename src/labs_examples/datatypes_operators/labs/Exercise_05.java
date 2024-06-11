package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class Exercise_05 {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;

        // write your code below
        if (a | b){
            System.out.println("a or b is true");
        }

        if (a && a){
            System.out.println("a or b is true");
        }

        if (b || a){
            System.out.println("a or b is true");
        }

        if (b != a){
            System.out.println("a or b is true");
        }

    }

}

