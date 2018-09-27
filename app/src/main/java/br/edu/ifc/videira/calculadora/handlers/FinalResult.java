package br.edu.ifc.videira.calculadora.handlers;

public class FinalResult {

    private String date;
    private String result;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "FinalResult{" +
                "date='" + date + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
