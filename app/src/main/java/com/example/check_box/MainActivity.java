package com.example.check_box;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox checkBox,cb1,cb2,cb3,cb4,cb5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox=findViewById(R.id.checkBox);
        cb1=findViewById(R.id.checkBox2);
        cb2=findViewById(R.id.checkBox3);
        cb3=findViewById(R.id.checkBox4);
        //cb4=findViewById(R.id.checkBox);
        //cb5=findViewById(R.id.checkBox);


        checkBox.setOnCheckedChangeListener(this);
        cb1.setOnCheckedChangeListener(this);
        cb2.setOnCheckedChangeListener(this);
        cb3.setOnCheckedChangeListener(this);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

              //  onclick();

            }
        });

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean bo) {

        switch (compoundButton.getText())

        {
            case R.id.checkBox:

                if (compoundButton.isChecked())

                    Toast.makeText(MainActivity.this, "woohh" + checkBox, Toast.LENGTH_SHORT);
                    break;
        }

    }

   /* public void onclick()
    {

        if(checkBox.isChecked())

        {

            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show();
        }


            else
            {

                Toast.makeText(this, "unclicked", Toast.LENGTH_SHORT).show();
            }


    }*/




}
