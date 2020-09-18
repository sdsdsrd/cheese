package org.techtown.cheese4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class TestActivity extends AppCompatActivity {
    RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4, radioGroup5, radioGroup6, radioGroup7, radioGroup8, radioGroup9, radioGroup10, radioGroup11, radioGroup12;

    TextView selectedNum1, selectedNum2, selectedNum3, selectedNum4, selectedNum5, selectedNum6, selectedNum7, selectedNum8, selectedNum9, selectedNum10, selectedNum11, selectedNum12;
    ProgressBar progressBar;
    TextView percent;
    Button button;
    int[] arr = new int[12];
    int lastclick1, lastclick2, lastclick3, lastclick4, lastclick5, lastclick6, lastclick7, lastclick8, lastclick9, lastclick10, lastclick11, lastclick12;
    int click = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        percent = (TextView) findViewById(R.id.percent);

        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);
        radioGroup4 = (RadioGroup) findViewById(R.id.radioGroup4);
        radioGroup5 = (RadioGroup) findViewById(R.id.radioGroup5);
        radioGroup6 = (RadioGroup) findViewById(R.id.radioGroup6);
        radioGroup7 = (RadioGroup) findViewById(R.id.radioGroup7);
        radioGroup8 = (RadioGroup) findViewById(R.id.radioGroup8);
        radioGroup9 = (RadioGroup) findViewById(R.id.radioGroup9);
        radioGroup10 = (RadioGroup) findViewById(R.id.radioGroup10);
        radioGroup11 = (RadioGroup) findViewById(R.id.radioGroup11);
        radioGroup12 = (RadioGroup) findViewById(R.id.radioGroup12);
        selectedNum1 = (TextView) findViewById(R.id.selectedNum1);
        selectedNum2 = (TextView) findViewById(R.id.selectedNum2);
        selectedNum3 = (TextView) findViewById(R.id.selectedNum3);
        selectedNum4 = (TextView) findViewById(R.id.selectedNum4);
        selectedNum5 = (TextView) findViewById(R.id.selectedNum5);
        selectedNum6 = (TextView) findViewById(R.id.selectedNum6);
        selectedNum7 = (TextView) findViewById(R.id.selectedNum7);
        selectedNum8 = (TextView) findViewById(R.id.selectedNum8);
        selectedNum9 = (TextView) findViewById(R.id.selectedNum9);
        selectedNum10 = (TextView) findViewById(R.id.selectedNum10);
        selectedNum11 = (TextView) findViewById(R.id.selectedNum11);
        selectedNum12 = (TextView) findViewById(R.id.selectedNum12);
        lastclick1 = radioGroup1.getCheckedRadioButtonId();
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(lastclick1 == -1) {
                    click++;
                    progressBar.setProgress((int)Math.round(8.3 * click));
                    percent.setText(String.valueOf((int)Math.round(8.3 * click)) + " %");
                }
                lastclick1 = radioGroup1.getCheckedRadioButtonId();
                switch (checkedId) {
                    case R.id.radioButton1_1:
                        arr[0] = 1;
                        break;
                    case R.id.radioButton1_2:
                        arr[0] = 2;
                        break;
                    case R.id.radioButton1_3:
                        arr[0] = 3;
                        break;
                    case R.id.radioButton1_4:
                        arr[0] = 4;
                        break;
                    case R.id.radioButton1_5:
                        arr[0] = 5;
                        break;
                }
                if(radioGroup1.getCheckedRadioButtonId() != -1)
                selectedNum1.setText(String.valueOf(arr[0]));
            }
        });

        lastclick2 = radioGroup2.getCheckedRadioButtonId();
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(lastclick2 == -1) {
                    click++;
                    progressBar.setProgress((int)Math.round(8.3 * click));
                    percent.setText(String.valueOf((int)Math.round(8.3 * click)) + " %");
                }
                lastclick2 = radioGroup2.getCheckedRadioButtonId();
                switch (checkedId) {
                    case R.id.radioButton2_1:
                        arr[1] = 1;
                        break;
                    case R.id.radioButton2_2:
                        arr[1] = 2;
                        break;
                    case R.id.radioButton2_3:
                        arr[1] = 3;
                        break;
                    case R.id.radioButton2_4:
                        arr[1] = 4;
                        break;
                    case R.id.radioButton2_5:
                        arr[1] = 5;
                        break;
                }
                selectedNum2.setText(String.valueOf(arr[1]));
            }
        });

        lastclick3 = radioGroup3.getCheckedRadioButtonId();
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(lastclick3 == -1) {
                    click++;
                    progressBar.setProgress((int)Math.round(8.3 * click));
                    percent.setText(String.valueOf((int)Math.round(8.3 * click)) + " %");
                }
                lastclick3 = radioGroup3.getCheckedRadioButtonId();
                switch (checkedId) {
                    case R.id.radioButton3_1:
                        arr[2] = 1;
                        break;
                    case R.id.radioButton3_2:
                        arr[2] = 2;
                        break;
                    case R.id.radioButton3_3:
                        arr[2] = 3;
                        break;
                    case R.id.radioButton3_4:
                        arr[2] = 4;
                        break;
                    case R.id.radioButton3_5:
                        arr[2] = 5;
                        break;
                }
                selectedNum3.setText(String.valueOf(arr[2]));
            }
        });

        lastclick4 = radioGroup4.getCheckedRadioButtonId();
        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(lastclick4 == -1) {
                    click++;
                    progressBar.setProgress((int)Math.round(8.3 * click));
                    percent.setText(String.valueOf((int)Math.round(8.3 * click)) + " %");
                }
                lastclick4 = radioGroup4.getCheckedRadioButtonId();
                switch (checkedId) {
                    case R.id.radioButton4_1:
                        arr[3] = 1;
                        break;
                    case R.id.radioButton4_2:
                        arr[3] = 2;
                        break;
                    case R.id.radioButton4_3:
                        arr[3] = 3;
                        break;
                    case R.id.radioButton4_4:
                        arr[3] = 4;
                        break;
                    case R.id.radioButton4_5:
                        arr[3] = 5;
                        break;
                }
                selectedNum4.setText(String.valueOf(arr[3]));
            }
        });

        lastclick5 = radioGroup5.getCheckedRadioButtonId();
        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(lastclick5 == -1) {
                    click++;
                    progressBar.setProgress((int)Math.round(8.3 * click));
                    percent.setText(String.valueOf((int)Math.round(8.3 * click)) + " %");
                }
                lastclick5 = radioGroup5.getCheckedRadioButtonId();
                switch (checkedId) {
                    case R.id.radioButton5_1:
                        arr[4] = 1;
                        break;
                    case R.id.radioButton5_2:
                        arr[4] = 2;
                        break;
                    case R.id.radioButton5_3:
                        arr[4] = 3;
                        break;
                    case R.id.radioButton5_4:
                        arr[4] = 4;
                        break;
                    case R.id.radioButton5_5:
                        arr[4] = 5;
                        break;
                }
                selectedNum5.setText(String.valueOf(arr[4]));
            }
        });

        lastclick6 = radioGroup6.getCheckedRadioButtonId();
        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(lastclick6 == -1) {
                    click++;
                    progressBar.setProgress((int)Math.round(8.3 * click));
                    percent.setText(String.valueOf((int)Math.round(8.3 * click)) + " %");
                }
                lastclick6 = radioGroup6.getCheckedRadioButtonId();
                switch (checkedId) {
                    case R.id.radioButton6_1:
                        arr[5] = 1;
                        break;
                    case R.id.radioButton6_2:
                        arr[5] = 2;
                        break;
                    case R.id.radioButton6_3:
                        arr[5] = 3;
                        break;
                    case R.id.radioButton6_4:
                        arr[5] = 4;
                        break;
                    case R.id.radioButton6_5:
                        arr[5] = 5;
                        break;
                }
                selectedNum6.setText(String.valueOf(arr[5]));
            }
        });

        lastclick7 = radioGroup7.getCheckedRadioButtonId();
        radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(lastclick7 == -1) {
                    click++;
                    progressBar.setProgress((int)Math.round(8.3 * click));
                    percent.setText(String.valueOf((int)Math.round(8.3 * click)) + " %");
                }
                lastclick7 = radioGroup7.getCheckedRadioButtonId();
                switch (checkedId) {
                    case R.id.radioButton7_1:
                        arr[6] = 1;
                        break;
                    case R.id.radioButton7_2:
                        arr[6] = 2;
                        break;
                    case R.id.radioButton7_3:
                        arr[6] = 3;
                        break;
                    case R.id.radioButton7_4:
                        arr[6] = 4;
                        break;
                    case R.id.radioButton7_5:
                        arr[6] = 5;
                        break;
                }
                selectedNum7.setText(String.valueOf(arr[6]));
            }
        });

        lastclick8 = radioGroup8.getCheckedRadioButtonId();
        radioGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(lastclick8 == -1) {
                    click++;
                    progressBar.setProgress((int)Math.round(8.3 * click));
                    percent.setText(String.valueOf((int)Math.round(8.3 * click)) + " %");
                }
                lastclick8 = radioGroup8.getCheckedRadioButtonId();
                switch (checkedId) {
                    case R.id.radioButton8_1:
                        arr[7] = 1;
                        break;
                    case R.id.radioButton8_2:
                        arr[7] = 2;
                        break;
                    case R.id.radioButton8_3:
                        arr[7] = 3;
                        break;
                    case R.id.radioButton8_4:
                        arr[7] = 4;
                        break;
                    case R.id.radioButton8_5:
                        arr[7] = 5;
                        break;
                }
                selectedNum8.setText(String.valueOf(arr[7]));
            }
        });

        lastclick9 = radioGroup9.getCheckedRadioButtonId();
        radioGroup9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(lastclick9 == -1) {
                    click++;
                    progressBar.setProgress((int)Math.round(8.3 * click));
                    percent.setText(String.valueOf((int)Math.round(8.3 * click)) + " %");
                }
                lastclick9 = radioGroup9.getCheckedRadioButtonId();
                switch (checkedId) {
                    case R.id.radioButton9_1:
                        arr[8] = 1;
                        break;
                    case R.id.radioButton9_2:
                        arr[8] = 2;
                        break;
                    case R.id.radioButton9_3:
                        arr[8] = 3;
                        break;
                    case R.id.radioButton9_4:
                        arr[8] = 4;
                        break;
                    case R.id.radioButton9_5:
                        arr[8] = 5;
                        break;
                }
                selectedNum9.setText(String.valueOf(arr[8]));
            }
        });

        lastclick10 = radioGroup10.getCheckedRadioButtonId();
        radioGroup10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(lastclick10 == -1) {
                    click++;
                    progressBar.setProgress((int)Math.round(8.3 * click));
                    percent.setText(String.valueOf((int)Math.round(8.3 * click)) + " %");
                }
                lastclick10 = radioGroup10.getCheckedRadioButtonId();
                switch (checkedId) {
                    case R.id.radioButton10_1:
                        arr[9] = 1;
                        break;
                    case R.id.radioButton10_2:
                        arr[9] = 2;
                        break;
                    case R.id.radioButton10_3:
                        arr[9] = 3;
                        break;
                    case R.id.radioButton10_4:
                        arr[9] = 4;
                        break;
                    case R.id.radioButton10_5:
                        arr[9] = 5;
                        break;
                }
                selectedNum10.setText(String.valueOf(arr[9]));
            }
        });

        lastclick11 = radioGroup11.getCheckedRadioButtonId();
        radioGroup11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(lastclick11 == -1) {
                    click++;
                    progressBar.setProgress((int)Math.round(8.3 * click));
                    percent.setText(String.valueOf((int)Math.round(8.3 * click)) + " %");
                }
                lastclick11 = radioGroup11.getCheckedRadioButtonId();
                switch (checkedId) {
                    case R.id.radioButton11_1:
                        arr[10] = 1;
                        break;
                    case R.id.radioButton11_2:
                        arr[10] = 2;
                        break;
                    case R.id.radioButton11_3:
                        arr[10] = 3;
                        break;
                    case R.id.radioButton11_4:
                        arr[10] = 4;
                        break;
                    case R.id.radioButton11_5:
                        arr[10] = 5;
                        break;
                }
                selectedNum11.setText(String.valueOf(arr[10]));
            }
        });

        lastclick12 = radioGroup12.getCheckedRadioButtonId();
        radioGroup12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(lastclick12 == -1) {
                    click++;
                    progressBar.setProgress((int)Math.round(8.3 * click));
                    percent.setText(String.valueOf((int)Math.round(8.3 * click)) + " %");
                }
                lastclick12 = radioGroup12.getCheckedRadioButtonId();
                switch (checkedId) {
                    case R.id.radioButton12_1:
                        arr[11] = 1;
                        break;
                    case R.id.radioButton12_2:
                        arr[11] = 2;
                        break;
                    case R.id.radioButton12_3:
                        arr[11] = 3;
                        break;
                    case R.id.radioButton12_4:
                        arr[11] = 4;
                        break;
                    case R.id.radioButton12_5:
                        arr[11] = 5;
                        break;
                }
                selectedNum12.setText(String.valueOf(arr[11]));
            }
        });

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(click < 12) Toast.makeText(getApplicationContext(),"필수 문항을 채워주세요", Toast.LENGTH_LONG).show();
                else {
                    int arr1[] = {1,2,3,4,5,4,3,2,1,2,2,4};
                    int arr2[] = {3,2,4,4,4,4,3,3,2,4,1,1};
                    int arr3[] = {5,1,3,1,5,3,4,5,2,4,1,4};
                    int arr4[] = {2,5,1,3,3,4,2,1,1,2,1,1};
                    int arr5[] = {1,5,2,1,2,4,2,5,2,4,2,1};
                    int arr6[] = {4,1,4,2,5,5,5,4,2,1,1,1};
                    int arr7[] = {1,4,5,3,1,4,5,2,4,1,1,2};
                    int arr8[] = {1,4,5,3,1,4,5,2,4,1,1,2};
                    int arr9[] = {3,3,3,5,2,3,5,5,4,5,2,3};
                    int arr10[] = {5,1,3,1,4,3,4,5,2,4,1,1};
                    int arr11[] = {5,2,3,3,3,3,4,4,2,4,2,1};
                    int arr12[] = {3,2,5,4,2,2,4,4,2,5,5,3};
                    int arr13[] = {5,3,3,1,5,4,3,5,1,4,1,1};
                    int arr14[] = {5,4,1,5,3,4,1,1,3,3,3,1};
                    int arr15[] = {2,3,5,5,1,5,2,5,1,2,1,1};
                    int arr16[] = {4,1,2,1,1,4,4,2,3,1,2,1};
                    int arr17[] = {4,5,5,4,4,4,4,5,2,3,2,2};
                    int arr18[] = {5,4,1,2,4,5,3,4,3,2,1,1};
                    int arr19[] = {1,2,5,5,1,4,2,2,1,4,3,1};
                    int arr20[] = {2,2,3,1,1,4,4,2,1,3,1,1};
                    int arr21[] = {2,4,3,3,2,1,3,5,3,5,2,1};
                    int arr22[] = {5,3,3,4,4,4,4,3,4,2,2,1};
                    cluster.InsertData(arr1, "기타", "양용준");
                    cluster.InsertData(arr2, "드라마", "손학영");
                    cluster.InsertData(arr3, "산책", "배소연");
                    cluster.InsertData(arr4, "술", "염정운");
                    cluster.InsertData(arr5, "독서", "김지훈");
                    cluster.InsertData(arr6, "잠", "송지훈");
                    cluster.InsertData(arr7, "여행", "신유진");
                    cluster.InsertData(arr8, "음악감상", "박진유");
                    cluster.InsertData(arr9, "요리", "김기현");
                    cluster.InsertData(arr10, "산책", "");
                    cluster.InsertData(arr11, "잠", "홍예은");
                    cluster.InsertData(arr12, "영화감상", "정현우");
                    cluster.InsertData(arr13, "음악감상", "김다현");
                    cluster.InsertData(arr14, "운동", "오영택");
                    cluster.InsertData(arr15, "사격", "김원주");
                    cluster.InsertData(arr16, "큐시즘", "이미경");
                    cluster.InsertData(arr17, "음악감상", "정종명");
                    cluster.InsertData(arr18, "음악감상", "");
                    cluster.InsertData(arr19, "여행", "김은서");
                    cluster.InsertData(arr20, "노래부르기", "이은우");
                    cluster.InsertData(arr21, "음악감상", "");
                    cluster.InsertData(arr22, "그림", "유소연");
                    int[] arr23 = {1,2,3,3,4,4,3,5,2,4,3,2};
                    cluster.InsertData(arr23, "음악감상", "송아라");
                    int[] arr24 = {2,5,4,1,2,4,3,2,1,5,2,2};
                    cluster.InsertData(arr24, "음악감상", "김민지");
                    int[] arr25 = {3,4,5,1,2,3,4,5,5,4,2,4};
                    cluster.InsertData(arr25, "음악감상", "김다흰");
                    int[] arr26 = {4,3,2,3,4,2,3,5,2,4,1,1};
                    cluster.InsertData(arr26, "다이어리", "유진쓰");
                    int[] arr27 = {5,1,2,3,5,3,2,4,1,1,1,1};
                    cluster.InsertData(arr27, "웹툰보기", "조수연");
                    int[] arr28 = {5,3,2,2,2,1,3,4,2,4,4,2};
                    cluster.InsertData(arr28, "영화감상", "");
                    int[] arr29 = {3,3,3,4,3,2,2,4,1,4,2,5};
                    cluster.InsertData(arr29, "영화감상","");
                    int[] arr30 = {1,3,4,4,2,4,3,5,4,5,2,5};
                    cluster.InsertData(arr30, "영화감상", "이경훈");
                    int[] arr31 = {4,2,4,4,3,5,2,5,1,3,2,4};
                    cluster.InsertData(arr31, "글쓰기", "신혜민");
                    int[] arr32 = {4,5,3,2,1,5,3,2,5,5,3,1};
                    cluster.InsertData(arr32, "스마트폰", "강하람");
                    int[] arr33 = {2,3,4,3,2,3,4,5,4,3,2,1};
                    cluster.InsertData(arr33, "그림", "김채영");
                    int[] arr34 = {5,4,4,1,3,1,3,5,5,5,3,1};
                    cluster.InsertData(arr34, "그림", "");
                    int[] arr35 = {3,4,4,3,2,4,4,5,1,5,1,2};
                    cluster.InsertData(arr35, "영화감상", "박소영");
                    int[] arr36 = {1,5,5,1,1,4,4,5,3,1,2,1};
                    cluster.InsertData(arr36, "여행", "");
                    int[] arr37 = {2,4,3,4,4,4,3,4,4,4,2,2};
                    cluster.InsertData(arr37, "음악감상", "김현기");
                    int[] arr38 = {3,1,4,1,1,5,3,4,1,5,2,1};
                    cluster.InsertData(arr38, "음악감상", "");
                    int[] arr39 = {3,5,2,4,4,4,1,4,3,5,4,1};
                    cluster.InsertData(arr39, "축구", "박동환");
                    int[] arr40 = {4,3,4,2,4,4,3,4,4,2,5,2};
                    cluster.InsertData(arr40, "영화감상", "남은비");
                    int[] arr41 = {1,3,3,3,4,4,3,3,3,3,2,1};
                    cluster.InsertData(arr41, "운동", "");
                    int[] arr42 = {2,3,5,5,3,3,4,5,2,3,4,1};
                    cluster.InsertData(arr42, "영화감상", "김로아");
                    int arr43[] = {3,2,4,4,4,5,5,5,4,4,2,3};
                    int arr44[] = {4,2,1,2,2,4,3,4,5,2,2,1};
                    int arr45[] = {3,2,4,2,1,3,4,4,1,5,2,2};
                    int arr46[] = {2,5,5,4,4,1,4,2,3,5,1,1};
                    int arr47[] = {3,2,4,2,2,3,3,2,4,5,1,1};
                    int arr48[] = {3,2,2,4,3,1,3,4,1,5,2,1};
                    int arr49[] = {1,1,5,1,5,5,5,5,2,5,3,1};
                    int arr50[] = {3,1,1,1,5,3,3,5,3,5,4,1};
                    cluster.InsertData(arr43, "독서", "주찬혁");
                    cluster.InsertData(arr44, "음악감상", "");
                    cluster.InsertData(arr45, "쇼핑", "");
                    cluster.InsertData(arr46, "축구", "");
                    cluster.InsertData(arr47, "컴퓨터게임", "김다영");
                    cluster.InsertData(arr48, "스마트폰", "유덩");
                    cluster.InsertData(arr49, "수영", "");
                    cluster.InsertData(arr50, "필라테스", "");

                    ArrayList<String[]> resultSet = cluster.findHobby(arr, 12);
                    for(int i=0; i<4; i++) {
                        System.out.println(resultSet.get(i)[0]+ " "+resultSet.get(i)[1]);
                    }
                    Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                    intent.putExtra("name1", resultSet.get(0)[0]);
                    intent.putExtra("hobby1", resultSet.get(0)[1]);
                    intent.putExtra("name2", resultSet.get(1)[0]);
                    intent.putExtra("hobby2", resultSet.get(1)[1]);
                    intent.putExtra("name3", resultSet.get(2)[0]);
                    intent.putExtra("hobby3", resultSet.get(2)[1]);
                    intent.putExtra("name4", resultSet.get(3)[0]);
                    intent.putExtra("hobby4", resultSet.get(3)[1]);

                    intent.putExtra("question",arr);
                    startActivity(intent);
                }
            }
        });
    }
}

