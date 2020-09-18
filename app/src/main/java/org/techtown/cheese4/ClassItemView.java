package org.techtown.cheese4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ClassItemView extends LinearLayout {
    TextView title;
    TextView name;
    TextView phoneNumber;
    TextView location;
    TextView time;
    TextView price;
    ImageView imageView;

    public ClassItemView(Context context) {
        super(context);
        init(context);
    }

    public ClassItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.class_item_view, this, true);

        title = (TextView) findViewById(R.id.title);
        name = (TextView) findViewById(R.id.name);
        phoneNumber = (TextView) findViewById(R.id.phoneNumber);
        location = (TextView) findViewById(R.id.location);
        time = (TextView) findViewById(R.id.time);
        price = (TextView) findViewById(R.id.price);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void setTitle(String s) {title.setText(s);}
    public void setName(String s) {name.setText(s);}
    public void setPhoneNumber(String s) {phoneNumber.setText(s);}
    public void setLocation(String s) {location.setText(s);}
    public void setTime(String s) {time.setText(s);}
    public void setPrice(String s) {price.setText(s);}
    public void setImage(int resId) {
        imageView.setImageResource(resId);
    }

}
