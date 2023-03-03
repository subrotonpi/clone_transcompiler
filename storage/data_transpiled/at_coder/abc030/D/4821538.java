public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Integer . parseInt ( input ) - 1 ) ;
  }
  List < Integer > b = new ArrayList < > ( ) ;
  int i = m - 1 ;
  while ( true ) {
    if ( b . contains ( i ) ) {
      int c = b . indexOf ( i ) ;
      MOD = b . size ( ) - c ;
      break ;
    }
    else {
      b . add ( i ) ;
      i = a . get ( i ) ;
    }
  }
  if ( b . size ( ) > k ) {
    System . out . println ( b . get ( k ) + 1 ) ;
  }
  else {
    k = ( k - c ) % MOD ;
    System . out . println ( b . get ( c + k ) + 1 ) ;
  }
}
