package com.romi.project.cse225_assignment_bottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment1 extends Fragment {
    private EditText editname1, editregno1, editcourse1, edityear1, editaddress1;
    private Button add1;
    TextView inputname3,inputregno3,inputcourse3,inputyear3,inputaddress3;
    String name1,regno1,course1,year1,address1;
    person1 obj1;

    public interface person1 {
      void InputsFromPerson1(String name1, String regno1,String course1,String year1,String address1);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment1, container, false);
        editname1 = (EditText) view.findViewById(R.id.name1);
        editregno1 = (EditText) view.findViewById(R.id.regno1);
        editcourse1 = (EditText) view.findViewById(R.id.course1);
        edityear1 = (EditText) view.findViewById(R.id.year1);
        inputname3=view.findViewById(R.id.inputname3);
        inputregno3=view.findViewById(R.id.inputregno3);
        inputcourse3=view.findViewById(R.id.inputcourse3);
        inputyear3=view.findViewById(R.id.inputyear3);
        inputaddress3=view.findViewById(R.id.inputaddres3);
        editaddress1 = (EditText) view.findViewById(R.id.address1);
        add1 = (Button) view.findViewById(R.id.add1);
        Bundle bundle=getArguments();
        if(bundle!=null)
        {
            String message3[]=bundle.getStringArray("Array3");
            inputname3.setText(message3[0]);
            inputregno3.setText(message3[1]);
            inputcourse3.setText(message3[2]);
            inputyear3.setText(message3[3]);
            inputaddress3.setText(message3[4]);
        }
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name1=editname1.getText().toString().trim();
                regno1=editregno1.getText().toString().trim();
                course1=editcourse1.getText().toString().trim();
                year1=edityear1.getText().toString().trim();
                address1=editaddress1.getText().toString().trim();

               obj1. InputsFromPerson1(name1,regno1,course1,year1,address1);
            }
        });
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {

            obj1=(person1) context;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}