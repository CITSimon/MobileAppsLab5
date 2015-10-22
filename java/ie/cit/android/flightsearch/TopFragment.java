package ie.cit.android.flightsearch;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by Simon on 21/10/2015.
 */
public class TopFragment extends Fragment
{
    private FlightSearcher interfaceImplementor;

    //The interface to communicate out to the parent Activity
    public interface FlightSearcher
    {
        public void searchForFlights(String origin, String destination);
    }

    @Override
    public void onAttach(Activity context) {
        super.onAttach(context);
        this.interfaceImplementor = (FlightSearcher)context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_top, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button flightSearchButton = (Button)getActivity().findViewById(R.id.button);
        flightSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Spinner originSpinner = (Spinner)getActivity().findViewById(R.id.origin);
                Spinner destinationSpinner = (Spinner)getActivity().findViewById(R.id.destination);

                interfaceImplementor.searchForFlights(originSpinner.getSelectedItem().toString(), destinationSpinner.getSelectedItem().toString());
            }
        });
    }

}
