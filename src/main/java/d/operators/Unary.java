package d.operators;

public class Unary {

    public static void main(String[] args) {
        int i=10;
        boolean j =true;

        System.out.println(i++); //  10  10+1=11  i=11
        System.out.println(++i); //  11  11+1= 12  i=12
        System.out.println(i--); //  12  12-1= 11  i=11
        System.out.println(--i); //  11  11-1=10   i=10
        System.out.println(!j);  //  true
    }
}
