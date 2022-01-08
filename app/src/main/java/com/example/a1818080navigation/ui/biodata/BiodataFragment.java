package com.example.a1818080navigation.ui.biodata;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.a1818080navigation.R;

public class BiodataFragment extends Fragment {

    private BiodataViewModel biodataViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        biodataViewModel =
                ViewModelProviders.of(this).get(BiodataViewModel.class);
        View root = inflater.inflate(R.layout.biodata_slideshow, container, false);

        final EditText edtNama =root.findViewById(R.id.input_nama);
        final EditText edtNim =root.findViewById(R.id.input_nim);
        final EditText edtJurusan =root.findViewById(R.id.input_jur);
        final EditText edtAngkatan =root.findViewById(R.id.input_ang);
        final TextView tvNama = root.findViewById(R.id.output_nama);
        final TextView tvNim = root.findViewById(R.id.output_nim);
        final TextView tvJurusan = root.findViewById(R.id.output_jur);
        final TextView tvAngkatan = root.findViewById(R.id.output_ang);
        final Button btnTampil= root.findViewById(R.id.tampil);

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                tvNama.setText(edtNama.getText().toString());
                tvNim.setText(edtNim.getText().toString());
                tvJurusan.setText(edtJurusan.getText().toString());
                tvAngkatan.setText(edtAngkatan.getText().toString());
            }
        });
        return root;
    }
}
