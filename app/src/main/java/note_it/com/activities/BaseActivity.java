package note_it.com.activities;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;

import note_it.com.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the status bar color
        Window window = getWindow();
        window.setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark));

        // Set the navigation bar color
        window.setNavigationBarColor(getResources().getColor(R.color.colorPrimary));

        // Ensure the status bar icons are light (i.e., white) on dark background
        int flags = window.getDecorView().getSystemUiVisibility();
        flags &= ~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR; // clear the flag if it was set
        window.getDecorView().setSystemUiVisibility(flags);
    }
}
