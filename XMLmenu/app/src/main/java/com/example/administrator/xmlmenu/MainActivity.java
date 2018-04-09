package com.example.administrator.xmlmenu;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.小:
                textView.setTextSize(10);
                break;
            case R.id.中:
                textView.setTextSize(16);
                break;
            case R.id.大:
                textView.setTextSize(20);
                break;
            case R.id.普通菜单项:
                Toast.makeText(this, "点击普通菜单项", Toast.LENGTH_SHORT).show();
                break;
            case R.id.红:
                textView.setTextColor(getResources().getColor(R.color.color_red));
                break;
            case R.id.黑:
                textView.setTextColor(getResources().getColor(R.color.color_black));
                break;


























































































        }
        return super.onOptionsItemSelected(item);
    }





}
