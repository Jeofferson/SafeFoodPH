package com.example.aimhackathonentry.Tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aimhackathonentry.DummyData.Entities;
import com.example.aimhackathonentry.ObjectModels.Feedback;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.RecyclerViewAdapter.FeedbackAdapter;
import com.example.aimhackathonentry.RecyclerViewAdapter.ProductAdapter;
import com.example.aimhackathonentry.SessionVariables.SuperGlobals;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;
import java.util.Random;


public class TabDashboard extends Fragment {


    private FeedbackAdapter feedbackAdapter;

    private View view;

    private LineChart lineChartTransactions;

    private RecyclerView recyclerViewFeedbacks;


    public TabDashboard() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tab_dashboard, container, false);

        prepareLineChartView();

        prepareRecyclerView();

        return view;

    }


    private void prepareLineChartView() {

        ArrayList<Entry> soldArrayList = new ArrayList<>();
        ArrayList<Entry> tradedArrayList = new ArrayList<>();

        for (int i = 225; i < 275; i++) {

            if (i % 10 == 0) {

                soldArrayList.add(new Entry(i, randInt(i, i * i)));
                tradedArrayList.add(new Entry(i, randInt(i, i * i)));

            }

        }

//        Log.e("jeo d", deaths + "");
//        Log.e("jeo r", recovered + "");

        LineDataSet lineDataSet1 = new LineDataSet(soldArrayList, "Sold");
        lineDataSet1.setLineWidth(3f);
        lineDataSet1.setColor(getResources().getColor(R.color.red));
        lineDataSet1.setFillAlpha(110);
        lineDataSet1.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet1.setDrawCircles(false);
        lineDataSet1.setDrawValues(false);

        LineDataSet lineDataSet2 = new LineDataSet(tradedArrayList, "Traded");
        lineDataSet2.setLineWidth(3f);
        lineDataSet2.setColor(getResources().getColor(R.color.green));
        lineDataSet2.setFillAlpha(110);
        lineDataSet2.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet2.setDrawCircles(false);
        lineDataSet2.setDrawValues(false);

        ArrayList<ILineDataSet> iLineDataSetArrayList = new ArrayList<>();
        iLineDataSetArrayList.add(lineDataSet1);
        iLineDataSetArrayList.add(lineDataSet2);

        LineData lineData = new LineData(iLineDataSetArrayList);

        Description description = new Description();
        description.setText(String.format("*chart data from the last %s months", soldArrayList.size()));
//        description.setTextColor(getResources().getColor(R.color.currentText2));

        lineChartTransactions = view.findViewById(R.id.lineChartTransactions);

        // Animation
//        lineChartTransactions.animateXY(Constants.ANIMATION_DURATION, Constants.ANIMATION_DURATION);

        // Get axis
        XAxis xAxis = lineChartTransactions.getXAxis();
        YAxis yAxisLeft = lineChartTransactions.getAxisLeft();
        YAxis yAxisRight = lineChartTransactions.getAxisRight();

        // Set data
        lineChartTransactions.setData(lineData);
        lineChartTransactions.setDescription(description);

        // Set legends
//        lineChartTransactions.getLegend().setTextColor(getResources().getColor(R.color.currentText2));

        // Set labels
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawLabels(false);
        yAxisLeft.setDrawLabels(false);
//        yAxisRight.setTextColor(getResources().getColor(R.color.currentText2));

        // Set borders
        xAxis.setDrawAxisLine(false);
        yAxisLeft.setDrawAxisLine(false);
        yAxisRight.setDrawAxisLine(false);

        // Set grid lines
        xAxis.setDrawGridLines(false);
//        xAxis.setGridColor(getResources().getColor(R.color.currentText2));
        yAxisLeft.setDrawGridLines(false);
        yAxisRight.setDrawGridLines(false);
//        yAxisLeft.setGridColor(getResources().getColor(R.color.currentText2));
//        yAxisRight.setGridColor(getResources().getColor(R.color.currentText2));

        // Set behavior
        lineChartTransactions.getData().setHighlightEnabled(false);
        lineChartTransactions.setDoubleTapToZoomEnabled(false);
        lineChartTransactions.setDragEnabled(true);
        lineChartTransactions.setScaleEnabled(true);

        // Show
        lineChartTransactions.invalidate();

//        progressBar.setVisibility(View.GONE);

    }


    public static int randInt(int min, int max) {

        int randomNum = new Random().nextInt((max - min) + 1) + min;

        return randomNum;

    }


    private void prepareRecyclerView() {

        recyclerViewFeedbacks = view.findViewById(R.id.recyclerViewFeedbacks);
        recyclerViewFeedbacks.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerViewFeedbacks.setNestedScrollingEnabled(false);

        queryFeedbacks();

    }


    private void queryFeedbacks() {

        SuperGlobals.feedbackList = Entities.feedbackList;
        updateRecyclerView();

    }


    private void updateRecyclerView() {

        feedbackAdapter = new FeedbackAdapter(SuperGlobals.feedbackList);
        recyclerViewFeedbacks.setAdapter(feedbackAdapter);

    }


}
