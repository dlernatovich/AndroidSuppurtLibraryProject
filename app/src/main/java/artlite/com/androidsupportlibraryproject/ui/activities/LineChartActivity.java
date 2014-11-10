package artlite.com.androidsupportlibraryproject.ui.activities;

import android.graphics.Color;
import android.os.Bundle;

import com.artlite.library.compilation.ui.activities.BaseLibraryActivity;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.Arrays;

import artlite.com.androidsupportlibraryproject.R;
import butterknife.InjectView;

public class LineChartActivity extends BaseLibraryActivity {

    @InjectView(R.id.lineChart1)
    LineChart mChart;

    private static final String[] X_VALUES = new String[]{
            "Monday", "Tuesday", "Wednesday", "Friday"
    };

    private static final float[] Y_VALUES = new float[]{
            12.7f, 15.5f, 22.5f, -6.5f
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_chart);
        startAsyncTask();
    }

    @Override
    protected void initialize() {
        initializeData(X_VALUES, Y_VALUES);
        initializeGraph(mChart);
    }

    @Override
    public void onPreExecute() {
        super.onPreExecute();
        showWaitingDialog();
    }

    @Override
    public void doInBackground() {
        super.doInBackground();
        initialize();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onPostExecute() {
        super.onPostExecute();
        hideWaitingDialog();
        mChart.fitScreen();
    }

    private void initializeGraph(LineChart mChart) {
        if (mChart != null) {
            mChart.setDrawUnitsInChart(true);
            mChart.setStartAtZero(false);
            mChart.setDrawYValues(false);
            mChart.setDrawBorder(true);
            mChart.setDrawXLabels(true);
            mChart.setBorderPositions(new BarLineChartBase.BorderPosition[]{
                    BarLineChartBase.BorderPosition.BOTTOM
            });
            mChart.setDescription("");
            mChart.setHighlightEnabled(true);
            mChart.setTouchEnabled(true);
            mChart.setDragEnabled(true);
            mChart.setScaleEnabled(true);
            mChart.setPinchZoom(true);
            mChart.getLegend().setTextColor(Color.WHITE);
            mChart.getXLabels().setTextColor(Color.WHITE);
            mChart.getYLabels().setTextColor(Color.WHITE);
        }
    }

    private void initializeData(String[] xValues, float[] yValues) {
        ArrayList<String> xVals = new ArrayList<String>(Arrays.asList(xValues));
        ArrayList<Entry> yVals = new ArrayList<Entry>();
        for (int i = 0; i < yValues.length; i++) {
            float val = yValues[i];
            yVals.add(new Entry(val, i));
        }
        LineDataSet set1 = new LineDataSet(yVals, "DataSet 1");
        set1.enableDashedLine(10f, 5f, 0f);
        set1.setColor(Color.BLACK);
        set1.setCircleColor(Color.BLACK);
        set1.setLineWidth(1f);
        set1.setCircleSize(4f);
        set1.setFillAlpha(0);
        ArrayList<LineDataSet> dataSets = new ArrayList<LineDataSet>();
        dataSets.add(set1); // add the datasets
        LineData data = new LineData(xVals, dataSets);
        mChart.setData(data);
        mChart.setValueTextColor(Color.WHITE);
    }

}
