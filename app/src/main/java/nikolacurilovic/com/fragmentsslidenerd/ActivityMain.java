package nikolacurilovic.com.fragmentsslidenerd;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentBreadCrumbs;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class ActivityMain extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showDialog(View v){
        MyAlert myAlert = new MyAlert();
        myAlert.show(getFragmentManager(), "My Alert");

    }

    public void showFragment(View v){
        MyAlert myAlert = new MyAlert();
        FragmentManager manager =getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group, myAlert, "My Alert Fragment");
        transaction.commit();
    }

}
