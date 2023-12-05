public static void print ( int N ) {
  int [ ] C = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    C [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  double p = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] S = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( i != j && C [ i ] % C [ j ] == 0 ) {
      }
    }
    int s = S . length ;
    p += ( s % 2 == 0 ) ? ( s + 2 ) / ( 2 * s + 2 ) : 0.5 ;
  }
  System . out . println ( p ) ;
}
