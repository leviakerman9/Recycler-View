package com.example.androidprojects;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class projectAdapter extends RecyclerView.Adapter<projectAdapter.projectViewHolder> {


     private project[] projects;

    public projectAdapter(project[] projects) {
        this.projects = projects;
    }

    @Override
    public int getItemCount() {
        return projects.length;
    }

    @NonNull
    @Override
    public projectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_project,parent,false);
        return new projectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull projectViewHolder holder, int position) {
            holder.bind(projects[position]);
    }



    static  class projectViewHolder extends RecyclerView.ViewHolder{

        ImageView appImage;
        TextView appText;
        TextView appDescription;


        public projectViewHolder(@NonNull View itemView) {

            super(itemView);
            appImage=itemView.findViewById(R.id.project1_icon);
            appText=itemView.findViewById(R.id.project1_title);
            appDescription=itemView.findViewById(R.id.project1_description);
        }
        public void bind(project project){

            appImage.setImageResource(project.image);
            appText.setText(project.name);
            appDescription.setText(project.description);
        }
    }
}
