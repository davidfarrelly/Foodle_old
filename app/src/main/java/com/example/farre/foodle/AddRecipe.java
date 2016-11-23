package com.example.farre.foodle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddRecipe extends AppCompatActivity implements View.OnClickListener{

    private EditText editTextName;
    private EditText editTextIngredients;
    private Button buttonAddRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextIngredients = (EditText) findViewById(R.id.editTextIngredients);
        buttonAddRecipe = (Button) findViewById(R.id.buttonAddRecipe);

        buttonAddRecipe.setOnClickListener(this);
    }

    /*private void AddRecipe() {
        String Name = editTextName.getText().toString().trim();
        String Ingredients = editTextIngredients.getText().toString().trim();

        Recipe recipe = new Recipe();

    }*/

    @Override
    public void onClick(View v) {

    }
}
