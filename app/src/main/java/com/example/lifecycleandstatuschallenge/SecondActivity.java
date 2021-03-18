package com.example.lifecycleandstatuschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.shoppinglist.R;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.android.shoppinglist.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
    }

    public void selectItem(View view) {
        Intent return_Intent = new Intent();

        switch (view.getId()){
            case R.id.button_cheese:
                return_Intent.putExtra(EXTRA_REPLY, "Cheese");
                setResult(RESULT_OK, return_Intent);
                finish();
                break;
            case R.id.button_rice:
                return_Intent.putExtra(EXTRA_REPLY, "Rice");
                setResult(RESULT_OK, return_Intent);
                finish();
                break;
            case R.id.button_apple:
                return_Intent.putExtra(EXTRA_REPLY, "Apples");
                setResult(RESULT_OK, return_Intent);
                finish();
                break;
            case R.id.button_mango:
                return_Intent.putExtra(EXTRA_REPLY, "mangos");
                setResult(RESULT_OK, return_Intent);
                finish();
                break;
            case R.id.button_cake:
                return_Intent.putExtra(EXTRA_REPLY, "Cake");
                setResult(RESULT_OK, return_Intent);
                finish();
                break;
            case R.id.button_chocolate:
                return_Intent.putExtra(EXTRA_REPLY, "Chocolate");
                setResult(RESULT_OK, return_Intent);
                finish();
                break;
            case R.id.button_ice_cream:
                return_Intent.putExtra(EXTRA_REPLY, "Ice Cream");
                setResult(RESULT_OK, return_Intent);
                finish();
                break;
            case R.id.button_bread:
                return_Intent.putExtra(EXTRA_REPLY, "Bread");
                setResult(RESULT_OK, return_Intent);
                finish();
                break;
            case R.id.button_chips:
                return_Intent.putExtra(EXTRA_REPLY, "Chips");
                setResult(RESULT_OK, return_Intent);
                finish();
                break;
            case R.id.button_grapes:
                return_Intent.putExtra(EXTRA_REPLY, "Grapes");
                setResult(RESULT_OK, return_Intent);
                finish();
                break;
            default:
                Toast.makeText(SecondActivity.this, "There was an error", Toast.LENGTH_LONG).show();
                break;
        }

    }
}