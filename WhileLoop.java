public class WhileLoop{
    public static void main(String[] aStrings){
        int n = 10;
        int a = 0;
        System.out.println("Aspect 1 So -->");
        while(n < 20){
            System.out.println("Num = " + n);
            n++;
        }

        System.out.println("Aspect 2 So -->");
        while(true){
            System.out.println("Num = " + a);
            if(a == 11){
                System.out.println("Num = " + a);
                break;
            }
            a++;
        }
    }
}