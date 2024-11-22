package funcionales;

import java.util.function.BinaryOperator;

public class Funcionales {

    public static void main(String[] args) {
         OperacionSuma operacion = new OperacionSuma();
         Operable<Integer> sumar = new OperacionSuma();
         Operable<Integer> restar = new OperacionResta();
         Operable<Integer> multiplicar = new Operable<>(){
             @Override
             public Integer operar(Integer a, Integer b) {
                 return a * b;
             }
         };
         
         Operable<Integer> potencia = (Integer b, Integer e) -> {
             return ((Double) (Math.pow(b, e))).intValue();
         };
         
         System.out.println(sumar.operar(6, 4));
         
         realizarOperacion(4, 6, sumar);
         realizarOperacion(4, 6, restar);
         realizarOperacion(4, 6, multiplicar);
         realizarOperacion(4, 6, potencia);
         
         realizarOperacion(4, 6, (b, e) -> ((Double) Math.pow(b, e)).intValue());
         
         realizarOperacion("Hola", "Mundo", (a, b) -> ((Integer) (a.length() + b.length())).toString());
    }
    
    public static <T> void realizarOperacion(T op1, T op2, Operable<T> operacion) {
        System.out.println(operacion.operar(op1, op2));
    }
    
    public static <T> void realizarOperacion2(T op1, T op2, BinaryOperator<T> operacion) {
        System.out.println(operacion.apply(op1, op2));
    }
}
