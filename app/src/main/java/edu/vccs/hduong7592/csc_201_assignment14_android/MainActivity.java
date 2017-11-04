package edu.vccs.hduong7592.csc_201_assignment14_android;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

/**
 * Create by hieuduong on 11/3/17
 *
 * CSC 201 - Assignment 14
 * Problem 14.3:
 *
 * (Display three cards) Write a program that displays three cards randomly
 * selected from a deck of 52, as shown in Figure 14.43c. The card image files
 * are named 1.png, 2.png, …, 52.png and stored in the image/card directory.
 * All three cards are distinct and selected randomly. Hint: You can select random
 * cards by storing the numbers 1–52 to an array list, perform a random shuffle
 * introduced in Section 11.12, and use the first three numbers in the array list as
 * the file names for the image.
 */


public class MainActivity extends AppCompatActivity {

    Button shuffleBtn;
    ImageView card1, card2, card3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shuffleBtn = (Button) findViewById(R.id.shuffleBtn);
        card1 = (ImageView) findViewById(R.id.card1);
        card2 = (ImageView) findViewById(R.id.card2);
        card3 = (ImageView) findViewById(R.id.card3);

        SetCards();

        shuffleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetCards();

            }
        });
    }

    /**
     * Set cards method
     */

    private void SetCards() {
        try {
            card1.setImageDrawable(RenderCard());
            card2.setImageDrawable(RenderCard());
            card3.setImageDrawable(RenderCard());
        }
        catch (Exception ex){
            showSimpleDialog(ex.toString(),"Error");
        }
    }

    /**
     * Render card from url
     * @return
     */
    private Drawable RenderCard(){
        String resourceId = ImageUrl(GetRandom()); // where myResourceName is the name of your resource file, minus the file extension
        int imageResource = getResources().getIdentifier(resourceId, null, getPackageName());
        Drawable drawable = ContextCompat.getDrawable(this, imageResource);
        return drawable;
    }

    /**
     * Get random index number
     * @return
     */
    private int GetRandom(){
        int random;
        random = ((int)(Math.random()*51)) + 1;
        return random;
    }

    /**
     * Return the card url that points to the image of the card base on the index from 0 to 51
     * @param index
     * @return
     */
    private String ImageUrl(int index){
        String imageUrl = "images/red_joker";

        switch (index){
            case 0:
                imageUrl = "@drawable/ace_of_clubs";
                break;
            case 1:
                imageUrl = "@drawable/ace_of_diamonds";
                break;
            case 2:
                imageUrl = "@drawable/ace_of_hearts";
                break;
            case 3:
                imageUrl = "@drawable/ace_of_spades";
                break;
            case 4:
                imageUrl = "@drawable/a2_of_clubs";
                break;
            case 5:
                imageUrl = "@drawable/a2_of_diamonds";
                break;
            case 6:
                imageUrl = "@drawable/a2_of_hearts";
                break;
            case 7:
                imageUrl = "@drawable/a2_of_spades";
                break;
            case 8:
                imageUrl = "@drawable/a3_of_clubs";
                break;
            case 9:
                imageUrl = "@drawable/a3_of_diamonds";
                break;
            case 10:
                imageUrl = "@drawable/a3_of_hearts";
                break;
            case 11:
                imageUrl = "@drawable/a3_of_spades";
                break;
            case 12:
                imageUrl = "@drawable/a4_of_clubs";
                break;
            case 13:
                imageUrl = "@drawable/a4_of_diamonds";
                break;
            case 14:
                imageUrl = "@drawable/a4_of_hearts";
                break;
            case 15:
                imageUrl = "@drawable/a4_of_spades";
                break;
            case 16:
                imageUrl = "@drawable/a5_of_clubs";
                break;
            case 17:
                imageUrl = "@drawable/a5_of_diamonds";
                break;
            case 18:
                imageUrl = "@drawable/a5_of_hearts";
                break;
            case 19:
                imageUrl = "@drawable/a5_of_spades";
                break;
            case 20:
                imageUrl = "@drawable/a6_of_clubs";
                break;
            case 21:
                imageUrl = "@drawable/a6_of_diamonds";
                break;
            case 22:
                imageUrl = "@drawable/a6_of_hearts";
                break;
            case 23:
                imageUrl = "@drawable/a6_of_spades";
                break;
            case 24:
                imageUrl = "@drawable/a7_of_clubs";
                break;
            case 25:
                imageUrl = "@drawable/a7_of_diamonds";
                break;
            case 26:
                imageUrl = "@drawable/a7_of_hearts";
                break;
            case 27:
                imageUrl = "@drawable/a7_of_spades";
                break;
            case 28:
                imageUrl = "@drawable/a8_of_clubs";
                break;
            case 29:
                imageUrl = "@drawable/a8_of_diamonds";
                break;
            case 30:
                imageUrl = "@drawable/a8_of_hearts";
                break;
            case 31:
                imageUrl = "@drawable/a8_of_spades";
                break;
            case 32:
                imageUrl = "@drawable/a9_of_clubs";
                break;
            case 33:
                imageUrl = "@drawable/a9_of_diamonds";
                break;
            case 34:
                imageUrl = "@drawable/a9_of_hearts";
                break;
            case 35:
                imageUrl = "@drawable/a9_of_spades";
                break;
            case 36:
                imageUrl = "@drawable/a10_of_clubs";
                break;
            case 37:
                imageUrl = "@drawable/a10_of_diamonds";
                break;
            case 38:
                imageUrl = "@drawable/a10_of_hearts";
                break;
            case 39:
                imageUrl = "@drawable/a10_of_spades";
                break;
            case 40:
                imageUrl = "@drawable/jack_of_clubs";
                break;
            case 41:
                imageUrl = "@drawable/jack_of_diamonds";
                break;
            case 42:
                imageUrl = "@drawable/jack_of_hearts";
                break;
            case 43:
                imageUrl = "@drawable/jack_of_spades";
                break;
            case 44:
                imageUrl = "@drawable/queen_of_clubs";
                break;
            case 45:
                imageUrl = "@drawable/queen_of_diamonds";
                break;
            case 46:
                imageUrl = "@drawable/queen_of_hearts";
                break;
            case 47:
                imageUrl = "@drawable/queen_of_spades";
                break;
            case 48:
                imageUrl = "@drawable/king_of_clubs";
                break;
            case 49:
                imageUrl = "@drawable/king_of_diamonds";
                break;
            case 50:
                imageUrl = "@drawable/king_of_hearts";
                break;
            case 51:
                imageUrl = "@drawable/king_of_spades";
                break;
            default:
                imageUrl = "images/red_joker";
                break;
        }
        return  imageUrl;
    }

    /**
     * Alert box
     * @param Message
     */

    public void showSimpleDialog(String Message, String Title) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setCancelable(false);
        builder.setTitle(Title);
        builder.setMessage(Message);
        builder.setPositiveButton("Got it!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.create().show();
    }
}
