package com.example.farre.foodle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference; //this
import com.google.firebase.database.FirebaseDatabase;


public class SwipeActivity extends AppCompatActivity implements View.OnClickListener {

    private DatabaseReference databaseName;   //this
    private DatabaseReference databaseCalories; //this
    private DatabaseReference databaseIngredients; //this
    private DatabaseReference databaseDirections; //this

    private TextView Name; //this
    private TextView Calories; //this
    private TextView Ingredients; //this
    private TextView Directions; //this
    private ImageButton backButton2; //this

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);

        //final ImageView iv = (ImageView) findViewById(R.id.imageView);   /*HERE*/
        //final String imgURL  = "http://i.imgur.com/a85KE4T.jpg";   /*HERE*/
        //new DownLoadImageTask(iv).execute(imgURL);  /*HERE*/
        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference("message");

        Name = (TextView) findViewById(R.id.Name); //this
        Calories = (TextView) findViewById(R.id.Calories); //this
        Ingredients = (TextView) findViewById(R.id.Ingredients); //this
        Directions = (TextView) findViewById(R.id.Directions); //this
        backButton2 = (ImageButton) findViewById(R.id.backButton2); //this
        backButton2.setOnClickListener(this); //this
    }

    @Override
    public void onClick(View view) {
        if(view == backButton2) { //this
            finish(); //this
            startActivity(new Intent(this, ProfileActivity.class)); //this
        } //this
    }
}
