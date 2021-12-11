public class Countstringoccurences {
    public static void main(String[] args) {
        String actual = "Mumbai is the capital of Maharastra";
        String actual2 = actual.toLowerCase();
        System.out.println(actual2);
        char[] currentval = actual2.toCharArray();
        for (char ch = 'a'; ch <= 'z'; ch++)
        {
            int count=0;
            for (int i=0;i<actual2.length()-1;i++)
            {
                if(ch==currentval[i])
                {
                    count ++;
                }
            }
            if(count >=1)
            {
                System.out.println("No of"+" "+ ch + " "+ "'s are" +" " +count);
            }

        }

    }
}

