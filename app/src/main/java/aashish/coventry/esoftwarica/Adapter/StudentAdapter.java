package aashish.coventry.esoftwarica.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import aashish.coventry.esoftwarica.R;
import aashish.coventry.esoftwarica.fragment.AddFragment;
import aashish.coventry.esoftwarica.fragment.DisplayFragment;
import aashish.coventry.esoftwarica.model.Student;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.DisplayViewHolder> {

    DisplayFragment context;
    List<Student> studentList;

    public StudentAdapter(DisplayFragment context, List<Student> studentList) {
        this.context =  context;
        this.studentList = studentList;
    }


    @NonNull
    @Override
    public DisplayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.displayview,parent,false);
        return new DisplayViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DisplayViewHolder holder, int position) {
        final Student details = studentList.get(position);


        holder.tvName.setText(details.getName());
        holder.tvAge.setText(details.getAge());
        holder.tvAddress.setText(details.getAddress());
        holder.tvGender.setText(details.getGender());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class DisplayViewHolder extends RecyclerView.ViewHolder {
        TextView tvName,tvAge,tvGender,tvAddress;
        public DisplayViewHolder(@NonNull View itemView) {
            super(itemView);
            tvAddress = itemView.findViewById(R.id.tvAddress);
            tvName = itemView.findViewById(R.id.tvName);
            tvGender = itemView.findViewById(R.id.tvGender);
            tvAge = itemView.findViewById(R.id.tvAge);
        }
    }
}
