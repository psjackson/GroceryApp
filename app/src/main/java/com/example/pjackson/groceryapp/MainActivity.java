package com.example.pjackson.groceryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> itemsList = new ArrayList<>();
    ArrayList<String> qtysList = new ArrayList<>();

    EditText item1Type, item2Type, item3Type, item4Type, item5Type, item6Type, item7Type, item8Type, item9Type, item10Type;
    Spinner item1Qty, item2Qty, item3Qty, item4Qty, item5Qty, item6Qty, item7Qty, item8Qty, item9Qty, item10Qty;
//    Switch item1Next, item2Next, item3Next, item4Next, item5Next, item6Next, item7Next, item8Next, item9Next, item10Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        final EditText item1Type = findViewById(R.id.txtItemDesc1);
        final EditText item2Type = findViewById(R.id.txtItemDesc2);
        final EditText item3Type = findViewById(R.id.txtItemDesc3);
        final EditText item4Type = findViewById(R.id.txtItemDesc4);
        final EditText item5Type = findViewById(R.id.txtItemDesc5);
        final EditText item6Type = findViewById(R.id.txtItemDesc6);
        final EditText item7Type = findViewById(R.id.txtItemDesc7);
        final EditText item8Type = findViewById(R.id.txtItemDesc8);
        final EditText item9Type = findViewById(R.id.txtItemDesc9);
        final EditText item10Type = findViewById(R.id.txtItemDesc10);

        final Spinner item1Qty = findViewById(R.id.spnQtyItem1);
        final Spinner item2Qty = findViewById(R.id.spnQtyItem2);
        final Spinner item3Qty = findViewById(R.id.spnQtyItem3);
        final Spinner item4Qty = findViewById(R.id.spnQtyItem4);
        final Spinner item5Qty = findViewById(R.id.spnQtyItem5);
        final Spinner item6Qty = findViewById(R.id.spnQtyItem6);
        final Spinner item7Qty = findViewById(R.id.spnQtyItem7);
        final Spinner item8Qty = findViewById(R.id.spnQtyItem8);
        final Spinner item9Qty = findViewById(R.id.spnQtyItem9);
        final Spinner item10Qty = findViewById(R.id.spnQtyItem10);

        final Switch item1Next = findViewById(R.id.swtItem1);
        final Switch item2Next = findViewById(R.id.swtItem2);
        final Switch item3Next = findViewById(R.id.swtItem3);
        final Switch item4Next = findViewById(R.id.swtItem4);
        final Switch item5Next = findViewById(R.id.swtItem5);
        final Switch item6Next = findViewById(R.id.swtItem6);
        final Switch item7Next = findViewById(R.id.swtItem7);
        final Switch item8Next = findViewById(R.id.swtItem8);
        final Switch item9Next = findViewById(R.id.swtItem9);
        final Switch item10Next = findViewById(R.id.swtItem10);

        Button resetPage1 = findViewById(R.id.btnPage1Clear);
        Button nextPage1 = findViewById(R.id.btnPage1Done);

