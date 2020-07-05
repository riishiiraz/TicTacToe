package com.riishiiraz.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageButton ib11,ib12,ib13,ib21,ib22,ib23,ib31,ib32,ib33;
    Button play_again;
    public boolean flag =true;
    //ImageButton[] ar = {ib11,ib12,ib13,ib21,ib22,ib23,ib31,ib32,ib33};
    ArrayList<ImageButton> clicked = new ArrayList<ImageButton>();
    ArrayList<ImageButton> all_btns = new ArrayList<ImageButton>();

    ArrayList<Integer> cross_clicked = new ArrayList<Integer>();
    ArrayList<Integer> zero_clicked = new ArrayList<Integer>();

    int[] color_images_cross = {R.drawable.cross1 , R.drawable.cross2 ,R.drawable.cross3 ,R.drawable.cross4};
    int[] color_images_zero = {R.drawable.zero1 ,R.drawable.zero2,R.drawable.zero3,R.drawable.zero4 };

    TextView tv_user,tv_wins;
    ImageView iv_user;
    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ib11 = (ImageButton)findViewById(R.id.ib11);
        ib12 = (ImageButton)findViewById(R.id.ib12);
        ib13 = (ImageButton)findViewById(R.id.ib13);
        ib21 = (ImageButton)findViewById(R.id.ib21);
        ib22 = (ImageButton)findViewById(R.id.ib22);
        ib23 = (ImageButton)findViewById(R.id.ib23);
        ib31 = (ImageButton)findViewById(R.id.ib31);
        ib32 = (ImageButton)findViewById(R.id.ib32);
        ib33 = (ImageButton)findViewById(R.id.ib33);

        play_again = (Button)findViewById(R.id.button_play_again);

        tv_user=(TextView)findViewById(R.id.tv_user);
        tv_wins=(TextView)findViewById(R.id.tv_wins);

        iv_user = (ImageView)findViewById(R.id.iv_user);

        cl = (ConstraintLayout) findViewById(R.id.CL);  // Constraint Layout


        ib11.setOnClickListener(this);
        ib12.setOnClickListener(this);
        ib13.setOnClickListener(this);
        ib21.setOnClickListener(this);
        ib22.setOnClickListener(this);
        ib23.setOnClickListener(this);
        ib31.setOnClickListener(this);
        ib32.setOnClickListener(this);
        ib33.setOnClickListener(this);

        play_again.setOnClickListener(this);

        ImageButton[] ar = {ib11,ib12,ib13,ib21,ib22,ib23,ib31,ib32,ib33};
        for (ImageButton ib :ar)
        { all_btns.add(ib); }

    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() ==ib11.getId())
        {if (flag)
            { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.cross);flag=false;clicked.add((ImageButton)v);cross_clicked.add(11); } }
         else
            { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.zero);flag=true;clicked.add((ImageButton)v); zero_clicked.add(11);} }check(); }
    
        else if (v.getId() ==ib12.getId())
        { if (flag)
            { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.cross);flag=false;clicked.add((ImageButton)v);cross_clicked.add(12); } }
        else
            { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.zero);flag=true;clicked.add((ImageButton)v); zero_clicked.add(12); } } check(); }

        else if (v.getId() ==ib13.getId())
        { if (flag)
        { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.cross);flag=false;clicked.add((ImageButton)v); cross_clicked.add(13);} }
        else
        { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.zero);flag=true;clicked.add((ImageButton)v); zero_clicked.add(13); } }check(); }

        else if (v.getId() ==ib21.getId())
        { if (flag)
        { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.cross);flag=false;clicked.add((ImageButton)v);cross_clicked.add(21); } }
        else
        { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.zero);flag=true;clicked.add((ImageButton)v); zero_clicked.add(21); } }check(); }

        else if (v.getId() ==ib22.getId())
        { if (flag)
        { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.cross);flag=false;clicked.add((ImageButton)v); cross_clicked.add(22);} }
        else
        { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.zero);flag=true;clicked.add((ImageButton)v); zero_clicked.add(22); } }check(); }

        else if (v.getId() ==ib23.getId())
        { if (flag)
        { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.cross);flag=false;clicked.add((ImageButton)v); cross_clicked.add(23);} }
        else
        { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.zero);flag=true;clicked.add((ImageButton)v); zero_clicked.add(23); } }check(); }

        else if (v.getId() ==ib31.getId())
        { if (flag)
        { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.cross);flag=false;clicked.add((ImageButton)v);cross_clicked.add(31); } }
        else
        { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.zero);flag=true;clicked.add((ImageButton)v); zero_clicked.add(31); } }check(); }

        else if (v.getId() ==ib32.getId())
        { if (flag)
        { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.cross);flag=false;clicked.add((ImageButton)v);cross_clicked.add(32); } }
        else
        { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.zero);flag=true;clicked.add((ImageButton)v);  zero_clicked.add(32);} }check(); }

        else if (v.getId() ==ib33.getId())
        { if (flag)
        { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.cross);flag=false;clicked.add((ImageButton)v);cross_clicked.add(33); } }
        else
        { if (!clicked.contains(v)) { v.setBackgroundResource(R.drawable.zero);flag=true;clicked.add((ImageButton)v); zero_clicked.add(33); } }check(); }

        //For Play Again
        else if (v.getId() ==play_again.getId()) {
            Log.v("hi", "Play Agin");
            clicked.clear();
            cross_clicked.clear();
            zero_clicked.clear();
            flag = true;

            for (int i = 0; i < all_btns.size(); i++) {
                //all_btns.get(i).setBackgroundResource(R.drawable.zero);
                all_btns.get(i).setBackgroundColor(Color.parseColor("#FFFFFF"));
            }

            tv_user.setText("");
            tv_wins.setText("");
            iv_user.setBackgroundColor(Color.parseColor("#FFFFFF"));
            cl.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }


    }

    void check()
    {
        if ((cross_clicked.size() <3) && (zero_clicked.size()<3)){return;}
        Log.v("Cross : Array =>",cross_clicked.toString());
        // for cross
             if (cross_clicked.contains(11) && cross_clicked.contains(12) && cross_clicked.contains(13)) {win(ib11,ib12,ib13,"cross");}
        else if (cross_clicked.contains(21) && cross_clicked.contains(22) && cross_clicked.contains(23)) {win(ib21,ib22,ib23,"cross");}
        else if (cross_clicked.contains(31) && cross_clicked.contains(32) && cross_clicked.contains(33)) {win(ib31,ib32,ib33,"cross");}

        else if (cross_clicked.contains(11) && cross_clicked.contains(21) && cross_clicked.contains(31)) {win(ib11,ib21,ib31,"cross");}
        else if (cross_clicked.contains(12) && cross_clicked.contains(22) && cross_clicked.contains(32)) {win(ib12,ib22,ib32,"cross");}
        else if (cross_clicked.contains(13) && cross_clicked.contains(23) && cross_clicked.contains(33)) {win(ib13,ib23,ib33,"cross");}

        else if (cross_clicked.contains(11) && cross_clicked.contains(22) && cross_clicked.contains(33)) {win(ib11,ib22,ib33,"cross");}
        else if (cross_clicked.contains(31) && cross_clicked.contains(22) && cross_clicked.contains(13)) {win(ib31,ib22,ib13,"cross");}

        //for zero
             if (zero_clicked.contains(11) && zero_clicked.contains(12) && zero_clicked.contains(13)) {win (ib11,ib12,ib13,"zero");}
        else if (zero_clicked.contains(21) && zero_clicked.contains(22) && zero_clicked.contains(23)) {win (ib21,ib22,ib23,"zero");}
        else if (zero_clicked.contains(31) && zero_clicked.contains(32) && zero_clicked.contains(33)) {win (ib31,ib32,ib33,"zero");}

        else if (zero_clicked.contains(11) && zero_clicked.contains(21) && zero_clicked.contains(31)) {win(ib11,ib21,ib31,"zero");}
        else if (zero_clicked.contains(12) && zero_clicked.contains(22) && zero_clicked.contains(32)) {win(ib12,ib22,ib32,"zero");}
        else if (zero_clicked.contains(13) && zero_clicked.contains(23) && zero_clicked.contains(33)) {win(ib13,ib23,ib33,"zero");}

        else if (zero_clicked.contains(11) && zero_clicked.contains(22) && zero_clicked.contains(33)) {win(ib11,ib22,ib33,"zero");}
        else if (zero_clicked.contains(31) && zero_clicked.contains(22) && zero_clicked.contains(13)) {win(ib31,ib22,ib13,"zero");}

    }

    void win(ImageButton i1,ImageButton i2 , ImageButton i3 ,String user)
    {
        Log.v("Win",user);

        for (ImageButton ib:all_btns) // for disable the button after winning
        {
            if (!clicked.contains(ib))
            {
                clicked.add(ib);
            }
        }

        tv_user.setText("User");
        tv_wins.setText("Wins");
        cl.setBackgroundResource(R.drawable.bg);

        int ran =(int)(Math.random()*4);
        switch (user)
        {
            case "cross":
                {
                    i1.setBackgroundResource(color_images_cross[ran]);
                    i2.setBackgroundResource(color_images_cross[ran]);
                    i3.setBackgroundResource(color_images_cross[ran]);

                    iv_user.setBackgroundResource(R.drawable.cross);
                    return;
                }
            case "zero":
                {i1.setBackgroundResource(color_images_zero[ran]);
                i2.setBackgroundResource(color_images_zero[ran]);
                i3.setBackgroundResource(color_images_zero[ran]);
                iv_user.setBackgroundResource(R.drawable.zero);
                return;
                }
        }
    }

}
