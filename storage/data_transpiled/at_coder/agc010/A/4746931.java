public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) % 2 ;
  }
  if ( A [ 0 ] == 0 && A [ 1 ] == 1 ) {
    System . out . println ( "YES" ) ;
  }
  else if ( A [ 1 ] % 2 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return A [ 0 ] ;
}
