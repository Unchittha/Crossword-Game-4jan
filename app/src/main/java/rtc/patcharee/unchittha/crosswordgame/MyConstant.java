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
        vocapStrings[0][0] = "cave";
        vocapStrings[1][0] = "bear";
        vocapStrings[2][0] = "goat";
        vocapStrings[3][0] = "kiwi";
        vocapStrings[0][1] = "lake";
        vocapStrings[1][1] = "deer";
        vocapStrings[2][1] = "cock";
        vocapStrings[3][1] = "lime";

        return vocapStrings;
    }

    public String[][] getWordStrings() {

        wordStrings = new String[4][2];
        wordStrings[0][0] = "ถ้ำ";
        wordStrings[1][0] = "หมี";
        wordStrings[2][0] = "แพะ";
        wordStrings[3][0] = "กีวี่";
        wordStrings[0][1] = "ทะเลสาบ";
        wordStrings[1][1] = "กวาง";
        wordStrings[2][1] = "ไก่ตัวผู้";
        wordStrings[3][1] = "มะนาว";

        return wordStrings;
    }
}   // Main Class
