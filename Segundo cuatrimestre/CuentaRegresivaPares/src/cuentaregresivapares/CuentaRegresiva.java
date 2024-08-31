package cuentaregresivapares;



public class CuentaRegresiva {
    public void imprimirParesRegresivos(int numerin){
        int contador = numerin;
        
        do {
            if (contador % 2 == 0){
                System.out.println(contador + " es par");
            }
            contador--;
        } while(contador >= 2);
    }
}
