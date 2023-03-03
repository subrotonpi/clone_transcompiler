public static void print ( String input ) {
  int t = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int m = Integer . parseInt ( input ) ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b [ i ] = Integer . parseInt ( input ) ;
  }
  int p = 0 ;
  int e = 0 ;
  for ( int x : b ) {
    for ( int i = p ;
    i < n ;
    i ++ ) {
      if ( a [ i ] <= x && x <= a [ i ] + t ) {
        e ++ ;
        p = i + 1 ;
        break ;
      }
    }
    else {
      break ;
    }
  }
  if ( e == m ) {
    System . out . println ( "yes" ) ;
  }
  else {
    System . out . println ( "no" ) ;
  }
}
