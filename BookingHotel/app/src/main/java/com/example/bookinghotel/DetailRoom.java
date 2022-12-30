package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class DetailRoom extends AppCompatActivity {
    ViewFlipper viewFlipper;
    TextView _70;
    ImageView _51;
    Button _72;

    public void findViewById() {
        _70 = findViewById(R.id._70);
        _51 = findViewById(R.id._51);
        _72 = findViewById(R.id._72);
        viewFlipper = findViewById(R.id._17);
    }

    public void setOnClickListener() {
        _70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailRoom.this, Policies.class);
                startActivity(i);
            }
        });
        _51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailRoom.this, Review.class);
                startActivity(i);
            }
        });
        _72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailRoom.this, RoomHistory.class);
                startActivity(i);
            }
        });
    }

    public void others() {
    }

    private void ActionViewFlipper() {
        List<String> mangquangcao = new ArrayList<>();
        mangquangcao.add("https://i.pinimg.com/originals/b1/62/8e/b1628edd3f876fbfa5aa808b6676e381.jpg");
        mangquangcao.add("https://i.pinimg.com/originals/a2/29/55/a2295520e545c581f122c9bd5b0a77db.jpg");
        mangquangcao.add("https://i.pinimg.com/originals/b1/62/8e/b1628edd3f876fbfa5aa808b6676e381.jpg");
        for (int i = 0; i < mangquangcao.size(); i++) {
            ImageView imageView = new ImageView(getApplicationContext());
            Glide.with(getApplicationContext()).load(mangquangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);

        Animation slide_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim._1_slide_left_to_center);
        Animation slide_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim._1_slide_center_to_right);
        viewFlipper.setInAnimation(slide_in);
        viewFlipper.setOutAnimation(slide_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_room);
        findViewById();
        setOnClickListener();
        others();
        ActionViewFlipper();
    }
}