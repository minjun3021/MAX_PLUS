package maxplus.kmj.com.maxplus;

import android.os.Bundle;
import android.util.Log;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import maxplus.kmj.com.maxplus.fragments.AccountFragment;
import maxplus.kmj.com.maxplus.fragments.BuyFragment;
import maxplus.kmj.com.maxplus.fragments.DepositFragment;
import maxplus.kmj.com.maxplus.fragments.ErrorFragment;
import maxplus.kmj.com.maxplus.fragments.EventFragment;
import maxplus.kmj.com.maxplus.fragments.EventnoticeFragment;
import maxplus.kmj.com.maxplus.fragments.MediaFragment;
import maxplus.kmj.com.maxplus.fragments.MessageFragment;
import maxplus.kmj.com.maxplus.fragments.MoveFragment;
import maxplus.kmj.com.maxplus.fragments.NoticeFragment;
import maxplus.kmj.com.maxplus.fragments.WithdrawFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toolbar);
        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.deposit:
                DepositFragment depositFragment=new DepositFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,depositFragment.newInstance()).commit();
                break;
            case R.id.withdraw:
                WithdrawFragment withdrawFragment=new WithdrawFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,withdrawFragment.newInstance()).commit();
                break;
            case R.id.move:
                MoveFragment moveFragment=new MoveFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,moveFragment.newInstance()).commit();
                break;
            case R.id.event:
                EventFragment eventFragment=new EventFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,eventFragment.newInstance()).commit();
                break;

            case R.id.message:
                MessageFragment messageFragment=new MessageFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,messageFragment.newInstance()).commit();
                break;
            case R.id.account:
                AccountFragment accountFragment=new AccountFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,accountFragment.newInstance()).commit();
                break;

            case R.id.notice:
                NoticeFragment noticeFragment=new NoticeFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,noticeFragment.newInstance()).commit();
                break;
            case R.id.error:
                ErrorFragment errorFragment=new ErrorFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,errorFragment.newInstance()).commit();
                break;
            case R.id.eventnotice:
                EventnoticeFragment eventnoticeFragment=new EventnoticeFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,eventnoticeFragment.newInstance()).commit();
                break;
            case R.id.media:
                MediaFragment mediaFragment=new MediaFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,mediaFragment.newInstance()).commit();
                break;
                case R.id.buy:
                    BuyFragment buyFragment=new BuyFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,buyFragment.newInstance()).commit();
                break;

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
