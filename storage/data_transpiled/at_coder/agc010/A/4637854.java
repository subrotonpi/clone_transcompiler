public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = i % 2 ;
  }
  if ( A [ 1 ] % 2 != 0 ) {
    if ( A [ 0 ] > 0 ) {
      System . out . println ( "NO" ) ;
    }
    else {
      System . out . println ( "YES" ) ;
    }
  }
  else {
    System . out . println ( "YES" ) ;
  }
  return A [ 0 ] ;
}
