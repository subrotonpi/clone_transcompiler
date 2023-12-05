public static void print ( int N ) {
  int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( P ) ;
  Arrays . sort ( Q ) ;
  Arrays . sort ( P ) ;
  Arrays . sort ( Q ) ;
  dp = new int [ N + 1 ] ;
  dp [ 0 ] = 1 ;
}
