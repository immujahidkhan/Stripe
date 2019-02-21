package com.madeinpk.stripe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.stripe.android.model.Card;
import com.stripe.android.view.CardInputWidget;

public class MainActivity extends AppCompatActivity {
    CardInputWidget mCardInputWidget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCardInputWidget = (CardInputWidget) findViewById(R.id.card_input_widget);
        Card cardToSave = mCardInputWidget.getCard();
        if (cardToSave == null) {
            //mErrorDialogHandler.showError("Invalid Card Data");
            Toast.makeText(this, "Invalid Card Data", Toast.LENGTH_SHORT).show();
        }
    }
}