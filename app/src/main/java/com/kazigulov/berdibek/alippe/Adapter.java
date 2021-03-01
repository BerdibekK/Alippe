package com.kazigulov.berdibek.alippe;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.List;

public class Adapter extends PagerAdapter {

    private List<Model> models;
    private LayoutInflater layoutInflater;
    private Context context;
    private AppCompatActivity activity;
    private MediaPlayer player;

    public Adapter(List<Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item, container ,false);

        ImageView imageView;
        TextView textView;

        imageView = view.findViewById(R.id.image);
        textView = view.findViewById(R.id.textABC);

        imageView.setImageResource(models.get(position).getImage());
        textView.setText(models.get(position).getText());

        container.addView(view,0);
        
        view.setOnClickListener(onClickListener(position));
        view.setOnLongClickListener(onLongClickListener(position));








        return view;
    }

    private View.OnLongClickListener onLongClickListener(final int position) {
        return  new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (position==0){
                    player = MediaPlayer.create(context,R.raw.alma);
                    player.start();

                }
                else if(position==1){
                    player = MediaPlayer.create(context,R.raw.atesh);
                    player.start();

                }
                else if(position==2){
                    player = MediaPlayer.create(context,R.raw.balyq);
                    player.start();

                }
                else if(position==3){
                    player = MediaPlayer.create(context,R.raw.velosiped);
                    player.start();

                }
                else if(position==4){
                    player = MediaPlayer.create(context,R.raw.gul);
                    player.start();

                }
                else if(position==5){
                    player = MediaPlayer.create(context,R.raw.garyshker);
                    player.start();

                }
                else if(position==6){
                    player = MediaPlayer.create(context,R.raw.dop);
                    player.start();

                }
                else if(position==7){
                    player = MediaPlayer.create(context,R.raw.etik);
                    player.start();

                }
                else if(position==8){
                    player = MediaPlayer.create(context,R.raw.jylan);
                    player.start();

                }
                else if(position==9){
                    player = MediaPlayer.create(context,R.raw.zymyran);
                    player.start();

                }
                else if(position==10){
                    player = MediaPlayer.create(context,R.raw.ine);
                    player.start();

                }
                else if(position==11){
                    player = MediaPlayer.create(context,R.raw.iogurt);
                    player.start();

                }
                else if(position==12){
                    player = MediaPlayer.create(context,R.raw.kobelek);
                    player.start();

                }
                else if(position==13){
                    player = MediaPlayer.create(context,R.raw.qalam);
                    player.start();

                }
                else if(position==14){
                    player = MediaPlayer.create(context,R.raw.limon);
                    player.start();

                }
                else if(position==15){
                    player = MediaPlayer.create(context,R.raw.mugalim);
                    player.start();

                }
                else if(position==16){
                    player = MediaPlayer.create(context,R.raw.nan);
                    player.start();

                }
                else if(position==17){
                    player = MediaPlayer.create(context,R.raw.shangy);
                    player.start();

                }
                else if(position==18){
                    player = MediaPlayer.create(context,R.raw.oryndyq);
                    player.start();

                }
                else if(position==19){
                    player = MediaPlayer.create(context,R.raw.ormeksji);
                    player.start();

                }
                else if(position==20){
                    player = MediaPlayer.create(context,R.raw.piaz);
                    player.start();

                }
                else if(position==21){
                    player = MediaPlayer.create(context,R.raw.robot);
                    player.start();

                }
                else if(position==22){
                    player = MediaPlayer.create(context,R.raw.sabiz);
                    player.start();

                }
                else if(position==23){
                    player = MediaPlayer.create(context,R.raw.tasbaqa);
                    player.start();
                }
                else if(position==24){
                    player = MediaPlayer.create(context,R.raw.uyldyeyq);
                    player.start();
                }
                else if(position==25){
                    player = MediaPlayer.create(context,R.raw.ywaq);
                    player.start();

                }
                else if(position==26){
                    player = MediaPlayer.create(context,R.raw.ui);
                    player.start();
                }
                else if(position==27){
                    player = MediaPlayer.create(context,R.raw.fudbolka);
                    player.start();

                }
                else if(position==28){
                    player = MediaPlayer.create(context,R.raw.xat);
                    player.start();
                }
                else if(position==29){
                    player = MediaPlayer.create(context,R.raw.ydys);
                    player.start();
                }
                else if(position==30){
                    player = MediaPlayer.create(context,R.raw.irimshik);
                    player.start();
                }

                return true;
            }
        };
    }

    private View.OnClickListener onClickListener(final int position) {
        return new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (position==0){
                player = MediaPlayer.create(context,R.raw.letter_1);
                player.start();

                }
                 else if(position==1){
                    player = MediaPlayer.create(context,R.raw.letter_2);
                    player.start();

                }
                else if(position==2){
                    player = MediaPlayer.create(context,R.raw.letter_3);
                    player.start();

                }
                else if(position==3){
                    player = MediaPlayer.create(context,R.raw.letter_4);
                    player.start();

                }
                else if(position==4){
                    player = MediaPlayer.create(context,R.raw.letter_5);
                    player.start();

                }
                else if(position==5){
                    player = MediaPlayer.create(context,R.raw.letter_6);
                    player.start();

                }
                else if(position==6){
                    player = MediaPlayer.create(context,R.raw.letter_7);
                    player.start();

                }
                else if(position==7){
                    player = MediaPlayer.create(context,R.raw.letter_8);
                    player.start();

                }
                else if(position==8){
                    player = MediaPlayer.create(context,R.raw.letter_10);
                    player.start();

                }
                else if(position==9){
                    player = MediaPlayer.create(context,R.raw.letter_11);
                    player.start();

                }
                else if(position==10){
                    player = MediaPlayer.create(context,R.raw.letter_12);
                    player.start();

                }
                else if(position==11){
                    player = MediaPlayer.create(context,R.raw.letter_13);
                    player.start();

                }
                else if(position==12){
                    player = MediaPlayer.create(context,R.raw.letter_14);
                    player.start();

                }
                else if(position==13){
                    player = MediaPlayer.create(context,R.raw.letter_15);
                    player.start();

                }
                else if(position==14){
                    player = MediaPlayer.create(context,R.raw.letter_16);
                    player.start();

                }
                else if(position==15){
                    player = MediaPlayer.create(context,R.raw.letter_17);
                    player.start();

                }
                else if(position==16){
                    player = MediaPlayer.create(context,R.raw.letter_18);
                    player.start();

                }
                else if(position==17){
                    player = MediaPlayer.create(context,R.raw.letter_19);
                    player.start();

                }
                else if(position==18){
                    player = MediaPlayer.create(context,R.raw.letter_20);
                    player.start();

                }
                else if(position==19){
                    player = MediaPlayer.create(context,R.raw.letter_21);
                    player.start();

                }
                else if(position==20){
                    player = MediaPlayer.create(context,R.raw.letter_22);
                    player.start();

                }
                else if(position==21){
                    player = MediaPlayer.create(context,R.raw.letter_23);
                    player.start();

                }
                else if(position==22){
                    player = MediaPlayer.create(context,R.raw.letter_24);
                    player.start();

                }
                else if(position==23){
                    player = MediaPlayer.create(context,R.raw.letter_25);
                    player.start();
                }
                else if(position==24){
                    player = MediaPlayer.create(context,R.raw.letter_26);
                    player.start();
                }
                else if(position==25){
                    player = MediaPlayer.create(context,R.raw.letter_27);
                    player.start();

                }
                else if(position==26){
                    player = MediaPlayer.create(context,R.raw.letter_28);
                    player.start();
                }
                else if(position==27){
                    player = MediaPlayer.create(context,R.raw.letter_29);
                    player.start();

                }
                else if(position==28){
                    player = MediaPlayer.create(context,R.raw.letter_30);
                    player.start();
                }
                else if(position==29){
                    player = MediaPlayer.create(context,R.raw.letter_37);
                    player.start();
                }
                else if(position==30){
                    player = MediaPlayer.create(context,R.raw.letter_38);
                    player.start();
                }
                    }
            };
        }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
