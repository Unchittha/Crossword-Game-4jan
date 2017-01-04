package rtc.patcharee.unchittha.crosswordgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private MyConstant myConstant;
    private Button word1Button, word2Button, answerButton;
    private TextView wordTextView;
    private int timesAnInt = 0; // หมายถึงข้อ
    private String[][] wordStrings; // Content ของคำใบ้
    private String[][] vocapStrings;    // โจทย์
    private EditText[] editTexts = new EditText[7];
    private String[] strings = new String[7];
    private String answer1String = null, answer2String = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        //Bind Widget
        bindWidget();

        setUp();

        buttonController();

    }   // Main Method

    private void buttonController() {

        word1Button.setOnClickListener(this);
        word2Button.setOnClickListener(this);
        answerButton.setOnClickListener(this);

    }

    private void setUp() {

        myConstant = new MyConstant();
        wordStrings = myConstant.getWordStrings();
        wordTextView.setText(wordStrings[timesAnInt][0]);
        vocapStrings = myConstant.getVocapStrings();

    }

    private void bindWidget() {

        word1Button = (Button) findViewById(R.id.button);
        word2Button = (Button) findViewById(R.id.button2);
        wordTextView = (TextView) findViewById(R.id.textView4);
        answerButton = (Button) findViewById(R.id.button3);

        int[] idInts = new int[]{R.id.editText, R.id.editText2, R.id.editText3, R.id.editText4,
                R.id.editText5, R.id.editText6, R.id.editText7};
        for (int i = 0; i < editTexts.length; i++) {
            editTexts[i] = (EditText) findViewById(idInts[i]);
        }   // for

    }   //bind Widget

    @Override
    public void onClick(View view) {

        String tag = "4janV1";

        switch (view.getId()) {

            case R.id.button:
                wordTextView.setText(wordStrings[timesAnInt][0]);
                break;
            case R.id.button2:
                wordTextView.setText(wordStrings[timesAnInt][1]);
                break;
            case R.id.button3:

                for (int i = 0; i < strings.length; i++) {
                    strings[i] = editTexts[i].getText().toString().trim();

                }   //for

                answer1String = strings[0] + strings[2] + strings[5] + strings[6];
                answer2String = strings[1] + strings[2] + strings[3] + strings[4];

                Log.d(tag, "answer1 ==> " + answer1String);
                Log.d(tag, "answer2 ==> " + answer2String);


                break;
        }   // switch

    }   // onClick

}   // Main Class
