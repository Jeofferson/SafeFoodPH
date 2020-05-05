package com.example.aimhackathonentry.ObjectModels;

public class Feedback {


    private int feedbackId;

    private int rating;
    private String description;


    public Feedback(int feedbackId, int rating, String description) {
        this.feedbackId = feedbackId;
        this.rating = rating;
        this.description = description;
    }


    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
