package com.example.homeworkinstagram.homeFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homeworkinstagram.R;
import com.example.homeworkinstagram.models.Model;

import java.util.ArrayList;

public class homeFragment extends Fragment {

    private HomeAdapter adapter;
    private ArrayList<Model> list = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
    }
    private void createList() {
        list = new ArrayList<>();
        list.add(new Model("New York city,how go to this city?",R.drawable.image));
        list.add(new Model("Do you say,why this name how first video,i say:<<F*CK YOU",R.drawable.image));

    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.rv_recycler);
        adapter = new HomeAdapter();
        adapter.setList(list);
        recyclerView.setAdapter(adapter);
    }
}