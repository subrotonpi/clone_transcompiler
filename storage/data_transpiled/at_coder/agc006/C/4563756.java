@ SafeVarargs public static void main ( String ... args ) throws IOException {
  int n = Integer . parseInt ( args [ 0 ] ) ;
  int ... a = args . length ;
  int [ ] t = new int [ n - 1 ] ;
  int s = t [ n ] ;
  for ( int i = a . length - a [ n ] ;
  i > 0 ;
  i -- ) {
    s = t [ i ] ;
  }
  int k = a [ n + 1 ] ;
  while ( k > 0 ) {
    if ( k % 2 == 0 ) s = t [ s ] ;
  }
}
