public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] factor = new int [ n + 1 ] ;
  factor [ 0 ] = 1 ;
  factor [ 1 ] = m ;
  for ( int i = 2 ;
  i <= ( int ) ( m * 0.5 ) ;
  i ++ ) {
    if ( m % i == 0 ) {
      factor [ i ] = i ;
      factor [ i + 1 ] = m / i ;
    }
  }
  Arrays . sort ( factor , Collections . reverseOrder ( ) ) ;
  for ( int f : factor ) {
    if ( f <= m / n ) {
      System . out . println ( f ) ;
      exit ( ) ;
    }
  }
}
