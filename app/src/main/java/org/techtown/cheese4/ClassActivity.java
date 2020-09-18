package org.techtown.cheese4;

import android.content.Intent;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ClassActivity extends AppCompatActivity {
    ClassAdapter adapter;
    ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);

        listView = (ListView) findViewById(R.id.listView);
        adapter = new ClassAdapter();

        String[] title = new String[4];
        String[] name = new String[4];

        title[0] = getIntent().getStringExtra("hobby1");
        name[0] = getIntent().getStringExtra("name1");
        title[1] = getIntent().getStringExtra("hobby2");
        name[1] = getIntent().getStringExtra("name2");
        title[2] = getIntent().getStringExtra("hobby3");
        name[2] = getIntent().getStringExtra("name3");
        title[3] = getIntent().getStringExtra("hobby4");
        name[3] = getIntent().getStringExtra("name4");



        String[] phone = {"010-4599-4538", "010-3391-7251", "010-3922-2281", "010-2789-8948"};
        String[] location = {"강남역", "신논현", "여의도", "건대"};
        String[] time = {"2시간 30분", "1시간", "1시간 30분", "2시간"};
        String[] price = {"30,000원", "50,000원", "40,000원", "70,000원"};
//        title[0] = getIntent().getStringExtra("hobby1");
//        name[0] = getIntent().getStringExtra("name1");
//        title[1] = getIntent().getStringExtra("hobby2");
//        name[1] = getIntent().getStringExtra("name2");
//        title[2] = getIntent().getStringExtra("hobby3");
//        name[2] = getIntent().getStringExtra("name3");
//        title[3] = getIntent().getStringExtra("hobby4");
//        name[3] = getIntent().getStringExtra("name4");
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
            adapter.addItem(new ClassItem(title[i], name[i], phone[i], location[i], time[i], price[i], image));
        }
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ClassActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog, null);
                TextView title = (TextView) mView.findViewById(R.id.title);
                TextView phoneNumber = (TextView) mView.findViewById(R.id.phoneNumber);
                ImageView image = (ImageView) mView.findViewById(R.id.image);
                Button moneyButton = (Button) mView.findViewById(R.id.moneyButton);
                Button messageButton = (Button) mView.findViewById(R.id.messageButton);
                Button callButton = (Button) mView.findViewById(R.id.callButton);
                final int p = position;
                title.setText(adapter.getTitle(position));
                phoneNumber.setText(adapter.getPhoneNumber(position));
                image.setBackground(new ShapeDrawable(new OvalShape()));
                if(Build.VERSION.SDK_INT >= 21) {
                    image.setClipToOutline(true);
                }
                image.setImageResource(adapter.getImage(position));

                moneyButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), PaymentActivity.class);
                        intent.putExtra("num", p);
                        startActivityForResult(intent, 101);
                    }
                });

                messageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent sendIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:" + adapter.getPhoneNumber(p)));
                        startActivity(sendIntent);
                    }
                });

                callButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + adapter.getPhoneNumber(p)));
                        startActivity(intent);
                    }
                });

                builder.setView(mView);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }

    class ClassAdapter extends BaseAdapter {
        ArrayList<ClassItem> items = new ArrayList<ClassItem>();

        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(ClassItem item) {
            items.add(item);
        }

        public String getTitle(int position) {
            return items.get(position).title;
        }

        public String getPhoneNumber(int position) {
            return items.get(position).phoneNumber;
        }

        public int getImage(int position) {
            return items.get(position).resId;
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ClassItemView view = null;
            if(convertView == null) {
                view = new ClassItemView(getApplicationContext());
            } else {
                view = (ClassItemView) convertView;
            }

            ClassItem item = items.get(position);
            view.setTitle(item.getTitle());
            view.setName(item.getName()+"과(와) 함께하는 원데이클래스");
            view.setPhoneNumber(item.getPhoneNumber());
            view.setLocation(item.getLocation());
            view.setTime(item.getTime());
            view.setPrice(item.getPrice());
            view.setImage(item.getResId());
            return view;
        }
    }
}
