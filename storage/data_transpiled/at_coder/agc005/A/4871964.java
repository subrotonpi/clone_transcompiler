public static int X ( ) {
  int ans = 0 ;
  int s = 0 ;
  for ( int i = 0 ;
  i < X . length ( ) ;
  i ++ ) {
    if ( X . charAt ( i ) == 'S' ) s ++ ;
    else if ( s > 0 ) {
      ans += 2 ;
      s -- ;
    }
  }
  System . out . println ( X . length ( ) - ans ) ;
  return ans ;
}
