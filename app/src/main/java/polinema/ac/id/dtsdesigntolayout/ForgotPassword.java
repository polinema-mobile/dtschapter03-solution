package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }

    public void postSendRequest(View view) {
        Intent i = new Intent(ForgotPassword.this, ResetPassword.class);
        startActivity(i);
    }
}
