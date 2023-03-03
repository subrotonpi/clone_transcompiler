public static void print ( int N ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = i ;
  Arrays . sort ( a ) ;
  int G = a [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i += 1 ) {
    int A = a [ i ] ;
    while ( A % G != 0 ) {
      A = G ;
      G = A % G ;
    }
  }
  System . out . println ( G ) ;
}
