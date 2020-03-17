package exercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class CorrentistaTeste {
        private Correntista c1;

        @BeforeEach
        public void beforeEach(){
            c1 = new Correntista(1234, "July", "july@email.com", "1234 - 5678");
        }

        @Test
        public void criarObjetoCorrentista() {
            assertNotNull(c1);
        }

        @Test
        public void presencaAtributoCodigo() {
            assertEquals(1234, c1.getCodigo());
        }

        @Test
        public void presencaAtributoNome() {
            assertEquals("July", c1.getNome());
        }

        @Test
        public void presencaAtributoEmail() {
            assertEquals("july@email.com", c1.getEmail());
        }

        @Test
        public void presencaAtributoTelefone() {
            assertEquals("1234 - 5678", c1.getTelefone());
        }

        @Test
        public void construtorSemEmailETelfone(){
            Correntista correntista = new Correntista(1234, "July");
            assertEquals(1234, correntista.getCodigo());
            assertEquals("July", correntista.getNome());
            assertNull(correntista.getEmail());
            assertNull(correntista.getTelefone());
        }

        @Test
        public void metodoSetCodigo() {
            c1.setCodigo(1234);
            assertEquals(1234, c1.getCodigo());
        }

        @Test
        public void metodoSetCodigoIncorreto() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setCodigo(-2));
            assertEquals("Codigo deve ser maior que 0", exception.getMessage());
        }

        @Test
        public void metodoSetNome() {
            assertEquals("July", c1.getNome());
        }

        @Test
        public void metodoSetNomeIncorreto() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setNome("a"));
            assertEquals("Nome invalido", exception.getMessage());
        }

        @Test
        public void metodoSetEmail() {
            assertEquals("july@email.com", c1.getEmail());
        }

        @Test
        public void metodoSetEmailIncorreto() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setEmail("aaiohfi"));
            assertEquals("E-mail invalido", exception.getMessage());
        }

        @Test
        public void metodoSetTelefone() {
            assertEquals("1234 - 5678", c1.getTelefone());
        }

        @Test
        public void metodoSetTelefoneIncorreto() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setTelefone("770"));
            assertEquals("Telefone invalido", exception.getMessage());
        }
}

