package com.smartdroidesign.colorcomplimenter2.ui.ui.model;

import android.content.Intent;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.smartdroidesign.colorcomplimenter2.R;

public class FavouriteColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_color);

        TextView niceComment = findViewById(R.id.niceCommentText);
        ConstraintLayout layout = findViewById(R.id.fav_col_layout);
        Resources resources = getResources();
        Intent intent = getIntent();
        String colorReceived = intent.getStringExtra("color");

        colorSelector(niceComment, layout, resources, colorReceived);
    }


    private void colorSelector(TextView niceComment, ConstraintLayout layout, Resources resources, String colorReceived) {
        if (colorReceived != null) {
            switch (colorReceived) {
                case "pink":
                    layout.setBackgroundColor(resources.getColor(R.color.bright_pink));
                    niceComment.setTextColor(resources.getColor(R.color.white));
                    niceComment.setText(getString(R.string.pink_comment));
                    break;
                case "red":
                    layout.setBackgroundColor(resources.getColor(R.color.red));
                    niceComment.setTextColor(resources.getColor(R.color.white));
                    niceComment.setText(getString(R.string.red_comment));
                    break;
                case "orange":
                    layout.setBackgroundColor(resources.getColor(R.color.orange));
                    niceComment.setTextColor(resources.getColor(R.color.white));
                    niceComment.setText(getString(R.string.orange_comment));
                    break;
                case "yellow":
                    layout.setBackgroundColor(resources.getColor(R.color.yellow));
                    niceComment.setTextColor(resources.getColor(R.color.white));
                    niceComment.setText(getString(R.string.yellow_comment));
                    break;
                case "chartreuse":
                    layout.setBackgroundColor(resources.getColor(R.color.chartreuse));
                    niceComment.setTextColor(resources.getColor(R.color.white));
                    niceComment.setText(getString(R.string.chartreuse_comment));
                    break;
                case "green":
                    layout.setBackgroundColor(resources.getColor(R.color.green));
                    niceComment.setTextColor(resources.getColor(R.color.white));
                    niceComment.setText(getString(R.string.green_comment));
                    break;
                case "spring_green":
                    layout.setBackgroundColor(resources.getColor(R.color.spring_green));
                    niceComment.setTextColor(resources.getColor(R.color.white));
                    niceComment.setText(getString(R.string.spring_green_comment));
                    break;
                case "cyan":
                    layout.setBackgroundColor(resources.getColor(R.color.cyan));
                    niceComment.setTextColor(resources.getColor(R.color.white));
                    niceComment.setText(getString(R.string.cyan_comment));
                    break;
                case "azure":
                    layout.setBackgroundColor(resources.getColor(R.color.azure));
                    niceComment.setTextColor(resources.getColor(R.color.white));
                    niceComment.setText(getString(R.string.azure_comment));
                    break;
                case "blue":
                    layout.setBackgroundColor(resources.getColor(R.color.blue));
                    niceComment.setTextColor(resources.getColor(R.color.white));
                    niceComment.setText(getString(R.string.blue_comment));
                    break;
                case "violet":
                    layout.setBackgroundColor(resources.getColor(R.color.violet));
                    niceComment.setTextColor(resources.getColor(R.color.white));
                    niceComment.setText(getString(R.string.violet_comment));
                    break;
                case "magenta":
                    layout.setBackgroundColor(resources.getColor(R.color.magenta));
                    niceComment.setTextColor(resources.getColor(R.color.white));
                    niceComment.setText(getString(R.string.magenta_comment));
                    break;
                case "white":
                    layout.setBackgroundColor(resources.getColor(R.color.white));
                    niceComment.setTextColor(resources.getColor(R.color.white));
                    niceComment.setText(getString(R.string.white_comment));
                    break;

            }
        }
    }
}
