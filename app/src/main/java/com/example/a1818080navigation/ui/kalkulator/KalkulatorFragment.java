package com.example.a1818080navigation.ui.kalkulator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.a1818080navigation.R;

public class KalkulatorFragment extends Fragment {

    Integer input1,input2;

    private KalkulatorViewModel kalkulatorViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        kalkulatorViewModel = ViewModelProviders.of(this).get(KalkulatorViewModel.class);
        View root = inflater.inflate(R.layout.kalkulator_gallery, container, false);

        final EditText bil1 = root.findViewById(R.id.bil1);
        final EditText bil2 = root.findViewById(R.id.bil2);
        final TextView output_bil = root.findViewById(R.id.output_bil);
        final Button tambah =  root.findViewById(R.id.tambah);
        final Button kurang =  root.findViewById(R.id.kurang);
        final Button bagi =  root.findViewById(R.id.bagi);
        final Button kali =  root.findViewById(R.id.kali);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((bil1.getText().length() > 0) && (bil2.getText().length() > 0)) {
                    input1 = Integer.parseInt(bil1.getText().toString().trim());
                    input2 = Integer.parseInt(bil2.getText().toString().trim());
                    int Tambah = input1+input2;
                    output_bil.setText(Integer.toString(Tambah));
                } else {
                    Toast.makeText(getActivity(), "Inputan Salah !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((bil1.getText().length() > 0) && (bil2.getText().length() > 0)) {
                    input1 = Integer.parseInt(bil1.getText().toString().trim());
                    input2 = Integer.parseInt(bil2.getText().toString().trim());
                    int Tambah = input1-input2;
                    output_bil.setText(Integer.toString(Tambah));
                } else {
                    Toast.makeText(getActivity(), "Inputan Salah !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((bil1.getText().length() > 0) && (bil2.getText().length() > 0)) {
                    input1 = Integer.parseInt(bil1.getText().toString().trim());
                    input2 = Integer.parseInt(bil2.getText().toString().trim());
                    int Tambah = input1/input2;
                    output_bil.setText(Integer.toString(Tambah));
                } else {
                    Toast.makeText(getActivity(), "Inputan Salah !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((bil1.getText().length() > 0) && (bil2.getText().length() > 0)) {
                    input1 = Integer.parseInt(bil1.getText().toString().trim());
                    input2 = Integer.parseInt(bil2.getText().toString().trim());
                    int Tambah = input1*input2;
                    output_bil.setText(Integer.toString(Tambah));
                } else {
                    Toast.makeText(getActivity(), "Inputan Salah !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        kalkulatorViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@NonNull String s) {
            }
        });
        return root;
    }
}
