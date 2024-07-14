package org.example;

public class ChovnatlhImpl implements Chovnatlh {
    private String wa$DIchPong; // First Name
    private String qavPong;     // Last Name
    private String patlh;       // Title
    private String ghom;        // Organization

    public ChovnatlhImpl() {}
    public ChovnatlhImpl(String wa$DIchPong, String qavPong, String patlh, String ghom) {
        this.wa$DIchPong = wa$DIchPong;
        this.qavPong = qavPong;
        this.patlh = patlh;
        this.ghom = ghom;
    }

    // Getters
    public String tlhapWa$DIchPong() {
        return wa$DIchPong;
    }

    public String tlhapQavPong() {
        return qavPong;
    }

    public String tlhapPatlh() {
        return patlh;
    }

    public String tlhapGhom() {
        return ghom;
    }


    // Setters
    public void cherWa$DIchPong(String wa$DIchPong){
        this.wa$DIchPong = wa$DIchPong;
    }

    public void cherQavPong(String qavPong) {
        this.qavPong = qavPong;
    }

    public void cherPatlh(String patlh) {
        this.patlh = patlh;
    }

    public void cherGhom(String ghom) {
        this.ghom = ghom;
    }

    public String toString() {
        return wa$DIchPong + " " + qavPong + ": " + patlh + ", " + ghom;
    }
}
