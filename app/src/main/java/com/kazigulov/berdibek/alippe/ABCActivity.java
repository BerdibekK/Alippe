package com.kazigulov.berdibek.alippe;

import android.animation.ArgbEvaluator;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ABCActivity extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc);

        models = new ArrayList<>();
        models.add(new Model(R.drawable.arip_1,"Alma"));
        models.add(new Model(R.drawable.arip_2,"átesh"));
        models.add(new Model(R.drawable.arip_3, "Balyq"));
        models.add(new Model(R.drawable.arip_4 , "Vilosipet"));
        models.add(new Model(R.drawable.arip_5, "Gul" ));
        models.add(new Model(R.drawable.arip_6 , "G'aryshker"));
        models.add(new Model(R.drawable.arip_7 , "Dop"));
        models.add(new Model(R.drawable.arip_8 , "Etik"));
        models.add(new Model(R.drawable.arip_9, "Jylan" ));
        models.add(new Model(R.drawable.arip_10, "Zymyran"));
        models.add(new Model(R.drawable.arip_11, "Ine"));
        models.add(new Model(R.drawable.arip_12, "Iogurt"));
        models.add(new Model(R.drawable.arip_13, "Ko'belek"));
        models.add(new Model(R.drawable.arip_14, "Qalam"));
        models.add(new Model(R.drawable.arip_15, "Limon"));
        models.add(new Model(R.drawable.arip_16, "Mug'alim"));
        models.add(new Model(R.drawable.arip_17 , "Nan"));
        models.add(new Model(R.drawable.arip_18, "Shan'gy"));
        models.add(new Model(R.drawable.arip_19, "Oryndyq" ));
        models.add(new Model(R.drawable.arip_20, "O'rmekshi"));
        models.add(new Model(R.drawable.arip_21, "Piaz"));
        models.add(new Model(R.drawable.arip_22, "Robot"));
        models.add(new Model(R.drawable.arip_23, "Sabiz"));
        models.add(new Model(R.drawable.arip_24, "Tasbaqa"));
        models.add(new Model(R.drawable.arip_25, "Yyldyryq"));
        models.add(new Model(R.drawable.arip_26 , "Ushaq"));
        models.add(new Model(R.drawable.arip_27, "U'i"));
        models.add(new Model(R.drawable.arip_28, "Fudbolka"));
        models.add(new Model(R.drawable.arip_29, "Hat"));
        models.add(new Model(R.drawable.arip_30, "Ydys"));
        models.add(new Model(R.drawable.arip_31, "Irimsik"));

        adapter = new Adapter(models,this);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color1),
        };

        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position < (adapter.getCount()-1) && position<(colors.length-1)) {
                    viewPager.setBackgroundColor(
                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position+1]));
                } else {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }

}
