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


public class ActivityMain extends Activity {

    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
    }

    public void addA(View view) {
        FragmentA f1 = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group, f1, "A");
        transaction.addToBackStack("addA");
        transaction.commit();
    }

    public void removeA(View view) {
        FragmentA f1 = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if(f1 != null){
            transaction.remove(f1);
            transaction.addToBackStack("removeA");
            transaction.commit();
        }else {
            Log.d("Error", "Else condition");
        }
    }

    public void replaceAWithB(View view) {
        FragmentB f2 = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.group, f2, "B");
        transaction.addToBackStack("replaceAWithB");
        transaction.commit();
    }

    public void addB(View view) {
        FragmentB f2 = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group, f2, "B");
        transaction.addToBackStack("addB");
        transaction.commit();
    }

    public void removeB(View view){
        FragmentB f2 = (FragmentB) manager.findFragmentByTag("B");
        FragmentTransaction transaction = manager.beginTransaction();
        if(f2 != null) {
            transaction.remove(f2);
            transaction.addToBackStack("removeB");
            transaction.commit();
        }else {
            Log.d("Error 2", "Else condition");
        }
    }

    public void replaceBWithA(View view) {
        FragmentA f1 = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.group, f1, "A");
        transaction.addToBackStack("replaceBWithA");
        transaction.commit();
    }

    public void attachA(View view){
        FragmentA f1 = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if(f1 != null) {
            transaction.attach(f1);
            transaction.addToBackStack("attachA");
            transaction.commit();
        }
    }

    public void detachA(View view){
        FragmentA f1 = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if(f1 != null) {
            transaction.detach(f1);
            transaction.addToBackStack("detachA");
            transaction.commit();
        }
    }

}
