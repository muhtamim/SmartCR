package com.uzl.smartcr.smartcr;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView cardScheduler, cardNotes, cardCalculator, cardCgpa,shearclassmote,viewclassnote;
    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardScheduler = findViewById(R.id.cardScheduler);
        cardNotes = findViewById(R.id.cardNotes);
        cardCalculator = findViewById(R.id.cardCalculator);
        cardCgpa = findViewById(R.id.cardCgpa);
        shearclassmote = findViewById(R.id.ShearNote);
        viewclassnote = findViewById(R.id.viewnote);

        cardScheduler.setOnClickListener(this);
        cardNotes.setOnClickListener(this);
        cardCalculator.setOnClickListener(this);
        cardCgpa.setOnClickListener(this);
        shearclassmote.setOnClickListener(this);
        viewclassnote.setOnClickListener(this);

        MainActivity.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return MainActivity.context;
    }

    public static int getPx(Context context, int dimensionDp) {
        float density = context.getResources().getDisplayMetrics().density;
        return (int) (dimensionDp * density + 0.5f);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cardScheduler:
                startActivity(new Intent(this, SchedulerActivity.class));
                break;
            case R.id.cardNotes:
                startActivity(new Intent(this, NotesActivity.class));
                break;
            case R.id.cardCalculator:
                startActivity(new Intent(this, CalculatorActivity.class));
                break;
            case R.id.cardCgpa:
                startActivity(new Intent(this, CgpaActivity.class));
                break;
            case R.id.ShearNote:
                startActivity(new Intent(this, MainNoteActivity.class));
                break;
            case R.id.viewnote:
                startActivity(new Intent(this, ViewUploadsActivity.class));
                break;
        }
    }
}
