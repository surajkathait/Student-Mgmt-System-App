package com.example.suraj.student2;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

class Suraj {

    String name;
    int no;
    String college;
    String add;

    Suraj(String name, int no,String college,String add) {
        this.name = name;
        this.no =no;
        this.college=college;
        this.add=add;
    }

}


public class MainActivity extends AppCompatActivity {
    EditText obj1,obj2,obj3,obj4;
    Button b1,b2;
    TextView text;
    ArrayList<Suraj> obj = new ArrayList<Suraj>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        obj1=(EditText) findViewById(R.id.enter_name);
        obj2=(EditText) findViewById(R.id.enter_no);
        obj3=(EditText) findViewById(R.id.enter_college);
        obj4=(EditText) findViewById(R.id.enter_add);
        text=(TextView) findViewById(R.id.text1);
        b1=(Button) findViewById(R.id.add_student);
        b2=(Button) findViewById(R.id.dip_res);
        ;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String name = String.valueOf(obj1.getText());
                    int no = Integer.parseInt(obj2.getText().toString());
                    String college = String.valueOf(obj3.getText());
                    String add = String.valueOf(obj4.getText());

                    if(name.isEmpty() || no==0 || college.isEmpty()|| add.isEmpty())
                    {
                        Toast.makeText(getApplicationContext(),"Enter Valid Entries",Toast.LENGTH_SHORT).show();
                    }
                        else
                    {
                        obj.add(new Suraj(name,no, college,add));

                    }

                }

                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Enter Valid entries",Toast.LENGTH_SHORT).show();

                }



            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<obj.size();i++)
                {
                    text.setText(text.getText()+"\n"+obj.get(i).name);
                    text.setText(text.getText()+"\n"+obj.get(i).no);
                    text.setText(text.getText()+"\n"+obj.get(i).college);
                    text.setText(text.getText()+"\n"+obj.get(i).add +"\n"+"**********");
                }
            }
        });

    }


}
