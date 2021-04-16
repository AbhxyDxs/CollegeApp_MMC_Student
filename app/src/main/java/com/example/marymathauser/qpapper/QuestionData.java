package com.example.marymathauser.qpapper;

public class QuestionData {

    public QuestionData() {

    }

    private String questiontitle, QuestionUrl;

    public QuestionData(String questiontitle, String questionUrl) {
        this.questiontitle = questiontitle;
        QuestionUrl = questionUrl;
    }

    public String getQuestiontitle() {
        return questiontitle;
    }

    public void setQuestiontitle(String questiontitle) {
        this.questiontitle = questiontitle;
    }

    public String getQuestionUrl() {
        return QuestionUrl;
    }

    public void setQuestionUrl(String questionUrl) {
        QuestionUrl = questionUrl;
    }
}