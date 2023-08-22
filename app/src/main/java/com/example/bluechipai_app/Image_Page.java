package com.example.bluechipai_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Image_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_page);

        LinearLayout backtohome = findViewById(R.id.backhomebtn);
        TextView link = findViewById(R.id.link);
        TextView linkemail = findViewById(R.id.linkemail);
        MaterialButton backhome = findViewById(R.id.homebtn);

        backhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Image_Page.this, Home_Page.class));
            }
        });

        link.setMovementMethod(LinkMovementMethod.getInstance());
        linkemail.setMovementMethod(LinkMovementMethod.getInstance());

        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Image_Page.this, Home_Page.class));
            }
        });
    }
}