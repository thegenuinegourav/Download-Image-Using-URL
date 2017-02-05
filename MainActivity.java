package thegenuinegourav.downloadimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new DownloadImageTask((ImageView)findViewById(R.id.image),(ProgressBar)findViewById(R.id.progress_bar))
                .execute("http://img.mota.ru/upload/wallpapers/source/2015/01/07/16/02/42514/004.jpg");
    }
}
