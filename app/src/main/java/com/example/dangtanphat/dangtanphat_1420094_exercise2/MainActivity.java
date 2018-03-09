package com.example.dangtanphat.dangtanphat_1420094_exercise2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnChangeTitle;
    private Button btnBtnChangeBackGround;
    private TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChangeTitle = (Button) findViewById(R.id.btnChangeTitle);
        btnBtnChangeBackGround = (Button) findViewById(R.id.btnChangeBackground);
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        btnChangeTitle.setOnClickListener(onClickListenerChangeTitle);
        setData();
    }
    protected void setData(){
        Intent i = getIntent();
        String text = i.getStringExtra("TEXT");
        int color = i.getIntExtra("COLOR", 0);
        if (text == null && color == 0){
            text = "KHTN-DTV";
            color = getResources().getColor(R.color.pink);
        }
        tvDisplay.setText(text);
        tvDisplay.setTextColor(color);
    }

    private View.OnClickListener onClickListenerChangeTitle = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, SettingActivity.class);
            i.putExtra("TEXT1", tvDisplay.getText().toString());
            i.putExtra("COLOR1", tvDisplay.getCurrentTextColor());
            startActivity(i);
        }
    };
}
