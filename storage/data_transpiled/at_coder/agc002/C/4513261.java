public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int l = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int MAX = 0 ;
  int MAX_i = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int now = a [ i ] + a [ i + 1 ] ;
    if ( now > MAX ) {
      MAX = now ;
      MAX_i = i ;
    }
  }
  if ( MAX >= l ) {
    System . out . println ( "Possible" ) ;
    for ( int i = 0 ;
    i < MAX_i ;
    i ++ ) {
      System . out . println ( i + 1 ) ;
    }
    for ( int i = 0 ;
    i < n - MAX_i - 1 ;
    i ++ ) {
      System . out . println ( n - i - 1 ) ;
    }
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
}
