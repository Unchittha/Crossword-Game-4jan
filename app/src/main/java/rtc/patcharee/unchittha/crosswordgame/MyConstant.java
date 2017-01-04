package rtc.patcharee.unchittha.crosswordgame;

/**
 * Created by masterUNG on 1/4/2017 AD.
 */

public class MyConstant {

    //Explicit
    private String[][] wordStrings;
    private String[][] vocapStrings;

    public String[][] getVocapStrings() {

        vocapStrings = new String[4][2];
        vocapStrings[0][0] = "1234";
        vocapStrings[1][0] = "2222";
        vocapStrings[2][0] = "3333";
        vocapStrings[3][0] = "4444";
        vocapStrings[0][1] = "3210";
        vocapStrings[1][1] = "3233";
        vocapStrings[2][1] = "4344";
        vocapStrings[3][1] = "5455";

        return vocapStrings;
    }

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
