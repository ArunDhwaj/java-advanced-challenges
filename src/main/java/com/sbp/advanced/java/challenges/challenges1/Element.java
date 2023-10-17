package com.sbp.advanced.java.challenges.challenges1;

enum Element {

    //Behave like a constructor
    HELIUM("He", "Gas"),

    //Behave like a constructor
    MAGNESIUM("Mg","Solid"),
    SODIUM("Na","Solid", "Sweet");

    private String chemicalSymbol;
    private String naturalState;

    private  String test;

    private Element(String newChemicalSymbol, String naturalState, String test) {
        chemicalSymbol = newChemicalSymbol;
        this.naturalState = naturalState;
        this.test = test;
    }

    private Element(String newChemicalSymbol, String naturalState) {
        this.chemicalSymbol = newChemicalSymbol;
        this.naturalState = naturalState;
    }

    public String chemicalSymbol() {
        return chemicalSymbol;
    }

    public String naturalState() {
        return naturalState;
    }

    public String test() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

}