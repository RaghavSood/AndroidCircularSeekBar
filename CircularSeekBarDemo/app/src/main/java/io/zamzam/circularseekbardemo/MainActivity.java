package io.zamzam.circularseekbardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    CircularSeekBar circularSeekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        circularSeekbar = new CircularSeekBar(this);
        circularSeekbar.setMaxProgress(100);
        circularSeekbar.setProgress(100);
        setContentView(circularSeekbar);
        circularSeekbar.invalidate();

        circularSeekbar.setSeekBarChangeListener(new CircularSeekBar.OnSeekChangeListener() {

            @Override
            public void onProgressChange(CircularSeekBar view, int newProgress) {
                Log.d("Welcome", "Progress:" + view.getProgress() + "/" + view.getMaxProgress());
            }
        });

    }
}
