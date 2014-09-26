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
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        text = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    public void changeData(int index){
       String[] descriptions = getResources().getStringArray(R.array.description);
       text.setText(descriptions[index]);
    }

}