//        if (savedInstanceState != null) {
//            item1Qty.setSelection(savedInstanceState.getInt("KEY_ITEM1QTY", 0));
//            item2Qty.setSelection(savedInstanceState.getInt("KEY_ITEM2QTY", 0));
//            item3Qty.setSelection(savedInstanceState.getInt("KEY_ITEM3QTY", 0));
//            item4Qty.setSelection(savedInstanceState.getInt("KEY_ITEM4QTY", 0));
//            item5Qty.setSelection(savedInstanceState.getInt("KEY_ITEM5QTY", 0));
//            item6Qty.setSelection(savedInstanceState.getInt("KEY_ITEM6QTY", 0));
//            item7Qty.setSelection(savedInstanceState.getInt("KEY_ITEM7QTY", 0));
//            item8Qty.setSelection(savedInstanceState.getInt("KEY_ITEM8QTY", 0));
//            item9Qty.setSelection(savedInstanceState.getInt("KEY_ITEM9QTY", 0));
//            item10Qty.setSelection(savedInstanceState.getInt("KEY_ITEM10QTY", 0));
//
//            String holdItem1 = savedInstanceState.getString("KEY_ITEM1TYPE");
//            item1Type.setText(holdItem1);
//            String holdItem2 = savedInstanceState.getString("KEY_ITEM2TYPE");
//            item2Type.setText(holdItem2);
//            String holdItem3 = savedInstanceState.getString("KEY_ITEM3TYPE");
//            item3Type.setText(holdItem3);
//            String holdItem4 = savedInstanceState.getString("KEY_ITEM4TYPE");
//            item4Type.setText(holdItem4);
//            String holdItem5 = savedInstanceState.getString("KEY_ITEM5TYPE");
//            item5Type.setText(holdItem5);
//            String holdItem6 = savedInstanceState.getString("KEY_ITEM6TYPE");
//            item6Type.setText(holdItem6);
//            String holdItem7 = savedInstanceState.getString("KEY_ITEM7TYPE");
//            item7Type.setText(holdItem7);
//            String holdItem8 = savedInstanceState.getString("KEY_ITEM8TYPE");
//            item8Type.setText(holdItem8);
//            String holdItem9 = savedInstanceState.getString("KEY_ITEM9TYPE");
//            item9Type.setText(holdItem9);
//            String holdItem10 = savedInstanceState.getString("KEY_ITEM10TYPE");
//            item10Type.setText(holdItem10);
//        }

        resetPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item1Type.getText().clear();
                item2Type.getText().clear();
                item3Type.getText().clear();
                item4Type.getText().clear();
                item5Type.getText().clear();
                item6Type.getText().clear();
                item7Type.getText().clear();
                item8Type.getText().clear();
                item9Type.getText().clear();
                item10Type.getText().clear();

                item1Qty.setSelection(0);
                item2Qty.setSelection(0);
                item3Qty.setSelection(0);
                item4Qty.setSelection(0);
                item5Qty.setSelection(0);
                item6Qty.setSelection(0);
                item7Qty.setSelection(0);
                item8Qty.setSelection(0);
                item9Qty.setSelection(0);
                item10Qty.setSelection(0);

                item1Next.setChecked(false);
                item2Next.setChecked(false);
                item3Next.setChecked(false);
                item4Next.setChecked(false);
                item5Next.setChecked(false);
                item6Next.setChecked(false);
                item7Next.setChecked(false);
                item8Next.setChecked(false);
                item9Next.setChecked(false);
                item10Next.setChecked(false);
            }
        });

        item1Next.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String myItemQty = item1Qty.getSelectedItem().toString();
                String myItemType = item1Type.getText().toString();
                if(myItemQty.matches("0") || myItemType.matches("")){
                    item1Next.setChecked(false);
                    Toast.makeText(MainActivity.this, "Both the item description and quantity need to be set.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        item2Next.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String myItemQty = item2Qty.getSelectedItem().toString();
                String myItemType = item2Type.getText().toString();
                if(myItemQty.matches("0") || myItemType.matches("")){
                    item2Next.setChecked(false);
                    Toast.makeText(MainActivity.this, "Both the item description and quantity need to be set.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        item3Next.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String myItemQty = item3Qty.getSelectedItem().toString();
                String myItemType = item3Type.getText().toString();
                if(myItemQty.matches("0") || myItemType.matches("")){
                    item3Next.setChecked(false);
                    Toast.makeText(MainActivity.this, "Both the item description and quantity need to be set.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        item4Next.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String myItemQty = item4Qty.getSelectedItem().toString();
                String myItemType = item4Type.getText().toString();
                if(myItemQty.matches("0") || myItemType.matches("")){
                    item4Next.setChecked(false);
                    Toast.makeText(MainActivity.this, "Both the item description and quantity need to be set.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        item5Next.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String myItemQty = item5Qty.getSelectedItem().toString();
                String myItemType = item5Type.getText().toString();
                if(myItemQty.matches("0") || myItemType.matches("")){
                    item1Next.setChecked(false);
                    Toast.makeText(MainActivity.this, "Both the item description and quantity need to be set.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        item6Next.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String myItemQty = item6Qty.getSelectedItem().toString();
                String myItemType = item6Type.getText().toString();
                if(myItemQty.matches("0") || myItemType.matches("")){
                    item6Next.setChecked(false);
                    Toast.makeText(MainActivity.this, "Both the item description and quantity need to be set.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        item7Next.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String myItemQty = item7Qty.getSelectedItem().toString();
                String myItemType = item7Type.getText().toString();
                if(myItemQty.matches("0") || myItemType.matches("")){
                    item7Next.setChecked(false);
                    Toast.makeText(MainActivity.this, "Both the item description and quantity need to be set.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        item8Next.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String myItemQty = item8Qty.getSelectedItem().toString();
                String myItemType = item8Type.getText().toString();
                if(myItemQty.matches("0") || myItemType.matches("")){
                    item1Next.setChecked(false);
                    Toast.makeText(MainActivity.this, "Both the item description and quantity need to be set.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        item9Next.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String myItemQty = item9Qty.getSelectedItem().toString();
                String myItemType = item9Type.getText().toString();
                if(myItemQty.matches("0") || myItemType.matches("")){
                    item9Next.setChecked(false);
                    Toast.makeText(MainActivity.this, "Both the item description and quantity need to be set.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        item10Next.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String myItemQty = item10Qty.getSelectedItem().toString();
                String myItemType = item10Type.getText().toString();
                if(myItemQty.matches("0") || myItemType.matches("")){
                    item10Next.setChecked(false);
                    Toast.makeText(MainActivity.this, "Both the item description and quantity need to be set.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        nextPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemsList.clear();
                qtysList.clear();
                if (item1Next.isChecked()) {
                    String itemAmount = item1Qty.getSelectedItem().toString();
                    String item = item1Type.getText().toString();
                    itemsList.add(item);
                    qtysList.add(itemAmount);
                }
                if (item2Next.isChecked()) {
                    String itemAmount = item2Qty.getSelectedItem().toString();
                    String item = item2Type.getText().toString();
                    itemsList.add(item);
                    qtysList.add(itemAmount);
                }
                if (item3Next.isChecked()) {
                    String itemAmount = item3Qty.getSelectedItem().toString();
                    String item = item3Type.getText().toString();
                    itemsList.add(item);
                    qtysList.add(itemAmount);
                }
                if (item4Next.isChecked()) {
                    String itemAmount = item4Qty.getSelectedItem().toString();
                    String item = item4Type.getText().toString();
                    itemsList.add(item);
                    qtysList.add(itemAmount);
                }
                if (item5Next.isChecked()) {
                    String itemAmount = item5Qty.getSelectedItem().toString();
                    String item = item5Type.getText().toString();
                    itemsList.add(item);
                    qtysList.add(itemAmount);
                }
                if (item6Next.isChecked()) {
                    String itemAmount = item6Qty.getSelectedItem().toString();
                    String item = item6Type.getText().toString();
                    itemsList.add(item);
                    qtysList.add(itemAmount);
                }
                if (item7Next.isChecked()) {
                    String itemAmount = item7Qty.getSelectedItem().toString();
                    String item = item7Type.getText().toString();
                    itemsList.add(item);
                    qtysList.add(itemAmount);
                }
                if (item8Next.isChecked()) {
                    String itemAmount = item8Qty.getSelectedItem().toString();
                    String item = item8Type.getText().toString();
                    itemsList.add(item);
                    qtysList.add(itemAmount);
                }
                if (item9Next.isChecked()) {
                    String itemAmount = item9Qty.getSelectedItem().toString();
                    String item = item9Type.getText().toString();
                    itemsList.add(item);
                    qtysList.add(itemAmount);
                }
                if (item10Next.isChecked()) {
                    String itemAmount = item10Qty.getSelectedItem().toString();
                    String item = item10Type.getText().toString();
                    itemsList.add(item);
                    qtysList.add(itemAmount);
                }
                if (itemsList.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Toggle at least 1 item to on.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent trackingScreen = new Intent(MainActivity.this, TrackingPurchases.class);
                    Bundle groceries = new Bundle();
                    groceries.putStringArrayList("itemList", itemsList);
                    groceries.putStringArrayList("QuantityList", qtysList);
                    trackingScreen.putExtras(groceries);
                    startActivity(trackingScreen);
                }
            }
        });
    }

//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putInt("KEY_ITEM1QTY", item1Qty.getSelectedItemPosition());
//        outState.putInt("KEY_ITEM2QTY", item2Qty.getSelectedItemPosition());
//        outState.putInt("KEY_ITEM3QTY", item3Qty.getSelectedItemPosition());
//        outState.putInt("KEY_ITEM4QTY", item4Qty.getSelectedItemPosition());
//        outState.putInt("KEY_ITEM5QTY", item5Qty.getSelectedItemPosition());
//        outState.putInt("KEY_ITEM6QTY", item6Qty.getSelectedItemPosition());
//        outState.putInt("KEY_ITEM7QTY", item7Qty.getSelectedItemPosition());
//        outState.putInt("KEY_ITEM8QTY", item8Qty.getSelectedItemPosition());
//        outState.putInt("KEY_ITEM9QTY", item9Qty.getSelectedItemPosition());
//        outState.putInt("KEY_ITEM10QTY", item10Qty.getSelectedItemPosition());
//
//        outState.putString("KEY_ITEM1TYPE", item1Type.getText().toString());
//        outState.putString("KEY_ITEM2TYPE", item2Type.getText().toString());
//        outState.putString("KEY_ITEM3TYPE", item3Type.getText().toString());
//        outState.putString("KEY_ITEM4TYPE", item4Type.getText().toString());
//        outState.putString("KEY_ITEM5TYPE", item5Type.getText().toString());
//        outState.putString("KEY_ITEM6TYPE", item6Type.getText().toString());
//        outState.putString("KEY_ITEM7TYPE", item7Type.getText().toString());
//        outState.putString("KEY_ITEM8TYPE", item8Type.getText().toString());
//        outState.putString("KEY_ITEM9TYPE", item9Type.getText().toString());
//        outState.putString("KEY_ITEM10TYPE", item10Type.getText().toString());
//    }
}


