package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class Exercise_03 {

    public static void main(String[] args) {

        // write your code below
        int add = 2 + 2;
        int sub = 2 - add;
        int mul = add * sub;
        int div = mul / add;
        int mod = (add + div)  % 3;

        System.out.println(mod);


    }

}
