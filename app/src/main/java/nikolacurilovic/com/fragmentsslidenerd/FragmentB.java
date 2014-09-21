package nikolacurilovic.com.fragmentsslidenerd;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Nikola on 14.09.2014..
 */
public class FragmentB extends Fragment {

    TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        text = (TextView) getActivity().findViewById(R.id.textView);
    }

    public void changeData(int i){
        Resources res = getResources();
        String[] descriptions = res.getStringArray(R.array.descriptions);
        text.setText(descriptions[i]);
    }
}
