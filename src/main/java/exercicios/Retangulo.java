package exercicios;

public class Retangulo {
    private Double base;
    private Double altura;

    public Retangulo(Double base, Double altura){
       this.setBase(base);
       this.setAltura(altura);
    }

    public void setAltura(Double altura) {
        if (altura <= 0 ) {
            throw  new IllegalArgumentException("A altura deve ser maior que 0");
        }
        this.altura = altura;
    }

    public void setBase(Double base) {
        if (base <= 0 ) {
            throw  new IllegalArgumentException("A base deve ser maior que 0");
        }
        this.base = base;
    }

    public Double getAltura() { return altura;}

    public Double getBase() { return base;}

    public Double calcularArea() { return base * altura;}

    public Double calcularPerimetro() { return 2 * (base + altura);}
}
