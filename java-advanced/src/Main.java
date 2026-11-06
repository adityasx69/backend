import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();

        arr.add("1");
        arr.add("1");
        arr.add("1");
        arr.add("1");
        arr.add("1");

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        Map<String,Integer> marks = new HashMap<>();
        marks.put("rahul",100);
        marks.put("simmy",200);

        for(Map.Entry<String,Integer> entry : marks.entrySet()){
            System.out.print(entry.getKey() + " - ");
            System.out.println(entry.getValue());
            System.out.println("------------");
        }

        // System.out.println(marks.get("rohit")>20);

        Optional<Integer> marksOfRohit = Optional.ofNullable(marks.get("rohit"));
        if(marksOfRohit.isPresent()){

        }else{
            System.out.println("I am not present");
        }
    }
}
