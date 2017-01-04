package rtc.patcharee.unchittha.crosswordgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private MyConstant myConstant;
    private Button word1Button, word2Button;
    private TextView wordTextView;
    private int timesAnInt = 0; // หมายถึงข้อ
    private String[][] wordStrings; // Content ของคำใบ้

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

    }

    private void setUp() {

        myConstant = new MyConstant();
        wordStrings = myConstant.getWordStrings();
        wordTextView.setText(wordStrings[timesAnInt][0]);

    }

    private void bindWidget() {

        word1Button = (Button) findViewById(R.id.button);
        word2Button = (Button) findViewById(R.id.button2);
        wordTextView = (TextView) findViewById(R.id.textView4);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button:
                wordTextView.setText(wordStrings[timesAnInt][0]);
                break;
            case R.id.button2:
                wordTextView.setText(wordStrings[timesAnInt][1]);
                break;

        }   // switch

    }   // onClick

}   // Main Class
