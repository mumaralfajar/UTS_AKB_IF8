package com.example.a10118340_uts_akb_if8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/*
    NIM             : 10118340
    Nama            : Muhammad Umar Al Fajar
    Kelas           : IF8
    Matakuliah      : Aplikasi Komputasi Bergerak
*/

public class ProfileFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile, container, false);
        return view;
    }
}
