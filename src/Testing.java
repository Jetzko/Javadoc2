/**
 * This class set variables for operations and executes them, by Andrea
 */
public class Testing {
    /**
     * This is main method
     * @param args
     */
    public static void main(String[] args) {
        Operators operators = new Operators();
       int sum = operators.sum(3,7);
       int sub = operators.sub(12, 9);
       int mol = operators.mol(8,4);
       int div = operators.div(20,5);
       System.out.println(sum);
       System.out.println(sub);
       System.out.println(mol);
       System.out.println(div);
    }
}
