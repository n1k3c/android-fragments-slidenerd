package nikolacurilovic.com.fragmentsslidenerd;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by Nikola on 14.09.2014..
 */
public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{

    ListView list;
    Communicator communicator;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        communicator = (Communicator) getActivity();
        list = (ListView) getActivity().findViewById(R.id.listView);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.titles, android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        communicator.respod(i);
    }
}
