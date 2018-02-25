package com.example.asus.sardhika_1202150067_modul3;


import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

        import android.content.Intent;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

import java.util.List;

public class Login extends AppCompatActivity {
    private Button a, b;
    private EditText c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); //set halaman awal



        c = (EditText) findViewById(R.id.user); //set variable c yang diambil dari edittext user
        d = (EditText) findViewById(R.id.pass); //set variable d yang diambil dari edittext pass


    }

    public void oke(View view) {
        final String user = c.getText().toString(); //string user yang diambil dari c
        String pass = d.getText().toString(); //string user yang diambil dari d

        if ((user.equals("EAD") && pass.equals("MOBILE"))){
            Toast.makeText(this,"Anda berhasil login",Toast.LENGTH_LONG).show();
            //digunakan untuk mengecek kondisi password dan user
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
//bulid allert
            alert.setTitle("Alert Message");
//set jenis alert
            alert.setMessage("Login Success")
                    //set text alert dengan login success
                    .setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
//set button pada pop up alert
                            Intent d = new Intent(Login.this,MainActivity.class);
                            d.putExtra("username",user);
                            startActivity(d);
                        }
                    });

            AlertDialog alertDialog = alert.create();

            alertDialog.show();



        }
        else if (user.isEmpty() && pass.isEmpty()){
            AlertDialog.Builder alert = new AlertDialog.Builder(this);

            alert.setTitle("Fill the blank");

            alert.setMessage("Login Failed")
                    .setCancelable(false)
                    .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });

            AlertDialog alertDialog = alert.create();

            alertDialog.show();

        }
        else if (!user.equals("EAD")  && !pass.equals("MOBILE")){
            AlertDialog.Builder alert = new AlertDialog.Builder(this);

            alert.setTitle("Incorrect");

            alert.setMessage("Login Failed")
                    .setCancelable(false)
                    .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });

            AlertDialog alertDialog = alert.create();

            alertDialog.show();
        }
    }
}
