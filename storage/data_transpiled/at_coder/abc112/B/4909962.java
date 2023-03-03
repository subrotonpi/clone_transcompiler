public static int N ( int T ) {
  int ans = 1001 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( t <= T ) {
      ans = Math . min ( ans , c ) ;
    }
  }
  if ( ans == 1001 ) {
    System . out . println ( "TLE" ) ;
  }
  else {
    System . out . println ( ans ) ;
  }
  return ans ;
}
