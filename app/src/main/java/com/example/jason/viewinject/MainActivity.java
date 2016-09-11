package com.example.jason.viewinject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
@ViewInject(R.id.btn)
private Button btn;
    @ViewInject(R.id.text)
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
    }
    @Event(value = R.id.btn)
    private void onTestEvent(){
        Toast.makeText(this, "Hello IOC", Toast.LENGTH_SHORT).show();
    }

}
