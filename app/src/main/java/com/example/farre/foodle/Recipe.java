package com.example.farre.foodle;

/**
 * Created by User on 09/11/2016.
 */

public class Recipe
{
    public String Calories;
    public String Category;
    public String Directions;
    public Integer IDNumber;
    public String Img;
    public String Ingredients;
    public String Name;
    public String Rating;

    public Recipe()
    {
        //default constructor
    }

    public Recipe(String Name, String Ingredients, String Directions, String Calories, String Category)
    {
        this.Name = Name;
        this.Ingredients = Ingredients;
        this.Directions = Directions;
        this.Calories = Calories;
        this.Category = Category;
        //this.IDNumber=IDNumber;
        //this.Img =Img;
        //this.Rating = Rating;
    }

    public Integer getIDNumber()
    {
        return this.IDNumber;
    }

    public String getName()
    {
        return this.Name;
    }

    public String getImg()
    {
        return this.Img;
    }

    public String getCategory()
    {
        return this.Category;
    }

    public String getDirections()
    {
        return this.Directions;
    }

    public String getIngredients()
    {
        return this.Ingredients;
    }

    public String getRating()
    {
        return this.Rating;
    }
}