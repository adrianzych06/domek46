package com.example.domekwgorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int ileLajkow = 0;
    private TextView licznik;
    private Button like, dislike, save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         like = findViewById(R.id.like);
         dislike = findViewById(R.id.dislike);
         save = findViewById(R.id.save);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ileLajkow++;
                licznik.setText(licznik + " polubień");
            }
        });

       dislike.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (ileLajkow>0) {
                   ileLajkow--;
                   licznik.setText(licznik + " polubień");
               }
           }
       }); 

       save.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           }
       });


    }
}
