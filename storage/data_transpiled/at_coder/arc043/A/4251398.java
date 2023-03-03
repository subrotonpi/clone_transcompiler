public static double N = Integer . parseInt ( input ) {
  double A = Integer . parseInt ( input . nextLine ( ) ) ;
  double B = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( L ) ;
  if ( L [ 0 ] - L [ N - 1 ] == 0 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    double P = B / ( L [ N - 1 ] - L [ 0 ] ) ;
    System . out . println ( P + " " + ( A - P * sum ( L ) / N ) ) ;
  }
  return P ;
}
