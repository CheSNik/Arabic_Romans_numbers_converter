public class RomanNumbers {
    /***
     * @param romanNumber - stores roman number as a string
     * @param _arabicNumber - stores users input
     */
    String romanNumber ="";
    int _arabicNumber;
    int thous, hundreds,  tens;
    public RomanNumbers(int arabicNumber) {
        _arabicNumber = arabicNumber;
    }

    /***
     *
     * @return converts arabic number and return roman number as a string
     */
    public String convert(){
        thous=_arabicNumber/1000;
        if(thous > 0 && thous<4){
            _arabicNumber=_arabicNumber%1000;
            for (int i=1; i<=thous; i++)
            romanNumber+="M";
        }
          else thous =0;

        hundreds=_arabicNumber/100;
        switch (hundreds) {
            case 9:  romanNumber += "CM";break;
            case 8:  romanNumber += "DCCC";break;
            case 7:  romanNumber += "DCC";break;
            case 6:  romanNumber += "DC";break;
            case 5:  romanNumber += "D";break;
            case 4:  romanNumber += "CD";break;
            case 3:  romanNumber += "CCC";break;
            case 2:  romanNumber += "CC";break;
            case 1:  romanNumber += "C";break;
        }
        _arabicNumber = _arabicNumber % 100;


        tens=_arabicNumber/10;
        switch (tens) {
            case 9:  romanNumber += "XC";break;
            case 8:  romanNumber += "LXXX";break;
            case 7:  romanNumber += "LXX";break;
            case 6:  romanNumber += "LX";break;
            case 5:  romanNumber += "L";break;
            case 4:  romanNumber += "XL";break;
            case 3:  romanNumber += "XXX";break;
            case 2:  romanNumber += "XX";break;
            case 1:  romanNumber += "X";break;
        }
        _arabicNumber = _arabicNumber % 10;


        switch (_arabicNumber){
            case 1 : romanNumber += "I"; break;
            case 2 : romanNumber += "II"; break;
            case 3 : romanNumber += "III"; break;
            case 4 : romanNumber += "IV"; break;
            case 5 : romanNumber += "V"; break;
            case 6 : romanNumber += "VI"; break;
            case 7 : romanNumber += "VII"; break;
            case 8 : romanNumber += "VIII"; break;
            case 9 : romanNumber += "IX"; break;

        }

        return romanNumber;
    }
}
