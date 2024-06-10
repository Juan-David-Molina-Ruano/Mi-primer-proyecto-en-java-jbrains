package operaconesMatematcas;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalculadoraTest {

    Calculadora calculadora;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        calculadora = null;
    }

    @org.junit.jupiter.api.Test
    @Order(1)
    void sumar() {
        int a = 5;
        int b = 6;
        int resultadoEsperado = 11;
        int resultado = calculadora.sumar(a,b);
        assertEquals(resultadoEsperado,resultado);
    }

    @org.junit.jupiter.api.Test
    @Order(2)
    void restar() {
        int a = 10;
        int b = 6;
        int resultadoEsperado = 4;
        int resultado = calculadora.restar(a,b);
        assertTrue(resultadoEsperado == resultado);
    }

    @org.junit.jupiter.api.Test
    @Order(2)
    void multiplicar() {
        int a = 10;
        int b = 6;
        int resultadoEsperado = 60;
        int resultado = calculadora.multiplicar(a,b);
        if(resultadoEsperado != resultado){
            fail("Fallo la multiplicacion");
        }
    }

    @Test
    @Order(2)
    void dividir() {
        int a = 10;
        int b = 5;
        int resultadoEsperado = 2;

//        int resultado = calculadora.dividir(a,b);
//        if(resultadoEsperado != resultado){
//            fail("Fallo la division");
//        }

       if(b != 0){

       }else{
           assertThrows(
               ArithmeticException.class,
               () -> {
                   int result = calculadora.dividir(a,b);
               }


           );
       }
    }

    @BeforeAll
    static void alIniciarTodasLasPruebas(){
        System.out.println("Iniciar todas las pruebas");
    }
    @AfterAll
    static void alFinalizarTodasLasPruebas(){
        System.out.println("Finalizar todas las pruebas");
    }
}