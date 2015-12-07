package com.christian.amiibo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Christian on 12/6/2015.
 */
public class toys extends Activity
{
    public static final String numb = "toynum";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toys);

        int prodNo = (Integer)getIntent().getExtras().get(numb);
        Amiibo toyname = Amiibo.amiibo[prodNo];

        ImageView pic = (ImageView)findViewById(R.id.picture);
        pic.setImageResource(toyname.getImageResourceId());
        pic.setContentDescription(toyname.getName());

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(toyname.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(toyname.getDescription());
    }
}