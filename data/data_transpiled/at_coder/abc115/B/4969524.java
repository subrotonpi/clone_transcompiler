public static void print ( int N ) {
  int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  Arrays . sort ( P ) ;
  P [ 0 ] = P [ 0 ] / 2 ;
  System . out . println ( sum ( P ) ) ;
}
