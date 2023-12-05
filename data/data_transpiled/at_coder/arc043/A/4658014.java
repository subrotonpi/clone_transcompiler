public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] S = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( S ) ;
  if ( S [ 0 ] != S [ S . length - 1 ] ) {
    int P = B / ( S [ S . length - 1 ] - S [ 0 ] ) ;
    int Q = A - P * sum ( S ) / N ;
    System . out . println ( P + " " + Q ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return N ;
}
