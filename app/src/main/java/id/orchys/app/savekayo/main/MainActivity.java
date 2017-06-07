package id.orchys.app.savekayo.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import id.orchys.app.savekayo.R;
import id.orchys.app.savekayo.main.image.AddImageFragment;
import id.orchys.app.savekayo.main.report.ReportFragment;

public class MainActivity extends AppCompatActivity {

    private MainAdapter fragmentAdapter;
    private ViewPager contentPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contentPager = (ViewPager) findViewById(R.id.content);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        initComponent();
    }

    private void initComponent(){
        fragmentAdapter = new MainAdapter(getSupportFragmentManager());
        fragmentAdapter.addFragment(0, new AddImageFragment());
        fragmentAdapter.addFragment(1, new ReportFragment());
        contentPager.setAdapter(fragmentAdapter);
        contentPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    contentPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_dashboard:
                    contentPager.setCurrentItem(1);
                    return true;
            }
            return false;
        }

    };

}
