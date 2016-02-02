package adamchaulk.project1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebScreenActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.weei.com");

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

    public void onClick(View v) {
        switch (v.getId()) {
            case  R.id.weei: {
                webView.loadUrl("http://www.weei.com");
                break;
            }
            case R.id.nesn: {
                webView.loadUrl("http://www.nesn.com");
                break;
            }
            case R.id.espn: {
                webView.loadUrl("http://www.espn.com");
                break;
            }

        }
    }

}
