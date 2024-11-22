/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package intergenerica;

/**
 *
 * @author mase
 */
public interface Guardable<T> {
    void guardar(T elemento);
    
    T recuperar();
}
