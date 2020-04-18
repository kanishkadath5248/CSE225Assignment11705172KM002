package com.romi.project.cse225_assignment_bottomnav;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment2 extends Fragment {
    private EditText editname2, editregno2, editcourse2, edityear2, editaddress2;
    private Button add2;
    person2 obj2;
    String name2,regno2,course2,year2,address2;
   TextView inputname1,inputregno1,inputcourse1,inputyear1,inputaddress1;
    public interface person2 {
        void InputsFromPerson2(String name2, String regno2,String course2,String year2,String address2);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment2, container, false);
        editname2 = (EditText) view.findViewById(R.id.name2);
        editregno2 = (EditText) view.findViewById(R.id.regno2);
        editcourse2 = (EditText) view.findViewById(R.id.course2);
        edityear2 = (EditText) view.findViewById(R.id.year2);
        editaddress2 = (EditText) view.findViewById(R.id.address2);
        add2 = (Button) view.findViewById(R.id.add2);
        inputname1=view.findViewById(R.id.inputname1);
        inputregno1=view.findViewById(R.id.inputregno1);
        inputcourse1=view.findViewById(R.id.inputcourse1);
        inputyear1=view.findViewById(R.id.inputyear1);
        inputaddress1=view.findViewById(R.id.inputaddres1);
        Bundle bundle=getArguments();
        if(bundle!=null)
        {
            String message[]=bundle.getStringArray("Array1");
            inputname1.setText(message[0]);
            inputregno1.setText(message[1]);
            inputcourse1.setText(message[2]);
            inputyear1.setText(message[3]);
            inputaddress1.setText(message[4]);


        }
        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name2=editname2.getText().toString().trim();
                regno2=editregno2.getText().toString().trim();
                course2=editcourse2.getText().toString().trim();
                year2=edityear2.getText().toString().trim();
                address2=editaddress2.getText().toString().trim();
                obj2.InputsFromPerson2(name2,regno2,course2,year2,address2);

            }
        });
        return view;
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {

            obj2=(person2) context;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}