import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculadora_cal {

    Calculadora calidad = new Calculadora();


    @Test
    void sumar() {
        assertEquals(5, calidad.sumar(2, 3));
    }
    @Test
    void sumarNumeros_negativos() {
        assertEquals(-5, calidad.sumar(-2, -3));
    }

    @Test
    void restar() {
        assertEquals(1, calidad.restar(3, 2));

    }
    @Test
    void restarResultado_negativo() {
        assertEquals(-1, calidad.restar(2, 3));
    }

    @Test
    void multiplicar() {
        assertEquals(6, calidad.multiplicar(2, 3));

    }
    @Test
    void multiplicarPorCero() {
        assertEquals(0, calidad.multiplicar(0, 5));
        assertEquals(0, calidad.multiplicar(5, 0));
    }

    @Test
    void dividir() {
        assertEquals(2, calidad.dividir(6, 3));
    }
    @Test
    void dividirPorCeroDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            calidad.dividir(10, 0);
        });
    }


}