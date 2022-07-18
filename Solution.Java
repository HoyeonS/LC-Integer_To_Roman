class Solution {
    public String intToRoman(int num) {
        String result = "";
        int Ms = num/1000;
        for (int i = 0; i < Ms; i++)
        {
            result += 'M';
        }
        int Cs = num /100 % 10;
        if(Cs == 9)
            result += "CM";
        else if(Cs == 4)
            result += "CD";
        else
        {
            if(Cs >= 5)
            {
                result += 'D';
                for (int i = 0; i < Cs - 5; i++)
                    result += 'C';
            }
            else
            {
            for (int i = 0; i < Cs; i++)
                    result += 'C';
            }
        }
        int Xs = num/10 % 10;
        if(Xs == 9)
            result += "XC";
        else if(Xs == 4)
            result += "XL";
        else
        {
            if(Xs >= 5)
            {
                result += 'L';
                for (int i = 0; i < Xs - 5; i++)
                    result += 'X';
            }
            else
            {
            for (int i = 0; i < Xs; i++)
                    result += 'X';
            }
         }
        int Is = num%10;
        if(Is == 9)
            result += "IX";
        else if(Is == 4)
            result += "IV";
        else
        {
            if(Is >= 5)
            {
                result += 'V';
                for (int i = 0; i < Is - 5; i++)
                    result += 'I';
            }
            else
            {
            for (int i = 0; i < Is; i++)
                    result += 'I';
            }
         }
        return result;
        
    }
}