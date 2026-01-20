package com.jayanidukaushalya.bucketlist;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_things_to_do);

        RecyclerView recyclerView = findViewById(R.id.layout_things_to_do);

        ViewCompat.setOnApplyWindowInsetsListener(recyclerView, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        BucketItem[] thingsToDo = {
                new BucketItem("Hiking", "Explore mountain trails and scenic landscapes", R.drawable.hiking),
                new BucketItem("Surfing", "Ride waves along Sri Lanka’s southern coast", R.drawable.surfing),
                new BucketItem("Whale Watching", "See blue whales and dolphins in the ocean", R.drawable.whale_watching),
                new BucketItem("Safari", "Experience wildlife up close in national parks", R.drawable.safari),
                new BucketItem("Photography", "Capture landscapes, wildlife, and culture", R.drawable.photography),
                new BucketItem("Scuba Diving", "Explore coral reefs and marine life", R.drawable.scuba_diving),
                new BucketItem("Train Ride", "Enjoy one of the world’s most scenic train journeys", R.drawable.train_ride),
                new BucketItem("Camping", "Stay overnight in nature under the stars", R.drawable.camping)
        };

        BucketItemAdapter adapter = new BucketItemAdapter(thingsToDo);
        int spacing = getResources().getDimensionPixelSize(R.dimen.item_spacing);
        recyclerView.addItemDecoration(new BucketItemDecoration(spacing));
        recyclerView.setAdapter(adapter);
    }
}