package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
    }

    public void postChangePassword(View view) {
        Intent i = new Intent(ResetPassword.this, SuccessActivity.class);
        startActivity(i);
    }
}
