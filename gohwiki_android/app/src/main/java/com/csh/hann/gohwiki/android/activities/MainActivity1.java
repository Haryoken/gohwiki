package com.csh.hann.gohwiki.android.activities;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.csh.hann.gohwiki.R;
import com.csh.hann.gohwiki.android.ui.search.SuggestFragment;
import com.google.android.material.button.MaterialButtonToggleGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainActivity1 extends AppCompatActivity {

//    private EditText textFullname;
//    private  AutoCompleteTextView searchView;
//    private  AutoCompleteTextView textProgrammingLanguage;
//
//    private Button buttonSubmit;
//
//    private String[] countries = {"Vietnam","England","Canada", "France","Australia"};
//
//    private String[] languages={"Java ","CSharp","Visual Basic","Swift","C/C++"};
//
//    private String[] searches={"Tôn Quyền","Thanh Vũ","Lưu Bị","Đổng Trác", "Lưu Kham", "Quan Vũ"};
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main_1);
//
//        searchView = findViewById(R.id.autoCompleteTextView);
//
//        List<String> autofill = Arrays.asList(searches);
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_dropdown_item_1line, autofill);
//
//        searchView.setAdapter(adapter);
//
//    }

    private ListView lv;
    private ArrayAdapter<String> adapter;
    private ArrayAdapter<String> blankAdapter;
    private EditText inputSearch;
    private TextView listItem;
    private ArrayList<HashMap<String, String>> productList;
    private FragmentManager fm;
    private MaterialButtonToggleGroup btnSearch;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_1);

        fm = getSupportFragmentManager();

        searchByToggleButton();


    }
    private void searchByToggleButton(){
        SuggestFragment searchFragment = new SuggestFragment();
        btnSearch = (MaterialButtonToggleGroup) findViewById(R.id.toggleSearch);
        btnSearch.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
            @Override
            public void onButtonChecked(MaterialButtonToggleGroup group, int checkedId, boolean isChecked) {
                FragmentTransaction ftAdd = fm.beginTransaction();
                System.out.println("aaaa");
                if(isChecked){
                    ftAdd.add(R.id.frame_layout, searchFragment);
                }else{
                    ftAdd.remove(searchFragment);
                }
                ftAdd.commit();
            }
        });
    }

    private void searchByEditText(){
//        inputSearch = (EditText) findViewById(R.id.inputSearch);
//        inputSearch.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction ftAdd = fm.beginTransaction();
//                ftAdd.add(R.id.frame_layout, new SuggestFragment());
//                ftAdd.commit();
//            }
//        });
//
//        inputSearch.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                FragmentTransaction ftAdd = fm.beginTransaction();
//                ftAdd.add(R.id.frame_layout, new SuggestFragment());
//                ftAdd.commit();
//            }
//        });
    }
    private void processView(){
//        String products[] = {"Dell Inspiron", "HTC One X", "HTC Wildfire S", "HTC Sense", "HTC Sensation XE",
//                "iPhone 4S", "Samsung Galaxy Note 800",
//                "Samsung Galaxy S3", "MacBook Air", "Mac Mini", "MacBook Pro"};
//
//        String blankProducts[] = {""};
//
//        inputSearch = (EditText) findViewById(R.id.inputSearch);
//        inputSearch.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                MainActivity1.this.adapter.getFilter().filter(s);
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//
//        lv = (ListView) findViewById(R.id.list_view);
//        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, products);
//        blankAdapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, blankProducts);
//        inputSearch.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if(hasFocus){
//                    lv.setAdapter(adapter);
//                }else{
//                    lv.setAdapter(blankAdapter);
//                }
//
//            }
//        });
//
//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                System.out.println(lv.getItemAtPosition(position).toString());
//            }
//        });
    }
}
