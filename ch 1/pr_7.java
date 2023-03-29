/*
    Q.7 :- Addition , subtraction , multiplication of two complex number
*/

class Complex{
    int real , imag;

    Complex() {}
    Complex(int real, int imag){
        this.real = real;
        this.imag = imag;
    }

    Complex addition(Complex n1 , Complex n2){
        Complex res = new Complex();
        res.real = n1.real + n2.real;
        res.imag = n1.imag + n2.imag;
        return res;
    }

    Complex subtract(Complex n1, Complex n2){
        Complex res = new Complex();
        res.real = n1.real - n2.real;
        res.imag = n1.imag - n2.imag;
        return res;
    }

    Complex multiplication(Complex n1, Complex n2){
        Complex res = new Complex();
        res.real = n1.real * n2.real;
        res.imag = n1.imag * n2.imag;
        return res;
    }

}

public class pr_7
 {
    public static void main(String[] args) {
        Complex c1 = new Complex(3,30);
        Complex c2 = new Complex(10,20);

        Complex add = new Complex();
        Complex sub = new Complex();
        Complex mul = new Complex();

        add = add.addition(c1, c2);
        sub = sub.subtract(c1, c2);
        mul = mul.multiplication(c1,c2);

        System.out.println("SUM --> " + add.real + " + " + add.imag);
        System.out.println("SUB --> " + sub.real + " + " + sub.imag);
        System.out.println("MUL --> " + mul.real + " + " + mul.imag);
    }
}
