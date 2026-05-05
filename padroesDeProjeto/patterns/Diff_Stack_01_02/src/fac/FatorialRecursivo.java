package fac;

public class FatorialRecursivo extends FatorialFactory {

    @Override
    public long fatorial(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}