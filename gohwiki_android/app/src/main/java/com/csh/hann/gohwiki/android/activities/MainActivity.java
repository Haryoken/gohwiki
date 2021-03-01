package com.csh.hann.gohwiki.android.activities;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.csh.hann.gohwiki.R;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText textFullname;
    private  AutoCompleteTextView searchView;
    private  AutoCompleteTextView textProgrammingLanguage;

    private Button buttonSubmit;

    private String[] countries = {"Vietnam","England","Canada", "France","Australia"};

    private String[] languages={"Java ","CSharp","Visual Basic","Swift","C/C++"};

    private String[] searches={"Tôn Quyền","Thanh Vũ","Lưu Bị","Đổng Trác", "Lưu Kham", "Quan Vũ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = findViewById(R.id.autoCompleteTextView);

        List<String> autofill = Arrays.asList(searches);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, autofill);

        searchView.setAdapter(adapter);

    }
}
