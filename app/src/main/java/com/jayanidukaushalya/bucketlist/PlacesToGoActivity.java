package com.jayanidukaushalya.bucketlist;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_places_to_go);

        RecyclerView recyclerView = findViewById(R.id.layout_places_to_go);

        ViewCompat.setOnApplyWindowInsetsListener(recyclerView, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        BucketItem[] placesToGo = {
                new BucketItem("Sigiriya", "Ancient rock fortress and UNESCO World Heritage site", R.drawable.sigiriya),
                new BucketItem("Ella", "Hill country town with scenic views and hiking trails", R.drawable.ella),
                new BucketItem("Galle Fort", "Historic fort built by the Portuguese and Dutch", R.drawable.galle_fort),
                new BucketItem("Nuwara Eliya", "Cool climate city known as Little England", R.drawable.nuwaraeliya),
                new BucketItem("Kandy", "Cultural capital home to the Temple of the Tooth", R.drawable.kandy),
                new BucketItem("Mirissa", "Beach destination famous for whale watching", R.drawable.mirissa),
                new BucketItem("Yala National Park", "Wildlife safari park with leopards and elephants", R.drawable.yala),
                new BucketItem("Trincomalee", "Natural harbor with pristine beaches", R.drawable.trincomalee_jpg),
                new BucketItem("Adam’s Peak", "Sacred mountain with breathtaking sunrise views", R.drawable.adams_peak),
                new BucketItem("Polonnaruwa", "Ancient city with well-preserved ruins", R.drawable.polonnaruwa)
        };

        BucketItemAdapter adapter = new BucketItemAdapter(placesToGo);
        int spacing = getResources().getDimensionPixelSize(R.dimen.item_spacing);
        recyclerView.addItemDecoration(new BucketItemDecoration(spacing));
        recyclerView.setAdapter(adapter);
    }
}