public class Complex{
  public double re;
  public double im;

  public Complex(double re, double im){
    this.re = re;
    this.im = im;
  }

  public Complex(double re){
    this.re = re;
    this.im = 0;
  }

  /**
  getters. returns the real part of the complex number x called as
  double r = z.getReal();

  object.method name();
  */

  public double getReal(){
    return this.re;
  }

  public double getImag(){
    return this.im;
  }
  /**  setters. changes the real part
  of a complex number x called as z.setReal(1.1); */

  private void setReal(double re){
    this.re = re;
  }

  private void setImag(double im){
    this.im = im;
  }

  /** adds two complex numbers to get a complex numbers
  called as Complex w = Complex.add(u,v);

  class.method name();
  */
  public static Complex add(Complex u, Complex v){
    Complex z = new Complex(u.re+v.re, u.im+v.im);
    return z;
  }

  public static Complex multiply(Complex u, Complex v){
    double real, imag;
    real = u.re*v.re - u.im*v.im;
    imag = u.re*v.im + u.im*v.re;
    Complex w = new Complex(real, imag);
    return w;
  }

  public String toString(){
    return this.re+"+"+this.im+"i";
  }
}
