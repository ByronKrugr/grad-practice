package za.co.dvt.ppu;

import java.io.IOException;

public class BadClass {
    public int d(int a, int b){
        try {
            if (b == 0)
                return Integer.MAX_VALUE;
            else
                return a/b;
        } catch (Exception e){

        }
        return 0;
    }
}
