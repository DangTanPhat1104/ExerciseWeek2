package com.example.dangtanphat.dangtanphat_1420094_exercise2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SettingActivity extends AppCompatActivity {
    private Button btnSave;
    private View viewSample;
    private EditText edtTitle;
    private ImageView ivOne;
    private ImageView ivTwo;
    private ImageView ivThree;
    private ImageView ivFour;
    private ImageView ivFive;
    private ImageView ivSix;
    private int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        setup();
        setData();
    }
    protected void setData() {
        Intent i = getIntent();
        String title = i.getStringExtra("TEXT1");
        int color = i.getIntExtra("COLOR1", 0);
        edtTitle.setText(title);
        viewSample.setBackgroundColor(color);
    }

    private void setup(){
        btnSave = (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(onClickListenerSave);

        ivOne = (ImageView) findViewById(R.id.iv1);
        ivOne.setOnClickListener(onClickListenerIvOne);
        ivTwo = (ImageView) findViewById(R.id.iv2);
        ivTwo.setOnClickListener(onClickListenerIvTwo);
        ivThree = (ImageView) findViewById(R.id.iv3);
        ivThree.setOnClickListener(onClickListenerIvThree);
        ivFour = (ImageView) findViewById(R.id.iv4);
        ivFour.setOnClickListener(onClickListenerIvFour);
        ivFive = (ImageView) findViewById(R.id.iv5);
        ivFive.setOnClickListener(onClickListenerIvFive);
        ivSix = (ImageView) findViewById(R.id.iv6);
        ivSix.setOnClickListener(onClickListenerIvSix);

        edtTitle = (EditText) findViewById(R.id.edt);

        viewSample = (View) findViewById(R.id.viewSample);
    }
    private View.OnClickListener onClickListenerSave = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(SettingActivity.this, MainActivity.class);
            i.putExtra("TEXT", edtTitle.getText().toString());
            i.putExtra("COLOR", getResources().getColor(color));
            startActivity(i);
        }
    };

    private View.OnClickListener onClickListenerIvOne = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            viewSample.setBackgroundColor(getResources().getColor(R.color.pink));
            color = R.color.pink;
        }
    };

    private View.OnClickListener onClickListenerIvTwo = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            viewSample.setBackgroundColor(getResources().getColor(R.color.purple));
            color = R.color.purple;
        }
    };

    private View.OnClickListener onClickListenerIvThree = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            viewSample.setBackgroundColor(getResources().getColor(R.color.indigo));
            color = R.color.indigo;
        }
    };

    private View.OnClickListener onClickListenerIvFour = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            viewSample.setBackgroundColor(getResources().getColor(R.color.blue));
            color = R.color.blue;
        }
    };

    private View.OnClickListener onClickListenerIvFive = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            viewSample.setBackgroundColor(getResources().getColor(R.color.teal));
            color = R.color.teal;
        }
    };

    private View.OnClickListener onClickListenerIvSix = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            viewSample.setBackgroundColor(getResources().getColor(R.color.green));
            color = R.color.green;
        }
    };
}
