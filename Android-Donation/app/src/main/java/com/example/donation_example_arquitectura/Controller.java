package com.example.donation_example_arquitectura;

public class Controller {
    // referencia al modelo
    private DonationModel model;

    public Controller() {

        this.model = new DonationModel();

    }


    // devuelve el metodo para guardar total
    public boolean saveDonation(String amount) {
        return
                model.saveDonation(amount);
    }

    // devuelve metodo para mostrar el total

    public int totalDonation() {
        return model.getDonationAmount();
    }
}
