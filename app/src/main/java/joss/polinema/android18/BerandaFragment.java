package joss.polinema.android18;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;



public class BerandaFragment extends Fragment {
    //membuat variabel untuk keluar dari halaman menu utama
    Button btn;
    RatingBar ratingBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // untuk bisa menampilkan ke mainactivity fragment
        View rootView = inflater.inflate(R.layout.fragment_beranda, container, false);



        btn = (Button)rootView.findViewById(R.id.button);
        ratingBar = (RatingBar)rootView.findViewById(R.id.idrating);

        return rootView;
    }


    public void onBtnClick(View view){
        float ratingvalue=ratingBar.getRating();
        Toast.makeText(getActivity(),"Rating is :"+ratingvalue, Toast.LENGTH_SHORT).show();
    }
}

