package com.simpleprogrammer.protreintracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Javier.Ramirez on 14/12/2018.
 */
public class TrackingService {


    private int total;
    private int goal;
    private List<HistoryItem> history = new ArrayList<HistoryItem>();
    private int historyId = 0;

    public void addProtein(int amount)
    {
        total += amount;
ped        history.add(new HistoryItem(historyId++, amount, "add", total));
    }

    public void removeProtein(int amount)
    {
        total -= amount;
        if(total < 0)
            total = 0;

        history.add(new HistoryItem(historyId++, amount, "subtract", total));
    }

    public int getTotal() {
        return total;
    }

    public void setGoal(int value) throws InvalidGoalException {
        if(value < 0)
            throw new InvalidGoalException("Goal was less than zero!");
        goal = value;
    }

    public boolean isGoalMet() {
        return total >= goal;
    }

    public List<HistoryItem> getHistory() {
        return history;
    }

}
