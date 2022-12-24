package dumpFile_Challenge;


public class PalindromSentence_Optimize {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        //String s = "race a car";
        //String s = " ";
        //String s = "a.";
        //String s = ".,";
        //String s = ".a";
        //String s = "madam";
        //String s = ",,,,,,,,,,,,acva";
        char[] arrayString = s.toLowerCase().toCharArray();
        int secondPointer = arrayString.length - 1;
        int middleIndex = arrayString.length / 2;

        boolean res = true;

        for(int i = 0 ;i < secondPointer ; i++)
        {
            if(arrayString.length == 1)
            {
                break;
            }
            while(!Character.isLetterOrDigit(arrayString[i]))
            {
                i++;
                if(i > arrayString.length - 1)
                {
                    i--;
                    break;
                }
            }
            while(!Character.isLetterOrDigit(arrayString[secondPointer]))
            {
                secondPointer--;
                if(secondPointer < 0)
                {
                    secondPointer++;
                    break;
                }
            }

            if(arrayString[i] != arrayString[secondPointer] && Character.isLetterOrDigit(arrayString[i]) && Character.isLetterOrDigit(arrayString[secondPointer]) )
            {
                res = false;
                break;
            }
            secondPointer--;
        }

        System.out.println(res);
    }
}
