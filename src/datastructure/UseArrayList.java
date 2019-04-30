package datastructure;
import java.util.ArrayList;
public class UseArrayList {


    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Tajme");
        arrayList.add("John");
        arrayList.add("tom");
        //System.out.println(arrayList);

        arrayList.remove("John");
       // System.out.println(arrayList);

        for(String str:arrayList)
           // System.out.println(str);


            System.out.println("First name of the ArrayList: "+ arrayList.get(0));


    }




}
