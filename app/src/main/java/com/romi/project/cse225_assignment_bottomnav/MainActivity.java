package com.romi.project.cse225_assignment_bottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements Fragment1.person1,Fragment2.person2,Fragment3.person3 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentplace,new Fragment1()).commit();

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomnav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment1 fragment1=new Fragment1();
                Fragment2 fragment2=new Fragment2();
                Fragment3 fragment3=new Fragment3();

                Fragment choosenFragnment=null;
                switch (menuItem.getItemId())
                {
                    case R.id.person1 :
                        choosenFragnment=fragment1;
                        break;
                    case R.id.person2 :
                        choosenFragnment=fragment2;
                        break;
                    case R.id.person3 :
                        choosenFragnment=fragment3;


                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentplace,choosenFragnment).commit();
                return true;
            }
        });
    }

    @Override
    public void InputsFromPerson1(String name1, String regno1, String course1, String year1, String address1)
    {
        Fragment2 fragment2 =new Fragment2();
        String array1 []={name1,regno1,course1,year1,address1};
        Bundle bundle=new Bundle();
        bundle.putStringArray("Array1",array1);

        fragment2.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentplace,fragment2).commit();



    }

    @Override
    public void InputsFromPerson2(String name2, String regno2, String course2, String year2, String address2) {

        Fragment3 fragment3 =new Fragment3();
        String array2 []={name2,regno2,course2,year2,address2};
        Bundle bundle=new Bundle();
        bundle.putStringArray("Array2",array2);


        fragment3.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentplace,fragment3).commit();

    }

    @Override
    public void InputsFromPerson3(String name3, String regno3, String course3, String year3, String address3)
    {
        Fragment1 fragment1=new Fragment1();
        String array3 []={name3,regno3,course3,year3,address3};
        Bundle bundle=new Bundle();
        bundle.putStringArray("Array3",array3);

        fragment1.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentplace,fragment1).commit();


    }
}
