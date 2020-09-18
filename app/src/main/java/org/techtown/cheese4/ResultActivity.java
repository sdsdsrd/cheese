package org.techtown.cheese4;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class ResultActivity extends AppCompatActivity {

    private LineChart lineChart;
    int[] question = new int[12];
    String[] title = new String[4];
    String[] name = new String[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        lineChart = (LineChart)findViewById(R.id.chart);
        ImageView iv0 = (ImageView)findViewById(R.id.iv0);

        title[0] = getIntent().getStringExtra("hobby1");
        name[0] = getIntent().getStringExtra("name1");
        title[1] = getIntent().getStringExtra("hobby2");
        name[1] = getIntent().getStringExtra("name2");
        title[2] = getIntent().getStringExtra("hobby3");
        name[2] = getIntent().getStringExtra("name3");
        title[3] = getIntent().getStringExtra("hobby4");
        name[3] = getIntent().getStringExtra("name4");

        question = getIntent().getIntArrayExtra("question");

        int image = 0;
        for(int i=0; i<4; i++) {
            if(title[i].equals("그림")) image = R.drawable.paint;
            else if(title[i].equals("글쓰기")) image = R.drawable.write;
            else if(title[i].equals("기타")) image = R.drawable.guitar;
            else if(title[i].equals("노래부르기")) image = R.drawable.sing;
            else if(title[i].equals("다이어리")) image = R.drawable.diary;
            else if(title[i].equals("드라마")) image = R.drawable.drama;
            else if(title[i].equals("사격")) image = R.drawable.shooting;
            else if(title[i].equals("산책")) image = R.drawable.walking;
            else if(title[i].equals("쇼핑")) image = R.drawable.shopping;
            else if(title[i].equals("수영")) image = R.drawable.swim;
            else if(title[i].equals("술")) image = R.drawable.alcohol;
            else if(title[i].equals("여행")) image = R.drawable.travel;
            else if(title[i].equals("영화감상")) image = R.drawable.movie;
            else if(title[i].equals("요리")) image = R.drawable.cook;
            else if(title[i].equals("운동")) image = R.drawable.exercise;
            else if(title[i].equals("웹툰보기")) image = R.drawable.webtoon;
            else if(title[i].equals("유튜브")) image = R.drawable.youtube;
            else if(title[i].equals("음악감상")) image = R.drawable.music;
            else if(title[i].equals("잠")) image = R.drawable.sleep;
            else if(title[i].equals("독서")) image = R.drawable.reading;
            else if(title[i].equals("축구")) image = R.drawable.soccer;
            else if(title[i].equals("큐시즘")) image = R.drawable.kusitms;
            else if(title[i].equals("컴퓨터게임")) image = R.drawable.game;
            else if(title[i].equals("필라테스")) image = R.drawable.pilates;
            else if(title[i].equals("스마트폰")) image = R.drawable.smartphone;

            String ImageId = "iv" + i ;
            int resID = getResources().getIdentifier(ImageId, "id", getPackageName());
            ImageView iv = ((ImageView) findViewById(resID));
            iv.setImageResource(image);

            String NameId = "tv" + i ;
            int nameID = getResources().getIdentifier(NameId, "id", getPackageName());
            TextView tv = ((TextView) findViewById(nameID));
            tv.setText(name[i]);
            //이미지로 변경
        }

        List<Entry> entries = new ArrayList<>();
        entries.add(new Entry(1, (question[0])));
        entries.add(new Entry(2, (question[1])));
        entries.add(new Entry(3, (question[2])));
        entries.add(new Entry(4, (question[3])));
        entries.add(new Entry(5, (question[4])));
        entries.add(new Entry(6, (question[5])));
        entries.add(new Entry(7, (question[6])));
        entries.add(new Entry(8, (question[7])));
        entries.add(new Entry(9, (question[8])));
        entries.add(new Entry(10, (question[9])));
        entries.add(new Entry(11, (question[10])));
        entries.add(new Entry(12, (question[11])));

        LineDataSet lineDataSet = new LineDataSet(entries, "조사결과");
        lineDataSet.setLineWidth(2);
        lineDataSet.setCircleRadius(6);
        lineDataSet.setCircleColor(Color.parseColor("#FFA1B4DC"));
        lineDataSet.setCircleHoleColor(Color.YELLOW);
        lineDataSet.setColor(Color.parseColor("#FFA1B4DC"));
        lineDataSet.setDrawCircleHole(true);
        lineDataSet.setDrawCircles(true);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawHighlightIndicators(false);
        lineDataSet.setDrawValues(false);

        LineData lineData = new LineData(lineDataSet);
        lineChart.setData(lineData);

        XAxis xAxis = lineChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextColor(Color.BLACK);
        xAxis.enableGridDashedLine(8, 24, 0);

        YAxis yLAxis = lineChart.getAxisLeft();
        yLAxis.setTextColor(Color.BLACK);

        YAxis yRAxis = lineChart.getAxisRight();
        yRAxis.setDrawLabels(false);
        yRAxis.setDrawAxisLine(false);
        yRAxis.setDrawGridLines(false);

        Description description = new Description();
        description.setText("");

        lineChart.setDoubleTapToZoomEnabled(false);
        lineChart.setDrawGridBackground(false);
        lineChart.setDescription(description);
        lineChart.animateY(2000, Easing.EaseInCubic);
        lineChart.invalidate();

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ClassActivity.class);

                intent.putExtra("name1", name[0]);
                intent.putExtra("hobby1", title[0]);
                intent.putExtra("name2", name[1]);
                intent.putExtra("hobby2", title[1]);
                intent.putExtra("name3", name[2]);
                intent.putExtra("hobby3", title[2]);
                intent.putExtra("name4", name[3]);
                intent.putExtra("hobby4", title[3]);

                startActivity(intent);
            }
        });
    }
}
