package id.jajaka.pendaftaranmahasiswa.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import id.jajaka.pendaftaranmahasiswa.R;

public class RegisterActivity extends AppCompatActivity {

    private Button btnRegistration;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnRegistration = (Button) findViewById(R.id.btnRegistration);
        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),)

                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog_finish_register);
                dialog.setTitle("Finish Registration");

                TextView text1 = (TextView) dialog.findViewById(R.id.p1);
                text1.setText(R.string.p1);

                TextView text2 = (TextView) dialog.findViewById(R.id.p2);
                text2.setText(R.string.p2);

                TextView text3 = (TextView) dialog.findViewById(R.id.p3);
                text3.setText(R.string.p3);

                TextView text4 = (TextView) dialog.findViewById(R.id.p4);
                text4.setText(R.string.p4);

                Button okFinish = (Button) dialog.findViewById(R.id.okFinish);
                okFinish.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Intent intent = new Intent(getApplicationContext(),TabAdmisions.class);
                        startActivity(intent);
                    }
                });
                dialog.show();
            }
            });
        }
}


