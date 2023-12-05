@ GwtIncompatible ( "java.util.Scanner" ) public static int [ ] getStdIn ( ) {
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] r = new int [ Q ] ;
  for ( int x = 0 ;
  x < Q ;
  x ++ ) {
    int [ ] A = new int [ 2 ] ;
    for ( int i = 0 ;
    i < A . length ;
    i ++ ) A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    x = A [ 0 ] * A [ 1 ] ;
  }
  int s = floor ( sqrt ( x ) ) ;
  return r ;
}
