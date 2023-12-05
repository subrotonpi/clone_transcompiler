public static double N = Integer . parseInt ( input ) {
  double A = Integer . parseInt ( input . nextLine ( ) ) ;
  double B = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] S = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( S ) ;
  if ( S [ 0 ] == S [ S . length - 1 ] ) {
    System . out . println ( - 1 ) ;
  }
  else {
    double P = B / ( S [ S . length - 1 ] - S [ 0 ] ) ;
    double tmp = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      tmp += P * S [ i ] ;
    }
    double Q = A - ( tmp ) / N ;
    System . out . println ( P + " " + Q ) ;
  }
  return P ;
}
