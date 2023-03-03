static final int getUpperCaseWithTLE ( ) {
  int ans = Integer . MAX_VALUE ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( t <= T ) {
      ans = Math . min ( ans , c ) ;
    }
  }
  if ( ans == Integer . MAX_VALUE ) {
    System . out . println ( "TLE" ) ;
  }
  else {
    System . out . println ( ans ) ;
  }
  return ans ;
}
