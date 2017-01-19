package hunter.black.nextdoor;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TabHost th= (TabHost)findViewById(R.id.tabHost);
        th.setup();
        TabHost.TabSpec specs=th.newTabSpec("tag1");
        specs.setContent(R.id.linearLayout);
        specs.setIndicator("Login");
        th.addTab(specs);


        specs=th.newTabSpec("tag2");
        specs.setContent(R.id.linearLayout2);
        specs.setIndicator("Sign Up");
        th.addTab(specs);
    }


}
