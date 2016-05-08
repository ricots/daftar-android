package id.jajaka.pendaftaranmahasiswa.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import id.jajaka.pendaftaranmahasiswa.R;

public class MainActivity extends AppCompatActivity {
    private ImageView adminsions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Hide titlebar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Hide action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        adminsions = (ImageView) findViewById(R.id.admis);
        adminsions.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TabAdmisions.class);
                startActivity(intent);
            }
        });
    }

}
