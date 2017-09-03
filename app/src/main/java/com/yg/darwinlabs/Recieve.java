package com.yg.darwinlabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.ClipboardManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Recieve extends AppCompatActivity implements View.OnClickListener {

    ImageView back, copy;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve);
        back = (ImageView) findViewById(R.id.back);
        copy = (ImageView) findViewById(R.id.copy);
        text = (TextView) findViewById(R.id.text);
        text.setText("0x3635774825368dd25");

        back.setOnClickListener(this);
        copy.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == back)
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }

        if (view == copy)
        {
            String stringYouExtracted = text.getText().toString();
            int startIndex = text.getSelectionStart();
            int endIndex = text.getSelectionEnd();
//            stringYouExtracted = stringYouExtracted.subString(startIndex, endIndex);
            ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
            clipboard.setText(stringYouExtracted);
            Toast.makeText(this, "text copied", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
