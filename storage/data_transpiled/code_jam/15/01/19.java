static final int [ ] solve ( int [ ] [ ] s ) {
  int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    String smax , ss ;
    smax = System . console ( ) . readLine ( ) ;
    ss = System . console ( ) . readLine ( ) ;
    smax = Integer . parseInt ( smax ) ;
    s = new int [ smax + 1 ] ;
    for ( int j = 0 ;
    j < s . length ;
    j ++ ) s [ j ] = Integer . parseInt ( ss [ j ] ) ;
    int sum = 0 ;
    int max = 0 ;
    for ( int j = 0 ;
    j < s . length ;
    j ++ ) {
      if ( ( ( j > sum ) && ( j - sum > max ) ) ) max = j - sum ;
      sum += s [ j ] ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + max ) ;
  }
  return s ;
}
