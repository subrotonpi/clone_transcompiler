public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int s = 0 ;
  int x = 1 ;
  while ( x * x < n ) {
    if ( n % x == 0 ) {
      s += x + n / x ;
    }
    x ++ ;
  }
  if ( x * x == n ) {
    s += x ;
  }
  if ( s < 2 * n ) {
    System . out . println ( "Deficient" ) ;
  }
  else if ( s == 2 * n ) {
    System . out . println ( "Perfect" ) ;
  }
  else {
    System . out . println ( "Abundant" ) ;
  }
}
