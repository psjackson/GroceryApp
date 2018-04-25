package com.example.pjackson.groceryapp;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class TrackingPurchases extends AppCompatActivity {
    TextView txtItem1Qty, txtItem2Qty, txtItem3Qty, txtItem4Qty, txtItem5Qty, txtItem6Qty, txtItem7Qty, txtItem8Qty, txtItem9Qty, txtItem10Qty;
    TextView txtItem1Type, txtItem2Type,txtItem3Type, txtItem4Type, txtItem5Type, txtItem6Type, txtItem7Type, txtItem8Type, txtItem9Type, txtItem10Type;
    EditText txtItem1Cost, txtItem2Cost, txtItem3Cost, txtItem4Cost, txtItem5Cost, txtItem6Cost, txtItem7Cost, txtItem8Cost, txtItem9Cost, txtItem10Cost;
    ToggleButton togItem1, togItem2, togItem3, togItem4, togItem5, togItem6, togItem7, togItem8, togItem9, togItem10;
    CheckBox cBoxItem1, cBoxItem2, cBoxItem3, cBoxItem4, cBoxItem5, cBoxItem6, cBoxItem7, cBoxItem8, cBoxItem9, cBoxItem10;
    double item1Total, item2Total, item3Total, item4Total, item5Total, item6Total, item7Total, item8Total, item9Total, item10Total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking_purchases);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        txtItem1Qty = findViewById(R.id.txtPage2Item1Qty);
        txtItem2Qty = findViewById(R.id.txtPage2Item2Qty);
        txtItem3Qty = findViewById(R.id.txtPage2Item3Qty);
        txtItem4Qty = findViewById(R.id.txtPage2Item4Qty);
        txtItem5Qty = findViewById(R.id.txtPage2Item5Qty);
        txtItem6Qty = findViewById(R.id.txtPage2Item6Qty);
        txtItem7Qty = findViewById(R.id.txtPage2Item7Qty);
        txtItem8Qty = findViewById(R.id.txtPage2Item8Qty);
        txtItem9Qty = findViewById(R.id.txtPage2Item9Qty);
        txtItem10Qty = findViewById(R.id.txtPage2Item10Qty);

        txtItem1Type = findViewById(R.id.txtPage2Item1Type);
        txtItem2Type = findViewById(R.id.txtPage2Item2Type);
        txtItem3Type = findViewById(R.id.txtPage2Item3Type);
        txtItem4Type = findViewById(R.id.txtPage2Item4Type);
        txtItem5Type = findViewById(R.id.txtPage2Item5Type);
        txtItem6Type = findViewById(R.id.txtPage2Item6Type);
        txtItem7Type = findViewById(R.id.txtPage2Item7Type);
        txtItem8Type = findViewById(R.id.txtPage2Item8Type);
        txtItem9Type = findViewById(R.id.txtPage2Item9Type);
        txtItem10Type = findViewById(R.id.txtPage2Item10Type);

        txtItem1Cost = findViewById(R.id.txtPage2Item1Cost);
        txtItem2Cost = findViewById(R.id.txtPage2Item2Cost);
        txtItem3Cost = findViewById(R.id.txtPage2Item3Cost);
        txtItem4Cost = findViewById(R.id.txtPage2Item4Cost);
        txtItem5Cost = findViewById(R.id.txtPage2Item5Cost);
        txtItem6Cost = findViewById(R.id.txtPage2Item6Cost);
        txtItem7Cost = findViewById(R.id.txtPage2Item7Cost);
        txtItem8Cost = findViewById(R.id.txtPage2Item8Cost);
        txtItem9Cost = findViewById(R.id.txtPage2Item9Cost);
        txtItem10Cost = findViewById(R.id.txtPage2Item10Cost);

        togItem1 = findViewById(R.id.togPage2Item1);
        togItem2 = findViewById(R.id.togPage2Item2);
        togItem3 = findViewById(R.id.togPage2Item3);
        togItem4 = findViewById(R.id.togPage2Item4);
        togItem5 = findViewById(R.id.togPage2Item5);
        togItem6 = findViewById(R.id.togPage2Item6);
        togItem7 = findViewById(R.id.togPage2Item7);
        togItem8 = findViewById(R.id.togPage2Item8);
        togItem9 = findViewById(R.id.togPage2Item9);
        togItem10 = findViewById(R.id.togPage2Item10);

        cBoxItem1 = findViewById(R.id.cBoxPage2Item1);
        cBoxItem2 = findViewById(R.id.cBoxPage2Item2);
        cBoxItem3 = findViewById(R.id.cBoxPage2Item3);
        cBoxItem4 = findViewById(R.id.cBoxPage2Item4);
        cBoxItem5 = findViewById(R.id.cBoxPage2Item5);
        cBoxItem6 = findViewById(R.id.cBoxPage2Item6);
        cBoxItem7 = findViewById(R.id.cBoxPage2Item7);
        cBoxItem8 = findViewById(R.id.cBoxPage2Item8);
        cBoxItem9 = findViewById(R.id.cBoxPage2Item9);
        cBoxItem10 = findViewById(R.id.cBoxPage2Item10);

        Button btnPage2Back = findViewById(R.id.btnPage2Back);
        Button btnPage2Next = findViewById(R.id.btnPage2Done);

        Bundle groceries = getIntent().getExtras();
        ArrayList<String> itemList = groceries.getStringArrayList("itemList");
        ArrayList<String> qtyList = groceries.getStringArrayList("QuantityList");

        int itemCount = itemList.size();

        switch(itemCount){
            case 1:
                txtItem1Qty.setText(qtyList.get(0));
                txtItem1Type.setText(itemList.get(0));
                txtItem2Cost.setVisibility(View.GONE);
                togItem2.setVisibility(View.GONE);
                cBoxItem2.setVisibility(View.GONE);
                txtItem3Cost.setVisibility(View.GONE);
                togItem3.setVisibility(View.GONE);
                cBoxItem3.setVisibility(View.GONE);
                txtItem4Cost.setVisibility(View.GONE);
                togItem4.setVisibility(View.GONE);
                cBoxItem4.setVisibility(View.GONE);
                txtItem5Cost.setVisibility(View.GONE);
                togItem5.setVisibility(View.GONE);
                cBoxItem5.setVisibility(View.GONE);
                txtItem6Cost.setVisibility(View.GONE);
                togItem6.setVisibility(View.GONE);
                cBoxItem6.setVisibility(View.GONE);
                txtItem7Cost.setVisibility(View.GONE);
                togItem7.setVisibility(View.GONE);
                cBoxItem7.setVisibility(View.GONE);
                txtItem8Cost.setVisibility(View.GONE);
                togItem8.setVisibility(View.GONE);
                cBoxItem8.setVisibility(View.GONE);
                txtItem9Cost.setVisibility(View.GONE);
                togItem9.setVisibility(View.GONE);
                cBoxItem9.setVisibility(View.GONE);
                txtItem10Cost.setVisibility(View.GONE);
                togItem10.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 2:
                txtItem1Qty.setText(qtyList.get(0));
                txtItem1Type.setText(itemList.get(0));
                txtItem2Qty.setText(qtyList.get(1));
                txtItem2Type.setText(itemList.get(1));
                txtItem3Cost.setVisibility(View.GONE);
                togItem3.setVisibility(View.GONE);
                cBoxItem3.setVisibility(View.GONE);
                txtItem4Cost.setVisibility(View.GONE);
                togItem4.setVisibility(View.GONE);
                cBoxItem4.setVisibility(View.GONE);
                txtItem5Cost.setVisibility(View.GONE);
                togItem5.setVisibility(View.GONE);
                cBoxItem5.setVisibility(View.GONE);
                txtItem6Cost.setVisibility(View.GONE);
                togItem6.setVisibility(View.GONE);
                cBoxItem6.setVisibility(View.GONE);
                txtItem7Cost.setVisibility(View.GONE);
                togItem7.setVisibility(View.GONE);
                cBoxItem7.setVisibility(View.GONE);
                txtItem8Cost.setVisibility(View.GONE);
                togItem8.setVisibility(View.GONE);
                cBoxItem8.setVisibility(View.GONE);
                txtItem9Cost.setVisibility(View.GONE);
                togItem9.setVisibility(View.GONE);
                cBoxItem9.setVisibility(View.GONE);
                txtItem10Cost.setVisibility(View.GONE);
                togItem10.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 3:
                txtItem1Qty.setText(qtyList.get(0));
                txtItem1Type.setText(itemList.get(0));
                txtItem2Qty.setText(qtyList.get(1));
                txtItem2Type.setText(itemList.get(1));
                txtItem3Qty.setText(qtyList.get(2));
                txtItem3Type.setText(itemList.get(2));
                txtItem4Cost.setVisibility(View.GONE);
                togItem4.setVisibility(View.GONE);
                cBoxItem4.setVisibility(View.GONE);
                txtItem5Cost.setVisibility(View.GONE);
                togItem5.setVisibility(View.GONE);
                cBoxItem5.setVisibility(View.GONE);
                txtItem6Cost.setVisibility(View.GONE);
                togItem6.setVisibility(View.GONE);
                cBoxItem6.setVisibility(View.GONE);
                txtItem7Cost.setVisibility(View.GONE);
                togItem7.setVisibility(View.GONE);
                cBoxItem7.setVisibility(View.GONE);
                txtItem8Cost.setVisibility(View.GONE);
                togItem8.setVisibility(View.GONE);
                cBoxItem8.setVisibility(View.GONE);
                txtItem9Cost.setVisibility(View.GONE);
                togItem9.setVisibility(View.GONE);
                cBoxItem9.setVisibility(View.GONE);
                txtItem10Cost.setVisibility(View.GONE);
                togItem10.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 4:
                txtItem1Qty.setText(qtyList.get(0));
                txtItem1Type.setText(itemList.get(0));
                txtItem2Qty.setText(qtyList.get(1));
                txtItem2Type.setText(itemList.get(1));
                txtItem3Qty.setText(qtyList.get(2));
                txtItem3Type.setText(itemList.get(2));
                txtItem4Qty.setText(qtyList.get(3));
                txtItem4Type.setText(itemList.get(3));
                txtItem5Cost.setVisibility(View.GONE);
                togItem5.setVisibility(View.GONE);
                cBoxItem5.setVisibility(View.GONE);
                txtItem6Cost.setVisibility(View.GONE);
                togItem6.setVisibility(View.GONE);
                cBoxItem6.setVisibility(View.GONE);
                txtItem7Cost.setVisibility(View.GONE);
                togItem7.setVisibility(View.GONE);
                cBoxItem7.setVisibility(View.GONE);
                txtItem8Cost.setVisibility(View.GONE);
                togItem8.setVisibility(View.GONE);
                cBoxItem8.setVisibility(View.GONE);
                txtItem9Cost.setVisibility(View.GONE);
                togItem9.setVisibility(View.GONE);
                cBoxItem9.setVisibility(View.GONE);
                txtItem10Cost.setVisibility(View.GONE);
                togItem10.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 5:
                txtItem1Qty.setText(qtyList.get(0));
                txtItem1Type.setText(itemList.get(0));
                txtItem2Qty.setText(qtyList.get(1));
                txtItem2Type.setText(itemList.get(1));
                txtItem3Qty.setText(qtyList.get(2));
                txtItem3Type.setText(itemList.get(2));
                txtItem4Qty.setText(qtyList.get(3));
                txtItem4Type.setText(itemList.get(3));
                txtItem5Qty.setText(qtyList.get(4));
                txtItem5Type.setText(itemList.get(4));
                txtItem6Cost.setVisibility(View.GONE);
                togItem6.setVisibility(View.GONE);
                cBoxItem6.setVisibility(View.GONE);
                txtItem7Cost.setVisibility(View.GONE);
                togItem7.setVisibility(View.GONE);
                cBoxItem7.setVisibility(View.GONE);
                txtItem8Cost.setVisibility(View.GONE);
                togItem8.setVisibility(View.GONE);
                cBoxItem8.setVisibility(View.GONE);
                txtItem9Cost.setVisibility(View.GONE);
                togItem9.setVisibility(View.GONE);
                cBoxItem9.setVisibility(View.GONE);
                txtItem10Cost.setVisibility(View.GONE);
                togItem10.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 6:
                txtItem1Qty.setText(qtyList.get(0));
                txtItem1Type.setText(itemList.get(0));
                txtItem2Qty.setText(qtyList.get(1));
                txtItem2Type.setText(itemList.get(1));
                txtItem3Qty.setText(qtyList.get(2));
                txtItem3Type.setText(itemList.get(2));
                txtItem4Qty.setText(qtyList.get(3));
                txtItem4Type.setText(itemList.get(3));
                txtItem5Qty.setText(qtyList.get(4));
                txtItem5Type.setText(itemList.get(4));
                txtItem6Qty.setText(qtyList.get(5));
                txtItem6Type.setText(itemList.get(5));
                txtItem7Cost.setVisibility(View.GONE);
                togItem7.setVisibility(View.GONE);
                cBoxItem7.setVisibility(View.GONE);
                txtItem8Cost.setVisibility(View.GONE);
                togItem8.setVisibility(View.GONE);
                cBoxItem8.setVisibility(View.GONE);
                txtItem9Cost.setVisibility(View.GONE);
                togItem9.setVisibility(View.GONE);
                cBoxItem9.setVisibility(View.GONE);
                txtItem10Cost.setVisibility(View.GONE);
                togItem10.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 7:
                txtItem1Qty.setText(qtyList.get(0));
                txtItem1Type.setText(itemList.get(0));
                txtItem2Qty.setText(qtyList.get(1));
                txtItem2Type.setText(itemList.get(1));
                txtItem3Qty.setText(qtyList.get(2));
                txtItem3Type.setText(itemList.get(2));
                txtItem4Qty.setText(qtyList.get(3));
                txtItem4Type.setText(itemList.get(3));
                txtItem5Qty.setText(qtyList.get(4));
                txtItem5Type.setText(itemList.get(4));
                txtItem6Qty.setText(qtyList.get(5));
                txtItem6Type.setText(itemList.get(5));
                txtItem7Qty.setText(qtyList.get(6));
                txtItem7Type.setText(itemList.get(6));
                txtItem8Cost.setVisibility(View.GONE);
                togItem8.setVisibility(View.GONE);
                cBoxItem8.setVisibility(View.GONE);
                txtItem9Cost.setVisibility(View.GONE);
                togItem9.setVisibility(View.GONE);
                cBoxItem9.setVisibility(View.GONE);
                txtItem10Cost.setVisibility(View.GONE);
                togItem10.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 8:
                txtItem1Qty.setText(qtyList.get(0));
                txtItem1Type.setText(itemList.get(0));
                txtItem2Qty.setText(qtyList.get(1));
                txtItem2Type.setText(itemList.get(1));
                txtItem3Qty.setText(qtyList.get(2));
                txtItem3Type.setText(itemList.get(2));
                txtItem4Qty.setText(qtyList.get(3));
                txtItem4Type.setText(itemList.get(3));
                txtItem5Qty.setText(qtyList.get(4));
                txtItem5Type.setText(itemList.get(4));
                txtItem6Qty.setText(qtyList.get(5));
                txtItem6Type.setText(itemList.get(5));
                txtItem7Qty.setText(qtyList.get(6));
                txtItem7Type.setText(itemList.get(6));
                txtItem8Qty.setText(qtyList.get(7));
                txtItem8Type.setText(itemList.get(7));
                txtItem9Cost.setVisibility(View.GONE);
                togItem9.setVisibility(View.GONE);
                cBoxItem9.setVisibility(View.GONE);
                txtItem10Cost.setVisibility(View.GONE);
                togItem10.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 9:
                txtItem1Qty.setText(qtyList.get(0));
                txtItem1Type.setText(itemList.get(0));
                txtItem2Qty.setText(qtyList.get(1));
                txtItem2Type.setText(itemList.get(1));
                txtItem3Qty.setText(qtyList.get(2));
                txtItem3Type.setText(itemList.get(2));
                txtItem4Qty.setText(qtyList.get(3));
                txtItem4Type.setText(itemList.get(3));
                txtItem5Qty.setText(qtyList.get(4));
                txtItem5Type.setText(itemList.get(4));
                txtItem6Qty.setText(qtyList.get(5));
                txtItem6Type.setText(itemList.get(5));
                txtItem7Qty.setText(qtyList.get(6));
                txtItem7Type.setText(itemList.get(6));
                txtItem8Qty.setText(qtyList.get(7));
                txtItem8Type.setText(itemList.get(7));
                txtItem9Qty.setText(qtyList.get(8));
                txtItem9Type.setText(itemList.get(8));
                txtItem10Cost.setVisibility(View.GONE);
                togItem10.setVisibility(View.GONE);
                cBoxItem10.setVisibility(View.GONE);
                break;
            case 10:
                txtItem1Qty.setText(qtyList.get(0));
                txtItem1Type.setText(itemList.get(0));
                txtItem2Qty.setText(qtyList.get(1));
                txtItem2Type.setText(itemList.get(1));
                txtItem3Qty.setText(qtyList.get(2));
                txtItem3Type.setText(itemList.get(2));
                txtItem4Qty.setText(qtyList.get(3));
                txtItem4Type.setText(itemList.get(3));
                txtItem5Qty.setText(qtyList.get(4));
                txtItem5Type.setText(itemList.get(4));
                txtItem6Qty.setText(qtyList.get(5));
                txtItem6Type.setText(itemList.get(5));
                txtItem7Qty.setText(qtyList.get(6));
                txtItem7Type.setText(itemList.get(6));
                txtItem8Qty.setText(qtyList.get(7));
                txtItem8Type.setText(itemList.get(7));
                txtItem9Qty.setText(qtyList.get(8));
                txtItem9Type.setText(itemList.get(8));
                txtItem10Qty.setText(qtyList.get(9));
                txtItem10Type.setText(itemList.get(9));
                break;
        }

        cBoxItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View focus = getCurrentFocus();
                if (focus != null) {
                    hiddenKeyboard(focus);
                }
                if (txtItem1Cost.getText().toString().equals("")) {
                    cBoxItem1.setChecked(false);
                    Toast.makeText(TrackingPurchases.this, "Please enter an amount for this item.", Toast.LENGTH_SHORT).show();
                } else {
                    String amount = txtItem1Cost.getText().toString();
                    DecimalFormat hundredth = new DecimalFormat("#.##");
                    double quantity = Double.parseDouble(txtItem1Qty.getText().toString());
                    String item1Description = txtItem1Qty.getText().toString() + " " + txtItem1Type.getText().toString();
                    if(togItem1.isChecked()){
                        item1Total = Double.parseDouble(amount) * quantity;
                        String formattedAmount = hundredth.format(item1Total);
                        if(cBoxItem1.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item1Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        item1Total = Double.parseDouble(amount);
                        String formattedAmount = hundredth.format(item1Total);
                        if(cBoxItem1.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item1Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

        togItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cBoxItem1.isChecked()){
                    cBoxItem1.setChecked(false);
                }
            }
        });

        cBoxItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View focus = getCurrentFocus();
                if (focus != null) {
                    hiddenKeyboard(focus);
                }
                if (txtItem2Cost.getText().toString().equals("")) {
                    cBoxItem2.setChecked(false);
                    Toast.makeText(TrackingPurchases.this, "Please enter an amount for this item.", Toast.LENGTH_SHORT).show();
                } else {
                    String amount = txtItem2Cost.getText().toString();
                    DecimalFormat hundredth = new DecimalFormat("#.##");
                    double quantity = Double.parseDouble(txtItem2Qty.getText().toString());
                    String item2Description = txtItem2Qty.getText().toString() + " " + txtItem2Type.getText().toString();
                    if(togItem2.isChecked()){
                        item2Total = Double.parseDouble(amount) * quantity;
                        String formattedAmount = hundredth.format(item2Total);
                        if(cBoxItem2.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item2Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        item2Total = Double.parseDouble(amount);
                        String formattedAmount = hundredth.format(item2Total);
                        if(cBoxItem2.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item2Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

        togItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cBoxItem2.isChecked()){
                    cBoxItem2.setChecked(false);
                }
            }
        });

        cBoxItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View focus = getCurrentFocus();
                if (focus != null) {
                    hiddenKeyboard(focus);
                }
                if (txtItem3Cost.getText().toString().equals("")) {
                    cBoxItem3.setChecked(false);
                    Toast.makeText(TrackingPurchases.this, "Please enter an amount for this item.", Toast.LENGTH_SHORT).show();
                } else {
                    String amount = txtItem3Cost.getText().toString();
                    DecimalFormat hundredth = new DecimalFormat("#.##");
                    double quantity = Double.parseDouble(txtItem3Qty.getText().toString());
                    String item3Description = txtItem3Qty.getText().toString() + " " + txtItem3Type.getText().toString();
                    if(togItem3.isChecked()){
                        item2Total = Double.parseDouble(amount) * quantity;
                        String formattedAmount = hundredth.format(item3Total);
                        if(cBoxItem3.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item3Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        item3Total = Double.parseDouble(amount);
                        String formattedAmount = hundredth.format(item3Total);
                        if(cBoxItem3.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item3Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

        togItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cBoxItem3.isChecked()){
                    cBoxItem3.setChecked(false);
                }
            }
        });

        cBoxItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View focus = getCurrentFocus();
                if (focus != null) {
                    hiddenKeyboard(focus);
                }
                if (txtItem4Cost.getText().toString().equals("")) {
                    cBoxItem4.setChecked(false);
                    Toast.makeText(TrackingPurchases.this, "Please enter an amount for this item.", Toast.LENGTH_SHORT).show();
                } else {
                    String amount = txtItem4Cost.getText().toString();
                    DecimalFormat hundredth = new DecimalFormat("#.##");
                    double quantity = Double.parseDouble(txtItem4Qty.getText().toString());
                    String item4Description = txtItem4Qty.getText().toString() + " " + txtItem4Type.getText().toString();
                    if(togItem4.isChecked()){
                        item4Total = Double.parseDouble(amount) * quantity;
                        String formattedAmount = hundredth.format(item4Total);
                        if(cBoxItem4.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item4Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        item4Total = Double.parseDouble(amount);
                        String formattedAmount = hundredth.format(item4Total);
                        if(cBoxItem4.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item4Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

        togItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cBoxItem4.isChecked()){
                    cBoxItem4.setChecked(false);
                }
            }
        });

        cBoxItem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View focus = getCurrentFocus();
                if (focus != null) {
                    hiddenKeyboard(focus);
                }
                if (txtItem5Cost.getText().toString().equals("")) {
                    cBoxItem5.setChecked(false);
                    Toast.makeText(TrackingPurchases.this, "Please enter an amount for this item.", Toast.LENGTH_SHORT).show();
                } else {
                    String amount = txtItem5Cost.getText().toString();
                    DecimalFormat hundredth = new DecimalFormat("#.##");
                    double quantity = Double.parseDouble(txtItem5Qty.getText().toString());
                    String item5Description = txtItem5Qty.getText().toString() + " " + txtItem5Type.getText().toString();
                    if(togItem5.isChecked()){
                        item5Total = Double.parseDouble(amount) * quantity;
                        String formattedAmount = hundredth.format(item5Total);
                        if(cBoxItem5.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item5Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        item5Total = Double.parseDouble(amount);
                        String formattedAmount = hundredth.format(item5Total);
                        if(cBoxItem5.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item5Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

        togItem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cBoxItem5.isChecked()){
                    cBoxItem5.setChecked(false);
                }
            }
        });

        cBoxItem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View focus = getCurrentFocus();
                if (focus != null) {
                    hiddenKeyboard(focus);
                }
                if (txtItem6Cost.getText().toString().equals("")) {
                    cBoxItem6.setChecked(false);
                    Toast.makeText(TrackingPurchases.this, "Please enter an amount for this item.", Toast.LENGTH_SHORT).show();
                } else {
                    String amount = txtItem6Cost.getText().toString();
                    DecimalFormat hundredth = new DecimalFormat("#.##");
                    double quantity = Double.parseDouble(txtItem6Qty.getText().toString());
                    String item6Description = txtItem6Qty.getText().toString() + " " + txtItem6Type.getText().toString();
                    if(togItem6.isChecked()){
                        item6Total = Double.parseDouble(amount) * quantity;
                        String formattedAmount = hundredth.format(item6Total);
                        if(cBoxItem6.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item6Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        item6Total = Double.parseDouble(amount);
                        String formattedAmount = hundredth.format(item6Total);
                        if(cBoxItem6.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item6Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

        togItem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cBoxItem6.isChecked()){
                    cBoxItem6.setChecked(false);
                }
            }
        });

        cBoxItem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View focus = getCurrentFocus();
                if (focus != null) {
                    hiddenKeyboard(focus);
                }
                if (txtItem7Cost.getText().toString().equals("")) {
                    cBoxItem7.setChecked(false);
                    Toast.makeText(TrackingPurchases.this, "Please enter an amount for this item.", Toast.LENGTH_SHORT).show();
                } else {
                    String amount = txtItem7Cost.getText().toString();
                    DecimalFormat hundredth = new DecimalFormat("#.##");
                    double quantity = Double.parseDouble(txtItem7Qty.getText().toString());
                    String item7Description = txtItem7Qty.getText().toString() + " " + txtItem7Type.getText().toString();
                    if(togItem7.isChecked()){
                        item7Total = Double.parseDouble(amount) * quantity;
                        String formattedAmount = hundredth.format(item7Total);
                        if(cBoxItem7.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item7Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        item7Total = Double.parseDouble(amount);
                        String formattedAmount = hundredth.format(item7Total);
                        if(cBoxItem7.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item7Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

        togItem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cBoxItem7.isChecked()){
                    cBoxItem7.setChecked(false);
                }
            }
        });

        cBoxItem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View focus = getCurrentFocus();
                if (focus != null) {
                    hiddenKeyboard(focus);
                }
                if (txtItem8Cost.getText().toString().equals("")) {
                    cBoxItem8.setChecked(false);
                    Toast.makeText(TrackingPurchases.this, "Please enter an amount for this item.", Toast.LENGTH_SHORT).show();
                } else {
                    String amount = txtItem8Cost.getText().toString();
                    DecimalFormat hundredth = new DecimalFormat("#.##");
                    double quantity = Double.parseDouble(txtItem8Qty.getText().toString());
                    String item8Description = txtItem8Qty.getText().toString() + " " + txtItem8Type.getText().toString();
                    if(togItem8.isChecked()){
                        item8Total = Double.parseDouble(amount) * quantity;
                        String formattedAmount = hundredth.format(item8Total);
                        if(cBoxItem8.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item8Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        item8Total = Double.parseDouble(amount);
                        String formattedAmount = hundredth.format(item8Total);
                        if(cBoxItem8.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item8Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

        togItem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cBoxItem8.isChecked()){
                    cBoxItem8.setChecked(false);
                }
            }
        });

        cBoxItem9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View focus = getCurrentFocus();
                if (focus != null) {
                    hiddenKeyboard(focus);
                }
                if (txtItem9Cost.getText().toString().equals("")) {
                    cBoxItem9.setChecked(false);
                    Toast.makeText(TrackingPurchases.this, "Please enter an amount for this item.", Toast.LENGTH_SHORT).show();
                } else {
                    String amount = txtItem9Cost.getText().toString();
                    DecimalFormat hundredth = new DecimalFormat("#.##");
                    double quantity = Double.parseDouble(txtItem9Qty.getText().toString());
                    String item9Description = txtItem9Qty.getText().toString() + " " + txtItem9Type.getText().toString();
                    if(togItem9.isChecked()){
                        item9Total = Double.parseDouble(amount) * quantity;
                        String formattedAmount = hundredth.format(item9Total);
                        if(cBoxItem9.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item9Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        item9Total = Double.parseDouble(amount);
                        String formattedAmount = hundredth.format(item9Total);
                        if(cBoxItem9.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item9Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

        togItem9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cBoxItem9.isChecked()){
                    cBoxItem9.setChecked(false);
                }
            }
        });

        cBoxItem10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View focus = getCurrentFocus();
                if (focus != null) {
                    hiddenKeyboard(focus);
                }
                if (txtItem10Cost.getText().toString().equals("")) {
                    cBoxItem10.setChecked(false);
                    Toast.makeText(TrackingPurchases.this, "Please enter an amount for this item.", Toast.LENGTH_SHORT).show();
                } else {
                    String amount = txtItem10Cost.getText().toString();
                    DecimalFormat hundredth = new DecimalFormat("#.##");
                    double quantity = Double.parseDouble(txtItem10Qty.getText().toString());
                    String item10Description = txtItem10Qty.getText().toString() + " " + txtItem10Type.getText().toString();
                    if(togItem10.isChecked()){
                        item10Total = Double.parseDouble(amount) * quantity;
                        String formattedAmount = hundredth.format(item10Total);
                        if(cBoxItem10.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item10Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        item10Total = Double.parseDouble(amount);
                        String formattedAmount = hundredth.format(item10Total);
                        if(cBoxItem10.isChecked()){
                            Toast.makeText(TrackingPurchases.this, "Total price of " + item10Description + " is $" + formattedAmount, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });

        togItem10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cBoxItem10.isChecked()){
                    cBoxItem10.setChecked(false);
                }
            }
        });

        btnPage2Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page2Back = new Intent(TrackingPurchases.this, MainActivity.class);
                startActivity(page2Back);
            }
        });
    }

    private void hiddenKeyboard(View v) {
        InputMethodManager keyboard = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (keyboard != null) {
            keyboard.hideSoftInputFromWindow(v.getWindowToken(), 0);
        }
    }
}
