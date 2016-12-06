
package zadanie2;

public abstract class GeomTvar {
    
    protected int x;
    protected int y;
    
    protected GeomTvar(int x,int y){
        this.x=x;
        this.y=y;
    }
    protected abstract double VypocitajObsah();
    protected abstract double VypocitajObvod();   
}
