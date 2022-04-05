package com.example.distress;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
 import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.textfield.TextInputEditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link loginFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class loginFragment extends Fragment {

    private LottieAnimationView animationView;
    private TextInputEditText username,password ;
    private Button login,donthave;

    public loginFragment() {

    }


    public static loginFragment newInstance(String param1, String param2) {
        loginFragment fragment = new loginFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        animationView = view.findViewById(R.id.animationView) ;
        username = view.findViewById(R.id.email) ;
        password = view.findViewById(R.id.password) ;
        login = view.findViewById(R.id.signup) ;
        donthave =view.findViewById(R.id.donthave) ;
        donthave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        login.setOnClickListener(view1 -> {


        });

        return view ;
    }
}