class cluster {
    public static ArrayList<int[]> dataSet = new ArrayList<int[]>();
    public static ArrayList<String> hobbySet = new ArrayList<String>();
    public static ArrayList<String> nameSet = new ArrayList<String>();




    // 데이터 삽입
    public static void InsertData(int arr[], String hobby, String name){
        // 군집화 번호 지정 하기 위해서 배열 크기 1추가
        int data[] = new int[arr.length + 1];
        // 처음 군집은 다 0으로 초기화
        for(int i = 0; i < data.length; i++) {
            data[i] = (i == (data.length - 1)) ? 0 : arr[i];
        }
        dataSet.add(data);
        hobbySet.add(hobby);
        nameSet.add(name);
    }

    // 데이터 셋 얻어오기
    public static ArrayList<int[]> getDataArray(){
        return dataSet;
    }

    // debugging
    public static void debug(int[][] center, int temp[]) {
        System.out.println("중심점 현황");
        for(int i = 0; i < center.length; i++) {
            for(int j = 0; j < center[0].length; j++) {
                System.out.print(center[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("데이터 현황");
        for(int i = 0; i < dataSet.size(); i++) {
            for(int j = 0; j < 7; j++) {
                System.out.print(dataSet.get(i)[j]+" ");
            }
            System.out.println();
        }
        System.out.println("temp 현황");
        for(int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" ");
        }
        System.out.println();
    }

    // 군집화
    public static void clustering(int num, int k){
        int center[][] = setPoint(num, k);
        int tempSet[] = new int[dataSet.size()];
        for(int i = 0; i < tempSet.length; i++) {
            if(i == tempSet.length - 1) {
                tempSet[i] = 1;
            }
            else {
                tempSet[i] = dataSet.get(i)[num];
            }
        }
        while(!stopOK(tempSet, num)) {
            //debug(center, tempSet);
            for(int i = 0; i < dataSet.size(); i++) {
                int temp[] = dataSet.get(i);
                temp[num] = getBestCluster(center, i, num);
                dataSet.set(i, temp);
            }
            //debug(center, tempSet);
            findCenter(center, k, num);
            for(int i = 0; i < tempSet.length; i++) {
                tempSet[i] = dataSet.get(i)[num];
            }
            //debug(center, tempSet);
            for(int i = 0; i < dataSet.size(); i++) {
                int temp[] = dataSet.get(i);
                temp[num] = getBestCluster(center, i, num);
                dataSet.set(i, temp);
            }
            //debug(center, tempSet);
        }
    }

    // 임의의 군집화 중심 초기 설정
    public static int[][] setPoint(int num, int k) {
        int point[][] = new int[k][num];
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < num; j++) {
                point[i][j] = (int)(Math.random() * 5) + 1;
            }
        }
        return point;
    }

    // 최적의 군집 찾기
    public static int getBestCluster(int[][] center, int dataNum, int num){
        int cluster = dataSet.get(dataNum)[num];
        double min = Integer.MAX_VALUE;
        for(int i = 0; i < center.length; i++) {
            double sum = 0;
            for(int j = 0; j < center[i].length; j++) {
                // 유클리디안 거리 사용
                sum += (center[i][j] - dataSet.get(dataNum)[j]) * (center[i][j] - dataSet.get(dataNum)[j]);
            }
            sum = Math.sqrt(sum);
            if(min > sum) {
                min = sum;
                cluster = i;
            }
        }
        return cluster;
    }

    // 군집 중심 재설정
    public static int[][] findCenter(int center[][], int k, int num) {
        for(int i = 0; i < k; i++) {
            ArrayList<int[]> tempSet =  new ArrayList<int[]>();
            for(int j = 0; j < dataSet.size(); j++) {
                int cluster = dataSet.get(j)[num];
                if(i == cluster) {
                    tempSet.add(dataSet.get(j));
                }
            }
            for(int m = 0; m < num; m++) {
                int sum = 0;
                for(int n = 0; n < tempSet.size(); n++) {
                    sum += tempSet.get(n)[m];
                }
                center[i][m] = tempSet.size() == 0 ? center[i][m] : (int)(sum / tempSet.size());
            }
        }
        return center;
    }

    // 군집화 중지 여부
    public static boolean stopOK(int tempSet[], int num){
        boolean check = true;
        for(int i = 0; i < dataSet.size(); i++) {
            if(dataSet.get(i)[num] != tempSet[i]) {
                check = false;
                break;
            }
        }
        return check;
    }

    // 거리계산하기
    public static int[] minDistance(ArrayList<Integer> sameCluster, int question) {
        ArrayList<int[]> data = new ArrayList<int[]>();
        for(int i = 0; i < sameCluster.size(); i++) {
            int temp2[] = new int[2];
            int num = sameCluster.get(i);
            int sum = 0;
            for(int j = 0; j < question; j++) {
                int temp = dataSet.get(dataSet.size()-1)[j] - dataSet.get(num)[j];
                sum += (temp * temp);
            }
            temp2[0] = num;
            temp2[1] = sum;
            data.add(i, temp2);
        }

        Comparator<int[]> distanceComparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        };

        Collections.sort(data,	distanceComparator);

        int result[] = new int[4];
        for(int i = 0; i < 4; i++) {
            result[i] = data.get(i)[0];
        }
        return result;
    }

