package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final int ITEM_MESSAGE = 1;
    public final TextView[] item = new TextView[10];
    private ArrayList<String> itemList = new ArrayList<>(10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item[0] = findViewById(R.id.item1);
        item[1] = findViewById(R.id.item2);
        item[2] = findViewById(R.id.item3);
        item[3] = findViewById(R.id.item4);
        item[4] = findViewById(R.id.item5);
        item[5] = findViewById(R.id.item6);
        item[6] = findViewById(R.id.item7);
        item[7] = findViewById(R.id.item8);
        item[8] = findViewById(R.id.item9);
        item[9] = findViewById(R.id.item10);

        if (savedInstanceState != null){
            itemList = savedInstanceState.getStringArrayList("ItemsListArray");
            int i;
            if (itemList != null && itemList.size() > 0){
                for (i = 0; i < itemList.size(); i++){
                    if (itemList.size() > 10) {
                        Toast.makeText(MainActivity.this, "Cannot add more items to the list", Toast.LENGTH_LONG).show();
                        break;
                    }
                    item[i].setVisibility(View.VISIBLE);
                    item[i].setText(itemList.get(i));
                }
            }

        }

    }

    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        if (itemList.size() != 0){
            outState.putStringArrayList("ItemListArray", itemList);
        }
    }

    public void addItem(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, ITEM_MESSAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ITEM_MESSAGE){
            if (resultCode == RESULT_OK){
                String itemData = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                itemList.add(itemData);
                for (int i = 0; i < itemList.size(); i++){
                    if (itemList.size() > 10){
                        Toast.makeText(MainActivity.this, "Cannot add more items to the list", Toast.LENGTH_LONG).show();
                        break;
                    }
                    item[i].setVisibility(View.VISIBLE);
                    item[i].setText(itemList.get(i));
                }
            }
        }
    }
}