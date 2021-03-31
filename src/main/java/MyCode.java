import java.util.Arrays;
import java.util.List;

class MyCode {

    public static void main (String[] args) {
        List<Object> data = Arrays.asList("A", "B", Arrays.asList("D", Arrays.asList("E", "F")), "C");
      //  System.out.println(data);
        MyCode myCode = new MyCode();
        myCode.recursStr(data, 1);

        printArray(data, 1);


    }

    public  void recursStr (List<Object> list, int i){
        for (Object o: list) {
            if (o.getClass().equals(String.class)){
                printSym(i);
                System.out.println(o);
            } else {
                recursStr((List<Object>) o, ++i);
                i--;
            }
        }
    }
    public static void  printSym(int i){
        for (int j = 0; j < i; j++) {
            System.out.print("-");
        }
    }

    private static void printArray(List<Object> list, int count) {
        for (Object o : list) {
            if (o instanceof List) {
                count += 1;
                printArray((List)o, count);
                count -= 1;
            } else {
                for (int i = 0; i < count; i++) {
                    System.out.print("-");
                }
                System.out.println(o);
            }

        }
    }
}