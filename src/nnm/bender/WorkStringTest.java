package nnm.bender;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WorkStringTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        Iterator<Integer> integerIterator;

        //region use UNICODE
        /*int a = 0x00D7;
        System.out.println(a);
        int[] mass={0x00D7,0x00D7,0x00D7};
        String s = new String(mass,0,2);
        System.out.println(s);*/
        //endregion

        /*Domino domino = null;
        if (domino==null | domino.getClass()==domino.getClass()){
            System.out.println("1");
        }
        System.out.println("2");*/

        /*String s1 = "as";
        String s2 = "as";
        System.out.println(s1==s2);*/


        /*Set<String> asd = new HashSet<>();

        double[][] array = {{1, 2}, {2, 1}};
        System.out.println(Arrays.deepToString(array));
        int i =0;
        while ((i=i+1)<10);{
            System.out.println(i);
        }*/


    }
    class Domino{
        public boolean toDoSomething(){
            return true;
        }
    }
}
