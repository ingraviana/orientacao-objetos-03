package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CirculoTeste {

    @Test
    public void criarObjetoCirculo(){
        Circulo c1 = new Circulo(2.0);
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributos(){
        Circulo c1 = new Circulo(2.0);
        assertNotNull(c1.getRaio());
    }

    @Test
    public void metodoGetRaio() {
        Circulo c1 = new Circulo(2.0);
        assertEquals(2.0, c1.getRaio());
    }

    @Test
    public void metodoSetRaio() {
        Circulo c1 = new Circulo(2.0);
        assertEquals(2.0, c1.getRaio());
    }

    @Test
    public void metodoSetBaseInvalido() {
        Circulo c1 = new Circulo(2.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setRaio(-4.0));
        assertEquals("O raio deve ser maior que 0", exception.getMessage());
    }
    
    @Test
    public void metodoCalcularArea(){

        //Arrange
        Circulo c1 = new Circulo(2.0);
        Double valorEsperado = 12.0;
        //Act
        Double valorObtido = c1.calcularArea();
        //Assert
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro(){

        //Arrange
        Circulo c1 = new Circulo(2.0);
        Double valorEsperado = 12.0;
        //Act
        Double valorObtido = c1.calcularPerimetro();
        //Assert
        assertEquals(valorEsperado, valorObtido);
    }



}
