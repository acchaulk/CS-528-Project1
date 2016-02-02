package adamchaulk.project1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class FlagScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.flag_screen:
                startActivity(new Intent(this, FlagScreenActivity.class));
                return true;
            case R.id.box_screen:
                startActivity(new Intent(this, BoxScreenActivity.class));
                return true;
            case R.id.web_screen:
                startActivity(new Intent(this, WebScreenActivity.class));
                return true;
            case R.id.address_screen:
                startActivity(new Intent(this, AddressScreenActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
