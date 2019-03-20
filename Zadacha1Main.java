
public class Zadacha1Main {
    public static void main(String[] args) {
        int k = 2;
        byte i = -128;
        float l = 3.4f;
        short j = 32767;
        long e = 1234567789;
        double f = 123.456;
        char g = 'e';
        boolean h = true;
        System.out.println(calculate(-3, 5, 7, 8));
        System.out.println(task10and20(12, 34));
        isPositiveOrNegative(-35);
        isNegative(45);
        greetings("Ирина");
    }
    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    public static boolean task10and20(int x1, int x2) {
          if ((x1+x2>=10)&&(x1+x2<=20)) {
              return true;}
              else
                  {return false;}

    }
    public static void isPositiveOrNegative(int x) {
        if(x>=0) {
            System.out.println("Число положительное!");
        } else {
            System.out.println("Число отрицательное!");
        }
    }
    public static boolean isNegative(int x) {
        if(x<0) {
            return true;
        }
        return false;
    }
    public static void greetings(String name) {
        System.out.println("Привет, "+name);
    }


}

