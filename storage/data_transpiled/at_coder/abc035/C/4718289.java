public static int [ ] toArray ( Scanner input ) {
  int N = input . nextInt ( ) , Q = input . nextInt ( ) ;
  int [ ] L = new int [ N + 10 ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    L [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < L . length ;
  i ++ ) {
    L [ i ] = 0 ;
  }
  return L ;
}
