public class Complex{
    int real;
    int img;

    public Complex(){}

    public Complex(int real,int img){
      this.real = real;
      this.img = img;
    }

     Complex sum(Complex x,Complex y){
      Complex c = new Complex();
      c.real = x.real + y.real;
      c.img = x.img + y.img;
      return c;
    }

     Complex sub(Complex x,Complex y){
      Complex c = new Complex();
      c.real = x.real - y.real;
      c.img = x.img - y.img;
      return c;
    }

     Complex mul(Complex x,Complex y){
      Complex c = new Complex();
      c.real = (x.real*y.real - x.img*y.img);
      c.img = (x.real*y.img + x.img*y.real);
      return c;
    }
}
