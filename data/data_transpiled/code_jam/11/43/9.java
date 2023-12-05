@ GwtIncompatible ( "java.util.Scanner" ) public static int [ ] sieve ( int n ) {
  boolean [ ] s = new boolean [ n ] ;
  for ( int i = 3 ;
  i <= ( int ) ( n * 0.5 ) ;
  i += 2 ) {
    if ( s [ i ] ) {
      s [ i * i ] = new boolean [ ( n - i * i - 1 ) / ( 2 * i ) + 1 ] ;
    }
  }
  return new int [ 2 ] ;
}
