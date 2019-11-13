package aashish.coventry.esoftwarica.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import aashish.coventry.esoftwarica.Adapter.StudentAdapter;
import aashish.coventry.esoftwarica.R;
import aashish.coventry.esoftwarica.model.Student;

/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayFragment extends Fragment {
    TextView tvname;

    RecyclerView recyclerView;

    List<Student> studentList = new ArrayList<>();

    public DisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_display, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);


        StudentAdapter studentAdapter = new StudentAdapter(this, studentList);
        recyclerView.setAdapter(studentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));



        return view;
    }

}
