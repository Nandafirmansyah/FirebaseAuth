package joss.polinema.android18;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class FragmentAbout extends Fragment {
    //membuat variabel untuk keluar dari halaman menu utama
    Button btn;
    RatingBar ratingBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_fragment_about, container, false);



        btn = (Button)rootView.findViewById(R.id.button);
        return rootView;
    }

}
