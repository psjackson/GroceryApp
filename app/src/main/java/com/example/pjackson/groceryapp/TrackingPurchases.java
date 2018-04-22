package com.example.pjackson.groceryapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class TrackingPurchases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking_purchases);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final TextView txtItem1Qty2 = findViewById(R.id.txtItem1Qty2);
        final TextView txtItem2Qty2 = findViewById(R.id.txtItem2Qty2);
        final TextView txtItem3Qty2 = findViewById(R.id.txtItem3Qty2);
        final TextView txtItem4Qty2 = findViewById(R.id.txtItem4Qty2);
        final TextView txtItem5Qty2 = findViewById(R.id.txtItem5Qty2);
        final TextView txtItem6Qty2 = findViewById(R.id.txtItem6Qty2);
        final TextView txtItem7Qty2 = findViewById(R.id.txtItem7Qty2);
        final TextView txtItem8Qty2 = findViewById(R.id.txtItem8Qty2);
        final TextView txtItem9Qty2 = findViewById(R.id.txtItem9Qty2);
        final TextView txtItem10Qty2 = findViewById(R.id.txtItem10Qty2);

        final TextView txtItem1Desc2 = findViewById(R.id.txtItem1Desc2);
        final TextView txtItem2Desc2 = findViewById(R.id.txtItem2Desc2);
        final TextView txtItem3Desc2 = findViewById(R.id.txtItem3Desc2);
        final TextView txtItem4Desc2 = findViewById(R.id.txtItem4Desc2);
        final TextView txtItem5Desc2 = findViewById(R.id.txtItem5Desc2);
        final TextView txtItem6Desc2 = findViewById(R.id.txtItem6Desc2);
        final TextView txtItem7Desc2 = findViewById(R.id.txtItem7Desc2);
        final TextView txtItem8Desc2 = findViewById(R.id.txtItem8Desc2);
        final TextView txtItem9Desc2 = findViewById(R.id.txtItem9Desc2);
        final TextView txtItem10Desc2 = findViewById(R.id.txtItem10Desc2);

        final EditText txtItem1Cost = findViewById(R.id.txtItem1Cost);
        final EditText txtItem2Cost = findViewById(R.id.txtItem2Cost);
        final EditText txtItem3Cost = findViewById(R.id.txtItem3Cost);
        final EditText txtItem4Cost = findViewById(R.id.txtItem4Cost);
        final EditText txtItem5Cost = findViewById(R.id.txtItem5Cost);
        final EditText txtItem6Cost = findViewById(R.id.txtItem6Cost);
        final EditText txtItem7Cost = findViewById(R.id.txtItem7Cost);
        final EditText txtItem8Cost = findViewById(R.id.txtItem8Cost);
        final EditText txtItem9Cost = findViewById(R.id.txtItem9Cost);
        final EditText txtItem10Cost = findViewById(R.id.txtItem10Cost);

        final Switch swtItem1Cost = findViewById(R.id.swtItem1Cost);
        final Switch swtItem2Cost = findViewById(R.id.swtItem2Cost);
        final Switch swtItem3Cost = findViewById(R.id.swtItem3Cost);
        final Switch swtItem4Cost = findViewById(R.id.swtItem4Cost);
        final Switch swtItem5Cost = findViewById(R.id.swtItem5Cost);
        final Switch swtItem6Cost = findViewById(R.id.swtItem6Cost);
        final Switch swtItem7Cost = findViewById(R.id.swtItem7Cost);
        final Switch swtItem8Cost = findViewById(R.id.swtItem8Cost);
        final Switch swtItem9Cost = findViewById(R.id.swtItem9Cost);
        final Switch swtItem10Cost = findViewById(R.id.swtItem10Cost);

        final CheckBox cBoxItem1 = findViewById(R.id.cBoxItem1);
        final CheckBox cBoxItem2 = findViewById(R.id.cBoxItem2);
        final CheckBox cBoxItem3 = findViewById(R.id.cBoxItem3);
        final CheckBox cBoxItem4 = findViewById(R.id.cBoxItem4);
        final CheckBox cBoxItem5 = findViewById(R.id.cBoxItem5);
        final CheckBox cBoxItem6 = findViewById(R.id.cBoxItem6);
        final CheckBox cBoxItem7 = findViewById(R.id.cBoxItem7);
        final CheckBox cBoxItem8 = findViewById(R.id.cBoxItem8);
        final CheckBox cBoxItem9 = findViewById(R.id.cBoxItem9);
        final CheckBox cBoxItem10 = findViewById(R.id.cBoxItem10);

        Button btnPage2Back = findViewById(R.id.btnPage2Back);
        Button btnPage2Next = findViewById(R.id.btnPage2Done);

        Bundle groceries = getIntent().getExtras();
        ArrayList<String> itemList = groceries.getStringArrayList("itemList");
        ArrayList<String> qtyList = groceries.getStringArrayList("QuantityList");

        int itemCount = itemList.size();

        switch(itemCount){
            case 1:
                txtItem1Qty2.setText(qtyList.get(0));
                txtItem1Desc2.setText(itemList.get(0));
                txtItem2Cost.setVisibility(View.GONE);
                swtItem2Cost.setVisibility(View.GONE);
                cBoxItem2.setVisibility(View.GONE);
                txtItem3Cost.setVisibility(View.GONE);
                swtItem3Cost.setVisibility(View.GONE);
                cBoxItem3.setVisibility(View.GONE);
                txtItem4Cost.setVisibility(View.GONE);
                swtItem4Cost.setVisibility(View.GONE);
                cBoxItem4.setVisibility(View.GONE);
                txtItem5Cost.setVisibility(View.GONE);
                swtItem5Cost.setVisibility(View.GONE);
                cBoxItem5.setVisibility(View.GONE);
                txtItem6Cost.setVisibility(View.GONE);
                swtItem6Cost.setVisibility(View.GONE);
                cBoxItem6.setVisibility(View.GONE);
                txtItem7Cost.setVisibility(View.GONE);
                swtItem7Cost.setVisibility(View.GONE);
                cBoxItem7.setVisibility(View.GONE);
                txtItem8Cost.setVisibility(View.GONE);
                swtItem8Cost.setVisibility(View.GONE);
                cBoxItem8.setVisibility(View.GONE);
                txtItem9Cost.setVisibility(View.GONE);
                swtItem9Cost.setVisibility(View.GONE);
                cBoxItem9.setVisibility(View.GONE);
                txtItem10Cost.setVisibility(View.GONE);
                swtItem10Cost.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 2:
                txtItem1Qty2.setText(qtyList.get(0));
                txtItem1Desc2.setText(itemList.get(0));
                txtItem2Qty2.setText(qtyList.get(1));
                txtItem2Desc2.setText(itemList.get(1));
                txtItem3Cost.setVisibility(View.GONE);
                swtItem3Cost.setVisibility(View.GONE);
                cBoxItem3.setVisibility(View.GONE);
                txtItem4Cost.setVisibility(View.GONE);
                swtItem4Cost.setVisibility(View.GONE);
                cBoxItem4.setVisibility(View.GONE);
                txtItem5Cost.setVisibility(View.GONE);
                swtItem5Cost.setVisibility(View.GONE);
                cBoxItem5.setVisibility(View.GONE);
                txtItem6Cost.setVisibility(View.GONE);
                swtItem6Cost.setVisibility(View.GONE);
                cBoxItem6.setVisibility(View.GONE);
                txtItem7Cost.setVisibility(View.GONE);
                swtItem7Cost.setVisibility(View.GONE);
                cBoxItem7.setVisibility(View.GONE);
                txtItem8Cost.setVisibility(View.GONE);
                swtItem8Cost.setVisibility(View.GONE);
                cBoxItem8.setVisibility(View.GONE);
                txtItem9Cost.setVisibility(View.GONE);
                swtItem9Cost.setVisibility(View.GONE);
                cBoxItem9.setVisibility(View.GONE);
                txtItem10Cost.setVisibility(View.GONE);
                swtItem10Cost.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 3:
                txtItem1Qty2.setText(qtyList.get(0));
                txtItem1Desc2.setText(itemList.get(0));
                txtItem2Qty2.setText(qtyList.get(1));
                txtItem2Desc2.setText(itemList.get(1));
                txtItem3Qty2.setText(qtyList.get(2));
                txtItem3Desc2.setText(itemList.get(2));
                txtItem4Cost.setVisibility(View.GONE);
                swtItem4Cost.setVisibility(View.GONE);
                cBoxItem4.setVisibility(View.GONE);
                txtItem5Cost.setVisibility(View.GONE);
                swtItem5Cost.setVisibility(View.GONE);
                cBoxItem5.setVisibility(View.GONE);
                txtItem6Cost.setVisibility(View.GONE);
                swtItem6Cost.setVisibility(View.GONE);
                cBoxItem6.setVisibility(View.GONE);
                txtItem7Cost.setVisibility(View.GONE);
                swtItem7Cost.setVisibility(View.GONE);
                cBoxItem7.setVisibility(View.GONE);
                txtItem8Cost.setVisibility(View.GONE);
                swtItem8Cost.setVisibility(View.GONE);
                cBoxItem8.setVisibility(View.GONE);
                txtItem9Cost.setVisibility(View.GONE);
                swtItem9Cost.setVisibility(View.GONE);
                cBoxItem9.setVisibility(View.GONE);
                txtItem10Cost.setVisibility(View.GONE);
                swtItem10Cost.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 4:
                txtItem1Qty2.setText(qtyList.get(0));
                txtItem1Desc2.setText(itemList.get(0));
                txtItem2Qty2.setText(qtyList.get(1));
                txtItem2Desc2.setText(itemList.get(1));
                txtItem3Qty2.setText(qtyList.get(2));
                txtItem3Desc2.setText(itemList.get(2));
                txtItem4Qty2.setText(qtyList.get(3));
                txtItem4Desc2.setText(itemList.get(3));
                txtItem5Cost.setVisibility(View.GONE);
                swtItem5Cost.setVisibility(View.GONE);
                cBoxItem5.setVisibility(View.GONE);
                txtItem6Cost.setVisibility(View.GONE);
                swtItem6Cost.setVisibility(View.GONE);
                cBoxItem6.setVisibility(View.GONE);
                txtItem7Cost.setVisibility(View.GONE);
                swtItem7Cost.setVisibility(View.GONE);
                cBoxItem7.setVisibility(View.GONE);
                txtItem8Cost.setVisibility(View.GONE);
                swtItem8Cost.setVisibility(View.GONE);
                cBoxItem8.setVisibility(View.GONE);
                txtItem9Cost.setVisibility(View.GONE);
                swtItem9Cost.setVisibility(View.GONE);
                cBoxItem9.setVisibility(View.GONE);
                txtItem10Cost.setVisibility(View.GONE);
                swtItem10Cost.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 5:
                txtItem1Qty2.setText(qtyList.get(0));
                txtItem1Desc2.setText(itemList.get(0));
                txtItem2Qty2.setText(qtyList.get(1));
                txtItem2Desc2.setText(itemList.get(1));
                txtItem3Qty2.setText(qtyList.get(2));
                txtItem3Desc2.setText(itemList.get(2));
                txtItem4Qty2.setText(qtyList.get(3));
                txtItem4Desc2.setText(itemList.get(3));
                txtItem5Qty2.setText(qtyList.get(4));
                txtItem5Desc2.setText(itemList.get(4));
                txtItem6Cost.setVisibility(View.GONE);
                swtItem6Cost.setVisibility(View.GONE);
                cBoxItem6.setVisibility(View.GONE);
                txtItem7Cost.setVisibility(View.GONE);
                swtItem7Cost.setVisibility(View.GONE);
                cBoxItem7.setVisibility(View.GONE);
                txtItem8Cost.setVisibility(View.GONE);
                swtItem8Cost.setVisibility(View.GONE);
                cBoxItem8.setVisibility(View.GONE);
                txtItem9Cost.setVisibility(View.GONE);
                swtItem9Cost.setVisibility(View.GONE);
                cBoxItem9.setVisibility(View.GONE);
                txtItem10Cost.setVisibility(View.GONE);
                swtItem10Cost.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 6:
                txtItem1Qty2.setText(qtyList.get(0));
                txtItem1Desc2.setText(itemList.get(0));
                txtItem2Qty2.setText(qtyList.get(1));
                txtItem2Desc2.setText(itemList.get(1));
                txtItem3Qty2.setText(qtyList.get(2));
                txtItem3Desc2.setText(itemList.get(2));
                txtItem4Qty2.setText(qtyList.get(3));
                txtItem4Desc2.setText(itemList.get(3));
                txtItem5Qty2.setText(qtyList.get(4));
                txtItem5Desc2.setText(itemList.get(4));
                txtItem6Qty2.setText(qtyList.get(5));
                txtItem6Desc2.setText(itemList.get(5));
                txtItem7Cost.setVisibility(View.GONE);
                swtItem7Cost.setVisibility(View.GONE);
                cBoxItem7.setVisibility(View.GONE);
                txtItem8Cost.setVisibility(View.GONE);
                swtItem8Cost.setVisibility(View.GONE);
                cBoxItem8.setVisibility(View.GONE);
                txtItem9Cost.setVisibility(View.GONE);
                swtItem9Cost.setVisibility(View.GONE);
                cBoxItem9.setVisibility(View.GONE);
                txtItem10Cost.setVisibility(View.GONE);
                swtItem10Cost.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 7:
                txtItem1Qty2.setText(qtyList.get(0));
                txtItem1Desc2.setText(itemList.get(0));
                txtItem2Qty2.setText(qtyList.get(1));
                txtItem2Desc2.setText(itemList.get(1));
                txtItem3Qty2.setText(qtyList.get(2));
                txtItem3Desc2.setText(itemList.get(2));
                txtItem4Qty2.setText(qtyList.get(3));
                txtItem4Desc2.setText(itemList.get(3));
                txtItem5Qty2.setText(qtyList.get(4));
                txtItem5Desc2.setText(itemList.get(4));
                txtItem6Qty2.setText(qtyList.get(5));
                txtItem6Desc2.setText(itemList.get(5));
                txtItem7Qty2.setText(qtyList.get(6));
                txtItem7Desc2.setText(itemList.get(6));
                txtItem8Cost.setVisibility(View.GONE);
                swtItem8Cost.setVisibility(View.GONE);
                cBoxItem8.setVisibility(View.GONE);
                txtItem9Cost.setVisibility(View.GONE);
                swtItem9Cost.setVisibility(View.GONE);
                cBoxItem9.setVisibility(View.GONE);
                txtItem10Cost.setVisibility(View.GONE);
                swtItem10Cost.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 8:
                txtItem1Qty2.setText(qtyList.get(0));
                txtItem1Desc2.setText(itemList.get(0));
                txtItem2Qty2.setText(qtyList.get(1));
                txtItem2Desc2.setText(itemList.get(1));
                txtItem3Qty2.setText(qtyList.get(2));
                txtItem3Desc2.setText(itemList.get(2));
                txtItem4Qty2.setText(qtyList.get(3));
                txtItem4Desc2.setText(itemList.get(3));
                txtItem5Qty2.setText(qtyList.get(4));
                txtItem5Desc2.setText(itemList.get(4));
                txtItem6Qty2.setText(qtyList.get(5));
                txtItem6Desc2.setText(itemList.get(5));
                txtItem7Qty2.setText(qtyList.get(6));
                txtItem7Desc2.setText(itemList.get(6));
                txtItem8Qty2.setText(qtyList.get(7));
                txtItem8Desc2.setText(itemList.get(7));
                txtItem9Cost.setVisibility(View.GONE);
                swtItem9Cost.setVisibility(View.GONE);
                cBoxItem9.setVisibility(View.GONE);
                txtItem10Cost.setVisibility(View.GONE);
                swtItem10Cost.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 9:
                txtItem1Qty2.setText(qtyList.get(0));
                txtItem1Desc2.setText(itemList.get(0));
                txtItem2Qty2.setText(qtyList.get(1));
                txtItem2Desc2.setText(itemList.get(1));
                txtItem3Qty2.setText(qtyList.get(2));
                txtItem3Desc2.setText(itemList.get(2));
                txtItem4Qty2.setText(qtyList.get(3));
                txtItem4Desc2.setText(itemList.get(3));
                txtItem5Qty2.setText(qtyList.get(4));
                txtItem5Desc2.setText(itemList.get(4));
                txtItem6Qty2.setText(qtyList.get(5));
                txtItem6Desc2.setText(itemList.get(5));
                txtItem7Qty2.setText(qtyList.get(6));
                txtItem7Desc2.setText(itemList.get(6));
                txtItem8Qty2.setText(qtyList.get(7));
                txtItem8Desc2.setText(itemList.get(7));
                txtItem9Qty2.setText(qtyList.get(8));
                txtItem9Desc2.setText(itemList.get(8));
                txtItem10Cost.setVisibility(View.GONE);
                swtItem10Cost.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 10:
                txtItem1Qty2.setText(qtyList.get(0));
                txtItem1Desc2.setText(itemList.get(0));
                txtItem2Qty2.setText(qtyList.get(1));
                txtItem2Desc2.setText(itemList.get(1));
                txtItem3Qty2.setText(qtyList.get(2));
                txtItem3Desc2.setText(itemList.get(2));
                txtItem4Qty2.setText(qtyList.get(3));
                txtItem4Desc2.setText(itemList.get(3));
                txtItem5Qty2.setText(qtyList.get(4));
                txtItem5Desc2.setText(itemList.get(4));
                txtItem6Qty2.setText(qtyList.get(5));
                txtItem6Desc2.setText(itemList.get(5));
                txtItem7Qty2.setText(qtyList.get(6));
                txtItem7Desc2.setText(itemList.get(6));
                txtItem8Qty2.setText(qtyList.get(7));
                txtItem8Desc2.setText(itemList.get(7));
                txtItem9Qty2.setText(qtyList.get(8));
                txtItem9Desc2.setText(itemList.get(8));
                txtItem10Qty2.setText(qtyList.get(9));
                txtItem10Desc2.setText(itemList.get(9));
                break;
        }

        btnPage2Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page2Back = new Intent(TrackingPurchases.this, MainActivity.class);
                startActivity(page2Back);
            }
        });


    }
}
