package ml.dev2dev.datavisualization;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by benson on 10/13/15.
 */
public class Myintro extends AppIntro {

    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(AppIntroFragment.newInstance("Droid Data", "Droid data is a data visualization tool that transforms quantitative" +
                        "data to maps",
                R.drawable.splash,
                 Color.parseColor("#272730")));

        setBarColor(Color.parseColor("#D94843"));
        setSeparatorColor(Color.parseColor("#D94843"));
        showSkipButton(false);

//        setVibrate(true);
//        setVibrateIntensity(30);
    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSkipPressed() {
//        Toast.makeText(getApplicationContext(),"You Skipped",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onDonePressed() {
//        Toast.makeText(getApplicationContext(),"You Done",Toast.LENGTH_SHORT).show();


Intent a =  new Intent(Myintro.this, MainActivity.class);
        startActivity(a);
        finish();

    }

}
