package az.vla.pro;

public class Combination {
    private final Factorializer factorializer;
    public Combination(Factorializer factorializer){
        this.factorializer=factorializer;
    }

    public double C(int m,int n){
        if(m<n){
            throw new InvalidInput("Please enter m and n correctly: C(m,n)");
        }
        return factorializer.fact(m)/(factorializer.fact(n)*factorializer.fact(m-n));
    }
}
