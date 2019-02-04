package com.example.akshay.currency;

import android.view.View;
import android.widget.ImageView;

/**
 * Created by akshay on 3/2/19.
 */

public class Game {

    public void game(ImageView tap){
        tap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                //tap.setVisibility(View.VISIBLE);
            }
        });
    }
}