    // 군집화내 TOP4 찾기
    public static ArrayList<String[]> findHobby(int arr[], int question) {
        ArrayList<String[]> resultSet = new ArrayList<String[]>();
        // 군집화 번호 지정 하기 위해서 배열 크기 1추가
        int data[] = new int[arr.length + 1];
        // 처음 군집은 다 0으로 초기화
        for(int i = 0; i < data.length; i++) {
            data[i] = (i == (data.length - 1)) ? 0 : arr[i];
        }

        // 마지막에 새로운 데이터 추가
        dataSet.add(data);

        // 클러스터링 진행
        clustering(question, 3);

        // 같은 군집내의 사람 찾기
        int cluster = dataSet.get(dataSet.size()-1)[question];
        ArrayList<Integer> sameCluster = new ArrayList<Integer>();
        for(int i = 0; i < dataSet.size(); i++) {
            if(dataSet.get(i)[question] == cluster & i != dataSet.size() - 1) {
                sameCluster.add(i);
            }
        }

        // 같은 군집내에서 최소거리에 존재하는 사람,취미 찾기
        int number[] = minDistance(sameCluster, question);
        for(int i = 0; i < number.length; i++) {
            String last[] = new String[2];
            last[0] = nameSet.get(number[i]);
            last[1] = hobbySet.get(number[i]);
            resultSet.add(last);
        }
        return resultSet;
    }
}
