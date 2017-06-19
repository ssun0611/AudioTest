package rlathfdl463.kr.hs.emirim.audiotest;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch switchmusic;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchmusic=(Switch)findViewById(R.id.switch_music);
        player=MediaPlayer.create(this, R.raw.mr_mouse);
        switchmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchmusic.isChecked()){
                    player.start();
                }
                else player.pause();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        player.stop();
    }
}
