@ InputFunction public static void input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int k = Integer . parseInt ( input . readLine ( ) ) ;
  Pair [ ] wp = new Pair [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    wp [ i ] = Pair . of ( Integer . parseInt ( input . readLine ( ) ) ) ;
  }
  double L = 0.0 ;
  double H = 100.0 ;
  while ( ( H - L ) > 1e-10 ) {
    double M = ( H + L ) / 2 ;
    double [ ] [ ] p = new double [ n ] [ k ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      p [ i ] [ 0 ] = 0 ;
      p [ i ] [ 1 ] = wp [ i ] . x * ( wp [ i ] . y - M ) / 100.0 ;
    }
    Arrays . sort ( p , new Comparator < Double > ( ) {
      @ Override public int compare ( Double a , Double b ) {
        return a - b ;
      }
    }
    ) ;
  }
}
