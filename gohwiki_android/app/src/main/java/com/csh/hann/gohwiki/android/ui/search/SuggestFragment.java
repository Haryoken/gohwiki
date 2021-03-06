package com.csh.hann.gohwiki.android.ui.search;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.csh.hann.gohwiki.R;
import com.csh.hann.gohwiki.android.activities.MainActivity1;
import com.csh.hann.gohwiki.android.ui.dashboard.DashboardViewModel;
import com.csh.hann.gohwiki.engine.entities.Hero;
import com.csh.hann.gohwiki.engine.enums.Language;
import com.csh.hann.gohwiki.engine.services.MainService;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class SuggestFragment extends Fragment {

    private ListView lv;
    private ArrayAdapter<String> adapter;
    private ArrayAdapter<String> blankAdapter;
    private EditText inputSearch;
    private TextView listItem;
    private ArrayList<HashMap<String, String>> productList;
    private MainService mainService;
    private List<String> suggestList;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        mainService = new MainService(Language.VI, this.getContext());
        initSuggestList();
        View root = inflater.inflate(R.layout.fragment_search_suggestion, container, false);
        root = buildFragment(root);
        return root;
    }

    private void initSuggestList(){
        suggestList = new ArrayList<>();
        List<Hero> heroList = mainService.getAllHeroes();
        for (Hero hero: heroList) {
            suggestList.add(hero.getName());
        }
    }

    private View buildFragment(View view){

        String blankProducts[] = {""};

        inputSearch = (EditText) view.findViewById(R.id.etSearch);
        lv = (ListView) view.findViewById(R.id.lvSuggest);
        adapter = new ArrayAdapter<String>(view.getContext(), R.layout.list_item, R.id.product_name, suggestList);
        blankAdapter = new ArrayAdapter<String>(view.getContext(), R.layout.list_item, R.id.product_name, blankProducts);

        settingInputSearch();
        settingListView();
        return  view;
    }

    private void settingInputSearch(){
        inputSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                SuggestFragment.this.adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        inputSearch.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    lv.setAdapter(adapter);
                }else{
                    lv.setAdapter(blankAdapter);
                }

            }
        });
    }
    private void settingListView(){
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println(lv.getItemAtPosition(position).toString());
            }
        });
    }
}
