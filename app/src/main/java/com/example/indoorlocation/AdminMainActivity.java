package com.example.indoorlocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main);
    }

    public void onClick(View view) {

        Button button= (Button) view;
        Intent intent;
        switch (button.getId()) {
            case R.id.learn_button:
                intent = new Intent(AdminMainActivity.this, Floors.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}