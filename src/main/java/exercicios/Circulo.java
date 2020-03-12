package exercicios;

public class Circulo {

    private Double raio;

    public Circulo(Double raio){
        this.setRaio(raio);
    }

    public void setRaio(Double raio) {
        if (raio <= 0){
            throw  new IllegalArgumentException("O raio deve ser maior que 0");
        }
        this.raio = raio;
    }

    public Double getRaio() { return raio; }

    public Double calcularArea() { return 3.0 * (raio * raio); }

    public Double calcularPerimetro() { return  2 * 3.0 * raio; }

}
