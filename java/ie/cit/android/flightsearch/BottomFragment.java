package ie.cit.android.flightsearch;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by Simon on 21/10/2015.
 */
public class BottomFragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bottom, container, false);
    }

    public void displayFlightQueryResult(String result)
    {
        EditText resultField = (EditText)getActivity().findViewById(R.id.flightQueryResult);
        resultField.setText(result);
    }
}
