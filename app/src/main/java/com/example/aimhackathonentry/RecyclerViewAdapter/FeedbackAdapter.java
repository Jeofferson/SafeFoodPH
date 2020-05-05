package com.example.aimhackathonentry.RecyclerViewAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aimhackathonentry.ObjectModels.Feedback;
import com.example.aimhackathonentry.R;

import java.util.List;

public class FeedbackAdapter extends RecyclerView.Adapter<FeedbackAdapter.FeedbackViewHolder> {


    private List<Feedback> feedbackList;

    private Context context;


    public FeedbackAdapter(List<Feedback> feedbackList) {
        this.feedbackList = feedbackList;
    }


    @NonNull
    @Override
    public FeedbackViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();

        View view = LayoutInflater.from(context).inflate(R.layout.row_feedback, parent, false);

        return new FeedbackViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull FeedbackViewHolder holder, int position) {

        Feedback feedback = feedbackList.get(position);

        holder.lblRating.setText(String.valueOf(feedback.getRating()));
        holder.lblDescription.setText(feedback.getDescription());

    }


    @Override
    public int getItemCount() {
        return feedbackList.size();
    }


    public class FeedbackViewHolder extends RecyclerView.ViewHolder {

        private TextView lblRating;
        private TextView lblDescription;

        public FeedbackViewHolder(@NonNull View itemView) {
            super(itemView);

            lblRating = itemView.findViewById(R.id.lblRating);
            lblDescription = itemView.findViewById(R.id.lblDescription);

        }

    }


}
