public class Operator{

    public static void main(String[] args){
        int num1 = 50;
        int num2 = 10;

        String msg1 = "Text";
        String msg2 = "Text";

        int sum = num1 + num2;
        int sum1 = num1 - num2;
        int sum2 = num1 * num2;
        int sum3 = num1 / num2;

        System.out.println("----Example Operator----\nNum1 + Num2 = " + sum);
        System.out.println("Num1 - Num2 = " + sum1);
        System.out.println("Num1 * Num2 = " + sum2);
        System.out.println("Num1 / Num2 = " + sum3 + "\n");

        String message = "Hello Pawin";
        System.out.println(message + sum + "\n\n");

        System.out.println("----Condition----");
        System.out.println("If & Else\n Define Value \n num1 = 50 \n num2 = 10\n");
        System.out.println("num1 > num2\n");
        if(num1 > num2){
            System.out.println("Result True");
        }
        else{
            System.out.println("Result False");
        }


        System.out.println("----Question?----\nnum1 == 10 --> True Or False");
        if(num1 == 10){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        System.out.println("\n----Check Compare Text----");
        if(msg1.equals(msg2)){
            System.out.println("Msg1 == Msg2");
        }
        else{
            System.out.println("Msg1 != Msg2");
        }
    }

}