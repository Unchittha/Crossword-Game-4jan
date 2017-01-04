package rtc.patcharee.unchittha.crosswordgame;

/**
 * Created by masterUNG on 1/4/2017 AD.
 */

public class MyConstant {

    //Explicit
    private String[][] wordStrings;

    public String[][] getWordStrings() {

        wordStrings = new String[4][2];
        wordStrings[0][0] = "00";
        wordStrings[1][0] = "10";
        wordStrings[2][0] = "20";
        wordStrings[3][0] = "30";
        wordStrings[0][1] = "01";
        wordStrings[1][1] = "11";
        wordStrings[2][1] = "21";
        wordStrings[3][1] = "31";

        return wordStrings;
    }
}   // Main Class
