package de.diskostu.demo.hellotoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * https://codelabs.developers.google.com/codelabs/android-training-layout-editor-part-a/index
 * .html?index=..%2F..%2Fandroid-training#4
 */
public class MainActivity extends AppCompatActivity {

    private int mCount = 999;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
        mCount++;

        if (mShowCount != null) {
            // https://stackoverflow.com/questions/7070209/converting-integer-to-string-with-comma-for-thousands
            mShowCount.setText(NumberFormat.getNumberInstance(Locale.getDefault()).format(mCount));


            // another way of formatting:
//            mShowCount.setText(String.format(Locale.getDefault(), "%,d", mCount));
        }
    }
}