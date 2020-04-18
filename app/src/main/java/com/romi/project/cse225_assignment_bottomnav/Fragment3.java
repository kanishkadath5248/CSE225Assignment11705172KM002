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

public class Fragment3 extends Fragment {
    private EditText editname3, editregno3, editcourse3, edityear3, editaddress3;
    private Button add3;
    person3 obj3;
    TextView inputname2,inputregno2,inputcourse2,inputyear2,inputaddress2,head3;
    String name3,regno3,course3,year3,address3,h3;
    public interface person3 {
        void InputsFromPerson3(String name3, String regno3,String course3,String year3,String address3);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment3, container, false);
        editname3 = (EditText) view.findViewById(R.id.name3);
        editregno3 = (EditText) view.findViewById(R.id.regno3);
        editcourse3 = (EditText) view.findViewById(R.id.course3);
        edityear3 = (EditText) view.findViewById(R.id.year3);
        editaddress3 = (EditText) view.findViewById(R.id.address3);
        add3 = (Button) view.findViewById(R.id.add3);
        inputname2=view.findViewById(R.id.inputname2);
        inputregno2=view.findViewById(R.id.inputregno2);
        inputcourse2=view.findViewById(R.id.inputcourse2);
        inputyear2=view.findViewById(R.id.inputyear2);
        inputaddress2=view.findViewById(R.id.inputaddres2);
        Bundle bundle=getArguments();
        if(bundle!=null)
        {
            String message2[]=bundle.getStringArray("Array2");
            inputname2.setText(message2[0]);
            inputregno2.setText(message2[1]);
            inputcourse2.setText(message2[2]);
            inputyear2.setText(message2[3]);
            inputaddress2.setText(message2[4]);
        }
        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name3=editname3.getText().toString().trim();
                regno3=editregno3.getText().toString().trim();
                course3=editcourse3.getText().toString().trim();
                year3=edityear3.getText().toString().trim();
                address3=editaddress3.getText().toString().trim();

                obj3.InputsFromPerson3(name3,regno3,course3,year3,address3);

            }
        });
        return view;
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {

            obj3=(person3) context;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}