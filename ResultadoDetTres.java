/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinantes;

/**
 *
 * @author carlos
 */
public class ResultadoDetTres {

    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    private final double g;
    private final double h;
    private final double i;
    public double rst;
    public String cr;

    public ResultadoDetTres(double a1, double a2, double a3,
            double b1, double b2, double b3, double c1, double c2, double c3) {
        a = a1;
        b = a2;
        c = a3;
        d = b1;
        e = b2;
        f = b3;
        g = c1;
        h = c2;
        i = c3;
        double rs1 = a*e*i;
        double rs2 = b*f*g;
        double rs3 = d*h*c;
        double ss1 = c*e*g;
        double ss2 = b*d*i;
        double ss3 = f*h*a;
        
        rst = rs1 + rs2 + rs3 -ss1 - ss2 - ss3;
        cr = String.format("%.3f",rst);
    }
}
