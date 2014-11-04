package artlite.com.androidsupportlibraryproject.ui.activities;

import android.graphics.Color;
import android.os.Bundle;

import com.artlite.library.compilation.ui.activities.BaseLibraryActivity;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

import artlite.com.androidsupportlibraryproject.R;

public class ChartActivity extends BaseLibraryActivity {

    private LineChart mChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);
        setHeaderToUpperCase(getString(R.string.title_activity_chart));
        mChart = (LineChart) findViewById(R.id.lineChart1);
        setData(10, 10);

//        mChart.setDrawUnitsInChart(true);
//        mChart.setStartAtZero(false);
//        mChart.setDrawYValues(false);
//        mChart.setDrawBorder(true);
//        mChart.setBorderPositions(new BarLineChartBase.BorderPosition[]{
//                BarLineChartBase.BorderPosition.BOTTOM
//        });
        mChart.setDescription("");
//        mChart.setNoDataTextDescription("You need to provide data for the chart.");
        mChart.setHighlightEnabled(true);
        mChart.setTouchEnabled(true);
        mChart.setDragEnabled(true);
        mChart.setScaleEnabled(true);
        mChart.setPinchZoom(true);

    }

    private void setData(int count, float range) {
        ArrayList<String> xVals = new ArrayList<String>();
        for (int i = 0; i < count; i++) {
            xVals.add((i) + "");
        }
        ArrayList<Entry> yVals = new ArrayList<Entry>();
        for (int i = 0; i < count; i++) {
            float mult = (range + 1);
            float val = (float) (Math.random() * mult) + 3;// + (float)
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
//        LimitLine ll1 = new LimitLine(130f);
//        ll1.setLineWidth(4f);
//        ll1.enableDashedLine(10f, 10f, 0f);
//        ll1.setDrawValue(true);
//        ll1.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT);
//        LimitLine ll2 = new LimitLine(-30f);
//        ll2.setLineWidth(4f);
//        ll2.enableDashedLine(10f, 10f, 0f);
//        ll2.setDrawValue(true);
//        ll2.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT);
//        data.addLimitLine(ll1);
//        data.addLimitLine(ll2);
        mChart.setData(data);
        mChart.fitScreen();
    }

}
