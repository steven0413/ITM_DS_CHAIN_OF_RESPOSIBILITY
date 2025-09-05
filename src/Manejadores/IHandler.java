package Manejadores;

public interface IHandler {
    void setNext(IHandler next);
    void dispense(int amount); 
}