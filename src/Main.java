public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        int x=5;
        System.out.println("the number is:"+x);
        int y= 6;
        System.out.println(String.format("the second num is:")+y);
        int z= 10;
        System.out.println("rgj"+z);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        int y2=foo();
        System.out.println(y2);
        int xx = 3;
    }
    public static int foo(){
        return 4;
    }
}
