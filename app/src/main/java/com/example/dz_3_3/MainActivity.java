package com.example.dz_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> addList_one, addList_two, addList_three;
    ArrayList<String> arrayList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List();
        initId();
        Finish();
        Metods_one();
        Metods_two();
        Metods_three();
    }

    private void Metods_three() {
        addList_three = new ArrayList<>();
        addList_three.add(12001);
        addList_three.add(29384);
        addList_three.add(12384);
        addList_three.add(909345);
        addList_three.add(34289);
        addList_three.add(001);
        addList_three.add(002);
        addList_three.add(003);

        int evenSum = 0;
        int oddProduct = 1;

        for (int number : addList_three) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddProduct *= number;
            }
        }
        System.out.println("Сумма четных чисел: " + evenSum);
        System.out.println("Произведение нечетных чисел: " + oddProduct);
    }

    private void Metods_two() {
        addList_two = new ArrayList<>();
        addList_two.add(10002);
        addList_two.add(293);
        addList_two.add(123);
        addList_two.add(4352);
        addList_two.add(96354);
        addList_two.add(816);
        addList_two.add(992);
        addList_two.add(984);
        addList_two.add(884);
        addList_two.add(38);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int number : addList_two) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }
        System.out.println("Четные числа: " + evenNumbers);
        System.out.println("Нечетные числа: " + oddNumbers);
    }


    private void Metods_one() {
        addList_one = new ArrayList<>();
        addList_one.add(9991);
        addList_one.add(821923);
        addList_one.add(2832);
        addList_one.add(22);
        addList_one.add(1120);
        addList_one.add(109);
        addList_one.add(103);
        addList_one.add(1033);
        addList_one.add(1233);
        Comparator<Integer> comparator = Collections.reverseOrder();
        Collections.sort(addList_one, comparator);
        for (Integer i : addList_one) {
            System.out.println(i);
        }

    }

    private void Finish() {
        ContactAdapter adapter = new ContactAdapter(arrayList);
        recyclerView.setAdapter(adapter);
    }

    private void initId() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void List() {
        arrayList = new ArrayList<>();
        arrayList.add("ZULFIA");
        arrayList.add("VARIS");
        arrayList.add("KENCH");
        arrayList.add("SULTAN");
        arrayList.add("BAYAS");
        arrayList.add("RYSYA");
    }


}
