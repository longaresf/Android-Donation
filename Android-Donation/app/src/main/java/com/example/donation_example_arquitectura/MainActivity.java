package com.example.donation_example_arquitectura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.donation_example_arquitectura.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //  1declara variables bindign
    private ActivityMainBinding mBinding;
  // 1 luego la comentamos  private  DonationModel model;
    private  Controller controller;
    @Override

    // 2 INFLAMOS LA VISTA
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
       // model = new DonationModel();
        controller = new Controller();
        mBinding.button.setOnClickListener(view ->makeDonation());
    }
    // HAGO MÉTODO PARA DONAR

    private void makeDonation(){
        // primero se cae
       //  1 Integer amount = Integer.valueOf(mBinding.tvDonation.getText().toString());
        // agrego en segundo lugar
        boolean donation = controller.saveDonation(mBinding.tvDonation.getText().toString());
        if (donation) {
            int totalDonation = controller.totalDonation();
            String total = getString(R.string.total_donation, String.valueOf(totalDonation));
            mBinding.tvTotal.setText(total);
            mBinding.tvDonation.setText("");
        } else {
            ShowMessage("Donacion no Realizada");

        }
    }

    private void ShowMessage (String messsage){
        Toast.makeText(this,messsage,Toast.LENGTH_LONG).show();
    }
}