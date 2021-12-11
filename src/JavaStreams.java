import java.util.ArrayList;

public class JavaStreams {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Abhijith");
        names.add("Manoj");
        names.add("Abhi");
        names.add("Adarsh");
        int count=0;
        for (int i=0;i< names.size();i++)
        {
            String actual= names.get(i);
            if(actual.startsWith("M"))
            {
                count++;
            }
        }
        System.out.println(count);
    }

}
