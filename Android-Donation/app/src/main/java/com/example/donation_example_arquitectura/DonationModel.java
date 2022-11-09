package com.example.donation_example_arquitectura;

public class DonationModel {

    // 1- Monto acumulado
    private int donationAmount;


    // 2. CONSTRUCTOR PARA RECIBIR UNA MONEDA
    public DonationModel(int donationAmount) {
        this.donationAmount = donationAmount;
    }

    public DonationModel() {
 this.donationAmount=0;
    }

    //3 PARA RECIBIR Y COMPROBAR DONACIONES
    public boolean saveDonation(String donation){
        Integer amount = Integer.valueOf(donation);
        if (amount <= 0) {
            return false;
        } else {
            this.donationAmount += amount;
            return true;
        }
    }

    //  4 RETONAR LA DONACIÓN
    public int getDonationAmount() {
        return donationAmount;
    }
}
