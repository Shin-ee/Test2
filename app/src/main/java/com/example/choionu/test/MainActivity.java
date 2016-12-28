package com.example.choionu.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView messageView;
    EditText inputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageView=(TextView)findViewById(R.id.text_message);
        inputView=(EditText)findViewById(R.id.edit_input);
        Button btn=(Button)findViewById(R.id.btn_send);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                messageView.setText(inputView.getText().toString());
            }
        });
    }
}
