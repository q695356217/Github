package com.example.administrator.alertdialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.text);

        TableLayout loginForm = (TableLayout) getLayoutInflater()
                .inflate(R.layout.user, null);

        final EditText username = (EditText) loginForm.findViewById(R.id.Username);
        final EditText password = (EditText) loginForm.findViewById(R.id.Password);

        new AlertDialog.Builder(this)
                .setTitle("Android App")
                .setView(loginForm)
                .setPositiveButton("登录", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        textView.setText("登录成功" + "\n你的用户名为:" + username.getText().toString() + "\n输入密码为:" + password.getText().toString());
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        textView.setText("取消登录！");
                    }
                })
                .create()
                .show();



    }
}
