package com.si5a.siswabaru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNomorPendaftaran;
    EditText etNama;
    Button btnDaftar;
    String nomorPendaftaran, nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        etNama = findViewById(R.id.et_nama);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nomorPendaftaran = etNomorPendaftaran.getText().toString();
                nama = etNama.getText().toString();

                if(nomorPendaftaran.trim().equals("")){
                    etNomorPendaftaran.setError("Nomor Pendaftaran Harus Diisi!");
                }
                else if(nama.trim().equals("")){
                    etNama.setError("Nama wajib diisi!");
                }
                else{
                    Toast.makeText(MainActivity.this, " pendaftaran berhasil" + nama+ "anda telah terdaftar", Toast.
                            LENGTH_SHORT).show();                                                                                                                 0erdaftar", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}