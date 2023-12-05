public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int T = Integer . parseInt ( input ) ;
  int cost = 10 * 3 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int c = Integer . parseInt ( input ) ;
    int t = Integer . parseInt ( input ) ;
    if ( t <= T ) {
      if ( c <= cost ) {
        cost = c ;
        ans = i + 1 ;
      }
    }
  }
  if ( ans == 0 ) {
    System . out . println ( "TLE" ) ;
  }
  else {
    System . out . println ( cost ) ;
  }
}
