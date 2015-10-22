package ie.cit.android.flightsearch;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Simon on 21/10/2015.
 */
public class MainActivity extends Activity implements TopFragment.FlightSearcher
{
    @Override
    public void searchForFlights(String origin, String destination) {
        BottomFragment bottomFragment = (BottomFragment)getFragmentManager().findFragmentById(R.id.bottomFragment);
        int randomPrice = (int)(Math.random()*200);
        String resultString = origin + " - " + destination + " = "+randomPrice;
        bottomFragment.displayFlightQueryResult(resultString);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
