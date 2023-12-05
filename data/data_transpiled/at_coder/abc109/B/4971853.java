public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] w = new int [ n ] ;
  int ng = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    w [ i ] = input . nextInt ( ) ;
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( w [ i - 1 ] [ w [ i ] - 1 ] != w [ i ] [ 0 ] ) {
      ng ++ ;
      break ;
    }
    if ( w . indexOf ( w [ i - 1 ] ) > 1 ) {
      ng ++ ;
      break ;
    }
  }
  if ( ng > 0 ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
  }
}
