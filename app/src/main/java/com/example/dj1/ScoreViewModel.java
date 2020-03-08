package com.example.dj1;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {

    private MutableLiveData<Integer> score;

    public MutableLiveData<Integer> getScore() {
        if (score == null) {
            score = new MutableLiveData<>();
            resetScore();
        }
        return score;
    }

    public void addScore() {
        if (score.getValue() != null) {
            score.setValue(score.getValue() + 1);
        }
    }

    void resetScore() {
        score.setValue(0);
    }
}
