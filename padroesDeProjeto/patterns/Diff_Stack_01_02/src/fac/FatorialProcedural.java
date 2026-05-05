package fac;

public class FatorialProcedural extends FatorialFactory {

    @Override
    public long fatorial(int n) {
        long total = 1;
        for (int i=2; i<=n; i++) {
            total = total * i;
        }
        return total;
    }

}
