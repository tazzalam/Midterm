package datastructure;

import databases.ConnectToSqlDB;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();


        Map<Integer, String> list = new HashMap<Integer, String>();
        list.put(1, "Philadelphia");
        list.put(2,"China");
        list.put(3, "Medallin");
        list.put(4, "Havana");
        for(Map.Entry<Integer, String> entry :list.entrySet()) {
           // System.out.println("City is " + entry.getValue());

            connectToSqlDB.insertDataFromStringToSqlTable(entry.getValue(), "cities", "name");
        }
        try {
            connectToSqlDB.readDataBase("cities", "name");
        } catch (Exception e) {}

    }

}
