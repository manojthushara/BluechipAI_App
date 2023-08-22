package com.example.bluechipai_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Home_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        MaterialButton findbtn = findViewById(R.id.findbtn);
        TextView link = findViewById(R.id.link);
        TextView linkemail = findViewById(R.id.linkemail);
        LinearLayout data = findViewById(R.id.databatn);
        LinearLayout video = findViewById(R.id.videobtn);
        LinearLayout image = findViewById(R.id.image);
        LinearLayout cloud = findViewById(R.id.cloud);
        LinearLayout business = findViewById(R.id.business);
        TextView call = findViewById(R.id.call);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1234567890"));
                startActivity(intent);
            }
        });

        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, Business_Page.class));
            }
        });

        cloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, Cloud_Page.class));
            }
        });

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, Image_Page.class));
            }
        });


        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, Video_Page.class));
            }
        });

        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, Data_Page.class));
            }
        });

        link.setMovementMethod(LinkMovementMethod.getInstance());
        linkemail.setMovementMethod(LinkMovementMethod.getInstance());

        findbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, About_Page.class));
            }
        });
    }
}