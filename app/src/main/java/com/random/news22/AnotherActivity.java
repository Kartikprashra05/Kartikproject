package com.random.news22;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AnotherActivity extends AppCompatActivity {
    TextView mTitletv, mDestv;
    ImageView mImagetv;
    String Title, description;
    int image;
    Toolbar back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        back = findViewById(R.id.toolbar);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });


        /*  ActionBar actionBar = getSupportActionBar();*/

        mTitletv = (TextView) findViewById(R.id.Titletvdetail);
        mDestv = (TextView) findViewById(R.id.destvdetail);
        mImagetv = (ImageView) findViewById(R.id.imageViewtvdetail);
        Title = getIntent().getStringExtra("Title");
        description = getIntent().getStringExtra("des");
        image = getIntent().getIntExtra("Image", 0);
        mTitletv.setText(Title);
        mDestv.setText(description);
        mImagetv.setImageResource(image);

        mDestv.setMovementMethod(new ScrollingMovementMethod());










       /* Intent intent = getIntent();

        String mTitle = intent.getStringExtra("iTitle");
        String mDes = intent.getStringExtra("iDes");


        byte[] mByte = getIntent().getByteArrayExtra("iImage");

        Bitmap bitmap = BitmapFactory.decodeByteArray(mByte, 0,mByte.length);
        actionBar.setTitle(mTitle);
*/

      /* mTitletv.setText(mTitle);
       mDestv.setText(mDes);
       mImagetv.setImageBitmap(bitmap);
*/


    }




    }




