package Java_standard;

import java.util.Date;
import java.util.Random;

public class ArrFunct_launcher extends ArrFunct {

    protected static int size = 10;
    public static void main(String[] args) {
        
        int list[] = new int[size];

        Random rn = new Random();
        Date d = new Date();

        rn.setSeed(d.getTime());
        
        for(int i = 0; i<size; i++){
            list[i] = rn.nextInt(100);
        }

        
        System.out.println("Original list: " + strList(list));

        int copyList[] = copyArr(list);

        System.out.println("Copied list: " + strList(copyList));

        if (IsOrdered(copyList)) {
            System.out.println("The list is already ordered.");
        } else {
            System.out.println("The list is unordered");
            OrderArr(copyList);
            System.out.println("Ordered list: " + strList(copyList));
        }
    }

    private static String strList(int[] list)  {
        String s = "[";
        for (int i = 0; i<list.length; i++) {
            s += list[i];
            if (i==(list.length-1)) break;
            s += ", ";
        }
        s += "]";
        return s;
    };


        
}
