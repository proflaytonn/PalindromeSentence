package dumpFile_Challenge;

public class PalindromeSentence {
    public static void main(String[] args) {
        //LeetCode = https://leetcode.com/problems/valid-palindrome/description/

        //case : check palindrome, ignore upper/lower, ignore space, ignore special character
        //String text = ",Madam, ,madam, racecar madam .madam,";
        String text = "0P";
        //String text = ",madam.";
        String lowerText = text.toLowerCase();

        char[] textArray = lowerText.toCharArray();
        int lastIndex = textArray.length-1;
        int count = 0 ;
        int encounter = 0 ;

        for(int i = 0; i < textArray.length ; i++)
        {
            //while(textArray[i] == ' ' || textArray[i] == ',' || textArray[i] == '.')
            while(!Character.isLetterOrDigit(textArray[i]))
            {

                i++;
                encounter++;
                if(i == textArray.length)
                {
                    i--;
                    break;
                }
            }

            //while (textArray[lastIndex] == ' ' || textArray[lastIndex] == ',' || textArray[lastIndex] == '.')
            while (!Character.isLetterOrDigit(textArray[lastIndex]))
            {
                    lastIndex--;
                    encounter++;
                    if(lastIndex < 0)
                    {
                        lastIndex++;
                        break;
                    }
                }

            if(textArray[i] == textArray[lastIndex] && Character.isLetterOrDigit(textArray[i]))
            {
                count++;
                lastIndex--;
                if(lastIndex < 0)
                {
                    lastIndex++;
                }
            }
        }

        //misal ada special char/ spasi di first index, dan di last index tidak ada ---> looping berhenti jadi gk imbang nilai encounter
        //if((textArray[0] == ' ' || textArray[0] == ',' || textArray[0] == '.' )&& (textArray[lastIndex] != ' ' || textArray[lastIndex] != ',' || textArray[lastIndex] != '.') )
        if(Character.isLetterOrDigit(textArray[0]) && !Character.isLetterOrDigit(textArray[lastIndex]))
        {
            encounter++;
        }

        System.out.println("total count : " + count);
        System.out.println("total encounter : " + encounter);
        System.out.println("total length : " + textArray.length);

        if(encounter == 1)
        {
            encounter++;
        }

        int comparison = textArray.length - (encounter/2);
        if(count == comparison)
        {
            System.out.println("Palindrome");
        }
        else System.out.println("Not Palindrome");
    }
}
