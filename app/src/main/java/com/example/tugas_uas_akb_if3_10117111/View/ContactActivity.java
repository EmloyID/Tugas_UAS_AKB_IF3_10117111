package com.example.tugas_uas_akb_if3_10117111.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugas_uas_akb_if3_10117111.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


/** NIM : 10117111
 * Nama : Tias Gumelar T
 * Kelas : IF-3
 * Tanggal : 08-08-2020**/
public class ContactActivity extends Fragment {
    public ContactActivity() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        ((AppCompatActivity) getActivity()).getSupportActionBar().show();
        // Inflate the layout for this fragment
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        return inflater.inflate(R.layout.activity_contact, container, false);

    }

}
