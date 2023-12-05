public static boolean pos ( int n , int pd , int pg ) {
  Fraction pdf = new Fraction ( pd , 100 ) ;
  if ( pdf . denominator <= n ) {
    if ( pdf . numerator > 0 && pg == 0 ) return false ;
    if ( pdf . numerator != pdf . denominator && pg == 100 ) return false ;
    return true ;
  }
  return false ;
}
