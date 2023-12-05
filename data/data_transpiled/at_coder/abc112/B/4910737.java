public static int N = Integer . parseInt ( input ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int cost = 1001 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( t > T ) {
    }
    else {
      if ( c < cost ) {
        cost = c ;
      }
    }
  }
  if ( cost != 1001 ) {
    System . out . println ( cost ) ;
  }
  else {
    System . out . println ( "TLE" ) ;
  }
  return cost ;
}
