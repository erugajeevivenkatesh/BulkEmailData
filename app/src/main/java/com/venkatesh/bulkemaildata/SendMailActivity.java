package com.venkatesh.bulkemaildata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.venkatesh.bulkemaildata.Validations.ValidationofData;

public class SendMailActivity extends AppCompatActivity {

    EditText subject,ComposeEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_mail);
        subject=findViewById(R.id.Subject);
        ComposeEmail=findViewById(R.id.ComposeEmail);
    }

    public void AddEmailAddress(View view) {

    }

    public void SendEmaildata(View view) {
        EditText[] data={subject,ComposeEmail};
        ValidationofData datavalid=new ValidationofData();
        if(datavalid.ValidateMaildata(data))
        {
            Toast.makeText(this, "youar data is vali1", Toast.LENGTH_SHORT).show();
        }


    }
}
