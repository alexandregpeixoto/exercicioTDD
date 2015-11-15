package examerotina;

/**
 *
 * @author Alexandre
 */
public class daveAtkins implements generic{
    private dog dog;
    
    public daveAtkins(){
        this.dog = new dog();
    }
    @Override
    public String getNome() {
        return "Dave Atkins";
    }
    
    public dog getDog(){
        return this.dog;
    }
}