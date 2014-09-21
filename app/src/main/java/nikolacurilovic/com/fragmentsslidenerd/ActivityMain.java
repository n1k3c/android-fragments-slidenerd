package nikolacurilovic.com.fragmentsslidenerd;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class ActivityMain extends Activity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void respod(int i) {
        FragmentManager manager = getFragmentManager();
        FragmentB f2 = (FragmentB) manager.findFragmentById(R.id.fragment2);
        f2.changeData(i);
    }
}
