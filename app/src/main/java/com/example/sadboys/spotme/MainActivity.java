package com.example.sadboys.spotme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.andtinder.view.CardContainer;
import com.andtinder.model.CardModel;
import com.andtinder.model.Orientations.Orientation;
import android.util.Log;
import android.content.res.Resources;
import com.andtinder.view.SimpleCardStackAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardContainer mCardContainer = (CardContainer) findViewById(R.id.layoutview);
        mCardContainer.setOrientation(Orientation.Disordered);
        SimpleCardStackAdapter adapter = new SimpleCardStackAdapter(this);

        Resources r = getResources();

        CardModel card = new CardModel("same", "Description goes here", r.getDrawable(R.drawable.picture1));
        CardModel card2 = new CardModel("same2", "Description goes here", r.getDrawable(R.drawable.picture1));

        adapter.add(card);
        adapter.add(card2);

        mCardContainer.setAdapter(adapter);

    }
}
