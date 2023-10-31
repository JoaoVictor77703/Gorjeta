package br.com.etecia.gorjeta;

public class Gorjeta {
    public float valor;
    public float qualidade;

    protected float gorjeta;
    protected float valorTotal;

    public float getGorjeta(){
        return gorjeta;
    }

    public float getValorTotal(){
        return valorTotal;
    }

    public float getValor(){
        return valor;
    }

    public void setValor(float valor){
        this.valor = valor;
    }

    public void getQualidade(int qualidade){
        this.qualidade = qualidade;

    }

    public void calcularGorgeta() {

        this.gorjeta = this.valor*(this.qualidade/100);
        this.valorTotal = this.valor + this.gorjeta;
}



}
