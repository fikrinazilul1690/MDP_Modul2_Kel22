package com.example.modul2_kel22;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.modul2_kel22.R;

public class DetailActivity extends AppCompatActivity {

    private TextView tvFirstName, tvLastName, tvEmail;
    private ImageView tvAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvFirstName = findViewById(R.id.tv_first_name);
        tvLastName = findViewById(R.id.tv_last_name);
        tvEmail = findViewById(R.id.tv_email);
        tvAvatar = findViewById(R.id.tv_avatar);

        if (getIntent().hasExtra("Firstname")) {

            String FirstName = getIntent().getStringExtra("Firstname");
            tvFirstName.setText(FirstName);
        }
        if (getIntent().hasExtra("Lastname")){
            String LastName = getIntent().getStringExtra("Lastname");
            tvLastName.setText(LastName);
        }
        if (getIntent().hasExtra("Email")){
            String Email = getIntent().getStringExtra("Email");
            tvEmail.setText(Email);
        }
        if (getIntent().hasExtra("Avatar")){
            String Avatar = getIntent().getStringExtra("Avatar");
            Glide.with(this).load(Avatar).into(tvAvatar);
        }
    }

}