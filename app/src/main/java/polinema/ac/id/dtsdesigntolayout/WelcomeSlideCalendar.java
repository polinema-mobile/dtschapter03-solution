package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeSlideCalendar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide);
    }

    public void clickGetStarted(View view) {
        Intent i = new Intent(WelcomeSlideCalendar.this, WelcomeSlideSuperhero.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(WelcomeSlideCalendar.this, WelcomeBack.class);
        startActivity(i);
    }
}
