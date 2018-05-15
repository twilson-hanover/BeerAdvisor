package edu.hanover.beeradvisor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    // Call when the button gets clicked
    public void onClickFindBeer(View view) {

        // Get a reference to the TextView
        TextView brands = findViewById(R.id.brands);

        // Get a reference to the Spinner
        Spinner color = findViewById(R.id.color);

        // Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());

        // Display the selected item
        brands.setText(beerType);
    }
}
