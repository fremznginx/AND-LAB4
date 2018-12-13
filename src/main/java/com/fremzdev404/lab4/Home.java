package com.fremzdev404.lab4;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Home extends AppCompatActivity {
    TextView tvCS, tvTeamFootball, tvProfile;
    EditText etName, etHeight, etWeight, etPhone;
    RadioButton rtMale, rtFemale;
    ImageView imTeamFootball;


    String[] colorCode = {"#FF6633", "#FFB399'", "#FF33FF", "#FFFF99", "#00B3E6",
            "#E6B333", "#3366E6", "#999966", "#99FF99", "#B34D4D",};

    String[] CLUBS = {"FC Barcelona", "Real Madrid", "Liverpool", "PSG", "Dortmund", "Beyern Munich"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvCS = findViewById(R.id.tvCS);
        etName = findViewById(R.id.etName);
        etHeight = findViewById(R.id.etHeight);
        etWeight = findViewById(R.id.etWeight);
        etPhone = findViewById(R.id.etPhone);
        rtMale = findViewById(R.id.radioMale);
        rtFemale = findViewById(R.id.radioFemale);
        tvProfile = findViewById(R.id.tvProfile);

        tvCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int i = (r.nextInt(10) + 1);
                tvCS.setTextColor(Color.parseColor(colorCode[i]));
                tvCS.setTextSize(50);
            }
        });
    }

    public void clickButtonTv1(View v) {
        tvCS.setTextSize(20);
        Toast.makeText(this, tvCS.getText(),
                Toast.LENGTH_LONG).show();
    }

    public void showAlertDialogPopup(View v) {
        boolean male = rtMale.isChecked();
        boolean female = rtFemale.isChecked();
        String sex = "";
        if (male == true)
            sex = "ชาย";
        if (female == true)
            sex = "หญิง";

        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        AlertDialog ad = adb.create();
        ad.setTitle("ประวัติส่วนตัว");
        ad.setMessage("ชื่อ : " + etName.getText() + "\n" +
                "ส่วนสูง : " + etHeight.getText() + "\n" +
                "น้ำหนัก : " + etWeight.getText() + "\n" +
                "เพศ : " + sex + "\n" +
                "โทรศัพท์ : " + etPhone.getText());
        ad.show();
    }

    public void showAlertDialogPopup2(View v) {
        boolean male = rtMale.isChecked();
        boolean female = rtFemale.isChecked();
        String sex = "";
        if (male == true)
            sex = "ชาย";
        if (female == true)
            sex = "หญิง";

        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setTitle("ประวัติส่วนตัว");
        adb.setIcon(R.drawable.person1);
        adb.setMessage("ชื่อ : " + etName.getText() + "\n" +
                "ส่วนสูง : " + etHeight.getText() + "\n" +
                "น้ำหนัก : " + etWeight.getText() + "\n" +
                "เพศ : " + sex + "\n" +
                "โทรศัพท์ : " + etPhone.getText());
        adb.setPositiveButton("Close", null);
        adb.show();
    }
    public void showAlertDialogPopup3(View v) {
        boolean male = rtMale.isChecked();
        boolean female = rtFemale.isChecked();
        String sex = "";
        if (male == true)
            sex = "ชาย";
        if (female == true)
            sex = "หญิง";

        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setTitle("ประวัติส่วนตัว");
        adb.setIcon(R.drawable.person1);
        adb.setMessage("ชื่อ : " + etName.getText() + "\n" +
                "ส่วนสูง : " + etHeight.getText() + "\n" +
                "น้ำหนัก : " + etWeight.getText() + "\n" +
                "เพศ : " + sex + "\n" +
                "โทรศัพท์ : " + etPhone.getText());
        adb.setPositiveButton("Clear", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                etName.setText(null);
                etHeight.setText(null);
                etWeight.setText(null);
                etPhone.setText(null);
                rtMale.setChecked(false);
                rtFemale.setChecked(false);
            }
        });
        adb.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                boolean male = rtMale.isChecked();
                boolean female = rtFemale.isChecked();
                String sex = "";
                if (male == true)
                    sex = "ชาย";
                if (female == true)
                    sex = "หญิง";
                tvProfile.setText("ชื่อ : " + etName.getText() + "\n" +
                        "ส่วนสูง : " + etHeight.getText() + "\n" +
                        "น้ำหนัก : " + etWeight.getText() + "\n" +
                        "เพศ : " + sex + "\n" +
                        "โทรศัพท์ : " + etPhone.getText());
                tvProfile.setTextSize(20);
                tvProfile.setTextColor(Color.MAGENTA);
            }
        });
        adb.show();
    }
}
