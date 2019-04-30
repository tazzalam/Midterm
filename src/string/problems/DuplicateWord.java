package string.problems;


public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String words[] = st.split(" ");
        FindDuplicates(words);
        FindAvgWordLenght(words);

    }
    public static void FindDuplicates(String[] words) {
        String string = "";
        int count;


        string = string.toLowerCase();


        System.out.println("Duplicate words in a given string : ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;

                    words[j] = "0";
                }
            }


            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
    public static void FindAvgWordLenght(String[] words){




        int count = 0;
        double sum = 0;
        double average = 0;


        for(int i = 0; i< words.length; i++) {

            String userInput = words[i];

            double charNum = userInput.length();
            sum = charNum + sum;
            count++;

            if (count > 0) {
                average = sum / count;
            }




        }
        System.out.println("Average word length = " + average);

    }

}
