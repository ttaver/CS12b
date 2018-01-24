public class Interval{
  private double lo;
  private double hi;
}

public String getlo() {
  return this.lo;
}

public String gethi(){
  return this.hi;
}

public void setlo(double lo){
  this.lo = lo;
}

public void sethi(double hi){
  this.hi = hi; 
}
/** make a constructor with 2 parameters */
public Interval(double lo, double hi){
  this.lo = lo;
  this.hi = hi;
}

/** make a constructor with 1 paramter */
public Interval(double p){
  this.lo = p;
  this.hi = p;

/**
returns a string representation of the TestInterval in the form "[lo, hi]"
@return the string "[hi,lo]"
*/
public String toString(){
  return this.lo+ " " + this.hi;
   }

/**
adds two Intervals
@param a
@param b
@return the string representation of the a+b

*/

public static Interval add(Interval a, Interval b){
   Interval c = new Interval(a.lo+b.lo, a.hi+b.hi);
   return c;
   }
}

public static Interval subtract(Interval a, Interval b){
  Interval d = new Interval(a.lo-b.lo, a.hi-b.hi);
  return d;
}
