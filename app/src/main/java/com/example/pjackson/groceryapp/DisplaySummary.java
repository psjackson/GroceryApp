package com.example.pjackson.groceryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class DisplaySummary extends AppCompatActivity {

    String item1, item2, item3, item4, item5, item6, item7, item8, item9, item10;
    String cost1, cost2, cost3, cost4, cost5, cost6, cost7, cost8, cost9, cost10;
    String item1Words, item2Words, item3Words, item4Words, item5Words, item6Words, item7Words, item8Words, item9Words, item10Words;
    String itemR1, itemR2, itemR3, itemR4, itemR5, itemR6, itemR7, itemR8, itemR9, itemR10;
    String itemR1Words, itemR2Words, itemR3Words, itemR4Words, itemR5Words, itemR6Words, itemR7Words, itemR8Words, itemR9Words, itemR10Words;
    double totalCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_summary);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setLogo(R.mipmap.ic_launcher);
            getSupportActionBar().setDisplayUseLogoEnabled(true);
        }

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            ArrayList<String> itemsBoughtList = extras.getStringArrayList("ItemsBoughtList");
            ArrayList<String> itemsCostList = extras.getStringArrayList("ItemsCostList");
            ArrayList<String> itemsRemainList = extras.getStringArrayList("ItemsRemainList");
            totalCost = extras.getDouble("TotalCost");


            if (itemsBoughtList != null) {
                int boughtSize = itemsBoughtList.size();
                if (boughtSize > 0) {
                    item1 = itemsBoughtList.get(0);
                }
                if (boughtSize > 1) {
                    item2 = itemsBoughtList.get(1);
                }
                if (boughtSize > 2) {
                    item3 = itemsBoughtList.get(2);
                }
                if (boughtSize > 3) {
                    item4 = itemsBoughtList.get(3);
                }
                if (boughtSize > 4) {
                    item5 = itemsBoughtList.get(4);
                }
                if (boughtSize > 5) {
                    item6 = itemsBoughtList.get(5);
                }
                if (boughtSize > 6) {
                    item7 = itemsBoughtList.get(6);
                }
                if (boughtSize > 7) {
                    item8 = itemsBoughtList.get(7);
                }
                if (boughtSize > 8) {
                    item9 = itemsBoughtList.get(8);
                }
                if (boughtSize > 9) {
                    item10 = itemsBoughtList.get(9);
                }
            }

            if (itemsCostList != null) {
                int costSize = itemsCostList.size();
                if (costSize > 0) {
                    cost1 = itemsCostList.get(0);
                }
                if (costSize > 1) {
                    cost2 = itemsCostList.get(1);
                }
                if (costSize > 2) {
                    cost3 = itemsCostList.get(2);
                }
                if (costSize > 3) {
                    cost4 = itemsCostList.get(3);
                }
                if (costSize > 4) {
                    cost5 = itemsCostList.get(4);
                }
                if (costSize > 5) {
                    cost6 = itemsCostList.get(5);
                }
                if (costSize > 6) {
                    cost7 = itemsCostList.get(6);
                }
                if (costSize > 7) {
                    cost8 = itemsCostList.get(7);
                }
                if (costSize > 8) {
                    cost9 = itemsCostList.get(8);
                }
                if (costSize > 9) {
                    cost10 = itemsCostList.get(9);
                }
            }

            if (itemsRemainList != null) {
                int remainSize = itemsRemainList.size();
                if (remainSize > 0) {
                    itemR1 = itemsRemainList.get(0);
                }
                if (remainSize > 1) {
                    itemR2 = itemsRemainList.get(1);
                }
                if (remainSize > 2) {
                    itemR3 = itemsRemainList.get(2);
                }
                if (remainSize > 3) {
                    itemR4 = itemsRemainList.get(3);
                }
                if (remainSize > 4) {
                    itemR5 = itemsRemainList.get(4);
                }
                if (remainSize > 5) {
                    itemR6 = itemsRemainList.get(5);
                }
                if (remainSize > 6) {
                    itemR7 = itemsRemainList.get(6);
                }
                if (remainSize > 7) {
                    itemR8 = itemsRemainList.get(7);
                }
                if (remainSize > 8) {
                    itemR9 = itemsRemainList.get(8);
                }
                if (remainSize > 9) {
                    itemR10 = itemsRemainList.get(9);
                }
            }
        }

        final TextView itemsBoughtSummary = findViewById(R.id.txtPage3ItemsBuy);
        final TextView itemsRemainSummary = findViewById(R.id.txtPage3ItemsLeft);

        DecimalFormat hundredth = new DecimalFormat("#.##");
        String formattedAmount = hundredth.format(totalCost);

        String buyEmpty = ("You did not buy anything on your list.");
        String buy = ("You bought everything on your list.");
        String total = ("\nThe total cost for this shopping trip was: $" + formattedAmount + " plus tax.");

        item1Words = ("You spent $" + cost1 + " on " + item1 + ".\n");
        item2Words = ("You spent $" + cost2 + " on " + item2 + ".\n");
        item3Words = ("You spent $" + cost3 + " on " + item3 + ".\n");
        item4Words = ("You spent $" + cost4 + " on " + item4 + ".\n");
        item5Words = ("You spent $" + cost5 + " on " + item5 + ".\n");
        item6Words = ("You spent $" + cost6 + " on " + item6 + ".\n");
        item7Words = ("You spent $" + cost7 + " on " + item7 + ".\n");
        item8Words = ("You spent $" + cost8 + " on " + item8 + ".\n");
        item9Words = ("You spent $" + cost9 + " on " + item9 + ".\n");
        item10Words = ("You spent $" + cost10 + " on " + item10 + ".\n");

        itemR1Words = ("You did not get the " + itemR1 + ".\n");
        itemR2Words = ("You did not get the " + itemR2 + ".\n");
        itemR3Words = ("You did not get the " + itemR3 + ".\n");
        itemR4Words = ("You did not get the " + itemR4 + ".\n");
        itemR5Words = ("You did not get the " + itemR5 + ".\n");
        itemR6Words = ("You did not get the " + itemR6 + ".\n");
        itemR7Words = ("You did not get the " + itemR7 + ".\n");
        itemR8Words = ("You did not get the " + itemR8 + ".\n");
        itemR9Words = ("You did not get the " + itemR9 + ".\n");
        itemR10Words = ("You did not get the " + itemR10 + ".\n");

        StringBuilder ItemsBought = new StringBuilder(500);
        if(item1 == null) {
            ItemsBought.append(buyEmpty);
        }else {
            ItemsBought.append(item1Words);
        }
        if (item2 !=null) {
            ItemsBought.append(item2Words);
        }
        if (item3 != null) {
            ItemsBought.append(item3Words);
        }
        if (item4 != null) {
            ItemsBought.append(item4Words);
        }
        if (item5 != null) {
            ItemsBought.append(item5Words);
        }
        if (item6 != null) {
            ItemsBought.append(item6Words);
        }
        if (item7 != null) {
            ItemsBought.append(item7Words);
        }
        if (item8 != null) {
            ItemsBought.append(item8Words);
        }
        if (item9 != null) {
            ItemsBought.append(item9Words);
        }
        if (item10 != null) {
            ItemsBought.append(item10Words);
        }
        if(item1 != null) {
            ItemsBought.append(total);
        }
        itemsBoughtSummary.setText(ItemsBought);


        StringBuilder ItemsRemain = new StringBuilder(500);
        if (itemR1 == null) {
            ItemsRemain.append(buy);
        } else {
            ItemsRemain.append(itemR1Words);
        }
        if(itemR2 != null){
            ItemsRemain.append(itemR2Words);
        }
        if(itemR3 != null){
            ItemsRemain.append(itemR3Words);
        }
        if(itemR4 != null){
            ItemsRemain.append(itemR4Words);
        }
        if(itemR5 != null){
            ItemsRemain.append(itemR5Words);
        }
        if(itemR6 != null){
            ItemsRemain.append(itemR6Words);
        }
        if(itemR7 != null){
            ItemsRemain.append(itemR7Words);
        }
        if(itemR8 != null){
            ItemsRemain.append(itemR8Words);
        }
        if(itemR9 != null){
            ItemsRemain.append(itemR9Words);
        }
        if(itemR10 != null){
            ItemsRemain.append(itemR10Words);
        }
        itemsRemainSummary.setText(ItemsRemain);
    }
}