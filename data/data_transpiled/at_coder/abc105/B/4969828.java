public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] dp = new int [ 101 ] ;
  dp [ 4 ] = 1 ;
  dp [ 7 ] = 1 ;
  for ( int i = 0 ;
  i < 101 ;
  i ++ ) {
    if ( dp [ i ] == 1 && i + 4 < 101 ) dp [ i + 4 ] = 1 ;
    if ( dp [ i ] == 1 && i + 7 < 101 ) dp [ i + 7 ] = 1 ;
  }
  if ( dp [ n ] == 0 ) System . out . println ( "No" ) ;
  else System . out . println ( "Yes" ) ;
}
