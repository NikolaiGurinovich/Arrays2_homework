import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task1
      /*String [] array = new String []{"a", "c", "a", "b", "c"};
      HashMap <String, Boolean> hashMap = new HashMap();
      for (int i = 0; i < array.length; i++){
          if (hashMap.containsKey(array[i])){
              hashMap.put(array[i], true );
          } else {
              hashMap.put(array[i], false);
          }
      }
        System.out.println(hashMap);*/

        //Task2
        /*String [] array = new String []{"car", "bike", "plane"};
        HashMap <Character, Character> hashMap = new HashMap();
        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i].toCharArray()[0],
                    array[i].toCharArray()[array[i].toCharArray().length -1]);
        }
        System.out.println(hashMap);*/

        //Task*
        String line = new Scanner(System.in).nextLine();
        Boolean result = true;
        while (!line.isEmpty() && result){
            if (line.contains("()")){
                line = line.replace("()", "");
            } else if (line.contains("[]")) {
                line = line.replace("[]", "");
            } else if (line.contains("{}")) {
                line = line.replace("{}", "");
            } else {
                result = false;
            }
        }
        System.out.println(result);
    }
}